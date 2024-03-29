package encapsulation;

public class RectangleTest {
	public static void main(String[] args) {
		System.out.println("**Encapsulation **");

		Rectangle rt= new Rectangle(20,40);

		rt.setLength(50);

		rt.setBreadth(60);

		int p=rt. getLength();

		int q=rt.getBreadth();

		int newArea=p*q;


		System.out.println("New Area : "+newArea);

	}

	

}
