import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import scala.util.Try
import scala.util.Using
import scala.io.Source
import scala.util.Success


class EltSpec extends AnyFreeSpec with Matchers {
  "etl" - {
    "transforms a textfile by making all the text lowercase and saving this to a new file" in {
      val input = "/workspaces/hands-on-introduction-scala-4413550/src/test/scala/resources/input.txt"
      val output = "/workspaces/hands-on-introduction-scala-4413550/src/test/scala/resources/output.txt"
      val expectedFileContents = List("hello world")
      etl(input, output)
      readFile(output) shouldEqual Success(expectedFileContents)
    }
  }
  private def readFile(filePath: String): Try[List[String]] =
    Using(Source.fromFile(filePath))(_.getLines.toList)
}
