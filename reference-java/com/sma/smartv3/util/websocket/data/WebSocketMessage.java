package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public abstract class WebSocketMessage {
    public /* synthetic */ WebSocketMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @tb1
    public abstract String getRequest_id();

    @tb1
    public abstract String getSessionId();

    private WebSocketMessage() {
    }
}
