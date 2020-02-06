package com.jo.jyothika.mavenepam;

import java.util.Scanner;
import java.util.ArrayList;

public class App1 
{
    public static void main( String[] args )
    {

    	    	Scanner s = new Scanner(System.in);
    	    	ArrayList<sweet> sweets=new ArrayList<sweet>();
    	        sweets.add(new Candy("c1",50,10));
    	        sweets.add(new Chocolate("ch1",70,20));
    	        sweets.add(new sweet("c2",20,10) {   
    	        		protected String getType() {
    	        			return "candy";
    	        			}});
    	        sweets.add(new sweet("ch2",15,20) {  
    	        		protected String getType() {
    	        			return "chocolate";
    	        			}});
    	        sweets.add(new Candy("c3",30,15));
    	        sweets.add(new Chocolate("ch3",45,60));
    	        Gift obj=new Gift(sweets);
    	        int total=obj.sum();
    	        System.out.println("sum of weights is:"+total);
    	        obj.sortChocolates("cost");  
    	        System.out.println("sorting the chocolates in gift by cost");
    	        for (sweet sw : obj.sweets) {
    	        	if(sw.getType()=="chocolate") {
    				System.out.println(sw.name);
    			}
    	      	}
    	        int low,high;
    	        System.out.println("enter the lower bound for cost of gifts");
    	        low=s.nextInt();
    	        System.out.println("enter the higher bound for cost of gifts");
    	        high=s.nextInt();
    	        for (sweet sw : obj.sweets) {
    	        	if(sw.getType()=="candy" && sw.cost>low && sw.cost<high) {
    				System.out.println(sw.name);
    	        	}
    	        }
    }
}

