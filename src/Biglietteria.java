public class Biglietteria {
    
    //attributi
    private int prezzo;
    private int durata;
    private char linea;
    
    //metodi costruttore
    Biglietteria (int prezzo, int durata, char linea){
        this.prezzo=prezzo;
        this.durata=durata;
        this.linea=linea;
    }


    public Biglietteria (){
        this.prezzo=50;
        this.durata=5;
        this.linea='C';
    }


    public Biglietteria (Biglietteria that){
        this.prezzo=that.prezzo;
        this.durata=that.durata;
        this.linea=that.linea;
    }



    //metodi getter

    public int getPrezzo(){
        return prezzo;
    }

    public int getDurata(){
        return durata;
    }

    public char getLinea(){
        return linea;
    }





    //metodi setter

    public void setPrezzo (int prezzo){
        this.prezzo=prezzo;
    }

    public void setDurata(int durata){
        this.durata=durata;
    }

    public void setLinea(char linea){
        this.linea=linea;
    }



    public String toString(){
        return "il biglietto costa: " +this.prezzo+" euro";
    }
    
    
    public boolean equals(Biglietteria that){
       boolean r=false;
       if(this.prezzo==prezzo&&this.durata==that.durata&&this.linea==that.linea){
           r=true;
       }
       return r;
    }


}
