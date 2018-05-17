package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.musclrMongo.repository.UserMongoRepository;
import com.restClient.RestClient;

@SpringBootApplication
@EnableMongoRepositories("com.musclrMongo.repository")
public class Application implements CommandLineRunner {
	
	@Autowired
	UserMongoRepository repository;


	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		

		
    	
        repository.findAll().forEach(userMongo -> { 
        	try {
        		System.out.println(userMongo);		
			} catch (Exception e) {
				e.printStackTrace();
			}
        	RestClient util = new RestClient();
        	util.addArticleDemo(userMongo);
        	
        });

    }

    
	
}
