package com.example.APIRESTPaolaCriollo.service;

import com.example.APIRESTPaolaCriollo.model.Producto;
import com.example.APIRESTPaolaCriollo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Long> implements ProductoService {

    @Autowired
    ProductoRepository productorepo;

    @Override
    public Producto findById(Long aLong) {
        return null;
    }

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return productorepo;
    }

}
