package starter.stepdefinitions.shoping;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starter.navigation.NavigateTo;
import starter.shoping.AddDressesToCart;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

/**
 * Created by jakim on 25.10.19 г.
 */
public class CartStepDefinitions
{
    @Given( "her/his cart is empty" )
    public void actorsCartIsEmpty( )
    {
    }

    @When( "she/he add all {string} colored dresses to her/his cart" )
    public void sheAddAllOrangeDressesToHerCart( String dressColor )
    {
        theActorInTheSpotlight( ).attemptsTo( AddDressesToCart.withColor( dressColor ) );
    }

    @Then( "then her/his cart should contain only the selected dresses" )
    public void thenHerCartShouldContainOnlyTheSelectedDresses( )
    {
    }
}
