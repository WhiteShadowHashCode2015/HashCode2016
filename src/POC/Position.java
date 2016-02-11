package POC;

/**
 * Created by alexisk on 11/02/2016.
 */
public class Position {

    public int Row;

    public int Column;

    public Position(int row, int column) {
        Row = row;
        Column = column;
    }

	@Override
	public String toString() {
		return "Position [Row=" + Row + ", Column=" + Column + "]";
	}
    
    
    public static double distance(Position p1, Position p2){
    	double distX = Math.abs((double)p1.Row - (double)p2.Row);
    	double distY = Math.abs((double)p1.Column - (double)p2.Column);
    	return Math.ceil(Math.sqrt(distX*distX + distY*distY));
    }
}
