package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Venta;
import mainApp.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/ventas")
	public List<Venta> listarVentas(){
		return ventaServiceImpl.listarVentas();
	}
	
	@PostMapping("/ventas")
	public Venta guardarVenta(@RequestBody Venta venta) {
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	@GetMapping("/ventas/{id}")
	public Venta ventaXID(@PathVariable(name="id") int id) {
		
		Venta venta_xid= new Venta();
		venta_xid=ventaServiceImpl.ventaXID(id);
		System.out.println("Venta XID: "+venta_xid);
		return venta_xid;
	}

	@PutMapping("/ventas/{id}")
	public Venta actualizarVentas(@PathVariable(name="id")int id,@RequestBody Venta venta) {
		
		Venta venta_seleccionado= new Venta();
		Venta venta_actualizado= new Venta();
		
		venta_seleccionado= ventaServiceImpl.ventaXID(id);
		venta_seleccionado.setCajero(venta.getCajero());
		venta_seleccionado.setMaquina(venta.getMaquina());
		venta_seleccionado.setProducto(venta.getProducto());
		venta_actualizado = ventaServiceImpl.actualizarVentas(venta_seleccionado);
		
		System.out.println("La Venta actualizada es: "+ venta_actualizado);
		
		return venta_actualizado;
	}
	
	@DeleteMapping("/ventas/{id}")
	public void eliminarVentas(@PathVariable(name="id")int id) {
		ventaServiceImpl.eliminarVentas(id);
	}
}
