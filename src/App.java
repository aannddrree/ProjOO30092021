import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setId(1);
        pessoa1.setNome("André Silva");
        pessoa1.setTelefone("16 9 88885555");
        pessoa1.setIdade(15);

        Pessoa pessoa2 = new Pessoa();

        pessoa2.setId(2);
        pessoa2.setNome("Bruna Silva");
        pessoa2.setTelefone("16 9 15411215");
        pessoa2.setIdade(20);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        System.out.println("*************************");
        for (Pessoa p: pessoas) {
            System.out.println(p);
            System.out.println("------------------");
        }
        System.out.println("*************************");
    }
}
