package tw.brad.apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Brad66 {

	public static void main(String[] args) {
		try {
//			Connection conn = 
//				DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/iii?" +
//					"user=root&password=123456&serverTimezone=Asia/Taipei");

//			Connection conn = 
//				DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/iii?serverTimezone=Asia/Taipei", 
//					"root", "123456");

			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "123456");
			// useUnicode=true&characterEncoding=UTF-8
			prop.put("useUnicode", "true");
			prop.put("characterEncoding", "UTF-8");
			//prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/iii", prop);
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO cust (cname,tel,birthday)" +
					" VALUES ('資策會','123456','1999-01-02')");

//			stmt.executeUpdate("DELETE FROM cust WHERE id = 2");

//			stmt.executeUpdate("UPDATE cust SET cname='Peter',tel='321' WHERE id=1");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM cust");
			
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("cname");
				String tel = rs.getString("tel");
				String birthday = rs.getString("birthday");
				System.out.println(id + ":" + name + ":" + tel + ":" +birthday);
			}
			
			conn.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
