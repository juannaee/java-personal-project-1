package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Animation;
import entities.AnimationCompany;
import entities.Animator;
import entities.enums.TypeAnimation;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AnimationCompany animationCompany = new AnimationCompany();
		Animation animation = new Animation();
		System.out.println("Welcome to the company system:" + AnimationCompany.getCompanyName());
		System.out.println();

		System.out.println("Welcome, follow the next steps by steps");
		System.out.println("How many animations will be registered today?");
		int numberOfAnimations = sc.nextInt();
		System.out.println();

		for (int i = 0; i < numberOfAnimations; i++) {
			int aux = 1;
			aux += i;
			System.out.println("Register your animation#" + aux + " :");

			System.out.println("Animation ID:");
			Integer idAnimation = sc.nextInt();
			System.out.println();

			System.out.println("Animation name:");
			sc.nextLine();
			String animationName = sc.nextLine();
			System.out.println();

			System.out.println("Type Animation:");
			String typeAnimation = "";
			System.out.println("options:");
			System.out.printf("1-3D%n2-2D %n3-STOP MOTION");
			int opcaoMenu = sc.nextInt();

			do {
				switch (opcaoMenu) {

				case 1: {
					System.out.println("You chose 3D");
					typeAnimation = "_3D";
					break;
				}

				case 2: {
					System.out.println("You chose 2D");
					typeAnimation = "_2D";
					break;
				}

				case 3: {
					System.out.println("You chose STOP MOTION");
					typeAnimation = "STOPMOTION";
					break;
				}
				default: {
					System.out.println("invalid option try again!!");
					break;
				}

				}

			} while (opcaoMenu != 1 && opcaoMenu != 2 && opcaoMenu != 3);
			System.out.println();

			System.out.println("what was the total cost of the animation: ");
			Double costAnimation = sc.nextDouble();
			System.out.println();

			System.out.println("How many tickets were sold?");
			Integer ticketsSold = sc.nextInt();
			Double profitAnimation = animation.valueTicketsPurchases(ticketsSold);
			System.out.println();

			System.out.println("what is the name of the animator?");
			sc.nextLine();
			String nameAnimator = sc.nextLine();
			System.out.println();

			animation = new Animation(animationName, TypeAnimation.valueOf(typeAnimation), costAnimation, ticketsSold,
					idAnimation, new Animator(nameAnimator), profitAnimation);

			animationCompany.addAnimation(animation);

		}

		System.out.println(animationCompany);

		sc.close();

	}

}
