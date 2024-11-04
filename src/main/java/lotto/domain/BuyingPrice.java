package lotto.domain;

import lotto.util.BuyingPriceParser;
import lotto.util.BuyingPriceValidator;
import lotto.util.LottoValidator;

public class BuyingPrice {
    private final int price;
    private final BuyingPriceValidator validator;

    public BuyingPrice(String buyingPriceInput) {
        this.validator = new BuyingPriceValidator();

        validator.validate(buyingPriceInput);
        this.price = BuyingPriceParser.toIntStringPriceParser(buyingPriceInput);
    }

    public int getPrice() {
        return price;
    }
}
