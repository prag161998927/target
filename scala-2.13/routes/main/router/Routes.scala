// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pratham/Desktop/jaibajrangballi/great work/completion of play/play-samples-play-scala-forms-example/conf/routes
// @DATE:Thu May 14 14:35:36 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_0: controllers.Application,
  // @LINE:21
  WebSocketChat_2: controllers.WebSocketChat,
  // @LINE:26
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_0: controllers.Application,
    // @LINE:21
    WebSocketChat_2: controllers.WebSocketChat,
    // @LINE:26
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_0, WebSocketChat_2, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_0, WebSocketChat_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validatePost1""", """controllers.Application.validateLoginPost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUser1""", """controllers.Application.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout1""", """controllers.Application.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """line""", """controllers.Application.lineChart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """columnAndBarChart""", """controllers.Application.columnAndBarChart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """areaAndPieChart""", """controllers.Application.areaAndPieChart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """areaAndPieChart""", """controllers.Application.areaAndPieChart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bubbleChart""", """controllers.Application.bubbleChart"""),
    ("""GET""", this.prefix, """controllers.Application.Homepage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chat""", """controllers.WebSocketChat.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chatSocket""", """controllers.WebSocketChat.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login0_invoker = createInvoker(
    Application_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_validateLoginPost1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validatePost1")))
  )
  private[this] lazy val controllers_Application_validateLoginPost1_invoker = createInvoker(
    Application_0.validateLoginPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "validateLoginPost",
      Nil,
      "POST",
      this.prefix + """validatePost1""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_createUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUser1")))
  )
  private[this] lazy val controllers_Application_createUser2_invoker = createInvoker(
    Application_0.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createUser",
      Nil,
      "POST",
      this.prefix + """createUser1""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout1")))
  )
  private[this] lazy val controllers_Application_logout3_invoker = createInvoker(
    Application_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout1""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_Application_index4_invoker = createInvoker(
    Application_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """index""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_lineChart5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("line")))
  )
  private[this] lazy val controllers_Application_lineChart5_invoker = createInvoker(
    Application_0.lineChart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "lineChart",
      Nil,
      "GET",
      this.prefix + """line""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_columnAndBarChart6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("columnAndBarChart")))
  )
  private[this] lazy val controllers_Application_columnAndBarChart6_invoker = createInvoker(
    Application_0.columnAndBarChart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "columnAndBarChart",
      Nil,
      "GET",
      this.prefix + """columnAndBarChart""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_areaAndPieChart7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("areaAndPieChart")))
  )
  private[this] lazy val controllers_Application_areaAndPieChart7_invoker = createInvoker(
    Application_0.areaAndPieChart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "areaAndPieChart",
      Nil,
      "GET",
      this.prefix + """areaAndPieChart""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_areaAndPieChart8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("areaAndPieChart")))
  )
  private[this] lazy val controllers_Application_areaAndPieChart8_invoker = createInvoker(
    Application_0.areaAndPieChart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "areaAndPieChart",
      Nil,
      "GET",
      this.prefix + """areaAndPieChart""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_bubbleChart9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bubbleChart")))
  )
  private[this] lazy val controllers_Application_bubbleChart9_invoker = createInvoker(
    Application_0.bubbleChart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "bubbleChart",
      Nil,
      "GET",
      this.prefix + """bubbleChart""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_Homepage10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_Homepage10_invoker = createInvoker(
    Application_0.Homepage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "Homepage",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_WebSocketChat_index11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chat")))
  )
  private[this] lazy val controllers_WebSocketChat_index11_invoker = createInvoker(
    WebSocketChat_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebSocketChat",
      "index",
      Nil,
      "GET",
      this.prefix + """chat""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_WebSocketChat_socket12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chatSocket")))
  )
  private[this] lazy val controllers_WebSocketChat_socket12_invoker = createInvoker(
    WebSocketChat_2.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebSocketChat",
      "socket",
      Nil,
      "GET",
      this.prefix + """chatSocket""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_login0_route(params@_) =>
      call { 
        controllers_Application_login0_invoker.call(Application_0.login)
      }
  
    // @LINE:9
    case controllers_Application_validateLoginPost1_route(params@_) =>
      call { 
        controllers_Application_validateLoginPost1_invoker.call(Application_0.validateLoginPost)
      }
  
    // @LINE:10
    case controllers_Application_createUser2_route(params@_) =>
      call { 
        controllers_Application_createUser2_invoker.call(Application_0.createUser)
      }
  
    // @LINE:11
    case controllers_Application_logout3_route(params@_) =>
      call { 
        controllers_Application_logout3_invoker.call(Application_0.logout)
      }
  
    // @LINE:12
    case controllers_Application_index4_route(params@_) =>
      call { 
        controllers_Application_index4_invoker.call(Application_0.index)
      }
  
    // @LINE:13
    case controllers_Application_lineChart5_route(params@_) =>
      call { 
        controllers_Application_lineChart5_invoker.call(Application_0.lineChart)
      }
  
    // @LINE:14
    case controllers_Application_columnAndBarChart6_route(params@_) =>
      call { 
        controllers_Application_columnAndBarChart6_invoker.call(Application_0.columnAndBarChart)
      }
  
    // @LINE:15
    case controllers_Application_areaAndPieChart7_route(params@_) =>
      call { 
        controllers_Application_areaAndPieChart7_invoker.call(Application_0.areaAndPieChart)
      }
  
    // @LINE:16
    case controllers_Application_areaAndPieChart8_route(params@_) =>
      call { 
        controllers_Application_areaAndPieChart8_invoker.call(Application_0.areaAndPieChart)
      }
  
    // @LINE:17
    case controllers_Application_bubbleChart9_route(params@_) =>
      call { 
        controllers_Application_bubbleChart9_invoker.call(Application_0.bubbleChart)
      }
  
    // @LINE:18
    case controllers_Application_Homepage10_route(params@_) =>
      call { 
        controllers_Application_Homepage10_invoker.call(Application_0.Homepage)
      }
  
    // @LINE:21
    case controllers_WebSocketChat_index11_route(params@_) =>
      call { 
        controllers_WebSocketChat_index11_invoker.call(WebSocketChat_2.index)
      }
  
    // @LINE:22
    case controllers_WebSocketChat_socket12_route(params@_) =>
      call { 
        controllers_WebSocketChat_socket12_invoker.call(WebSocketChat_2.socket)
      }
  
    // @LINE:26
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
