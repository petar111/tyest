package domain;

/*
 * Class Civil represents a civilian that is related to military man working in a military system. Contains basic info
 * as it is other services job to give a more info about a civilian if needed.
 * 
 * 
 */

public class Civil {
	private String imeiPrezimeCivila;
	private String JMBGCivila;
	public String getImeiPrezimeCivila() {
		return imeiPrezimeCivila;
	}
	public void setImeiPrezimeCivila(String imeiPrezimeCivila) {
		this.imeiPrezimeCivila = imeiPrezimeCivila;
	}
	public String getJMBGCivila() {
		return JMBGCivila;
	}
	public void setJMBGCivila(String jMBGCivila) {
		JMBGCivila = jMBGCivila;
	}
}
