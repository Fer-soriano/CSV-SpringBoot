package com.spring.boot.csv.files.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.csv.files.repository.TmsFilesRepository;

@Service	
public class TsmActualizarCobroServiceImpl implements TsmActualizarCobroService{

	@Autowired
	private TmsFilesRepository tmsFilesRepository;
	
	@Override
	public Integer actualizarCobros(String COBRADO, String ADICIONAL2) {
		return tmsFilesRepository.actualizarCobros(COBRADO, ADICIONAL2);
	}
	
	
}
