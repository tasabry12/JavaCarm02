
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Libro l;          //dichiarazione
//		l= new Libro();   //istanza, cioè creazione dell'oggetto l
		
		Libro l = new Libro(123, "Mario", "Java Tutorials", 15.0);
		
		Libro libreria[]= new Libro[50];
		
		
		l.stampaInfo();
	}

}
