public class Main {
    /**
     *
     * @author Philip Nogueira
     */
    public static void main(String[] args) {
        FichaAlunos fichaAlunos = new FichaAlunos();
        fichaAlunos.setMatricula(1715698);
        fichaAlunos.setEndereco("rua 24");
        fichaAlunos.setNome("Philip");
        System.out.println("Matricula: " + fichaAlunos.getMatricula());
        System.out.println("Nome: " + fichaAlunos.getNome());
        System.out.println("Endereço: " + fichaAlunos.getEndereco());
        System.out.println("Média:" + fichaAlunos.getMedia());
        if(fichaAlunos.getMedia() <= 7){
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado!");
        }
    }
}