//输入本金 计算存一年 两年  三年 五年的本息分别是多少
import java.util.*;
public class Nianlilv {
	public static void main(String[]args){
		//需要给用户开一个键盘录入本金的入口 input
		Scanner input=new Scanner(System.in);
		System.out.print("请输入本金：");
		int benJin=input.nextInt();//声明int型的变量本金 benJin
		
		//一年利息 liXi1(利率2.25%)
		double liXi1=benJin*0.0225*1;
		//两年利息 liXi2(利率2.7%)
		double liXi2=benJin*0.027*2;
		//三年利息 liXi3（利率3.24）
		double liXi3=benJin*0.324*3;
		//五年利息 liXi5(利率3.6%)
		double liXi5=benJin*0.036*5;
		
		double benXi1=liXi1+benJin;
		double benXi2=liXi2+benJin;
		double benXi3=liXi3+benJin;
		double benXi5=liXi5+benJin;
		
		System.out.println("存入一年后的本息是"+benXi1);
		System.out.println("存入两年后的本息是"+benXi2);
		System.out.println("存入三年后的本息是"+benXi3);
		System.out.println("存入五年后的本息是"+benXi5);
		
		
		
		
		
		
	}

}
