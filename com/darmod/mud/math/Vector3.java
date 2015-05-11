package com.darmod.mud.math;

class Vector3 {

	public double[] xyz = new double[3];

	public Vector3() {
		xyz[0] = 0;
		xyz[1] = 0;
		xyz[2] = 0;
	}

	public Vector3(double[] array) {
		if (array.length != 3)
			throw new RuntimeException("Vector3 must contain exactly 3 values.");

	}

	public Vector3(double x, double y, double z) {
		xyz[0] = x;
		xyz[1] = y;
		xyz[2] = z;
	}
	
	public Vector3(Vector3 abc) {
		xyz[0] = abc.xyz[0];
		xyz[1] = abc.xyz[1];
		xyz[2] = abc.xyz[2];
	}
	
	public Vector3 add(Vector3 abc) {
		return new Vector3(
				xyz[0] + abc.xyz[0],
				xyz[1] + abc.xyz[1],
				xyz[2] + abc.xyz[2]
				);
	}
	
	public Vector3 sub(Vector3 abc) {
		return new Vector3(
				xyz[0] - abc.xyz[0],
				xyz[1] - abc.xyz[1],
				xyz[2] - abc.xyz[2]
				);
	}

	public Vector3 mul(Vector3 abc) {
		return new Vector3(
				xyz[0] * abc.xyz[0],
				xyz[1] * abc.xyz[1],
				xyz[2] * abc.xyz[2]
				);
	}

	public Vector3 mul(double n) {
		return new Vector3(
				xyz[0] * n,
				xyz[1] * n,
				xyz[2] * n
				);
	}
	
	public Vector3 div(double n) {
		return new Vector3(
				xyz[0] / n,
				xyz[1] / n,
				xyz[2] / n
				);
	}
	
	public Vector3 div(Vector3 abc) {
		return new Vector3(
				xyz[0] / abc.xyz[0],
				xyz[1] / abc.xyz[1],
				xyz[2] / abc.xyz[2]
				);
	}

	public double getX() {
		return xyz[0];
	}

	public double getY() {
		return xyz[1];
	}

	public double getZ() {
		return xyz[2];
	}

}
