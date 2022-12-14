package pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.model.Hospedaje;
import pe.idat.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {
	
	@Autowired
	private HospedajeRepository repository;
	
	@Override
	public List<Hospedaje> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void guardar(Hospedaje hospedaje) {
		// TODO Auto-generated method stub
		repository.save(hospedaje);
	}

}
