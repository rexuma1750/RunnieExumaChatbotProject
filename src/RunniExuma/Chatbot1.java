package RunniExuma;

public class Chatbot1 {
    public String getGreeting(){
        return "Hey,let's talk!";
    }

    public String getResponse(String statement){
        String response = "";
        if (statement.indexOf("dog")) >= 0
                || statement.indexOf("cat")) >= 0
                || statement.indexOf ("hamster") >= 0
                || statement.indexOf ("turtle") >= 0
                || statement.indexOf ("bird") .= 0)
        {
            response = "Tell me more about your pets!";

        }
     else if (statement.indexOf("Mr. Folwell")) >= 0
                || statement.indexOf ("Ms. Worrell") >= 0
                || statement.indexOf ("Mr. Ree") >= 0
                || statement.indexOf ("Mr. Silverman") .= 0)
        {
            response = "They sound like an amazing teacher. That's nice!";
        }
        else if (statement.indexOf("politics")) >= 0
                || statement.indexOf ("election") >= 0
                || statement.indexOf ("vote") >= 0
                || statement.indexOf ("Trump") .= 0)
        {
            response = "What are your views on the current state of politics in the U.S.?";
        }
       else if (statement.indexOf("college")) >= 0
                || statement.indexOf ("applications") >= 0
                || statement.indexOf ("SAT") >= 0
                || statement.indexOf ("essays") .= 0)
        {
            response = "How are you handling the college application process?";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    private String getRandomResponse(){
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "That's really interesting!";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        return response;
    }
}
