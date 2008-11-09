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

package echopoint.google.chart;

import echopoint.google.chart.internal.AbstractChartPeer;
import nextapp.echo.app.Component;
import nextapp.echo.app.util.Context;
import nextapp.echo.webcontainer.ServerMessage;
import nextapp.echo.webcontainer.Service;
import nextapp.echo.webcontainer.WebContainerServlet;
import nextapp.echo.webcontainer.service.JavaScriptService;

/**
 * Rendering peer for the {@link echopoint.google.chart.Map} component.
 *
 * @author Rakesh 2008-08-25
 * @version $Id$
 */
public class MapPeer extends AbstractChartPeer
{
  /** The component name for which this class is a peer. */
  private static final String COMPONENT_NAME = Map.class.getName();

  /** The service for the client side peer for this component. */
  private static final Service COMPONENT_SERVICE =
      JavaScriptService.forResource( MapPeer.COMPONENT_NAME,
          "resource/js/google/chart/Sync.Map.js" );

  /** Register the services */
  static
  {
    WebContainerServlet.getServiceRegistry().add( COMPONENT_SERVICE );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void init( final Context context, final Component component )
  {
    super.init( context, component );
    final ServerMessage serverMessage =
        (ServerMessage) context.get( ServerMessage.class );
    serverMessage.addLibrary( COMPONENT_NAME );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Class getComponentClass()
  {
    return Map.class;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getClientComponentType( final boolean shortType )
  {
    return COMPONENT_NAME;
  }

  /**
   * Over-ridden to handle requests for the {@link
   * echopoint.google.chart.Map#PROPERTY_GEOGRAPHICAL_AREA} property.
   *
   * @see nextapp.echo.webcontainer.ComponentSynchronizePeer#getOutputProperty(
   *   Context, Component, String, int)
   */
  @Override
  public Object getOutputProperty( final Context context,
      final Component component, final String propertyName,
      final int propertyIndex )
  {
    if ( Map.PROPERTY_GEOGRAPHICAL_AREA.equals( propertyName ) )
    {
      return component.get( propertyName ).toString();
    }

    return super.getOutputProperty(
        context, component, propertyName, propertyIndex );
  }
}