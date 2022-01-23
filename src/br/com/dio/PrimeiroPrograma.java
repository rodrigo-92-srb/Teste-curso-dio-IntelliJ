package br.com.dio;

import br.com.dio.model.Cachorro;
import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        /*int a=5, b=3;
        System.out.println("Hello World!!! " + (a+b));*/

        Gato gato= new Gato();
        System.out.println(gato);

        Cachorro cao1 = new Cachorro("Kika", "preto", 15);
        Cachorro cao2 = new Cachorro("Dara", "marrom", 11);
        System.out.println(cao1.getNome());
        System.out.println(cao2.getNome());
    }
}
