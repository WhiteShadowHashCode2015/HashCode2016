package POC;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Command {


    public char Type;

    public String Args;



    public String GetCommand(){
        return Type+" "+Args;
    }

    public Command(char type, String args) {
        Type = type;
        Args = args;
    }
}
