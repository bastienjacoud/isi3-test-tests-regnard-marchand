import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

	private IntStream integerList;
	private List<Rule> rules;

	public FizzBuzz(Integer length) {
		assert length >= 0 : "length should not be negative";
		integerList = IntStream.rangeClosed(0, length - 1);
		initializeRules();
	}

	private void initializeRules() {
		rules = new ArrayList<>();
		rules.add(new Rule((number -> (number % 7 == 0)), "It's a trap"));
		rules.add(new Rule((number -> (number %  5 == 0)), "Buzz"));
		rules.add(new Rule((number -> (number % 15 == 0)), "Fizz Buzz"));
		rules.add(new Rule((number -> (number % 3 == 0)), "Fizz"));
		rules.add(new Rule((number -> (number == 42 )), "The answer to life, the universe and everything"));
	}

	public IntStream getIntegerList() {
		return integerList;
	}


	public List<String> fizzBuzz() {
		return integerList.mapToObj(this::getStringValue).collect(toList());
	}

	private String getStringValue(int number) {

		Rule selectedRule = rules.stream().filter(rule -> rule.evaluate(number))
			.reduce((rule, rule2) -> rule2)
			.orElse(new Rule(nb -> true, number));

		return selectedRule.getResult();
	}

}
