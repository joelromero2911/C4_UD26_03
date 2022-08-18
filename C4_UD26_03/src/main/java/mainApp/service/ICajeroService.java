package mainApp.service;

import java.util.List;

import mainApp.dto.Cajero;

public interface ICajeroService {

	//Metodos del CRUD
	public List<Cajero> listarCajeros(); // Listar All 
	
	public Cajero guardarCajero(Cajero cajero);	// CREATE
	
	public Cajero cajeroXID(int codigo); // READ
	
	public Cajero actualizarCajeros(Cajero cajero); // UPDATE
	
	public void eliminarCajeros(int codigo); // DELETE
}
