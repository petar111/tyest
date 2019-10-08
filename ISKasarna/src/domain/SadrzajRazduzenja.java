package domain;

import java.util.Date;

public class SadrzajRazduzenja {
	private Zaduzenje razduzenoZaduzenje;
	private long idRazduzenja;
	private Date datumRazduzenja;
	private String opisRazduzenja;
	public Zaduzenje getRazduzenoZaduzenje() {
		return razduzenoZaduzenje;
	}
	public void setRazduzenoZaduzenje(Zaduzenje razduzenoZaduzenje) {
		this.razduzenoZaduzenje = razduzenoZaduzenje;
	}
	public long getIdRazduzenja() {
		return idRazduzenja;
	}
	public void setIdRazduzenja(long idRazduzenja) {
		this.idRazduzenja = idRazduzenja;
	}
	public Date getDatumRazduzenja() {
		return datumRazduzenja;
	}
	public void setDatumRazduzenja(Date datumRazduzenja) {
		this.datumRazduzenja = datumRazduzenja;
	}
	public String getOpisRazduzenja() {
		return opisRazduzenja;
	}
	public void setOpisRazduzenja(String opisRazduzenja) {
		this.opisRazduzenja = opisRazduzenja;
	}
}
