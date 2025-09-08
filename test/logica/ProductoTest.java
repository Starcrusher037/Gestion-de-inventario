package logica;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductoTest {
    private Producto producto;

    @Before
    public void creacion() {
        producto = new Producto(101, "CocaCola", "Bebida", 1000, 10);
    }

    @Test
    public void testGetters() {
        assertEquals(101, producto.getCodigo());
        assertEquals("CocaCola", producto.getNombre());
        assertEquals("Bebida", producto.getDescripcion());
        assertEquals(1000, producto.getPrecio(), 0.001);
        assertEquals(10, producto.getCantidadStock().get());
    }

    @Test
    public void testSetPrecio() {
        producto.setPrecio(1200);
        assertEquals(1200, producto.getPrecio(), 0.001);
    }

    @Test
    public void testSetDescripcion() {
        producto.setDescripcion("Refresco");
        assertEquals("Refresco", producto.getDescripcion());
    }

    @Test
    public void testActualizarStock() {
        AtomicInteger nuevoStock = new AtomicInteger(25);
        producto.setCantidadStock(nuevoStock);
        assertEquals(25, producto.getCantidadStock().get());
    }

    @Test
    public void testIncrementarStock() {
        producto.getCantidadStock().addAndGet(5);
        assertEquals(15, producto.getCantidadStock().get());
    }

    @Test
    public void testDecrementarStock() {
        producto.getCantidadStock().addAndGet(-3);
        assertEquals(7, producto.getCantidadStock().get());
    }
}