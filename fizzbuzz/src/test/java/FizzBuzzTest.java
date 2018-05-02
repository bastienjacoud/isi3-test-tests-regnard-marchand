import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Fizz Buzz Tests 😇")
class FizzBuzzTest {

	private FizzBuzz main;

	@BeforeEach
	void setUp() {
		main = new FizzBuzz(100);
	}

	@ParameterizedTest
	@DisplayName("should have list of integer of size length")
	@ValueSource(ints = {0, 1, 10, 100})
	void testListBuild(int length) {
		main = new FizzBuzz(length);
		assertEquals(main.getIntegerList().count(), length);
	}

	@Test
	@DisplayName("should verify length positiv sign")
	void testNegativeLength() {
		assertThrows(AssertionError.class, () -> main = new FizzBuzz(-1));
	}

	@ParameterizedTest
	@DisplayName("should return string value of these numbers")
	@ValueSource(ints = {1, 2, 4})
	void testStringValueOfNumbers(int number) {
		List<String> fizzBuzz = main.fizzBuzz();
		assertEquals(fizzBuzz.get(number), String.valueOf(number));
	}

	@Test
	@DisplayName("should return Fizz for 0")
	void testZero() {
		testAssertEquals("Fizz", 0);
	}

	@ParameterizedTest
	@DisplayName("should verify multiple of three are replaced by Fizz")
	@ValueSource(ints = {3, 6, 9})
	void testMultipleThree(int multipleOfThree) {
		testAssertEquals("Fizz", multipleOfThree);
	}

	@ParameterizedTest
	@DisplayName("should verify multiple of five are replaced by Buzz")
	@ValueSource(ints = {5, 10, 20})
	void testMultipleFive(int multipleOfFive) {
		testAssertEquals("Buzz", multipleOfFive);
	}

	@ParameterizedTest
	@DisplayName("should verify multiple of 3 and five are replace by Fizz")
	@ValueSource(ints = {15, 30, 45})
	void testMultipleOfThreeAndFive(int multiple) {
		testAssertEquals("Fizz", multiple);
	}

	@ParameterizedTest
	@DisplayName("should verify multiple of 7 are replaced by It's a trap")
	@ValueSource(ints = {7, 14, 28})
	void testMultipleOfSeven(int multiple) {
		testAssertEquals("It's a trap", multiple);
	}

	@Test
	@DisplayName("should return The answer to life, the universe and everything for 42")
	void testFourtyTwo() {
		testAssertEquals("The answer to life, the universe and everything", 42);
	}


	// TODO: 02/05/2018 Better name
	private void testAssertEquals(String expected, int number) {
		List<String> fizzBuzz = main.fizzBuzz();
		assertEquals(expected, fizzBuzz.get(number));
	}
}