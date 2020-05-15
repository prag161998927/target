// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pratham/Desktop/jaibajrangballi/great work/completion of play/play-samples-play-scala-forms-example/conf/routes
// @DATE:Thu May 14 14:35:36 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
