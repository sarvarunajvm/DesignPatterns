package com.core;

import java.util.Scanner;

import com.concrete.base.creator.Logistics;
import com.concrete.other.creator.RoadLogistics;
import com.concrete.other.creator.SeaLogistics;

public class DemoFactory {

	private static Logistics logistics;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select the shipment option :");
		System.out.println("1 -> Road");
		System.out.println("2 -> Sea");
		int option = scanner.nextInt();
		getTransport(option);
		sendDelivery();
		System.out.println("Your Package will be delivered within 10 working days");
		scanner.close();
	}

	private static void sendDelivery() {
		logistics.planDelivery();
	}

	private static void getTransport(int option) {
		if (option == 1) {
			logistics = new RoadLogistics();
		} else if (option == 2) {
			logistics = new SeaLogistics();
		} else {
			System.out.println("Please select only : 1 or 2");
		}

	}

}
