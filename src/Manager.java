import java.util.Scanner;

public class Manager {
    Scanner sc = new Scanner(System.in);
    TextReader textReader = new TextReader();
    Player player;

    public Manager(){
        textReader.reader();
        Player p = new Player(sc.nextLine());

    }



}
