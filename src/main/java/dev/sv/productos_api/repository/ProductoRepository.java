package dev.sv.productos_api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.sv.productos_api.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	
	@Query(value = "SELECT * FROM productos WHERE stock = 0", nativeQuery = true)
	public List<Producto> sinStock();
}
