import org.scalatest.funsuite.AnyFunSuite
class testQuestion5 extends  AnyFunSuite {
  test("Question5"){
    assert(Question5.conditional[String]("String",x => x.length>5,x => x.reverse ) === "gnirtS")
    assert(Question5.conditional[String]("Hello",x => x.length<5,x => x.reverse ) === "Hello")
  }
}
