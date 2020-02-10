public class Program {
	
	
	public String main(int numero)
	{
		if (numero % 3 != 0 && numero % 5 != 0)
		{
			return Integer.toString(numero);                     
		}
		else if (numero % 15 == 0) {
            return "FizzBuzz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        }
        return "Fizz";
 
	}		
}


