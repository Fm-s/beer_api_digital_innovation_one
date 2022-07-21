package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerMinimalStockExceededException extends Exception {
    public BeerMinimalStockExceededException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement, informed minimal stock is exceeded: %s", id, quantityToDecrement));
    }
}
