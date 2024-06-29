package WebServiceRestBDServicio;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import WebServiceRestBaseDatos.ClassAutor;
import WebServiceRestBaseDatos.ClassAutorImp;

@Path("/Crud")
public class ClassServicioAutor {
	//hacemos la respectiva instancia...
	//invocamos el metodo listar...
	ClassAutorImp crud=new ClassAutorImp(); 
	@GET	
	@Path("/Listado")
	@Produces(MediaType.APPLICATION_JSON)
	//creamos el metodo listado de autores...
	public Response ListadoAutores(){
		
		List<ClassAutor> lis=crud.listado();
		//retornamos el listado
		return Response.ok(lis).build();
		
	}   //fin del metodo  listado autores...
	
	@POST
	@Path("/CrearAutor")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response CreateAutor(ClassAutor claut){	
		//invocamos el metodo registrar..
		crud.RegistrarAutor(claut);
		List<ClassAutor> lis=crud.listado();
		//retornamos el listado con el registro nuevo
		return Response.ok(lis).build();	
	}   //fin del metodo registrar...
	
	@PUT
	@Path("/ActualizarAutor")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response ActualizarAutor(ClassAutor claut){
		int idautor=0;
		List<ClassAutor> lis=crud.listado();
		//aplicamos un bucle for..
		for(ClassAutor listar:lis){
			//aplicamos una condicion...
			if(listar.getIdautor()==claut.getIdautor()){	
				idautor=listar.getIdautor();
			}   //fin de la condicion...
		}   //fin del bucle..
		//aplicamos una segunda condicion..
		if(idautor==0){
			return Response.status(Status.BAD_REQUEST).entity("autor no encontrado").build();
		}else{
			//invocamos el metodo actualizar
			crud.ActualizarAutor(claut);
			//recuperamos el listado actualizado
			List<ClassAutor> lis2=crud.listado();
			//retornamos el listado
		return Response.ok(lis2).build();		
		}   //fin del else...	
	}   //fin del mectodo response
	
	@DELETE
	@Path("/EliminarAutor/{cod}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteautor(@PathParam("cod") int cod){
		//instanciamos la respectiva clase..
		ClassAutor clautor=new ClassAutor();
		//asignamos el codigo a eliminar
		clautor.setIdautor(cod);
		//declaramos una variable de tipo entero
		int idautor=0;
		//recuperamos el listado
		List<ClassAutor> lis=crud.listado();
		//aplicamos un bucle
		for(ClassAutor listar:lis){
			//aplicamos una condicion´	
			if(listar.getIdautor()==clautor.getIdautor()){
				idautor=listar.getIdautor();		
			}   //fin de la condicion...	
		}   //fin del bucle...
		 
		//aplicamos una segunda condicion..
		if(idautor==0){
			return Response.status(Status.BAD_REQUEST).build();			
		}else{
			//invocamos el metodo eliminar
			crud.EliminarAutor(clautor);
			//retornamos el listado actualizado
			List<ClassAutor> lis2=crud.listado();
			return Response.ok(lis2).build();		
		}  //fin del else..
	}   //fin del metodo delete...
	
	
	@GET
	@Path("/BuscarAutor/{cod}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAutorById(@PathParam("cod") int cod){
		
		//instanciamos la respectiva clase..
		ClassAutor clautor=new ClassAutor();
		//asignamos el codigo a buscar..
		clautor.setIdautor(cod);
		//declaramos una variable de tipo entero..
		int idautor=0;
		List<ClassAutor> lis=crud.listado();
		//aplicamos un bucle for...
		for(ClassAutor listar:lis){
			//aplicamos una condicion...
			if(listar.getIdautor()==clautor.getIdautor()){					
					idautor=listar.getIdautor();				
			}  //fin de la condicion...	
			
		}   //fin del bucle for...
		//aplicamos una segunda condicion...
		if(idautor==0){
			
			return Response.status(Status.BAD_REQUEST).entity("autor no encontrado").build();
		}else{	
			//invocamos el metodo buscar..
			ClassAutor bus=crud.BuscarAutor(clautor);
			//retornamos el valor buscado
			return Response.ok(bus).build();
		}   //fin del else...
		
	}   //fin del metodo response...
	
	

}   //fin de la clase...
