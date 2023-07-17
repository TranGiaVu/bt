package OOP;

public class Point {
	private int x, y;

//	sorce --> getter n setter

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point() {
		x = y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	@Override
	public String toString() {
		return String.format("Point[x=%d,y=%d]", x, y);
	}

//	khoang cach tu goc den toa do
	public double distance() {
		return Math.sqrt(x * x + Math.pow(y, 2));
	}

//	khoang cach den diem p bat ky
	public double distance(Point p) {
		double d = Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2);
		return Math.sqrt(d);
	}
//	tinh khoang cach bang huong thu tuc
	public static double distance(Point a, Point b) {
		double d = Math.pow(a.x - b.x, 2)+Math.pow(a.y - b.y, 2);
		return Math.sqrt(d);
	}
}
