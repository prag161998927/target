
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
    """),_display_(/*3.6*/main("Login")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""

        """),format.raw/*5.9*/("""<h2>login</h2>

        <form method ="post" action=""""),_display_(/*7.39*/routes/*7.45*/.Application.validateLoginPost()),format.raw/*7.77*/("""">
            """),_display_(/*8.14*/helper/*8.20*/.CSRF.formField),format.raw/*8.35*/("""
            """),format.raw/*9.13*/("""username: <input type="text" name="username"></input>
            password: <input type="password" name="password"></input>
            <input type="submit"></input>
        </form>

        <h2>create user</h2>

        <form method ="post" action=""""),_display_(/*16.39*/routes/*16.45*/.Application.createUser()),format.raw/*16.70*/("""">
            """),_display_(/*17.14*/helper/*17.20*/.CSRF.formField),format.raw/*17.35*/("""
            """),format.raw/*18.13*/("""username: <input type="text" name="username"></input>
            password: <input type="password" name="password"></input>
            <input type="submit"></input>
        </form>

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
                  DATE: 2020-04-29T20:13:09.957900
                  SOURCE: /home/pratham/Downloads/trial learning/play-samples-play-scala-forms-example/app/views/login.scala.html
                  HASH: 8de4451148f536efb65ede890c41a032adcc0229
                  MATRIX: 750->1|901->59|932->65|953->78|991->79|1027->89|1107->143|1121->149|1173->181|1215->197|1229->203|1264->218|1304->231|1582->482|1597->488|1643->513|1686->529|1701->535|1737->550|1778->563
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|31->7|31->7|31->7|32->8|32->8|32->8|33->9|40->16|40->16|40->16|41->17|41->17|41->17|42->18
                  -- GENERATED --
              */
          