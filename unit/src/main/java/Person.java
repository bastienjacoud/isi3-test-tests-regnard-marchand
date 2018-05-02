import java.util.Objects;

public class Person {

	private String name;

	private Vector position;

	public Person(String name, Vector position) {
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public Vector getPosition() {
		return position;
	}

	public void move(Vector vector) {
		this.position = position.add(vector);
	}

	@Override
	public String toString() {
		return "Person{" +
			"name='" + getName() + '\'' +
			", position=" + getPosition() +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Person person = (Person) o;
		return Objects.equals(name, person.name) &&
			Objects.equals(position, person.position);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, position);
	}
}
