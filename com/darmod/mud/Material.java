package com.darmod.mud;

class Material {

	private String name;

	private double mFlammability;
	private double mBouyancy;
	private double mStickiness; // for arrows sticking in it
	private double mFriction;
	private double mMetallic;
	private double mReflectivity;
	private double mOpacity;
	private double mSolidity;
	private double mLayerMin;
	private double mLayerMax;
	private double mLayerMinDensity;
	private double mLayerMaxDensity;
	private double mFreezeingPoint;
	private double mMeltingPoint;
	private double mBoilingPoint;

	private Material mBurnTransitionMaterial; // what material to become

	public Material(String name) {
		this.name = name.toLowerCase();
	}

	public Material(String name, double flammability, double bouyancy,
			double stickiness, double friction, double metallic,
			double reflectivity, double opacity, double solidity,
			double layerMin, double layerMax, double minDensity,
			double maxDensity, double freezing, double melting, double boiling) {
		this.name = name.toLowerCase();
		this.mFlammability = flammability;
		this.mBouyancy = bouyancy;
		this.mStickiness = stickiness;
		this.mFriction = friction;
		this.mMetallic = metallic;
		this.mReflectivity = reflectivity;
		this.mOpacity = opacity;
		this.mSolidity = solidity;
		this.mLayerMin = layerMin;
		this.mLayerMax = layerMax;
		this.mLayerMinDensity = minDensity;
		this.mLayerMaxDensity = maxDensity;
		this.mFreezeingPoint = freezing;
		this.mMeltingPoint = melting;
		this.mBoilingPoint = boiling;
		this.mBurnTransitionMaterial = ASH;
	}

	public Material(String name, double flammability, double bouyancy,
			double stickiness, double friction, double metallic,
			double reflectivity, double opacity, double solidity,
			double layerMin, double layerMax, double minDensity,
			double maxDensity, double freezing, double melting, double boiling,
			Material burnMaterial) {
		this.name = name.toLowerCase();
		this.mFlammability = flammability;
		this.mBouyancy = bouyancy;
		this.mStickiness = stickiness;
		this.mFriction = friction;
		this.mMetallic = metallic;
		this.mReflectivity = reflectivity;
		this.mOpacity = opacity;
		this.mSolidity = solidity;
		this.mLayerMin = layerMin;
		this.mLayerMax = layerMax;
		this.mLayerMinDensity = minDensity;
		this.mLayerMaxDensity = maxDensity;
		this.mFreezeingPoint = freezing;
		this.mMeltingPoint = melting;
		this.mBoilingPoint = boiling;
		this.mBurnTransitionMaterial = burnMaterial;

	}

	public static final Material ASH = new Material("ash", 0.01, 0.5, 0.01,
			0.4, 0.0, 0.1, 0.1, 0.6, 0.01, 1.0, 0.01, 1.0, 30.48, 1642.855,
			2042.855);
	public static final Material DARM = new Material("darm", 0.02, 0.06, 0.8,
			0.2, 1.0, 0.6, 1.0, 1.0, 1.0, 1.0, 0.8, 1.0, 0.08, 1337.5124,
			1440.678);
	public static final Material PAPER = new Material("paper", 0.9, 0.1, 0.2,
			0.4, 0.01, 0.01, 0.05, 0.8, 0.05, 1.0, 0.1, 1.0, 50.5928, 505.928,
			1005.928);
	public static final Material GLASS = new Material("glass", 0.1, 0.2, 0.7,
			0.1, 0.05, 0.7, 0.85, 0.89, 0.02, 1.0, 0.08, 1.0, 20, 1816.15,
			2016.15);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getmFlammability() {
		return mFlammability;
	}

	public void setmFlammability(double mFlammability) {
		this.mFlammability = mFlammability;
	}

	public double getmBouyancy() {
		return mBouyancy;
	}

	public void setmBouyancy(double mBouyancy) {
		this.mBouyancy = mBouyancy;
	}

	public double getmStickiness() {
		return mStickiness;
	}

	public void setmStickiness(double mStickiness) {
		this.mStickiness = mStickiness;
	}

	public double getmFriction() {
		return mFriction;
	}

	public void setmFriction(double mFriction) {
		this.mFriction = mFriction;
	}

	public double getmMetallic() {
		return mMetallic;
	}

	public void setmMetallic(double mMetallic) {
		this.mMetallic = mMetallic;
	}

	public double getmReflectivity() {
		return mReflectivity;
	}

	public void setmReflectivity(double mReflectivity) {
		this.mReflectivity = mReflectivity;
	}

	public double getmOpacity() {
		return mOpacity;
	}

	public void setmOpacity(double mOpacity) {
		this.mOpacity = mOpacity;
	}

	public double getmSolidity() {
		return mSolidity;
	}

	public void setmSolidity(double mSolidity) {
		this.mSolidity = mSolidity;
	}

	public double getmLayerMin() {
		return mLayerMin;
	}

	public void setmLayerMin(double mLayerMin) {
		this.mLayerMin = mLayerMin;
	}

	public double getmLayerMax() {
		return mLayerMax;
	}

	public void setmLayerMax(double mLayerMax) {
		this.mLayerMax = mLayerMax;
	}

	public double getmLayerMinDensity() {
		return mLayerMinDensity;
	}

	public void setmLayerMinDensity(double mLayerMinDensity) {
		this.mLayerMinDensity = mLayerMinDensity;
	}

	public double getmLayerMaxDensity() {
		return mLayerMaxDensity;
	}

	public void setmLayerMaxDensity(double mLayerMaxDensity) {
		this.mLayerMaxDensity = mLayerMaxDensity;
	}

	public double getmFreezeingPoint() {
		return mFreezeingPoint;
	}

	public void setmFreezeingPoint(double mFreezeingPoint) {
		this.mFreezeingPoint = mFreezeingPoint;
	}

	public double getmMeltingPoint() {
		return mMeltingPoint;
	}

	public void setmMeltingPoint(double mMeltingPoint) {
		this.mMeltingPoint = mMeltingPoint;
	}

	public double getmBoilingPoint() {
		return mBoilingPoint;
	}

	public void setmBoilingPoint(double mBoilingPoint) {
		this.mBoilingPoint = mBoilingPoint;
	}

	public Material getmBurnTransitionMaterial() {
		return mBurnTransitionMaterial;
	}

	public void setmBurnTransitionMaterial(Material mBurnTransitionMaterial) {
		this.mBurnTransitionMaterial = mBurnTransitionMaterial;
	}

}
