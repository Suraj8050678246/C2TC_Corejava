package classwork;

public class Volume {

int volu(int r)
	{  
		int volu=r*r*r;  
		
		return volu;
	}
	int volu(int l, int b, int h)  
	{  
		int volu=l*b*h; 
		
		return volu;
	} 
	double volu(double r) 
	{  
		double volu=(4/3)*3.14*r*r*r;  
		
		return volu;
	}  

public static void main(String args[]) {
Volume obj=new Volume();  
System.out.println("The Volume of a Cube is" +obj.volu(5));
System.out.println("The Volume of a Cuboid is" +obj.volu(5,6,1)); 
System.out.println("The Volume of Sphere is" +obj.volu(5));
}
}