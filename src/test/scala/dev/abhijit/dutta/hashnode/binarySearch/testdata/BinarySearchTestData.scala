package dev.abhijit.dutta.hashnode.binarySearch.testdata

import org.scalacheck.Gen

object BinarySearchTestData {

  val sortedArrayGen: Gen[Array[Int]] = for {
    size <- Gen.choose(0, 100)
    elements <- Gen.listOfN(size, Gen.choose(-100, 100))
  } yield elements.sorted.toArray

}
