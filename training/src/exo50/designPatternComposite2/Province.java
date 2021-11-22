package exo50.designPatternComposite2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Province implements ConsolidatedTurnover{
    private Collection children;

    public Province(){
        children = new ArrayList();
    }

    public  void add(Ville ville){
        children.add(ville);
    }

    public void remove(Ville ville){
        children.remove(ville);
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
