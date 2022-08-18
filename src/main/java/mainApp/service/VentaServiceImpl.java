package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IVentaDAO;
import mainApp.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	IVentaDAO iVentaDAO;
	
	@Override
	public List<Venta> listarVentas() {
		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta ventaXID(int id) {
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVentas(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVentas(int id) {
		iVentaDAO.deleteById(id);
	}

}
