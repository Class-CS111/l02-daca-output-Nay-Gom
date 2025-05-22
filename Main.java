// PARTNER NAME:
// PARTNER NAME:
// CS111 SECTION #:
// DATE: 

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
		char sex;

		String birthMonth;
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, validDay, validMonth, validYear, expireMonth, expireDay, expireYear;


		//INPUT SECTION

		surname = "GOMEZ";
		givenName = "NAYAN";
		category = "C09";
		cardNum = "SRC9876543210";
		birthCountry = "Mexico";
		termsAndConditions = "None";
		sex = 'F';

		birthMonth = "JAN";
		uscisNum1 =123;
		uscisNum2 = 456;
		uscisNum3 = 789;
		birthDay = 1;
		birthYear = 1970;
		validDay = 2;
		validMonth = 2;
		validYear = 2020;
		expireMonth =2;
		expireDay = 2;
		expireYear = 2020;




		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )   	" + givenName + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_        	" + uscisNum1 + "-" + uscisNum2 + "-" + uscisNum3 + "    " + category + "        " + cardNum + "");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + birthCountry + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termsAndConditions + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`      	"  + birthDay + " " + birthMonth + " " + birthYear + "      " + sex + "");
		System.out.println("║                       Valid From:     " + validMonth + "/" + validDay + "/" + validYear + "");
		System.out.println("║                       Card Expires:   " + expireMonth + "/" + expireDay + "/" + expireYear + "");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}