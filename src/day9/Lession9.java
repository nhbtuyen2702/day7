package day9;

public class Lession9 {

	public static void main(String[] args) {
		
		String str10 = "HelloWorld";
		str10.substring(5); //HelloWorld
		System.out.println(str10);
		
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.append("World");//HelloWorld
		System.out.println(stringBuilder);
		
		StringBuffer stringBuffer = new StringBuffer("Hello");
		stringBuffer.append("World");//HelloWorld
		System.out.println(stringBuffer);
		
		//chuỗi thành số
		//String str = "123";
		
		//Cách 1
		//int numInt = Integer.parseInt(str);
		//float numFloat = Float.parseFloat(str);
		//double numDouble = Double.parseDouble(str);
		
		//Cách 2
		//int numInt = Integer.valueOf(str);
		//float numFloat = Float.valueOf(str);
		//double numDouble = Double.valueOf(str);
		
		//số thành chuỗi
		//int numInt = 123;
		
		//Cách 1
		//String str = "" + numInt;
		
		//Cách 2
		//String str = String.valueOf(numInt);
		
		//Cách 3
		//String str = Integer.toString(numInt);
		//System.out.println(str);
		
		
		String s1 = "Hello"; 
		String s2 = "Hello"; 
		String s3 = s1;
		
		String s4 = new String("Hello"); 
		String s5 = new String("Hello");
		String s6 = s5;
		
		boolean c1 = s1 == s1; 
		boolean c2 = s1 == s2; 
		boolean c3 = s1 == s3; 
		boolean c4 = s1 == s4;
		boolean c5 = s4 == s5;
		
		boolean c6 = s1.equals(s3); 
		boolean c7 = s1.equals(s4); 
		boolean c8 = s4.equals(s5);
		
		boolean c9 = s6 == s5;//true
		System.out.println();
		
		String s7 = " WorldHello,HeWorldHeWorld,World      ";
		char c = s7.charAt(5);//trả về ký tự tương ứng với index
		String s10 = s7.concat("World");//nối chuỗi s7 với chuỗi trong ngoặc
		int index = s7.indexOf("He");//kiểm tra từ trái sang phải xem vị trí khớp với chuỗi "He"
		index = s7.lastIndexOf("He");//kiểm tra từ phải sang trái xem vị trí khớp với chuỗi "He"
		int length = s7.length();//trả về chiều dài của chuỗi
		String s11 = s7.replace('W', '1');//thay thế ký tự 
		String s12 =s7.replaceFirst("World", "Class"); //thay thế chuỗi World đầu tiên bằng Class
		String s13 =s7.replaceAll("World", "Class");//thay thế tất cả chuỗi World đầu tiên bằng Class
		String[] strArr = s7.split(","); //cắt chuỗi theo ,
		boolean s14 = s7.startsWith("World");//trả về true hoặc false
		s7.substring(5);//tạo ra chuỗi mới bắt đầu từ index 5 của s7
		s7.substring(5, 10);//tạo ra chuỗi mới bắt đầu từ index 5 và kết thúc tại index 10 của s7
		s7.toLowerCase();//chuyển thành chữ thường
		s7.toUpperCase();//chuyển thành chữ hoa
		s7.trim();//bỏ khoảng trắng 2 đầu
		
		System.out.println();
		
		

		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
