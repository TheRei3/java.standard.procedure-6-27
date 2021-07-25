package ex6no27;

public class ex6no27 {  //  303p
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public ex6no27() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("ex6no27 ex = new ex6no27();");
		ex6no27 ex = new ex6no27();
		
		System.out.println("ex6no27 ex2 = new ex6no27();");
		ex6no27 ex2 = new ex6no27();
	}

}
