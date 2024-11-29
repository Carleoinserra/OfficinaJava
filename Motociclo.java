
public class Motociclo  extends Veicolo {
	
	String cilindrata;

	public Motociclo(String targa, String marca, String modello, String cilindrata) {
		super(targa, marca, modello);
		this.cilindrata = cilindrata;
	}

	public String getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(String cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Motociclo [cilindrata=" + cilindrata + ", targa=" + targa + ", marca=" + marca + ", modello=" + modello
				+ ", guasto=" + guasto + "]";
	}


	

}
