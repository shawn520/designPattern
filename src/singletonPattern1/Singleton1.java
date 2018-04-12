package singletonPattern1;

/*
 * 懒汉式：非线程安全
 * 简单
 * 延迟初始化
 * 
 */
public class Singleton1 {

	private static Singleton1 instance ;
	
	//私有化构造函数
	private Singleton1(){
		
	}
	
	public static Singleton1 getIntance(){
		if(instance == null){
			instance = new Singleton1();
		}
		
		return instance;
	}
	
}
