package templatePattern;

/*public class Badminton extends Game {

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("初始化羽毛球游戏");
		
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("开始打羽毛球");
		
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("结束打羽毛球");
		
	}
	
}*/
public class Cricket extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Cricket Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Cricket Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}
