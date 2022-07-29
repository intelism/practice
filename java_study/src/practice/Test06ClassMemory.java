package practice;

public class Test06ClassMemory {

	// 기본 생성자
	public Test06ClassMemory() {
	}

	public static void main(String[] args) {
		
		// 클래스 생성
		Test06ClassMemory test1 = new Test06ClassMemory();
		Test06ClassMemory test2 = new Test06ClassMemory();
		
		// 클래스 메모리 위치 확인
		System.out.println("test1 : "+test1);
		System.out.println("test2 : "+test2);
		
	}

}
