package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IProductoDAO;
import mainApp.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	IProductoDAO iProductoDAO;

	@Override
	public List<Producto> listarProductos() {
		return iProductoDAO.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		return iProductoDAO.save(producto);
	}

	@Override
	public Producto productoXID(int codigo) {
		return iProductoDAO.findById(codigo).get();
	}

	@Override
	public Producto actualizarProductos(Producto producto) {
		return iProductoDAO.save(producto);
	}

	@Override
	public void eliminarProductos(int codigo) {
		iProductoDAO.deleteById(codigo);
	}
}
