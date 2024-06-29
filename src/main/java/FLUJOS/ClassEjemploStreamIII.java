package FLUJOS;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassEjemploStreamIII {

	public static void main(String[] args) {
		//instanciamos la clase file
		File objeto=new File("E:/notas2024.txt");
		//realizamos las respectiva instancias
		try {
			FileOutputStream fos=new FileOutputStream(objeto);
			DataOutputStream dos=new DataOutputStream(fos);
			//escribimos en la nota2024.txt
			dos.writeUTF("peru");
			dos.writeInt(33);
			//recuperamos datos  para ser leidos	 e impresos en la consola
			FileInputStream fis=new FileInputStream(objeto);
			DataInputStream  dis=new DataInputStream(fis);
			//creamos una variable de tipo estring
			String pais=dis.readUTF();
			int hab=dis.readInt();
			//recuperamos valores  recueperados por pantalla
			System.out.println(pais +" tiene "+hab+"millones de habitantes");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   //fin del catch...
          catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}  //fin del catch...
	}  //fin del metodo principal...

}//fin de la clase...
