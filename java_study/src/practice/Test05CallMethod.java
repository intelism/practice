package practice;

public class Test05CallMethod {

	public Test05CallMethod() {
	}
	
	// 구구단 실행
	private void multiply(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				print(i + " x " + j + " = " + i*j);
			}
		}
	}
	
	private static int makePlus() {
		int sum = 0;
		for(int i=1;i<100;i++) {
			sum += i;
		}
		return sum;
	}
	
	private void print(String msg){
		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		// 클래스 생성(인스턴스 맴버)
		Test05CallMethod test = new Test05CallMethod();
		
		// 메소드 실행
		test.multiply();
		
		// makePlus()는 static으로 선언하여 인스턴스를 생성할 필요가 없다.)
		int result = Test05CallMethod.makePlus();
		
		// print()는 위에서 인스턴스를 생성하고 나서 사용할 수 있다.
		test.print("sum = "+result);
	}

}
