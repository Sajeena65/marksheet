/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.marksheet;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Program {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
       int[] sum = new int[5];
       int[] studper = new int[5];
       int k=0;
         
       String result="";
       String[] subjects={"Science","English","Maths","Social","Nepali"};
      
       int studnum;
       System.out.println("Enter Student number: ");
       studnum = input.nextInt ();
       String[] student=new String[studnum];
       String[] pstudent=new String[studnum];
       for (int i =0;i <studnum; i++){
          
          System.out.println("Enter Student Name:");
          student[i]=input.next();
          }
        
      
      int[][] studmarks = new int[studnum][5];
    
          for (int i = 0; i < studnum; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter marks for " + student[i] + " in " + subjects[j] + ": ");
                new Scanner(System.in);
                studmarks[i][j] = input.nextInt();
            
        }
      }
           for (int i = 0; i < studnum; i++) {
               System.out.println("Student name is:"+student[i]);
            for (int j = 0; j < 5; j++) {
                 
                System.out.println( subjects[j]+":"+studmarks[i][j] );
                if(studmarks[i][j]<32)
            {
                     result = "failed";
                
            }
       
            sum[i] += studmarks[i][j];
        
            
        }
        
           if(result.equals("failed"))
        {
            System.out.println("Result:Failed ");
        
        }else
        {
           
            pstudent[k]=student[i];
          
            studper[k]= (sum[i]/5);
            System.out.println("Percentage:"+studper[k]+ "%" );
            if(studper[k]>=80)   
            {
                 System.out.println("Distinction!");
            }else if (studper[k]>=60&&studper[k]<80)
                 System.out.println("First Division!");
            else if (studper[k]>=50&&studper[k]<60)
                 System.out.println("Second Division!");
            
            else if(studper[k]<50)
                 System.out.println("Third Division!");
            k++;
        }
           result="";}
           
            
       System.out.println("1. View The Rank");
        System.out.println("2. Exit");
        int choice=input.nextInt();
        switch(choice)
                {
            case 1:
               
         rank(studper,pstudent,k);
            break;
            case 2:
                System.exit(0);
                break;
           
            
        
        }
        
          
        }
           
         private static void rank(int[] array1,String[] array2,int length)
    {  
        
        int temp=0;
        String name="";
        int count=1;
        for(int i=0;i<length;i++)
        {
            for(int j=1;j<length-i;j++)
            {
                if(array1[j-1]<array1[j])
                    temp=array1[j-1];
                    array1[j-1]=array1[j];
                    array1[j]=temp;
                    
                    name=array2[j-1];
                    array2[j-1]=array2[j];
                    array2[j]=name;
                    
            }
        }
        
        for(int i=0;i<length;i++)
        {
            System.out.println(count+". "+array2[i]+" "+array1[i]+"%");
            count++;
        }     
          
    }
}

