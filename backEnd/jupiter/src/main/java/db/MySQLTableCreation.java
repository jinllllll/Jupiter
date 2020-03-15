package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLTableCreation {

	// Run this as Java application to reset the database.
	public static void main(String[] args) {
		try {
			System.out.println("Connecting to " + MySQLDBUtil.URL);
			
			//jdbc �ٷ�д��������driver�Ķ���-- ע��driver
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			
			//����һ�佨����driver��getConnection ������������
			Connection conn = DriverManager.getConnection(MySQLDBUtil.URL);
			
			if (conn == null) {
				return;
			}
			
			conn.close();
			System.out.println("Import done successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
