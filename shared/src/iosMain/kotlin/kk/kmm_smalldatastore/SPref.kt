package kk.kmm_smalldatastore

import platform.Foundation.NSUserDefaults
import platform.Foundation.setValue
import platform.darwin.NSObject

actual typealias SPref = NSObject

actual fun SPref.getOnBoard(key: String) : Int {
    return NSUserDefaults.standardUserDefaults.integerForKey(key).toInt()
}
actual fun SPref.setOnBoard(key: String, value: Int) {
    NSUserDefaults.standardUserDefaults.setInteger(value.toLong(), key)
}

actual fun SPref.getNightMode(key: String) : Int {
    return NSUserDefaults.standardUserDefaults.integerForKey(key).toInt()
}
actual fun SPref.setNightMode(key: String, value: Int) {
    NSUserDefaults.standardUserDefaults.setInteger(value.toLong(), key)
}