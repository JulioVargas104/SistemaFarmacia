/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author s k y l e e
 */
public class Producto {
    public ArrayList<Producto> pro;
    public String codigo;
    public String descripcion;
    public int cantidad;
    public double precio;
    public String proveedor;
    
    public Producto(){
        pro=new ArrayList<Producto>();
    }
    public Producto(String codigo, String descripcion, int cantidad, double precio, String proveedor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public int GetTamaño(){
        return pro.size();
    }
    
    public String LLamarDescripcionProducto(String nombreCBX){
        
        setDescripcion(nombreCBX);
        
        return getDescripcion();
    }
    
   
}
