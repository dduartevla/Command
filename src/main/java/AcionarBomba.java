public class AcionarBomba  implements Tarefa {

    private Bomba bomba;

    public AcionarBomba(Bomba bomba){
        this.bomba = bomba;
    }

    @Override
    public void executar() {
        this.bomba.acionarBomba();
    }

    @Override
    public void cancelar() {
        this.bomba.desligarBomba();
    }
}
