
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

object lineChart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
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
						<h3 class="panel-title">"""),_display_(/*16.32*/Messages("label.line")),format.raw/*16.54*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="lineChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->

		<div class="row">

			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*33.32*/Messages("label.time")),format.raw/*33.54*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="timeSeriesChart" class="chart-holder"></div>
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
                  DATE: 2020-04-29T20:13:09.795954
                  SOURCE: /home/pratham/Downloads/trial learning/play-samples-play-scala-forms-example/app/views/lineChart.scala.html
                  HASH: b774910dc9d218d5bfe73c962d33e181b0721cfe
                  MATRIX: 761->1|927->74|954->76|989->91|1016->93|1037->106|1076->108|1104->110|1329->308|1372->330|1729->660|1772->682
                  LINES: 21->1|26->2|27->3|27->3|28->4|28->4|28->4|30->6|40->16|40->16|57->33|57->33
                  -- GENERATED --
              */
          