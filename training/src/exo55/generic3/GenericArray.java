package exo55.generic3;

public class GenericArray<E> {
    private E[] e;

    public GenericArray(E[] e) {
        this.e = e;
    }

    public E[] getE() {
        return e;
    }

    public void setE(E[] e) {
        this.e = e;
    }

    public void permutation(E e1, E e2) {
        int temp = -1;
        int temp2 = -1;
        for (int i = 0; i < e.length; i++) {
            if (this.e[i].equals(e1)) {
                temp = i;

            } else if (this.e[i].equals(e2)) {
                temp2 = i;
            }
        }
        if(temp!=-1&&temp2!=-1){
            E e3= e[temp];
            e[temp]=e[temp2];
            e[temp2]=e3;

        }
    }
}
