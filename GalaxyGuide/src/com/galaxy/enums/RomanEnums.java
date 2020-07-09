package com.galaxy.enums;

public enum RomanEnums {
	I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
	private final double value;

	RomanEnums(final double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public static double getCodeValue(String code) {
		double finalValue;
		switch (code) {
		case "I":
			finalValue = I.getValue();
			break;

		case "V":
			finalValue = V.getValue();
			break;

		case "X":
			finalValue = X.getValue();
			break;

		case "L":
			finalValue = L.getValue();
			break;

		case "C":
			finalValue = C.getValue();
			break;
		case "D":
			finalValue = D.getValue();
			break;
		case "M":
			finalValue = M.getValue();
			break;

		default:
			finalValue = 0;
			break;
		// I have no idea what you are talking about.
		}
		return finalValue;

	}

}
