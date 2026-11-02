package com.sma.smartv3.biz.voice.v2;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AIWatchFaceManager;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIQuestion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AIModelManagerV2 {

    @aa1
    public static final AIModelManagerV2 INSTANCE = null;

    @aa1
    private static final String TAG = null;

    @tb1
    private static OnAIModelCallback mAIModelCallback;

    public interface OnAIModelCallback {

        public static final class DefaultImpls {
            @Deprecated
            public static void onAIModelError(@aa1 OnAIModelCallback r1, @aa1 String r2) {
                Intrinsics.X0O(r2, "msg");
                OnAIModelCallback.access$onAIModelError$jd(r1, r2);
            }

            @Deprecated
            public static void onComplete(@aa1 OnAIModelCallback r1, @aa1 String r2) {
                Intrinsics.X0O(r2, "text");
                OnAIModelCallback.access$onComplete$jd(r1, r2);
            }

            @Deprecated
            public static void onProcessComplete(@aa1 OnAIModelCallback r1, @aa1 String r2) {
                Intrinsics.X0O(r2, "text");
                OnAIModelCallback.access$onProcessComplete$jd(r1, r2);
            }
        }

        static /* synthetic */ void access$onAIModelError$jd(OnAIModelCallback r0, String r1) {
            super.onAIModelError(r1);
        }

        static /* synthetic */ void access$onComplete$jd(OnAIModelCallback r0, String r1) {
            super.onComplete(r1);
        }

        static /* synthetic */ void access$onProcessComplete$jd(OnAIModelCallback r0, String r1) {
            super.onProcessComplete(r1);
        }

        default void onAIModelError(@aa1 String r2) {
            Intrinsics.X0O(r2, "msg");
        }

        default void onComplete(@aa1 String r2) {
            Intrinsics.X0O(r2, "text");
        }

        default void onProcessComplete(@aa1 String r2) {
            Intrinsics.X0O(r2, "text");
        }
    }

    static {
        INSTANCE = new AIModelManagerV2();
        TAG = "AIModelManagerV2";
    }

    private AIModelManagerV2() {
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return TAG;
    }

    public static /* synthetic */ void textAIFunction$default(AIModelManagerV2 r0, String r1, OnAIModelCallback r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = -1;
    L5:
        r0.textAIFunction(r1, r2, r3);
    }

    public static /* synthetic */ void textAiChat$default(AIModelManagerV2 r0, String r1, OnAIModelCallback r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = -1;
    L5:
        r0.textAiChat(r1, r2, r3);
    }

    public static /* synthetic */ void textAiTranslation$default(AIModelManagerV2 r0, String r1, OnAIModelCallback r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = -1;
    L5:
        r0.textAiTranslation(r1, r2, r3);
    }

    public static /* synthetic */ void textAiWatchFace$default(AIModelManagerV2 r0, String r1, OnAIModelCallback r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = -1;
    L5:
        r0.textAiWatchFace(r1, r2, r3);
    }

    public final void textAIFunction(@aa1 String r3, @aa1 OnAIModelCallback r4, int r5) {
        Intrinsics.X0O(r3, "query");
        Intrinsics.X0O(r4, "mAICallback");
        mAIModelCallback = r4;
        VoiceManagerV2 r0 = VoiceManagerV2.INSTANCE;
        if (r0.isTranslation() == false) goto L7;
        textAiTranslation(r3, r4, r5);
        return;
    L7:
        if (r0.isSupportAIWatchface() == false) goto L10;
        textAiWatchFace(r3, r4, r5);
        return;
    L10:
        textAiChat(r3, r4, r5);
    }

    public final void textAiChat(@aa1 String r12, @aa1 final OnAIModelCallback r13, int r14) {
        Intrinsics.X0O(r12, "query");
        Intrinsics.X0O(r13, "mAICallback");
        AIManager r1 = AIManager.OXO1;
        AIQuestion r2 = new AIQuestion(AIFunctionType.AI, r12, null, null, false, false, 60, null);
        int r6 = q62.OXO1.iXOII();
        r1.iIXi1iiXI(r2, new AnonymousClass1(r13), true, false, r6, r14);
    }

    public final void textAiTranslation(@aa1 String r2, @aa1 OnAIModelCallback r3, int r4) {
        Intrinsics.X0O(r2, "query");
        Intrinsics.X0O(r3, "mAICallback");
        AITranslationManager.INSTANCE.textTranslation(r2, r3, r4);
    }

    public final void textAiWatchFace(@aa1 String r3, @aa1 final OnAIModelCallback r4, int r5) {
        Intrinsics.X0O(r3, "query");
        Intrinsics.X0O(r4, "mAICallback");
        AIWatchFaceManager.OXO1.OiIIX101O(r3, new C34181(r4), r5);
    }
}
