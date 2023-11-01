package pl.coderslab.seleniumcourseonlteaw43.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/buying-item-with-mystore.feature", plugin = {"pretty","html:out"})
public class BuyingItemWithMyStoreTest {
}
