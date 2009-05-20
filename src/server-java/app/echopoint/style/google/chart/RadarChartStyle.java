package echopoint.style.google.chart;

import static echopoint.google.chart.RadarChart.PROPERTY_AXIS_TYPE;

/**
 * The default style class for {@link echopoint.google.chart.RadarChart}
 * components.
 *
 * @author Rakesh Vidyadharan 2009-05-20
 * @version $Id$
 */
public class RadarChartStyle extends AdvancedChartStyle
{
  private static final long serialVersionUID = 1l;

  /** {@inheritDoc} */
  @Override
  protected void init()
  {
    super.init();

    set( PROPERTY_AXIS_TYPE, "x" );
  }
}
