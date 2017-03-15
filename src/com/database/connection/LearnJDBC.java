package com.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LearnJDBC {

	// 1. create connetion ( Driver (com.mysql.jdbc.Driver)
	// , ip ( 127.0.0.1), port (3306)
	// , username (root), password())

	// 2. create statement using this connection
	// 3. ResultSet extract
	// 4. Use resultSet

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // fixed
	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/people"; // ipaddress,
																							// db
																							// name
																							// -
																							// variable

	private static final String USER = "root"; // variable
	private static final String PASS = "123456"; // password

	// 1.connection created
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER);
		return DriverManager.getConnection(DB_URL, USER, PASS);

	}

	// 2.now going to create statement
	public static Statement getStatement(Connection conn) throws SQLException {
		return conn.createStatement();

	}

	// 3. fire query on that statement and get Resultset

	public static ResultSet getResultSet(Statement statement, String query) throws SQLException {
		
		return statement.executeQuery(query);
	}

	// 4. use result set to do what eever
	public static void useResultSet(ResultSet result) throws SQLException {

		System.out.println(" ******************* STUDENTS OF JAVA CLASS **********************");
		while (result.next()) {
			String fname = result.getString("fname");
			String sname = result.getString("sname");
			String address = result.getString("address");
			System.out.println(fname + " "+sname+" "+ address);

		}

		System.out.println("******************* I AM DONE **********************************");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//dataBaseInASingleMethod();
		Connection conn=getConnection();
		Statement stmt=getStatement(conn);
		ResultSet result=getResultSet(stmt, "update people set sname='shrestha' where fname='sharat'");
		useResultSet(result);
	}

	public static void dataBaseInASingleMethod() throws SQLException, ClassNotFoundException {
		Class.forName(JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery("select * from student;");
		//statement.ex

		while (result.next()) {
			String name = result.getString("name");
			String address = result.getString("address");
			System.out.println(name + " " + address);

		}

		ResultSet result1 = statement.executeQuery("select * from studentds where name = 'Yam';");

		while (result1.next()) {
			String name = result1.getString("name");
			String address = result1.getString("address");
			System.out.println(name + " " + address);

		}

	}

}
