
public class Vetor {
    String nomeMateria;
    private int maior = 0;
    private int menor = 0;

    public Vetor(String nomeMateria, int[] vetor) {
        this.nomeMateria = nomeMateria;

    }

    public int maiorNota(int[] vetor) {
        this.maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public int menorNota(int[] vetor) {
        menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public int buscaMaiorNota(int[] vetor) {
        int fim;
        fim = vetor.length - 1;
        this.maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                this.maior = vetor[i];
            }
        }
        return -1;
    }

    public int[] ordenar(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int j = i;
            while (j > 0 && vetor[j - 1] > vetor[j]) {
                int aux = vetor[j];
                vetor[j] = vetor[j - 1];
                vetor[j - 1] = aux;
                j--;
            }
        }
        return vetor;
    }

    public int mediaAluno(int[] vetor) {
        int somaNotas = 0;
        int media;
        for (int i = 0; i < vetor.length; i++) {
            somaNotas += vetor[i];
        }
        media = somaNotas / vetor.length;

        return media;
    }

    public String getMateria() {
        return this.nomeMateria;

    }

    public void imprimirOrdenado(int[] vetor) {
        System.out.print("notas ordenadas");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
        System.out.println();
    }

}
