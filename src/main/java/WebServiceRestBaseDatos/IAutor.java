package WebServiceRestBaseDatos;

import java.util.List;

public interface IAutor {
	//declaramos los metodos
	public void RegistrarAutor(ClassAutor clasutor);
	public void ActualizarAutor(ClassAutor clasautor);
	public void EliminarAutor(ClassAutor clasautor);
	public ClassAutor BuscarAutor(ClassAutor classautor);
	public List<ClassAutor> listado();

}  //fin de la interface...
