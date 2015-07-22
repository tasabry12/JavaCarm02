public class Libro {
	private int codice;
	private String autore;
	private String titolo;
	private double prezzo;

	public Libro() {

	}
	
	public Libro(int codice, String autore, String titolo, double prezzo ){
		this.codice=codice;
		this.autore=autore;
		this.titolo=titolo;
		this.prezzo=prezzo;		
	}
	
	public void stampaInfo(){
		System.out.println(codice+" - "+autore+" - "+titolo+" - "+prezzo+"\n");
	}
}
