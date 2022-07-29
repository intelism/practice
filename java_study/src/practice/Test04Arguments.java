package practice;

public class Test04Arguments {

	public Test04Arguments() {
	}
	
	/**
	 * 자바 실행시 전달자(arguments)는 공백(space)로 구분하여 입력한다.
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
