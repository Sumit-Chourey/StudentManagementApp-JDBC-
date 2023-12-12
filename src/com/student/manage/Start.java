package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String agr[]) throws NumberFormatException, IOException
	{
		System.out.println("Welcome to Student Management App");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		
		
		while(true)
		{
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to display Student");
			System.out.println("Press 4 to exit app");
			int c =Integer.parseInt(br.readLine());//string deta hai
			
			if(c==1)
			{
				System.out.println("Enter the name :");
				String name = br.readLine();
				
				System.out.println("Enter the phone :");
				String phone = br.readLine();
				
				System.out.println("Enter the city :");
				String city = br.readLine();
				
				Student st = new Student(name, phone, city);
				
				boolean answer= StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student data added successfully...");
				}else
				{
					System.out.println("Student data is not added...");
				}
				
			}else if(c==2)
			{
				System.out.println("Enter student id to delete : ");
				int sid = Integer.parseInt(br.readLine());
				Boolean f= StudentDao.deleteStudent(sid);
				if(true)
				{
					System.out.println("Data Deleted.....");
				}else
				{
					System.out.println("Data not Deleted.....");
				}
				
				
			}else if(c==3)
			{
				System.out.println("Show all student details....");
				StudentDao.showallstudents();
				
			}else if(c==4)
			{
				break;
			}else
			{
				
			}
		}
		System.out.println("Thankyou for using my application");
	}

}
