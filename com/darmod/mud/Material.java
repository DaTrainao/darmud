package com.darmod.mud;

class Material {

	String name;

	double mFlammability;
	double mBouyancy;
	double mStickiness; // for arrows sticking in it
	double mFriction;
	double mMetallic;
	double mReflectivity;
	double mOpacity;
	double mSolidity;
	double mLayerMin;
	double mLayerMax;
	double mLayerMinDensity;
	double mLayerMaxDensity;
	double mFreezeingPoint;
	double mMeltingPoint;
	double mBoilingPoint;

	Material mBurnTransitionMaterial; // what material to become

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

	private static final Material ASH = new Material("ash", 0.01, 0.5, 0.01,
			0.4, 0.0, 0.1, 0.1, 0.6, 0.01, 1.0, 0.01, 1.0, 30.48,
			1642.85588235290015, 2042.85588235290015);

}