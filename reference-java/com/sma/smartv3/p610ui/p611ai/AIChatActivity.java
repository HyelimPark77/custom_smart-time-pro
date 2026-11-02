package com.sma.smartv3.p610ui.p611ai;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.media.AudioRecord;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uf3;
import com.android.mltcode.paycertificationapi.uz0;
import com.baidu.p559ai.speech.realtime.full.connection.Runner;
import com.baidu.p559ai.speech.realtime.full.download.Result;
import com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.IntentUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.ironsource.C12616d4;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.p608db.dao.AIRecordsDao;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.p611ai.AIChatActivity;
import com.sma.smartv3.p610ui.p612me.AiKeySetActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,992:1\n69#2,3:993\n72#2,5:997\n1#3:996\n1869#4,2:1002\n*S KotlinDebug\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity\n*L\n829#1:993,3\n829#1:997,5\n829#1:996\n769#1:1002,2\n*E\n"})
public class AIChatActivity extends BaseAIActivity {
    private float downY;
    private boolean isRecording;
    private long lastScrollTime;
    private long longPressStartTime;
    private MultiItemTypeAdapter<AIRecords> mAdapter;

    @tb1
    private go0 mAllDeleteTipPopup;

    @tb1
    private AudioRecord mAudioRecord;
    private int mBufferSize;
    public List<AIRecords> mList;

    @tb1
    private PopupWindow mPopupWindow;

    @tb1
    private uf3 mRecordingPopup;

    @tb1
    private AIRecords received;
    private boolean recordingIsClear;
    private long showChatTime;

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXiIiX10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIChatActivity.abhTitleRight_delegate$lambda$0(this.f5159IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X00Xi1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIChatActivity.abhTitleOtherRight_delegate$lambda$0(this.f3891IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIChatActivity.mRecyclerView_delegate$lambda$0(this.f4117IO);
        }
    });

    @aa1
    private final Lazy mChatContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXOIIIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIChatActivity.mChatContent_delegate$lambda$0(this.f2048IO);
        }
    });

    @aa1
    private final Lazy btnAudio$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO0II0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIChatActivity.btnAudio_delegate$lambda$0(this.f1721IO);
        }
    });

    @aa1
    private final Lazy ivChatVoice$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIChatActivity.ivChatVoice_delegate$lambda$0(this.f2185IO);
        }
    });

    @aa1
    private final Lazy btnChatSend$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIChatActivity.btnChatSend_delegate$lambda$0(this.f1986IO);
        }
    });

    @aa1
    private final Lazy tvOpenAiDeduction$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii1iii0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIChatActivity.tvOpenAiDeduction_delegate$lambda$0(this.f2223IO);
        }
    });

    @aa1
    private final Lazy viewKeyboardHeight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIChatActivity.viewKeyboardHeight_delegate$lambda$0(this.f8673IO);
        }
    });
    private boolean inputMethod = true;
    private long longPressThreshold = 300;
    private boolean mRecyclerViewAutoRefresh = true;

    @aa1
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @aa1
    private String mTipContent = "";

    public static final class O00 implements RecordingManager.OnRecordingCallback {
        public O00() {
        }

        public static final void I0IIOi(AIChatActivity aIChatActivity) {
            aIChatActivity.disRecordingPopup();
            aIChatActivity.isRecording = false;
        }

        public static final void IiI10X(AIChatActivity aIChatActivity) {
            aIChatActivity.disRecordingPopup();
        }

        public static final void O00(AIChatActivity aIChatActivity, AITranslation aITranslation) {
            aIChatActivity.addQuestion(aITranslation.getText());
        }

        public static final void XOO0ii0(AIChatActivity aIChatActivity) {
            aIChatActivity.showRecordingPopup();
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onBeforeRecording() {
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResult(final AITranslation aITranslation) {
            if (aITranslation == null || aITranslation.getStatus() != 2 || AIChatActivity.this.getRecordingIsClear()) {
                return;
            }
            final AIChatActivity aIChatActivity = AIChatActivity.this;
            aIChatActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IO0iXO0O
                @Override // java.lang.Runnable
                public final void run() {
                    AIChatActivity.O00.O00(aIChatActivity, aITranslation);
                }
            });
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResultError(String error) {
            Intrinsics.X0O(error, "error");
            final AIChatActivity aIChatActivity = AIChatActivity.this;
            aIChatActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iiIOiX
                @Override // java.lang.Runnable
                public final void run() {
                    AIChatActivity.O00.IiI10X(aIChatActivity);
                }
            });
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public /* bridge */ void onRecordResultLanguage(AISpeech aISpeech) {
            super.onRecordResultLanguage(aISpeech);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStartRecording() {
            final AIChatActivity aIChatActivity = AIChatActivity.this;
            aIChatActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XX00i10X
                @Override // java.lang.Runnable
                public final void run() {
                    AIChatActivity.O00.XOO0ii0(aIChatActivity);
                }
            });
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStopRecording() {
            final AIChatActivity aIChatActivity = AIChatActivity.this;
            aIChatActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi
                @Override // java.lang.Runnable
                public final void run() {
                    AIChatActivity.O00.I0IIOi(aIChatActivity);
                }
            });
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[AIFunctionType.values().length];
            try {
                iArr[AIFunctionType.HEALTH_QA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AIFunctionType.PERSONAL_TRAINER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nAIChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity$questionAssistant$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,992:1\n11561#2:993\n11896#2,3:994\n*S KotlinDebug\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity$questionAssistant$1\n*L\n952#1:993\n952#1:994,3\n*E\n"})
    public static final class XIi00iiXO implements BaseAIActivity.OXO1<AIAnswer> {
        public final /* synthetic */ String XIi00iiXO;

        public XIi00iiXO(String str) {
            this.XIi00iiXO = str;
        }

        public static final boolean O00(AIRecords it) {
            Intrinsics.X0O(it, "it");
            return (it.getMType() == 1 || it.getMType() == 2) ? false : true;
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        public void OXO1(String error) {
            Intrinsics.X0O(error, "error");
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
        public void XIi00iiXO(AIAnswer result) {
            Intrinsics.X0O(result, "result");
            if (result.getText().length() <= 0 || result.getEnded() != 1) {
                return;
            }
            String text = result.getText();
            MultiItemTypeAdapter multiItemTypeAdapter = null;
            if (oe5.m2764O0(text, "```json", false, 2, null) && StringsKt__StringsKt.iIi011O(text, C12616d4.j.f34440d, false, 2, null) && StringsKt__StringsKt.iIi011O(text, C12616d4.j.f34442e, false, 2, null)) {
                String strSubstring = text.substring(StringsKt__StringsKt.OO1101010(text, C12616d4.j.f34440d, 0, false, 6, null), StringsKt__StringsKt.OO1101010(text, C12616d4.j.f34442e, 0, false, 6, null) + 1);
                Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                JSONArray jSONArray = new JSONArray(strSubstring);
                int length = jSONArray.length();
                String[] strArr = new String[length];
                int length2 = jSONArray.length();
                for (int i = 0; i < length2; i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                OIXO1IIOO.iIX0i(AIChatActivity.this.getMList(), new Function1() { // from class: com.android.mltcode.paycertificationapi.XOXiX0
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(AIChatActivity.XIi00iiXO.O00((AIRecords) obj));
                    }
                });
                List<AIRecords> mList = AIChatActivity.this.getMList();
                AIFunction mAIFunction = AIChatActivity.this.getMAIFunction();
                Intrinsics.XXI(mAIFunction);
                mList.add(new AIRecords(0, 0L, null, mAIFunction.getType().getType(), 6, this.XIi00iiXO, null, 0, 0, 0, null, null, null, null, null, 0, null, 130887, null));
                AIChatActivity.addMoveQuestions$default(AIChatActivity.this, null, 1, null);
                AIChatActivity aIChatActivity = AIChatActivity.this;
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    String str = strArr[i2];
                    Intrinsics.XXI(str);
                    aIChatActivity.addMoveQuestions(str);
                    arrayList.add(Unit.OXO1);
                }
                MultiItemTypeAdapter multiItemTypeAdapter2 = AIChatActivity.this.mAdapter;
                if (multiItemTypeAdapter2 == null) {
                    Intrinsics.XXO("mAdapter");
                } else {
                    multiItemTypeAdapter = multiItemTypeAdapter2;
                }
                multiItemTypeAdapter.notifyDataSetChanged();
            }
        }
    }

    public static final class XO0O10 implements BaseAIActivity.OXO1<AIAnswer> {
        public XO0O10() {
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        public void OXO1(String error) {
            Intrinsics.X0O(error, "error");
            AIRecords received = AIChatActivity.this.getReceived();
            if (received != null) {
                String string = AIChatActivity.this.getString(R.string.request_error);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                received.setMContent(string);
            }
            MultiItemTypeAdapter multiItemTypeAdapter = AIChatActivity.this.mAdapter;
            if (multiItemTypeAdapter == null) {
                Intrinsics.XXO("mAdapter");
                multiItemTypeAdapter = null;
            }
            multiItemTypeAdapter.notifyItemChanged(CollectionsKt__CollectionsKt.X11iII1O1(AIChatActivity.this.getMList()));
            AIChatActivity.this.scrollView();
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        /* JADX INFO: renamed from: iO, reason: merged with bridge method [inline-methods] */
        public void XIi00iiXO(AIAnswer result) {
            Intrinsics.X0O(result, "result");
            if (result.getText().length() > 0) {
                AIRecords received = AIChatActivity.this.getReceived();
                if (received != null) {
                    received.setMContent(result.getText());
                }
                AIRecords received2 = AIChatActivity.this.getReceived();
                if (received2 != null) {
                    received2.setMStatus(result.getEnded() == 1 ? 0 : 1);
                }
                MultiItemTypeAdapter multiItemTypeAdapter = null;
                if (result.getEnded() == 1) {
                    MultiItemTypeAdapter multiItemTypeAdapter2 = AIChatActivity.this.mAdapter;
                    if (multiItemTypeAdapter2 == null) {
                        Intrinsics.XXO("mAdapter");
                    } else {
                        multiItemTypeAdapter = multiItemTypeAdapter2;
                    }
                    multiItemTypeAdapter.notifyItemChanged(CollectionsKt__CollectionsKt.X11iII1O1(AIChatActivity.this.getMList()));
                    AIChatActivity.this.scrollView();
                    return;
                }
                if (System.currentTimeMillis() - AIChatActivity.this.getLastScrollTime() > 1000) {
                    MultiItemTypeAdapter multiItemTypeAdapter3 = AIChatActivity.this.mAdapter;
                    if (multiItemTypeAdapter3 == null) {
                        Intrinsics.XXO("mAdapter");
                    } else {
                        multiItemTypeAdapter = multiItemTypeAdapter3;
                    }
                    multiItemTypeAdapter.notifyItemChanged(CollectionsKt__CollectionsKt.X11iII1O1(AIChatActivity.this.getMList()));
                    AIChatActivity.this.scrollView();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.AIChatActivity$iO */
    public static final class C18645iO extends SimpleDownloader {
        public C18645iO() {
        }

        public static final void XIi00iiXO(AIChatActivity aIChatActivity, Result result) {
            String result2 = result.getResult();
            Intrinsics.O10IXXX0X(result2, "getResult(...)");
            aIChatActivity.addQuestion(result2);
        }

        @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
        public void onFailure(String str) {
            AIChatActivity.this.dismissLoading();
            super.onFailure(str);
        }

        @Override // com.baidu.p559ai.speech.realtime.full.download.SimpleDownloader
        public void onMessage(final Result result) {
            Intrinsics.X0O(result, "result");
            super.onMessage(result);
            AIChatActivity.this.dismissLoading();
            if (!result.isFin()) {
                result.isError();
            } else {
                final AIChatActivity aIChatActivity = AIChatActivity.this;
                aIChatActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XOO0XOOii
                    @Override // java.lang.Runnable
                    public final void run() {
                        AIChatActivity.C18645iO.XIi00iiXO(aIChatActivity, result);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(AIChatActivity aIChatActivity) {
        return (ImageView) aIChatActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(AIChatActivity aIChatActivity) {
        return (ImageView) aIChatActivity.findViewById(R.id.abh_title_right);
    }

    public static /* synthetic */ void addMoveQuestions$default(AIChatActivity aIChatActivity, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMoveQuestions");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        aIChatActivity.addMoveQuestions(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addQuestion(String str) {
        AIFunction mAIFunction = getMAIFunction();
        Intrinsics.XXI(mAIFunction);
        AIRecords aIRecords = new AIRecords(0, 0L, null, mAIFunction.getType().getType(), 1, str, null, 0, 0, 0, null, null, null, null, null, 0, null, 131015, null);
        getMList().add(aIRecords);
        addSendRecord(aIRecords);
        AIFunction mAIFunction2 = getMAIFunction();
        Intrinsics.XXI(mAIFunction2);
        AIRecords aIRecords2 = new AIRecords(0, 0L, null, mAIFunction2.getType().getType(), 2, "", null, 1, 0, 0, null, null, null, null, null, 0, null, 130887, null);
        this.received = aIRecords2;
        getMList().add(aIRecords2);
        addReceivedRecord(aIRecords2);
        MultiItemTypeAdapter<AIRecords> multiItemTypeAdapter = this.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.notifyDataSetChanged();
        scrollView();
        sendCurrent(str);
    }

    public static /* synthetic */ void addWelcomeQuestions$default(AIChatActivity aIChatActivity, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addWelcomeQuestions");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        aIChatActivity.addWelcomeQuestions(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnAudio_delegate$lambda$0(AIChatActivity aIChatActivity) {
        return (Button) aIChatActivity.findViewById(R.id.btn_chat_audio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnChatSend_delegate$lambda$0(AIChatActivity aIChatActivity) {
        return (Button) aIChatActivity.findViewById(R.id.btn_chat_send);
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final Button getBtnAudio() {
        return (Button) this.btnAudio$delegate.getValue();
    }

    private final Button getBtnChatSend() {
        return (Button) this.btnChatSend$delegate.getValue();
    }

    private final ImageView getIvChatVoice() {
        return (ImageView) this.ivChatVoice$delegate.getValue();
    }

    private final EditText getMChatContent() {
        return (EditText) this.mChatContent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    private final PFMedium getTvOpenAiDeduction() {
        return (PFMedium) this.tvOpenAiDeduction$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getViewKeyboardHeight() {
        return (View) this.viewKeyboardHeight$delegate.getValue();
    }

    private final void initAdapter() {
        this.mAdapter = new MultiItemTypeAdapter<AIRecords>(this, getMList()) { // from class: com.sma.smartv3.ui.ai.AIChatActivity.initAdapter.1

            /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.AIChatActivity$initAdapter$1$O00 */
            public static final class O00 implements InterfaceC2572jc<AIRecords> {
                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AIRecords aIRecords, int i) {
                    return aIRecords != null && aIRecords.getMType() == 6;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_ai_chat_question_tip;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, AIRecords mAIRecords, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAIRecords, "mAIRecords");
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.AIChatActivity$initAdapter$1$OXO1 */
            public static final class OXO1 implements InterfaceC2572jc<AIRecords> {
                public final /* synthetic */ AIChatActivity OXO1;
                public final /* synthetic */ C186461 XIi00iiXO;

                public OXO1(AIChatActivity aIChatActivity, C186461 c186461) {
                    this.OXO1 = aIChatActivity;
                    this.XIi00iiXO = c186461;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AIRecords aIRecords, int i) {
                    return aIRecords != null && aIRecords.getMType() == 1;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_ai_chat_send;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, AIRecords mAIRecords, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAIRecords, "mAIRecords");
                    TextView textView = (TextView) holder.getView(R.id.chat_send_time);
                    AIChatActivity aIChatActivity = this.OXO1;
                    Intrinsics.XXI(textView);
                    aIChatActivity.isShowTime(textView, mAIRecords.getMTime());
                    TextView textView2 = (TextView) holder.getView(R.id.tv_send_content);
                    textView2.setText(mAIRecords.getMContent());
                    textView2.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(((MultiItemTypeAdapter) this.XIi00iiXO).mContext, R.color.voice_send_bg_color)));
                    ImageViewRound imageViewRound = (ImageViewRound) holder.getView(R.id.iv_send_picture);
                    imageViewRound.setImageDrawable(gk4.XOO0ii0(this.OXO1, R.drawable.icon_voice_default_icon));
                    sz0 sz0Var = sz0.OXO1;
                    if (uz0.OIi0(sz0Var).exists()) {
                        imageViewRound.setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
                    }
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.AIChatActivity$initAdapter$1$XIi00iiXO */
            public static final class XIi00iiXO implements InterfaceC2572jc<AIRecords> {
                public final /* synthetic */ AIChatActivity OXO1;
                public final /* synthetic */ C186461 XIi00iiXO;

                public XIi00iiXO(AIChatActivity aIChatActivity, C186461 c186461) {
                    this.OXO1 = aIChatActivity;
                    this.XIi00iiXO = c186461;
                }

                public static final void IiI10X(AIChatActivity aIChatActivity, String str, View view) {
                    aIChatActivity.share(str);
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, AIRecords mAIRecords, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAIRecords, "mAIRecords");
                    TextView textView = (TextView) holder.getView(R.id.chat_receive_time);
                    AIChatActivity aIChatActivity = this.OXO1;
                    Intrinsics.XXI(textView);
                    aIChatActivity.isShowTime(textView, mAIRecords.getMTime());
                    final String mContent = mAIRecords.getMContent();
                    AIChatActivity aIChatActivity2 = this.OXO1;
                    if (mContent.length() == 0) {
                        mContent = aIChatActivity2.getString(R.string.waiting);
                        Intrinsics.O10IXXX0X(mContent, "getString(...)");
                    }
                    TextView textView2 = (TextView) holder.getView(R.id.tv_receive_content);
                    textView2.setText(mContent);
                    textView2.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(((MultiItemTypeAdapter) this.XIi00iiXO).mContext, R.color.voice_receive_bg_color)));
                    ((TextView) holder.getView(R.id.tv_receive_nick)).setVisibility(8);
                    ImageView imageView = (ImageView) holder.getView(R.id.img_copy_content);
                    imageView.setVisibility(mAIRecords.getMStatus() == 0 ? 0 : 4);
                    final AIChatActivity aIChatActivity3 = this.OXO1;
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IiiXiI0I
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AIChatActivity.C186461.XIi00iiXO.IiI10X(aIChatActivity3, mContent, view);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_ai_chat_receive;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AIRecords aIRecords, int i) {
                    return aIRecords != null && aIRecords.getMType() == 2;
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.AIChatActivity$initAdapter$1$XO0O10 */
            public static final class XO0O10 implements InterfaceC2572jc<AIRecords> {
                public final /* synthetic */ AIChatActivity XIi00iiXO;

                public XO0O10(AIChatActivity aIChatActivity) {
                    this.XIi00iiXO = aIChatActivity;
                }

                public static final void IiI10X(AIChatActivity aIChatActivity, TextView textView, View view) {
                    aIChatActivity.addQuestion(textView.getText().toString());
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, AIRecords mAIRecords, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAIRecords, "mAIRecords");
                    final TextView textView = (TextView) holder.getView(R.id.welcome_tv);
                    textView.setText(mAIRecords.getMContent());
                    textView.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(((MultiItemTypeAdapter) C186461.this).mContext, R.color.voice_receive_bg_color)));
                    final AIChatActivity aIChatActivity = this.XIi00iiXO;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XOIX
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AIChatActivity.C186461.XO0O10.IiI10X(aIChatActivity, textView, view);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_ai_chat_receive_welcome_more;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AIRecords aIRecords, int i) {
                    return aIRecords != null && aIRecords.getMType() == 5;
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.AIChatActivity$initAdapter$1$iO */
            public static final class iO implements InterfaceC2572jc<AIRecords> {
                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AIRecords aIRecords, int i) {
                    return aIRecords != null && aIRecords.getMType() == 4;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_ai_chat_receive_welcome;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, AIRecords mAIRecords, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAIRecords, "mAIRecords");
                }
            }

            {
                addItemViewDelegate(1, new OXO1(this, this));
                addItemViewDelegate(2, new XIi00iiXO(this, this));
                addItemViewDelegate(4, new iO());
                addItemViewDelegate(5, new XO0O10(this));
                addItemViewDelegate(6, new O00());
            }
        };
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView mRecyclerView = getMRecyclerView();
        MultiItemTypeAdapter<AIRecords> multiItemTypeAdapter = this.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        mRecyclerView.setAdapter(multiItemTypeAdapter);
    }

    private final void initialRecorder() {
        this.mBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        this.mAudioRecord = new AudioRecord(1, 16000, 16, 2, this.mBufferSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivChatVoice_delegate$lambda$0(AIChatActivity aIChatActivity) {
        return (ImageView) aIChatActivity.findViewById(R.id.iv_chat_voice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void longClickDown$lambda$0(AIChatActivity aIChatActivity) {
        if (aIChatActivity.isRecording || aIChatActivity.longPressStartTime == 0 || System.currentTimeMillis() - aIChatActivity.longPressStartTime <= aIChatActivity.longPressThreshold) {
            return;
        }
        if (PermissionUtils.isGranted(PermissionConstants.MICROPHONE)) {
            aIChatActivity.startRecording();
        } else {
            aIChatActivity.permission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mChatContent_delegate$lambda$0(AIChatActivity aIChatActivity) {
        return (EditText) aIChatActivity.findViewById(R.id.et_chat_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(AIChatActivity aIChatActivity) {
        return (RecyclerView) aIChatActivity.findViewById(R.id.recycler_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTitleRightClick$lambda$0(AIChatActivity aIChatActivity, View view) {
        aIChatActivity.onSetModel();
        PopupWindow popupWindow = aIChatActivity.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTitleRightClick$lambda$1(AIChatActivity aIChatActivity, View view) {
        aIChatActivity.showDeleteTipPopup();
        PopupWindow popupWindow = aIChatActivity.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTitleRightClick$lambda$2(AIChatActivity aIChatActivity, View view) {
        aIChatActivity.startActivity(new Intent(aIChatActivity, (Class<?>) SearchOnlineActivity.class));
        PopupWindow popupWindow = aIChatActivity.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit permission$lambda$0(PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        PermissionStatus permissionStatus = PermissionStatus.GRANTED;
        return Unit.OXO1;
    }

    private final void processingEditTextKeyboard() {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        getMRecyclerView().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i0X000X0O
            @Override // java.lang.Runnable
            public final void run() {
                AIChatActivity.processingEditTextKeyboard$lambda$0(intRef, this);
            }
        });
        KeyboardUtils.registerSoftInputChangedListener(getWindow(), new KeyboardUtils.OnSoftInputChangedListener() { // from class: com.android.mltcode.paycertificationapi.Ii0X0X
            @Override // com.blankj.utilcode.util.KeyboardUtils.OnSoftInputChangedListener
            public final void onSoftInputChanged(int i) {
                AIChatActivity.processingEditTextKeyboard$lambda$1(this.OXO1, intRef, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processingEditTextKeyboard$lambda$0(Ref.IntRef intRef, AIChatActivity aIChatActivity) {
        intRef.element = aIChatActivity.getMRecyclerView().getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processingEditTextKeyboard$lambda$1(AIChatActivity aIChatActivity, Ref.IntRef intRef, int i) {
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(aIChatActivity), null, null, new AIChatActivity$processingEditTextKeyboard$2$1(aIChatActivity, i, intRef, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollView() {
        RecyclerView.ItemAnimator itemAnimator = getMRecyclerView().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        this.lastScrollTime = System.currentTimeMillis();
        if (this.mRecyclerViewAutoRefresh) {
            RecyclerView.LayoutManager layoutManager = getMRecyclerView().getLayoutManager();
            Intrinsics.X1ii(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(CollectionsKt__CollectionsKt.X11iII1O1(getMList()), 0);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void setTitle(String str) {
        switch (str.hashCode()) {
            case -1671190941:
                if (str.equals("openAIService")) {
                    TextView textView = (TextView) findViewById(R.id.abh_title_center);
                    if (textView != null) {
                        textView.setText(getString(R.string.chatgpt));
                    }
                    String string = getString(R.string.ai_welcome_gpt);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    addWelcomeQuestions(string);
                    return;
                }
                break;
            case -361646967:
                if (str.equals("deepseekAIService")) {
                    TextView textView2 = (TextView) findViewById(R.id.abh_title_center);
                    if (textView2 != null) {
                        textView2.setText(getString(R.string.pay_dail_aigc_deep_seek));
                    }
                    String string2 = getString(R.string.ai_welcome_gpt);
                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                    addWelcomeQuestions(string2);
                    return;
                }
                break;
            case -345876046:
                if (str.equals("baiduAIService")) {
                    TextView textView3 = (TextView) findViewById(R.id.abh_title_center);
                    if (textView3 != null) {
                        textView3.setText(getString(R.string.wenxinyiyan));
                    }
                    String string3 = getString(R.string.ai_welcome);
                    Intrinsics.O10IXXX0X(string3, "getString(...)");
                    addWelcomeQuestions(string3);
                    return;
                }
                break;
            case 1088442160:
                if (str.equals("sparkAIService")) {
                    TextView textView4 = (TextView) findViewById(R.id.abh_title_center);
                    if (textView4 != null) {
                        textView4.setText(getString(R.string.ai_model_spark_desk));
                    }
                    String string4 = getString(R.string.ai_welcome_spark_desk);
                    Intrinsics.O10IXXX0X(string4, "getString(...)");
                    addWelcomeQuestions(string4);
                    return;
                }
                break;
        }
        if (str.length() > 0) {
            TextView textView5 = (TextView) findViewById(R.id.abh_title_center);
            if (textView5 != null) {
                textView5.setText(str);
            }
            String string5 = getString(R.string.ai_welcome_chat_tip);
            Intrinsics.O10IXXX0X(string5, "getString(...)");
            addWelcomeQuestions(string5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$1(AIChatActivity aIChatActivity) {
        List<AIRecords> mList = aIChatActivity.getMList();
        if (mList != null) {
            for (AIRecords aIRecords : mList) {
                aIRecords.setMIsDelete(1);
                aIRecords.setMIsSync(0);
            }
        }
        aIChatActivity.getMRecordsDao().update(aIChatActivity.getMList());
        aIChatActivity.getMList().clear();
        aIChatActivity.addListWelcome();
        MultiItemTypeAdapter<AIRecords> multiItemTypeAdapter = aIChatActivity.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.notifyDataSetChanged();
        ToastUtils.showLong(R.string.clear_success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        return true;
    }

    private final void startRecording() {
        if (q62.OXO1.OIXOOi()) {
            if (this.isRecording) {
                return;
            }
            this.isRecording = true;
            RecordingManager.Companion companion = RecordingManager.Companion;
            companion.getInstance().startRecord();
            companion.getInstance().setRecordingCallback(new O00());
            return;
        }
        if (this.isRecording) {
            return;
        }
        this.isRecording = true;
        showRecordingPopup();
        initialRecorder();
        ThreadsKt.m39451iO(true, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.iOiXi11II
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AIChatActivity.startRecording$lambda$0(this.f8207IO);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startRecording$lambda$0(final AIChatActivity aIChatActivity) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                AudioRecord audioRecord = aIChatActivity.mAudioRecord;
                if (audioRecord != null) {
                    audioRecord.startRecording();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(uz0.X11I(sz0.OXO1));
                try {
                    int i = aIChatActivity.mBufferSize;
                    byte[] bArr = new byte[i];
                    while (aIChatActivity.isRecording) {
                        AudioRecord audioRecord2 = aIChatActivity.mAudioRecord;
                        if (audioRecord2 != null) {
                            audioRecord2.read(bArr, 0, i);
                        }
                        fileOutputStream2.write(bArr);
                        fileOutputStream2.flush();
                    }
                    AudioRecord audioRecord3 = aIChatActivity.mAudioRecord;
                    if (audioRecord3 != null) {
                        audioRecord3.stop();
                    }
                    AudioRecord audioRecord4 = aIChatActivity.mAudioRecord;
                    if (audioRecord4 != null) {
                        audioRecord4.release();
                    }
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    aIChatActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OO
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3108IO.disRecordingPopup();
                        }
                    });
                    if (!aIChatActivity.recordingIsClear) {
                        aIChatActivity.recognition();
                    }
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    aIChatActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OO
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3108IO.disRecordingPopup();
                        }
                    });
                    if (!aIChatActivity.recordingIsClear) {
                    }
                    return Unit.OXO1;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    aIChatActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OO
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3108IO.disRecordingPopup();
                        }
                    });
                    if (!aIChatActivity.recordingIsClear) {
                        aIChatActivity.recognition();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            return Unit.OXO1;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void stopRecording() {
        if (this.isRecording) {
            this.isRecording = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(AIChatActivity aIChatActivity, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            aIChatActivity.downY = motionEvent.getY();
            aIChatActivity.longPressStartTime = System.currentTimeMillis();
            aIChatActivity.longClickDown();
            return true;
        }
        if (action == 1) {
            aIChatActivity.mHandler.removeCallbacksAndMessages(null);
            if (q62.OXO1.OIXOOi()) {
                RecordingManager.Companion.getInstance().stopRecording();
            } else if (aIChatActivity.isRecording) {
                aIChatActivity.stopRecording();
            }
            aIChatActivity.longPressStartTime = 0L;
            return true;
        }
        if (action != 2) {
            return false;
        }
        boolean z = aIChatActivity.downY - motionEvent.getY() > 100.0f;
        aIChatActivity.recordingIsClear = z;
        uf3 uf3Var = aIChatActivity.mRecordingPopup;
        if (uf3Var != null) {
            uf3Var.m3165OX(z);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$1(AIChatActivity aIChatActivity, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            aIChatActivity.mRecyclerViewAutoRefresh = false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvOpenAiDeduction_delegate$lambda$0(AIChatActivity aIChatActivity) {
        return (PFMedium) aIChatActivity.findViewById(R.id.ai_chat_open_deduction_config_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View viewKeyboardHeight_delegate$lambda$0(AIChatActivity aIChatActivity) {
        return aIChatActivity.findViewById(R.id.view_keyboard_height);
    }

    public final void addListWelcome() {
        AIFunction mAIFunction = getMAIFunction();
        AIFunctionType type = mAIFunction != null ? mAIFunction.getType() : null;
        int i = type == null ? -1 : OXO1.OXO1[type.ordinal()];
        if (i == 1) {
            String string = getString(R.string.ai_welcome_health_qa);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            addWelcomeQuestions(string);
            String string2 = getString(R.string.ai_welcome_health_qa_1);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            addMoveQuestions(string2);
            String string3 = getString(R.string.ai_welcome_health_qa_2);
            Intrinsics.O10IXXX0X(string3, "getString(...)");
            addMoveQuestions(string3);
            String string4 = getString(R.string.ai_welcome_health_qa_3);
            Intrinsics.O10IXXX0X(string4, "getString(...)");
            addMoveQuestions(string4);
            return;
        }
        if (i == 2) {
            String string5 = getString(R.string.ai_welcome_personal_trainer);
            Intrinsics.O10IXXX0X(string5, "getString(...)");
            addWelcomeQuestions(string5);
            String string6 = getString(R.string.ai_welcome_personal_trainer_1);
            Intrinsics.O10IXXX0X(string6, "getString(...)");
            addMoveQuestions(string6);
            String string7 = getString(R.string.ai_welcome_personal_trainer_2);
            Intrinsics.O10IXXX0X(string7, "getString(...)");
            addMoveQuestions(string7);
            String string8 = getString(R.string.ai_welcome_personal_trainer_3);
            Intrinsics.O10IXXX0X(string8, "getString(...)");
            addMoveQuestions(string8);
            return;
        }
        q62 q62Var = q62.OXO1;
        if (q62Var.XIi10().length() > 0) {
            setTitle(q62Var.XIi10());
        } else {
            setTitle(AIManager.O10IXXX0X(AIManager.OXO1, 0, 1, null));
        }
        String string9 = getString(R.string.ai_welcome_aichat_1);
        Intrinsics.O10IXXX0X(string9, "getString(...)");
        addMoveQuestions(string9);
        String string10 = getString(R.string.ai_welcome_aichat_2);
        Intrinsics.O10IXXX0X(string10, "getString(...)");
        addMoveQuestions(string10);
        String string11 = getString(R.string.ai_welcome_aichat_3);
        Intrinsics.O10IXXX0X(string11, "getString(...)");
        addMoveQuestions(string11);
    }

    public final void addMoveQuestions(@aa1 String content) {
        Intrinsics.X0O(content, "content");
        AIFunction mAIFunction = getMAIFunction();
        Intrinsics.XXI(mAIFunction);
        getMList().add(new AIRecords(0, 0L, null, mAIFunction.getType().getType(), content.length() == 0 ? 4 : 5, content, null, 0, 0, 0, null, null, null, null, null, 0, null, 130887, null));
    }

    public final void addWelcomeQuestions(@aa1 String content) {
        Intrinsics.X0O(content, "content");
        AIFunction mAIFunction = getMAIFunction();
        Intrinsics.XXI(mAIFunction);
        getMList().add(new AIRecords(0, 0L, null, mAIFunction.getType().getType(), 2, content, null, 1, 0, 0, null, null, null, null, null, 0, null, 130887, null));
        addMoveQuestions$default(this, null, 1, null);
    }

    @Override // com.sma.smartv3.p610ui.p611ai.BaseAIActivity
    public void changeAiModel() {
        showOpenAiDeduction();
    }

    public final void disRecordingPopup() {
        uf3 uf3Var = this.mRecordingPopup;
        if (uf3Var != null) {
            uf3Var.dismiss();
        }
    }

    public final float getDownY() {
        return this.downY;
    }

    public final boolean getInputMethod() {
        return this.inputMethod;
    }

    public final long getLastScrollTime() {
        return this.lastScrollTime;
    }

    public final int getMBufferSize() {
        return this.mBufferSize;
    }

    @aa1
    public final Handler getMHandler() {
        return this.mHandler;
    }

    @aa1
    public final List<AIRecords> getMList() {
        List<AIRecords> list = this.mList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("mList");
        return null;
    }

    @tb1
    public final PopupWindow getMPopupWindow() {
        return this.mPopupWindow;
    }

    public final boolean getMRecyclerViewAutoRefresh() {
        return this.mRecyclerViewAutoRefresh;
    }

    @aa1
    public final String getMTipContent() {
        return this.mTipContent;
    }

    @tb1
    public final AIRecords getReceived() {
        return this.received;
    }

    public final boolean getRecordingIsClear() {
        return this.recordingIsClear;
    }

    public final long getShowChatTime() {
        return this.showChatTime;
    }

    @aa1
    public final List<AIRecords> initList() {
        AIRecordsDao mRecordsDao = getMRecordsDao();
        AIFunction mAIFunction = getMAIFunction();
        AIFunctionType type = mAIFunction != null ? mAIFunction.getType() : null;
        Intrinsics.XXI(type);
        setMList(CollectionsKt___CollectionsKt.OO0Oi10(mRecordsDao.getListASC(type.getType())));
        addListWelcome();
        return getMList();
    }

    @Override // com.sma.smartv3.p610ui.p611ai.BaseAIActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        if (AIManager.OXO1.m38071iI()) {
            getAbhTitleOtherRight().setVisibility(0);
        } else {
            getAbhTitleOtherRight().setVisibility(8);
        }
        getAbhTitleOtherRight().setImageResource(R.drawable.ai_answer_speech_icon);
        getAbhTitleOtherRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getAbhTitleRight().setVisibility(0);
        q62 q62Var = q62.OXO1;
        if (q62Var.I0O() || q62Var.i0Ii001()) {
            getAbhTitleRight().setImageResource(R.drawable.ai_answer_more_icon);
        } else {
            getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        }
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        processingEditTextKeyboard();
        permission();
        initList();
        initAdapter();
        scrollView();
        touchListener();
    }

    public final void isShowTime(@aa1 TextView tvTime, long j) {
        int i;
        Intrinsics.X0O(tvTime, "tvTime");
        long j2 = this.showChatTime;
        if (j2 == 0 || j - j2 > 300000) {
            this.showChatTime = j;
            tvTime.setText(O0X11OiO.m793iI().format(Long.valueOf(j)));
            i = 0;
        } else {
            i = 8;
        }
        tvTime.setVisibility(i);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ai_chat;
    }

    public final void longClickDown() {
        this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XOX0O0
            @Override // java.lang.Runnable
            public final void run() {
                AIChatActivity.longClickDown$lambda$0(this.f4846IO);
            }
        }, this.longPressThreshold + 100);
    }

    @Override // com.sma.smartv3.p610ui.p611ai.BaseAIActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (q62.OXO1.OIXOOi()) {
            VoiceManager.INSTANCE.setRecordingCallback();
        }
        I01XX0.XIi00iiXO(I01XX0.i100IXOX, null, 2, null);
        KeyboardUtils.unregisterSoftInputChangedListener(getWindow());
    }

    public final void onSend(@aa1 View view) {
        String string;
        Intrinsics.X0O(view, "view");
        q62 q62Var = q62.OXO1;
        if (!q62Var.IiX1ii() && !q62Var.OIXOOi() && TextUtils.isEmpty(q62Var.iIiiO()) && !q62Var.XOX()) {
            ToastUtils.showLong(R.string.no_ai_key);
            startActivity(new Intent(this, (Class<?>) AiKeySetActivity.class));
            return;
        }
        Editable text = getMChatContent().getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            ToastUtils.showLong(getString(R.string.enter_content), new Object[0]);
            return;
        }
        KeyboardUtils.hideSoftInput(this);
        getMChatContent().getText().clear();
        addQuestion(string);
    }

    public final void onSwitchInputMethod(@aa1 View view) {
        int i;
        Intrinsics.X0O(view, "view");
        this.inputMethod = !this.inputMethod;
        ImageView ivChatVoice = getIvChatVoice();
        if (this.inputMethod) {
            getMChatContent().setVisibility(8);
            getBtnChatSend().setVisibility(8);
            getBtnAudio().setVisibility(0);
            i = R.drawable.icon_chat_textbox;
        } else {
            getMChatContent().setVisibility(0);
            getBtnChatSend().setVisibility(0);
            getBtnAudio().setVisibility(8);
            i = R.drawable.icon_chat_audio;
        }
        ivChatVoice.setImageResource(i);
    }

    @SuppressLint({"MissingInflatedId"})
    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        q62 q62Var = q62.OXO1;
        if (!q62Var.I0O() && !q62Var.i0Ii001()) {
            showDeleteTipPopup();
            return;
        }
        Object systemService = getSystemService("layout_inflater");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_chat_layout, (ViewGroup) null);
        Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
        PopupWindow popupWindow = this.mPopupWindow;
        if (popupWindow == null) {
            this.mPopupWindow = new PopupWindow(viewInflate, -2, -2);
        } else if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PopupWindow popupWindow2 = this.mPopupWindow;
        if (popupWindow2 != null) {
            popupWindow2.setFocusable(true);
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int width = i + (i - view.getWidth()) + OXI1i1.XIi00iiXO(this, 20.0f);
        int height = iArr[1] + view.getHeight();
        PopupWindow popupWindow3 = this.mPopupWindow;
        if (popupWindow3 != null) {
            popupWindow3.showAtLocation(view, 0, width, height);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.popup_switch_ai_model);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X00XIX1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AIChatActivity.onTitleRightClick$lambda$0(this.f3884IO, view2);
            }
        });
        viewInflate.findViewById(R.id.popup_clear_chats).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i11I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AIChatActivity.onTitleRightClick$lambda$1(this.f7538IO, view2);
            }
        });
        if (q62Var.I0O()) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.popup_search_online);
        if (q62Var.i0Ii001()) {
            linearLayout.setVisibility(0);
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XO0X10iO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AIChatActivity.onTitleRightClick$lambda$2(this.f4681IO, view2);
            }
        });
    }

    public final void onTitleRightOtherClick(@aa1 View view) {
        int i;
        Intrinsics.X0O(view, "view");
        setPlayResult(!isPlayResult());
        ImageView abhTitleOtherRight = getAbhTitleOtherRight();
        if (isPlayResult()) {
            i = R.drawable.ai_answer_speech_icon;
        } else {
            I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
            i = R.drawable.ai_answer_speech_close_icon;
        }
        abhTitleOtherRight.setImageResource(i);
    }

    public final void permission() {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.MICROPHONE);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        String string = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String string2 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.iXiiiO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIChatActivity.permission$lambda$0((PermissionStatus) obj);
            }
        });
    }

    public final void questionAssistant(@aa1 String content) {
        Intrinsics.X0O(content, "content");
        this.mTipContent = content;
        String string = getString(R.string.ai_question_more, content);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        AIFunction mAIFunction = getMAIFunction();
        Intrinsics.XXI(mAIFunction);
        send(new AIQuestion(mAIFunction.getType(), string, null, null, false, false, 60, null), new XIi00iiXO(content), false, false, false);
    }

    public final void recognition() {
        showLoading(true);
        try {
            new Runner(new FileInputStream(uz0.X11I(sz0.OXO1)), 1).run(new C18645iO());
        } catch (IOException unused) {
            dismissLoading();
        }
    }

    public final void sendCurrent(@aa1 String content) {
        Intrinsics.X0O(content, "content");
        this.mRecyclerViewAutoRefresh = true;
        scrollView();
        AIFunction mAIFunction = getMAIFunction();
        Intrinsics.XXI(mAIFunction);
        BaseAIActivity.send$default(this, new AIQuestion(mAIFunction.getType(), content, null, null, false, false, 60, null), new XO0O10(), false, false, false, 28, null);
    }

    public final void setDownY(float f) {
        this.downY = f;
    }

    public final void setInputMethod(boolean z) {
        this.inputMethod = z;
    }

    public final void setLastScrollTime(long j) {
        this.lastScrollTime = j;
    }

    public final void setMBufferSize(int i) {
        this.mBufferSize = i;
    }

    public final void setMList(@aa1 List<AIRecords> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    public final void setMPopupWindow(@tb1 PopupWindow popupWindow) {
        this.mPopupWindow = popupWindow;
    }

    public final void setMRecyclerViewAutoRefresh(boolean z) {
        this.mRecyclerViewAutoRefresh = z;
    }

    public final void setMTipContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTipContent = str;
    }

    public final void setReceived(@tb1 AIRecords aIRecords) {
        this.received = aIRecords;
    }

    public final void setRecordingIsClear(boolean z) {
        this.recordingIsClear = z;
    }

    public final void setShowChatTime(long j) {
        this.showChatTime = j;
    }

    public final void share(@aa1 String content) {
        Intrinsics.X0O(content, "content");
        startActivity(IntentUtils.getShareTextIntent(content));
    }

    @Override // com.sma.smartv3.p610ui.p611ai.BaseAIActivity
    public void showAIDeductionPoints() {
        showOpenAiDeduction();
    }

    public final void showDeleteTipPopup() {
        if (this.mAllDeleteTipPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.tip);
            go0Var.m1865iX(Integer.valueOf(R.string.clear_ai_chat_list));
            go0Var.IXXOO(1);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.XX1Oi
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AIChatActivity.showDeleteTipPopup$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OX110i
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AIChatActivity.showDeleteTipPopup$lambda$0$1(this.f3427IO));
                }
            });
            this.mAllDeleteTipPopup = go0Var;
        }
        go0 go0Var2 = this.mAllDeleteTipPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    public final void showOpenAiDeduction() {
        i1O0OXO1O.OXO1.OXO1("AIChatActivity showOpenAiDeduction openAIDeductionPoints = " + getOpenAIDeductionPoints());
        getTvOpenAiDeduction().setVisibility(8);
    }

    public final void showRecordingPopup() {
        if (this.mRecordingPopup == null) {
            uf3 uf3Var = new uf3(this, 0, 2, null);
            uf3Var.m3165OX(this.recordingIsClear);
            this.mRecordingPopup = uf3Var;
        }
        uf3 uf3Var2 = this.mRecordingPopup;
        if (uf3Var2 != null) {
            uf3Var2.IIX1OXO();
        }
    }

    @sf5(tag = I01XX0.X00Xi1X)
    public final void switchAIServe(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        AIFunction mAIFunction = getMAIFunction();
        if ((mAIFunction != null ? mAIFunction.getType() : null) == AIFunctionType.AI) {
            initView();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void touchListener() {
        getBtnAudio().setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.X11I
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AIChatActivity.touchListener$lambda$0(this.f4220IO, view, motionEvent);
            }
        });
        getMRecyclerView().setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.X100O
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AIChatActivity.touchListener$lambda$1(this.f4119IO, view, motionEvent);
            }
        });
    }
}
