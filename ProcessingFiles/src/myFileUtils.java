import com.Exceptions.FooRunTimeException;

public class myFileUtils {

	public int subtract10FromLargeNumber(int number)throws FooRunTimeException{
		if(number<10) {
		
			throw new FooRunTimeException("the number passed was Smaller than 10");
		}
		return number-10;
		
	}
}
