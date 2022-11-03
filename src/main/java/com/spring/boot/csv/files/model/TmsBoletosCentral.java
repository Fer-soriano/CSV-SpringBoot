package com.spring.boot.csv.files.model;
import javax.persistence.*;

@Entity
@Table(name="TMS_BOLETOS_BOLETERA_CTRL_TBL")
public class TmsBoletosCentral {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "ADICIONAL2")
    private String adicional2;

    @Column(name = "COBRADO")
    private String cobrado;



    public TmsBoletosCentral() {
    }

    public TmsBoletosCentral(String adicional2, String cobrado) {
        this.adicional2 = adicional2;
        this.cobrado = cobrado;
    }



    public String getAdicional2() {
        return adicional2;
    }

    public void setAdicional2(String adicional2) {
        this.adicional2 = adicional2;
    }

    public String getCobrado() {
        return cobrado;
    }

    public void setCobrado(String cobrado) {
        this.cobrado = cobrado;
    }
}
