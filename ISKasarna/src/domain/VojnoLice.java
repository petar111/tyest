package domain;

import java.util.LinkedList;

/*
 * Class VojnoLice represents a man working in a military system. 
 * 
 * 
 */


public class VojnoLice {
	public VojnoLice(long id, String imeiPrezime, String sifraNalogaVojnogLica,String sifraPodslojnogNaloga, Cin vojniCin,  LinkedList<VojnoLice> nadredjenoVojnoLice,
			VojniObjekat vojniObjekatPodUpravom) {
		super();
		this.id = id;
		this.imeiPrezime = imeiPrezime;
		this.sifraNalogaVojnogLica = sifraNalogaVojnogLica;
		this.sifraPodslojnogNaloga = sifraPodslojnogNaloga;
		this.vojniCin = vojniCin;
		this.spisakCivilaUSrodstvu = new LinkedList<Civil>();
		this.spisakPodredjenihVojnihLica = new LinkedList<VojnoLice>();
		this.nadredjenoVojnoLice = nadredjenoVojnoLice;
		this.vojniObjekatPodUpravom = vojniObjekatPodUpravom;
	}
	
	public VojnoLice(long id, String imeiPrezime, String sifraNalogaVojnogLica, Cin vojniCin,  LinkedList<VojnoLice> nadredjenoVojnoLice,
			VojniObjekat vojniObjekatPodUpravom) {
		super();
		this.id = id;
		this.imeiPrezime = imeiPrezime;
		this.sifraNalogaVojnogLica = sifraNalogaVojnogLica;
		this.vojniCin = vojniCin;
		this.spisakCivilaUSrodstvu = new LinkedList<Civil>();
		this.spisakPodredjenihVojnihLica = new LinkedList<VojnoLice>();
		this.nadredjenoVojnoLice = nadredjenoVojnoLice;
		this.vojniObjekatPodUpravom = vojniObjekatPodUpravom;
	}
	
	
	private long id;
	private String imeiPrezime;
	private Cin vojniCin;
	private LinkedList<Civil> spisakCivilaUSrodstvu;
	private LinkedList<VojnoLice> spisakPodredjenihVojnihLica;
	private LinkedList<VojnoLice> nadredjenoVojnoLice;
	private VojniObjekat vojniObjekatPodUpravom;
	private String sifraNalogaVojnogLica;
	private String sifraPodslojnogNaloga;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImeiPrezime() {
		return imeiPrezime;
	}
	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}
	public Cin getVojniCin() {
		return vojniCin;
	}
	public void setVojniCin(Cin vojniCin) {
		this.vojniCin = vojniCin;
	}
	public LinkedList<Civil> getSpisakCivilaUSrodstvu() {
		return spisakCivilaUSrodstvu;
	}
	
	public LinkedList<VojnoLice> getSpisakPodredjenihVojnihLica() {
		return spisakPodredjenihVojnihLica;
	}
	
	public LinkedList<VojnoLice> getNadredjenoVojnoLice() {
		return nadredjenoVojnoLice;
	}
	public void setNadredjenoVojnoLice(LinkedList<VojnoLice> nadredjenoVojnoLice) {
		this.nadredjenoVojnoLice = nadredjenoVojnoLice;
	}
	public VojniObjekat getVojniObjekatPodUpravom() {
		return vojniObjekatPodUpravom;
	}
	public void setVojniObjekatPodUpravom(VojniObjekat vojniObjekatPodUpravom) {
		this.vojniObjekatPodUpravom = vojniObjekatPodUpravom;
	}
	/**
	 * @return the sifraNalogaVojnogLica
	 */
	public String getSifraNalogaVojnogLica() {
		return sifraNalogaVojnogLica;
	}
	/**
	 * @param sifraNalogaVojnogLica the sifraNalogaVojnogLica to set
	 */
	public void setSifraNalogaVojnogLica(String sifraNalogaVojnogLica) {
		this.sifraNalogaVojnogLica = sifraNalogaVojnogLica;
	}

	/**
	 * @return the sifraPodslojnogNaloga
	 */
	public String getSifraPodslojnogNaloga() {
		return sifraPodslojnogNaloga;
	}

	/**
	 * @param sifraPodslojnogNaloga the sifraPodslojnogNaloga to set
	 */
	public void setSifraPodslojnogNaloga(String sifraPodslojnogNaloga) {
		this.sifraPodslojnogNaloga = sifraPodslojnogNaloga;
	}
	
	
	
	
}
