import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		IDandPassWords idandPassWords = new IDandPassWords();
		
	
		
		LoginPage loginPage = new LoginPage(idandPassWords.getLogininfo());
	}

}
