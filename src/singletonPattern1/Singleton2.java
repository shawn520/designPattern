package singletonPattern1;

/*
 * 懒汉式：线程安全
 * 实现简单
 * 但是效率低。为什么呢？
 * 因为可能百分之90的情况都是已经实例化了的。
 */
public class Singleton2 {

	private static Singleton2 instance;
	
	//私有化构造函数
	private Singleton2(){
		
	}
	
	public static synchronized Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	
}
