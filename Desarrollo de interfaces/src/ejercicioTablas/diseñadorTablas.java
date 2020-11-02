package ejercicioTablas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class diseñadorTablas extends Utilidades {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diseñadorTablas window = new diseñadorTablas();
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
	public diseñadorTablas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 607, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton botonNuevaTabla = new JButton("Nueva Tabla");
		botonNuevaTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nuevosDatos nd1 = new nuevosDatos();
				nd1.setVisible(true);
			}
		});
		botonNuevaTabla.setBorder(UIManager.getBorder("Button.border"));
		frame.getContentPane().add(botonNuevaTabla, BorderLayout.SOUTH);
		
		
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(0, 150));

		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Tabla coches");
		lblNewLabel_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
	 	panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setAlignmentY(Component.TOP_ALIGNMENT);
		table.setAlignmentX(Component.LEFT_ALIGNMENT);
		table.setFillsViewportHeight(true);
		table.setModel(new modeladoDatos(creacionListaCoches()));
		scrollPane.setViewportView(table);
		
//		table = new JTable();
//		table.setBounds(60, 23, 506, 209);
//		table.setFillsViewportHeight(true);
//		
//		frame.getContentPane().add(table);
	}

}
