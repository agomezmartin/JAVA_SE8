package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.ProductosService;

class TestProductosService {
	ProductosService service;

	@BeforeEach
	void setUp() throws Exception {
		service=new ProductosService();
	}

	@Test
	void testTotalProductos() {
		assertEquals(45, service.totalProductos("alimentación"));
		assertEquals(0, service.totalProductos("natación"));
	}

	@Test
	void testPrecioMasCaro() {
		assertEquals(150.0,service.precioMasCaro(),0);
	}

	@Test
	void testExisteProducto() {
		assertTrue(service.existeProducto("cerveza"));
		assertFalse(service.existeProducto("zumo de naranja"));
	}

	@Test
	void testProductoMasCaro() {
		assertEquals("bicicleta", service.productoMasCaro());
	}

	@Test
	void testProductoNombres() {
		assertNotNull(service.productoNombres("detergente"));
		assertNull(service.productoNombres("cuchillo"));
	}

	@Test
	void testProductosSeccion() {
		assertEquals(2, service.productosSeccion("hogar").size());
		assertEquals(0, service.productosSeccion("perfumería").size());
	}

	@Test
	void testNombresStock() {
		assertEquals(3, service.nombresStock(10).size());
		assertEquals(0, service.nombresStock(100).size());
	}

}
