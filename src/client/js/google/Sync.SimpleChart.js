/**
 * Component rendering peer: SimpleChart
 *
 * @author Rakesh 2008-08-21
 * @version: $Id$
 */
echopoint.google.internal.SimpleChartSync = Core.extend(
    echopoint.google.internal.AbstractChartSync,
{
  $abstract: true,

  $load: function()
  {
    Echo.Render.registerPeer( echopoint.constants.SIMPLE_CHART, this );
  },

  $virtual:
  {
    /**
     * Set the legends for the data set if specified.
     *
     * @param The URL that will be updated.
     * @return The modified URL object.
     */
    setLegend: function( url )
    {
      var data = this.getData();
      if ( ! data[0].legend ) return url;
      url += "&chdl=";

      for ( var i = 0; i < data.length; ++i )
      {
        url += data[i].legend;
        if ( i != data.length - 1 ) url += "|";
      }

      return url;
    },

    /**
     * Set the legend position for the chart.  This will have no effect if no
     * legend has been specified.
     *
     * @param The URL that will be updated.
     * @return The modified URL object.
     */
    setLegendPosition: function( url )
    {
      var position = this.component.render(
          echopoint.google.internal.SimpleChart.LEGEND_POSITION );
      if ( position ) url += "&chdlp=" + position;
      return url;
    },

    /**
     * Over-ridden to add legend parameters to the url.
     */
    setAdditionalParameters: function( url )
    {
      url = this.setLegend( url );
      url = this.setLegendPosition( url );
      return url;
    }
  }
});
