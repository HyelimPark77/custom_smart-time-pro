package com.sma.smartv3.biz.voice.v2;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.AITranslation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public interface VoiceHandleCallback {

    public static final class DefaultImpls {
        @Deprecated
        public static void onAIModelAIModelError(@aa1 VoiceHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "msg");
            VoiceHandleCallback.access$onAIModelAIModelError$jd(r1, r2);
        }

        @Deprecated
        public static void onAIModelComplete(@aa1 VoiceHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "text");
            VoiceHandleCallback.access$onAIModelComplete$jd(r1, r2);
        }

        @Deprecated
        public static void onAIModelProcessComplete(@aa1 VoiceHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "text");
            VoiceHandleCallback.access$onAIModelProcessComplete$jd(r1, r2);
        }

        @Deprecated
        public static void onIdentificationComplete(@aa1 VoiceHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "text");
            VoiceHandleCallback.access$onIdentificationComplete$jd(r1, r2);
        }

        @Deprecated
        public static void onIdentificationEndSuccess(@aa1 VoiceHandleCallback r0) {
            VoiceHandleCallback.access$onIdentificationEndSuccess$jd(r0);
        }

        @Deprecated
        public static void onIdentificationError(@aa1 VoiceHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "msg");
            VoiceHandleCallback.access$onIdentificationError$jd(r1, r2);
        }

        @Deprecated
        public static void onIdentificationProcessComplete(@aa1 VoiceHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "text");
            VoiceHandleCallback.access$onIdentificationProcessComplete$jd(r1, r2);
        }

        @Deprecated
        public static void onIdentificationStartSuccess(@aa1 VoiceHandleCallback r0) {
            VoiceHandleCallback.access$onIdentificationStartSuccess$jd(r0);
        }

        @Deprecated
        public static void onRecordingBeforeRecording(@aa1 VoiceHandleCallback r0) {
            VoiceHandleCallback.access$onRecordingBeforeRecording$jd(r0);
        }

        @Deprecated
        public static void onRecordingResult(@aa1 VoiceHandleCallback r0, @tb1 AITranslation r1) {
            VoiceHandleCallback.access$onRecordingResult$jd(r0, r1);
        }

        @Deprecated
        public static void onRecordingResultError(@aa1 VoiceHandleCallback r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "error");
            VoiceHandleCallback.access$onRecordingResultError$jd(r1, r2);
        }

        @Deprecated
        public static void onRecordingStartRecording(@aa1 VoiceHandleCallback r0) {
            VoiceHandleCallback.access$onRecordingStartRecording$jd(r0);
        }

        @Deprecated
        public static void onRecordingStop(@aa1 VoiceHandleCallback r0) {
            VoiceHandleCallback.access$onRecordingStop$jd(r0);
        }
    }

    static /* synthetic */ void access$onAIModelAIModelError$jd(VoiceHandleCallback r0, String r1) {
        super.onAIModelAIModelError(r1);
    }

    static /* synthetic */ void access$onAIModelComplete$jd(VoiceHandleCallback r0, String r1) {
        super.onAIModelComplete(r1);
    }

    static /* synthetic */ void access$onAIModelProcessComplete$jd(VoiceHandleCallback r0, String r1) {
        super.onAIModelProcessComplete(r1);
    }

    static /* synthetic */ void access$onIdentificationComplete$jd(VoiceHandleCallback r0, String r1) {
        super.onIdentificationComplete(r1);
    }

    static /* synthetic */ void access$onIdentificationEndSuccess$jd(VoiceHandleCallback r0) {
        super.onIdentificationEndSuccess();
    }

    static /* synthetic */ void access$onIdentificationError$jd(VoiceHandleCallback r0, String r1) {
        super.onIdentificationError(r1);
    }

    static /* synthetic */ void access$onIdentificationProcessComplete$jd(VoiceHandleCallback r0, String r1) {
        super.onIdentificationProcessComplete(r1);
    }

    static /* synthetic */ void access$onIdentificationStartSuccess$jd(VoiceHandleCallback r0) {
        super.onIdentificationStartSuccess();
    }

    static /* synthetic */ void access$onRecordingBeforeRecording$jd(VoiceHandleCallback r0) {
        super.onRecordingBeforeRecording();
    }

    static /* synthetic */ void access$onRecordingResult$jd(VoiceHandleCallback r0, AITranslation r1) {
        super.onRecordingResult(r1);
    }

    static /* synthetic */ void access$onRecordingResultError$jd(VoiceHandleCallback r0, String r1) {
        super.onRecordingResultError(r1);
    }

    static /* synthetic */ void access$onRecordingStartRecording$jd(VoiceHandleCallback r0) {
        super.onRecordingStartRecording();
    }

    static /* synthetic */ void access$onRecordingStop$jd(VoiceHandleCallback r0) {
        super.onRecordingStop();
    }

    default void onAIModelAIModelError(@aa1 String r2) {
        Intrinsics.X0O(r2, "msg");
    }

    default void onAIModelComplete(@aa1 String r2) {
        Intrinsics.X0O(r2, "text");
    }

    default void onAIModelProcessComplete(@aa1 String r2) {
        Intrinsics.X0O(r2, "text");
    }

    default void onIdentificationComplete(@aa1 String r2) {
        Intrinsics.X0O(r2, "text");
    }

    default void onIdentificationEndSuccess() {
    }

    default void onIdentificationError(@aa1 String r2) {
        Intrinsics.X0O(r2, "msg");
    }

    default void onIdentificationProcessComplete(@aa1 String r2) {
        Intrinsics.X0O(r2, "text");
    }

    default void onIdentificationStartSuccess() {
    }

    default void onRecordingBeforeRecording() {
    }

    default void onRecordingResult(@tb1 AITranslation r1) {
    }

    default void onRecordingResultError(@aa1 String r2) {
        Intrinsics.X0O(r2, "error");
    }

    default void onRecordingStartRecording() {
    }

    default void onRecordingStop() {
    }
}
