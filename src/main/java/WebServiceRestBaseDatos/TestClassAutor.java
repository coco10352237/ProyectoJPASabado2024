package WebServiceRestBaseDatos;

import java.util.List;

public class TestClassAutor {

	public static void main(String[] args) {
		//instanciamos la respectiva clase...
		ClassAutor  clautor=new ClassAutor();
		ClassAutorImp climp=new ClassAutorImp();
	/*	//asignamos los nuevos valores
		clautor.setNomautor("Ing. Luis Zapata");
		clautor.setDescrip("Seguridad de Aplicaciones");
		//invocamos al metodo registrar
		climp.RegistrarAutor(clautor);
		*/
		//testeamos el actualizar
		
         /* clautor.setIdautor(1);
          clautor.setNomautor("Ing. Hugo Sanchez");
          clautor.setDescrip("Desarrollo de Serivicios WEB II");
          //invocamos el metodo registrar
          climp.ActualizarAutor(clautor);*/
		//testeamos el eliminar
		/*clautor.setIdautor(4);
		//invocamos el metodo eliminar...
		climp.EliminarAutor(clautor);*/
		
		//******************testeamos el buscar
	/*	clautor.setIdautor(3);
		ClassAutor busautor=climp.BuscarAutor(clautor);
		//imprimimos por pantalla
		System.out.println("codigo "+busautor.getIdautor()+" nombre "
		+busautor.getNomautor()+" descripcion "+busautor.getDescrip());*/
		//**************testeamos el metodo listado
		List<ClassAutor> listado=climp.listado();
		//aplicamos un bucle
		for(ClassAutor lis:listado){
			//imprimimos por pantalla
			System.out.println("codigo "+lis.getIdautor()
			+" nombre "+lis.getNomautor()+" descrip "+lis.getDescrip());
			 
		}//fin del bucle for...
		
          
	}  //fin del metodo principal..

}  //fin de la clase..
