import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
	//Login
	
	System.out.println("welcome to Login");
	Scanner pWord = new Scanner(System.in);
	for (int i = 0 ; i<3; i+=1) {
	System.out.println("Please insert the Password");
	String passWord = pWord.nextLine();
	if (passWord.equals(SecretInfo.getPassword())){
		System.out.println("you are logged in");
		break;}
	else if(i==2) {
		System.out.println("You have used all your tries");
	}else if(i==1)
		System.out.println("you have 1 more attemp left");

	else
		System.out.println("you have 2 more attemps left");
	
	}
	
	pWord.close();
	}

}
