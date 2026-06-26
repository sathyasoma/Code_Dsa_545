package com.exp;

public class Demo2 {
	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[4] = 89;
			int div = 78 / 0;
		} catch (ArithmeticException e) {
			System.out.println("dont enter dennominator as zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bound");
		} catch (Exception e) {
			System.out.println("parent is handled...");
		} finally {
			System.out.println("always execuetd");
		}
		System.out.println("remaining 1000 lines of code");
	}
}
