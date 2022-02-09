package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class User {

    private static final int MINIMUM_TOKEN_NUMBER = 3;
    private static final String NOT_NULL_ALLOWED = "공백은 허용되지 않습니다";

    public List<String> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String[] userInputTokens = userInput.split(" ");

        if (userInputTokens.length < MINIMUM_TOKEN_NUMBER) {
            throw new IllegalArgumentException(NOT_NULL_ALLOWED);
        }
        for (String token: userInputTokens) {
            if (token.equals("")) {
                throw new IllegalArgumentException(NOT_NULL_ALLOWED);
            }
        }
        return Arrays.asList(userInputTokens);
    }
}
