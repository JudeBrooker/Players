import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Player> Players = new ArrayList<>();
        Players.add(new Player("Bob", 9));
        Players.add(new Player("Steve", 1));
        Players.add(new Player("Jeff", 26));
        Players.add(new Player("Tom", 7));
        Players.add(new Player("Adam", 14));
        System.out.println(Players.toString());

        for(int i=0;i<=Players.size()-2;i++){
            for(int j=1;j<=Players.size()-1-i;j++){
                if(Players.get(j-1).getScore() > Players.get(j).getScore()){
                    Player temp = Players.get(j);
                    Players.set(j, Players.get(j-1));
                    Players.set(j-1, temp);
                }
            }
        }

        System.out.println(Players.toString());
    }
}
