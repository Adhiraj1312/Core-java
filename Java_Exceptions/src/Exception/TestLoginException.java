package Exception;

public class TestLoginException { // case first when (Login = Admin)

	public static void main(String[] args) {

		String login = "Admin123";  // we will change the Admin to Admin123 if we want user not found .

		if (login == "Admin") {

			System.out.println("User Found ");
		} else {
			try {                                     // try and catch is used in second case when we need to solve the exception
				throw new LoginException();           // this is used in both the cases 

			} catch (LoginException e) {
				System.out.println("exception: " + e.getMessage());

			}

		}
	}
}
