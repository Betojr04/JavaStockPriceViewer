package com.Beto.Stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class StockPriceViewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPriceViewerApplication.class, args);
		System.out.println("Hello, Welcome to StockPriceViwer where you can view stock prices for any stock" +
				"you wish to see");
		Scanner scanner  = new Scanner(System.in);

		System.out.println("Please enter the Stock Price you want to see: ");
		String stock = scanner.nextLine();


	}

}
