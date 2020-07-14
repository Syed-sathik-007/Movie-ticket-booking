/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_ticket;


import java.util.Scanner;

/**
 *
 * @author syed
 */
public class Movie {
    class Node
        {
            String movie_name;
            String movie_theater;
            Node next;
        }
        String m_name,m_theater;
        Node head = null;
        Node last = null;
    public void add_movie()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter movie name");
        m_name=scan.nextLine();
        System.out.println("Enter theater name");
        m_theater=scan.nextLine();
        Node new_node = new Node();
            new_node.movie_name=m_name;
            new_node.movie_theater=m_theater;
            new_node.next=null;
           
            if(head == null){
                head=new_node;
                last = head;
              
            }
            else{
               
                last.next=new_node;
                last=new_node;
            }
        
    }
    void list()
    {
        Node list;
        list=head;
        int list_c=1;
        while(list!=last.next)
        {
             System.out.println(list_c+". "+list.movie_name);
             list=list.next;
        }
    }
    String theater_name(String choose_movie)
    {
        String c_movie;
        Node list;
        list=head;
        int list_c=1;
        while(list!=last.next)
        {
            
            c_movie=list.movie_name;
             if(c_movie.equals(choose_movie))
             {
                 System.out.println(list.movie_theater+" welcomes you");
                 
             }
             list=list.next;
        }
        
        return null;
        
    }
}