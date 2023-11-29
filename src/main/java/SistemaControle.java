import java.util.ArrayList;
import java.util.List;

public class SistemaControle {

    private List<Tarefa> tarefas;

    public SistemaControle(){
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void novaTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaTarefa(){
        if (!tarefas.isEmpty()){
            Tarefa tarefa = this.tarefas.get(this.tarefas.size()-1);
            tarefa.cancelar();
        }
    }

}
