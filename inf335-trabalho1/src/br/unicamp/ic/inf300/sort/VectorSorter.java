package br.unicamp.ic.inf300.sort;

public class VectorSorter {
	
	private static final int VALORPARACALCCONTEUDO = 100;
	private static final int TAMANHOVECTOR = 10;
	private static final int PRIMEIRAPOSICAO = 0;

	public static void main(String[] args) {
	
		int[] numbers = parseParameters(args);
	
		System.out.print("Input: ");
		printVector(numbers);
		sort(numbers);
		System.out.print("Sorted: ");
		printVector(numbers);
	}
	
	public static void sort(int[] numbers) {
		BubbleSort.sort(numbers);
	}
	
	public static int[] parseParameters(String[] args) {
		int[] numbers;
		if(args.length > 0) {
			numbers = new int[args.length];
			for(int k=0; k<args.length; k++) {
				numbers[k] = Integer.parseInt(args[k]);
			}
		}else {
			numbers = generateRandomVector(TAMANHOVECTOR);
		}
		return numbers;
	}
	
	private static int[] generateRandomVector(int size) {

		int[] vector = new int[size];

		for (int i = 0; i < vector.length ; i++) {
			vector[i] = (int) (Math.random()*VALORPARACALCCONTEUDO + 1);
		}
		
		return vector;
	}
	
	public static void printVector(int[] numbers) {
		System.out.print("[ ");
		System.out.print(numbers[PRIMEIRAPOSICAO]);
		
		int i = 0;
		do {
			i++;
			System.out.print(", ");
			System.out.print(numbers[i]);
		}while(i < numbers.length - 1);

		System.out.println(" ]");
	}
}
