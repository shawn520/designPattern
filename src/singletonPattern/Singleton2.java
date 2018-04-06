package singletonPattern;

//懒汉模式:线程安全
//效率低，90%不需要线程安全
public class Singleton2 {

	//构造方法私有化
	private Singleton2(){
		
	}
	
	//实例化
	private static Singleton2 instance;
	
	//获取实例
	public static synchronized Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	
	public void showMessage(){
		System.out.println("hello ");
	}
}
