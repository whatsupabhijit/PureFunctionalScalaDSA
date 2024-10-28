package dev.abhijit.dutta.hashnode.binarySearch

import dev.abhijit.dutta.hashnode.binarySearch.BinarySearch.search
import dev.abhijit.dutta.hashnode.binarySearch.testdata.BinarySearchTestData.sortedArrayGen
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks
import org.scalacheck.Gen

class BinarySearchTest extends AnyFunSuite with ScalaCheckDrivenPropertyChecks {

  test("bs should return the index if the element is found") {
    forAll(sortedArrayGen, Gen.choose(-100, 100)) {
      (arr: Array[Int], target: Int) =>

        val out: Int = search(arr, target)
        assert(out == -1 || out <= arr.length)

        // Check the property if the target exists in the array
        if (arr contains target) assert(out == arr.indexOf(target))
        else assert(out == -1)
    }

  }

}