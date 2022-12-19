package entities;


public class Animator  {

	private String animatorName;
	private String animatorEmail;
	private Double earningsOfAnimator;

	public Animator() {
	}

	public Animator(String animatorName, String animatorEmail, Double earningsOfAnimator) {
		super();
		this.animatorName = animatorName;
		this.animatorEmail = animatorEmail;
		this.earningsOfAnimator = earningsOfAnimator;
	}

	public String getAnimatorName() {
		return animatorName;
	}

	public void setAnimatorName(String animatorName) {
		this.animatorName = animatorName;
	}

	public String getAnimatorEmail() {
		return animatorEmail;
	}

	public void setAnimatorEmail(String animatorEmail) {
		this.animatorEmail = animatorEmail;
	}

	public Double getEarningsOfAnimator() {
		return earningsOfAnimator;
	}

	public void setEarningsOfAnimator(Double earningsOfAnimator) {
		this.earningsOfAnimator = earningsOfAnimator;
	}
	
}
