public class Bomba {

    private String id;
    private boolean ligada;

    public Bomba(String id){
        this.id = id;
    }

    public boolean isLigada(){
        return this.ligada;
    }

    public void acionarBomba(){
        this.ligada = true;
    }

    public void desligarBomba(){
        this.ligada = false;
    }
}
