/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paulojp
 */
public class CriaConexao {

    static Connection getConexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    String serverName = "localhost";
    String database = "biblioteca_uece";
    String url = "jdbc:mysql://" + serverName + "/" + database;
    String username = "root";
    String password = "";
    Connection conexao;
    
    CriaConexao() throws SQLException{
        conexao = DriverManager.getConnection(url, username, password);
    }
}
