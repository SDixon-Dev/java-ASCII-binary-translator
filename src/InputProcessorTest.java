/**
 * A custom test program for the InputProcessor class.
 *
 * This program tests:
 * ASCII-to-binary conversion,
 * Binary-to-ASCII conversion,
 * Palindrome detection.
 *
 * Each test compares the actual result returned with an expected result,
 * displays whether the test passed.
 *
 * @author seand
 */

public class InputProcessorTest
{
    /**
     * Main entry point for the test program.
     *
     * @param args unused command-line arguments
     */
   
	public static void main(String[] args)
    {
        System.out.println("InputProcessor Test Program");
        System.out.println("===========================");

        testAsciiToBinary();
        testBinaryToAscii();
        testPalindrome();

        System.out.println("\nAll tests completed.");
    }

    /**
     * Tests the asciiToBinary method using several ASCII strings.
     */
    private static void testAsciiToBinary()
    {
        System.out.println("\nASCII-to-Binary Tests");
        System.out.println("---------------------");

        runStringTest(
            "Convert a single uppercase letter",
            "01000001",
            InputProcessor.asciiToBinary("A")
        );

        runStringTest(
            "Convert a single lowercase letter",
            "01100001",
            InputProcessor.asciiToBinary("a")
        );

        runStringTest(
            "Convert two characters",
            "0100100001101001",
            InputProcessor.asciiToBinary("Hi")
        );

        runStringTest(
            "Convert text containing a space",
            "010000010010000001000010",
            InputProcessor.asciiToBinary("A B")
        );

        runStringTest(
            "Convert a number character",
            "00110001",
            InputProcessor.asciiToBinary("1")
        );

        runStringTest(
            "Convert an empty string",
            "",
            InputProcessor.asciiToBinary("")
        );
    }

    /**
     * Tests the binaryToAscii method using several binary strings.
     */
    private static void testBinaryToAscii()
    {
        System.out.println("\nBinary-to-ASCII Tests");
        System.out.println("---------------------");

        runStringTest(
            "Convert binary to uppercase letter",
            "A",
            InputProcessor.binaryToAscii("01000001")
        );

        runStringTest(
            "Convert binary to lowercase letter",
            "a",
            InputProcessor.binaryToAscii("01100001")
        );

        runStringTest(
            "Convert binary to two characters",
            "Hi",
            InputProcessor.binaryToAscii("0100100001101001")
        );

        runStringTest(
            "Convert binary containing a space",
            "A B",
            InputProcessor.binaryToAscii(
                "010000010010000001000010"
            )
        );

        runStringTest(
            "Convert binary to number character",
            "1",
            InputProcessor.binaryToAscii("00110001")
        );

        runStringTest(
            "Convert an empty binary string",
            "",
            InputProcessor.binaryToAscii("")
        );
    }

    /**
     * Tests the isPalindrome method using palindrome and
     * non-palindrome strings.
     */
    private static void testPalindrome()
    {
        System.out.println("\nPalindrome Tests");
        System.out.println("----------------");

        runBooleanTest(
            "Check an even-length palindrome",
            true,
            InputProcessor.isPalindrome("abba")
        );

        runBooleanTest(
            "Check an odd-length palindrome",
            true,
            InputProcessor.isPalindrome("hannah")
        );

        runBooleanTest(
            "Check a single-character string",
            true,
            InputProcessor.isPalindrome("a")
        );

        runBooleanTest(
            "Check a non-palindrome",
            false,
            InputProcessor.isPalindrome("rob")
        );

        runBooleanTest(
            "Check another non-palindrome",
            false,
            InputProcessor.isPalindrome("java")
        );

        runBooleanTest(
            "Check an empty string",
            true,
            InputProcessor.isPalindrome("")
        );
    }

    /**
     * Compares an expected string with an actual string and
     * displays the test result.
     *
     * @param testName a description of the test
     * @param expected the expected string result
     * @param actual the actual string returned by the method
     */
    private static void runStringTest(
        String testName,
        String expected,
        String actual
    )
    {
        System.out.println("\nTest: " + testName);
        System.out.println("Expected: \"" + expected + "\"");
        System.out.println("Actual:   \"" + actual + "\"");

        if (expected.equals(actual))
        {
            System.out.println("Result: PASSED");
        }
        else
        {
            System.out.println("Result: FAILED");
        }
    }

    /**
     * Compares an expected boolean with an actual boolean and
     * displays the test result.
     *
     * @param testName a description of the test
     * @param expected the expected boolean result
     * @param actual the actual boolean returned by the method
     */
    private static void runBooleanTest(
        String testName,
        boolean expected,
        boolean actual
    )
    {
        System.out.println("\nTest: " + testName);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);

        if (expected == actual)
        {
            System.out.println("Result: PASSED");
        }
        else
        {
            System.out.println("Result: FAILED");
        }
    }
}