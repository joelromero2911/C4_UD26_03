package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IMaquina_registradoraDAO;
import mainApp.dto.Maquina_registradora;

@Service
public class Maquina_registradoraServiceImpl implements IMaquina_registradoraService{

	@Autowired
	IMaquina_registradoraDAO iMaquina_registradoraDAO;
	
	@Override
	public List<Maquina_registradora> listarMaquinas_registradoras() {
		return iMaquina_registradoraDAO.findAll();
	}

	@Override
	public Maquina_registradora guardarMaquina_registradora(Maquina_registradora maquina_registradora) {
		return iMaquina_registradoraDAO.save(maquina_registradora);
	}

	@Override
	public Maquina_registradora maquina_registradoraXID(int codigo) {
		return iMaquina_registradoraDAO.findById(codigo).get();
	}

	@Override
	public Maquina_registradora actualizarMaquinas_registradoras(Maquina_registradora maquina_registradora) {
		return iMaquina_registradoraDAO.save(maquina_registradora);
	}

	@Override
	public void eliminarMaquinas_registradoras(int codigo) {
		iMaquina_registradoraDAO.deleteById(codigo);
	}

}
