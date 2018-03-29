import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreBoardTest {
	ScoreBoard scr1=new ScoreBoard();
	@Test
	public void testScoreBoard() {
//		fail("Not yet implemented");
	}

	@Test
	public void testAddBalls() {
		scr1.addBalls(6);
		scr1.addBalls(6);
		scr1.addBalls(6);
		scr1.addBalls(4);
		scr1.addBalls(0);
		scr1.addBalls(1);
		assertEquals(1, scr1.getCurrentBall()); //runs of previous ball
		assertEquals(23, scr1.getCurrentScore());
	}

	@Test
	public void testGetCurrentScore() {
//		fail("Not yet implemented");
	}

	@Test
	public void testPrintScoreCard() {
//		fail("Not yet implemented");
	}

	@Test
	public void testGetScorePer() {
//		fail("Not yet implemented");
	}

}
