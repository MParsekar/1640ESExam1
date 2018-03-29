
public class Over {
	private int overBalls[]=new int[6];
	private int totalRunsOver=0;
	int currentBallofTheOver=0;
	public void addRunsperBall(int runs){
		overBalls[currentBallofTheOver]=runs;
		currentBallofTheOver++;
		totalRunsOver+=runs;
	}
}
