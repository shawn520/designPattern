package singletonPattern1;
/*
 * 饿汉式
 * 实现简单，线程安全
 * 非延迟初始化，类加载时初始化，浪费内存
 * 
 */
public class SingleObject {

	private static SingleObject instance = new SingleObject();
	
	//私有化构造函数
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("hello world!");
	}
}
