package dev.sv.productos_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sv.productos_api.model.Producto;
import dev.sv.productos_api.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	private final ProductoService service;
	
	public ProductoController(ProductoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Producto> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Producto getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@PostMapping
	public Producto createProducto(@RequestBody Producto producto) {
		return service.createProducto(producto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@GetMapping("/sinstock")
	public List<Producto> getSinStock() {
		return service.getSinStock();
	}
}
