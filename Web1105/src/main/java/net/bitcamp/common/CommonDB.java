package net.bitcamp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CommonDB {
	private Connection CN =null;
	private Statement ST = null;
	public static Connection getConnection() {
		Connection CN =null;
		Statement ST = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			CN = DriverManager.getConnection(url, "system", "1234");
			ST = CN.createStatement();
		} catch (Exception e) { 
			System.out.println("DB서버 연결 실패 "+ e.toString());
		}
		return CN;
	}
}
