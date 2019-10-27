package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

/**
 * Created by jakim on 25.10.19 г.
 */
public class MainSiteStepDefinitions
{
    @Before
    public void setTheStage( )
    {
        OnStage.setTheStage( new OnlineCast( ) );
    }

    @Given( "^(.*) is on shop (.*) page$" )
    public void anActorIsOnShopPage( String actor,
                                     String page )
    {
        theActorCalled( actor ).attemptsTo( NavigateTo.shopPage( page ) );
    }

}
