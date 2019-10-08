package domain;

import java.util.Date;

public class Zaduzenje {
	
	
	private Resurs zaduzeniResurs;
	private VojnoLice vojnoLiceZaduzenja;
	private Date datumZaduzenja;
	private Date ocekivaniDatumRazduzenja;
	public Resurs getZaduzeniResurs() {
		return zaduzeniResurs;
	}
	public void setZaduzeniResurs(Resurs zaduzeniResurs) {
		this.zaduzeniResurs = zaduzeniResurs;
	}
	public VojnoLice getVojnoLiceZaduzenja() {
		return vojnoLiceZaduzenja;
	}
	public void setVojnoLiceZaduzenja(VojnoLice vojnoLiceZaduzenja) {
		this.vojnoLiceZaduzenja = vojnoLiceZaduzenja;
	}
	public Date getDatumZaduzenja() {
		return datumZaduzenja;
	}
	public void setDatumZaduzenja(Date datumZaduzenja) {
		this.datumZaduzenja = datumZaduzenja;
	}
	public Date getOcekivaniDatumRazduzenja() {
		return ocekivaniDatumRazduzenja;
	}
	public void setOcekivaniDatumRazduzenja(Date ocekivaniDatumRazduzenja) {
		this.ocekivaniDatumRazduzenja = ocekivaniDatumRazduzenja;
	}
	
	

}
