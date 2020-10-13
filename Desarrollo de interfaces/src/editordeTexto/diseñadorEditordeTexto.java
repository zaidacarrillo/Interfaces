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
import javax.swing.event.ChangeEvent;

public class diseñadorEditordeTexto extends Main {

	private JFrame frame;
	private JButton Nuevo;
	public JTextPane textoUsuario;

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
					frame.dispose();
				}
				
			}
		});
		frame.setBounds(100, 100, 892, 673);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 876, 32);
		frame.getContentPane().add(menuBar);
		
		textoUsuario = new JTextPane();
		textoUsuario.setBounds(63, 91, 742, 521);
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
		
		JMenuItem Mn2Cortar = new JMenuItem("Cortar");
		Mn2Cortar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		MmEditor.add(Mn2Cortar);
		
		JMenuItem Mn2Copiar = new JMenuItem("Copiar");
		MmEditor.add(Mn2Copiar);
		
		JMenuItem Mn2Pegar = new JMenuItem("Pegar");
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
		Guardar.setIcon(new ImageIcon("E:\\Interfaces\\utilidadesVarias\\iconoGuardar.png"));
		Guardar.setBounds(53, 26, 59, 54);
		frame.getContentPane().add(Guardar);
		
		Nuevo = new JButton("");
		Nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nuevoArchivo(textoUsuario);
			}
		});
		Nuevo.setToolTipText("Nuevo Archivo");
		Nuevo.setIcon(new ImageIcon("E:\\Interfaces\\utilidadesVarias\\nuevoArchivoicono.png"));
		Nuevo.setBounds(0, 26, 59, 54);
		frame.getContentPane().add(Nuevo);
		
		JButton Cortar = new JButton(new DefaultEditorKit.CutAction());
		Cortar.setText("cortar");
		Cortar.setToolTipText("Tijeras");
		Cortar.setIcon(new ImageIcon("E:\\Interfaces\\utilidadesVarias\\iconoCortar.png"));
		
			
		Cortar.setBounds(106, 26, 59, 54);
		frame.getContentPane().add(Cortar);
		
		JButton Copiar = new JButton(new DefaultEditorKit.CopyAction());
		Copiar.setToolTipText("Copiar");
		Copiar.setIcon(new ImageIcon("E:\\Interfaces\\utilidadesVarias\\iconoCopiar.png"));
		Copiar.setBounds(158, 26, 65, 54);
		frame.getContentPane().add(Copiar);
		
		JButton Pegar = new JButton(new DefaultEditorKit.PasteAction());
		Pegar.setToolTipText("Pegar");
		Pegar.setIcon(new ImageIcon("E:\\Interfaces\\utilidadesVarias\\iconoPegar.png"));
		Pegar.setBounds(216, 26, 65, 54);
		frame.getContentPane().add(Pegar);
		
		JSpinner tamañoLetra = new JSpinner();
		tamañoLetra.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				cambiarTamaño(tamañoLetra, textoUsuario);
			}
		});
		tamañoLetra.setModel(new SpinnerNumberModel(0, null, 100, 1));
		tamañoLetra.setBounds(312, 60, 30, 20);
		frame.getContentPane().add(tamañoLetra);
		
		
	}
}
