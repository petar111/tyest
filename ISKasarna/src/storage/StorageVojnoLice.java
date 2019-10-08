package storage;

import java.util.LinkedList;

import domain.Cin;
import domain.VojnoLice;

public class StorageVojnoLice {
	private LinkedList<VojnoLice> vojnaLica;
	
	public StorageVojnoLice() {
		vojnaLica = new LinkedList<VojnoLice>();
		vojnaLica.add(new VojnoLice(1, "Mika Mikic", "jasar", "jasar", Cin.MAJOR, null , null));
		//for test
	}

	/**
	 * @return the vojnaLica
	 */
	public LinkedList<VojnoLice> getVojnaLica() {
		return vojnaLica;
	}

	
	
}
