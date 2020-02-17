
public class NonStaticMembersDemp {

	int num;

	NonStaticMembersDemp() {
		System.out.println("Inside the constructor");
	}

	{
		System.out.println("Inside the non static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticMembersDemp();
		new NonStaticMembersDemp();
		new NonStaticMembersDemp();
	}

	static {
		System.out.println("Inside the static block");
	}
}
