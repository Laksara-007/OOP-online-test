public class Main {
    public static void main(String[] args) {


        AlienPack pack1 = new AlienPack(5);
        pack1.addAlien(new MarshmalloAlien(), 0);
        pack1.addAlien(new OgreAlien(), 1);
        pack1.addAlien(new SnakeAlien(), 2);
        pack1.addAlien(new OgreAlien(), 3);
        pack1.addAlien(new MarshmalloAlien(), 4);

        MenInBlack AgentK = new MenInBlack(pack1);
        AgentK.kill();
        System.out.println("Your score is : "+AgentK.getScore());

        MenInBlackLevel2 AgentK2 = new MenInBlackLevel2(pack1);
        AgentK2.kill();
        System.out.println("level 2 score is : "+AgentK2.getScore());



    }


}
