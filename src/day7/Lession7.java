package day7;

import java.util.Arrays;
import java.util.Iterator;

public class Lession7 {

	public static void main(String[] args) {
		int[] arr = new int[5]; //khai báo 1 mảng kiểu số nguyên có 5 phần tử
		//arr[0] = 11;
		//arr[1] = 13;
		//arr[2] = 12;
		//arr[3] = 14;
		//arr[4] = 15;
		//arr[5] = 15; lỗi cho vượt quá chiều dài mảng
		for (int i = 0; i < arr.length; i++) { //arr.length lấy ra chiều dài của mảng
			System.out.println(arr[i]);
		}
		
		
		/*
		int[] arr1 = {31, 32, 33};
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("-----foreach áp dụng trong trường hợp mảng-----");
		for (int i : arr1) {
			System.out.println(i);
		}
		*/
		
		 int[] arr2 = {15, 5, 10, 25, 30};
		 System.out.println(Arrays.toString(arr2)); //[15, 5, 10, 30, 25]
		// Sắp xếp các giá trị của mảng tăng dần
	     //Arrays.sort(arr2); //sắp xếp tăng dần
	     //System.out.println(Arrays.toString(arr2)); //[5, 10, 15, 25, 30]
	     int index = Arrays.binarySearch(arr2, 30);//tìm kiếm index(chỉ mục) của 1 số
	     System.out.println(index);
	     Arrays.fill(arr2, 25);//gán cùng 1 giá trị cho tất cả phần tử trong mảng
	     System.out.println(Arrays.toString(arr2));
	     
	     int[][] arr3 = new int[2][3];//[dòng][cột]
	     arr3[0][0] = 3;
	     arr3[0][1] = 5;
	     arr3[0][2] = 4;
	     arr3[1][0] = 6;
	     arr3[1][1] = 8;
	     arr3[1][2] = 7;
	     
	     for (int i = 0; i < arr3.length; i++) {//i = dòng
	    	 for (int j = 0; j < arr3[i].length; j++) {//arr3[0].length = 3		arr3[1].length = 3
	    		 System.out.print(arr3[i][j] + " ");
	    	 }
		}
	    //chỉ cần biết chiều dài của dòng đó -->số cột
	    System.out.println("------");
	    int[][] arr4 = {{3, 5, 4}, {6, 8, 7}}; //1 {} tương ứng với 1 dòng
	    for (int i = 0; i < arr4.length; i++) {//i = dòng
	    	 for (int j = 0; j < arr4[i].length; j++) {//arr4[0].length = 3
	    		 System.out.print(arr4[i][j] + " ");
	    	 }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
