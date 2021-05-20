import java.util.*;
import java.lang.Math;
public class calc {
	public static void main(String[] args){
		final byte monthsinyear=12;
		final byte percent=100;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("type primary ammount");
		int principal=scan.nextInt();
		System.out.println(" Annual rate");
		double rate=scan.nextDouble();
		System.out.println("year");
		int year=scan.nextInt();
		double r=rate/percent/monthsinyear;
		int noOfPayments=year*monthsinyear;
		double mortagage=principal*r*Math.pow((1+r),noOfPayments)/(Math.pow(1+r,noOfPayments)-1);
		System.out.println(mortagage);
		
		
		
		
		
		
		
	}
}
