
package class01_8;

import java.sql.*;

public class jdbc
		{
		public static void main(String[] args)
			{
		 
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Asish@303");
				String[][] updates = {
					    {"1", "rohan", "liver"},
					    {"3", "rabi", "stomach"},
					    {"4", "sachin", "eye"}
					};

					String sql = "UPDATE patient SET name = ?, disease = ? WHERE id = ?";
					PreparedStatement pstmt = con.prepareStatement(sql);

					for (String[] row : updates) {
					    
					    pstmt.setString(1, row[1]); 
					    pstmt.setString(2, row[2]);
					    pstmt.setInt(3, Integer.parseInt(row[0]));  
					    pstmt.executeUpdate();
					}
				

				/*String sql="UPDATE patient SET name=? WHERE name=?";
				
				PreparedStatement pstmt=con.prepareStatement(sql);
				pstmt.setString(1,"Asish");
				pstmt.setString(2,"Manjeera");
				int rows=pstmt.executeUpdate();
				
				/*String[][] data=
				{
						{"Anshita", "22", "Fever"},
						{"Sri Laxmi", "23", "Cold"},
						{"Ashwarya", "22", "headche"},
						{"Manjeera", "22", "Pain"}
				};
					for(String[] row : data)
				{
					pstmt.setString(1, row[0]);
					pstmt.setInt(2, Integer.parseInt(row[1]));
					pstmt.setString(3, row[2]);
					pstmt.executeUpdate();
				}*/
				System.out.println(" All patients updated successfully");
				con.close();
			    }
			catch (Exception e)
			{
			e.printStackTrace();
					
			}}}
