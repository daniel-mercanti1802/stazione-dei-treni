public class Treni {

    
    //attributi
    private int velocita;
    private int lunghezza;
    private int passeggeri;


    //metodi costruttore 
    Treni (int velocita, int lunghezza, int passaggeri){
        this.velocita=velocita;
        this.lunghezza=lunghezza;
        this.passeggeri=passeggeri;
    }


    public Treni (){
        this.velocita=50;
        this.lunghezza=5;
        this.passeggeri=100;
    }


    public Treni (Treni that){
        this.velocita=that.velocita;
        this.lunghezza=that.lunghezza;
        this.passeggeri=that.passeggeri;
    }


    //metodi getter

    public int getVelocita(){
        return velocita;
    }

        public int getLunghezza(){
        return lunghezza;
    }

        public int getPasseggeri(){
        return passeggeri;
    }



    //metodi setter

    public void setVelocita (int velocita){
        this.velocita=velocita;
    }


    public void setLunghezza (int lunghezza){
        this.lunghezza=lunghezza;
    }

    public void setPassegeri (int passeggeri){
        this.passeggeri=passeggeri;
    }

//ciai  ggg gg


    public String toString(){
        return "il treno contiene:  " +this.passeggeri+ " passeggeri";
    }
    
    
    public boolean equals(Treni that){
       boolean r=false;
       if(this.velocita==that.velocita&&this.lunghezza==that.lunghezza&&this.passeggeri==that.passeggeri){
           r=true;
       }
       return r;
    }

}


