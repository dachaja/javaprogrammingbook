package chapter17;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex3 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://54.244.245.83:3306/test?user=apettit&password=apettit007");
			
			System.out.println("DB connected.");
			stmt = conn.createStatement();
			stmt.executeUpdate("insert into student (name, id, dept) values('" + 
					new String("아무개".getBytes(), "ISO-8859-1") + "','0893012','" + 
					new String("컴퓨터공학".getBytes(),"ISO-8859-1") + "');");
			printTable(stmt);
			stmt.executeUpdate("update student set id=’0189011’ where name=’"+ new String("아무개".getBytes(), "ISO-8859-1") + "‘"); // 데이터 수정
			printTable(stmt);
			stmt.executeUpdate("delete from student where name=’"+ new String("아무개".getBytes(), "ISO-8859-1") +"‘"); // 레코드 삭제
			printTable(stmt);
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

	private static void printTable(Statement stmt) {
		ResultSet srs;
		try {
			srs = stmt.executeQuery("select * from student");
			while (srs.next()) {
				System.out.print(new String(srs.getString("name").getBytes("ISO-8859-1")));
				System.out.print("\t|\t" + srs.getString("id"));
				System.out.println("\t|\t" + new String(srs.getString("dept").getBytes("ISO-8859-1")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
