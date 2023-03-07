import java.util.Scanner;

/*  
 * Situação problema: Uma professora queria uma ajuda para se organizar melhor, para ver as notas dos alunos dela.
 * pois queria saber com mais facilidade: a quantidade de alunos na sala, a maior e a menor nota, a media e as notas ordenadas
 */


public class App {

/**
 *
 * @author lucas Bandeira
 */
    public static void main(String[] args) throws Exception {
        
        Scanner Ler = new Scanner(System.in);
            
            System.out.print("nome materia: " );
            String materia = Ler.nextLine();
            
            System.out.print("digite a quantidade de alunos na sala: ");
            int aluno = Ler.nextInt();
            
            int [] salaDeAula = new int[aluno];
            
            for(int i = 0; i<salaDeAula.length; i++){
                System.out.print("digite a nota do " + (i+1) + "° aluno: ");
                salaDeAula[i] = Ler.nextInt();
            }

            Ler.close();
            
            Vetor vetor = new Vetor(materia, salaDeAula);
            
            System.out.println("\nRESUMO:\n");
            System.out.println("Nome da materia: " + vetor.getMateria());
            System.out.println("quantidade de alunos na sala de aula: " + aluno);
            System.out.println("maior nota da sala: " + vetor.maiorNota(salaDeAula));
            System.out.println("menor nota da sala: " + vetor.menorNota(salaDeAula));
            vetor.ordenar(salaDeAula);
            vetor.imprimirOrdenado(salaDeAula);
            System.out.println("a media da sala foi: " + vetor.mediaAluno(salaDeAula));
    }
}
