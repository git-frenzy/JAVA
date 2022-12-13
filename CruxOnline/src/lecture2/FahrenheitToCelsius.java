package lecture2;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		int fmin = 0;
		int fmax = 300;
		int fstep = 20;
		int fcurrent = fmin;
		while (fcurrent <= fmax) {
			int celcius = (int) ((5.0 / 9) * (fcurrent - 32));
			System.out.println(fcurrent + "\t" + celcius);
			fcurrent = fcurrent + fstep;

		}
	}

}
