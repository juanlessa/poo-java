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

