/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {
    
    // método resposável por estabelcer conexão com o banco

    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o drive
        String driver = "com.mysql.jdbc.Driver";
        

        //  armazenando informações referentes ao Banco
        String url = "jdbc:mysql://localhost:3306/dbinfox?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        // Estabelecendo a conexão com o Banco
        try {
           Class.forName(driver);
           conexao = DriverManager.getConnection(url,user,password);
           return conexao;
        } catch (Exception e) {  
           // System.out.println(e);// testar qual erro
            return null;            
        }
        
    

        
    }
    

}
