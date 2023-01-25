package example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestMain {

	public static void main(String[] args) {
		
		@Test
		public void testInputIsEven() {
			assertTrue(Main.checkIfInputIsAnEvenNumber(23));
		}
	}

}
