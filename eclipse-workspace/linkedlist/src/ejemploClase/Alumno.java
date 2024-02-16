package ejemploClase;

public class Alumno {
	
	
	private String nombre;
	private String nia;
	private int edad;
	//constructor
	//getters y setters
	
	public Alumno (String nombre, String nia, int edad) {
		this.nombre=nombre;
		this.nia=nia;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNia() {
		return nia;
	}

	public void setNia(String nia) {
		this.nia = nia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "nombre=" + nombre + ", nia=" + nia + ", edad=" + edad;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(o == null) {
			return false;
		}
		
		if(getClass() != o.getClass()) {
			return false;
		}
		
		Alumno a = (Alumno)o;
		
		if(nia == null & a.nia != null) {
			return false;
		}else if (!nia.equals(a.nia)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int primo = 31;
		int resultado=1;
		resultado=primo * resultado + (nia==null ? 0 : nia.hashCode());
		
		return resultado;
	}

//	@Override
//	public String toString() {
//		return "Alumno [nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + "]";
//	}

}
