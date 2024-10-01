package com.comparetoex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer num1, Integer num2)
	{
		return num2-num1;
	}
	
}
public class CompareToEx {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>(Arrays.asList(5,2,8,1));
		Collections.sort(num, new MyComparator());
		
		System.out.println("Sorted number:- "+num);

	}

}
