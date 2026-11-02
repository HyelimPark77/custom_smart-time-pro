package com.sma.smartv3.biz.voice.p245v2;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback;
import com.sma.smartv3.biz.voice.p245v2.VoiceManagerV2$identificationCallback$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceManagerV2$identificationCallback$1 implements AIIdentificationManager.OnIdentificationCallback {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onComplete$lambda$2(String str, VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onIdentificationComplete(str);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEndSuccess$lambda$4(VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onIdentificationEndSuccess();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onIdentificationError$lambda$3(String str, VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onIdentificationError(str);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onProcessComplete$lambda$1(String str, VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onIdentificationProcessComplete(str);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStartSuccess$lambda$0(VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onIdentificationStartSuccess();
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onComplete(final String text) {
        Intrinsics.X0O(text, "text");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 identification -> onComplete: " + text);
        VoiceManagerV2 voiceManagerV2 = VoiceManagerV2.INSTANCE;
        VoiceManagerV2.sendTranslationResult$default(voiceManagerV2, text, null, 2, null);
        VoiceManagerV2.onAIResultConsumption$default(voiceManagerV2, text, 0, 2, null);
        voiceManagerV2.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.kj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$identificationCallback$1.onComplete$lambda$2(text, (VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onEndSuccess() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 identification -> onEndSuccess: ");
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.ij6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$identificationCallback$1.onEndSuccess$lambda$4((VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onIdentificationError(final String msg) {
        Intrinsics.X0O(msg, "msg");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 identification -> onError: " + msg);
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.jj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$identificationCallback$1.onIdentificationError$lambda$3(msg, (VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onProcessComplete(final String text) {
        Intrinsics.X0O(text, "text");
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.mj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$identificationCallback$1.onProcessComplete$lambda$1(text, (VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onStartSuccess() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 identification -> onStartSuccess");
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.lj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$identificationCallback$1.onStartSuccess$lambda$0((VoiceHandleCallback) obj);
            }
        });
    }
}
