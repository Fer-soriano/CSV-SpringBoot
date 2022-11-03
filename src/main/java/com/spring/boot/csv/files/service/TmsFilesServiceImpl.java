package com.spring.boot.csv.files.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.csv.files.model.TmsBoletosCentral;
import com.spring.boot.csv.files.repository.TmsFilesRepository;

@Service	
public class TmsFilesServiceImpl implements TmsFilesService{

	@Autowired
	private TmsFilesRepository tmsFilesRepository;
	@Override
	public List<TmsBoletosCentral> findAllAdicional() {
		List<TmsBoletosCentral> allAdicionalTwo = new ArrayList<TmsBoletosCentral>();
		allAdicionalTwo = null;
		try {
			allAdicionalTwo = tmsFilesRepository.findAllAdicional();
		}catch(Exception e){
			
		}
		return allAdicionalTwo;
	}

}
