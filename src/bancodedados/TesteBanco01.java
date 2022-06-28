package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteBanco01{
    public static void main(String[] args) {
        //String de conexão: endereço completo para chegar no banco de dados
        var stringConnexao = "jdbc:mariadb://localhost/dbexerc1";
        var usuario = "root";
        var senha = "univille";
        try (Connection conn = DriverManager.getConnection(stringConnexao, usuario, senha)) {
            var sql = "select * from aluno";
            try(Statement stmt = conn.createStatement()){
                try(ResultSet rs = stmt.executeQuery(sql)){
                    while(rs.next()){
                        System.out.println(rs.getString("nome"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}