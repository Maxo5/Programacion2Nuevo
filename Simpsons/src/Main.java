
public class Main {

	public static void main(String[] args) {
		Bart bort = new Bart("Bart");
		Lisa lisa = new Lisa("Lisa");
		Homero homero = new Homero("Homero");
		Marge marge = new Marge ("Marge");
		
		homero.bebeCerveza();
		marge.cuidaA(homero);
		bort.juga();
		lisa.juga();

	}

}
