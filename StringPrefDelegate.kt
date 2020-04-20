import android.content.SharedPreferences
import kotlin.reflect.KProperty

class StringPrefDelegate(
    private val sharedPreference: SharedPreferences,
    private val preferenceName: String,
    private val defaultValue: String
) : PrefDelegate<String> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return sharedPreference.getString(preferenceName, defaultValue) ?: defaultValue
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        sharedPreference.edit().putString(preferenceName, value).apply()
    }
}