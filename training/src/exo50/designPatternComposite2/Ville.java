package exo50.designPatternComposite2;

import exo49.designPatternComposite.Composant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ville implements ConsolidatedTurnover{
    private Collection children;

    public Ville(){
        children = new ArrayList();
    }

    public  void add(Magasin magasin){
        children.add(magasin);
    }

    public void remove(Magasin magasin){
        children.remove(magasin);
    }

    public Iterator getChildren(){
        return  children.iterator();
    }

    public void setChildren(Collection children) {
        this.children = children;
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
