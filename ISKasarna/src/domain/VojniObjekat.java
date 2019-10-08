package domain;

import java.util.LinkedList;

/*
 * Class VojniObjekat represents a military object. It can be used for several purposes.
 * 
 * 
 * 
 * 
 */

public class VojniObjekat {
	protected long idVojnogObjekta;
	protected String nazivVojnogObjekta;
	protected LinkedList<VojnoLice> spisakVojnihLicaSmestenihUVojnomObjektu;
	public long getIdVojnogObjekta() {
		return idVojnogObjekta;
	}
	public void setIdVojnogObjekta(long idVojnogObjekta) {
		this.idVojnogObjekta = idVojnogObjekta;
	}
	public String getNazivVojnogObjekta() {
		return nazivVojnogObjekta;
	}
	public void setNazivVojnogObjekta(String nazivVojnogObjekta) {
		this.nazivVojnogObjekta = nazivVojnogObjekta;
	}
	public LinkedList<VojnoLice> getSpisakVojnihLicaSmestenihUVojnomObjektu() {
		return spisakVojnihLicaSmestenihUVojnomObjektu;
	}

	
	
}
