package practice;

public class Test03Constructor {

	// �⺻ ������(Ŭ������� ����)
	public Test03Constructor() {
		System.out.println("run default Constructor");
	}
	
	// �Ķ���� ������ ������ ������
	public Test03Constructor(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		// main �޼ҵ� ����
		System.out.println("run main method");
		
		// Ŭ���� ����(�ν��Ͻ� �ɹ�)
		Test03Constructor test1 = new Test03Constructor();
		Test03Constructor test2 = new Test03Constructor("this is message");
		
	}

}
