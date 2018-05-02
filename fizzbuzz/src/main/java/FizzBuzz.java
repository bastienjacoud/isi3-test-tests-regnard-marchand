import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

	private IntStream integerList;

	public FizzBuzz(Integer length) {
		assert length >= 0 : "length should not be negative";
		integerList = IntStream.rangeClosed(0, length - 1);
	}

	public IntStream getIntegerList() {
		return integerList;
	}


	public List<String> fizzBuzz() {
		return integerList.mapToObj(this::getStringValue).collect(toList());
	}

	private String getStringValue(int number) {
		boolean isMultipleOfThree = isMultipleOf(3, number);
		boolean isMultipleOfFive = isMultipleOf(5, number);
		boolean isMultipleOfFifteen = isMultipleOfFive && isMultipleOfThree;
		boolean isMultipleOfSeven = isMultipleOf(7, number);

		if (number == 42) {
			return "The answer to life, the universe and everything";
		}

		if (isMultipleOfThree) {
			return "Fizz";
		}

		if (isMultipleOfFifteen) {
			return "Fizz Buzz";
		}

		if (isMultipleOfFive) {
			return "Buzz";
		}

		if (isMultipleOfSeven) {
			return "It's a trap";
		}

		return String.valueOf(number);
	}

	private boolean isMultipleOf(int multiple, int evaluatedNumber) {
		return evaluatedNumber % multiple == 0;
	}
}
