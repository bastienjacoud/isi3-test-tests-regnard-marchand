import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@DisplayName("Person")
class PersonTest {

	private Person person;
	private Vector mockInitialPosition;

	@BeforeEach
	void setUp() {
		mockInitialPosition = mock(Vector.class);
		person = new Person("John Doe", mockInitialPosition);
	}

	@Test
	@DisplayName("should call vector add function")
	void move() {
		Vector mockParameter = mock(Vector.class);
		Vector mockResult = mock(Vector.class);
		Mockito.when(mockInitialPosition.add(mockParameter)).thenReturn(mockResult);

		person.move(mockParameter);

		assertEquals(mockResult, person.getPosition());
		Mockito.verify(mockInitialPosition).add(mockParameter);
	}
}