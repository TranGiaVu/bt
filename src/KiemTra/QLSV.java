package KiemTra;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
	ArrayList<SV> dssv;

	public ArrayList<SV> getDssv() {
		return dssv;
	}

	public void setDssv(ArrayList<SV> dssv) {
		this.dssv = dssv;
	}

	public void nhapDssv() {
		dssv = new ArrayList<>();
		String MSV = "";
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Ma sv: ");
			MSV = input.nextLine();
			if (MSV != "") {
				System.out.print("ten: ");
				String ten = input.nextLine();
				System.out.print("Diem Trung Binh : ");
				double DTB = input.nextDouble();
				SV sv = new SV(MSV, ten, DTB);
				dssv.add(sv);
			}
		} while (MSV != "");
	}

	public void xuatDssv() {
		if (dssv != null && dssv.size() > 0) {
			for (SV qlsv : dssv) {
				System.out.println(qlsv.toString());
			}
		}
	}

	public void xuatDTB() {
		if (dssv != null && dssv.size() > 0) {
			for (SV qlsv : dssv) {
				System.out.println(qlsv.DTB);
			}
		}
	}

	public void svGioi() {
		if (dssv != null && dssv.size() > 0) {
			for (SV qlsv : dssv) {
				if (qlsv.DTB >= 8)
					System.out.println(qlsv.toString());
			}
		}
	}

	public void timKiemSv(String ten) {
		if (dssv != null && dssv.size() > 0) {
			for (SV qlsv : dssv) {
				if (qlsv.ten == ten)
					System.out.println(qlsv.toString());
			}
		}
	}

	public void xoaSV(String MSV) {
		int size = dssv.size();
		for (SV qlsv : dssv) {
			if (qlsv.MSV == MSV) {
				qlsv = null;
				break;
			}
		}
	}
	public void sapXepSv() {
		for(int i = 0; i < dssv.size(); i++) {

		}
	}
	
}
