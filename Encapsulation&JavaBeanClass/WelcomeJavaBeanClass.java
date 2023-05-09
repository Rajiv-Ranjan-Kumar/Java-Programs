package com.rasuplus.wellcom;
import java.io.*;
import java.util.Scanner;

//java Bean Class...
public class WelcomeJavaBeanClass implements Serializable
{
	private String userName,password;
	
	public WelcomeJavaBeanClass()
	{
		userName = "admin";
		password = "admin";
	}
	
	public static String getName()
	{
		return new WelcomeJavaBeanClass().userName;
	}
	
	public static String getPassword()
	{
		return new WelcomeJavaBeanClass().password;
	}
}


class Welcome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name : ");
		String name = sc.next();
		System.out.println("Enter User Password : ");
		String pass = sc.next();
		if(name.equals(WelcomeJavaBeanClass.getName()) && pass.equals(WelcomeJavaBeanClass.getPassword()))
			System.out.println("\tWelcome");
		else
			System.out.println("Invalid User Name And Password...");
	}	
}
