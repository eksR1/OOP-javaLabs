package lab2;

import java.util.Scanner;
public class Task4 {
	public static void main(String[] xd) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������ ���������� ������� ������ �������������� (x1, y1), "
				+ "(�2, y2), (x3, y3), (x4, y4). ����� ��� �������� � �������.");
		
		System.out.println("\n������� ���������� 1-�� �����: ");
		int X1 = sc.nextInt();
		int Y1 = sc.nextInt();
		
		System.out.println("������� ���������� 2-�� �����: ");
		int X2 = sc.nextInt();
		int Y2 = sc.nextInt();
		
		System.out.println("������� ���������� 3-�� �����: ");
		int X3 = sc.nextInt();
		int Y3 = sc.nextInt();
		
		System.out.println("������� ���������� 4-�� �����: ");
		int X4 = sc.nextInt();
		int Y4 = sc.nextInt();
		
		double a = Math.sqrt(Math.pow(X2-X1, 2) - Math.pow(Y2-Y1, 2));
		double b = Math.sqrt(Math.pow(X4-X3, 2) - Math.pow(Y4-Y3, 2));
		double P = 2 * (a + b);
		double S = a * b;
		System.out.println("�������� = " + P);
		System.out.println("������� = " + S);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
