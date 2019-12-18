package corejava.decision_statement;

public class SwitchCase_Statements {

	public static void main(String[] args)
	{
		
		/*
		 * Switch-case:-->
		 * 		=> switch execute multiple decisions same
		 * 			as else if. only diff switch execute
		 * 			only selected case instead verifing
		 * 			every case. 
		 */		
		String month="feb";
		
		switch (month) 
		{
		case "jan":
			System.out.println("10% discount");
			break;
			
		case "feb":
			System.out.println("20% discount");
			break;
			
		case "mar":
			System.out.println("30% discount");
			break;

		default:
			break;
		}
		
		
		
		
		
		
		
		String browsername="chrome";
		switch (browsername) 
		{
		case "firefox":
			System.out.println("firefox browser launched");
			break;
			
		case "ie":
			System.out.println("ie browser launched");
			break;
			
		case "chrome":
			System.out.println("chrome browser launched");
			break;

		default: System.out.println("browser name mismatch");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
