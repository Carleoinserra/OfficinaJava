
public class Veicolo {

	String targa;
	String marca;
	String modello;
	boolean guasto;
	public Veicolo(String targa, String marca, String modello) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.guasto = false;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public boolean isGuasto() {
		return guasto;
	}
	public void setGuasto(boolean guasto) {
		this.guasto = guasto;
	}
	@Override
	public String toString() {
		return "Veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", guasto=" + guasto + "]";
	}
	
	
}
