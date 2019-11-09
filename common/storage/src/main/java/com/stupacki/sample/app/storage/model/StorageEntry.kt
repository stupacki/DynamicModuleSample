package com.stupacki.sample.app.storage.model

import io.objectbox.annotation.Convert
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import java.util.*

@Entity
data class StorageEntry(
    val id: String = "",
    val payload: String = "",
    val type: String = "",
    @Convert(converter = Validity.Converter::class, dbType = Int::class)
    val validity: Validity = Validity.SPAN_FOREVER
) {

    @Id
    var dbIdentifier: Long = NEW_ID
    private val timestamp: Long = newTimeStamp()

    fun isValid(isAppStart: Boolean): Boolean =
        let {
            when {
                validity == Validity.SPAN_FOREVER -> true
                timestamp + validity.time > newTimeStamp() -> true
                validity == Validity.SPAN_NEXT_APP_START && !isAppStart -> true
                else -> false
            }
        }

    companion object {
        private const val NEW_ID: Long = 0L
        private const val SECONDS_FACTOR = 1000

        fun newTimeStamp(): Long = Calendar.getInstance().timeInMillis / SECONDS_FACTOR
    }
}