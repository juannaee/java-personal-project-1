package entities;

import java.util.ArrayList;
import java.util.List;

public class AnimationCompany {

	private static String companyName = "BI.universes_studioss";
	private double profitFromAnimations;
	private Double companyEarningsRate = 25.00;

	List<Animation> listAnimation = new ArrayList<>();

	public AnimationCompany() {

	}

	public AnimationCompany(double profitFromAnimations, Double companyEarningsRate) {

		this.profitFromAnimations = profitFromAnimations;
		this.companyEarningsRate = companyEarningsRate;

	}

	public static String getCompanyName() {
		return companyName;
	}

	public double getProfitFromAnimations() {

		return profitFromAnimations;
	}

	public Double getCompanyEarningsRate() {
		return companyEarningsRate;
	}

	public void setCompanyEarningsRate(Double companyEarningsRate) {
		this.companyEarningsRate = companyEarningsRate;
	}

	public List<Animation> getListAnimation() {
		return listAnimation;
	}

	public void addAnimation(Animation animation) {
		listAnimation.add(animation);

	}

	public void removeAnimation(Animation animation) {
		listAnimation.remove(animation);
	}

	public Double profitAnimations() {

		Double sum = 0.0;

		for (Animation objAnimation : listAnimation) {
			sum += objAnimation.gainAnimationLessCost();
		}
		this.profitFromAnimations = sum;
		return this.profitFromAnimations;

	}

}
