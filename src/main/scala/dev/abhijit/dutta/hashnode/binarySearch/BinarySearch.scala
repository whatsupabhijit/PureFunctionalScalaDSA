package dev.abhijit.dutta.hashnode.binarySearch

// 704
// https://leetcode.com/problems/binary-search/

object BinarySearch {

  def search(nums: Array[Int], target: Int): Int = {

    @scala.annotation.tailrec
    def bs(low: Int, high: Int): Int =
      if (low > high) -1
      else {
        val mid = low + (high - low) / 2

        if (nums(mid) == target) mid
        else if (nums(mid) > target) bs(low, mid - 1)
        else bs(mid + 1, high)
      }

    bs(0, nums.length - 1)
  }

}
