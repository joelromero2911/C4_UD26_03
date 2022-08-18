package mainApp.service;

import java.util.List;

import mainApp.dto.Venta;

public interface IVentaService {

	//Metodos del CRUD
	public List<Venta> listarVentas(); // Listar All 
	
	public Venta guardarVenta(Venta venta);	// CREATE
	
	public Venta ventaXID(int id); // READ
	
	public Venta actualizarVentas(Venta venta); // UPDATE
	
	public void eliminarVentas(int id); // DELETE
}
