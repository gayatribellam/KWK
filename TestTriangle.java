
public class TestTriangle {

	public static void main(String[] args) throws IllegalTriangleException {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(3,5,9);
		t.setColor("yellow");
		t.setFilled(true);
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
		System.out.println(t.getColor());
	}

}
