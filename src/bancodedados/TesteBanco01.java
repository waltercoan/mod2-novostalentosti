package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class TesteBanco01{
    public static void main(String[] args) {
        //String de conexão: endereço completo para chegar no banco de dados
        var stringConnexao = "jdbc:mariadb://localhost/dbexerc1";
        var usuario = "root";
        var senha = "univille";
        //Abre a conexão com o banco de dados
        try (Connection conn = DriverManager.getConnection(stringConnexao, usuario, senha)) {
            //var sql = "select * from aluno";
            //var sql = "select * from aluno where nome like '%nho'";
            var busca = JOptionPane.showInputDialog(null, "Digite o nome procurado");
            //var sql = "select * from aluno where nome like '%" + busca +"%'";
            //System.out.println(sql);
            var sql = "select * from aluno where nome like ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%"+busca+"%");
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    System.out.print(rs.getString("numero"));
                    System.out.println(rs.getString("nome"));
                }
            }
            /*try(Statement stmt = conn.createStatement()){
                //Executando query no banco de dados
                try(ResultSet rs = stmt.executeQuery(sql)){
                    while(rs.next()){
                        System.out.print(rs.getString("numero"));
                        System.out.println(rs.getString("nome"));
                    }
                }
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}