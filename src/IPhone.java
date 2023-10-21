import java.util.Scanner;

class IPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao iPhone Simulator!");
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Tocar música");
            System.out.println("2. Ligar para alguém");
            System.out.println("3. Navegar na Internet");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a leitura do número.

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    ReprodutorMusical.tocarMusica(musica);
                    break;
                case 2:
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    AparelhoTelefonico.ligarParaAlguem(numero);
                    break;
                case 3:
                    System.out.print("Digite a URL da página da web: ");
                    String url = scanner.nextLine();
                    NavegadorInternet.navegarNaInternet(url);
                    break;
                case 4:
                    System.out.println("Saindo do iPhone Simulator.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
    }
}

class ReprodutorMusical {
    public static void tocarMusica(String musica) {
        System.out.println("Tocando a música: " + musica);
    }
}

class AparelhoTelefonico {
    public static void ligarParaAlguem(String numero) {
        System.out.println("Ligando para " + numero);
    }
}

class NavegadorInternet {
    public static void navegarNaInternet(String url) {
        System.out.println("Navegando na Internet, abrindo a URL: " + url);
    }
}
