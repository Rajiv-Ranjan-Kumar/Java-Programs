package com.rasuplus.login;
import java.io.*;
import java.util.Scanner;
// Java Bean Class
public class  LoginJavaBeanClass implements Serializable 
{
	private String userName,password; //private Datamember & Hidden Data
	public  LoginJavaBeanClass()
	{
		userName = "admin";
		password = "admin";
	}
	
	public void setName(String userName)
	{
		this.userName = userName;
	}
	
	public void setPass(String password)
	{
		this.password = password;
	}
	
	public String getName()
	{
		return userName;
	}
	
	public String getPass()
	{
		return password;
	}
	
}

class Encapsulation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name = "",pass = "" ;
		System.out.print("Enter User Name : ");
		name = sc.next();
		System.out.print("Enter Password : ");
		pass = sc.next();
		
		LoginJavaBeanClass ljbc = new LoginJavaBeanClass();
		ljbc.setName(name);
		ljbc.setPass(pass);
		
		name = ljbc.getName();
		pass = ljbc.getPass();
		System.out.println("User Name\tPassword\n"+name+"\t\t"+pass);
	}
}