import java.util.function.Predicate;

public class Rule {

	private Predicate<Integer> predicate;
	private String result;

	public Rule(Predicate<Integer> predicate, String result) {
		this.predicate = predicate;
		this.result = result;
	}

	public Rule(Predicate<Integer> predicate, int number) {
		this.predicate = predicate;
		this.result = String.valueOf(number);
	}

	public String getResult() {
		return result;
	}

	public boolean evaluate(int number){
		return predicate.test(number);
	}
}
