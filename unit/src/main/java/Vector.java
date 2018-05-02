import java.math.BigDecimal;
import java.util.Objects;

class Vector {

	private BigDecimal xAxis;
	private BigDecimal yAxis;

	public Vector(BigDecimal xAxis, BigDecimal yAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}

	public Vector(Integer xAxis, Integer yAxis) {
		this(BigDecimal.valueOf(xAxis), BigDecimal.valueOf(yAxis));
	}

	public BigDecimal getxAxis() {
		return xAxis;
	}

	public BigDecimal getyAxis() {
		return yAxis;
	}

	public Vector add(Vector vector) {
		return new Vector(this.getxAxis().add(vector.getxAxis()), this.getyAxis().add(vector.getyAxis()));
	}

	/**
	 * Get the cross product with point p. Cross product is defined by :
	 *
	 * @param vector vector to cross with
	 * @return x1*y2 - x2*y1
	 */
	public BigDecimal cross(Vector vector) {
		BigDecimal firstPart = this.getxAxis().multiply(vector.getyAxis());
		BigDecimal secondPart = vector.getxAxis().multiply(this.getyAxis());

		return firstPart.subtract(secondPart);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Vector vector = (Vector) o;
		return Objects.equals(this.getxAxis(), vector.getxAxis()) &&
			Objects.equals(getyAxis(), vector.getyAxis());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getxAxis(), getyAxis());
	}
}
