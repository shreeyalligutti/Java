package com.xworkz.patient;

import com.xworkz.patient.operator.wardrobeoperator;

public class wardobeStarter{

  public static void main(String [] args)
  {
    wardrobeoperator opertaor = new wardrobeoperator();
	
	boolean status = operator.add ("pant");
	if(status)
	{
	  System.out.println("add is good");
	  }
	  else{
	    System.out.println("something wrong");
		}
		
		operator.add ("shirt");
		operator.add ("kurti");
		operator.add ("saree");
		operator.add ("hat");
		operator.add ("laptop");
		
		System.out.println(operator.wardrobe);
		  
		  boolean matched=operator.match("shampoo");
		  System.out.println(matched);
		  System.out.println(opertor.match ("shirt"));
		  
		  }
		}
		
	  