package exo65.stream;

import exo51.observer1.Observer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Batiment> batimentList = new ArrayList<>();
        Random randomNbr = new Random();
        List<String> villes = Arrays.asList("mons", "liege", "bruxelles", "waterloo", "charleroi", "nivelles", "tubize");


        for (int i = 0; i < 100; i++) {
            Batiment batiment = new Batiment(randomNbr.nextInt(1000), randomNbr.nextInt(100000), randomNbr.nextInt(100), villes.get(randomNbr.nextInt(villes.size())), TypeBatiment.values()[randomNbr.nextInt(3)]);
            batimentList.add(batiment);
        }
        System.out.println(batimentList);

        List<Batiment> appartementList = batimentList.stream()
                .filter(b -> b.getType().equals(TypeBatiment.APPARTEMENT))
                .toList();

        System.out.println(appartementList);

        List<Batiment> batimentSansAppartDePlusDe5000Euros = batimentList.stream().filter(b -> !b.getType().equals(TypeBatiment.APPARTEMENT)|| b.getPrix()<50000).toList();
        System.out.println(batimentSansAppartDePlusDe5000Euros);

        System.out.println(batimentList.stream().mapToInt(Batiment::getPrix).average().orElse(0));

        batimentList.stream().filter(b->b.getType().equals(TypeBatiment.MAISON)).filter(b->b.getSurface()>400).forEach(b->b.setPrix((int) (b.getPrix()*1.5)));
        System.out.println(batimentList);

        batimentList.stream().filter(b->b.getLocalite().startsWith("c")||b.getLocalite().startsWith("C")).forEach(b->b.setLocalite(b.getLocalite().toUpperCase(Locale.ROOT)));
        System.out.println(batimentList);

        List<Batiment> batiments = batimentList.stream().sorted(Comparator.comparingInt(b -> b.getPrix() / b.getSurface())).toList();
        System.out.println(batiments);



    }
}
