package MethodsExercises;

public class message {

	public static void getMessage(int oclock) {
		switch (oclock) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			messageGoodMorning();
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			messageGoodAfternoon();
			break;
		case 19:
		case 20:
		case 21:
			messageGoodEvening();
			break;
		case 22:
		case 23:
		case 24:
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			messageGoodNight();
			break;
		default:
			System.out.println("Invalid time.");
			break;
		}
	}
	
	public static void messageGoodMorning() {
		System.out.println("Good Morning!");
	}
	public static void messageGoodAfternoon() {
		System.out.println("Good Afternoon!");
	}
	public static void messageGoodEvening() {
		System.out.println("Good Evening!");
	}
	public static void messageGoodNight() {
		System.out.println("Good Night!");
	}

}
