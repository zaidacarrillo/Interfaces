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

public class Main {
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
					    System.out.println("No ha podido ser guardado el fichero");
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
		public static void nuevoArchivo(JTextPane textoUsuario) {
			textoUsuario.setText(null);
			
		}
		
		public static void accionCopiar() {
			
		}
		public static void cambiarFuente(JTextPane textoUsuario,String fuente ) {
			
			Font f=new Font(fuente, Font.PLAIN, 15);
			textoUsuario.setFont(f);
		}
		public static void cambiarTamaño(JSpinner tamañoLetra, JTextPane textoUsuario ) {
			try {
			       tamañoLetra.commitEdit();
			} catch ( java.text.ParseException e ) {  
				
			}
			int valorSpinner = (Integer) tamañoLetra.getValue();
			
		}
		
		
	}

