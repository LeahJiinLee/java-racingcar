import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class User {
    public List<String> getUserInput(){
        Scanner scanner= new Scanner(System.in);
        String []userInputTokens;
        String userInput= scanner.nextLine();

        userInputTokens=userInput.split(" ");

        if (userInputTokens.length<3){
            throw new IllegalArgumentException("공백은 허용되지 않습니다");
        }
        return Arrays.asList(userInputTokens);
    }

}
