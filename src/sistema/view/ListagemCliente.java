package sistema.view;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import sistema.controller.ListagemClienteController;
import sistema.model.TabelaClienteModel;

import java.awt.FlowLayout;

public class ListagemCliente extends JFrame {

    private JScrollPane jpnCentro;
    private JPanel jpnSul = new JPanel();
    private JButton btnNovo = new JButton("Novo");
    private JButton btnAlterar = new JButton("Alterar");
    private JButton btnExcluir = new JButton("Excluir");
    private TabelaClienteModel tabelaModel = new TabelaClienteModel();
    private JTable tabela = new JTable(tabelaModel);
    private ListagemClienteController controller = new ListagemClienteController();

    public ListagemCliente() {
        setSize(500,400);
        setTitle("Listagem de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criaPaineis(); //chama o metodo!!!!
        setVisible(true);
    }
    private void criaPaineis(){
        //import java.awt.FlowLayout;
        jpnSul.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        
        add(jpnSul,"South");
        jpnSul.add(btnNovo);
        jpnSul.add(btnAlterar);
        jpnSul.add(btnExcluir);
        
        btnNovo.addActionListener(controller);
        btnNovo.setName("btnNovo");
        btnAlterar.addActionListener(controller);
        btnAlterar.setName("btnAlterar");
        btnExcluir.addActionListener(controller);
        btnExcluir.setName("btnExcluir");

        jpnCentro = new JScrollPane(tabela);
        jpnCentro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jpnCentro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(jpnCentro,"Center");
    }
}
