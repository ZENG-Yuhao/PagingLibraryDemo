package com.zengyuhao.paginglibrarydemo.paging

import com.zengyuhao.paginglibrarydemo.vo.Book
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.roundToLong

/**
 * @param latency in milliseconds
 * @param stability if latency=100, statbility=0.2 then delay = latency +/- (latency*stability) = 100 +/- 20 = [80, 120]
 * @param PLR Package Lost Rate in range [0, 1]
 */
class NetworkBookRepoEmulator(
        private val latency: Long,
        private val stability: Float,
        private val PLR: Float) {

    fun getBooks(id: Long, size: Int): List<Book>? {
        val random = Random(System.currentTimeMillis())
        if (random.nextFloat() < PLR) {
            return null
        } else {
            val list = ArrayList<Book>(size)
            for (i in 0 until size) {
                list.add(
                        Book(
                                id + i,
                                "Book#${random.nextInt(100_000)}",
                                "author#${random.nextInt(10_000)}",
                                "Book generated by NetworkBookRepoEmulator",
                                "Network"
                        )
                )
            }

            // range [-stability, statbility)
            val error = random.nextFloat() * (2 * stability) - stability
            val delay = latency + error.roundToLong()
            Thread.sleep(delay)
            return list
        }
    }
}