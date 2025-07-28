package io

import java.io.File

fun main() {
    val ipToCount = mutableMapOf<String, Int>()
    File("src/ips").forEachLine {
        val previousCount = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previousCount + 1)
    }

    var maxCount:Int=0
    var mostFrequentIp:String=ipToCount.keys.first()
    for((ip,count) in ipToCount){
        if(count>maxCount){
            maxCount=count
            mostFrequentIp=ip
        }
    }
    println("The most frequent IP is $mostFrequentIp and it was seen $maxCount times")
}