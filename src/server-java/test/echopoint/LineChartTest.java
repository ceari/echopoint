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

package echopoint;

import echopoint.google.chart.LineChart;
import echopoint.google.chart.model.ChartData;
import echopoint.google.chart.model.FillArea;
import echopoint.google.chart.model.LineStyle;
import echopoint.google.chart.model.Range;
import echopoint.google.chart.model.RangeMarker;
import echopoint.google.chart.model.ShapeMarker;
import echopoint.google.chart.model.Title;
import nextapp.echo.app.Component;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Unit test suite for the {@link echopoint.google.chart.LineChart} component
 * wrapper.
 *
 * @author Rakesh Vidyadharan 2008-08-10
 * @version $Id$
 */
public class LineChartTest extends GoogleChartTest<LineChart<Integer>>
{
  @BeforeClass
  public static void init()
  {
    set( new LineChart<Integer>() );
    setData( new ChartData<Integer>() );
  }

  @Test
  public void renderId()
  {
    final String id = "echopointUnitTestSimpleLineChart";
    getComponent().setRenderId( id );
    assertEquals( "Ensuring render id is same", id, getComponent().getRenderId() );
  }

  @Test
  public void getChartData()
  {
    final Integer[] array = new Integer[] { 30,60,70,90,95,110 };
    final List<Integer> xdata = Arrays.asList( array );
    final int xmax = 120;

    getData().setXdata( xdata );
    getData().setXmax( xmax );
  }

  @Test
  public void markers()
  {
    final ArrayList<ShapeMarker> markers = new ArrayList<ShapeMarker>();
    markers.add( new ShapeMarker( "o", "ff3333", 5 ) );
    getData().setMarkers( markers );

    assertFalse( "Ensuring markers set", getData().getMarkers().isEmpty() );
  }

  @Test
  public void color()
  {
    final String color = "00ff00";
    getData().setColor( color );
    assertEquals( "Ensuring color set", color, getData().getColor() );
  }

  @Test
  public void title()
  {
    final Title title = new Title();
    title.add( "Simple Chart" );
    getComponent().setTitle( title );

    assertEquals( "Ensuring title set", title, getComponent().getTitle() );
  }

  @Test
  public void axisLabels()
  {
    final Collection<Collection<String>> labels =
        new ArrayList<Collection<String>>();

    String[] one =  new String[] { "0", "20", "40", "60", "80", "100" };
    labels.add( Arrays.asList( one ) );

    //String[] two = new String[] { "0", "25", "50", "75", "100" };
    String[] two = new String[] { "Min", "Third", "Three Quarter", "Max" };
    labels.add( Arrays.asList( two ) );

    getComponent().setAxisLabels( labels );
    assertNotNull( "Ensuring labels set", getComponent().getAxisLabels() );
  }

  @Test
  public void labelPositions()
  {
    final Collection<Collection<Integer>> positions =
        new ArrayList<Collection<Integer>>();
    final Integer[] one = new Integer[] {};
    positions.add( Arrays.asList( one ) );

    final Integer[] two = new Integer[] { 0, 33, 75, 100 };
    positions.add( Arrays.asList( two ) );

    getComponent().setLabelPositions( positions );
    assertNotNull( "Ensuring positions set", getComponent().getAxisLabels() );
  }

  @Test
  public void axisRanges()
  {
    final Collection<Range> ranges = new ArrayList<Range>();
    ranges.add( new Range( 20, 125 ) );
    ranges.add( new Range( 25, 150 ) );

    getComponent().setAxisRanges( ranges );
    assertNotNull( "Ensuring axis ranges set", getComponent().getAxisRanges() );
  }

  @Test
  public void rangeMarkers()
  {
    final Collection<RangeMarker> markers = new ArrayList<RangeMarker>();
    markers.add( new RangeMarker( "r", "ff0000", 0.1, 0.11 ) );
    markers.add( new RangeMarker( "R", "0000ff", 0.1, 0.11 ) );

    getComponent().setRangeMarkers( markers );
    assertNotNull( "Ensuring range markers set", getComponent().getRangeMarkers() );
  }

  @Test
  public void lineStyles()
  {
    final Collection<LineStyle> styles = new ArrayList<LineStyle>();
    styles.add( new LineStyle( 3, 6, 3 ) );

    getComponent().setLineStyles( styles );
    assertNotNull( "Ensuring line styles set", getComponent().getLineStyles() );
  }

  @Test
  public void fillArea()
  {
    final Collection<FillArea> areas = new ArrayList<FillArea>();
    areas.add( new FillArea( "B", "224499", 0, 0 ) );

    getComponent().setFillArea( areas );
    assertNotNull( "Ensuring fill area set", getComponent().getFillArea() );
  }

  @AfterClass
  @SuppressWarnings( {"unchecked"} )
  public static void finish()
  {
    final Component content = Application.getContent().getTestArea();
    content.removeAll();
    final LineChart<Integer> chart = (LineChart<Integer>) get();

    final ArrayList<ChartData<Integer>> collection = new ArrayList<ChartData<Integer>>();
    collection.add( getData() );
    chart.setData( collection );
    assertNotNull( "Ensuring that getData() is set", chart.getData() );

    content.add( get() );
  }
}
