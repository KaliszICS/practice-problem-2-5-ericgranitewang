public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void insertionSort(char[] characters) {
		for (int i = 1; i < characters.length; i++) {
			char element = characters[i];
			int index = i;
			for (int j = i - 1; j >= 0 && characters[j] > element; j--) {
				characters[j + 1] = characters[j];
				index = j;
			}
			characters[index] = element;
		}
	}
}
