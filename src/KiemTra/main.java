package KiemTra;

import java.util.Scanner;
import KiemTra.*;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	static void menu() {
		Scanner input = new Scanner(System.in);
		int slted = 0;
		QLSV sv = new QLSV();
		do {
			System.out.println("1. Tạo danh sách sinh viên.");
			System.out.println("2. Hiển thị danh sách tất cả các sinh viên.");
			System.out.println("3. Hiển thị điểm trung bı̀nh của tất cả sinh viên");
			System.out.println("4. Hiển thị danh sách sinh viên đạt loại giỏi trở lên(từ 8 điểm trở lên)");
			System.out.println("5. Tı̀m kiếm sinh viên theo tên.");
			System.out.println("6. Xóa sinh viên khỏi danh sách.");
			System.out.println("7. Sắp xếp danh sách sinh viên theo thứ tự tăng dần của Mã sinh viên");
			System.out.println("8. Thoát khỏi chương trı̀nh");
			slted = input.nextInt();
			switch (slted) {
			case 1:
				sv.nhapDssv();
				break;
			case 2:
				sv.xuatDssv();
				break;
			case 3:
				sv.xuatDTB();
				break;
			case 4:
				sv.svGioi();
				break;
			case 5:
				Scanner scan = new Scanner(System.in);
				System.out.print("nhập tên sinh viên cần tìm : ");
				String ten = scan.nextLine();
				sv.timKiemSv(ten);
				scan.close();
				break;
			case 6:
				Scanner in = new Scanner(System.in);
				System.out.print("nhập mã sinh viên cần xóa : ");
				String MSV = in.nextLine();
				sv.xoaSV(MSV);
				in.close();
				break;
//			case 7:
//				c7();
//				break;
			case 8:
				slted = 0;
			}
		}while (slted != 0);
		input.close();
	}

}
