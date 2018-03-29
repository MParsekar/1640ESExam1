
public class Over {
	private int overBalls[]=new int[6];
	private int totalRunsOver=0;
	int currentBallofTheOver=0;
	
	public void addRunsperBall(int runs){
		overBalls[currentBallofTheOver]=runs;
		currentBallofTheOver++;
		totalRunsOver+=runs;
	}
	public int getScorePerOver(){
		return totalRunsOver;
	}
	public void printScorePerBallInCurrentOver(){
		for(int i=0; i<currentBallofTheOver;i++){
			System.out.println("\tBall "+i+" : "+overBalls[i]);
		}
	}
}
