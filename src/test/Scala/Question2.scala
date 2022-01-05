import org.scalatest.funsuite.AnyFunSuite
class testQuestion2 extends  AnyFunSuite {

  test("Question2"){
    assert(Question2.max(2,3) === 3)
    assert(Question2.min(5,6)=== 5)
    assert(Question2.next_val(7,8)===8)
  }
}
