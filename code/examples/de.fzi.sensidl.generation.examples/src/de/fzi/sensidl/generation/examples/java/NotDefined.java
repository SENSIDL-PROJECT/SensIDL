package de.fzi.sensidl.generation.examples.java;

/**
 * Implementation for the not defined stage of the E-Meter
 *
 */
public class NotDefined {
	private short first;
	private short second;
	private short third;
	private short fourth;
	private short fifth;
	private short sixth;

	/**
	 * Constructs the not defined stage
	 * 
	 * @param first
	 *            the first input from the device.
	 * @param second
	 *            the second input from the device.
	 * @param third
	 *            the third input from the device.
	 * @param fourth
	 *            the fourth input from the device.
	 * @param fifth
	 *            the fifth input from the device.
	 * @param sixth
	 *            the sixth input from the device.
	 */
	public NotDefined(short first, short second, short third, short fourth, short fifth, short sixth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
		this.fifth = fifth;
		this.sixth = sixth;
	}

	/**
	 * @return the first
	 */
	public short getFirst() {
		return first;
	}

	/**
	 * @param first
	 *            the first to set
	 */
	public void setFirst(short first) {
		this.first = first;
	}

	/**
	 * @return the second
	 */
	public short getSecond() {
		return second;
	}

	/**
	 * @param second
	 *            the second to set
	 */
	public void setSecond(short second) {
		this.second = second;
	}

	/**
	 * @return the third
	 */
	public short getThird() {
		return third;
	}

	/**
	 * @param third
	 *            the third to set
	 */
	public void setThird(short third) {
		this.third = third;
	}

	/**
	 * @return the fourth
	 */
	public short getFourth() {
		return fourth;
	}

	/**
	 * @param fourth
	 *            the fourth to set
	 */
	public void setFourth(short fourth) {
		this.fourth = fourth;
	}

	/**
	 * @return the fifth
	 */
	public short getFifth() {
		return fifth;
	}

	/**
	 * @param fifth
	 *            the fifth to set
	 */
	public void setFifth(short fifth) {
		this.fifth = fifth;
	}

	/**
	 * @return the sixth
	 */
	public short getSixth() {
		return sixth;
	}

	/**
	 * @param sixth
	 *            the sixth to set
	 */
	public void setSixth(short sixth) {
		this.sixth = sixth;
	}

}
