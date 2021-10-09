package by.training.jwd.mavenex;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// Составить программу для вычисления значений функции F(x) на отрезке [а, b]
		//с шагом h. Результат представить в виде таблицы, первый столбец которой –
		//значения аргумента, второй - соответствующие значения функции
		
		startMassage();
		
		double a = enterNumA();
		double b = enterNumB();
		double h = enterNumH();
		
		print(a, b, h);
		
	}
	
	public static double comput(double x) {
		
		double y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
		
		return y;
	}
	
	public static double print (double a, double b, double h) {
		
		double testVar = (b - a) / h;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for(double x = a; x <=b; x = x + h) {
			double y = comput(x);
		System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
		
		return testVar;
		
	}
	
	public static void startMassage() {
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Для вывода результата необходимо указать диапазон отрезка [a, b], а также размер шага [h]");
		System.out.println("-----------------------------------------------------------------------------------------");
	}
	
	public static double enterNumA() {
		double num;
		while(true) {
			System.out.println("Введите число a: ");
			
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				num = sc.nextDouble();
				break;
			}
			else{
				System.out.print("Некорректное значение, повторите!  ");
			}
		}
		return num;
		
	}
	
	public static double enterNumB() {
		double num;
		while(true) {
			System.out.println("Введите число b: ");
			
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				num = sc.nextDouble();
				break;
			}
			else{
				System.out.print("Некорректное значение, повторите!  ");
			}
		}
		return num;
		
	}
	
	public static double enterNumH() {
		double num;
		while(true) {
			System.out.println("Введите число h: ");
			
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				num = sc.nextDouble();
				break;
			}
			else{
				System.out.print("Некорректное значение, повторите!  ");
			}
		}
		return num;		
	}

}
