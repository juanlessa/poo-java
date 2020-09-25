### Exercicio

Pretende-se construir um sistema de informação simplificado para a gestão da
biblioteca de uma universidade. A biblioteca contém um catálogo de livros e um
conjunto de utilizadores (só alunos). Todos os utilizadores são identificados pelo seu
número mecanográfico, nome e curso. Os livros são caraterizados por um ID
(numérico e sequencial, começando em 100), título e tipo de empréstimo
(CONDICIONAL ou NORMAL). Comece com as definições seguintes:

    public class Utilizador {
        private String nome;
        private int nMec;
        private String curso;
        // .....
    }

    public class Livro {
        private int id;
        private String titulo;
        private String tipoEmprestimo;
        // .....
    }

Faça uso de modificadores de acesso para garantir que todos os atributos das classes
não estão acessíveis do exterior. Em caso de necessidade, defina novos atributos para
responder aos requisitos do enunciado. Teste as classes desenvolvidas com o programa
seguinte:

    import java.util.ArrayList;
    public class Main {
        public static void main(String[] args) {
            // Para o conjunto de Livros vamos criar um vetor de 10 posições
            // Este vetor tem uma dimensão fixa pelo que se for necessário guardar
            // mais livros, teremos de criar um vetor de maior dimensão.
            Livro catalogo[] = new Livro[10];
            catalogo[0] = new Livro("Java 8", "CONDICIONAL");
            catalogo[1] = new Livro("POO em Java 8");
            catalogo[2] = new Livro("Java para totós", "NORMAL");
            System.out.println("ID = " + catalogo[1].getId() + ", "+ catalogo[1].getTitulo());
            catalogo[2].setTipoEmprestimo("CONDICIONAL");
            for (int i = 0; i < catalogo.length; i++) { 
                // usando o indice do vector
                if (catalogo[i] != null) 
                    // porque o vector catalogo não está cheio
                    System.out.println(catalogo[i]);
                }
            }
            // Para o conjunto de utilizadores usamos a classe java.util.ArrayList
            // É uma implementação de um vetor com tamanho variável
            ArrayList<Utilizador> alunos = new ArrayList<>();
            alunos.add(new Utilizador("Catarina Marques", 80232, "MIEGI"));
            alunos.add(new Utilizador("Joao Silva", 90123, "LEI"));
            alunos.get(1).setnMec(80123);
            for (Utilizador u : alunos) {
                // usando foreach
                System.out.println(u);
            }
        }
    }

Cujo resultado da sua execução deve ser:

    ID = 101, POO em Java 8
    Livro 100; Java 8; CONDICIONAL
    Livro 101; POO em Java 8; NORMAL
    Livro 102; Java para totós; CONDICIONAL
    Aluno: 80232; Catarina Marques; MIEGI
    Aluno: 80123; Joao Silva; LEI
