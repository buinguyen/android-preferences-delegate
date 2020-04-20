import android.content.SharedPreferences
import kotlin.reflect.KProperty

class IntPrefDelegate(
    private val sharedPreference: SharedPreferences,
    private val preferenceName: String,
    private val defaultValue: Int
) : PrefDelegate<Int> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return sharedPreference.getInt(preferenceName, defaultValue)
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        sharedPreference.edit().putInt(preferenceName, value).apply()
    }
}