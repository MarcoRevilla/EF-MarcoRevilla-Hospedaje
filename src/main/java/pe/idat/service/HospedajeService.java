package pe.idat.service;

import java.util.List;

import pe.idat.model.Hospedaje;

public interface HospedajeService {
	
	List<Hospedaje> listar();
	void guardar(Hospedaje hospedaje);


}
