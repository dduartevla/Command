import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaControleTest {

    SistemaControle sistemaControle;
    Bomba bomba;

    @BeforeEach
    void setUp(){
        sistemaControle = new SistemaControle();
        bomba = new Bomba("bomba01");
    }

    @Test
    void deveAcionarBomba(){
        Tarefa tarefa = new AcionarBomba(bomba);
        sistemaControle.novaTarefa(tarefa);

        assertEquals(true,bomba.isLigada());
    }

    @Test
    void deveDesativarBomba() {
        Tarefa tarefa = new DesativarBomba(bomba);
        sistemaControle.novaTarefa(tarefa);

        assertEquals(false, bomba.isLigada());
    }

    @Test
    void deveCancelarAcionamentoBomba(){
        Tarefa tarefa1 = new AcionarBomba(bomba);
        Tarefa tarefa2 = new DesativarBomba(bomba);
        Tarefa tarefa3 = new AcionarBomba(bomba);

        sistemaControle.novaTarefa(tarefa1);
        sistemaControle.novaTarefa(tarefa2);
        sistemaControle.novaTarefa(tarefa3);

        sistemaControle.cancelarUltimaTarefa();

        assertEquals(false, bomba.isLigada());
    }
}