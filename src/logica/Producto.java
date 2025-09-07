
package logica;

import java.util.concurrent.atomic.AtomicInteger;

public class Producto {
    
    private String nombre,descripcion;
    private int codigo;
    private double precio;
    private AtomicInteger cantidadStock = new AtomicInteger(0);

    public Producto() {
    }

    //CONSTRUCTOR MANUAL
    public Producto(int codigo, String nombre, String descripcion, double precio, int cantidadInicial) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = new AtomicInteger(cantidadInicial);
    }

    //ID generado automaticamente
    public Producto(String nombre, String descripcion, double precio,int cantidadInicial) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = new AtomicInteger(cantidadInicial);
        this.codigo = GeneradorId.generarId();
    }
    
    

    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public double getPrecio() {return precio;}

    public void setPrecio(double precio) {this.precio = precio;}

    public AtomicInteger getCantidadStock() {return cantidadStock;}

    public void setCantidadStock(AtomicInteger cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
    
}
