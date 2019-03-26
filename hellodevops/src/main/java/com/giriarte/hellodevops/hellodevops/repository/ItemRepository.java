package com.giriarte.hellodevops.hellodevops.repository;

import com.giriarte.hellodevops.hellodevops.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
}
