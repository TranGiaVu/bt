package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class QLLH {
	ArrayList<QLSV> dssv;

	public ArrayList<QLSV> getDssv() {
		return dssv;
	}

	public void setDssv(ArrayList<QLSV> dssv) {
		this.dssv = dssv;
	}

	public void nhapDssv() {
//		Scanner input = new Scanner(System.in);
		dssv = new ArrayList<>();
		String MSV = "";
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Ma sv: ");
			MSV = input.nextLine();
			if (MSV != "") {
				System.out.print("Ho: ");
				String ho = input.nextLine();
				System.out.print("ten: ");
				String ten = input.nextLine();
				System.out.print("Ngay sinh: ");
				String NS = input.nextLine();
				System.out.print("Gioi tinh : ");
				int gt = input.nextInt();
				System.out.print("Diem Trung Binh : ");
				double DTB = input.nextDouble();
				QLSV sv = new QLSV(MSV, ho, ten, NS, gt, DTB);
				dssv.add(sv);
			}
		} while (MSV != "");
	}

	public void xuatDssv() {
		if (dssv != null && dssv.size() > 0) {

//			using crtl + spacebar to gen foreach

			for (QLSV qlsv : dssv) {
				System.out.println(qlsv.toString());
			}
		}
	}

	public int thongKeGT(int GT) {
		int dem = 0;
		if (dssv != null && dssv.size() > 0) {

//			using crtl + spacebar to gen foreach

			for (QLSV qlsv : dssv) {
				if (qlsv.GT == GT)
					dem++;
			}
		}
		return dem;
	}

	public void thongKeNam() {
		System.out.println("Danh sach nay co " + thongKeGT(0) + " nam");
	}

	public void thongKeNu() {
		System.out.println("Danh sach nay co " + thongKeGT(1) + " nam");
	}

	public double maxDTB() {
		double max = 0;
		if (dssv != null && dssv.size() > 0) {

//			using crtl + spacebar to gen foreach

			for (QLSV qlsv : dssv) {
				if (max < qlsv.DTB)
					max = qlsv.DTB;
			}
		}
		return max;
	}

	public double minDTB() {
		double min = 10;
		if (dssv != null && dssv.size() > 0) {

//			using crtl + spacebar to gen foreach

			for (QLSV qlsv : dssv) {
				if (min > qlsv.DTB)
					min = qlsv.DTB;
			}
		}
		return min;
	}

	public double avgDTB() {
		double dtb = 0;
		if (dssv != null && dssv.size() > 0) {

//			using crtl + spacebar to gen foreach

			for (QLSV qlsv : dssv) {
				dtb += qlsv.DTB;
			}
			return dtb/dssv.size();
		}
		return 0;
	}
	
	public void xuatDTB() {
		
	}
}
