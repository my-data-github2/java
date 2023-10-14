package com.app.geometry;
import java.lang.Math;

public class Point2D {
private int x1;
private int y1;
private int x2;
private int y2;

public Point2D() {
this.x1 = 0;
this.x2 = 0;
this.y1 = 0;
this.y2 = 0;
}
Point2D(int x1, int y1, int x2, int y2){
	this.x1 = x1;
	this.y1 = y1;
	this.x2 = x2;
	this.y2 = y2;
}

public String getDetails() {
String s1 = Integer.toString(x1);
String s2 = Integer.toString(y1);
String s3 = Integer.toString(x2);
String s4 = Integer.toString(y2);
System.out.print("In String Form: ");
System.out.print("("+s1+","+s2+"),");
System.out.println("("+s3+","+s4+")");
return (s1+s2+s3+s4);

} 

public boolean isEqual() {
	
	if(this.x1 == this.x2 && this.y1 == this.y2) {	
		return true;
	}
	
	else 
	{
	return false;	
	}
	
}

public void setX1(int x1) {
	this.x1 = x1;
}
public void setX2(int x2) {
	this.x2 = x2;
}
public void setY1(int y1) {
	this.y1 = y1;
}
public void setY2(int y2) {
	this.y2 = y2;
}

public double calculateDistance() {
return Math.sqrt( ( Math.pow(x2, 2)- Math.pow(x1, 2) )+( Math.pow(y2, 2)- Math.pow(y1,2) ) );
	
}

};

