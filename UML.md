```mermaid
classDiagram
    ReprodutorMusical <|-- IPhone 
    NavegadorInternet <|-- IPhone
    AparelhoTelefonico <|-- IPhone
    
    class ReprodutorMusical {
        +void tocar() 
        +void pausar()
        +String selecionarMusica(musica: String)
    }

    class NavegadorInternet {
        +String exibirPagina(aba: String) 
        +String adicionarNovaAba(novaAba: String)
        +String atualizarPagina(aba: String)
    }

    class  AparelhoTelefonico{
        +void ligar() 
        +void atender()
        +void iniciarCorreioVoz()
    }

    class IPhone {
        -String musica
        -String aba
        -String novaAba

        IPhone(musica: String, aba: String)
        +void imprimirDados()    
    }
