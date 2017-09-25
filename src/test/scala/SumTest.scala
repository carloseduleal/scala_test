import org.scalatest.FlatSpec
import math_operations.Sum

class SumTest extends FlatSpec {

  it should "Should return 2 as sum result" in {
    var result = Sum.sum(1,1)
    assert(result == 2)
  }

}
