package domain;

/*
 * Class Srodstvo represents an instance of relation between civilian and military person. 
 * Attribute nazivSrodstva represents type of relation in direction military civilian -> military person, what is
 * a civilian to a military person. For example civilian is a mother to military person. 
 * 
 * 
 */


public class Srodstvo {
	private long idSrodstva;
	private String nazivSrodstva;
	private VojnoLice vojnoLiceUSrodstvu;
	private Civil civilUSrodstvu;
	public long getIdSrodstva() {
		return idSrodstva;
	}
	public void setIdSrodstva(long idSrodstva) {
		this.idSrodstva = idSrodstva;
	}
	public String getNazivSrodstva() {
		return nazivSrodstva;
	}
	public void setNazivSrodstva(String nazivSrodstva) {
		this.nazivSrodstva = nazivSrodstva;
	}
	public VojnoLice getVojnoLiceUSrodstvu() {
		return vojnoLiceUSrodstvu;
	}
	public void setVojnoLiceUSrodstvu(VojnoLice vojnoLiceUSrodstvu) {
		this.vojnoLiceUSrodstvu = vojnoLiceUSrodstvu;
	}
	public Civil getCivilUSrodstvu() {
		return civilUSrodstvu;
	}
	public void setCivilUSrodstvu(Civil civilUSrodstvu) {
		this.civilUSrodstvu = civilUSrodstvu;
	}
}
