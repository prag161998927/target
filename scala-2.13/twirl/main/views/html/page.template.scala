
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

object page extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Homepage</title>


            <!-- Bootstrap core CSS -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("vendor/bootstrap/css/bootstrap.min.css")),format.raw/*16.119*/("""">

            <!-- Custom styles for this template -->

        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("css/scrolling-nav.css")),format.raw/*20.102*/("""">
    </head>







    <body id="page-top">



            <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">ISRO</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">

                        <li class="nav-item">


                            <a class="nav-link js-scroll-trigger" href=""""),_display_(/*46.74*/controllers/*46.85*/.routes.Application.login()),format.raw/*46.112*/("""">login</a>

                        </li>

                        <li class="nav-item">


                            <a class="nav-link js-scroll-trigger" href=""""),_display_(/*53.74*/controllers/*53.85*/.routes.WebSocketChat.index()),format.raw/*53.114*/("""">Message Us</a>

                        </li>


                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#about">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#services">Services</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#contact">Contact</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <header class="bg-primary text-white">
            <div class="container text-center">
                <h1>Welcome to Scrolling Nav</h1>

                <img src=""""),_display_(/*76.28*/routes/*76.34*/.Assets.versioned("images/background.jpg")),format.raw/*76.76*/("""" alt="Trulli" width="100%" height="300">
                <button type="button" onclick="alert('Hello world!')">Click Me!</button>

                <h2>Welcome to Scrolling Nav</h2>
                <p class="lead">A landing page template freshly redesigned for Bootstrap 4</p>
            </div>
        </header>

        <section id="about">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 mx-auto">
                        <h2>About this page</h2>

                        <p class="lead">We are a web design studio from ISRO offering high quality design services for our esteemed clients. Our reputation stands firmly on our commitment to excellence backed by our team of expert scientist.  </p>
                        <img src=""""),_display_(/*91.36*/routes/*91.42*/.Assets.versioned("images/1.jpg")),format.raw/*91.75*/("""" alt="Trulli" width="100%" height="400">
                        <ul>
                            <li>Our skilled Scientists have the experience and creativity it takes to drive results through graphic design. We gather information  from the data that we collect through the satellites  and explore the objectives, so we can deliver creative solutions and the results thar are needed.</li>
                            <li>We start with understanding the Data: identifying their point of view and serving up the most relevant, engaging visual imagery</li>
                            <li>We strongly believe that good web design is only the beginning of  finding an effective  strategy</li>
                            <li>We take a fair and honest approach and conduct our business under the highest ethical and professional standards.</li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>

        <section id="services" class="bg-light">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 mx-auto">
                        <h2>Services we offer</h2>
                        <p class="lead">  Best For
                            Data visualization solution that enables businesses of all sizes to build & deploy interactive web applications, collaborate with team members, grant access permissions, and generate reports.
                            we are a data visualization website focused on making it easy to deliver interactive apps, charts and graphics that enable exploration and sharing of insights and ideas.
                        </p>
                    </div>
                </div>
            </div>
        </section>

        <section id="contact">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 mx-auto">
                        <h2>Contact us</h2>
                        <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vero odio fugiat voluptatem dolor, provident officiis, id iusto! Obcaecati incidunt, qui nihil beatae magnam et repudiandae ipsa exercitationem, in, quo totam.</p>
                    </div>
                </div>
            </div>
        </section>

            <!-- Footer -->
        <footer class="py-5 bg-dark">
            <div class="container">
                <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
            </div>
                <!-- /.container -->
        </footer>

            <!-- Bootstrap core JavaScript -->
        <script src=""""),_display_(/*137.23*/routes/*137.29*/.Assets.versioned("vendor/jquery/jquery.min.js")),format.raw/*137.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*138.23*/routes/*138.29*/.Assets.versioned("vendor/bootstrap/js/bootstrap.bundle.min.js")),format.raw/*138.93*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*139.23*/routes/*139.29*/.Assets.versioned("vendor/jquery-easing/jquery.easing.min.js")),format.raw/*139.91*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*140.23*/routes/*140.29*/.Assets.versioned("js/scrolling-nav.js")),format.raw/*140.69*/("""" type="text/javascript"></script>

            <!-- Plugin JavaScript -->


    </body>

</html>"""))
      }
    }
  }

  def render(request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-14T15:01:23.207129
                  SOURCE: /home/pratham/Desktop/jaibajrangballi/great work/completion of play/play-samples-play-scala-forms-example/app/views/page.scala.html
                  HASH: 2cc54a8f33deffe76ac09de65c37a7a372987fdf
                  MATRIX: 749->1|900->59|1312->444|1327->450|1408->509|1546->620|1561->626|1625->668|2485->1501|2505->1512|2554->1539|2746->1704|2766->1715|2817->1744|3659->2559|3674->2565|3737->2607|4562->3405|4577->3411|4631->3444|7314->6099|7330->6105|7400->6153|7485->6210|7501->6216|7587->6280|7672->6337|7688->6343|7772->6405|7857->6462|7873->6468|7935->6508
                  LINES: 21->1|26->2|40->16|40->16|40->16|44->20|44->20|44->20|70->46|70->46|70->46|77->53|77->53|77->53|100->76|100->76|100->76|115->91|115->91|115->91|161->137|161->137|161->137|162->138|162->138|162->138|163->139|163->139|163->139|164->140|164->140|164->140
                  -- GENERATED --
              */
          