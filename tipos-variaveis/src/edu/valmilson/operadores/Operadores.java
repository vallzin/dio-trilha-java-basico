package edu.valmilson.operadores;
public class Operadores {

    public static void main(String[] args) {
        String  nomeCompleto = "Linguagem " + "JAVA";

        System.out.println("\n"+nomeCompleto);
        
        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1 + 1 +  1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" +  1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" +  "1" + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }
}