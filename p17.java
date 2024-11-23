package hw4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
public class p17 {

	public static void main(String[] args) 
	{
		Car3 cars[] = new Car3[2];
		
		cars[0]= new Car3();
		cars[0].setCar(1234,20.5);
		
		cars[1]= new RacingCar3();
		cars[1].setCar(4567,30.5);
		
		for(int i = 0 ;i<cars.length;i++)
		{
			cars[i].show();
		}
	}
}
class Car3
{
	protected int num;
	protected double gas;
	
	public Car3()
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
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class RacingCar3 extends Car3
{
	private int course;
	
	public RacingCar3()
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

