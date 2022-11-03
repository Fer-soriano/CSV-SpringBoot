package com.spring.boot.csv.files.constants;

public class FilesConstants {
	private static final String VERSION_API = "1.0";

	public static final String CONTEXT_API = "api/" + VERSION_API;
	
	public static final String ADICIONAL = CONTEXT_API + "/adicional";
	
	// Consulta los adicionales dos
	public static final String GET_ADICIONAL = "/getAllAdicional";
	
	// Actualiza cobros
	public static final String UPDATE_COBRO = "/actualizarCobros";
}
