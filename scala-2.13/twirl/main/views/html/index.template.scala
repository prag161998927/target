
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Welcome to Play")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

  """)))}),format.raw/*5.4*/("""
"""))
      }
    }
  }

  def render(request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-29T20:13:09.881519
                  SOURCE: /home/pratham/Downloads/trial learning/play-samples-play-scala-forms-example/app/views/index.scala.html
                  HASH: 5aa9b538c79a79857ee61bfe2978fba575b6982a
                  MATRIX: 750->1|901->59|930->63|961->86|1000->88|1034->93
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5
                  -- GENERATED --
              */
          