package sistema.model;

import javax.swing.table.AbstractTableModel;

public class TabelaClienteModel extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 10;
    }
    @Override
    public int getColumnCount() {
        return 4;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return "Não acredito";

    }
}
