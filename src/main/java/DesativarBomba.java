public class DesativarBomba implements Tarefa {

    private Bomba bomba;

    public DesativarBomba(Bomba bomba){
        this.bomba = bomba;
    }
    @Override
    public void executar() {
        this.bomba.desligarBomba();
    }

    @Override
    public void cancelar() {
        this.bomba.acionarBomba();
    }
}
