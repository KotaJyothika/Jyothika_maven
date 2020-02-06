package com.jo.jyothika.mavenepam;

import java.util.*;
public class Gift {
   ArrayList<sweet> sweets;
   Gift(ArrayList<sweet> sweets){
	   this.sweets=sweets;
   }
   public Integer sum() {
	   Integer sum=0;
	   for(sweet s:sweets) {
		   sum+=s.weight;
	   }
	   return sum;
   }
   public void sortChocolates(String sortparam) {
	        if(sortparam.compareTo("name")==0) {
	        	Collections.sort(sweets,new sortbyName());
	        	
	        }
	        else if(sortparam.compareTo("weight")==0) {
	        	Collections.sort(sweets,new sortbyWeight());
	        	
	        }
	        else if(sortparam.compareTo("cost")==0) {
	        	Collections.sort(sweets,new sortbyCost());
	        }
   }
}