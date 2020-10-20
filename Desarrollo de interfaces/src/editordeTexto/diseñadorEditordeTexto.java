package editordeTexto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultEditorKit;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;

public class diseñadorEditordeTexto extends Main {

	private JFrame frame;
	private JButton Nuevo;
	public JTextPane textoUsuario;
	boolean cambios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diseñadorEditordeTexto window = new diseñadorEditordeTexto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public diseñadorEditordeTexto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize () {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int res= JOptionPane.showConfirmDialog(null, "Cerrar?");
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
					
				}
				
			}
		});
		frame.setBounds(100, 100, 1004, 1017);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 988, 32);
		frame.getContentPane().add(menuBar);
		
		textoUsuario = new JTextPane();
		
		textoUsuario.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				 cambios = true;
				
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				 cambios = true;
				
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				 cambios =  true;
				
			}
			
		});
		textoUsuario.setBounds(63, 117, 855, 795);
		frame.getContentPane().add(textoUsuario);
		
		JMenu MnFichero = new JMenu("Fichero");
		menuBar.add(MnFichero);
		
		JMenuItem Mn2Nuevo = new JMenuItem("Nuevo");
		Mn2Nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		MnFichero.add(Mn2Nuevo);
		
		JMenuItem Mn2Abrir = new JMenuItem("Abrir");
		Mn2Abrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirArchivo(textoUsuario);
			}
		});
		MnFichero.add(Mn2Abrir);
		
		JMenuItem Mn2Guardar = new JMenuItem("Guardar");
		Mn2Guardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		Mn2Guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					guardarDatos(textoUsuario);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			   //textoUsuario.setText(panelGuardar.getSelectedFile().getAbsolutePath());
			}

		});
		MnFichero.add(Mn2Guardar);
		
		JMenuItem Mn2GuardarComo = new JMenuItem("Guardar como");
		Mn2GuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					guardarDatos(textoUsuario);
					cambios = false;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		  
		});
		MnFichero.add(Mn2GuardarComo);
		
		JMenu MmEditor = new JMenu("Editor");
		MmEditor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		menuBar.add(MmEditor);
		
		JMenu Mn2Fuente = new JMenu("Fuente");
		MmEditor.add(Mn2Fuente);
		
		JMenuItem fuenteTimesNewRoman = new JMenuItem("Times New Roman");
		fuenteTimesNewRoman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarFuente(textoUsuario,  fuenteTimesNewRoman.getText());
			}
		});
		Mn2Fuente.add(fuenteTimesNewRoman);
		
		JMenuItem fuenteComicSans = new JMenuItem("Comic Sans");
		fuenteComicSans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarFuente(textoUsuario,  "Comic Sans MS");
			}
		});
		Mn2Fuente.add(fuenteComicSans);
		
		JMenuItem fuenteCalibri = new JMenuItem("Calibr\u00ED");
		fuenteCalibri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarFuente(textoUsuario,  fuenteCalibri.getText());
			}
		});
		Mn2Fuente.add(fuenteCalibri);
		
		JMenuItem Mn2Cortar = new JMenuItem(new DefaultEditorKit.CutAction());
		Mn2Cortar.setText("Cortar");
		Mn2Cortar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		MmEditor.add(Mn2Cortar);
		JMenuItem Mn2Copiar = new JMenuItem(new DefaultEditorKit.CopyAction());
		Mn2Copiar.setText("Copiar");
		Mn2Copiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		MmEditor.add(Mn2Copiar);
		
		JMenuItem Mn2Pegar = new JMenuItem(new DefaultEditorKit.PasteAction());
		Mn2Pegar.setText("Pegar");
		MmEditor.add(Mn2Pegar);
		
		JButton Guardar = new JButton("");
		Guardar.setToolTipText("Guardar");
		Guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					guardarDatos(textoUsuario);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Guardar.setIcon(new ImageIcon(diseñadorEditordeTexto.class.getResource("/imagenes/iconoGuardar.png")));
		Guardar.setBounds(53, 26, 59, 54);
		frame.getContentPane().add(Guardar);
		
		Nuevo = new JButton("");
		Nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nuevoArchivo(textoUsuario, cambios);
			}
		});
		Nuevo.setToolTipText("Nuevo Archivo");
		Nuevo.setIcon(new ImageIcon(diseñadorEditordeTexto.class.getResource("/imagenes/nuevoArchivoicono.png")));
		Nuevo.setBounds(0, 26, 59, 54);
		frame.getContentPane().add(Nuevo);
		
		JButton Cortar = new JButton(new DefaultEditorKit.CutAction());
		Cortar.setIcon(new ImageIcon(diseñadorEditordeTexto.class.getResource("/imagenes/iconoCortar.png")));
		Cortar.setText("");
		Cortar.setToolTipText("Tijeras");
		
			
		Cortar.setBounds(106, 26, 59, 54);
		frame.getContentPane().add(Cortar);
		
		JButton Copiar = new JButton(new DefaultEditorKit.CopyAction());
		Copiar.setText("");
		Copiar.setToolTipText("Copiar");
		Copiar.setIcon(new ImageIcon(diseñadorEditordeTexto.class.getResource("/imagenes/iconoCopiar.png")));
		Copiar.setBounds(158, 26, 65, 54);
		frame.getContentPane().add(Copiar);
		
		JButton Pegar = new JButton(new DefaultEditorKit.PasteAction());
		Pegar.setText("");
		Pegar.setToolTipText("Pegar");
		Pegar.setIcon(new ImageIcon(diseñadorEditordeTexto.class.getResource("/imagenes/iconoPegar.png")));
		Pegar.setBounds(216, 26, 65, 54);
		frame.getContentPane().add(Pegar);
		
		JSpinner tamañoLetra = new JSpinner();
		
		tamañoLetra.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				cambiarTamaño(tamañoLetra, textoUsuario);
			}
		});
		tamañoLetra.setModel(new SpinnerNumberModel(0, null, 100, 1));
		tamañoLetra.setValue(textoUsuario.getFont().getSize());
		tamañoLetra.setBounds(451, 60, 37, 20);
		frame.getContentPane().add(tamañoLetra);
		
		JLabel lblNewLabel = new JLabel("Cambiar tama\u00F1o letra");
		lblNewLabel.setBounds(320, 63, 115, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
