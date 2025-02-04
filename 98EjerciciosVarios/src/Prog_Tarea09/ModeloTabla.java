package Prog_Tarea09;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public class ModeloTabla extends AbstractTableModel {
    private String[] columnNames;
    private Object[][] data;

    /**
     * Constructor que recibe los parámetros de los nombres que le asignaremos
     * a las columnas y los datos que deseamos mostrar para cada una de ellas
     * @param columnNames
     * @param data
     */
    public ModeloTabla(String[] columnNames, Object[][] data) {
        this.columnNames = columnNames;
        this.data = data;
    }

    /**
     * Método que nos permite añadir una nueva fila en la tabla
     */
    public void addRow() {
        int numRows = data.length;
        this.fireTableRowsInserted(numRows, numRows+1);
    }

    /**
     * Método para eliminar la fila que le indiquemos en la tabla
     * @param row
     */
    public void removeRow(int row) {
        this.fireTableRowsDeleted(row, row);
    }

    /**
     * Método para añadir una fila
     * @param row
     */
    public void addRow(Object[] row) {
        int numRows = data.length;
        this.fireTableRowsInserted(numRows, numRows+1);
    }

    /**
     * devolvemos el numero de elementos del array de datos
     * @return 
     */
    @Override
    public int getRowCount(){return data.length;}

    /**
     * Únicamente retornamos el numero de elementos del
     * array de los nombres de las columnas
     *
     * @return
     */
    @Override
    public int getColumnCount(){return columnNames.length;}

    /**
     * Devolvemos el nombre de la columna indicada
     *
     * @param col
     * @return
     */
    @Override
    public String getColumnName(int col) {return columnNames[col];}

    /**
     * Devolvemos el objeto contenido en una celda indicada
     * @param row
     * @param col
     * @return 
     */
    @Override
    public Object getValueAt(int row, int col){return data[row][col];}

    /**
     * Sólo lo usaremos si los datos de la tabla han de cambiar
     * @param value
     * @param row
     * @param col 
     */
    @Override
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    /**
     * Sólo lo definiremos si los datos de la tabla son editables
     * @param row
     * @param col
     * @return 
     */
    @Override
    public boolean isCellEditable(int row, int col) {return true;}

    /**
     * Este metodo sirve para determinar el editor predeterminado
     * para cada columna de celdas
     * @param c
     * @return 
     */
    @Override
    public Class getColumnClass(int c) {return getValueAt(0, c).getClass();}

    /**
     * Asignar el nombre a las columnas
     *
     * @param columnNames
     */
    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }

    /**
     * Asignar los datos que conformarán la tabla
     *
     * @param data
     */
    public void setData(Object[][] data) {
        this.data = data;
    }
}
