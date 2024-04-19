package com.edison.springboot.app.springbootcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.edison.springboot.app.springbootcrud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

    boolean existsBySku(String sku);

}
