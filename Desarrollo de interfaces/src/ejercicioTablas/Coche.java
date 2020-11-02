package ejercicioTablas;

public class Coche {
	 private String marca;
	 private String modelo;
	 private String color;
	 private String matricula;
	 private int añoPublicacion;
	 
	 public Coche(String marca, String modelo, String color, String matricula, int añoPublicacion) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.matricula = matricula;
			this.añoPublicacion = añoPublicacion;
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
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	 
	 
	 
	 
	 
	 
}
