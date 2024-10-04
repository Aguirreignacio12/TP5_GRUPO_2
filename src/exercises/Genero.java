package exercises;

import java.util.Objects;

public class Genero {
	@Override
	public int hashCode() {
		return Objects.hash(_nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		return Objects.equals(_nombre, other._nombre);
	}
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