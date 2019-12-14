package temperaturegui;

public class Temperature {

	private Double temperature = 0.0;
	private Double result = 0.0;	

	public Temperature() {
		super();
	}

	public Temperature(Double temperature, Double result) {
		super();
		this.temperature = temperature;
		this.result = result;
	}
	
	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public Double fahrenheitToCelsius(Double fahrenheit) {
		result = ((fahrenheit - 32) * 5 / 9);
		return result;
	}

	public Double celsiusToFahrenheit(Double celsius) {
		result = ((celsius * 9) / 5) + 32;
		return result;
	}

	public Double kelvinToCelsius(Double kelvin) {
		result = (kelvin - 273.15);
		return result;
	}

	public Double celsiusToKelvin(Double celsius) {
		result = (celsius + 273.15);
		return result;
	}

	public Double kelvinToFahrenheit(Double kelvin) {
		result = kelvinToCelsius(kelvin);
		result = celsiusToFahrenheit(result);
		return result;
	}

	public Double fahrenheitToKelvin(Double fahrenheit) {
		result = fahrenheitToCelsius(fahrenheit);
		result = celsiusToKelvin(result);
		return result;
	}

}
