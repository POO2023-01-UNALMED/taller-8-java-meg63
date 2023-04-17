package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	

	public Portero(String nombre, int edad,short goles,byte dorsal) {
		super(nombre, edad, "Portero");
		golesRecibidos=goles;
		this.dorsal=dorsal;
		
	}

	@Override
	public String toString() {
		String cadena=super.toString()+" con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
		return cadena;
	}

	@Override
	public int compareTo(Object o) {
		return Math.abs(this.golesRecibidos-((Portero) o).golesRecibidos);
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

}
