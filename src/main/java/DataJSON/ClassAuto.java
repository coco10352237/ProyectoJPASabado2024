package DataJSON;

import com.google.gson.annotations.SerializedName;

public class ClassAuto {
	//declaramos sus atributos
	//personalizamos sus campos 
	//con las anotaciones respectivas.
	@SerializedName("codigo")
	private int idauto;
	@SerializedName("marca de auto")
	private String marca;
	private String modelo;
	private String color;
	@SerializedName("nro. de placa")
	private String nroplaca;
	private String motor;
	@SerializedName("fabricacion")
	private String tarjpropiedad;
	private String yearfabri;
	
	//constructores
	public ClassAuto(){
		
	}   //fin del constructor vacio.
	
	public ClassAuto(int idauto, String marca, String modelo, String color, String nroplaca, String motor,
			String tarjpropiedad, String yearfabri) {
		//super();
		this.idauto = idauto;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nroplaca = nroplaca;
		this.motor = motor;
		this.tarjpropiedad = tarjpropiedad;
		this.yearfabri = yearfabri;
	} //fin constructor con parametros...




	public int getIdauto() {
		return idauto;
	}
	public void setIdauto(int idauto) {
		this.idauto = idauto;
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
	public String getNroplaca() {
		return nroplaca;
	}
	public void setNroplaca(String nroplaca) {
		this.nroplaca = nroplaca;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getTarjpropiedad() {
		return tarjpropiedad;
	}
	public void setTarjpropiedad(String tarjpropiedad) {
		this.tarjpropiedad = tarjpropiedad;
	}
	public String getYearfabri() {
		return yearfabri;
	}
	public void setYearfabri(String yearfabri) {
		this.yearfabri = yearfabri;
	}
	
	

}  //fin de la clase....
