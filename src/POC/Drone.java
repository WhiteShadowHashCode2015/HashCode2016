package POC;

import javafx.geometry.Pos;

import java.util.List;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Drone {


    public int Id;

    public Position Position;

    public List<Product> PayLoad;

    public int MaxWeight;



    public List<Command> Commands;


    public int GetWeight(){
        int result =0;
        for (Product p : PayLoad) {
            result+= p.Weight;
        }
        return result;
    }

    public String GetCommands(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <Commands.size(); i++) {
            builder.append(Commands.get(i).GetCommand());
            builder.append("\n");
        }

        return builder.toString();
    }


    public Drone(int id, int maxWeight, POC.Position position, List<Product> payLoad) {
        Id = id;
        MaxWeight = maxWeight;
        Position = position;
        PayLoad = payLoad;
    }
    public Drone(int maxWeight, List<Command> commands, List<Product> payLoad, int id, POC.Position position) {
        MaxWeight = maxWeight;
        Commands = commands;
        PayLoad = payLoad;
        Id = id;
        Position = position;
    }
}
