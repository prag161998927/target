
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

object pieAndArea extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/navbar(message)),format.raw/*3.17*/("""

"""),_display_(/*5.2*/main(message)/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""

"""),format.raw/*7.1*/("""<div class="main">
	<div class="container">

		<div class="row">
		
			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*16.32*/Messages("label.pie")),format.raw/*16.53*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="pieChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->
		
		<div class="row">
		
			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*33.32*/Messages("label.area")),format.raw/*33.54*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="areaChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->

		<div class="row">

			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*50.32*/Messages("label.combination")),format.raw/*50.61*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="comboChart" class="chart-holder"></div>
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
                  DATE: 2020-04-29T20:13:09.655326
                  SOURCE: /home/pratham/Downloads/trial learning/play-samples-play-scala-forms-example/app/views/pieAndArea.scala.html
                  HASH: e593c900c99cce9736291c0ac2af1e9e3f7e153d
                  MATRIX: 762->1|928->74|955->76|990->91|1018->94|1039->107|1078->109|1106->111|1331->309|1373->330|1733->663|1776->685|2133->1015|2183->1044
                  LINES: 21->1|26->2|27->3|27->3|29->5|29->5|29->5|31->7|40->16|40->16|57->33|57->33|74->50|74->50
                  -- GENERATED --
              */
          