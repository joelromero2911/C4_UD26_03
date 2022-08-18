package mainApp.service;

import java.util.List;

import mainApp.dto.Producto;

public interface IProductoService {

	//Metodos del CRUD
	public List<Producto> listarProductos(); // Listar All 
	
	public Producto guardarProducto(Producto producto);	// CREATE
	
	public Producto productoXID(int codigo); // READ
	
	public Producto actualizarProductos(Producto producto); // UPDATE
	
	public void eliminarProductos(int codigo); // DELETE
}
