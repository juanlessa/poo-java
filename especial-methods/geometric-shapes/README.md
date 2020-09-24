### Exercicio
  Respeitando os conceitos de encapsulamento, implemente classes que permitam modelar as seguintes formas geométricas:
  
  * Círculo, caracterizado por um centro e raio;
  * Triângulo, caracterizado pela dimensão dos seus lados (lado1, lado2 e lado3);
  * Retângulo, caracterizado por comprimento e altura.
  
  Garanta ainda as seguintes especificações:
  
  a) construa a classe Ponto;  
    public class Ponto {
        private double x;
        private double y;
        public Ponto(double x, double y) { .. }
        public getX() { .. }
        public getY() { .. }
        public String toString { .. }
        // ..
        }
  b) crie classes que representem cada uma das figuras geométricas, implementando construtores e métodos adequados para cada classe.
  c) adicione todos os métodos especiais importantes ( toString(), equals(), get...(), set...(), ... );
  d) implemente um método para calcular a área de cada tipo de figura;
  e) implemente um método para calcular o perímetro de cada tipo de figura;
  f) implemente um método para verificar se os dois círculos se intercetam;
  g) implemente um programa que lhe permita testar todas as classes criadas.
