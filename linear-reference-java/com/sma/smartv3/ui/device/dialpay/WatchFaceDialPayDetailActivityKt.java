package com.sma.smartv3.ui.device.dialpay;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes18.dex */
public final class WatchFaceDialPayDetailActivityKt {
    @tb1
    public static final Object OXO1(@aa1 Continuation<? super Boolean> r3) {
        return TimeoutKt.iO(2000, new WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2(null), r3);
    }
}
