package com.sma.smartv3.biz.voice.p245v2;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AIWatchFaceManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIQuestion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AIModelManagerV2 {

    @aa1
    public static final AIModelManagerV2 INSTANCE = new AIModelManagerV2();

    @aa1
    private static final String TAG = "AIModelManagerV2";

    @tb1
    private static OnAIModelCallback mAIModelCallback;

    public interface OnAIModelCallback {

        public static final class DefaultImpls {
            @Deprecated
            public static void onAIModelError(@aa1 OnAIModelCallback onAIModelCallback, @aa1 String msg) {
                Intrinsics.X0O(msg, "msg");
                OnAIModelCallback.super.onAIModelError(msg);
            }

            @Deprecated
            public static void onComplete(@aa1 OnAIModelCallback onAIModelCallback, @aa1 String text) {
                Intrinsics.X0O(text, "text");
                OnAIModelCallback.super.onComplete(text);
            }

            @Deprecated
            public static void onProcessComplete(@aa1 OnAIModelCallback onAIModelCallback, @aa1 String text) {
                Intrinsics.X0O(text, "text");
                OnAIModelCallback.super.onProcessComplete(text);
            }
        }

        default void onAIModelError(@aa1 String msg) {
            Intrinsics.X0O(msg, "msg");
        }

        default void onComplete(@aa1 String text) {
            Intrinsics.X0O(text, "text");
        }

        default void onProcessComplete(@aa1 String text) {
            Intrinsics.X0O(text, "text");
        }
    }

    private AIModelManagerV2() {
    }

    public static /* synthetic */ void textAIFunction$default(AIModelManagerV2 aIModelManagerV2, String str, OnAIModelCallback onAIModelCallback, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        aIModelManagerV2.textAIFunction(str, onAIModelCallback, i);
    }

    public static /* synthetic */ void textAiChat$default(AIModelManagerV2 aIModelManagerV2, String str, OnAIModelCallback onAIModelCallback, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        aIModelManagerV2.textAiChat(str, onAIModelCallback, i);
    }

    public static /* synthetic */ void textAiTranslation$default(AIModelManagerV2 aIModelManagerV2, String str, OnAIModelCallback onAIModelCallback, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        aIModelManagerV2.textAiTranslation(str, onAIModelCallback, i);
    }

    public static /* synthetic */ void textAiWatchFace$default(AIModelManagerV2 aIModelManagerV2, String str, OnAIModelCallback onAIModelCallback, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        aIModelManagerV2.textAiWatchFace(str, onAIModelCallback, i);
    }

    public final void textAIFunction(@aa1 String query, @aa1 OnAIModelCallback mAICallback, int i) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(mAICallback, "mAICallback");
        mAIModelCallback = mAICallback;
        VoiceManagerV2 voiceManagerV2 = VoiceManagerV2.INSTANCE;
        if (voiceManagerV2.isTranslation()) {
            textAiTranslation(query, mAICallback, i);
        } else if (voiceManagerV2.isSupportAIWatchface()) {
            textAiWatchFace(query, mAICallback, i);
        } else {
            textAiChat(query, mAICallback, i);
        }
    }

    public final void textAiChat(@aa1 String query, @aa1 final OnAIModelCallback mAICallback, int i) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(mAICallback, "mAICallback");
        AIManager.OXO1.iIXi1iiXI(new AIQuestion(AIFunctionType.AI, query, null, null, false, false, 60, null), new O1XIiIO<AIAnswer>() { // from class: com.sma.smartv3.biz.voice.v2.AIModelManagerV2.textAiChat.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                mAICallback.onAIModelError(error);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(AIAnswer aIAnswer) {
                i1O0OXO1O.OXO1.OXO1(AIModelManagerV2.TAG + " AIChat handleResponse -> " + aIAnswer);
                if (aIAnswer != null) {
                    OnAIModelCallback onAIModelCallback = mAICallback;
                    if (aIAnswer.getEnded() != 1) {
                        onAIModelCallback.onProcessComplete(aIAnswer.getText());
                    } else {
                        VoiceManagerV2.INSTANCE.sendTranslationResultOutput(aIAnswer.getText());
                        onAIModelCallback.onComplete(aIAnswer.getText());
                    }
                }
            }
        }, true, false, q62.OXO1.iXOII(), i);
    }

    public final void textAiTranslation(@aa1 String query, @aa1 OnAIModelCallback mAICallback, int i) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(mAICallback, "mAICallback");
        AITranslationManager.INSTANCE.textTranslation(query, mAICallback, i);
    }

    public final void textAiWatchFace(@aa1 String query, @aa1 final OnAIModelCallback mAICallback, int i) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(mAICallback, "mAICallback");
        AIWatchFaceManager.OXO1.OiIIX101O(query, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.v2.AIModelManagerV2.textAiWatchFace.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                mAICallback.onAIModelError(error);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str) {
                if (str == null || str.length() <= 0) {
                    mAICallback.onAIModelError("Path Error");
                } else {
                    mAICallback.onComplete(str);
                }
            }
        }, i);
    }
}
