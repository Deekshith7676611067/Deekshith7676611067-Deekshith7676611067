package com.Java8GradedAssignment;

import java.util.Arrays;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayofNumbers[]= {1,2,3,4,5};
		int sum=Arrays.stream(arrayofNumbers).filter(n->(n%2!=0)).map(n-> n*n).sum();
		System.out.println(sum);
	}

}
