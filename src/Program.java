public class Program {
	public String main(int numero)
	{
		String resp;
		resp = "";
		if (numero % 3 != 0 && numero % 5 != 0)
		{
			resp=Integer.toString(numero);                     
		}
		else
		{
			if(numero % 3 == 0)
			{
				resp= resp + "Fizz";
			} 
			if(numero % 5 == 0)
			{
				resp = resp + "Buzz";
			}
		}
		return resp;
	    
	}		
}


