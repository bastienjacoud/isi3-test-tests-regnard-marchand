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

	public void setxAxis(BigDecimal xAxis) {
		this.xAxis = xAxis;
	}

	public BigDecimal getyAxis() {
		return yAxis;
	}

	public void setyAxis(BigDecimal yAxis) {
		this.yAxis = yAxis;
	}

	public Vector add(Vector vector) {
		return new Vector(xAxis.add(vector.xAxis), yAxis.add(vector.yAxis));
	}

	/**
	 * Get the cross product with point p. Cross product is defined by :
	 *
	 * @param vector vector to cross with
	 * @return x1*y2 - x2*y1
	 */
	public BigDecimal cross(Vector vector) {
		BigDecimal firstPart = this.xAxis.multiply(vector.yAxis);
		BigDecimal secondPart = vector.xAxis.multiply(this.yAxis);

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
		return Objects.equals(xAxis, vector.xAxis) &&
			Objects.equals(yAxis, vector.yAxis);
	}

	@Override
	public int hashCode() {
		return Objects.hash(xAxis, yAxis);
	}
}
