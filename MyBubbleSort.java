package com.company.LumenDataPrograms;

import java.util.Random;

public class MyBubbleSort {

	public static void main(String[] args) {
		int a[] = new int [20]; Random ran = new Random(11);
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.abs(ran.nextInt(500));
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		a=sort(a);
		System.out.println("sorted");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}

	private static int[] sort(int[] a) {
		boolean isSorted = false; int len = a.length-1;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < len ; i++) {
				if(a[i] > a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
				isSorted = false;
			}
			len--;
		}
		return a;
	}

}
