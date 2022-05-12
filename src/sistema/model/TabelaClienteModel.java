package sistema.model;

import java.text.SimpleDateFormat;

import javax.swing.table.AbstractTableModel;

import sistema.controller.ListagemClienteController;

public class TabelaClienteModel extends AbstractTableModel {
    
  
    private ListagemClienteController controller;

    public TabelaClienteModel(ListagemClienteController controller) {
        this.controller = controller;
    }


    @Override
    public int getRowCount() {
        return controller.getAllClientes().size();
    }
    @Override
    public int getColumnCount() {
        return 4;
    }
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var umCliente = controller.getAllClientes().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return umCliente.getId();                
            case 1:
                return umCliente.getNome();
            case 2:
                return umCliente.getCPF();
            case 3:
                return sdf.format(umCliente.getDataNascimento());
        
            default:
                return "";
        }
    }
    @Override
    public String getColumnName(int column) {
        return new String[]{"Código", "Nome", "CPF", "Data Nascimento"}[column];
    }
    
}
