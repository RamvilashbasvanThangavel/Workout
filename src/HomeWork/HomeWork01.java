package HomeWork;

public class HomeWork01 {
	public static void main(String[] args) throws Message {
		String userId = "Ramvilash";
		String uid = args[0];
		String password = "Ram1804";
		String up = args[1];
		int dob = 14101994;
		int udob = Integer.parseInt(args[2]);
		System.out.println("Hai");
		if (userId.equals(uid) && password.equals(up)) {
			System.out.println("Welcome");
		} else {
			throw new Message("user id and PassWord Not Matching ");
		}
		if (dob == udob) {
			System.out.println("login success wait a minute");
		} else {
			throw new Message("Enter Correct Date of Birth");
		}

	}
}
