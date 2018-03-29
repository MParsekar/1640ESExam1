
public class ScoreBoard {
	private int totalOver=0;
	private Over over[]=new Over[50];
	private int totalBalls;
	
	public void addBalls(int runs){
		over[totalOver].addRunsperBall(runs);
		totalBalls++;
		if(totalBalls%6==0){
			totalOver++;
		}
	}
	public int getCurrentScore(){
		int currentScore=0;
		for(int i=0;i<6;i++){
			currentScore+=over[i].getScorePerOver();
		}
		return currentScore;
	}
}	

