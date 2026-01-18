package com.awab.ai

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class MyAccessibilityService : AccessibilityService() {

    override fun onServiceConnected() {
        super.onServiceConnected()
        // الخدمة متصلة - لا تفعل أي شيء
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // لا نفعل أي شيء - فقط للحصول على الإذن
    }

    override fun onInterrupt() {
        // لا نفعل أي شيء
    }
}
