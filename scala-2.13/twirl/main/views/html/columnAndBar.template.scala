
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

object columnAndBar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit request: MessagesRequestHeader, flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/navbar(message)),format.raw/*3.17*/("""
"""),_display_(/*4.2*/main(message)/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""

"""),format.raw/*6.1*/("""<div class="main">
	<div class="container">

		
		<div class="row">
		
			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*16.32*/Messages("label.bar")),format.raw/*16.53*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="barChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->
		
		<div class="row">
		
			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*33.32*/Messages("label.stacked")),format.raw/*33.57*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="barStackedChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->

		<div class="row">

			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*50.32*/Messages("label.column")),format.raw/*50.56*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="columnChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->

		</div><!-- /row -->

	</div><!-- /container -->

</div><!-- /main -->
""")))}))
      }
    }
  }

  def render(message:String,request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(message)(request,flash)

  def f:((String) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (message) => (request,flash) => apply(message)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-29T20:19:55.079205
                  SOURCE: /home/pratham/Downloads/trial learning/play-samples-play-scala-forms-example/app/views/columnAndBar.scala.html
                  HASH: 2fdb40b4f2ddd6d6577908ce943621f3527523a7
                  MATRIX: 764->1|929->73|956->75|991->90|1018->92|1039->105|1078->107|1106->109|1334->310|1376->331|1736->664|1782->689|2145->1025|2190->1049
                  LINES: 21->1|26->2|27->3|27->3|28->4|28->4|28->4|30->6|40->16|40->16|57->33|57->33|74->50|74->50
                  -- GENERATED --
              */
          