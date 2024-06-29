package WebServiceRestBaseDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassAutorImp  implements IAutor{

	@Override
	public void RegistrarAutor(ClassAutor clasutor) {
		//declaramos una variables de tipo string para insertar la cadena
		String sql="insert into tbl_autor values(null,?,?)";
		//declaramos la interface..
		PreparedStatement ps=null;
		
		//asignamos la conexion ,cadena
		try {
			ps=ConectarBD.getConexion().prepareStatement(sql);
			//asignamos los parametros
			ps.setString(1,clasutor.getNomautor());
			ps.setString(2,clasutor.getDescrip());
			//realizamos la ejecucion
			int x=ps.executeUpdate();
			//aplicamos una condicion
			if(x>0){
				//imprimimos un mensaje por pantalla
				System.out.println("Dato Registrado en la BD");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch...
		
		
	} //fin del metodo registrar...

	@Override
	public void ActualizarAutor(ClassAutor clasautor) {
		//declaramos una variable de tipo string  para almacenar la cadena
		String sql="update tbl_autor set nombre=?,descrip=? where idautor=?";
		//declaramos la interface..
		PreparedStatement ps=null;
		
		//asignamos la cadena, la conexion..
		try {
			ps=ConectarBD.getConexion().prepareStatement(sql);
			//asignamos los parametros
			ps.setString(1,clasautor.getNomautor());
			ps.setString(2,clasautor.getDescrip());
			ps.setInt(3,clasautor.getIdautor());
			//realizamos la respectiva ejecucion
			int y=ps.executeUpdate();
			//aplicamo una condicion
			if(y>0){
				//imprimimos mensaje por pantalla
				System.out.println("Dato Actualizado en la BD");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}  //fin del metodo actualizar...

	@Override
	public void EliminarAutor(ClassAutor clasautor) {
		//declaramos una variable  de tipo string para almacenar la cadena
		String sql="delete from tbl_autor where idautor=?";
		//aplicamos la interface..
		PreparedStatement ps=null;
		//asignamos la respectiva cadena
		try {
			ps=ConectarBD.getConexion().prepareStatement(sql);
			//asignamos el parametro
			ps.setInt(1,clasautor.getIdautor());
			//realizamos la respectiva ejecucion
			int z=ps.executeUpdate();
			//aplicamos una condicion
			if(z>0){
				//emitimos un mensaje por consola
				System.out.println("Dato elimininado de la base de datos");
				
			}  //fin de la condicion..
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}   //fin del metodo eliminar...

	@Override
	public ClassAutor BuscarAutor(ClassAutor classautor) {
		//declaramos la variable de tipo cadena para buscar el autor por codigo..
		String sql="select * from  tbl_autor where idautor=?";
		//declaramos la respectiva interface...
		PreparedStatement ps=null;
		ResultSet rs=null;
		//instanciamos la clase classautor
		ClassAutor autor=new ClassAutor();
		
		try {
			//asignamos la conexion y cadena
			ps=ConectarBD.getConexion().prepareStatement(sql);
			//asignamos parametros
			ps.setInt(1,classautor.getIdautor());
			//ejecutamos
			rs=ps.executeQuery();
			//aplicamos una condicion
			if(rs.next()){				
				autor.setIdautor(rs.getInt(1));
				autor.setNomautor(rs.getString(2));
				autor.setDescrip(rs.getString(3));				
			}   //fin de la condicion..
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch...
		//retornamos el autor recuperado...	
		return autor;
	} //fin del metodo buscar...

	@Override
	public List<ClassAutor> listado() {
		//declaramos una variable de tipo cadena 
		String sql="select * from tbl_autor";
		//aplicamos la interfaces para BD..
		PreparedStatement ps=null;
		ResultSet rs=null;
		//aplicamos un list
		List<ClassAutor> lista=new ArrayList<ClassAutor>();
		
		try {
			//asignamos la conexion,la cadena
			ps=ConectarBD.getConexion().prepareStatement(sql);
			//ejecutamos
			rs=ps.executeQuery();
			//aplicamos un bucle...
			while(rs.next()){
				//instanciamos la clase classautor
				ClassAutor autor=new ClassAutor();
				autor.setIdautor(rs.getInt(1));
				autor.setNomautor(rs.getString(2));
				autor.setDescrip(rs.getString(3));
				//asignamos lo que recuperamos de la BD  al listado
				lista.add(autor);
			}  //fin del bucle while...
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//retornamos los valores recuperados
		return lista;
	}   //fin del metodo listado...

}   //fin de la clase 
