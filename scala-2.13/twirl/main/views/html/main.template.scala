
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Html,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheet/main.css")),format.raw/*8.100*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.versioned("javascripts/jquery-1.9.0.min.js")),format.raw/*9.81*/("""" type="text/javascript"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("bootstrap-3.1.1/css/bootstrap.css")),format.raw/*10.114*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("bootstrap-3.1.1/css/bootstrap.min.css")),format.raw/*11.118*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*13.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("bootstrap-3.1.1/js/bootstrap.js")),format.raw/*14.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.versioned("bootstrap-3.1.1/js/bootstrap.min.js")),format.raw/*15.85*/("""" type="text/javascript"></script>
		
		<!-- HighCharts -->
		<script src="http://code.highcharts.com/highcharts.js"></script>
		<script src="http://code.highcharts.com/modules/exporting.js"></script>
		
		"""),_display_(/*21.4*/if(Messages("subheader.time_line") == title)/*21.48*/ {_display_(Seq[Any](format.raw/*21.50*/("""
			"""),format.raw/*22.4*/("""<script src=""""),_display_(/*22.18*/routes/*22.24*/.Assets.versioned("js/timeAndLineChartHandler.js")),format.raw/*22.74*/("""" type="text/javascript"></script>
		""")))}),format.raw/*23.4*/("""

		"""),_display_(/*25.4*/if(Messages("subheader.bar_column") == title)/*25.49*/ {_display_(Seq[Any](format.raw/*25.51*/("""
			"""),format.raw/*26.4*/("""<script src=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("js/barAndColumnChartHandler.js")),format.raw/*26.75*/("""" type="text/javascript"></script>
		""")))}),format.raw/*27.4*/("""
		
		"""),_display_(/*29.4*/if(Messages("subheader.area_pie") == title)/*29.47*/{_display_(Seq[Any](format.raw/*29.48*/("""
			"""),format.raw/*30.4*/("""<script src=""""),_display_(/*30.18*/routes/*30.24*/.Assets.versioned("js/pieAndAreaChartHandler.js")),format.raw/*30.73*/("""" type="text/javascript"></script>
		""")))}),format.raw/*31.4*/("""
		
		"""),_display_(/*33.4*/if(Messages("subheader.bubble") == title)/*33.45*/{_display_(Seq[Any](format.raw/*33.46*/("""
			"""),format.raw/*34.4*/("""<script src="http://code.highcharts.com/highcharts-more.js"></script>
			<script src=""""),_display_(/*35.18*/routes/*35.24*/.Assets.versioned("js/bubbleChartHandler.js")),format.raw/*35.69*/("""" type="text/javascript"></script>
		""")))}),format.raw/*36.4*/("""

"""),format.raw/*38.1*/("""</head>
    <body>
		"""),_display_(/*40.4*/flash/*40.9*/.get("error")),format.raw/*40.22*/("""
        """),_display_(/*41.10*/content),format.raw/*41.17*/("""
    """),format.raw/*42.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(request,flash)

  def f:((String) => (Html) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (request,flash) => apply(title)(content)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-29T20:13:09.733924
                  SOURCE: /home/pratham/Downloads/trial learning/play-samples-play-scala-forms-example/app/views/main.scala.html
                  HASH: 7679fc40df935ee43bb1c9c97d719362fc654174
                  MATRIX: 761->1|940->87|967->88|1044->139|1069->144|1157->206|1171->212|1232->252|1283->277|1297->283|1369->335|1484->423|1499->429|1575->483|1658->539|1673->545|1753->603|1841->664|1856->670|1917->709|1969->734|1984->740|2047->782|2131->839|2146->845|2219->897|2303->954|2318->960|2395->1016|2628->1223|2681->1267|2721->1269|2752->1273|2793->1287|2808->1293|2879->1343|2947->1381|2978->1386|3032->1431|3072->1433|3103->1437|3144->1451|3159->1457|3231->1508|3299->1546|3332->1553|3384->1596|3423->1597|3454->1601|3495->1615|3510->1621|3580->1670|3648->1708|3681->1715|3731->1756|3770->1757|3801->1761|3915->1848|3930->1854|3996->1899|4064->1937|4093->1939|4141->1961|4154->1966|4188->1979|4225->1989|4253->1996|4285->2001
                  LINES: 21->1|26->2|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|45->21|45->21|45->21|46->22|46->22|46->22|46->22|47->23|49->25|49->25|49->25|50->26|50->26|50->26|50->26|51->27|53->29|53->29|53->29|54->30|54->30|54->30|54->30|55->31|57->33|57->33|57->33|58->34|59->35|59->35|59->35|60->36|62->38|64->40|64->40|64->40|65->41|65->41|66->42
                  -- GENERATED --
              */
          