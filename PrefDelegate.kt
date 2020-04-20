import kotlin.reflect.KProperty

interface PrefDelegate<T> {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T)
}