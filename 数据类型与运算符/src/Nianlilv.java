//���뱾�� �����һ�� ����  ���� ����ı�Ϣ�ֱ��Ƕ���
import java.util.*;
public class Nianlilv {
	public static void main(String[]args){
		//��Ҫ���û���һ������¼�뱾������ input
		Scanner input=new Scanner(System.in);
		System.out.print("�����뱾��");
		int benJin=input.nextInt();//����int�͵ı������� benJin
		
		//һ����Ϣ liXi1(����2.25%)
		double liXi1=benJin*0.0225*1;
		//������Ϣ liXi2(����2.7%)
		double liXi2=benJin*0.027*2;
		//������Ϣ liXi3������3.24��
		double liXi3=benJin*0.324*3;
		//������Ϣ liXi5(����3.6%)
		double liXi5=benJin*0.036*5;
		
		double benXi1=liXi1+benJin;
		double benXi2=liXi2+benJin;
		double benXi3=liXi3+benJin;
		double benXi5=liXi5+benJin;
		
		System.out.println("����һ���ı�Ϣ��"+benXi1);
		System.out.println("���������ı�Ϣ��"+benXi2);
		System.out.println("���������ı�Ϣ��"+benXi3);
		System.out.println("���������ı�Ϣ��"+benXi5);
		
		
		
		
		
		
	}

}
