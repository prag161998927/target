
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

object bubble extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

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
						<h3 class="panel-title">"""),_display_(/*13.32*/Messages("label.bubble")),format.raw/*13.56*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="bubbleChart" class="chart-holder"></div>
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
                  DATE: 2020-04-29T20:13:09.930282
                  SOURCE: /home/pratham/Downloads/trial learning/play-samples-play-scala-forms-example/app/views/bubble.scala.html
                  HASH: 35b9cd2f295440021030023a17a5ac02d6db6f38
                  MATRIX: 758->1|924->74|951->76|986->91|1013->93|1034->106|1073->108|1101->110|1321->303|1366->327
                  LINES: 21->1|26->2|27->3|27->3|28->4|28->4|28->4|30->6|37->13|37->13
                  -- GENERATED --
              */
          