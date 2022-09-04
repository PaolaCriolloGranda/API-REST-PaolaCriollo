package com.example.APIRESTPaolaCriollo.model;

public class Producto {
    private Long id;
    private String nombre;
    private String proveedor;
    private double precio;
    private String descripcion;

    public Producto() {
    }

    public Producto(Long id, String nombre, String proveedor, double precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}