package starter.shoping;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Created by jakim on 25.10.19 г.
 */
public class DressesCatalog
{

    public static final Target ANY_ITEM = Target.the( "Some dress" )
                                                .located( By.cssSelector( "ul.product_list > li:first-of-type .product-container .product-name" ) );

    public static final Target Add_TO_CART = Target.the( "Some dress" )
                                                   .located( By.cssSelector( "button[name='Submit']" ) );
}
