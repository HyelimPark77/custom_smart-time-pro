package com.sma.smartv3.biz.voice.v2;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.qj6;
import com.android.mltcode.paycertificationapi.rj6;
import com.android.mltcode.paycertificationapi.sj6;
import com.android.mltcode.paycertificationapi.tj6;
import com.android.mltcode.paycertificationapi.uj6;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.AITranslation;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceManagerV2$recordCallBack$1 implements RecordingManager.OnRecordingCallback {
    public VoiceManagerV2$recordCallBack$1() {
    }

    public static /* synthetic */ Unit O00(AITranslation r0, VoiceHandleCallback r1) {
        return onRecordResult$lambda$3(r0, r1);
    }

    public static /* synthetic */ Unit OXO1(VoiceHandleCallback r0) {
        return onBeforeRecording$lambda$0(r0);
    }

    public static /* synthetic */ Unit XIi00iiXO(VoiceHandleCallback r0) {
        return onStartRecording$lambda$1(r0);
    }

    public static /* synthetic */ Unit XO0O10(String r0, VoiceHandleCallback r1) {
        return onRecordResultError$lambda$4(r0, r1);
    }

    public static /* synthetic */ Unit iO(VoiceHandleCallback r0) {
        return onStopRecording$lambda$2(r0);
    }

    private static final Unit onBeforeRecording$lambda$0(VoiceHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onRecordingBeforeRecording();
        return Unit.OXO1;
    }

    private static final Unit onRecordResult$lambda$3(AITranslation r1, VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onRecordingResult(r1);
        return Unit.OXO1;
    }

    private static final Unit onRecordResultError$lambda$4(String r1, VoiceHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onRecordingResultError(r1);
        return Unit.OXO1;
    }

    private static final Unit onStartRecording$lambda$1(VoiceHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onRecordingStartRecording();
        return Unit.OXO1;
    }

    private static final Unit onStopRecording$lambda$2(VoiceHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onRecordingStop();
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onBeforeRecording() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResult -> onBeforeRecording");
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new uj6());
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onRecordResult(final AITranslation r6) {
        if (r6 != null) goto L4;
    L6:
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResult -> result: " + r6);
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new qj6(r6));
        return;
    L4:
        if (r6.getStatus() != 2) goto L6;
        VoiceManagerV2 r0 = VoiceManagerV2.INSTANCE;
        VoiceManagerV2.sendTranslationResult$default(r0, r6.getText(), null, 2, null);
        VoiceManagerV2.onAIResultConsumption$default(r0, r6.getText(), 0, 2, null);
        goto L6
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onRecordResultError(final String r4) {
        Intrinsics.X0O(r4, "error");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResultError -> error: " + r4);
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new sj6(r4));
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public /* bridge */ void onRecordResultLanguage(AISpeech r1) {
        super.onRecordResultLanguage(r1);
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onStartRecording() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResult ->onStartRecording");
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new rj6());
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onStopRecording() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResult -> onStopRecording");
        VoiceManagerV2.access$notifyCallback(VoiceManagerV2.INSTANCE, new tj6());
    }
}
