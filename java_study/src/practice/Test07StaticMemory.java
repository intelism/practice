package practice;

/**
 * 클래스 맴버와 인스턴스 맴버
 * [클래스 멤버]   : 클래스 변수(Static Field), 클래스 메소드
 * [인스턴스 멤버] : 인스턴스 변수(Non-Static-Field), 인스턴스 메소드
 */
public class Test07StaticMemory {
	
	// 클래스 변수
	private static int num = 99;
	private static String main = "i love you";
	
	// 인스턴스 변수
	private int a = 7;
	private String msg = "happy birth";
	
	public Test07StaticMemory(){
	}
	
	public static void main(String[] args) {
		
		// 인스턴스 생성
		Test07StaticMemory test1 = new Test07StaticMemory();
		Test07StaticMemory test2 = new Test07StaticMemory();
		
		// 각각 생성된 클래스의 메모리주소는 다르다.
		System.out.println(test1);
		System.out.println(test2);
		
		// static 변수는 직접접근 권장(Test07StaticMemory.num)
		System.out.println(test1.num);
		
		test1.num += 50;
		
		System.out.println(test1.num); // 변경된 값을 출력
		
		// 클래스주소는 다르지만 num은 static이므로 하나의 주소만 셋팅된다.
		System.out.println(test2.num);
		
		// static으로 선언한 변수는 클래스를 생성하지 않아도 접근 가능
		System.out.println(Test07StaticMemory.main);
		
		Test07StaticMemory.main = "me too";
		
		System.out.println(Test07StaticMemory.main);

	}

}
