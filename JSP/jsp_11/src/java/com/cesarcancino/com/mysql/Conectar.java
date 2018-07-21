
package com.cesarcancino.com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conectar 
{
        private Connection con;
	private PreparedStatement consulta;
	private ResultSet datos;
	private String server,user,bd,pass;
        public Conectar()
        {
            this.server="localhost";
            this.bd="test";
            this.user="root";
            this.pass="";
        }
        public void con() throws SQLException
        {
            try {
			//Class.forName("com.mysql.jdbc.driver");
			Class.forName("com.mysql.jdbc.Driver");//jdbc:mysql://localhost/test
			this.con=DriverManager.getConnection("jdbc:mysql://"+this.server+"/"+this.bd,this.user,this.pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
        public void desconectar() throws SQLException
	{
		this.con.close();
	
	} 
        public ResultSet getDatos() throws SQLException
        {
            this.con();
            //this.consulta=this.con.prepareStatement("select * from prueba");
            //this.datos= this.consulta.executeQuery();
            this.consulta=this.con.prepareStatement("select * from prueba");
            this.datos=this.consulta.executeQuery();
            return this.datos;
        }
}
