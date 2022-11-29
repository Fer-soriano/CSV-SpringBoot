package com.spring.boot.csv.files.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.boot.csv.files.model.TmsBoletosCentral;

@Repository
public interface TmsFilesRepository extends JpaRepository<TmsBoletosCentral, String> {
	
	@Query(value="SELECT *\r\n"
			+ "	FROM public.\"TMS_BOLETOS_BOLETERA_CTRL_TBL\"", nativeQuery=true)
	public List<TmsBoletosCentral> findAllAdicional();
	
	@Modifying
	@Transactional
	@Query(value="UPDATE PCENTRAL.\"TMS_BOLETOS_BOLETERA_CTRL_TBL\"\r\n"
			+ "	SET \"COBRADO\"=?1\r\n"
			+ "	WHERE \"ADICIONAL2\"=?2", nativeQuery=true)
	public Integer actualizarCobros(String COBRADO, String ADICIONAL2);

	/*@Modifying
    @Transactional
    @Query("UPDATE TmsBoletosCentral T SET T.COBRADO = 'N' WHERE T.ADICIONAL2 IN :adicional2List")
    public Integer updateCobrado(List<String> adicional2List);*/	
}
