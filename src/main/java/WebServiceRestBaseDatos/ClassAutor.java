package WebServiceRestBaseDatos;

public class ClassAutor {
	//declaramos sus atributos
	private int idautor;
	private String nomautor;
	private String descrip;
	//constructores
	public ClassAutor(){
	
	}   //fin del constructor vacio..
	public ClassAutor(int idautor, String nomautor, String descrip) {
		//super();
		this.idautor = idautor;
		this.nomautor = nomautor;
		this.descrip = descrip;
	}  //fin del constructor con parametros..
	
	//getter y setters..
	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	public String getNomautor() {
		return nomautor;
	}
	public void setNomautor(String nomautor) {
		this.nomautor = nomautor;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
	
	

}  //fin de la clase autor...

