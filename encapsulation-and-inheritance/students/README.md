### Exercicio
Construa a classe Pessoa que é caraterizada pelo nome, número do cartão do cidadão e
data de nascimento. Comece com as definições seguintes e defina novos métodos a
incluir na interface pública da classe.

    public class Pessoa {
        private String nome;
        private int cc;
        private Data dataNasc;
        // .....
    }

    public class Data{
        private int dia;
        private int mes;
        private int ano;
        // .....
    }

Crie métodos adequados para permitir a inicialização dos seus atributos no momento
de criação de cada objeto:

    Data d = new Data(5, 10, 1988);
    Pessoa p = new Pessoa("Ana Santos", 98012244, d);

Construa uma nova classe Aluno, derivada da classe Pessoa, acrescentando os métodos e
atributos necessários para aceder e guardar o número mecanográfico (int) e a data de
inscrição (Data) na instituição de ensino. Note que o número mecanográfico deverá ser
atribuído automaticamente (e sequencialmente a partir do 100) quando da criação de
um novo aluno.
A estrutura simplificada das classes deverá ser a seguinte:

    public class Pessoa {
        //...
        String getName(){...}   // retorna o nome da pessoa
    }

    public class Aluno extends Pessoa {
        //... definição de atributos
        Aluno(String iNome, int iBI, Data iDataNasc, Data iDataInsc);
        Aluno(String iNome, int iBI, Data iDataNasc);
        // nota: neste caso deve assumir a data atual
        int getNMec() {...}    // retorna o número mecanográfico
        // ... acrescentar métodos necessários
    }

Crie a classe Bolseiro, derivada da classe Aluno, que deverá incluir um atributo com o
montante mensal da bolsa. Defina novos métodos ou reescreva os métodos que julgar
conveniente. Acrescente métodos get/set associados ao valor da bolsa.
Implemente o método "@Override public String toString(){}" em todas as classes. Por exemplo, para a classe Pessoa, deve retornar:
"Ana Santos, CC: 98012244 Data: 5/10/1988"
Teste o trabalho desenvolvido com o seguinte programa:

    public class Test {
        public static void main(String[] args) {
            Aluno al = new Aluno ("Andreia Melo", 9855678, new Data(18, 7, 1990), new Data (1, 9, 2018));
            Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new Data(11, 5, 1985));
            bls.setBolsa(1050);
            System.out.println(“Aluno:” + al.getName());
            System.out.println(al);
            System.out.println(“Bolseiro:” + bls.getName() + ", NMec: " + bls.getNMec() + ", Bolsa:" + bls.getBolsa());
            System.out.println(bls);
        }
    }
