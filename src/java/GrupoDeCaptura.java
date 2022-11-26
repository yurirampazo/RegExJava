package src.java;

public class GrupoDeCaptura {
  public static void main(String[] args) {
    //Captura de CPF e formatação de máscara

    String cpf = "438.037.804-15";
    String cpfSemMascara = "43803780415";

    System.out.println("CPF: " + cpf);
    System.out.println("CPF SEM MASCARA: " + cpfSemMascara);
    //O operador '?' indica que o caractere precedido por ele é opcional na expressão,
    // útil para busca de documentos com e sem máscara por exemplo.
    String cpfComMascara = cpf.replaceAll("(\\d\\d\\d).?(\\d\\d\\d).?(\\d\\d\\d)-?(\\d\\d)",
          "$1.$2.$3-$4");
    String cpfComMascara2 = cpfSemMascara.replaceAll("(\\d\\d\\d).?(\\d\\d\\d).?(\\d\\d\\d)-?(\\d\\d)",
          "$1.$2.$3-$4");

    System.out.println("\nCPF COM MÁSCARA: " + cpfComMascara);
    System.out.println("CPF COM MÁSCARA2: " + cpfComMascara2);

    String cpfOculto = cpfComMascara.replaceAll("\\.[\\d]{3}", ".***");

    System.out.println("CPF COM MÁSCARA E OCULTANDO CARACTERES INTERMEDIÁRIOS: " + cpfOculto);

  }
}

class GrupoDeCaptura2 {
  public static void main(String[] args) {
    //Captura de Data e formatação de máscara

    String data = "1995-12-20";
    String data2 = "1995/12/20";

    System.out.println("Data recebida: " + data);
    String dataFormatada = data.replaceAll("(\\d\\d\\d\\d)[\\-|\\/](\\d\\d)[\\-|\\/](\\d\\d)",
          "$3/$2/$1");

    // O operador PIPE indica que ao menos um dos caracteres divididos por ele é esperado:
    //Ex: Ou receberemos a data com '-' ou com '/', por iddo [\/|\-]
    String data2Formatada = data2.replaceAll("(\\d\\d\\d\\d)[\\-|\\/](\\d\\d)[\\/|\\-](\\d\\d)",
          "$3/$2/$1");


    System.out.println("\nData Formatada: " + dataFormatada);
    System.out.println("\nData2 Formatada: " + data2Formatada);
  }
}
