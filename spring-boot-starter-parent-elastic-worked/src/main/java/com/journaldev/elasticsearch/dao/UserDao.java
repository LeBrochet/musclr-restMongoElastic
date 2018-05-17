package com.journaldev.elasticsearch.dao;

import com.journaldev.elasticsearch.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class UserDao {

  private final String INDEX = "userdata";
  private final String TYPE = "users";  
  private RestHighLevelClient restHighLevelClient;
  private ObjectMapper objectMapper;

  public UserDao( ObjectMapper objectMapper, RestHighLevelClient restHighLevelClient) {
    this.objectMapper = objectMapper;
    this.restHighLevelClient = restHighLevelClient;
  }
  
  public User insertBook(User book){
	  book.setId(UUID.randomUUID().toString());
	  Map dataMap = objectMapper.convertValue(book, Map.class);
	  IndexRequest indexRequest = new IndexRequest(INDEX, TYPE, book.getId())
	                .source(dataMap);
	  try {
	    IndexResponse response = restHighLevelClient.index(indexRequest);
	  } catch(ElasticsearchException e) {
	    e.getDetailedMessage();
	  } catch (java.io.IOException ex){
	    ex.getLocalizedMessage();
	  }
	  return book;
	}
  
  public Map<String, Object> getBookById(String id){
	  GetRequest getRequest = new GetRequest(INDEX, TYPE, id);
	  GetResponse getResponse = null;
	  try {
	    getResponse = restHighLevelClient.get(getRequest);
	  } catch (java.io.IOException e){
	    e.getLocalizedMessage();
	  }
	  Map<String, Object> sourceAsMap = getResponse.getSourceAsMap();
	  return sourceAsMap;
	}
  
}
