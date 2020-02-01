package eu.designPatterns.adaptertask;

import java.util.List;

public class AdapterTaskMain {
    public static void main(String[] args) {
        CitiesProvider citiesProvider = new CitiesProvider();
        List<City> cities = citiesProvider.getCities();

        System.out.println(cities);


        // tu pojawia się klient A, który chce listę nazw miast. Użyj adaptera i wyświetl zwrócone dane

        // Klient B - dostarcz mu mapę (klucz - nazwa miasta, wartość - populacja)

        // klient C oczekuje listy nazw miast posortowanej malejąco wg ich populacji
    }
}
