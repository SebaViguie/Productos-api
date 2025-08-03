package dev.sv.productos_api.service;

import java.util.List;
import org.springframework.stereotype.Service;
import dev.sv.productos_api.model.Producto;
import dev.sv.productos_api.repository.ProductoRepository;

@Service
public class ProductoService {

	private final ProductoRepository repository;
	
	public ProductoService(ProductoRepository repository) {
		this.repository = repository;
	}
	
	public List<Producto> getAll() {
		return repository.findAll();
	}
	
	public Producto getById(int id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
	}
	
	public Producto createProducto(Producto producto) {
		return repository.save(producto);
	}
	
	public void deleteById(int id) {
		repository.deleteById(id);
	}
	
	public List<Producto> getSinStock() {
		return repository.sinStock();
	}
}
