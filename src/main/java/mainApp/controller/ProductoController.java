package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Producto;
import mainApp.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		return productoServiceImpl.listarProductos();
	}
	
	@PostMapping("/productos")
	public Producto guardarProducto(@RequestBody Producto producto) {
		return productoServiceImpl.guardarProducto(producto);
	}
	
	@GetMapping("/productos/{codigo}")
	public Producto productoXID(@PathVariable(name="codigo") int codigo) {
		
		Producto producto_xid= new Producto();
		producto_xid=productoServiceImpl.productoXID(codigo);
		System.out.println("Producto XID: "+producto_xid);
		return producto_xid;
	}

	@PutMapping("/productos/{codigo}")
	public Producto actualizarProductos(@PathVariable(name="codigo")int codigo,@RequestBody Producto producto) {
		
		Producto producto_seleccionado= new Producto();
		Producto producto_actualizado= new Producto();
		
		producto_seleccionado= productoServiceImpl.productoXID(codigo);
		producto_seleccionado.setNombre(producto.getNombre());
		producto_seleccionado.setPrecio(producto.getPrecio());
		producto_actualizado = productoServiceImpl.actualizarProductos(producto_seleccionado);
		
		System.out.println("El Producto actualizado es: "+ producto_actualizado);
		
		return producto_actualizado;
	}
	
	@DeleteMapping("/productos/{codigo}")
	public void eliminarProductos(@PathVariable(name="codigo")int codigo) {
		productoServiceImpl.eliminarProductos(codigo);
	}
}
