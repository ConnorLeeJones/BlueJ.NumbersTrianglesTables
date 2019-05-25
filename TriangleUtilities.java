 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String triangle = "";
        for (int i = 0; i < numberOfStars; i++)
            triangle += "*";
        return triangle;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++){
            triangle += getRow(i);
            triangle += "\n";
        }
        return triangle;
    }


    public static String getSmallTriangle() {
        String triangle = "";
        for (int i = 1; i <= 4; i++){
            triangle += getRow(i);
            triangle += "\n";
        }
        return triangle;
    }

    public static String getLargeTriangle() {
        String triangle = "";
        for (int i = 1; i <= 9; i++){
            triangle += getRow(i);
            triangle += "\n";
        }
        return triangle;
    }
}
