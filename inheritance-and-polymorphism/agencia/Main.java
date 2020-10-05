import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Carro c1 = new Carro('A', "gasolina"); 
		Carro c2 = new Carro('B', "gasolina"); 
		Carro c3 = new Carro('C', "diesel"); 
		Carro c4 = new Carro('D', "gasolina"); 
		Carro c5 = new Carro('E', "diesel"); 
		Carro c6 = new Carro('F', "gasolina");
		
		Alojamento a1 = new Alojamento("003", "Santiago", "av Santiago 32", 15);
		Alojamento a2 = new Alojamento("005", "Crasto", "rua Dantas 32", 32.5);
		Alojamento a3 = new Alojamento("019", "Santa Tecla", "rua colera 41", 10.3);
		Alojamento a4 = new Alojamento("043", "Loid", "av Vasco 12", 21.9);

		Apartamento ap1 = new Apartamento("023", "Sacramento", "av Mario Sacramento 117", 60.5, 5);
		Apartamento ap2 = new Apartamento("286", "Complexo Feudal", "rua da Fonte 7", 50.5, 2);
		Apartamento ap3 = new Apartamento("119", "Santa Marci", "rua coimbra 43", 100.3, 7);
		Apartamento ap4 = new Apartamento("343", "loterys", "av Vespia 152", 71.2, 12);
		
		QuartoHotel qh1 = new QuartoHotel("555", "Imperial", "av Sete Bicas 23", 7.2, "single");
		QuartoHotel qh2 = new QuartoHotel("752", "Epire", "av Shortcuts 238", 12.7, "double");
		QuartoHotel qh3 = new QuartoHotel("555", "Celebrari", "av Cascais 30", 17.0, "twin");
		QuartoHotel qh4 = new QuartoHotel("555", "Elegance", "av Dois Padres 66", 26.15, "triple");
		
		Agencia ag1 = new Agencia("Airbnb", "rua do Alecrim 14");
		Agencia ag2 = new Agencia("SeteSete", "rua da Marmota 20");
		ag2.addCarro(c1); 
		ag2.addCarro(c3);
		ag2.addCarro(c5);
		ag2.addAlojamento(a1);
		ag2.addAlojamento(a3);
		ag2.addAlojamento(ap1);
		ag2.addAlojamento(ap3);
		ag2.addAlojamento(qh1);
		ag2.addAlojamento(qh3);
		ag1.addCarro(c2);
		ag1.addCarro(c4);
		ag1.addCarro(c6);
		ag1.addAlojamento(a2);
		ag1.addAlojamento(a4);
		ag1.addAlojamento(ap2);
		ag1.addAlojamento(ap4);
		ag1.addAlojamento(qh2);
		ag1.addAlojamento(qh4);
		
		
		ArrayList<Agencia> agencias = new ArrayList<>();
		agencias.add(ag1);
		agencias.add(ag2);

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
			for(int i=0; i < agencias.size(); i++) {
				System.out.printf("%s - %s\n", i+1, agencias.get(i));
			}
			System.out.println("\nC - Criar Agencia\nR - Remover Agencia\nS - Sair");
			String act;
			do {
				System.out.print(">>> ");
				act = scan.next();
			} while ( !( (act.matches("[a-zA-Z]+") && (act.toUpperCase().equals("S") || act.toUpperCase().equals("C") ||act.toUpperCase().equals("R"))) || (act.matches("[0-9]+") && (Integer.parseInt(act) > 0 && Integer.parseInt(act) <= agencias.size()))) );
			if (act.toUpperCase().equals("S")) {
				break;
			}else if(act.toUpperCase().equals("R")) {
				System.out.println("Qual agencia deseja remover?");
				for(int i=0; i < agencias.size(); i++) {
					System.out.printf("%s - %s\n", i+1, agencias.get(i));
				}
				do {
					System.out.print(">>> ");
					act = scan.next();
				} while (!(act.matches("[0-9]+") && (Integer.parseInt(act) > 0 && Integer.parseInt(act) <= agencias.size())));
				agencias.remove(Integer.parseInt(act) - 1);
			}else if (act.toUpperCase().equals("C")) {
				Scanner s = new Scanner(System.in);
				System.out.println("Criar uma Agencia:");
				System.out.print("nome da agencia: ");
				String n = s.nextLine();
				System.out.print("endereço: ");
				String e = s.nextLine();
				agencias.add(new Agencia(n, e));
			}else{
				int indx = Integer.parseInt(act) - 1;
				while (true){
					System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
					System.out.println(agencias.get(indx));
					System.out.println(agencias.get(indx).getAloj());
					System.out.println(agencias.get(indx).getCar());
					System.out.println("\n0 - Voltar\n1 - Alugar um Carro\n2 - Alugar um Alojamento\n3 - Entregar um Carro\n4 - Entregar um Alojamento");

					do {
						System.out.print(">>> ");
						act = scan.next();
					} while(!(act.matches("[0-4]"))); 
					if (Integer.parseInt(act) == 0) {
						break;

					}else if (Integer.parseInt(act) == 1){
						System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
						String pat = "";
						System.out.println("V - Voltar");
						for (int i = 0; i < agencias.get(indx).getCar().size(); i++) {
							Carro c = agencias.get(indx).getCar().get(i);
							if (c.getDisponivel()) {
								System.out.printf("%s - %s\n", i, agencias.get(indx).getCar().get(i));
								pat = pat + i + "|";
							}
						}
						if (pat.equals("")) {
							System.out.println("nao ha carros para alugar");
							continue;
						}
						do{
							System.out.print(">>> ");
							act = scan.next();
							if (act.matches("V|v")) {
								break;
							}
						} while (!(act.matches(pat)));
						if (act.matches("v|V")) {
							continue;
						}
						agencias.get(indx).getCar().get(Integer.parseInt(act)).levantar();

					}else if (Integer.parseInt(act) == 2){
						System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
						String pat = "";
						System.out.println("V - Voltar");
						for (int i = 0; i < agencias.get(indx).getAloj().size(); i++) {
							Alojamento a = agencias.get(indx).getAloj().get(i);
							if (a.getDisponibilidade()) {
								System.out.printf("%s - %s\n", i, agencias.get(indx).getAloj().get(i));
								pat = pat + i + "|";
							}
						}
						if (pat.equals("")) {
							System.out.println("nao ha alojamentos para alugar");
							continue;
						}
						do{
							System.out.print(">>> ");
							act = scan.next();
							if (act.matches("v|V")) {
								break;
							}
						} while (!(act.matches(pat)));
						if (act.matches("v|V")) {
							continue;
						}
						agencias.get(indx).getAloj().get(Integer.parseInt(act)).checkIn();

					}else if (Integer.parseInt(act) == 3){
						System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
						String pat = "";
						System.out.println("V - Voltar");
						for (int i = 0; i < agencias.get(indx).getCar().size(); i++) {
							Carro c = agencias.get(indx).getCar().get(i);
							if (!c.getDisponivel()) {
								System.out.printf("%s - %s\n", i, agencias.get(indx).getCar().get(i));
								pat = pat + i + "|";
							}
						}
						if (pat.equals("")) {
							System.out.println("nao ha carros para devolver");
							continue;
						}
						do{
							System.out.print(">>> ");
							act = scan.next();
							if (act.matches("V|v")) {
								break;
							}
						} while (!(act.matches(pat)));
						if (act.matches("v|V")) {
							continue;
						}
						agencias.get(indx).getCar().get(Integer.parseInt(act)).entregar();

					}else if (Integer.parseInt(act) == 4){
						System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
						String pat = "";
						System.out.println("V - Voltar");
						for (int i = 0; i < agencias.get(indx).getAloj().size(); i++) {
							Alojamento a = agencias.get(indx).getAloj().get(i);
							if (!a.getDisponibilidade()) {
								System.out.printf("%s - %s\n", i, agencias.get(indx).getAloj().get(i));
								pat = pat + i + "|";
							}
						}
						if (pat.equals("")) {
							System.out.println("nao ha alojamentos para alugar");
							continue;
						}
						do{
							System.out.print(">>> ");
							act = scan.next();
							if (act.matches("V|v")) {
								break;
							}
						} while (!(act.matches(pat)));
						if (act.matches("v|V")) {
							continue;
						}
						System.out.println("de uma nota de 0 a 5 para este alojamento:");
						String nota;
						do{
							System.out.print(">>>");
							nota = scan.next();
						}while	(!nota.matches("5(.[0]+)?|[0-4](.[0-9]+)?"));
						agencias.get(indx).getAloj().get(Integer.parseInt(act)).checkOut(Double.parseDouble(nota));
				
					}
				}
			}

		}
		
		scan.close();


		
	}

}
