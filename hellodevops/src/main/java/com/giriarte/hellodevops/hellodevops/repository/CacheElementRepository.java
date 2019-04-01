package com.giriarte.hellodevops.hellodevops.repository;

import com.giriarte.hellodevops.hellodevops.model.CacheElement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CacheElementRepository extends CrudRepository<CacheElement, String> {



}
