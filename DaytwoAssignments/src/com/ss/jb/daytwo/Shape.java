/**
 * 
 */
package com.ss.jb.daytwo;

/**
 * @author Li
 *
 */
public interface Shape {

	public double calculateArea();
	public void display(double n);
}
//Create class Rectangle to implement interface shape
class Rectangle implements Shape {
	 double l;
     double w;
     //create parameter constructor to initiate object
	public Rectangle (double l,double w)
	{
		this.l=l;
		this.w=w;
	}
	//implement method calculateArea
	 public double calculateArea()
	{
		double areaRectangle;
		areaRectangle=l*w;
		return areaRectangle;
	}
	//implement method display
	public void display(double n)
	{
		System.out.println("The area of Rectangle is "+n);
	}

}

//Create class Circle to implement interface shape
class Circle implements Shape {
	 double p=3.14;
	 double r;
	//create parameter constructor to initiate object
	public Circle (double r)
	{
		this.r=r;
	}
	//implement method calculateArea
	 public double calculateArea()
	{
		double areaCircle;
		areaCircle=p*r*r;
		return areaCircle;
	}
	//implement method display
	public void display(double n)
	{
		System.out.println("The area of Circle is "+n);
	}

}

//Create class Triangle to implement interface shape
class Triangle implements Shape {
	 double b;
    double h;
  //create parameter constructor to initiate object
	public Triangle (double b,double h)
	{
		this.b=b;
		this.h=h;
	}
	//implement method calculateArea
	 public double calculateArea()
	{
		double areaTriangle;
		areaTriangle=b*h*0.5;
		return areaTriangle;
	}
	//implement method display
	public void display(double n)
	{
		System.out.println("The area of Triangle is "+n);
	}
	
}
//Instance objects and display the results
class Assignmentsthree {
	public static void main (String[] args)
	{
		Rectangle obj1=new Rectangle(12.5,30);
		obj1.display(obj1.calculateArea());
		
		Circle obj2=new Circle(50);
		obj2.display(obj2.calculateArea());
		
		Triangle obj3=new Triangle(12.5,30);
		obj3.display(obj3.calculateArea());
	}
}
