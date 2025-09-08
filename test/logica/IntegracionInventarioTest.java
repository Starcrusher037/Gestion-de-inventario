
package logica;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegracionInventarioTest {
    
    @Test
    public void testAgregarProductosInventario(){
        Inventario inventario = new Inventario();
        Producto producto = new Producto();
        producto.setCodigo(18);
        producto.setNombre("empanada");
        producto.setDescripcion("empanada con carne picada y merquen cocida en horno de barro");
        producto.setPrecio(2500);
        producto.getCantidadStock().set(200);
        
        inventario.getProductos().put(producto.getCodigo(), producto);
        
        assert(inventario.getProductos().containsKey(18));
        assertEquals("empanada", inventario.getProductos().get(18).getNombre());
        assertEquals(200, inventario.getProductos().get(18).getCantidadStock().get());
    }
    
}
