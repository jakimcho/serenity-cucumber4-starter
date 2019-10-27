package starter.shoping;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverTarget;

/**
 * Created by jakim on 25.10.19 г.
 */
public class AddDressesToCart
{
    public static Performable withColor( String dressColor )
    {
        return Task.where( "select dresses in #color",
                           Click.on( DressesCatalog.ANY_ITEM ),
                           Click.on( DressesCatalog.Add_TO_CART ) )
                   .with( "color" )
                   .of( dressColor );
    }
}
