package singletonPattern;

//懒汉模式:线程不安全
public class Singleton1 {

	//构造方法私有化
	private Singleton1(){
		
	}
	
	//实例化
	private static Singleton1 instance;
	
	//获取实例
	public static Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
	public void showMessage(){
		System.out.println("hello ");
	}
}
