package editordeTexto;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextPane;

public class Utilidades {
	String rutaUsuario;

		public static void guardarDatos(JTextPane textoUsuario) throws IOException {
			String rutaUsuario;
			String textoEscritoUsuario;
			String datosUsuario;

			JFileChooser Jfc = new JFileChooser();
			
			if(Jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
				 rutaUsuario = Jfc.getSelectedFile().getAbsolutePath();
				 File documentoUsuario = new File (rutaUsuario); 
				 try {
					  if (documentoUsuario.createNewFile())
					    System.out.println("El fichero se ha guardado correctamente");
					  else {
						  JOptionPane.showMessageDialog(null, "No ha podido ser guardado el fichero, ya que ya existe");
						  JOptionPane.showMessageDialog(null, "Cerrando... Hasta Pronto.");
					    /*System.out.println("No ha podido ser guardado el fichero, ya que ya existe");*/
					  	System.exit(0);
					  }
					} catch (IOException ioe) {
					  ioe.printStackTrace();
					}
				 textoEscritoUsuario = textoUsuario.getText();
				 FileWriter fw = new FileWriter(documentoUsuario);

				 	fw.write(textoEscritoUsuario);
				 	fw.flush();
				 	fw.close();
					}
			}
		public static void nuevoArchivo(JTextPane textoUsuario, boolean cambios) {
			int res= JOptionPane.showConfirmDialog(null, "Nuevo Archivo");
			if(res==JFileChooser.APPROVE_OPTION) {
				//frame.dispose();
						if(cambios == true) {
							JOptionPane.showMessageDialog(null, "Existen cambios sin guardar deseas guardar");
							try {
								guardarDatos(textoUsuario);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}else if(cambios == false) {
							JOptionPane.showMessageDialog(null, "Hasta la próxima! todo está guardado.");
						}
			textoUsuario.setText(null);
			}
		}
		
		public static void cambiarFuente(JTextPane textoUsuario,String fuente ) {
			
			Font f=new Font(fuente, Font.PLAIN, 15);
			textoUsuario.setFont(f);
		}
		public static void cambiarTamaño(JSpinner tamañoLetra, JTextPane textoUsuario ) {
			
			int valorSpinner = (Integer) tamañoLetra.getValue();
			
			Font f2;
			f2 = textoUsuario.getFont(); 
			f2=f2.deriveFont(((float)valorSpinner));
			
			textoUsuario.setFont(f2);
			
		}
		
		public static void abrirArchivo(JTextPane textoUsuario) {
			File archivo;
			do {
			JFileChooser selectorArchivos = new JFileChooser();
			selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			
			int resultadoUser = selectorArchivos.showOpenDialog(null);
			 archivo = selectorArchivos.getSelectedFile();
			if((archivo == null) || (archivo.getName().equals(""))) {
				JOptionPane.showMessageDialog(null, "Nombre de archivo inválido", "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE);
			} 
			}
		
			while((archivo == null));
			 System.out.println("sali del bucle");
			
			
			FileReader fr= null;
			try {
				fr = new FileReader (archivo);
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}
			BufferedReader br = new BufferedReader(fr);
			try {
		        
		         
		         fr = new FileReader (archivo);
		         br = new BufferedReader(fr);

		         // Lectura del fichero
		         String linea;
		         String linea2 = "";
		         while((linea=br.readLine())!=null){
		            linea2 = linea2 + linea + "\n";
		      }
		         textoUsuario.setText(linea2);
			}
		      catch(Exception e){
		         e.printStackTrace();
		      }finally{
		      
		         try{                    
		            if( null != fr ){   
		               fr.close();     
		            }                  
		         }catch (Exception e2){ 
		            e2.printStackTrace();
		         }
		      }
			
			
			
			
			
			
		}
		


}