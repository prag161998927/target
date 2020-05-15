
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

object chatPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("WebSocket Chat")/*3.24*/{_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<input type="hidden" id="ws-route" value=""""),_display_(/*4.48*/routes/*4.54*/.WebSocketChat.socket.absoluteURL()),format.raw/*4.89*/("""">
<input type="text" id="chat-input" size="80">
<br>
<textarea id="chat-area" rows="15" cols="80"></textarea>

    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("javascripts/chat.js")),format.raw/*9.65*/(""""></script>
""")))}))
      }
    }
  }

  def render(request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-07T00:46:59.801350
                  SOURCE: /home/pratham/Desktop/play login/completion of play/play-samples-play-scala-forms-example/app/views/chatPage.scala.html
                  HASH: cba105f332caf795a5e5d9dbbcd8e7379852ecef
                  MATRIX: 753->1|904->59|931->61|961->83|999->84|1030->89|1099->132|1113->138|1168->173|1324->303|1338->309|1398->349
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|28->4|33->9|33->9|33->9
                  -- GENERATED --
              */
          