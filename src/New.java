
public class New {

	public static void main(String[] args) {
		int daring =1, brave = 5; 
		
		int cunning = 2;
		int clever = 3;
		int kind = 4;
		
		
		boolean isMuggleBorn = true;
		String studentName = "";
		int studentTrait = -1;
		boolean isContinue = true;
		
		
		
		// hard coding
	//	int studentTrait = 2;
		
		// for (int i = 0; < 300; i++) {
			while(isContinue){
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter student name: ");
			studentName = sc.nextLine();
			
			System.out.println("Enter student personality trait from the following: ");
			System.out.println("1-daring, 2-cunning, 3-clever");
			studentTrait = sc.nextInt();
			
			System.out.println("Are you muggle born?");
			
		}
			
		
		if (studentTrait == daring || studentTrait == brave && !isMuggleBorn) {
			System.out.println("You belong in Gryfyndor");
		} else if (!isMuggleBorn && studentTrait == cunning ) {
			System.out.println( "You belong in Slytherine");
		
		} else if (studentTrait ==clever) {
			System.out.println("You belong in RavenClaw");
		} else { 
			System.out.println("You belong in Hufflepuff");
		}
System.out.println("Do you want to continue? true/fale");
isContinue =sc.nextBoolean();

	}
System.out.println("Sorting Hat ceremony is complete! Bye!");

}


	}

}
