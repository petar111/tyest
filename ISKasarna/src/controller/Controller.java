package controller;

import java.util.LinkedList;

import domain.VojnoLice;
import storage.StorageVojnoLice;

public class Controller {
	StorageVojnoLice storageVojnoLice;
	int a;
	
	public Controller() {
		storageVojnoLice = new StorageVojnoLice();
	}
	
	
	public VojnoLice vojnoLiceLogIn(String username, String password) throws Exception {
		LinkedList<VojnoLice> vojnaLicaTmp  = storageVojnoLice.getVojnaLica();
		
		for (VojnoLice curr : vojnaLicaTmp) {
			if((curr.getId() + "_" + curr.getImeiPrezime().split(" ")[0].toLowerCase()).equals(username)) {
				if(curr.getSifraNalogaVojnogLica().equals(password)) {
					return curr;
				}
				throw  new Exception("Pogresna sifra.");
			}
		}
		
		throw new Exception("Ne postoji nalog.");
	}
	
	
	
}
