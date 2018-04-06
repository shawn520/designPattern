package singletonPattern;

//饿汉式：在类加载时实例化

public class Singleton3 {

	//构造方法私有化
	private Singleton3(){
		
	}
	
	//实例化
	private static Singleton3 instance = new Singleton3();
	
	public static Singleton3 getInstance(){
		return instance;
	}
}
