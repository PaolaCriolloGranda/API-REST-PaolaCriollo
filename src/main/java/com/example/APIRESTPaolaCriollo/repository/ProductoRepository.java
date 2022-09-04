package com.example.APIRESTPaolaCriollo.repository;

import com.example.APIRESTPaolaCriollo.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, Long> {
}
