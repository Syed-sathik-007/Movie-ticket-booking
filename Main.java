/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_ticket;

/**
 *
 * @author syed
 */
import java.util.*;
public class Main {
   public static void main(String[] args)
   {
       Ram ram=new Ram();
       Movie movie=new Movie();
       Login login=new Login();
       Admin_Login Admin_login=new Admin_Login();
       Scanner scan=new Scanner(System.in);
       System.out.println("1.Sign-up 2.Login 3.Admin_sign_up 4.Admin_Login  5.exit ");
       int choice=0;
       while (choice!=5)
       {
       System.out.println("Enter choice");
       choice=scan.nextInt();
       switch(choice)
       {
           case 1:
               System.out.println("Enter name");
               String name=scan.next();
               System.out.println("Enter password");
               String password=scan.next();
               login.insert(name,password);
               break;
           case 2:
               System.out.println("Enter name");
               String vname=scan.next();
               System.out.println("Enter password");
               String vpassword=scan.next();
               String check=login.validate(vname,vpassword);
                if(check!=null)
                {
                    
                    System.out.println("Login sucessfull by "+check);
                    movie.list();
                    String choose_movie;
                    System.out.println("Enter movie to watch");
                    choose_movie=scan.next();
                    movie.theater_name(choose_movie);
                    
                    ram.book();
                }
                else
                {
                    System.out.println("Login failed");
                }
               break;
           case 3:
               System.out.println("Enter Admin_name");
               String Admin_name=scan.next();
               System.out.println("Enter Admin_password");
               String Admin_password=scan.next();
               Admin_login.insert(Admin_name,Admin_password);
               break;
           case 4:
               System.out.println("Enter name");
               String A_name=scan.next();
               System.out.println("Enter password");
               String A_password=scan.next();
               String A_check=Admin_login.validate(A_name,A_password);
                if(A_check!=null)
                {
                    
                    System.out.println("Login sucessfull by "+A_check);
                    System.out.println("Add Movie");
                    movie.add_movie();
                    
                    
                    
                }
                else
                {
                    System.out.println("Login failed");
                }
               break;
           case 5:
               break;
           
       }
       }
       
       
   }
    
}
