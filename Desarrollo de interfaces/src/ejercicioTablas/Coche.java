package ejercicioTablas;

public class Coche {
	 private String marca;
	 private String modelo;
	 private String color;
	 private String matricula;
	 private int aņoPublicacion;
	 
	 public Coche(String marca, String modelo, String color, String matricula, int aņoPublicacion) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.matricula = matricula;
			this.aņoPublicacion = aņoPublicacion;
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
	public int getAņoPublicacion() {
		return aņoPublicacion;
	}
	public void setAņoPublicacion(int aņoPublicacion) {
		this.aņoPublicacion = aņoPublicacion;
	}
	
	 
	 
	 
	 
	 
	 
}
