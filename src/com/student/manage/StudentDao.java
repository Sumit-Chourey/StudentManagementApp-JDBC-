package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;

public class StudentDao {

	public static boolean insertStudentToDB(Student st)
	{
		boolean f=false;
		//jdbc code...........
		try {
			Connection con = CP.createC();
			String q= "insert into students(sname,sphone,scity) values(?,?,?)";
			//prepared statment
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values of parameters
			pstmt.setString(1, st.getSname());
			pstmt.setString(2, st.getSphone());
			pstmt.setString(3, st.getScity());
			
			
			//execute...
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int sid) {
		
		boolean f=false;
		//jdbc code...........
		try {
			Connection con = CP.createC();
			String q= "delete from students where sid=?;";
			//prepared statment
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values of parameters
			pstmt.setInt(1, sid);
		
			
			//execute...
			pstmt.executeUpdate();
			f=true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean showallstudents() {
		
		boolean f=false;
		//jdbc code...........
		try {
			Connection con = CP.createC();
			String q= "select * from students;";
			//create statment
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery(q);
			
			
			while(rs.next())
			{
				int sid=rs.getInt(1);
				String sname=rs.getString(2);//coloum number
				String sphone=rs.getString(3);//coloum number
				String scity=rs.getString(4);//coloum number
				
				System.out.println("ID : "+sid);
				System.out.println("Name : "+sname);
				System.out.println("Phone : "+sphone);
				System.out.println("City : "+scity);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
				
				
				
			}
			
			f=true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	
		
	}
	
}
