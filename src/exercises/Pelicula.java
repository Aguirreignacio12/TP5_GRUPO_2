package exercises;

public class Pelicula {
	private static int _id = 0;
	private String _nombre;
	private Genero _genero;
	
	
	public Pelicula(int id, String nombre, Genero genero) {
		this._nombre = nombre;
		this._genero = genero;
	}


	public int get_id() {
		return _id;
	}


	public String get_nombre() {
		return _nombre;
	}


	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}


	public Genero get_genero() {
		return _genero;
	}


	public void set_genero(Genero _genero) {
		this._genero = _genero;
	}
	
	public static int DevuelveProximoID()
	{
		return _id + 1;
	}


	@Override
	public String toString() {
		return "Pelicula: " + _nombre + ", genero: " + _genero;
	}
	
	

}
