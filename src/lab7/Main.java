package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int choose = -1;
		while (choose != 0) {
			System.out.println("Введите номер задания, для выхода введите 0");
			//Проверка правильности ввода задания
			try {
				choose = in.nextInt();
			} catch (Exception e) {
				in.nextLine();
				System.out.println("\nПожалуйста вводите номер заданий от 0 до 4. \n");
			}
			
			switch (choose) {
			case 1: choose = 1;
			//Проверка правильности ввода числа для факториала, число ли это и не меньше ли 0
			try {
				int f = 0;
				Factorial fact = new Factorial();
				System.out.println("Введите число:");
				f = in.nextInt();
				
				if (f < 0) {
					throw new InputMismatchException();
				}
				
				System.out.println("Факториал =  " + fact.getFact(f));
			} catch (InputMismatchException e) {
				in.nextLine();
				System.out.println("\nПожалуйста вводите только положительные числа. \n");
				break;
			}
				break;

			case 2: choose = 2;
				System.out.println("Введите строку");
				in.nextLine();
				String  strk = in.nextLine(); 
				Line str = new Line();
				int a = 0, b = 0;
				// Проверка ввода числовых данных
				try {
					System.out.println("Введите индекс начального элемента новой подстроки");
					a = in.nextInt();
					System.out.println("Введите сколько элементов вывести");
					b = in.nextInt();
					System.out.println("\nРезультат: \n" + str.getLine(a, b, strk));
				} catch (Exception e) {
					System.out.println("Введены неверные данные");
					in.nextLine();
					break;
				}	
				break; 
				
			case 3: choose = 3;
				Matrix matrix = new Matrix();
				int n = 0, m = 0;
				// Проверка ввода числовых данных
				try {
					System.out.println("Введите размер матрицы n x m");
					n = in.nextInt();
					m = in.nextInt();
				} catch (Exception e) {
					System.out.println("Введены неверные размеры матрицы");
					in.nextLine();
					break;
				}
			
				int[][] mas = new int[n][m];
				//Проверка ввода элементов матрицы
				try {
				for (int i = 0; i < mas.length; i++) {
					for (int j = 0; j < mas.length; j++) {
						System.out.print("El. № " + "[" + i + "]" + "[" + j + "]" + " = ");
							mas[i][j] = in.nextInt();
							}
							}
						} catch (Exception e) {
							System.out.println("Введены неверные значения элементов матрицы");
							in.nextLine();
							break;
						}	
				
				System.out.println();
				System.out.println("Ваша матрица: \n");
				for (int i = 0; i < mas.length; i++) {
					for (int j = 0; j < mas.length; j++) {
						System.out.print(mas[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println("\nСедловые точки:");
				matrix.getSaddlePoint(mas);
				break;
				
			case 4: choose = 4;
				Angles angles = new Angles();
			
				int k = 0;
				n = 0;
				// Проверка выбора и ввода числовых данных
				try {
					System.out.println("Для работы с углами представленных в градусах введите 1, для радиан введите 2");
					k = in.nextInt();
					
					if (k != 1 && k!= 2) {
						throw new Exception();
					}
					
					System.out.println("Введите размер массива углов");
					n = in.nextInt();
				
				} catch (Exception e) {
					System.out.println("Введены неверные данные \nВызваное исключение: \n" + e);
					in.nextLine();
					break;
				}
				
				double[] ang = new double[n];
				// Проверка ввода элементов массива
				try {
					System.out.println("Введите массив углов");
					for (int i = 0; i < ang.length; i++) {
						//ang[i] = (int) Math.round((Math.random() * 30) - 15); // Рандомные числа
						ang[i] = in.nextDouble();
					}
				} catch (Exception e) {
					System.out.println("Введен неверный элемент массива углов\nВызваное исключение: \n" + e);
					in.nextLine();
					break;
				}

			
				System.out.println("Массив:");
				for (int i = 0; i < ang.length; i++) {
					System.out.print(ang[i] + " | ");
				}
				System.out.println();
			
				System.out.println("Сумма синусов: \n" + angles.getSumSin(ang, k));
				System.out.println("Сумма косинусов: \n" + angles.getSumCos(ang, k));
				System.out.println("Разность синусов: \n" + angles.getDiffSin(ang, k));
				System.out.println("Разность косинусов: \n" + angles.getDiffCos(ang, k));
				System.out.println("Произведение синусов: \n" + angles.getCompSin(ang, k));
				System.out.println("Произведение косинусов: \n" + angles.getCompCos(ang, k));

				break;
			}
		}
 	}
}

