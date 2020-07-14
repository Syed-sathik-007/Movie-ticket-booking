/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_ticket;
import java.util.*;

/**
 *+
 * @author syed
 */
public abstract class Theater extends Movie 
{
    
    public abstract void book();
    
}

class Ram extends Theater
{
    static int a=1,s=1;
    int i = 0,j= 0;
    int[][] seat=new int[11][11];
    int total_tickets;
    Scanner scan=new Scanner(System.in);
    Ram()
    {
    for(int row=1;row<=10;row++)
    {
        for(int col=1;col<=10;col++)
        {
            seat[row][col]=0;
        }
    }
    }
    @Override
    public int book()
    {
        int seat_row = 0,seat_col = 0; 
       Ram ram=new Ram();
        System.out.println("Enter number of tickets");
        total_tickets=scan.nextInt();
          for(a=1;a<=10;a++)
          {
            for(s=1;s<=10;s=s+2)
               {
                   if(total_tickets==2)
                   {
                       if(seat[a][s]==0 && seat[a][s+1]==0)
                       {
                           seat[a][s]=1;
                           seat[a][s+1]=1;
                           total_tickets=total_tickets-2;
                           seat_row=a;
                           seat_col=s+1;
                           System.out.println("row "+seat_row+"column "+s+","+seat_col);
                           return 0;
                       }
                       
                       else if(seat[a+1][j]==0 && seat[a+1][s+1]==0)
                       {
                           seat[a+1][s]=1;
                           seat[a+1][s+1]=1;
                           seat_row=a+1;
                           seat_col=s+1;
                           total_tickets=total_tickets-2;
                           System.out.println("row "+seat_row+"column "+s+","+seat_col);
                           return 0;
                       }
                   }
                   
                   if(total_tickets>0)
                   {
                   if(total_tickets>1)
                   {
                       
                       if(seat[a][s]==0 && seat[a][s+1]==0)
                       {
                           seat[a][s]=1;
                           seat[a][s+1]=1;
                           total_tickets=total_tickets-2;
                           seat_row=a;
                           seat_col=s+1;
                           System.out.println("row "+seat_row+"column "+s+","+seat_col);
                           a=1;
                           s=1;
                       }
                       else if(seat[a+1][s]==0 && seat[a+1][s+1]==0)
                       {
                           seat[a+1][s]=1;
                           seat[a+1][s+1]=1;
                           total_tickets=total_tickets-2;
                           seat_row=a+1;
                           seat_col=s+1;
                           System.out.println("row "+seat_row+"column "+s+","+seat_col);
                           a=1;
                           s=1;
                       }
                       
                   
                       
                   }
                   else
                   {
                       if(seat[a][s]==0)
                       {
                           seat[a][s]=1;
                           total_tickets=0;  
                           seat_row=a ;
                           seat_col=s;
                           System.out.println("row "+seat_row+"column "+seat_col);
                           return 0;
                       }
                     
                   }
               }
                else
                   {
                    seat_row=a ;
                    seat_col=s;
                    System.out.println("row "+seat_row+"column "+seat_col);
                    return 0;
                   }
          }
       
    }
           if(total_tickets<=0)
        {
            System.out.println("row "+seat_row+"column "+seat_col);
            
        
        }
        return 0;
        
       
    }
}

   
