package menubt;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		menu();
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
			System.out.println("[7]	Liet ke tat ca cac so nguyen");
			System.out.println("[8]	Tinh tong cac chu so cua 1 so");
			System.out.println("[9]	Liet ke so thuan nghich co ");
			System.out.println("[10]	Tinh Max, Min, Average cua ");
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

	}

	static void c8() {

	}

	static void c9() {

	}

	static void c10() {

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
}
