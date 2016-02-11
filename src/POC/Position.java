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
    
    
}
