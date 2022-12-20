package entities;

import java.util.ArrayList;
import java.util.List;

public class AnimationCompany {

	private static String companyName = "BI.universes_studioss";
	private Double profitFromAnimations;

	List<Animation> listAnimation = new ArrayList<>();

	public AnimationCompany() {

	}

	public static String getCompanyName() {
		return companyName;
	}

	public double getProfitFromAnimations() {

		return profitFromAnimations;
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

	public String toString() {
		StringBuilder stb = new StringBuilder();
		stb.append("Company Name: " + companyName + "\n");
		stb.append("\n");
		stb.append("List of animations: " + "\n");
		stb.append(listAnimation);

		return stb.toString();
	}

}
