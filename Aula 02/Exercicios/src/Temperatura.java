public class Temperatura {
    private double grausCelsius;

    public void setTemperatura(double graus) {
        if (graus >= -273.15 && graus <= 1000) {
            this.grausCelsius = graus;
        } else {
            System.out.println("Temperatura inválida.");
        }
    }

    public double getTemperatura() {
        return grausCelsius;
    }

    public void exibirTemperaturaFahrenheit() {
        double fahrenheit = (grausCelsius * 9 / 5) + 32;
        System.out.printf("Temperatura: %.2f ºF%n", fahrenheit);
    }
}
