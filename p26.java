package hw4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
public class p26 {

	public static void main(String[] args) 
	{
		Car5 cars1[] = new Car5[2];
		
		cars1[0]=new Car5();
		cars1[1]=new RacingCar5();
		   
		for(int i = 0 ;i<cars1.length;i++)
		{
			Class cl = cars1[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
	}
}
class Car5
{
	protected int num;
	protected double gas;
	
	public Car5()
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
class RacingCar5 extends Car5
{
	private int course;
	
	public RacingCar5()
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

