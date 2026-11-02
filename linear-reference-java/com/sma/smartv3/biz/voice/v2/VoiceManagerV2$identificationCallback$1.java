package com.sma.smartv3.biz.voice.v2;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ij6;
import com.android.mltcode.paycertificationapi.jj6;
import com.android.mltcode.paycertificationapi.kj6;
import com.android.mltcode.paycertificationapi.lj6;
import com.android.mltcode.paycertificationapi.mj6;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceManagerV2$identificationCallback$1 implements AIIdentificationManager.OnIdentificationCallback {
    public VoiceManagerV2$identificationCallback$1() {
    }

    public static /* synthetic */ Unit O00(String r0, VoiceHandleCallback r1) {
        return onIdentificationError$lambda$3(r0, r1);
    }

    public static /* synthetic */ Unit OXO1(String r0, VoiceHandleCallback r1) {
        return onProcessComplete$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit XIi00iiXO(VoiceHandleCallback r0) {
        return onEndSuccess$lambda$4(r0);
    }

    public static /* synthetic */ Unit XO0O10(VoiceHandleCallback r0) {
        return onStartSuccess$lambda$0(r0);
    }

    public static /* synthetic */ Unit iO(String r0, VoiceHandleCallback r1) {
        return onComplete$lambda$2(r0, r1);
    }

    private static final Unit onComplete$lambda$2(String r1, VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIdentificationComplete(r1);
        return Unit.OXO1;
    }

    private static final Unit onEndSuccess$lambda$4(VoiceHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onIdentificationEndSuccess();
        return Unit.OXO1;
    }

    private static final Unit onIdentificationError$lambda$3(String r1, VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIdentificationError(r1);
        return Unit.OXO1;
    }

    private static final Unit onProcessComplete$lambda$1(String r1, VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIdentificationProcessComplete(r1);
        return Unit.OXO1;
    }

    private static final Unit onStartSuccess$lambda$0(VoiceHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onIdentificationStartSuccess();
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onComplete(final String r5) {
        Intrinsics.X0O(r5, "text");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 identification -> onComplete: " + r5);
        VoiceManagerV2 r0 = VoiceManagerV2.INSTANCE;
        VoiceManagerV2.sendTranslationResult$default(r0, r5, null, 2, null);
        VoiceManagerV2.onAIResultConsumption$default(r0, r5, 0, 2, null);
        VoiceManagerV2.access$notifyCallback(r0, new kj6(r5));
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onEndSuccess() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 identification -> onEndSuccess: ");
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new ij6());
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onIdentificationError(final String r4) {
        Intrinsics.X0O(r4, "msg");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 identification -> onError: " + r4);
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new jj6(r4));
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onProcessComplete(final String r3) {
        Intrinsics.X0O(r3, "text");
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new mj6(r3));
    }

    @Override // com.sma.smartv3.biz.voice.v2.AIIdentificationManager.OnIdentificationCallback
    public void onStartSuccess() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 identification -> onStartSuccess");
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new lj6());
    }
}
