package practice;

public class Test08Singleton {
	
	static Test08Singleton instance;
	
	// new �����ڷ� �����Ǵ°��� ����
	private Test08Singleton(){
	}
	
	public static Test08Singleton getInstance(){
		if(instance == null){
			instance = new Test08Singleton();
		}
		
		return instance;
	}

}
