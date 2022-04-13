package Com.Selenium;

import java.lang.reflect.Constructor;

public class constructor {

  String name;
  int id;
  int pincode;
  
  public void Constructor_D(String name,int id,int pincode)
  {
	  this.name=name;
	  this.id=id;
	  this.pincode=pincode;
  }
  
public void Constructor_B(String name,int id)
{
	this.name=name;
	this.id=id;
	 }
	


void details()
{
	System.out.println(name+" "+id+" "+pincode);

System.out.println(name+" "+id);

}


public static void main(String[] args) {
	
	constructor d = new constructor();
	
	
	
}
}
