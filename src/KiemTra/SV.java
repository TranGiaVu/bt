package KiemTra;

import java.util.ArrayList;
import java.util.Scanner;

public class SV {
	String MSV, ten;
	double DTB;

	public String getMSV() {
		return MSV;
	}

	public void setMSV(String mSV) {
		MSV = mSV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getDTB() {
		return DTB;
	}

	public void setDTB(double dTB) {
		DTB = dTB;
	}

	public SV(String mSV, String ten, double dTB) {
		super();
		MSV = mSV;
		this.ten = ten;
		DTB = dTB;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s %s %f", MSV, ten, DTB);
	}
}
