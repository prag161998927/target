
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

object navbar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(selectedSubNavbar: String)(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<nav class="navbar navbar-inverse" role="navigation">
	<div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" target="_blank" href="http://www.highcharts.com/">Highcharts</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class=""""),_display_(/*19.21*/if(Messages("subheader.time_line") == selectedSubNavbar)/*19.77*/{_display_(Seq[Any](format.raw/*19.78*/("""active""")))}),format.raw/*19.85*/("""">
        	<a href=""""),_display_(/*20.20*/routes/*20.26*/.Application.lineChart),format.raw/*20.48*/("""">
        		<i class="icon-tasks"></i>
        		<span>"""),_display_(/*22.18*/Messages("subheader.time_line")),format.raw/*22.49*/("""</span>
        	</a>
        </li>
        <li class=""""),_display_(/*25.21*/if(Messages("subheader.bar_column") == selectedSubNavbar)/*25.78*/{_display_(Seq[Any](format.raw/*25.79*/("""active""")))}),format.raw/*25.86*/("""">
        	<a href=""""),_display_(/*26.20*/routes/*26.26*/.Application.columnAndBarChart),format.raw/*26.56*/("""">
        		<i class=" icon-barcode"></i>
        		<span>"""),_display_(/*28.18*/Messages("subheader.bar_column")),format.raw/*28.50*/("""</span>
        	</a>
        </li>
        <li class=""""),_display_(/*31.21*/if(Messages("subheader.area_pie") == selectedSubNavbar)/*31.76*/{_display_(Seq[Any](format.raw/*31.77*/("""active""")))}),format.raw/*31.84*/("""">
        	<a href=""""),_display_(/*32.20*/routes/*32.26*/.Application.areaAndPieChart),format.raw/*32.54*/("""">
        		<i class="icon-th-large"></i>
        		<span>"""),_display_(/*34.18*/Messages("subheader.area_pie")),format.raw/*34.48*/("""</span>
        	</a>
        </li>
        <li class=""""),_display_(/*37.21*/if(Messages("subheader.bubble") == selectedSubNavbar)/*37.74*/{_display_(Seq[Any](format.raw/*37.75*/("""active""")))}),format.raw/*37.82*/("""">
        	<a href=""""),_display_(/*38.20*/routes/*38.26*/.Application.bubbleChart),format.raw/*38.50*/("""">
        		<i class=" icon-tint"></i>
        		<span>"""),_display_(/*40.18*/Messages("subheader.bubble")),format.raw/*40.46*/("""</span>
        	</a>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

"""))
      }
    }
  }

  def render(selectedSubNavbar:String,request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(selectedSubNavbar)(request,flash)

  def f:((String) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (selectedSubNavbar) => (request,flash) => apply(selectedSubNavbar)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-29T20:13:09.583865
                  SOURCE: /home/pratham/Downloads/trial learning/play-samples-play-scala-forms-example/app/views/navbar.scala.html
                  HASH: fd2bb202dfcb3c9c20f294086ecd3e8bea21a7fd
                  MATRIX: 758->1|934->84|961->85|1791->888|1856->944|1895->945|1933->952|1982->974|1997->980|2040->1002|2124->1059|2176->1090|2259->1146|2325->1203|2364->1204|2402->1211|2451->1233|2466->1239|2517->1269|2604->1329|2657->1361|2740->1417|2804->1472|2843->1473|2881->1480|2930->1502|2945->1508|2994->1536|3081->1596|3132->1626|3215->1682|3277->1735|3316->1736|3354->1743|3403->1765|3418->1771|3463->1795|3547->1852|3596->1880
                  LINES: 21->1|26->2|27->3|43->19|43->19|43->19|43->19|44->20|44->20|44->20|46->22|46->22|49->25|49->25|49->25|49->25|50->26|50->26|50->26|52->28|52->28|55->31|55->31|55->31|55->31|56->32|56->32|56->32|58->34|58->34|61->37|61->37|61->37|61->37|62->38|62->38|62->38|64->40|64->40
                  -- GENERATED --
              */
          