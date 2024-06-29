package WebServiceRestBasico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Operacion")
public class ClassSumaRomanos {
	
	@GET
	@Path("/Romanos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response resultado(@QueryParam("num1") int a,@QueryParam("num2") int b){
		//declaramos una variable de tipo entero.
		int resultado=a+b;
		//declaramos una variable de tipo string
		String numromano="";
		//aplicamos un switch
		switch(resultado){
		case 2:
			numromano="II";
			//salimos
			break;
		case 3:
			numromano="III";
			break;
		case 4:
			numromano="IV";
			break;
		case 5:
			numromano="V";
			break;
		case 6:
			numromano="VI";
			break;
		case 7:
			numromano="VII";
			break;
		case 8:
			numromano="VIII";
			break;
		case 9:
			numromano="IX";
			break;
		case 10:
			numromano="X";
			break;
		default:
			numromano="fuera de rango";
			break;
		
		}//fin del switch...	
		//retornamos el numero romano  como respuest
		return Response.ok(numromano).build();		
	}   //fin del metodo response...	

}  //fin de la clase...
