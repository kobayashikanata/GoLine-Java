package core.helpers;
public class ArrayHelper {
    public static int[][] copyMatrix(int[][] src){
        int[][] copy = new int[src.length][src[0].length];
        for(int i = 0; i < src.length; i++)
        {
            for(int j = 0; j < src[i].length; j++)
            {
                copy[i][j] = src[i][j];
            }
        }
        return copy;
    }
    
    public static <T> boolean inRange(int x, int y, T[][] array){
    	return x >= 0 && y >= 0 && array.length > x && array[x].length > y;
    }
}
