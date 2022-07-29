package practice;

public class Test03Constructor {

	// 기본 생성자(클래스명과 동일)
	public Test03Constructor() {
		System.out.println("run default Constructor");
	}
	
	// 파라미터 변수를 포함한 생성자
	public Test03Constructor(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		// main 메소드 실행
		System.out.println("run main method");
		
		// 클래스 생성(인스턴스 맴버)
		Test03Constructor test1 = new Test03Constructor();
		Test03Constructor test2 = new Test03Constructor("this is message");
		
	}

}
