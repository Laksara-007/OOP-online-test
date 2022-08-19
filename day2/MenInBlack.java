public class MenInBlack {
    protected int score = 0;
    protected AlienPack alienpack;

    public MenInBlack(AlienPack alienpack) {
        this.alienpack = alienpack;
    }
    public void kill(){
        Alien[] aliens = alienpack.getAliens();
        for(int i = 0; i < alienpack.getAliens().length ;i++){
            score += aliens[i].getScore();
        }
    }
    public int getScore() {
        return score;
    }
}
