package application;

public class Operaciones {
//Formulas para temperaturas
// Se definen métodos estáticos para realizar las conversiones de temperatura entre Celsius, Fahrenheit y Kelvin.
    public static double CelsiusAFahrenheit(double grados) {
// Se utiliza la fórmula de conversión de Celsius a Fahrenheit: (grados * 9/5) + 32.
        // return se utiliza para devolver el resultado de la conversión al lugar donde se llamó el método.
        return (grados * 9.0 / 5.0) + 32;
    }
    public static double CelsiusAKelvin(double grados) {
        return grados + 273.15;
    }
    public static double FahrenheitACelsius(double grados) {
        return (grados - 32) * 5.0 / 9.0;
    }
    public static double FahrenheitAKelvin(double grados){
        return (grados - 32) * 5.0 / 9.0 + 273.15;
    }
    public static double KelvinACelsius(double grados) {
        return grados - 273.15;
    }
    public static double KelvinAFahrenheit(double grados) {
        return (grados - 273.15) * 9.0 / 5.0 + 32;
    }
}

//Formulas para medidas
  // public static double MetrosAPies(double metros) { return metros * 0.0254; }