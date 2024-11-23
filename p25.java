package hw4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
public class p25 {

	public static void main(String[] args) 
	{
		Car4 car1 = new Car4();
		Car4 car2 = new Car4();
		
		Car4 car3 = car1;
		
		System.out.println("car1與car2相同"+car1.equals(car2));
		System.out.println("car1與car3相同"+car1.equals(car3));
	}
}
class Car4
{
	protected int num;
	protected double gas;
	
	public Car4()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	public String toString()
	{
		String str = "車號:"+num+"汽油量:"+gas;
		return str;
	}
}
class RacingCar4 extends Car4
{
	private int course;
	
	public RacingCar4()
	{
		course= 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	public void show()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}

