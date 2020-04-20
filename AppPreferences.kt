import android.content.Context
import android.content.SharedPreferences

class AppPreferences constructor(context: Context) {

    private var mPref: SharedPreferences =
        context.getSharedPreferences("FintechAppStorage", Context.MODE_PRIVATE)

    var newAccessToken by stringPref(ACCESS_TOKEN, "")

    fun stringPref(key: String, defaultValue: String) = StringPrefDelegate(mPref, key, defaultValue)

    companion object {
        const val ACCESS_TOKEN = "ACCESS_TOKEN"
    }
}