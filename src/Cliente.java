public class Cliente {
    
    //attributi
    private String nome;
    private String cognome;
    private int eta;
    private String sesso;


    //metodi costruttore 
    Cliente(String nome, String cognome, int eta, String sesso){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.sesso=sesso;
    }

    public Cliente(){
    
        this.nome="penne";
        this.cognome="righelli";
        this.eta=10;
        this.sesso="p";
    }


    public Cliente(Cliente that){
    
        this.nome=that.nome;
        this.cognome=that.cognome;
        this.eta=that.eta;
        this.sesso=that.sesso;
    }



    //metodi getter

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public int getEta(){
        return eta;
    }


    public String getSesso(){
        return sesso;
    }



    //metodi setter 

    public void setNoome (String nome){
        this.nome=nome;
    }

    public void setCognome(String cognome){
        this.cognome=cognome;
    }

    public void setEta(int eta){
        this.eta=eta;
    }

    public void setSesso(String sesso){
        this.sesso=sesso;
    }


    public String toString(){
        return "la persona si chiama: " +this.nome+this.cognome+this.sesso;
    }
    
    
    public boolean equals(Cliente that){
       boolean r=false;
       if(this.nome==that.nome&&this.cognome==that.cognome&&this.sesso==that.sesso){
           r=true;
       }
       return r;
    }

}
