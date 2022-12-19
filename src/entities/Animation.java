package entities;

import entities.enums.TypeAnimation;

public class Animation {

	private String nameAnimation;
	private TypeAnimation typeAnimation;
	private Double profitAnimation;
	private Double priceTicket = 15.00;
	private Double costAnimation;
	private Integer ticketsSold;

	public Animation() {

	}

	public Animation(String nameAnimation, TypeAnimation typeAnimation, Double priceTicket, Double costAnimation,
			Integer ticketsSold) {
		this.nameAnimation = nameAnimation;
		this.typeAnimation = typeAnimation;
		this.priceTicket = priceTicket;
		this.costAnimation = costAnimation;
		this.ticketsSold = ticketsSold;
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

	public void ticketsPurchases(Integer ticketsSold) {
		this.ticketsSold = ticketsSold;
		profitAnimation = priceTicket * ticketsSold;

	}

}

