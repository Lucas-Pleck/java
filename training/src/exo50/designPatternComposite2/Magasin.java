package exo50.designPatternComposite2;

public class Magasin implements ConsolidatedTurnover{
    private int turnover;

    public Magasin(int turnover) {
        this.turnover = turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    @Override
    public int getTurnover() {
        return this.turnover;
    }
}
