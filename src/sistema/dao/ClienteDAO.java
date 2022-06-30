package sistema.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sistema.entity.Cliente;

public class ClienteDAO {
    
    public ArrayList<Cliente> getAll(){
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try{
            var conn = ConexaoDB.getInstance().getConn();
            var sql = "SELECT * FROM cliente";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                //ORM - Object Relational Mapping (Mapeamento Objeto Relacional)
                Cliente novoCliente = new Cliente();
                novoCliente.setId(rs.getLong("id"));
                novoCliente.setNome(rs.getString("nome"));
                novoCliente.setCPF(rs.getString("cpf"));
                //novoCliente.setDataNascimento(dataNascimento);
                lista.add(novoCliente);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }        
        return lista;
    }

}
