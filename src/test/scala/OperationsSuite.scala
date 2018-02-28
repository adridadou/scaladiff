import org.scalatest.{FunSuite, Matchers}
import org.adridadou.scaladiff.Operation
import org.adridadou.scaladiff.OperationType._

class OperationsSuite extends FunSuite with Matchers {
  test("a stringified Operation reflects it's logical diff representation") {
    val equalsOp = Operation(Equals, "things")
    val insertOp = Operation(Insert, "stuff")
    val deleteOp = Operation(Delete, "s")

    equalsOp.toString should equal("things")
    insertOp.toString should equal("+stuff")
    deleteOp.toString should equal("-s")
  }

  test("a list of Operations can be joined together to create a diff") {
    val ops = List(
      Operation(Equals, "bills "),
      Operation(Insert, "sw"),
      Operation(Delete, "b"),
      Operation(Equals, "o"),
      Operation(Delete, "a"),
      Operation(Equals, "rds")
    )

    ops.mkString should equal("bills +sw-bo-ards")
  }
}
