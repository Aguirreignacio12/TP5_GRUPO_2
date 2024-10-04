package exercises;

public class Genero {
	private String _nombre;
	
	public Genero(String nombre) {
		this._nombre = nombre;
	};
	
	public String getNombre() {
		return _nombre;
	}
	public void setNombre(String nombre) {
		this._nombre = nombre;
	}
	@Override
	public String toString() {
		return _nombre;
	}

}