package conexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel
 */
public class conexionSQL {

    Connection conectar = null;

    public Connection conexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "");

            JOptionPane.showMessageDialog(null, "Todo Salio bien");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion" + e.getMessage());
        }

        return conectar;
    }

}
