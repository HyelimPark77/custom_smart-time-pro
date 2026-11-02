package com.sma.smartv3.biz.voice.v2;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.nj6;
import com.android.mltcode.paycertificationapi.oj6;
import com.android.mltcode.paycertificationapi.pj6;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceManagerV2$mAIModelCallback$1 implements AIModelManagerV2.OnAIModelCallback {
    public VoiceManagerV2$mAIModelCallback$1() {
    }

    public static /* synthetic */ Unit OXO1(String r0, VoiceHandleCallback r1) {
        return onAIModelError$lambda$2(r0, r1);
    }

    public static /* synthetic */ Unit XIi00iiXO(String r0, VoiceHandleCallback r1) {
        return onComplete$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit iO(String r0, VoiceHandleCallback r1) {
        return onProcessComplete$lambda$0(r0, r1);
    }

    private static final Unit onAIModelError$lambda$2(String r1, VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAIModelAIModelError(r1);
        return Unit.OXO1;
    }

    private static final Unit onComplete$lambda$1(String r1, VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAIModelComplete(r1);
        return Unit.OXO1;
    }

    private static final Unit onProcessComplete$lambda$0(String r1, VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAIModelProcessComplete(r1);
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIModelManagerV2.OnAIModelCallback
    public void onAIModelError(final String r4) {
        Intrinsics.X0O(r4, "msg");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onAIModelError -> onComplete: " + r4);
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new pj6(r4));
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIModelManagerV2.OnAIModelCallback
    public void onComplete(final String r4) {
        Intrinsics.X0O(r4, "text");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 mAIModelCallback -> onComplete: " + r4);
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new nj6(r4));
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIModelManagerV2.OnAIModelCallback
    public void onProcessComplete(final String r4) {
        Intrinsics.X0O(r4, "text");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 mAIModelCallback -> onProcessComplete: " + r4);
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new oj6(r4));
    }
}
