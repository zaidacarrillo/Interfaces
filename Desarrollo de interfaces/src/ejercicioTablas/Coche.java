package ejercicioTablas;

public class Coche {
	 private String marca;
	 private String modelo;
	 private String color;
	 private String matricula;
	 private int a�oPublicacion;
	 
	 public Coche(String marca, String modelo, String color, String matricula, int a�oPublicacion) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.matricula = matricula;
			this.a�oPublicacion = a�oPublicacion;
		}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getA�oPublicacion() {
		return a�oPublicacion;
	}
	public void setA�oPublicacion(int a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}
	
	 
	 
	 
	 
	 
	 
}
