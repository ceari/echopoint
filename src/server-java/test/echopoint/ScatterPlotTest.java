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

import echopoint.google.chart.ScatterPlot;
import echopoint.google.chart.model.ChartData;
import echopoint.google.chart.model.Range;
import echopoint.google.chart.model.ScatterPlotData;
import echopoint.google.chart.model.Title;
import nextapp.echo.app.Component;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Component wrapper for the {@link echopoint.google.chart.ScatterPlot} component
 * wrapper.
 *
 * @author Rakesh Vidyadharan 2008-08-23
 * @version $Id$
 */
public class ScatterPlotTest
{
  static ScatterPlot<Integer> chart;
  static ScatterPlotData<Integer> data;

  @BeforeClass
  public static void init()
  {
    chart = new ScatterPlot<Integer>();
    data = new ScatterPlotData<Integer>();
  }

  @Test
  public void renderId()
  {
    final String id = "echopointUnitTestSimpleScatterPlot";
    chart.setRenderId( id );
    assertEquals( "Ensuring render id is same", id, chart.getRenderId() );
  }

  @Test
  public void data()
  {
    final Integer[] array = new Integer[] { 0, 30, 60, 70, 90, 95, 100 };
    final List<Integer> xdata = Arrays.asList( array );
    final int xmax = 120;

    final Integer[] ydata = { 20, 30, 40, 50, 60, 70, 80 };
    final Integer[] size = { 1, 2, 3, 4, 5, 6, 7 };

    data.setXdata( xdata );
    data.setXmax( xmax );
    data.setYdata( Arrays.asList( ydata ) );
    data.setSize( Arrays.asList( size ) );
  }

  @Test
  public void color()
  {
    final String color = "00ff00";
    data.setColor( color );
    assertEquals( "Ensuring color set", color, data.getColor() );
  }

  @Test
  public void title()
  {
    final Title title = new Title();
    title.add( "Scatter Plot" );
    chart.setTitle( title );

    assertEquals( "Ensuring title set", title, chart.title() );
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

    chart.setAxisLabels( labels );
    assertNotNull( "Ensuring labels set", chart.getAxisLabels() );
  }

  @Test
  public void labelPositions()
  {
    final Collection<Collection<Integer>> positions =
        new ArrayList<Collection<Integer>>();
    final Integer[] one = new Integer[] {};
    positions.add( Arrays.asList( one ) );

    final Integer[] two = new Integer[] { 0, 3, 7, 10 };
    positions.add( Arrays.asList( two ) );

    chart.setLabelPositions( positions );
    assertNotNull( "Ensuring positions set", chart.getAxisLabels() );
  }

  @Test
  public void axisRanges()
  {
    final Collection<Range> ranges = new ArrayList<Range>();
    ranges.add( new Range( 20, 125 ) );
    ranges.add( new Range( 25, 150 ) );

    chart.setAxisRanges( ranges );
    assertNotNull( "Ensuring axis ranges set", chart.getAxisRanges() );
  }

  @AfterClass
  public static void finish()
  {
    final Component content = Application.getContent().getTestArea();
    content.removeAll();

    final ArrayList<ChartData<Integer>> collection = new ArrayList<ChartData<Integer>>();
    collection.add( data );
    chart.setData( collection );
    assertNotNull( "Ensuring that data is set", chart.getData() );

    content.add( chart );
  }
}