package practice;

public class Test08Singleton {
	
	static Test08Singleton instance;
	
	// new 연산자로 생성되는것을 방지
	private Test08Singleton(){
	}
	
	public static Test08Singleton getInstance(){
		if(instance == null){
			instance = new Test08Singleton();
		}
		
		return instance;
	}

}
