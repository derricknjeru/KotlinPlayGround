import java.util.Collections
import java.util.HashMap
import kotlin.math.min

fun findShortestSubArray(nums: IntArray): Int {
    val left = hashMapOf<Int, Int>()
    val right = hashMapOf<Int, Int>()
    val count = hashMapOf<Int, Int>()

    for (i in nums.indices) {
        val x = nums[i]
        if (left.get(x) == null) left[x] = i
        right[x] = i
        count[x] = (count as java.util.Map<Int, Int>).getOrDefault(x, 0) + 1
    }

    var ans = nums.size
    val degree = Collections.max(count.values)
    for (x in count.keys) {
        if (count.get(x) == degree) {
            ans = min(ans, (right[x]?.minus(left[x]!!) ?: 0) + 1)
        }
    }
    return ans
}

fun main() {

}