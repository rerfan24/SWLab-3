package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MySecondStepdefs {
    private Calculator calculator;
    private int a;
    private int b;
    private int result;

    @Before
    public void begin() {
        calculator = new Calculator();
    }

    @Given("Two values, {int} and {int}")
    public void twoValuesAnd(int arg0, int arg1) {
        a = arg0;
        b = arg1;
    }

    @When("I divide and get the sqrt the two values")
    public void iDivideAndGetTheSqrtTheTwoValues() {
        result = calculator.squareRoot(calculator.divide(a, b));
        System.out.println(result);
    }

    @Then("I expect the result to be {int}")
    public void iExpectTheResultToBe(int arg0) {
        Assert.assertEquals(arg0, result);
    }


}
