public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(2.1, 3.5);
        Ponto p2 = new Ponto(2.5, 10);
        Ponto p3 = new Ponto(2.1, 3.5);
        
        System.out.println("p1: "+ p1);
        System.out.println("p2: "+ p2);
        System.out.println("p3: "+ p3);
        System.out.println("Distancia p1 e p2: " + p1.distancia(p2));
        System.out.println("Equals p1 p2: " + p1.equals(p2));
        System.out.println("Equals p1 p3: " + p1.equals(p3));

        Circulo c1 = new Circulo(5, p1);
        Circulo c2 = new Circulo(7, p2);
        Circulo c3 = new Circulo(5, p1);


        System.out.println("c1: "+ c1);
        System.out.println("c2: "+ c2);
        System.out.println("c3: "+ c3);
        System.out.println("Area c1: "+c1.area());
        System.out.println("Perimetro c1: "+ c1.perimetro());
        System.out.println("Instersecta c1 c2: "+ c1.intersecta(c2));
        System.out.println("Equals c1 c2 "+ c1.equals(c2));
        System.out.println("Equals c1 c3 "+ c1.equals(c3));

        Triangulo t1 = new Triangulo(3,4,5);
        Triangulo t2 = new Triangulo(3,4,4);
        Triangulo t3 = new Triangulo(3,3,4);
        Triangulo t4 = new Triangulo(4,4,3);

        System.out.println("t1: "+t1);
        System.out.println("t2: "+t2);
        System.out.println("t3: "+t3);
        System.out.println("t4: "+t4);
        System.out.println("Area t1: "+t1.area());
        System.out.println("Perimetro t1: "+t1.perimetro());
        System.out.println("Equals t1 t2: "+ t1.equals(t2));
        System.out.println("Equals t2 t3: "+ t2.equals(t3));
        System.out.println("Equals t2 t4: "+ t2.equals(t4));

        Retangulo r1 = new Retangulo(2.5,7.5);
        Retangulo r2 = new Retangulo(7.5,2.5);
        Retangulo r3 = new Retangulo(2.5,7.5);

        System.out.println("r1 "+r1);
        System.out.println("r2 "+r2);
        System.out.println("r3 "+r3);
        System.out.println("Area r1 "+r1.area());
        System.out.println("Perimetro r1 "+r1.perimetro());
        System.out.println("Equals r1 r2 "+r1.equals(r2));
        System.out.println("Equals r1 r3 "+r1.equals(r3));
        
    }

}
