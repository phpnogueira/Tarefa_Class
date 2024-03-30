public class FichaAlunos {

    private int  matricula;

    private String nome;

    private String endereco;

    private int nota1 =9;

    private int nota2 = 7;

    private int nota3 = 8;

    private int nota4 = 10;
    /**
     * variável que calcula a média
     */
    private int media = (nota1+nota2+nota3+nota4) / 4;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getMedia() {
        return media;
    }

    /**
     *
     * sem função já qye a média é calculada de forma automática
     */
    public void setMedia(int media) {
        this.media = media;
    }
}
