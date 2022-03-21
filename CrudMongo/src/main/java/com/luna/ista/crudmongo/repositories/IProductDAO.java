package com.luna.ista.crudmongo.repositories;

import com.luna.ista.crudmongo.models.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
}
