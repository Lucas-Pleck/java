package exo50.designPatternComposite2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Pays implements ConsolidatedTurnover{
    private Collection children;

    public Pays(){
        children = new ArrayList();
    }

    public  void add(Province province){
        children.add(province);
    }

    public void remove(Province province){
        children.remove(province);
    }

    @Override
    public int getTurnover() {
        int result = 0;
        for (Iterator i = children.iterator(); i.hasNext(); ) {
            Object object = i.next();

            ConsolidatedTurnover consolidatedTurnover = (ConsolidatedTurnover) object;

            result += consolidatedTurnover.getTurnover();
        }
        return result;
    }
}
