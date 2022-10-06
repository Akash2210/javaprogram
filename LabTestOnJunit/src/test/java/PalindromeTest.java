import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {
	//in this we are assigning many String values to check whether the string is palindrome or not
		@DisplayName(value="Checking String palindrome")
		@ParameterizedTest
		@ValueSource(strings  = {"abba","edde","zazazaz","tootootoot"})
		public void isPalindromeTest(String str)
		{
			assertTrue(Palindrome.isPalindrome(str));
		}
	}


