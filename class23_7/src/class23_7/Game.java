package class23_7;

abstract class Game {

	    abstract void Start();
	    abstract void Play();
	    abstract void Exit();
	}

	class start extends Game {
	
	    void Start() {
	        System.out.println("Starting your Game.....");
	    }
	    void Play() {
	        System.out.println("Ready to Play...");
	    }
	    void Exit() {
	        System.out.println("Exiting the game....");
	    }
	}

	class play extends Game {
		 void Start() {
		        System.out.println("Starting your Game.....");
		    }
		    void Play() {
		        System.out.println("Ready to Play...");
		    }
		    void Exit() {
		        System.out.println("Exiting the game....");
		    }
	    
	}
	class exit extends Game{
		 void Start() {
		        System.out.println("Starting your Game.....");
		    }
		    void Play() {
		        System.out.println("Ready to Play...");
		    }
		    void Exit() {
		        System.out.println("Exiting the game....");
		    }
}
