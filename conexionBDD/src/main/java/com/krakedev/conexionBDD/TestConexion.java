package com.krakedev.conexionBDD;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection C = null;
		PreparedStatement Pc = null;
		try {
			Class.forName("org.postgresql.Driver");
			C = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Anexo377");
			System.out.println("Conexion a SQL exitosa");
			Pc = C.prepareStatement(
					"insert into persona (cedula, nombre, apellido, estatura,estado_civil ,numero_hijos, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada)"
							+ "values(?,?,?,?)");
			
			Pc.setString(1, "10006");
			Pc.setString(2, "23456");
			Pc.setBigDecimal(4,new BigDecimal(155.50));
			
			SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaSDF = "2024/08/16 14:45:07";
			try {
				Date date = sf.parse(fechaSDF);
				long fechaMilS = date.getTime();

				java.sql.Date dateSQL = new java.sql.Date(fechaMilS);

				Pc.setDate(3, dateSQL);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Pc.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
