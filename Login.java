/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movie_ticket;

import java.util.*;

/**
 *
 * @author syed
 */
public class Login {
    
    class Node{
    private String name;
    private String password;
    Node next;
   
}
    
String tname;
String tpassword;
Node head = null;
Node last = null;

    public void insert(String sname,String spassword)
    {
        Node new_node = new Node();
            new_node.name=sname;
            new_node.password=spassword;
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
    
    public String validate(String sname,String spassword)
    {
        
        Node temp= new Node();
        temp=head;
        if(head.next!=null)
        while(temp!=last.next)
        {
            
            tname=temp.name;
            tpassword=temp.password;
            if(tname.equals(sname) && tpassword.equals(spassword))
            {
             return tname;   
            }
            else if(temp!=last)
            {
                
                temp=temp.next;
            }
            else
            {
                return null;
            }
            
            
        }
        else
        {
            tname=temp.name;
            String tpassword=temp.password;
            if(tname.equals(sname) && tpassword.equals(spassword))
            {
                return tname;
                
            }
            else
            {
                return null;
            }
           
        }
        return null;
        
       
   
    }
    
}

