
package in.cg.jdbccrud;
import java.sql.*;
import java.sql.DriverManager;

public class CrudDB {

	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/CG1",usr ="root",pwd="root";
		try {
			Connection con = DriverManager.getConnection(url,usr,pwd);
			String sql="insert into Employee22(user_name,password,email_id)values(?,?,?)";
			PreparedStatement stm =con.prepareStatement(sql);
			stm.setString(1,"Anurag");
			stm.setString(2,"pass1234");
			stm.setString(3,"anurag@gmail.com");
			int rows =stm.executeUpdate();
			if (rows>0) {
				System.out.println("A new user added succesfully ");
			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}