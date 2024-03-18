public class Comparing {

    private int cols = 3;
    private int rows = 3;
    private int tie;
    String numbers [][] = new String[rows][cols];



    public void winCondicion(){

        switch(){
            case (numbers[0][0].equals("x") && numbers[0][1].equals("x") && numbers[0][2].equals("x"))||(numbers[0][0].equals("o") && numbers[0][1].equals("o") && numbers[0][2].equals("o")):
            case (numbers[1][0].equals("x") && numbers[1][1].equals("x") && numbers[1][2].equals("x"))||(numbers[1][0].equals("x") && numbers[1][1].equals("x") && numbers[1][2].equals("x")):
            case numbers[2][0] == "x" && numbers[2][1] == "x" && numbers[2][2] == "x":
            case numbers[0][0] == "x" && numbers[1][0] == "x" && numbers[2][0] == "x":
            case numbers[0][1] == "x" && numbers[1][1] == "x" && numbers[2][1] == "x":
            case numbers[0][2] == "x" && numbers[1][2] == "x" && numbers[2][2] == "x":
            case numbers[0][0] == "x" && numbers[1][1] == "x" && numbers[2][2] == "x":
            case numbers[0][2] == "x" && numbers[1][1] == "x" && numbers[2][0] == "x":
            default:
                tie++;
                if(tie == 8){
                    System.out.println("Its a tie");
                }
        }
    }
}

