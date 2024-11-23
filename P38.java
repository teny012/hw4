package hw4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
public class P38{

	public static void main(String[] args) 
{
		iVehicle[]ivc=new iVehicle[2];
		
		ivc[0]=new Car7(1234,20.5);
		ivc[1]=new Plane1(232);
		
		for(int i=0;i<ivc.length;i++)
		{
			ivc[i].show();
		}
	}
}
interface iVehicle
{
	int weight = 1000;
	void show();
}
class Car7 implements iVehicle
{
	private int num;
	private double gas;

	public Car7(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class Plane1 implements iVehicle
{
	private int flight;

	public Plane1(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
	}
}