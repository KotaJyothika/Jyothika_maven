package com.jo.jyothika.mavenepam;

import java.util.Comparator;
public class sortbyCost implements Comparator<sweet> {
      
	public int compare(sweet g1,sweet g2) {
		return g1.cost-g2.cost;
	}
}
