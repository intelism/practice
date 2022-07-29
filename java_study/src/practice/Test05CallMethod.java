package practice;

public class Test05CallMethod {

	public Test05CallMethod() {
	}
	
	// ������ ����
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
		
		// Ŭ���� ����(�ν��Ͻ� �ɹ�)
		Test05CallMethod test = new Test05CallMethod();
		
		// �޼ҵ� ����
		test.multiply();
		
		// makePlus()�� static���� �����Ͽ� �ν��Ͻ��� ������ �ʿ䰡 ����.)
		int result = Test05CallMethod.makePlus();
		
		// print()�� ������ �ν��Ͻ��� �����ϰ� ���� ����� �� �ִ�.
		test.print("sum = "+result);
	}

}
