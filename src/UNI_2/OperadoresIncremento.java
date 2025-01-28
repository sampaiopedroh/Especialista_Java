package UNI_2;

public class OperadoresIncremento {
	public static void main(String[] args) {
		int totalDownloads = 10;
		System.out.println("Total de Downloads: " + totalDownloads);

		// Isso:
		// totalDownloads = totalDownloads +1;

		// Ou isso:
		// totalDownloads += 1;
		
		// É igual a isso:
		// totalDownloads++;
		// System.out.println("Novo total de Downloads: " + totalDownloads);

		// Pós Fixada (incrementa depois):
		int novoTotalDownloads = totalDownloads++;
		System.out.println("Novo total de Downloads (pós fixado): " + novoTotalDownloads);
		System.out.println("Variável totalDownloads: " + totalDownloads);

		// Pré Fixada (incrementa antes):
		int maisNovoTotalDownloads = ++totalDownloads;
		System.out.println("Novo total de Downloads (pré fixado): " + maisNovoTotalDownloads);
		System.out.println("Variável totalDownloads: " + totalDownloads);
	}
}
