package com.crud.api.CRUDApi;

import com.crud.api.CRUDApi.repository.TodoRepository;
import com.crud.api.CRUDApi.service.TodoServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApiApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	TodoServiceImp todoServiceImp;
	TodoRepository todoRepository;

	public CrudApiApplication(TodoServiceImp todoServiceImp, TodoRepository todoRepository) {
		this.todoServiceImp = todoServiceImp;
		this.todoRepository = todoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudApiApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info("Checking  CommandLineRunner {} ");
		System.out.println("TODO application.....learning CommandLineRunner learnt from udemy springboot course\\\\\\\\");

	}
}
