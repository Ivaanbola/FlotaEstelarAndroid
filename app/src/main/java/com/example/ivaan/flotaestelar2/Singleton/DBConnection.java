package com.example.ivaan.flotaestelar2.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static final String JDBC_URL = "jdbc:mysql://halifaxtraining.es:3306/ciberkaos003";
	private static Connection instance = null;

	private DBConnection() {
	}

	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			Properties props = new Properties();
			props.put("user", "uss003");
			props.put("pasword","pass003");
			instance = DriverManager.getConnection(JDBC_URL, props);
		}
		return instance;

	}
}
