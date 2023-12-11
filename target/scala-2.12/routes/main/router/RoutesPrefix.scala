// @GENERATOR:play-routes-compiler
// @SOURCE:E:/newrepo/newproject/conf/routes
// @DATE:Mon Dec 11 21:28:01 IST 2023


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
