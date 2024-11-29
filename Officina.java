
public class Officina {

	public Officina() {
		
	}
	
	public int ripara(Veicolo v1) {
		
		int prezzo = 0;
		
		if (v1.isGuasto()) {
			
			prezzo += 150;
		}
		
		if (v1 instanceof Vettura) {
			
			Vettura vet = (Vettura) v1;
			
			if (vet.tipologia.equalsIgnoreCase("Suv")) {
				
				prezzo += 100;
			}
			else if (vet.tipologia.equalsIgnoreCase("City Car")) {
				
				prezzo += 50;
			}
		}
		else if (v1 instanceof Motociclo) {
			
			Motociclo mot = (Motociclo) v1;
			
			if (mot.cilindrata.equalsIgnoreCase("500")) {
				
				prezzo += 80;
			}
			else if (mot.cilindrata.equalsIgnoreCase("250")) {
				
				prezzo += 40;
			}
		}
		
		
		
		
		
		
		
		return prezzo;
		
	}
	
}
