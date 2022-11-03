package com.spring.boot.csv.files.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.csv.files.constants.FilesConstants;
import com.spring.boot.csv.files.model.TmsBoletosCentral;
import com.spring.boot.csv.files.service.TmsFilesService;
import com.spring.boot.csv.files.service.TsmActualizarCobroService;


@RestController
@CrossOrigin()
@RequestMapping(path = FilesConstants.ADICIONAL)
public class TmsFilesController {

	@Autowired
	private TmsFilesService tmsFilesService;

	@Autowired
	private TsmActualizarCobroService tsmActualizarCobroService;
	
	/*@Autowired
	private serviceTms service;*/
	
	
	@GetMapping(path=FilesConstants.GET_ADICIONAL)
	@ResponseBody
	public List<TmsBoletosCentral> allAdicionalTwo(){
		List<TmsBoletosCentral> adicionalTwoList = tmsFilesService.findAllAdicional();
		return adicionalTwoList;
	}
	
	@PutMapping("actualizarCobros/")
	public Integer updateCobro(@RequestParam(defaultValue = "" ) String COBRADO,@RequestParam(defaultValue = "" ) String ADICIONAL2) {
		return tsmActualizarCobroService.actualizarCobros(COBRADO, ADICIONAL2);
	}
	
	/*@PutMapping("updateLista")
    public String actualizarlista( @RequestParam("adicional2List") List<String> adicional2List ) {
        return tmsActualizarCobroService.updateCobrado(adicional2List) + "  Datos actualizados";
    }*/
	
}
