package OOP;

public class QLSV {
	String MSV, ho, ten, NS;
	int GT;
	double DTB;

	public String getMSV() {
		return MSV;
	}

	public void setMSV(String mSV) {
		MSV = mSV;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNS() {
		return NS;
	}

	public void setNS(String nS) {
		NS = nS;
	}

	public int getGT() {
		return GT;
	}

	public void setGT(int gT) {
		GT = gT;
	}

	public double getDTB() {
		return DTB;
	}

	public void setDTB(double dTB) {
		DTB = dTB;
	}

//	sorce --> gen constructor using field

	public QLSV(String mSV, String ho, String ten, String nS, int gT, double dTB) {
		super();
		MSV = mSV;
		this.ho = ho;
		this.ten = ten;
		NS = nS;
		GT = gT;
		DTB = dTB;
	}
	
//	gen tostring by ctrl+spacebar

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s %s %f", MSV,ho,ten,DTB);
	}
}
