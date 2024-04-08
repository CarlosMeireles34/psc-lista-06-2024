package vetores;

public class Exercicio03 {
	public static void main(String[] args) {
		char[] vet = {'a','b','c', 'd', 'e','f','g','h','i','j'};
		int count = 0;

		
		for(int i=0; i < vet.length; i++){
			if((vet[i] != 'a') && (vet[i] != 'e') && (vet[i] != 'i') &&
					(vet[i] != 'o') && (vet[i] != 'u')){
					count = count + 1;
					System.out.println(vet[i]);
			}
		}
		
		System.out.print("Número de Consoantes Lidas: ");
		System.out.print(count);
		
	}
}
