package hw4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
public class P41{

	public static void main(String[] args) 
{
		Car8 car1=new Car8(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}
interface iVehicle
{
	void vshow();
}
interface iMaterial
{
	void mShow();
}
class Car8 implements iVehicle,iMaterial
{
	private int num;
	private double gas;

	public Car8(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void vShow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mShow()
	{
		System.out.println("車子的材質是鐵");
	}
}
