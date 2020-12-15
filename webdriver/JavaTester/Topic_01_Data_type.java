package JavaTester;

import java.util.ArrayList;
import java.util.List;

public class Topic_01_Data_type {
	//1-Kiểu dữ liệu nguyên thủy: primitive
	//Ký tự
	//char
	char key = 'A';
	
	//Số nguyên: không có phần thập phân
	//byte
	byte numberByte = 127;
	
	//short
	short numberShort = 6500;
	
	//int
	int numberInt = 65000;
	
	//long
	long numberLong = 34543958;
	
	//Số thực: có phần thập phân
	//float
	float numberFloat = 15.65F;
	
	//double
	double numberDouble = 56.33D;
	
	//Boolean - 2 giá trị: True / False
	boolean status = true;
	
	//2-Kiểu dữ liệu tham chiếu: reference
	//String
	String address = "123 duong A";
	
	//Array
	String addresses[] = {"a", "b"};
	int numbers[] = {1,2,3};
	//Class
	Topic_01_Data_type topic01 = new Topic_01_Data_type();
	
	//Object
	Object a = new Object();
	
	//Collection (Set / List / Queue)
	List<String> add = new ArrayList<String>(); // thư viện util
	
}
