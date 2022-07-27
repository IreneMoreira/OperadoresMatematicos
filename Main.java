
public class Main {


    public static void main(String[] args){

        int i; //exemplo correto;
        //int i; // variável com mesmo nome;
        int I; //variável diferente (Letra maiúcula) fora das boas práticas;
        //int 1a; //começando com número, fora das boas práticas;
        int _1a; //caracteres especiais, em alguns casos permitidos, mas FORA das boas práticas;
        int $aq; //caracteres especiais, em alguns casos permitidos, mas FORA das boas práticas;


        i = 5;  // deve adicionar valor inicial das variáveis;
        I = 5; // deve adicionar valor inicial das variáveis;
        _1a = 20; // deve adicionar valor inicial das variáveis;
        $aq = 7; // deve adicionar valor inicial das variáveis;

        final int j = 10; // variável "final" é uma constante (j = 10);
        //j = 15; //tentativa de mudar o valor de j. Não é possível mudar o valor da constante após definida;
        int asrn24678md; // esta definição é válida mas não usual;
        //int asrn246 78md; // espaço não é permitido na variável;
        int asrn2$4678_md = 10; //caracteres especiais, Fora das boas práticas (Com exceção as contantes);
        //int asrn2$46%78_md =10; //caracteres especiais, Fora das boas práticas;


        asrn24678md = 100;
        asrn2$4678md = 10;

        int quantidadeProduto = 50; // correta, iniciando com minúscula e usando o CamelCase;
        //int QuantidadeProduto; // errada, iniciando com maiúscula (não dá erro de compilação);
        final int NUMEROS_TENTATIVAS = 5; //variáveis "final" precisam seguir essa nomeclatura;
        //final int numerosTentativas = 5; //variável "final" não seguiu o padrão não gera erro de compilação);
        int QUANTIDADE_OPCOES = 25; // fora das boas práticas de java;
        //int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMEROS_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
