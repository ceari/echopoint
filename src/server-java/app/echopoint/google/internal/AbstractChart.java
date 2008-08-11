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

package echopoint.google.internal;

import echopoint.internal.AbstractContainer;
import echopoint.google.model.ChartData;
import echopoint.google.model.Title;
import nextapp.echo.app.Component;

import java.util.Collection;
import java.util.ArrayList;

import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.XStream;

/**
 * The abstract base class for the components that wrap the charts provided
 * by <a href='http://code.google.com/apis/chart/'>Google Chart API</a>.
 *
 * @author Rakesh 2008-08-10
 * @version $Id$
 */
public abstract class AbstractChart<N extends Number> extends AbstractContainer
{
  private static final long serialVersionUID = 1l;

  /**
   * The alternate text to display for the image and chart.  This property
   * may be styled.
   */
  public static final String PROPERTY_ALT = "alt";

  /**
   * The colour fill property for the chart.  Refer to the colour fill
   * and linear gradient notes for the Google Chart API to determine the
   * proper formatted string values that may be specified for charts.
   * This property is best styled using the same string values as documented
   * by the chart api.
   */
  public static final String PROPERTY_FILL = "fill";

  /**
   * An array of {@link echopoint.google.model.ChartData} model objects that
   * are to be plotted.  Note that all elements of the array should have the
   * same type of model.  Either all model elements must be simple (only xdata),
   * or should have both xdata and ydata.  This property cannot be styled.
   */
  public static final String PROPERTY_DATA = "data";

  /**
   * The legend position for the chart.  Specify the values as defined by
   * the Google Chart API documentation.  This property is best styled.
   */
  public static final String PROPERTY_LEGEND_POSITION = "legendPosition";

  /**
   * The title to display for chart.  Must be of type {@link
   * echopoint.google.model.Title}.  This property cannot be styled.
   */
  public static final String PROPERTY_TITLE = "title";

  /** The data collection for this component. */
  protected Collection<ChartData<N>> data = new ArrayList<ChartData<N>>();

  /** The title for this component. */
  protected Title title;

  /**
   * <b>AbstractChart</b> is <i>NOT</i> allowed to have any children.
   *
   * @see nextapp.echo.app.Component#isValidChild(nextapp.echo.app.Component)
   */
  @Override
  public boolean isValidChild( final Component child )
  {
    return false;
  }

  /**
   * Configure the JSON serialiser.
   *
   * @return The configured serialiser to use to serialise the custom model
   *   objects.
   */
  protected XStream createSerialiser()
  {
    return new XStream( new JsonHierarchicalStreamDriver() );
  }

  /**
   * Get the value of the {@link #PROPERTY_ALT} property.
   *
   * @return The value of the {@link #PROPERTY_ALT} property.
   */
  public String getAlt()
  {
    return (String) getProperty( PROPERTY_ALT );
  }

  /**
   * Set the value of the {@link #PROPERTY_ALT} property.
   *
   * @param alt The value to set for the property.
   */
  public void setAlt( final String alt )
  {
    setProperty( PROPERTY_ALT, alt );
  }

  /**
   * Get the value of the {@link #PROPERTY_FILL} property.
   *
   * @return The value of the {@link #PROPERTY_FILL} property.
   */
  public String getFill()
  {
    return (String) getProperty( PROPERTY_FILL );
  }

  /**
   * Set the value of the {@link #PROPERTY_FILL} property.
   *
   * @param fill The value to set for the property.
   */
  public void setFill( final String fill )
  {
    setProperty( PROPERTY_FILL, fill );
  }

  /** @return The {@link #data} collection. */
  public Collection<ChartData<N>> data() { return data; }

  /**
   * Get the value of the {@link #PROPERTY_DATA} property.
   *
   * @return The value of the {@link #PROPERTY_DATA} property.
   */
  public String getData()
  {
    return (String) getProperty( PROPERTY_DATA );
  }

  /**
   * Set the value of the {@link #PROPERTY_DATA} property.
   *
   * @param data The value to set for the property.
   */
  public void setData( final Collection<ChartData<N>> data )
  {
    this.data.clear();
    this.data.addAll( data );

    final XStream xstream = createSerialiser();
    setProperty( PROPERTY_DATA, xstream.toXML( data ) );
  }

  /**
   * Get the value of the {@link #PROPERTY_LEGEND_POSITION} property.
   *
   * @return The value of the {@link #PROPERTY_LEGEND_POSITION} property.
   */
  public String getLegendPosition()
  {
    return (String) getProperty( PROPERTY_LEGEND_POSITION );
  }

  /**
   * Set the value of the {@link #PROPERTY_LEGEND_POSITION} property.
   *
   * @param legendPosition The value to set for the property.
   */
  public void setLegendPosition( final String legendPosition )
  {
    setProperty( PROPERTY_LEGEND_POSITION, legendPosition );
  }

  /** @return The {@link #title} for this component. */
  public Title title() { return title; }

  /**
   * Get the value of the {@link #PROPERTY_TITLE} property.
   *
   * @return The value of the {@link #PROPERTY_TITLE} property.
   */
  public String getTitle()
  {
    return (String) getProperty( PROPERTY_TITLE );
  }

  /**
   * Set the value of the {@link #PROPERTY_TITLE} property.
   *
   * @param title The value to set for the property.
   */
  public void setTitle( final Title title )
  {
    this.title = title;

    final XStream xstream = createSerialiser();
    xstream.processAnnotations( Title.class );
    setProperty( PROPERTY_TITLE, xstream.toXML( title ) );
  }
}
