public class MenInBlackLevel2 extends MenInBlack {

    public MenInBlackLevel2(AlienPack alienpack) {
        super(alienpack);

    }

    public void kill(){
        int random = 0;
        Alien[] aliens = alienpack.getAliens();
        for(int i = 0; i < alienpack.getAliens().length ;i++){
            score += aliens[i].getScore();
            random = (int)(Math.random()*10);
           // System.out.println(random);
            if(random % 2 == 0){
                score -= 2;
            }

        }
    }
}
