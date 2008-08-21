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

import echopoint.google.internal.SimpleChart;

import java.util.Collection;

/**
 * Component wrapper for a
 * <a href='http://code.google.com/apis/chart/#pie_charts'>Pie chart</a>
 * provided by <a href='http://code.google.com/apis/chart/'>Google Chart
 * API</a>.
 *
 * @author Rakesh Vidyadharan 2008-08-21
 * @version $Id$
 */
public class PieChart<N extends Number> extends SimpleChart<N>
{
  private static final long serialVersionUID = 1l;

  /** An enumeration used to represent the pie chart dimensions. */
  public enum Dimensions { p, p3 }

  /**
   * The property used to configure 2 or 3-dimensional charts.  This
   * property is best styled.  Defaults to 2-d.
   */
  public static final String PROPERTY_DIMENSIONS = "dimensions";

  /**
   * The property that holds the collection of string labels to associate with
   * the segments in the pie chart.  Please see
   * <a href='http://code.google.com/apis/chart/#pie_labels'>Pie Labels</a>
   * notes regarding size requirements when using labels.
   */
  public static final String PROPERTY_LABELS = "labels";

  /**
   * Return the {@link #PROPERTY_DIMENSIONS} property value.
   *
   * @return The value that indicates the chart dimensions.
   */
  public String getDimensions()
  {
    return (String) getProperty( PROPERTY_DIMENSIONS );
  }

  /**
   * Set the value of the {@link #PROPERTY_DIMENSIONS} property.  This method
   * should be treated as <b>internal use only</b>.
   *
   * @see #setDimensions( Dimensions )
   * @param dimension The value to set.
   */
  public void setDimensions( final String dimension )
  {
    setProperty( PROPERTY_DIMENSIONS, dimension );
  }

  /**
   * Set the value of the {@link #PROPERTY_DIMENSIONS} property.
   *
   * @param dimension The value to set.
   */
  public void setDimensions( final Dimensions dimension )
  {
    setDimensions( dimension.toString() );
  }

  /**
   * Return the {@link #PROPERTY_LABELS} property value.
   *
   * @return The labels value encoded as required by the chart api.
   */
  public String getLabels()
  {
    return (String) getProperty( PROPERTY_LABELS );
  }

  /**
   * Set the value of the {@link #PROPERTY_LABELS} property.  This method
   * should be treated as <b>internal use only</b>.
   *
   * @see #setLabels(java.util.Collection)
   * @param labels The value to set.
   */
  public void setLabels( final String labels )
  {
    setProperty( PROPERTY_LABELS, labels );
  }

  /**
   * Set the value of the {@link #PROPERTY_LABELS} property from the specified
   * collection of label values.
   *
   * @param labels The value to set.
   */
  public void setLabels( final Collection<String> labels )
  {
    final StringBuilder builder = new StringBuilder( 128 );

    boolean first = true;
    for ( String label : labels )
    {
      if ( ! first ) builder.append( "|" );
      first = false;
      builder.append( label );
    }

    setLabels( builder.toString() );
  }
}