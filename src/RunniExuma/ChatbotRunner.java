package RunniExuma;

import java.util.Scanner;

public class ChatbotRunner {
    public static void main(String[] args)
    {
        Chatbot1 beyonce = new Chatbot1();

        System.out.println (beyonce.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (beyonce.getResponse(statement));
            statement = in.nextLine();
        }
    }


}
