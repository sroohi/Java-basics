package com.abc.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectMainApp {
	public static void main(String[] args) throws Exception {

		Connection con = DbUtility.getConnection();
		Statement stmt = con.createStatement();

		String sql = "select * from drivers";
		ResultSet rs = stmt.executeQuery(sql);

		System.out.println("Driver Information");
		System.out.println();

		while (rs.next()) {
			int id = rs.getInt("driver_id");
			String name = rs.getString("first_name") + " " + rs.getString("last_name");
			String address = rs.getString("address");
			System.out.println(
					"- DRIVER ID  :" + " " + id + "| " + " NAME  :" + " " + name + "|" + " ADDRESS  :" + " " + address);
		}

		System.out.println("---------");
		System.out.println("Staff Information");
		System.out.println();
		String sql1 = "select * from employees";
		ResultSet rs1 = stmt.executeQuery(sql1);

		while (rs1.next()) {
			int id1 = rs1.getInt("employee_id");
			String name1 = rs1.getString("first_name") + " " + rs1.getString("last_name");
			System.out.println("- EMPLOYEE ID  :" + id1 + "|" + " EMPLOYEE NAME  :" + " " + name1);

		}

	}
}
