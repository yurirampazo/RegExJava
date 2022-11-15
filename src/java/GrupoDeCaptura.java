package src.java;

public class GrupoDeCaptura {
  public static void main(String[] args) {
    //Captura de CPF e formatação de máscara

    String cpf = "438.037.804-15";

    System.out.println("CPF SEM MÁSCARA: " + cpf);
    String cpfComMascara = cpf.replaceAll("(\\d\\d\\d)(\\d\\d\\d)(\\d\\d\\d)(\\d\\d)",
          "$1.$2.$3-$4");

    System.out.println("\nCPF COM MÁSCARA: " + cpfComMascara);

    String cpfOculto = cpfComMascara.replaceAll("\\.[\\d]{3}", ".***");

    System.out.println("CPF COM MÁSCARA E OCULTANDO CARACTERES INTERMEDIÁRIOS: " + cpfOculto);

  }
}

class GrupoDeCaptura2 {
  public static void main(String[] args) {
    //Captura de Data e formatação de máscara

    String data = "1995-12-20";

    System.out.println("Data recebida: " + data);
    String dataFormatada = data.replaceAll("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)",
          "$3/$2/$1");

    System.out.println("\nData Formatada: " + dataFormatada);
  }
}
