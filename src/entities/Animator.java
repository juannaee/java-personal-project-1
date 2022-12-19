package entities;


public class Animator  {

	private String animatorName;
	private Double earningsOfAnimator;

	public Animator() {
	}

	public Animator(String animatorName) {
		super();
		this.animatorName = animatorName;

	}

	public String getAnimatorName() {
		return animatorName;
	}

	public void setAnimatorName(String animatorName) {
		this.animatorName = animatorName;
	}

	public Double getEarningsOfAnimator() {
		return earningsOfAnimator;
	}

	public void setEarningsOfAnimator(Double earningsOfAnimator) {
		this.earningsOfAnimator = earningsOfAnimator;
	}
	
}
