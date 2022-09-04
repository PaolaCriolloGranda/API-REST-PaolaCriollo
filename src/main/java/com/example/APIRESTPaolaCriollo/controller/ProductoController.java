package com.example.APIRESTPaolaCriollo.controller;

import com.example.APIRESTPaolaCriollo.model.Producto;
import com.example.APIRESTPaolaCriollo.service.ProductoService;
import com.example.APIRESTPaolaCriollo.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    @Autowired
    ProductoServiceImpl productoImpl;


    @PostMapping("/save")
    public ResponseEntity<Producto> save(@RequestBody Producto producto) {
        return new ResponseEntity<>(productoImpl.save(producto), HttpStatus.CREATED);
    }

    
   
    @GetMapping("/read")
    public ResponseEntity<List<Producto>> read() {
        return new ResponseEntity<>(productoImpl.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productoImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/search/{id}")
    public ResponseEntity<Producto> search(@PathVariable Long id) {
        return new ResponseEntity<>(productoImpl.findById(id), HttpStatus.OK);
    }




    @PutMapping("/update/{id}")
    public Producto update(@PathVariable Long id, @RequestBody Producto p) {
        Producto producto = productoImpl.FindByID(id);
        producto.setNombre(p.getNombre());
        producto.setDescripcion(p.getDescripcion());
        producto.setPrecio(p.getPrecio());
        producto.setProveedor(p.getProveedor());
        return productoImpl.save(producto);

    }


/*{
  "id": 2,
  "nombre": "Shampoo Dove",
  "proveedor": "Guayaquil",
  "precio": 7,
  "descripcion": "shampoo de oleo"
}*/
}

