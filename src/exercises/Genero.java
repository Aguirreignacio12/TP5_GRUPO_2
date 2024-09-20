package exercises;

public class Genero {
	private int _id;
	private String _nombre;
	
	public Genero(int id, String nombre) {
		this._id= id;
		this._nombre = nombre;
	};
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}
	public String getNombre() {
		return _nombre;
	}
	public void setNombre(String nombre) {
		this._nombre = nombre;
	}
	@Override
	public String toString() {
		return "Genero: " + _nombre;
	}

}
