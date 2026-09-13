package com.portfolioproject.app;

import com.portfolioproject.model.User;

//import com.portfolioproject.model.stock;
import java.util.*;


public class stockPortfolioApp 
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("===================================");
    	System.out.println("Stock Portfolio Management Project");
    	System.out.println("===================================");
    	
    	System.out.println("Enter Userid");
    	String userid=sc.nextLine();
    	
    	System.out.println("Enter user Name");
    	String name=sc.nextLine();
    	
    	System.out.println("Enter email");
    	String email=sc.nextLine();
    	//Creating the object
    	User user=new User(userid,name,email);
    	
    }

}
