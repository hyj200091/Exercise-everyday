package Exercise4;

public class Eif {
    public static void main(String[] args) {
        MoveAp moveAp = new MoveAp();
        SingleAp singleAp = new SingleAp();
        System.out.println("精灵一边在"+moveAp.Move()+ ",同时还在"+ singleAp.Single());
    }
}
