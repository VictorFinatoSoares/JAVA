package sessoes.Estudo2908;

public class ConversorTemperatura {
    public static void main(String[] args) {
        System.out.printf("%.2f°F%n",celsiusParaFahrenheit(0));
        System.out.printf("%.2f°F%n",celsiusParaFahrenheit(100));
        System.out.printf("%.2f°C%n",fahrenheitParaCelsius(32));

    }

    public static double celsiusParaFahrenheit(double tempCelsius) {
        return (tempCelsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double tempFahrenheit) {
        return (tempFahrenheit - 32) * 5/9;
    }
}
