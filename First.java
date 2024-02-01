import java.io.FileNotFoundException;
import java.io.PrintStream;

public class First {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream("C:\\Users\\ACER\\Documents\\DIT(GH)\\res.txt"));
        System.out.println("Hello java");
    }
}
