public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    private String musica, aba, novaAba;
    
    
    public IPhone(String aba, String musica) {
        this.aba = aba;
        this.musica = musica;
    }
    
    public String getMusica() {
        return musica;
    }
    
    public void setMusica(String musica) {
        this.musica = musica;
    }
    
    public void setAba(String aba) {
        this.aba = aba;
    }

    public String getAba() {
        return aba;
    }

    public String getNovaAba() {
        return novaAba;
    }

    public void setNovaAba(String novaAba) {
        this.novaAba = novaAba;
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public String exibirPagina(String aba) {
        return ("Página sendo exibida: " + getAba());
    }

    @Override
    public String adicionarNovaAba(String novaAba) {
        this.novaAba = novaAba;
        return novaAba;
    }

    @Override
    public String atualizarPagina(String aba) {
        return ("Página atualizada: " + getAba());
    }

    @Override
    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public String selecionarMusica(String musica) {
        return getMusica();
    }
    
    public void imprimirDados() {
        System.out.println(" Música atual: " + getMusica() + 
                            "\n Aba atual: " + getAba() +
                            "\n Aba nova: " + getNovaAba());
    }
}
