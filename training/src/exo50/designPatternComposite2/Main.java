package exo50.designPatternComposite2;

public class Main {
    public static void main(String[] args) {



        Magasin magasin1 = new Magasin(15000);
        Magasin magasin2 = new Magasin(25000);
        Magasin magasin3 = new Magasin(5000);
        Magasin magasin4 = new Magasin(18000);
        Ville tubize = new Ville();
        tubize.add(magasin1);
        tubize.add(magasin2);
        Ville waterloo =new Ville();
        waterloo.add(magasin3);
        waterloo.add(magasin4);

        Province brabant = new Province();
        brabant.add(tubize);
        brabant.add(waterloo);
        Pays belgique =new Pays();
        belgique.add(brabant);

        System.out.println("belgique : "+belgique.getTurnover());

        System.out.println("brabant : "+brabant.getTurnover());

        System.out.println("tubize : "+tubize.getTurnover());

        System.out.println("waterloo : "+waterloo.getTurnover());


    }
}
