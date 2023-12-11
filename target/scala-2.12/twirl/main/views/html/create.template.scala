
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Book],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(bookForm: Form[Book])(implicit messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._


Seq[Any](format.raw/*3.1*/("""


"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/layout("Create book")/*8.23*/{_display_(Seq[Any](format.raw/*8.24*/("""
   
   """),format.raw/*10.4*/("""<h1>Create book</h1>

    """),_display_(/*12.6*/helper/*12.12*/.form(action = routes.BooksController.save())/*12.57*/{_display_(Seq[Any](format.raw/*12.58*/("""

       """),_display_(/*14.9*/helper/*14.15*/.inputText(bookForm("id"))),format.raw/*14.41*/("""
       """),_display_(/*15.9*/helper/*15.15*/.inputText(bookForm("title"))),format.raw/*15.44*/("""
       """),_display_(/*16.9*/helper/*16.15*/.inputText(bookForm("price"))),format.raw/*16.44*/("""
       """),_display_(/*17.9*/helper/*17.15*/.inputText(bookForm("author"))),format.raw/*17.45*/("""

        """),format.raw/*19.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i> Create Book</button>
    """)))}),format.raw/*20.6*/("""
""")))}),format.raw/*21.2*/("""

"""))
      }
    }
  }

  def render(bookForm:Form[Book],messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)(messages)

  def f:((Form[Book]) => (play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => (messages) => apply(bookForm)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-12-10T09:56:45.417516
                  SOURCE: E:/newrepo/newproject/app/views/create.scala.html
                  HASH: 1a554cc807dd4d8d3d96206b70bb2a2fc352f525
                  MATRIX: 932->2|1066->68|1110->64|1139->84|1166->86|1195->107|1233->108|1268->116|1321->143|1336->149|1390->194|1429->195|1465->205|1480->211|1527->237|1562->246|1577->252|1627->281|1662->290|1677->296|1727->325|1762->334|1777->340|1828->370|1865->380|2008->493|2040->495
                  LINES: 27->2|30->6|33->3|36->7|37->8|37->8|37->8|39->10|41->12|41->12|41->12|41->12|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|48->19|49->20|50->21
                  -- GENERATED --
              */
          