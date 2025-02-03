
class CustomException extends Exception {


	public CustomException(String string) {
	}

	public static void main(String[] args) {
		
	
	{
		try {
	throw new CustomException("This is custom exception");
	}
	catch(Exception e) {
		System.out.println("exception is caught");
		e.printStackTrace();
//		System.exit(0);
	}
		finally {
			System.out.println("executing finnaly block");
			
		}
	
	}
	}

}
