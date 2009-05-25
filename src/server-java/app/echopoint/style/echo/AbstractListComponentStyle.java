package echopoint.style.echo;

import echopoint.style.AbstractStyle;
import static echopoint.util.ColorKit.makeColor;
import nextapp.echo.app.Border;
import static nextapp.echo.app.list.AbstractListComponent.PROPERTY_BACKGROUND;
import static nextapp.echo.app.list.AbstractListComponent.PROPERTY_BORDER;

/**
 * The default style to associate with list components.
 *
 * @author Rakesh Vidyadharan 2009-05-24
 * @version $Id$
 */
public class AbstractListComponentStyle extends AbstractStyle
{
  private static final long serialVersionUID = 1l;

  /**
   * The colour to use for background and border.
   *
   * {@value}
   */
  public static final String COLOR = "#cfdfff";

  /** {@inheritDoc} */
  @Override
  protected void init()
  {
    super.init();

    set( PROPERTY_BACKGROUND, makeColor( COLOR ) );
    set( PROPERTY_BORDER,
        new Border( 2, makeColor( COLOR ), Border.STYLE_GROOVE ) );
  }
}
