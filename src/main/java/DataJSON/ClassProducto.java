package DataJSON;

import com.google.gson.annotations.SerializedName;

public class ClassProducto {
//declaramos sus atributos...
	//personalizamos los atributos..
	@SerializedName("Codigo")
	private int idproducto;
	@SerializedName("Articulo")
	private String nombre;
	@SerializedName("Descripcion de Producto")
	private String descripcion;
	@SerializedName("Stock")
	private int cantidad;
	@SerializedName("Lote de Fabricacion")
	private int nrolote;
	@SerializedName("Codigo de Barras")
	private int codbarras;
	//constructores..
	public ClassProducto(){	
	}   //fin del constructor vacio..
	
	public ClassProducto(int idproducto, String nombre, String descripcion, int cantidad, int nrolote, int codbarras) {
		//super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.nrolote = nrolote;
		this.codbarras = codbarras;
	}  //fin del constructor con parametros...

//getters y setters...
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getNrolote() {
		return nrolote;
	}
	public void setNrolote(int nrolote) {
		this.nrolote = nrolote;
	}
	public int getCodbarras() {
		return codbarras;
	}
	public void setCodbarras(int codbarras) {
		this.codbarras = codbarras;
	}
	
	
}   //fin de la clase producto
