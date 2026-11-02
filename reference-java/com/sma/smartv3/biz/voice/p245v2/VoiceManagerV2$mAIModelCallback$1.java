package com.sma.smartv3.biz.voice.p245v2;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback;
import com.sma.smartv3.biz.voice.p245v2.VoiceManagerV2$mAIModelCallback$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceManagerV2$mAIModelCallback$1 implements AIModelManagerV2.OnAIModelCallback {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAIModelError$lambda$2(String str, VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onAIModelAIModelError(str);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onComplete$lambda$1(String str, VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onAIModelComplete(str);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onProcessComplete$lambda$0(String str, VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onAIModelProcessComplete(str);
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIModelManagerV2.OnAIModelCallback
    public void onAIModelError(final String msg) {
        Intrinsics.X0O(msg, "msg");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onAIModelError -> onComplete: " + msg);
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.pj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$mAIModelCallback$1.onAIModelError$lambda$2(msg, (VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIModelManagerV2.OnAIModelCallback
    public void onComplete(final String text) {
        Intrinsics.X0O(text, "text");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 mAIModelCallback -> onComplete: " + text);
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.nj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$mAIModelCallback$1.onComplete$lambda$1(text, (VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIModelManagerV2.OnAIModelCallback
    public void onProcessComplete(final String text) {
        Intrinsics.X0O(text, "text");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 mAIModelCallback -> onProcessComplete: " + text);
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.oj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$mAIModelCallback$1.onProcessComplete$lambda$0(text, (VoiceHandleCallback) obj);
            }
        });
    }
}
