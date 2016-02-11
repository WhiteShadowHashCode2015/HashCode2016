package POC;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Command {


    public char Type;

    public String Args;


    public static Command  GenerateLoadCommand( int idWhareHouse, int countProduct, int idProduct){

        return new Command ('L',idWhareHouse+" "+idProduct+" "+countProduct);
    }

    public static Command  GenerateDeliverCommand( int idOrder, int countProduct, int idProduct){

        return new Command ('D',idOrder+" "+idProduct+" "+countProduct);
    }

    public String GetCommand(){
        return Type+" "+Args;
    }

    public Command(char type, String args) {
        Type = type;
        Args = args;
    }
}
