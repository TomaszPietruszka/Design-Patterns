package eu.designPatterns.builderexample;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Marcin Szewczyk, 14.01.2020
 */
public class BuilderMain {

    public static void main(String[] args) {
        Transfer transfer = new Transfer(
                "123456",
                "765432",
                BigDecimal.valueOf(315),
                "PLN",
                LocalDate.of(2020, 1, 18),
                "Za waciki",
                "ELIXIR",
                "Stefan",
                "Samoklęski Małe 21"
        );

        System.out.println("Wysłano przelew: " + transfer);
    }

}
