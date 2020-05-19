import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Stringutils {
//extends object
    public static void main(String[] args) {

        System.out.println("Tell me something!");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

//http://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html#isNumeric-java.lang.CharSequence-
        System.out.println(StringUtils.isNumeric(userInput));

        System.out.println(StringUtils.swapCase(userInput));

        System.out.println(StringUtils.reverse(userInput));



    }
}
