package templatePattern;
/*
public class FootBall extends Game {

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("初始化足球");

	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("开始踢足球");

	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("结束踢足球");

	}

}*/
public class Football extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Football Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Football Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }
	}
