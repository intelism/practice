package practice;

public class Test08SingletonMain {
	
	public static void main(String[] args){
		
		Test08Singleton ts1 = Test08Singleton.getInstance();
		Test08Singleton ts2 = Test08Singleton.getInstance();
		Test08Singleton ts3 = Test08Singleton.getInstance();
		
		// �̱������� �����Ͽ��� ������ ���� �޸� �ּҸ� �����ش�.
		System.out.println(ts1);
		System.out.println(ts2);
		System.out.println(ts3);
	}

}
