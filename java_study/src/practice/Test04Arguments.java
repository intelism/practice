package practice;

public class Test04Arguments {

	public Test04Arguments() {
	}
	
	/**
	 * �ڹ� ����� ������(arguments)�� ����(space)�� �����Ͽ� �Է��Ѵ�.
	 * >java TestArguments my name is john
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("print argument");
		
		if(args != null){
			String fullstr = "";
			for(String arg : args){
				System.out.println(arg);
				fullstr += arg + " ";
			}
			System.out.println("fullstr : "+fullstr);
			System.out.println("args count : "+args.length);
		}
	}

}
