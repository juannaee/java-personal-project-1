package entities;

import entities.enums.TypeAnimation;

public class Animation {

	private Integer idAnimation;
	private String nameAnimation;
	private TypeAnimation typeAnimation;
	private Double profitAnimation;
	private Double priceTicket = 15.00;
	private Double costAnimation;
	private Integer ticketsSold;
	private Double taxOfAnimators = 35.00 / 100;

	private Animator animator;

	public Animation() {

	}

	public Animation(String nameAnimation, TypeAnimation typeAnimation, Double costAnimation, Integer ticketsSold,
			Integer idAnimation, Animator animator, Double profitAnimation) {
		this.nameAnimation = nameAnimation;
		this.typeAnimation = typeAnimation;
		this.costAnimation = costAnimation;
		this.ticketsSold = ticketsSold;
		this.idAnimation = idAnimation;
		this.animator = animator;
		this.profitAnimation = profitAnimation;
	}

	public String getNameAnimation() {
		return nameAnimation;
	}

	public void setNameAnimation(String nameAnimation) {
		this.nameAnimation = nameAnimation;
	}

	public TypeAnimation getTypeAnimation() {
		return typeAnimation;
	}

	public void setTypeAnimation(TypeAnimation typeAnimation) {
		this.typeAnimation = typeAnimation;
	}

	public Double getProfitAnimation() {
		return profitAnimation;
	}

	public Double getPriceTicket() {
		return priceTicket;
	}

	public Double getCostAnimation() {
		return costAnimation;
	}

	public void setCostAnimation(Double costAnimation) {
		this.costAnimation = costAnimation;
	}

	public Integer getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(Integer ticketsSold) {

		this.ticketsSold = ticketsSold;

	}

	public Integer getIdAnaimation() {
		return idAnimation;
	}

	public void setAnimator(Animator animator) {

		this.animator = animator;

	}

	public Animator getAnimator() {
		return animator;
	}

	public double getTaxOfAnimators() {
		return taxOfAnimators;
	}

	public Double ticketsPurchases(Integer ticketsSold) {
		this.ticketsSold = ticketsSold;
		return this.profitAnimation = ticketsSold * priceTicket;

	}

	public double gainAnimationLessCost() {

		if (profitAnimation > costAnimation) {
			return profitAnimation - costAnimation;
		} else {
			return costAnimation - profitAnimation;
		}

	}

	public double earningsOfAnimato() {

		double sum = gainAnimationLessCost() * taxOfAnimators;
		if (sum < gainAnimationLessCost()) {
			sum = gainAnimationLessCost() - sum;
		} else {
			sum -= gainAnimationLessCost();
		}
		return sum;

	}

	public String toString() {
		StringBuilder stb = new StringBuilder();
		stb.append("\n");
		stb.append("--------------------------------------------------------" + "\n");
		stb.append("Animation ID: " + idAnimation + "\n");
		stb.append("Animation name: " + nameAnimation + "\n");
		stb.append("Animation Type: " + typeAnimation + "\n");
		stb.append("Animation Cost: R$" + String.format("%.2f",costAnimation)+ "\n");
		stb.append("Tickets Sold: " + ticketsSold + "\n");
		stb.append("Animation Profit: R$" + String.format("%.2f",profitAnimation) + "\n");
		if (costAnimation < gainAnimationLessCost()) {
			stb.append("The animation made a profit of: R$" + String.format("%.2f", gainAnimationLessCost()) + "\n");
		} else {
			stb.append("The animation suffered from: R$" + String.format("%.2f", gainAnimationLessCost()) + "\n");
		}
		stb.append("Animator name:" + animator.getAnimatorName() + "\n");
		stb.append("Animator gain: R$" + String.format("%.2f", earningsOfAnimato()) + "\n");
		stb.append("\n");
		stb.append("--------------------------------------------------------" + "\n");

		return stb.toString();

	}

}
