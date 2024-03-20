package Dinamicas;
import ModeloEntidades.Organismo;
import java.util.List;
import java.util.Random;
public abstract class Eventos {
    private Random random = new Random();

    public void ocurrir() {
        int probabilidad = random.nextInt(100) + 1;
        if (probabilidad == 1) {
            realizarEvento();
        }
    }

    protected abstract void realizarEvento();
    }
