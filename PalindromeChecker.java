public class PalindromeChecker
{
	private String word;

	public PalindromeChecker (String w)
	{
		word = w;
	}
	
	public boolean isPalindrome ()
	{
		String backwards = "";
		
		for(int i = word.length(); i > 0; i--)
			backwards += word.substring(i - 1, i); 
		
		return backwards.equalsIgnoreCase(word);
	}

	public static void main (String[] args)
	{
		PalindromeChecker run = new PalindromeChecker(args[0]);
		System.out.print(run.isPalindrome());
	}
}