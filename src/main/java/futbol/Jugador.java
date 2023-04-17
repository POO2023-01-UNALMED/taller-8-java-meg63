package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	
	

	public Jugador(String nombre, int edad, String posicion,short goles,byte dorsal) {
		super(nombre, edad, posicion);
		golesMarcados=goles;
		this.dorsal=dorsal;
	}
	public Jugador() {
		super();
		golesMarcados=289;
		dorsal=7;
		
	}

	@Override
	public int compareTo(Object o) {
		return Math.abs(this.getEdad()-((Futbolista) o).getEdad());
	}

	@Override
	public String toString() {
		String cadena=super.toString()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados;
		return cadena;
	}
	@Override
	public boolean jugarConLasManos() {
		return false;
	}

}
