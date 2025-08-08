package class01_8;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class HoshJdbc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_portal", "root",
					"Asish@303");

			String createTable = "CREATE TABLE IF NOT EXISTS patient1 (" + "id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "name VARCHAR(100) NOT NULL, " + "age INT NOT NULL, " + "disease VARCHAR(100), "
					+ "admission_date DATE NOT NULL, " + "doctor_assigned VARCHAR(100))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(createTable);

			while (true) {
				System.out.println("\n--- Hospital Portal ---");
				System.out.println("1. Register New Patient");
				System.out.println("2. Update Patient by ID");
				System.out.println("3. Delete Patient by ID");
				System.out.println("4. Show the data");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();
				sc.nextLine();

				if (choice == 1) {
					String sql = "INSERT INTO patient1 (name, age, disease, admission_date, doctor_assigned) "
							+ "VALUES (?, ?, ?, ?, ?)";
					PreparedStatement pstmt = con.prepareStatement(sql);

					System.out.print("Enter Patient Name: ");
					String name = sc.nextLine();

					System.out.print("Enter Age: ");
					int age = sc.nextInt();
					sc.nextLine();

					System.out.print("Enter Disease: ");
					String disease = sc.nextLine();

					System.out.print("Enter Admission Date (YYYY-MM-DD): ");
					String admissionDate = sc.nextLine();

					System.out.print("Enter Doctor Assigned: ");
					String doctor = sc.nextLine();

					pstmt.setString(1, name);
					pstmt.setInt(2, age);
					pstmt.setString(3, disease);
					pstmt.setDate(4, Date.valueOf(admissionDate));
					pstmt.setString(5, doctor);

					pstmt.executeUpdate();
					System.out.println("Patient registered successfully!");
					pstmt.close();

				} else if (choice == 2) {
					System.out.print("Enter Patient ID to update: ");
					int id = sc.nextInt();
					sc.nextLine();

					System.out.print("Enter new Age: ");
					int age = sc.nextInt();
					sc.nextLine();

					System.out.print("Enter new Disease: ");
					String disease = sc.nextLine();

					System.out.print("Enter new Doctor Assigned: ");
					String doctor = sc.nextLine();

					String updateSql = "UPDATE patient1 SET age = ?, disease = ?, doctor_assigned = ? WHERE id = ?";
					PreparedStatement pstmt = con.prepareStatement(updateSql);

					pstmt.setInt(1, age);
					pstmt.setString(2, disease);
					pstmt.setString(3, doctor);
					pstmt.setInt(4, id);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Patient with ID " + id + " updated successfully!");
					} else {
						System.out.println("No patient found with ID " + id);
					}}
					
					else if(choice==3) {
					
					System.out.print("Enter Patient ID to delete: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    String deleteSql = "DELETE FROM patient1 WHERE id = ?";
                    PreparedStatement pstmt = con.prepareStatement(deleteSql);
                    pstmt.setInt(1, id);

                    int rows = pstmt.executeUpdate();
                    if (rows > 0) {
                        System.out.println("Patient with ID " + id + " deleted successfully!");
                    } else {
                        System.out.println(" No patient found with ID " + id);
                    }}
                   else if (choice == 4) {

					String sql = "SELECT * FROM patient1";
					ResultSet rs = stmt.executeQuery(sql);

					System.out.println("\n--- Patient Records ---");
					while (rs.next()) {
						System.out.println("ID: " + rs.getInt("id") 
						+ ", Name: " + rs.getString("name")
						+ ", Age: "	+ rs.getInt("age")
						+ ", Disease: " + rs.getString("disease") 
						+ ", Admission Date: "+ rs.getDate("admission_date")
						+ ", Doctor: "+ rs.getString("doctor_assigned"));
					}}
				else if(choice == 5) {
					System.out.println("Exiting... Thank you!");
					break;
				} else {
					System.out.println("Invalid choice. Try again.");
				}
			}
			stmt.close();
			con.close();
			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
