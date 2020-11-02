package ejercicioTablas;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class modeladoDatos extends AbstractTableModel {
	private ArrayList<Coche> listaCoches;
	private String[] columnas = { "Marca", "Modelo", "Color", "Matricula", "añoPublicacion" };

	public modeladoDatos(ArrayList<Coche> listaCoches) {
		super();
		this.listaCoches = listaCoches;
	}

	@Override
	public int getColumnCount() {

		return columnas.length;
	}

	@Override
	public int getRowCount() {

		return listaCoches.size();
	}

	@Override
	public String getColumnName(int pos) {
		
		return columnas[pos];
	}

	public boolean isCellEditable(int rowIndex, int colunmIndex) {
		return false;
	}
	
	@Override
	public Object getValueAt(int row, int col) {
		if (row != -1 && listaCoches.size() > row) {
			Coche c1 = listaCoches.get(row);
			switch (col) {
			case 0:
				return c1.getMarca();
			case 1:
				return c1.getModelo();
			case 2:
				return c1.getColor();
			case 3:
				return c1.getMatricula();
			case 4:
				return c1.getAñoPublicacion();
			default:
				return null;
			}
		}else 
			return null;
	}
}
