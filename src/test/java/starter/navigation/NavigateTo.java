package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.interactions.Pause;
import starter.search.SearchFor;
import starter.search.SearchForm;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateTo
{
    private static Map<String, Class> shopPages = new HashMap<>( );

    static
    {
        shopPages.put( "Dresses",
                       DressesPage.class );
    }

    public static Performable theDuckDuckGoHomePage( )
    {
        return Task.where( "{0} opens the DuckDuckGo home page",
                           Open.browserOn( )
                               .the( DuckDuckGoHomePage.class )
                         );
    }

    public static Performable shopPage( String page )
    {
        return Task.where( "{0} opens the Shop page #page home page",
                           Open.browserOn( )
                               .the( shopPages.get( page ) )
                         )
                   .with( "page" )
                   .of( page );
    }
}