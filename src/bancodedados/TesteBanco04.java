package bancodedados;

import java.sql.*;

public class TesteBanco04 {
    public static void main(String[] args) {
        var stringConnexao = "jdbc:mariadb://localhost/dbexerc1";
        var usuario = "root";
        var senha = "univille";
        try (Connection conn = DriverManager.getConnection(stringConnexao, usuario, senha)) {
            var sql = "delete from aluno where numero = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 10);
            var numlinhasafetadas = ps.executeUpdate();
            System.out.println("Total de linhas afetadas" + numlinhasafetadas);
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
