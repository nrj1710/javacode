package nbhgfhj_jh;

public class Non_Static {

	public static void main(String[] args) {
		static int s1 =100;
		int n1 =90;
		show();
		System.out.println(s1);
		Example_Nonstatic e1 =new Example_NonStatic1();
		e1.display();
		System.out.println(e1.n1);

	}
public static void show() {
	System.out.println(s1);
	System.out.println(n1);
	System.out.println("show static method");
}
public void display() {
	System.out.println("display non static method");
}
}
