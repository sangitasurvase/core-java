package encapsulation;

public class Rectangle {
	private int Length;
	private int Breadth;

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		this.Length = length;
	}

	public int getBreadth() {
		return Breadth;
	}

	public void setBreadth(int breadth) {
		this.Breadth = breadth;
	}

	public Rectangle(int lnt,int bth) {
		Length=lnt;

		Breadth=bth;

		int Area=Length*Breadth;

		System.out.println("Area: " +Area);
	}

}
