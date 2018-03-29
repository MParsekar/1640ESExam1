
public class ScoreBoard {
	private int totalOver=0;
	private Over[] over;
	private int totalBalls;
	
	
	public ScoreBoard() {
		super();
		
		over=new Over[10];
		over[0]=new Over();
	}
	public void addBalls(int runs){
		
		over[totalOver].addRunsperBall(runs);
		totalBalls++;
		if(totalBalls%6==0){
			totalOver++;
			over[totalOver]=new Over();
		}
	}
	
	

	public int getCurrentScore(){
		int currentScore=0;
		for(int i=0;i<totalOver;i++){
			currentScore+=over[i].getScorePerOver();
		}
		return currentScore;
	}
	public void printScoreCard(){
		System.out.println("CurrentScore: "+ this.getCurrentScore());
	}
	public void getScorePer(){
		for(int i=0;i<totalOver;i++){
			System.out.println("Over 1: "+(i+1));
			over[i].printScorePerBallInCurrentOver();
		}
	}
}	

