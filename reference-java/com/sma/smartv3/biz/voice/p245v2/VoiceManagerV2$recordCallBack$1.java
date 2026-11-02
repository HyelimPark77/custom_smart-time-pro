package com.sma.smartv3.biz.voice.p245v2;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.p245v2.VoiceHandleCallback;
import com.sma.smartv3.biz.voice.p245v2.VoiceManagerV2$recordCallBack$1;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.AITranslation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceManagerV2$recordCallBack$1 implements RecordingManager.OnRecordingCallback {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBeforeRecording$lambda$0(VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onRecordingBeforeRecording();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRecordResult$lambda$3(AITranslation aITranslation, VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onRecordingResult(aITranslation);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRecordResultError$lambda$4(String str, VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onRecordingResultError(str);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStartRecording$lambda$1(VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onRecordingStartRecording();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStopRecording$lambda$2(VoiceHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onRecordingStop();
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onBeforeRecording() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResult -> onBeforeRecording");
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.uj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$recordCallBack$1.onBeforeRecording$lambda$0((VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onRecordResult(final AITranslation aITranslation) {
        if (aITranslation != null && aITranslation.getStatus() == 2) {
            VoiceManagerV2 voiceManagerV2 = VoiceManagerV2.INSTANCE;
            VoiceManagerV2.sendTranslationResult$default(voiceManagerV2, aITranslation.getText(), null, 2, null);
            VoiceManagerV2.onAIResultConsumption$default(voiceManagerV2, aITranslation.getText(), 0, 2, null);
        }
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResult -> result: " + aITranslation);
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.qj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$recordCallBack$1.onRecordResult$lambda$3(aITranslation, (VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onRecordResultError(final String error) {
        Intrinsics.X0O(error, "error");
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResultError -> error: " + error);
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.sj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$recordCallBack$1.onRecordResultError$lambda$4(error, (VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public /* bridge */ void onRecordResultLanguage(AISpeech aISpeech) {
        super.onRecordResultLanguage(aISpeech);
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onStartRecording() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResult ->onStartRecording");
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.rj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$recordCallBack$1.onStartRecording$lambda$1((VoiceHandleCallback) obj);
            }
        });
    }

    @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
    public void onStopRecording() {
        i1O0OXO1O.OXO1.OXO1("AIManagerV2 VoiceManagerV2 onRecordResult -> onStopRecording");
        VoiceManagerV2.INSTANCE.notifyCallback(new Function1() { // from class: com.android.mltcode.paycertificationapi.tj6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VoiceManagerV2$recordCallBack$1.onStopRecording$lambda$2((VoiceHandleCallback) obj);
            }
        });
    }
}
