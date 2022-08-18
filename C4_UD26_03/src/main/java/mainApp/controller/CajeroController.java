package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Cajero;
import mainApp.service.CajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros(){
		return cajeroServiceImpl.listarCajeros();
	}
	
	@PostMapping("/cajeros")
	public Cajero guardarCajero(@RequestBody Cajero cajero) {
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	@GetMapping("/cajeros/{codigo}")
	public Cajero cajeroXID(@PathVariable(name="codigo") int codigo) {
		
		Cajero cajero_xid= new Cajero();
		cajero_xid=cajeroServiceImpl.cajeroXID(codigo);
		System.out.println("Cajero XID: "+cajero_xid);
		return cajero_xid;
	}

	@PutMapping("/cajeros/{codigo}")
	public Cajero actualizarCajeros(@PathVariable(name="codigo")int codigo,@RequestBody Cajero cajero) {
		
		Cajero cajero_seleccionado= new Cajero();
		Cajero cajero_actualizado= new Cajero();
		
		cajero_seleccionado= cajeroServiceImpl.cajeroXID(codigo);
		cajero_seleccionado.setNom_apels(cajero.getNom_apels());
		cajero_actualizado = cajeroServiceImpl.actualizarCajeros(cajero_seleccionado);
		
		System.out.println("El Cajero actualizado es: "+ cajero_actualizado);
		
		return cajero_actualizado;
	}
	
	@DeleteMapping("/cajeros/{codigo}")
	public void eliminarCajeros(@PathVariable(name="codigo")int codigo) {
		cajeroServiceImpl.eliminarCajeros(codigo);
	}
}
