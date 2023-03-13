package one.digitalinnovation;

public class Main {

    public static void main(String[] args){

        ListaDuplaEncadeada<String> minhaListaDupla = new ListaDuplaEncadeada<>();

        minhaListaDupla.add("c1");
        minhaListaDupla.add("c2");
        minhaListaDupla.add("c3");
        minhaListaDupla.add("c4");
        minhaListaDupla.add("c5");
        minhaListaDupla.add("c6");
        minhaListaDupla.add("c7");

        System.out.println(minhaListaDupla);

        minhaListaDupla.remove(3);
        minhaListaDupla.add(3,"99");
        System.out.println(minhaListaDupla);

        System.out.println(minhaListaDupla.get(3));

    }
}
