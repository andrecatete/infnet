package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import model.Contato;

public class ContatoDao {
    
    public static int inserir(Contato contato) {
                
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://201.148.209.155/aula_java2",
                    "atma", "atma@2018");
            Statement stm = conn.createStatement();
            int linhasAfetadas = stm.executeUpdate(
                    "insert into contato (nome, email, fone, endereco) " +
"values ('" + contato.getNome() +  "', '" + contato.getEmail() + "', '" + 
contato.getFone() +"', '"+ contato.getEndereco() +"');");
            return linhasAfetadas;
            
        } catch (Exception ex) {
            
        }
        return 0;        
    }
}