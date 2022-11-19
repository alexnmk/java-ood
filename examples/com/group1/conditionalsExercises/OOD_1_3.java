import javax.sound.midi.Soundbank;

public class OOD_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.1
		String alienColour = "green";
		if (alienColour == "green") {
			System.out.println("You earned 5 points");
		}
		//1.2
		if (alienColour == "red") {
			System.out.println("You earned 10 points");
		}
		if (alienColour == "yellow") {
			System.out.println("You earned 15 points");
		}
		//1.3
		if (alienColour == "green") {
			System.out.println("You earned 5 points");
		} else if (alienColour == "red") {
			System.out.println("You earned 10 points");
		} else if (alienColour == "yellow") {
			System.out.println("You earned 15 points");
		} else {
			System.out.println("invalid colour");
		}
		//1.4
		int age = 2;
		if (age < 2) {
			System.out.println("You are a baby");
		} else if (age >= 2 && age < 4) {
			System.out.println("You are a toddler");
		} else if (age >= 4 && age < 13) {
			System.out.println("You are a child");
		} else if (age >= 13 && age < 20) {
			System.out.println("You are a teenager");
		} else if (age >= 20 && age < 65) {
			System.out.println("You are a working age adult");
		} else {
			System.out.println("You are an pensioner");
		}
		//1.5
		int salary = 75000;
		if (salary > 150000) {
			System.out.println("Tax rate is 45%");
		} else if (salary > 50000 && salary <= 150000) {
			System.out.println("Tax rate is 40%");
		} else if (salary > 12500 && salary <= 50000) {
			System.out.println("Tax rate is 20%");
		} else {
			System.out.println("Tax rate is 0%");
		}
		
		//2.1
		int accountNumber = 99999999;
		if (accountNumber >= 10000000 && accountNumber <= 99999999) {
			System.out.println("valid account number");
		}else {
			System.out.println("invalid account number");
		}
		//2.2
		String flightCode = "BA5678";
		if (flightCode.substring(0,2).equals("BA")) {
			System.out.println("British Airways");
		} else {
			System.out.println("Not British Airways");
		}
		//2.3
		switch (flightCode.substring(0,2)) {
		case "LH":
		case "BA":
		case "FR":
			System.out.println("valid airline");
			break;

		default:
			System.out.println("unrecognised or invalid airline");
			break;
		}
		//2.4
		if (!flightCode.substring(0,2).equals("LH")||!flightCode.substring(0,2).equals("BA")||!flightCode.substring(0,2).equals("FR")) {
			System.out.println("unrecognised or invalid airline");
		}
		//2.5
		boolean validPassport = true;
		boolean validDrivingLicence = false;
		if (validDrivingLicence || validPassport) {
			System.out.println("id verified");
		} else {
			System.out.println("unable to verify id");
		}
		//2.6
		boolean hasLicense = true;
		boolean isDead = false;
		boolean hasPassedEyeTest = true;
		if (hasPassedEyeTest || hasLicense || !isDead) {
			System.out.println("can still drive");
		} else {
			System.out.println("not licenced to drive");
		}
	}

}
