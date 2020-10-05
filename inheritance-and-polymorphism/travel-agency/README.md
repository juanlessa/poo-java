### Exercicio

Pretende-se desenvolver um programa que possibilite a gestão de alguns produtos
numa agência de viagens. As entidades principais neste sistema de informação são
alojamentos (apartamentos e quartos em hotel) e carros que se podem alugar. Devem
ser suportadas as caraterísticas seguintes:

* A agência de viagens, para além de conter um conjunto de alojamentos e um
conjunto de viaturas de aluguer, tem um nome (String) e um endereço (String);
* Um alojamento tem um código (String), nome (String), local (String), preço por
noite (double), disponibilidade (booleano) e avaliação (double, entre 1.0 e 5.0).
Deve permitir as operações de check-in e check-out.
* Um apartamento é um alojamento mas tem mais informação sobre o número de
quartos.
* Um quarto de hotel é um alojamento mas tem mais um campo que indica o tipo
(single, double, twin, triple).
* Um carro tem classe (char, de ‘A’ a ‘F’) e indicações se é de gasolina/diesel.
Deve permitir as operações de levantar e entregar.

Represente adequadamente todas estas entidades. Crie construtores, métodos set/get
que lhe pareçam adequados, bem como métodos que sejam fundamentais para cada
classe.
Teste as classes desenvolvidas usando um programa em que simule a interface com o(a)
funcionário(a) da agência (por exemplo, um menu), envolvendo necessariamente a
criação dos diversos objetos referidos acima. Simule algumas operações de reserva e
entregas e imprima no final a informação atual sobre a agência.

