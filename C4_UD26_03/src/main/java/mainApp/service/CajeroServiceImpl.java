package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ICajeroDAO;
import mainApp.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService{

	@Autowired
	ICajeroDAO iCajeroDAO;
	
	@Override
	public List<Cajero> listarCajeros() {
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero cajeroXID(int codigo) {
		return iCajeroDAO.findById(codigo).get();
	}

	@Override
	public Cajero actualizarCajeros(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajeros(int codigo) {
		iCajeroDAO.deleteById(codigo);
	}

}
