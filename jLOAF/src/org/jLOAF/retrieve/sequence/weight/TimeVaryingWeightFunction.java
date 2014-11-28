package org.jLOAF.retrieve.sequence.weight;


public class TimeVaryingWeightFunction implements WeightFunction {

	private double decayRate;
	
	public TimeVaryingWeightFunction(double decayRate){
		this.decayRate = decayRate;
	}
	
	@Override
	public double getWeightValue(int time) {
		return Math.exp(time * this.decayRate);
	}

}