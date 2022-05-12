package sistema.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import sistema.entity.Cliente;

public class ClienteService {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public ClienteService() {
        var cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setCPF("555.555.555-55");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 05, 12);
        cliente1.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente1);
    }
    public ArrayList<Cliente> getAllClientes(){
        return listaClientes;
    }
}
