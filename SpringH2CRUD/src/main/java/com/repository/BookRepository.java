package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
