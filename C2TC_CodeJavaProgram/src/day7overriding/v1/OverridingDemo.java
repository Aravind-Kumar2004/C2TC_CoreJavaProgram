package day7overriding.v1;

import day7overriding.HDFC;
import day7overriding.ICICI;
import day7overriding.RBI;
import day7overriding.SBI;

public class OverridingDemo {

	public static void main(String[] args) {
		RBI rbi;


		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}
}