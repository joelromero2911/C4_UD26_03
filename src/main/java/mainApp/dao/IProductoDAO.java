package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
