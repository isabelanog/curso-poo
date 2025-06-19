import java.util.Random;

public class SensorTemperatura implements Sensor {
    private Random random = new Random();

    @Override
    public double lerValor() {
        return 15 + (30 - 15) * random.nextDouble();
    }

    @Override
    public boolean estaAtivo() {
        return true;
    }

}
