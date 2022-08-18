package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Maquina_registradora;
import mainApp.service.Maquina_registradoraServiceImpl;

@RestController
@RequestMapping("/api")
public class Maquina_registradoraController {

	@Autowired
	Maquina_registradoraServiceImpl maquina_registradoraServiceImpl;
	
	@GetMapping("/maquinas_registradoras")
	public List<Maquina_registradora> listarMaquinas_registradoras(){
		return maquina_registradoraServiceImpl.listarMaquinas_registradoras();
	}
	
	@PostMapping("/maquinas_registradoras")
	public Maquina_registradora guardarMaquina_registradora(@RequestBody Maquina_registradora maquina_registradora) {
		return maquina_registradoraServiceImpl.guardarMaquina_registradora(maquina_registradora);
	}
	
	@GetMapping("/maquinas_registradoras/{codigo}")
	public Maquina_registradora maquina_registradoraXID(@PathVariable(name="codigo") int codigo) {
		
		Maquina_registradora maquina_registradora_xid= new Maquina_registradora();
		maquina_registradora_xid=maquina_registradoraServiceImpl.maquina_registradoraXID(codigo);
		System.out.println("Maquina_registradora XID: "+maquina_registradora_xid);
		return maquina_registradora_xid;
	}

	@PutMapping("/maquinas_registradoras/{codigo}")
	public Maquina_registradora actualizarMaquinas_registradoras(@PathVariable(name="codigo")int codigo,@RequestBody Maquina_registradora maquina_registradora) {
		
		Maquina_registradora maquina_registradora_seleccionado= new Maquina_registradora();
		Maquina_registradora maquina_registradora_actualizado= new Maquina_registradora();
		
		maquina_registradora_seleccionado= maquina_registradoraServiceImpl.maquina_registradoraXID(codigo);
		maquina_registradora_seleccionado.setPiso(maquina_registradora.getPiso());
		maquina_registradora_actualizado = maquina_registradoraServiceImpl.actualizarMaquinas_registradoras(maquina_registradora_seleccionado);
		
		System.out.println("La Maquina_registradora actualizada es: "+ maquina_registradora_actualizado);
		
		return maquina_registradora_actualizado;
	}
	
	@DeleteMapping("/maquinas_registradoras/{codigo}")
	public void eliminarMaquinas_registradoras(@PathVariable(name="codigo")int codigo) {
		maquina_registradoraServiceImpl.eliminarMaquinas_registradoras(codigo);
	}
}
