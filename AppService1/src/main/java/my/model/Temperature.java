package my.model;

public class Temperature {
	private double fahrenheit;
	private double celsius;
	public double getCelsius() {
		return celsius;
	}
	public void setCelsius(float celsius) {
		this.celsius = celsius;
	}
	public double getFahrenheit() {
		return fahrenheit;
	}
	public void setFahrenheit(float fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	public void random() {
		this.fahrenheit = Math.random()*100;
	}
	
	public void convertF2C() {
		celsius = (fahrenheit - 32)*5/9; 
		// Keep 1 decimal only
		celsius = (int)(celsius*10)/10.0;
	}
	
}
