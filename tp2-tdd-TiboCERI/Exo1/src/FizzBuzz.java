public class FizzBuzz
{
	public String getResult(int x)
	{
		return(x == 0 ? Integer.toString(0) : (x%3 == 0 && x%5 == 0) ? "FizzBuzz" : x%3 == 0 ? "Fizz" : x%5 == 0 ? "Buzz" : Integer.toString(x)) ;
	}
}
