package singletonPattern;

//双重校验锁：不易产生垃圾对象，线程安全，且能保持高性能

public class Singleton4 {

	private volatile static Singleton4 instance;
	
	//私有化构造方法
	private Singleton4(){
		
	}
	
	//获取实例
	public static Singleton4 getInstance(){
		if(instance == null){
			synchronized(Singleton4.class){
				if(instance == null){
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
}
