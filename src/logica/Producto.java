
package logica;

import java.util.concurrent.atomic.AtomicInteger;

public class Producto {
    
    private String codigo,nombre,descripcion;
    private double precio;
    private AtomicInteger cantidadStock;

    public Producto(String codigo, String nombre, String descripcion, double precio, int cantidadInicial) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = new AtomicInteger(cantidadInicial);
    }

    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public double getPrecio() {return precio;}

    public void setPrecio(double precio) {this.precio = precio;}

    public AtomicInteger getCantidadStock() {return cantidadStock;}

  
    //METODO PARA ACTUALIZAR PRODUCTO
    public void cambiarPrecio(){
    
    }
    
    //METODO PARA MOSTRAR DETALLES DEL PRODUCTO
    public void mostrarDetalles(){
    
    }
    
    
}
