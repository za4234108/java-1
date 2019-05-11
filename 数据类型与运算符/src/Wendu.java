//使用程序将华氏度转摄氏度(摄氏度=5/9.0*)华氏度-32
import java.util.*;
public class Wendu {
public static void main(String[] args) {
	
	//需要一个键盘输入温度的程序入口 input
	Scanner input=new Scanner(System.in);
	//声明一个double型的变量华氏度 f
	System.out.print("请输入华氏度：");
	double f=input.nextDouble();
	double sheShi=5/9.0*(f-32);//声明一个double型的变量摄氏度 sheShi
	System.out.println("摄氏度为:"+sheShi);
	
	
	
	
	}


}
