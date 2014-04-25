package chapter17;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex2 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://54.244.245.83:3306/test?user=apettit&password=apettit007");
			
			System.out.println("DB connected.");
			
			stmt = conn.createStatement();
			ResultSet srs = stmt.executeQuery("select * from student");
			
			printData(srs, "name", "id", "dept");
			srs = stmt.executeQuery("select name, id, dept from student where name='" + new String("이기자".getBytes(), "ISO-8859-1") + "'");
			printData(srs, "name", "id", "dept");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printData(ResultSet srs, String col1, String col2,
			String col3) {
		try {
			while(srs.next()) {
				if(!col1.equals(""))
					System.out.println(new String(srs.getString("name").getBytes("ISO-8859-1")));
				if(!col2.equals(""))
					System.out.println("\t|\t" + srs.getString("id"));
				if(!col3.equals(""))
					System.out.println("\t|\t" + new String(srs.getString("dept").getBytes("ISO-8859-1")));
				else
					System.out.println();
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
