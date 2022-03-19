package day9;

//Cách 2: khai báo enum bên ngoài class, ko đc khai báo access-modifier
//enum WeekDay {
//MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
//}

public class Lession91 {
	// Cách 1: khai báo enum bên trong 1 class, bên ngoài các phương thức
	// enum WeekDay {
	// MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	// }

	public static void main(String[] args) {
		//int a = 10;
		//WeekDay d = WeekDay.TUESDAY;
        //System.out.println(d);
        int s = s(1,2);
        for (WeekDay d : WeekDay.values()) {
        //muốn xem giá trị của một phương thức sau khi chạy -->bôi đen phương thức và nhấn Ctrl + Shift + I 
           System.out.println(d);
        }
        
        System.out.println("----------------");
        WeekDay d1 = WeekDay.getWeekDayByValue(6);
        System.out.println(d1);
        
        		
        

	}

	public static int s(int a, int b) {
		return a + b;
	}

}
