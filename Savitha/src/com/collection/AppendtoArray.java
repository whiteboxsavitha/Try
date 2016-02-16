package com.collection;

public class AppendtoArray {

	public static void addItemstoarray(String[] a)
	{
		
		String b[] = {"b1","b2","b3","b4","b5","b6"};
	System.out.println("Displaying Array elements");
	for(int j =0;j<a.length;j++){
			System.out.print(a[j] + ",");
			System.out.print(b[j]+ ",");
			}
		}
	public static void main(String[] args) {
		
		String[] a = {"a1", "a2" , "a3" , "a4" , "a5", "a6"};
		
		AppendtoArray.addItemstoarray(a);
		
		
	}

}
