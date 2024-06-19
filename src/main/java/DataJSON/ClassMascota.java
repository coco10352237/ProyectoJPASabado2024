package DataJSON;

import com.google.gson.annotations.SerializedName;

public class ClassMascota {
	
	//declaramos sus atributos
	
	//personalizar los atributos
    @SerializedName("codigo")	
	private int idmascota;
	private String nommascota;
	private String raza;
	@SerializedName("color de pelo")
	private String color;
	@SerializedName("nro de vacunas")
	private String vacuna;
	private String edad;
	private String peso;
	
	//constructores...
	public ClassMascota(){
		
		
	}   //fin del constructor vacio..
	public ClassMascota(int idmascota, String nommascota, String raza, String color, String vacuna, String edad,
			String peso) {
		//super();
		this.idmascota = idmascota;
		this.nommascota = nommascota;
		this.raza = raza;
		this.color = color;
		this.vacuna = vacuna;
		this.edad = edad;
		this.peso = peso;
	}  //fin del constructor con parametros...

//getters y setters...

 
	public int getIdmascota() {
		return idmascota;
	}
	public void setIdmascota(int idmascota) {
		this.idmascota = idmascota;
	}
	public String getNommascota() {
		return nommascota;
	}
	public void setNommascota(String nommascota) {
		this.nommascota = nommascota;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVacuna() {
		return vacuna;
	}
	public void setVacuna(String vacuna) {
		this.vacuna = vacuna;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	
	
	

}  //fin de la clase auto...
