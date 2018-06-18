package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTables {

    static Connection conn;

    public static void executaSQL() {

        String script = "src/util/ScriptSQL.sql";
        BufferedReader reader;
        try {
            conn = ConnectionUtilJDBC.getConnection();

            reader = new BufferedReader(new FileReader(script));
            Statement stm = (Statement) conn.createStatement();
            String line = reader.readLine();
            System.out.println("__________________________________________________________");
            System.out.println("Configurando o banco de dados...");
            System.out.println("-----------------------------------------------------------");
            do {
                stm.executeUpdate(line);
                line = reader.readLine();
            } while (line != null);
 
            conn.close();
            reader.close();
           
            System.out.println("Configuração concluída.");
             System.out.println("__________________________________________________________");
        } catch (SQLException | IOException e) {
            System.out.println("Problema na conex�o com o SGDB: " + e.getMessage());
        }

    }
}
