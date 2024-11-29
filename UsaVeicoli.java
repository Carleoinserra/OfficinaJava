import java.util.ArrayList;

public class UsaVeicoli {
	
	public static void main(String[] args) {
		
	ArrayList <Veicolo> lista = new ArrayList<>();
	
	Veicolo v1 = new Vettura("a123", "Ford", "Kuga", "Suv");
	Veicolo v2 = new Vettura("b123", "Fiat","Panda",  "city car");
	Veicolo v3 = new Motociclo("a124", "Honda", "Ninja",  "500");
	Veicolo v4 = new Motociclo("b124", "Ducati","Panigale",  "250");
	
	v1.setGuasto(true);
	v4.setGuasto(true);
	
	lista.add(v1);
	lista.add(v2);
	lista.add(v3);
	lista.add(v4);
	
/*	for (Veicolo ve: lista) {
		if (ve.isGuasto()) {
			
			System.out.println(ve.getTarga());
		}
	}*/
	
	Officina f1 = new Officina();
	System.out.println(f1.ripara(v4));
	
	for (Veicolo ve: lista) {
		
			System.out.println("Il costo della riparazione della  " + ve.modello + " è: ");
			System.out.println(f1.ripara(ve) + " euro");
		}
	
	
		
		
		
	}

}
