package com.darmod.mud.math;

class Vector3 {

  double x, y, z;

  public Vector3() {
    x=0;
    y=0;
    z=0;
  }

  public Vector3(double[] array) {
    if(array.length != 3)
      throw new RuntimeException("Vector3 must contain exactly 3 values.");

  }

  public Vecter3(double x, double y, double z) {

  }

  public double getX() {

  }

  public double getY() {

  }

  public double getZ() {

  }

}
