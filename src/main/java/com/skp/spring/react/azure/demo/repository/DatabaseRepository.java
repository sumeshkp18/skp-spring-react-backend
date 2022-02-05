package com.skp.spring.react.azure.demo.repository;

import com.skp.spring.react.azure.demo.repository.model.DatabaseDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DatabaseRepository<Document extends DatabaseDocument> extends MongoRepository<Document, String> {
}
