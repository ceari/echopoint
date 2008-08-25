/*
 * This file is part of the Echo Point Project.  This project is a
 * collection of Components that have extended the Echo Web Application
 * Framework Version 3.
 *
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 */

package echopoint.google;

import echopoint.google.internal.AbstractChart;

/**
 * Component wrapper for a
 * <a href='http://code.google.com/apis/chart/#maps'>Map</a>
 * provided by <a href='http://code.google.com/apis/chart/'>Google Chart
 * API</a>.
 *
 * @author Rakesh Vidyadharan 2008-08-25
 * @version $Id$
 */
public class Map extends AbstractChart<Integer>
{
  private static final long serialVersionUID = 1l;

  /** An enumeration used to represent the regions supported by the map. */
  public enum Regions
  { africa, asia, europe, middle_east, south_america, usa, world }

  /**
   * The property used to configure the map area.  This property may be
   * styled.
   */
  public static final String PROPERTY_GEOGRAPHICAL_AREA = "region";

  /**
   * The property used to specify colour and colour gradients for countries or
   * states displayed in the map.  Colour specifications are different for
   * maps as compared to regular charts.  This property is best styled.
   */
  public static final String PROPERTY_COLORS = "colors";

  /**
   * The property used to configure the countries or states in the map that
   * are to be coloured.  This property may be styled.
   */
  public static final String PROPERTY_CODES = "codes";

  /**
   * Return the {@link #PROPERTY_GEOGRAPHICAL_AREA} property value.
   *
   * @return The value that indicates the chart dimensions.
   */
  public String getGeographicalArea()
  {
    return (String) getProperty( PROPERTY_GEOGRAPHICAL_AREA );
  }

  /**
   * Set the value of the {@link #PROPERTY_GEOGRAPHICAL_AREA} property.  This
   * method should be treated as <b>internal use only</b>.
   *
   * @see #setGeographicalArea( Regions )
   * @param region The value to set.
   */
  public void setGeographicalArea( final String region )
  {
    setProperty( PROPERTY_GEOGRAPHICAL_AREA, region );
  }

  /**
   * Set the value of the {@link #PROPERTY_GEOGRAPHICAL_AREA} property.
   *
   * @param region The value to set.
   */
  public void setGeographicalArea( final Regions region )
  {
    setGeographicalArea( region.toString() );
  }

  /**
   * Return the {@link #PROPERTY_COLORS} property value.
   *
   * @return The colors value encoded as required by the chart api.
   */
  public String getColors()
  {
    return (String) getProperty( PROPERTY_COLORS );
  }

  /**
   * Set the value of the {@link #PROPERTY_COLORS} property.
   *
   * @param colors The value to set.
   */
  public void setColors( final String colors )
  {
    setProperty( PROPERTY_COLORS, colors );
  }

  /**
   * Return the {@link #PROPERTY_CODES} property value.
   *
   * @return The codes value encoded as required by the chart api.
   */
  public String getCodes()
  {
    return (String) getProperty( PROPERTY_CODES );
  }

  /**
   * Set the value of the {@link #PROPERTY_CODES} property.
   *
   * @param codes The value to set.
   */
  public void setCodes( final String codes )
  {
    setProperty( PROPERTY_CODES, codes );
  }
}