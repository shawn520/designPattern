package singletonPattern1;

/*
 * 双检锁/双重校验锁
 * 实现较复杂
 * 线程安全，且在多线程下能保持高性能
 */

public class Singleton3 {

	private volatile static Singleton3 instance;
	
	//私有化构造函数
	private Singleton3(){
		
	}
	
	public static Singleton3 getInstance(){
		if(instance == null){
			synchronized(Singleton3.class){
				if(instance == null){
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
