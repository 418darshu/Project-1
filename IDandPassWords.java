import java.util.HashMap;

public class IDandPassWords {

	
		
		HashMap<String,String> logininfo = new HashMap<String,String>();
		
		IDandPassWords(){
			
			logininfo.put("bro","pizza");
			logininfo.put("bromethus","password");
			logininfo.put("pizza","orange");
		}
		
		public HashMap getLogininfo(){
			
			return logininfo;
		}

	}


