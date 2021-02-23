package com.symphony.crash

import android.app.Activity
import android.os.Bundle
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Ths will crash the app when wrapping the APK with MI
        DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(
            "2021-02-23T14:05:15.223Z",
            OffsetDateTime::from
        )
    }
}
