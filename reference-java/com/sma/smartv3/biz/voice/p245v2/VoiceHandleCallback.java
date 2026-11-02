package com.sma.smartv3.biz.voice.p245v2;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.AITranslation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public interface VoiceHandleCallback {

    public static final class DefaultImpls {
        @Deprecated
        public static void onAIModelAIModelError(@aa1 VoiceHandleCallback voiceHandleCallback, @aa1 String msg) {
            Intrinsics.X0O(msg, "msg");
            VoiceHandleCallback.super.onAIModelAIModelError(msg);
        }

        @Deprecated
        public static void onAIModelComplete(@aa1 VoiceHandleCallback voiceHandleCallback, @aa1 String text) {
            Intrinsics.X0O(text, "text");
            VoiceHandleCallback.super.onAIModelComplete(text);
        }

        @Deprecated
        public static void onAIModelProcessComplete(@aa1 VoiceHandleCallback voiceHandleCallback, @aa1 String text) {
            Intrinsics.X0O(text, "text");
            VoiceHandleCallback.super.onAIModelProcessComplete(text);
        }

        @Deprecated
        public static void onIdentificationComplete(@aa1 VoiceHandleCallback voiceHandleCallback, @aa1 String text) {
            Intrinsics.X0O(text, "text");
            VoiceHandleCallback.super.onIdentificationComplete(text);
        }

        @Deprecated
        public static void onIdentificationEndSuccess(@aa1 VoiceHandleCallback voiceHandleCallback) {
            VoiceHandleCallback.super.onIdentificationEndSuccess();
        }

        @Deprecated
        public static void onIdentificationError(@aa1 VoiceHandleCallback voiceHandleCallback, @aa1 String msg) {
            Intrinsics.X0O(msg, "msg");
            VoiceHandleCallback.super.onIdentificationError(msg);
        }

        @Deprecated
        public static void onIdentificationProcessComplete(@aa1 VoiceHandleCallback voiceHandleCallback, @aa1 String text) {
            Intrinsics.X0O(text, "text");
            VoiceHandleCallback.super.onIdentificationProcessComplete(text);
        }

        @Deprecated
        public static void onIdentificationStartSuccess(@aa1 VoiceHandleCallback voiceHandleCallback) {
            VoiceHandleCallback.super.onIdentificationStartSuccess();
        }

        @Deprecated
        public static void onRecordingBeforeRecording(@aa1 VoiceHandleCallback voiceHandleCallback) {
            VoiceHandleCallback.super.onRecordingBeforeRecording();
        }

        @Deprecated
        public static void onRecordingResult(@aa1 VoiceHandleCallback voiceHandleCallback, @tb1 AITranslation aITranslation) {
            VoiceHandleCallback.super.onRecordingResult(aITranslation);
        }

        @Deprecated
        public static void onRecordingResultError(@aa1 VoiceHandleCallback voiceHandleCallback, @aa1 String error) {
            Intrinsics.X0O(error, "error");
            VoiceHandleCallback.super.onRecordingResultError(error);
        }

        @Deprecated
        public static void onRecordingStartRecording(@aa1 VoiceHandleCallback voiceHandleCallback) {
            VoiceHandleCallback.super.onRecordingStartRecording();
        }

        @Deprecated
        public static void onRecordingStop(@aa1 VoiceHandleCallback voiceHandleCallback) {
            VoiceHandleCallback.super.onRecordingStop();
        }
    }

    default void onAIModelAIModelError(@aa1 String msg) {
        Intrinsics.X0O(msg, "msg");
    }

    default void onAIModelComplete(@aa1 String text) {
        Intrinsics.X0O(text, "text");
    }

    default void onAIModelProcessComplete(@aa1 String text) {
        Intrinsics.X0O(text, "text");
    }

    default void onIdentificationComplete(@aa1 String text) {
        Intrinsics.X0O(text, "text");
    }

    default void onIdentificationEndSuccess() {
    }

    default void onIdentificationError(@aa1 String msg) {
        Intrinsics.X0O(msg, "msg");
    }

    default void onIdentificationProcessComplete(@aa1 String text) {
        Intrinsics.X0O(text, "text");
    }

    default void onIdentificationStartSuccess() {
    }

    default void onRecordingBeforeRecording() {
    }

    default void onRecordingResult(@tb1 AITranslation aITranslation) {
    }

    default void onRecordingResultError(@aa1 String error) {
        Intrinsics.X0O(error, "error");
    }

    default void onRecordingStartRecording() {
    }

    default void onRecordingStop() {
    }
}
