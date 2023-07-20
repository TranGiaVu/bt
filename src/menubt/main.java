package menubt;

import java.util.Scanner;

import OOP.*;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
//		menu();
//		Point p = new Point();
//		Point p2 = new Point(10, 5);
//		Point p3 = new Point(p2);
//		System.out.println("p = " + p.toString() + "; p2 = " + p2.toString() + "; p3 = " + p3.toString());
//		double dpp2 = p.distance(p2);
//		double dp2p = p2.distance(p);
//		System.out.println(dpp2 + " = " + dp2p);
//		double dpp3 = Point.distance(p, p3);
//		System.out.println(dpp3);
		QLLH lop = new QLLH();
		lop.nhapDssv();
		lop.xuatDssv();
	}

	static void menu() {
		Scanner input = new Scanner(System.in);
		int slted = 0;
		do {
			System.out.println("[1]	Phuong trinh bac 2");
			System.out.println("[2]	Giai thua");
			System.out.println("[3]	Tim Fibonacci thu n");
			System.out.println("[4]	Tim UCLN va BCNN");
			System.out.println("[5]	Liet ke so nguyen to nho hon n");
			System.out.println("[6]	Liet ke n so nguyen to dau tien");
			System.out.println("[7]	Liet ke tat ca cac so nguyen to co 5 chu so");
			System.out.println("[8]	Tinh tong cac chu so cua 1 so nguyen");
			System.out.println("[9]	Liet ke so thuan nghich co 6 chu so");
			System.out.println("[10]	Tinh Max, Min, Average cua mang");
			slted = input.nextInt();
			switch (slted) {
			case 1:
				c1();
				break;
			case 2:
				c2();
				break;
			case 3:
				c3();
				break;
			case 4:
				c4();
				break;
			case 5:
				c5();
				break;
			case 6:
				c6();
				break;
			case 7:
				c7();
				break;
			case 8:
				c8();
				break;
			case 9:
				c9();
				break;
			case 10:
				c10();
				break;
			}

		} while (slted != 0);
		input.close();
	}

	static void c1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap he so a:");
		float a = input.nextFloat();
		System.out.print("Nhap he so b:");
		float b = input.nextFloat();
		System.out.print("Nhap he so c:");
		float c = input.nextFloat();
		MathBasic.PhuongTrinhbac2(a, b, c);
		input.close();
	}

	static void c2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n:");
		int n = input.nextInt();
		long gt = MathBasic.Giaithua(n);
		System.out.print(n + "! =" + gt);
		input.close();

	}

	static void c3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n:");
		int n = input.nextInt();
		System.out.println("Fibo(" + n + ") = " + MathBasic.fibonacci(n));
		input.close();
	}

	static void c4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so a:");
		int a = input.nextInt();
		System.out.print("Nhap so b:");
		int b = input.nextInt();
		System.out.println("UCLN của " + a + " và " + b + " là: " + MathBasic.UCLN(a, b));
		System.out.println("BCNN của " + a + " và " + b + " là: " + MathBasic.BCNN(a, b));
	}

	static void c5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n:");
		int n = input.nextInt();
		System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
		if (n >= 2) {
			System.out.print(2);
		}
		for (int i = 3; i < n; i += 2) {
			if (MathBasic.lasonguyento(i)) {
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}

	static void c6() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n:");
		int n = input.nextInt();
		System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
		int dem = 0;
		int i = 2;
		while (dem < n) {
			if (MathBasic.lasonguyento(i)) {
				System.out.print(i + " ");
				dem++;
			}
			i++;
		}
	}

	static void c7() {
		int count = 0;
		System.out.println("Liệt kê tất cả số nguyên tố có 5 chữ số:");
		for (int i = 10001; i < 99999; i += 2) {
			if (MathBasic.lasonguyento(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Tổng các số nguyên tố có 5 chữ số là: " + count);
	}

	static void c8() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n:");
		int n = input.nextInt();
		System.out.println("Tong cac chu so nguyen cua " + n + " la: " + MathBasic.tong1songuyen(n));
	}

	static void c9() {
		int count = 0;
		System.out.println("Liệt kê tất cả số thuan nghich co 6 chữ số:");
		for (int i = 100001; i < 999999; i += 2) {
			if (MathBasic.lasonguyento(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Tổng các số thuan nghich co 6 chữ số là: " + count);
	}

	static void c10() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = input.nextInt();
		double[] arr = new double[n];
		System.out.print("Nhập các phần tử của mảng: \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = input.nextInt();
		}
		System.out.print("Các phần tử của mảng: ");
		MathBasic.showMang(arr);
		System.out.println();
		System.out.println("phan tu Min cua mang tren la : " + MathBasic.Min(arr));
		System.out.println("phan tu Max cua mang tren la : " + MathBasic.Max(arr));
		System.out.println("Avarage cua mang tren la : " + MathBasic.Avg(arr));
	}

}

class MathBasic {
	public static void PhuongTrinhbac2(float a, float b, float c) {
		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					System.out.println("Phuong trinh vo so nghiem");
				else
					System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong trinh co 1 nghiem la: " + -c / b);
			}
		} else {
			float delta = b * b - 4 * a * c;
			if (delta < 0)
				System.out.println("Phuong trinh vo nghiem");
			else if (delta == 0)
				System.out.println("Phuong trinh co nghiem kep la :" + -b / (2 * a));
			else {
				double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
				double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
				System.out.println("Phuong trinh co 2 nghiem la: x1 = " + x1 + "; x2 = " + x2);
			}
		}
	}

	public static long Giaithua(int n) {
		long giai_thua = 1;
		if (n == 0 || n == 1) {
			return giai_thua;
		} else {
			for (int i = 2; i <= n; i++) {
				giai_thua *= i;
			}
			return giai_thua;
		}
	}

	public static int fibonacci(int n) {
		int f0 = 0;
		int f1 = 1;
		int fn = 1;

		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			for (int i = 2; i < n; i++) {
				f0 = f1;
				f1 = fn;
				fn = f0 + f1;
			}
		}
		return fn;
	}

	public static int UCLN(int a, int b) {
		if (b == 0)
			return a;
		return UCLN(b, a % b);
	}

	public static int BCNN(int a, int b) {
		return (a * b) / UCLN(a, b);
	}

	public static boolean lasonguyento(int n) {
		if (n < 2) {
			return false;
		}
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int tong1songuyen(int n) {
		int total = 0;
		do {
			total = total + n % 10;
			n = n / 10;
		} while (n > 0);
		return total;
	}

	public static boolean isThuanNghich(int n) {
		List<Integer> listNumbers = new ArrayList<>();
		do {
			listNumbers.add(n % 10);
			n = n / 10;
		} while (n > 0);
		int size = listNumbers.size();
		for (int i = 0; i < (size / 2); i++) {
			if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static double Max(double[] arr) {
		double m = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (m < arr[i])
				m = arr[i];
		return m;
	}

	public static double Min(double[] arr) {
		double m = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (m > arr[i])
				m = arr[i];
		return m;
	}

	public static double Avg(double[] arr) {
		double s = 0;
		for (int i = 0; i < arr.length; i++)
			s += arr[i];
		return s;
	}

	public static void showMang(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
