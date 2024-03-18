import java.util.Scanner;

public class Manager {
    private String direction;
    Scanner sc = new Scanner(System.in);
    TextReader textReader = new TextReader();
    Player player;

    public Manager(){
        textReader.reader();
        Player p = new Player(sc.nextLine());
        map();

    }

    public void map(){
        System.out.println(".  .  .");
        System.out.println(".  .  .");
        System.out.println(".  .  .");
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public TextReader getTextReader() {
        return textReader;
    }

    public void setTextReader(TextReader textReader) {
        this.textReader = textReader;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
