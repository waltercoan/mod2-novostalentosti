package sistema.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
                novoCliente.setDataNascimento(rs.getDate("datanascimento"));
                lista.add(novoCliente);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }        
        return lista;
    }

    public void save(Cliente cliente) {
        //olhar o ID cliente
        //SE ID == 0 -> Executar insert no banco - INSERT INTO TABELA
        //SE ID != 0 -> Executar update - UPDATE TABELA SET CAMPO=...
        try{
            var conn = ConexaoDB.getInstance().getConn();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if(cliente.getId() == 0){
                //INSERT
                var sql = "INSERT INTO cliente(nome, cpf, datanascimento) " +
                    " values(?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCPF());
                ps.setString(3, sdf.format(cliente.getDataNascimento()));
                ps.executeUpdate();
            }else{
                //UPDATE
                var sql = "UPDATE cliente set nome = ?, cpf = ?, datanascimento = ? " +
                        " where id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCPF());
                ps.setString(3, sdf.format(cliente.getDataNascimento()));
                ps.setLong(4, cliente.getId());
                ps.executeUpdate();       
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Cliente getClienteById(long id){
        Cliente umCliente = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            var conn = ConexaoDB.getInstance().getConn();
            var sql = "SELECT * FROM cliente where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                umCliente = new Cliente();
                //Hidratação do objeto
                umCliente.setId(rs.getLong("id"));
                umCliente.setNome(rs.getString("nome"));
                umCliente.setCPF(rs.getString("cpf"));
                umCliente.setDataNascimento(sdf.parse(rs.getString("datanascimento")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } 

        return umCliente;
    }
    public void delete(long id) {
        try{
            var conn = ConexaoDB.getInstance().getConn();
            var sql = "DELETE FROM cliente where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
