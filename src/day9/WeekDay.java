package day9;

//Cách 3: khai báo enum ở 1 file riêng biệt
public enum WeekDay {
	/*
	 * String

1. Tính nguyên thủy (String Literal)
+ Có thể khởi tạo bằng cách -->String str = "Hello World";
+ Lưu trong stack(Common Pool)
+ 2 String có nội dung giống nhau lưu chung 1 vùng nhớ




2. Tính đối tượng
+ Có thể khởi tạo bằng cách -->String str = new String("Hello World"); //khi sử dụng toán tử new thì 1 vùng nhớ mới sẽ đc cấp phát
+ Lưu trong Heap
+ 2 String có nội dung giống nhau lưu trên 2 vùng nhớ nhác nhau


String có 2 kiểu so sánh
+ == -->so sánh địa chỉ vùng nhớ
+ equals -->so sánh nội dung
	 */
	MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5),
	FRIDAY(6), SATURDAY(7), SUNDAY(1);

	private int value;

	WeekDay(int value) {
		this.value = value;
	}

	public static WeekDay getWeekDayByValue(int value) {
		for (WeekDay d : WeekDay.values()) {
			if (d.value == value) {
				return d;
			}
		}
		return null;
	}

}
