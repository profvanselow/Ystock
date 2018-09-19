import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        try {
            Stock stock = YahooFinance.get("TSLA");
            BigDecimal price = stock.getQuote().getPrice();
            BigDecimal change = stock.getQuote().getChangeInPercent();
            BigDecimal peg = stock.getStats().getPeg();
            BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

            stock.print();
        }
        catch(Exception ex)
        {
            System.out.println("couldn't get");
        }



    }
}
