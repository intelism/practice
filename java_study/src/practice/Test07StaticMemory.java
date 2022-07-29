package practice;

/**
 * Ŭ���� �ɹ��� �ν��Ͻ� �ɹ�
 * [Ŭ���� ���]   : Ŭ���� ����(Static Field), Ŭ���� �޼ҵ�
 * [�ν��Ͻ� ���] : �ν��Ͻ� ����(Non-Static-Field), �ν��Ͻ� �޼ҵ�
 */
public class Test07StaticMemory {
	
	// Ŭ���� ����
	private static int num = 99;
	private static String main = "i love you";
	
	// �ν��Ͻ� ����
	private int a = 7;
	private String msg = "happy birth";
	
	public Test07StaticMemory(){
	}
	
	public static void main(String[] args) {
		
		// �ν��Ͻ� ����
		Test07StaticMemory test1 = new Test07StaticMemory();
		Test07StaticMemory test2 = new Test07StaticMemory();
		
		// ���� ������ Ŭ������ �޸��ּҴ� �ٸ���.
		System.out.println(test1);
		System.out.println(test2);
		
		// static ������ �������� ����(Test07StaticMemory.num)
		System.out.println(test1.num);
		
		test1.num += 50;
		
		System.out.println(test1.num); // ����� ���� ���
		
		// Ŭ�����ּҴ� �ٸ����� num�� static�̹Ƿ� �ϳ��� �ּҸ� ���õȴ�.
		System.out.println(test2.num);
		
		// static���� ������ ������ Ŭ������ �������� �ʾƵ� ���� ����
		System.out.println(Test07StaticMemory.main);
		
		Test07StaticMemory.main = "me too";
		
		System.out.println(Test07StaticMemory.main);

	}

}
