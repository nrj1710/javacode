package nbhgfhj_jh;

public class Return_Type {

	public static void main(String[] args) {
	add(100,200);
	add(50,20);
    // display("niraj");
     String str1= "java";
     System.out.println(str1.length());
	}
	static int add(int x, int y) {
		//void//int x=100;
		//int y =200;
		//System.out.println("sum" +(x+y));
		return x+y;
	}
	
	static void display(String str) {
		System.out.println(str);
	}

}
