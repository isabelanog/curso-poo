import java.util.Random;

public class SensorUmidade implements Sensor {
    private Random random = new Random();

    @Override
    public double lerValor() {
        return 40 + (90 - 40) * random.nextDouble();
    }

    @Override
    public boolean estaAtivo() {
        return true;
    }

}
