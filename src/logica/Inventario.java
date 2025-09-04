
package logica;

import java.util.HashMap;
import java.util.Scanner;


public class Inventario {
    
    Scanner sc = new Scanner (System.in);
    private HashMap <String , Producto> productos;

    public Inventario() {
        productos = new HashMap<>();
    }
    
    //PODEMOS JUGAR CON EL METODO PARA DETERMINAR QUE ES LO QUE VA A COMPARAR
    public void existente(Producto p){  
        if (productos.containsValue(p)) System.out.println("Ya existe un producto con ese nombre.");
        else System.out.println("No existe un producto con ese nombre");    
    }
    
    //METODO PARA AGREGAR PRODUCTOS
    public void agregarProductos(){
        Producto p = new Producto();
        p.crearProducto(sc);
        if (p != null) productos.put(p.getNombre(), p);  //CREAR MEODO PARA DETERMINAR ID PRODUCTO
    }
    
    //METODO PARA BUSCAR PRODUCTOS POR CODIGO,  POR NOMBRE Y POR DESCRIPCION
    public void buscarPorCodigo(){
    
    }
    
    //METODO PARA GENERAR INFORMES DEL INVENTARIO
    public void generarInforme(){
    
    }
    
    //METODO PARA MOSTRAR LISTADO DE LOS PRODUCTOS EXISTENTES           ______CORREGIR ESPACIOS______
    public void mostrarListadoProductos(){
        System.out.printf("%30s %20s","NOMBRE","CANTIDAD");
        for (Producto p : productos.values()){
            System.out.printf("%30s %3s",p.getNombre(),p.getCantidadStock()+"\n");
        }
    }
    
    //ACTUALIZAR INFORMACION DE PRODUCTO EXISTENTE
    public void actualizarProducto(){
    
    }
    
    //ELIMINAR PRODUCTO DEL INVENTARIO
    public void eliminarProducto(){
    
    }
    
}


// GESTIONAR LOS METODOS CON UN COMMAN Y CONTROLADOR?????