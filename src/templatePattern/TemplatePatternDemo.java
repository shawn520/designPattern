package templatePattern;

//public class TemplatePatternDemo {
//	
//	public static void main(String[] args) {
//		Game game = new Badminton();	
//		game.play();
//		
//		game = new FootBall();
//		game.play();
//	}
//	
//}

public class TemplatePatternDemo {
	   public static void main(String[] args) {

	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();        
	   }
	}
