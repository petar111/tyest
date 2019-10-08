package domain;

import java.util.LinkedList;

public class Mesto {
	private long idMesta;
	private String nazivMesta;
	private LinkedList<VojnoLice> spisakVojnihLicaIzMesta;
	public long getIdMesta() {
		return idMesta;
	}
	public void setIdMesta(long idMesta) {
		this.idMesta = idMesta;
	}
	public String getNazivMesta() {
		return nazivMesta;
	}
	public void setNazivMesta(String nazivMesta) {
		this.nazivMesta = nazivMesta;
	}
	public LinkedList<VojnoLice> getSpisakVojnihLicaIzMesta() {
		return spisakVojnihLicaIzMesta;
	}
	
}
