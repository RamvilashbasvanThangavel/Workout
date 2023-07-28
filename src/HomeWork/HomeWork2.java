package HomeWork;

public class HomeWork2 {
	public static void main(String[] args) throws UserException,Exception {
		String userId = "Ramvilash";
		String uid = "Ramvilash";
		String password = "Ram1804";
		String up = "ram1804";
		System.out.println("Hai");
		try {
		if (userId.equals(uid) && password.equals(up)) {
			System.out.println("Welcome");
		} else {
            throw new Exception("Enter corret id and password");
		}
		}
		catch(UserException ue){
			System.out.println("enter");
		}
		finally {
		System.out.println("Thank you");
		}
	}
}
