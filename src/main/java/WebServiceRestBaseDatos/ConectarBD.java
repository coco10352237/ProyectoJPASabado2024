package WebServiceRestBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConectarBD {
	
	//declaramos las variables
	private  static String url="jdbc:mysql://localhost:3306/bdservicioBiblio2024";
	private  static String usuario="root";
	private  static String password="";
	private static Connection con;
	//creamos el metodo
	public static Connection getConexion(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,usuario,password);
			//emitimos un mensaje..
			if(con!=null) JOptionPane.showMessageDialog(null,"Hay Conexion de BD!!!!!!!!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch...
 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch..
		//retornamos la conexion
		return con;
		
	}   //fin del metodo getconexion..

}  //fin de la clase conectar bd..
