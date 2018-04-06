package singletonPattern;

public class SingleObject {

	//构造方法私有化
	private SingleObject(){
		
	}
	
	//实例化
	private static SingleObject instance = new SingleObject();
	
	//获取实例
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("hello ");
	}
}
