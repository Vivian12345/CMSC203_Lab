import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook gb1 = new GradeBook(5);
	GradeBook gb2 = new GradeBook(5);

	@BeforeEach
	void setUp() throws Exception {
		gb1.addScore(37.33);
		gb1.addScore(32.77);
		gb1.addScore(42.33);
		gb2.addScore(77.01);
		gb2.addScore(28.93);
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
	}

	@Test
	void testAddScore() {
		assertEquals(gb1.toString(), "37.33 32.77 42.33 0.0 0.0 ");
		assertEquals(gb2.toString(), "77.01 28.93 0.0 0.0 0.0 ");
	}

	@Test
	void testSum() {
		assertEquals(gb1.sum(), 112.43, 0.001);
		assertEquals(gb2.sum(), 105.94, 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(gb1.minimum(), 32.77);
		assertEquals(gb2.minimum(), 28.93);
	}

	@Test
	void testFinalScore() {
		assertEquals(gb1.finalScore(), 79.66, 0.001);
		assertEquals(gb2.finalScore(), 77.01, 0.001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(gb1.getScoreSize(), 3);
		assertEquals(gb2.getScoreSize(), 2);
	}

	@Test
	void testToString() {
		assertEquals(gb1.toString(), "37.33 32.77 42.33 0.0 0.0 ");
		assertEquals(gb2.toString(), "77.01 28.93 0.0 0.0 0.0 ");
	}

}
