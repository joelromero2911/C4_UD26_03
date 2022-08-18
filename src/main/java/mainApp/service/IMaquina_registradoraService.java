package mainApp.service;

import java.util.List;

import mainApp.dto.Maquina_registradora;

public interface IMaquina_registradoraService {

	//Metodos del CRUD
	public List<Maquina_registradora> listarMaquinas_registradoras(); // Listar All 
	
	public Maquina_registradora guardarMaquina_registradora(Maquina_registradora maquina_registradora);	// CREATE
	
	public Maquina_registradora maquina_registradoraXID(int codigo); // READ
	
	public Maquina_registradora actualizarMaquinas_registradoras(Maquina_registradora maquina_registradora); // UPDATE
	
	public void eliminarMaquinas_registradoras(int codigo); // DELETE
}
