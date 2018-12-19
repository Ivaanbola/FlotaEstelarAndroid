package com.example.ivaan.flotaestelar2;

import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class hiloJDBC extends AsyncTask<String[], Void, Boolean> {
    String server = "halifaxtraining.es";
    String puerto = "3306";
    String usuario = "uss003";
    String pass = "pass003";
    String bd = "ciberkaos003";
    Statement st = null;
    Connection conexionMySQL = null;

    @Override
    protected Boolean doInBackground(String[]... strings) {
        boolean estado = false;

        //Asignamos el driver a una variable del tipo String
        String driver = "com.mysql.jdbc.Driver";

        //Construimos la url
        String urlMySQL = "jdbc:mysql://" + server + ":" + puerto + "/";

        try {
            //Cargamos el driver del conector JDBC
            Class.forName(driver).newInstance();
            //Establecemos la conexion con el Servidor MySQL indicandole como paramietros la URL construida
            //la Base de datos a la que vamos a conectarnos, y el usuario y contraseña de acceso al Servidor
            conexionMySQL = DriverManager.getConnection(urlMySQL + bd, usuario, pass);
            estado = true;

            st = conexionMySQL.createStatement();
            //Se ejecutara la consulta que insertara una nueva cia con los datos introducidos
            st.executeUpdate("INSERT INTO sstripulantes (nombre) VALUES ('Ivan')");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conexionMySQL.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return estado;
    }


}
