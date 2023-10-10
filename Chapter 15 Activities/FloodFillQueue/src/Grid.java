. . .
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    . . .

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        Pair pair;
        int number = 1;
        pair = new Pair(row,column);
        Stack<Pair> pairstack = new Stack<>();
        pairstack.push(pair);
        while(pairstack.size()>0)
            {
               pair = pairstack.pop();
            if(pixels[pair.getRow()][pair.getColumn()] == 0)
            {
                pixels[pair.getRow()][pair.getColumn()] = number;
                number++;
            }
            if(pair.getRow() - 1 >= 0 && pixels[pair.getRow()-1][pair.getColumn()] == 0)
            {
                pairstack.push(new Pair(pair.getRow()-1,pair.getColumn()));
            }
            if(pair.getColumn() + 1 < SIZE && pixels[pair.getRow()][pair.getColumn()+1] == 0)
            {
                pairstack.push(new Pair(pair.getRow(),pair.getColumn()+1));
            }
            if(pair.getRow() + 1 < SIZE && pixels[pair.getRow()+1][pair.getColumn()] == 0)
            {
                pairstack.push(new Pair(pair.getRow() + 1,pair.getColumn()));
            }
            if(pair.getColumn() - 1 >= 0 && pixels[pair.getRow()][pair.getColumn()-1] == 0)
            {
                pairstack.push(new Pair(pair.getRow(),pair.getColumn()-1));
            }


            }
        
        
    }

    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%3d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
