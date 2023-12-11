
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Book,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(book : Book):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout(book.title)/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
	
		"""),format.raw/*6.3*/("""<h2>"""),_display_(/*6.8*/book/*6.12*/.title),format.raw/*6.18*/("""</h2>
   		   <p>Price : """),_display_(/*7.21*/book/*7.25*/.price),format.raw/*7.31*/("""</p>
   		   <p>Author: """),_display_(/*8.21*/book/*8.25*/.author),format.raw/*8.32*/("""</p>
   		    <a href=""""),_display_(/*9.20*/routes/*9.26*/.BooksController.edit(book.id)),format.raw/*9.56*/("""">Edit</a>
   		     <a href=""""),_display_(/*10.21*/routes/*10.27*/.BooksController.destroy(book.id)),format.raw/*10.60*/("""">Delete</a>

""")))}),format.raw/*12.2*/("""

"""))
      }
    }
  }

  def render(book:Book): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((Book) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-12-10T09:56:45.486220200
                  SOURCE: E:/newrepo/newproject/app/views/show.scala.html
                  HASH: df063a7bb2271b4046de28f2d0b6e8fa8c2dc3c8
                  MATRIX: 905->2|1012->16|1039->18|1065->36|1103->37|1134->42|1164->47|1176->51|1202->57|1254->83|1266->87|1292->93|1343->118|1355->122|1382->129|1432->153|1446->159|1496->189|1554->220|1569->226|1623->259|1668->274
                  LINES: 27->2|32->3|33->4|33->4|33->4|35->6|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|41->12
                  -- GENERATED --
              */
          