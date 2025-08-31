package StreamBeginners;

public class City {
	
	private String cityName;
	private int population;
	
	public City() {
		super();
		
	}
	
	public City(String cityName, int population) {
		super();
		this.cityName = cityName;
		this.population = population;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	

}
