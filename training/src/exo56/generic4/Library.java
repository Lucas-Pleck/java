package exo56.generic4;

import java.util.ArrayList;
import java.util.List;

public class Library<E> {
    private List<E> ressources =new ArrayList<>();

    public void addMedia(E m){
        ressources.add(m);
    }



    public E retrieveLast(){
        int size =ressources.size();
        if(size>0){
            return  ressources.get(size-1);
        }
        return null;
    }
}
