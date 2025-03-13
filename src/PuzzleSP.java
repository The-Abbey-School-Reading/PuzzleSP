
public class PuzzleSP {
    public static void main(String[] args) {
        String again = "y";
        int score;
        while (again.equals("y")) {
            Console.write("Press Enter to start a standard puzzle or enter name of file to load: ");
            String filename = Console.readLine();
            Puzzle myPuzzle;
            if (filename.length() > 0) {
                myPuzzle = new Puzzle(filename + ".txt");
            } else {
                myPuzzle = new Puzzle(8, (int)(8 * 8 * 0.6));
            }
            score = myPuzzle.attemptPuzzle();
            Console.writeLine("Puzzle finished. Your score was: " + score);
            Console.write("Do another puzzle? ");
            again = Console.readLine().toLowerCase();
        }
        Console.readLine();
    }
}
