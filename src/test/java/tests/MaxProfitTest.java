package tests;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.MaxProfit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MaxProfitTest {

    @Test
    public void positiveTest() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        MaxProfit test = new MaxProfit();
        int actual = test.maxProfit(prices);

        Assertions.assertEquals(5, actual, "Actual price is not expected. Real actual price is: " + actual);
    }

    @Test
    public void noProfitTest() {
        int[] prices = {7, 6, 4, 3, 1};
        MaxProfit test = new MaxProfit();
        int actual = test.maxProfit(prices);

        Assertions.assertEquals(0, actual, "Actual price is not expected. Real actual price is: " + actual);
    }

    @Test
    public void minNotProfitTest() {
        int[] prices = {2, 4, 1};
        MaxProfit test = new MaxProfit();
        int actual = test.maxProfit(prices);

        Assertions.assertEquals(2, actual, "Actual price is not expected. Real actual price is: " + actual);
    }

    @Test
    public void maxArrayTest() throws IOException {
        File file = new File("src/test/resources/pricesArray.txt");
        FileReader inputFil = new FileReader(file);
        BufferedReader in = new BufferedReader(inputFil);

        String[] strings = in.readLine().split(",");
        int[] prices = new int[strings.length];

        for (int i=0; i<prices.length; i++) {
            Integer digit = Integer.parseInt(strings[i]);
            prices[i] = digit;
        }

        MaxProfit test = new MaxProfit();
        int actual = test.maxProfit(prices);

        Assertions.assertEquals(999, actual, "Actual price is not expected. Real actual price is: " + actual);
    }

}
