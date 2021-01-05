package task02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Натисніть 1, щоб вивести всі записи з масиву");
		System.out.println("Натисніть 2, щоб засетити для всіх об'єктів даного масиву однаковий об'єкт");
	}

	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(5);
		int b = random.nextInt(5);
		Auto[][] auto = new Auto[a][b];
		String[] typeOfMaterial = { "alcantara", "leather", "wood", "metal", "plastic" };

		while (true) {

			Scanner sc = new Scanner(System.in);
			menu();

			switch (sc.next()) {

			case "1": {

				for (int c = 0; c < a; c++) {
					for (int d = 0; d < b; d++) {
						auto[c][d] = new Auto(random.nextInt(250), (random.nextInt(250) + 500),
								new Engine(random.nextInt(12)),
								new Rudder(random.nextDouble(), typeOfMaterial[random.nextInt(typeOfMaterial.length)]));

					}
				}

				System.out.println(Arrays.deepToString(auto));

				System.out.println();

				break;
			}
			case "2": {
				Auto autoChange = new Auto(random.nextInt(250), (random.nextInt(250) + 500),
						new Engine(random.nextInt(12)),
						new Rudder(random.nextDouble(), typeOfMaterial[random.nextInt(typeOfMaterial.length)]));

				for (Auto[] autoB : auto) {
					Arrays.fill(autoB, autoChange);

				}

				System.out.println(Arrays.deepToString(auto));

				System.out.println();

				break;
			}
			}
		}

	}
}