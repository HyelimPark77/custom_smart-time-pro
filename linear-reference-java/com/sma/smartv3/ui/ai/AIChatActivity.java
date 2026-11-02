package com.sma.smartv3.ui.ai;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
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
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IO0II0i;
import com.android.mltcode.paycertificationapi.IO0iXO0O;
import com.android.mltcode.paycertificationapi.IXI;
import com.android.mltcode.paycertificationapi.IXOIIIO;
import com.android.mltcode.paycertificationapi.Ii0X0X;
import com.android.mltcode.paycertificationapi.Ii0i;
import com.android.mltcode.paycertificationapi.Ii1iii0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OO;
import com.android.mltcode.paycertificationapi.OX110i;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.Oi;
import com.android.mltcode.paycertificationapi.X00XIX1;
import com.android.mltcode.paycertificationapi.X00Xi1X;
import com.android.mltcode.paycertificationapi.X1;
import com.android.mltcode.paycertificationapi.X100O;
import com.android.mltcode.paycertificationapi.X11I;
import com.android.mltcode.paycertificationapi.XO0X10iO;
import com.android.mltcode.paycertificationapi.XOO0XOOii;
import com.android.mltcode.paycertificationapi.XOX0O0;
import com.android.mltcode.paycertificationapi.XOXiX0;
import com.android.mltcode.paycertificationapi.XX00i10X;
import com.android.mltcode.paycertificationapi.XX1Oi;
import com.android.mltcode.paycertificationapi.XXiIiX10;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i0X000X0O;
import com.android.mltcode.paycertificationapi.i11I;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOiXi11II;
import com.android.mltcode.paycertificationapi.iXiiiO;
import com.android.mltcode.paycertificationapi.iiIOiX;
import com.android.mltcode.paycertificationapi.iiiO;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uf3;
import com.android.mltcode.paycertificationapi.uz0;
import com.baidu.ai.speech.realtime.full.connection.Runner;
import com.baidu.ai.speech.realtime.full.download.Result;
import com.baidu.ai.speech.realtime.full.download.SimpleDownloader;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.IntentUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.ironsource.C2985d4;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.db.dao.AIRecordsDao;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.AiKeySetActivity;
import com.sma.smartv3.view.text.PFMedium;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,992:1\n69#2,3:993\n72#2,5:997\n1#3:996\n1869#4,2:1002\n*S KotlinDebug\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity\n*L\n829#1:993,3\n829#1:997,5\n829#1:996\n769#1:1002,2\n*E\n"})
public class AIChatActivity extends BaseAIActivity {

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy btnAudio$delegate;

    @aa1
    private final Lazy btnChatSend$delegate;
    private float downY;
    private boolean inputMethod;
    private boolean isRecording;

    @aa1
    private final Lazy ivChatVoice$delegate;
    private long lastScrollTime;
    private long longPressStartTime;
    private long longPressThreshold;
    private MultiItemTypeAdapter<AIRecords> mAdapter;

    @tb1
    private go0 mAllDeleteTipPopup;

    @tb1
    private AudioRecord mAudioRecord;
    private int mBufferSize;

    @aa1
    private final Lazy mChatContent$delegate;

    @aa1
    private final Handler mHandler;
    public List<AIRecords> mList;

    @tb1
    private PopupWindow mPopupWindow;

    @tb1
    private uf3 mRecordingPopup;

    @aa1
    private final Lazy mRecyclerView$delegate;
    private boolean mRecyclerViewAutoRefresh;

    @aa1
    private String mTipContent;

    @tb1
    private AIRecords received;
    private boolean recordingIsClear;
    private long showChatTime;

    @aa1
    private final Lazy tvOpenAiDeduction$delegate;

    @aa1
    private final Lazy viewKeyboardHeight$delegate;

    public static final class O00 implements RecordingManager.OnRecordingCallback {
        public final /* synthetic */ AIChatActivity OXO1;

        public O00(AIChatActivity r1) {
            this.OXO1 = r1;
        }

        public static final void I0IIOi(AIChatActivity r1) {
            r1.disRecordingPopup();
            AIChatActivity.access$setRecording$p(r1, false);
        }

        public static final void IiI10X(AIChatActivity r0) {
            r0.disRecordingPopup();
        }

        public static final void O00(AIChatActivity r0, AITranslation r1) {
            AIChatActivity.access$addQuestion(r0, r1.getText());
        }

        public static /* synthetic */ void OXO1(AIChatActivity r0) {
            I0IIOi(r0);
        }

        public static /* synthetic */ void XIi00iiXO(AIChatActivity r0) {
            XOO0ii0(r0);
        }

        public static /* synthetic */ void XO0O10(AIChatActivity r0, AITranslation r1) {
            O00(r0, r1);
        }

        public static final void XOO0ii0(AIChatActivity r0) {
            r0.showRecordingPopup();
        }

        public static /* synthetic */ void iO(AIChatActivity r0) {
            IiI10X(r0);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onBeforeRecording() {
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResult(final AITranslation r3) {
            if (r3 != null) goto L4;
            return;
        L4:
            if (r3.getStatus() == 2) goto L6;
            return;
        L6:
            if (this.OXO1.getRecordingIsClear() == true) goto L11;
            final AIChatActivity r0 = this.OXO1;
            r0.runOnUiThread(new IO0iXO0O(r0, r3));
            return;
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResultError(String r2) {
            Intrinsics.X0O(r2, "error");
            final AIChatActivity r3 = this.OXO1;
            r3.runOnUiThread(new iiIOiX(r3));
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public /* bridge */ void onRecordResultLanguage(AISpeech r1) {
            super.onRecordResultLanguage(r1);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStartRecording() {
            final AIChatActivity r0 = this.OXO1;
            r0.runOnUiThread(new XX00i10X(r0));
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStopRecording() {
            final AIChatActivity r0 = this.OXO1;
            r0.runOnUiThread(new Oi(r0));
        }
    }

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[AIFunctionType.values().length];
            r0[AIFunctionType.HEALTH_QA.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[AIFunctionType.PERSONAL_TRAINER.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    @SourceDebugExtension({"SMAP\nAIChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity$questionAssistant$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,992:1\n11561#2:993\n11896#2,3:994\n*S KotlinDebug\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity$questionAssistant$1\n*L\n952#1:993\n952#1:994,3\n*E\n"})
    public static final class XIi00iiXO implements BaseAIActivity.OXO1<AIAnswer> {
        public final /* synthetic */ AIChatActivity OXO1;
        public final /* synthetic */ String XIi00iiXO;

        public XIi00iiXO(AIChatActivity r1, String r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        public static final boolean O00(AIRecords r2) {
            Intrinsics.X0O(r2, "it");
            if (r2.getMType() != 1) goto L5;
            return false;
        L5:
            if (r2.getMType() == 2) goto L9;
            return true;
        L9:
            return false;
        }

        public static /* synthetic */ boolean iO(AIRecords r0) {
            return O00(r0);
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        public void OXO1(String r2) {
            Intrinsics.X0O(r2, "error");
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        public /* bridge */ /* synthetic */ void XIi00iiXO(AIAnswer r1) {
            XO0O10(r1);
        }

        public void XO0O10(AIAnswer r33) {
            Intrinsics.X0O(r33, "result");
            if (r33.getText().length() > 0) goto L5;
            return;
        L5:
            if (r33.getEnded() != 1) goto L27;
            String r4 = r33.getText();
            int r2 = 0;
            MultiItemTypeAdapter r10 = null;
            if (oe5.O0(r4, "```json", false, 2, null) == true) goto L9;
            return;
        L9:
            if (StringsKt__StringsKt.iIi011O(r4, C2985d4.j.d, false, 2, null) == true) goto L11;
            return;
        L11:
            if (StringsKt__StringsKt.iIi011O(r4, C2985d4.j.e, false, 2, null) == false) goto L30;
            String r1 = r4.substring(StringsKt__StringsKt.OO1101010(r4, C2985d4.j.d, 0, false, 6, null), StringsKt__StringsKt.OO1101010(r4, C2985d4.j.e, 0, false, 6, null) + 1);
            Intrinsics.O10IXXX0X(r1, "substring(...)");
            JSONArray r5 = new JSONArray(r1);
            int r3 = r5.length();
            String[] r6 = new String[r3];
            int r7 = r5.length();
            int r8 = 0;
        L13:
            if (r8 >= r7) goto L15;
            r6[r8] = r5.getString(r8);
            r8 = r8 + 1;
            goto L13
        L15:
            OIXO1IIOO.iIX0i(this.OXO1.getMList(), new XOXiX0());
            List<AIRecords> r9 = this.OXO1.getMList();
            AIFunction r11 = this.OXO1.getMAIFunction();
            Intrinsics.XXI(r11);
            r9.add(new AIRecords(0, 0, null, r11.getType().getType(), 6, this.XIi00iiXO, null, 0, 0, 0, null, null, null, null, null, 0, null, 130887, null));
            AIChatActivity.addMoveQuestions$default(this.OXO1, null, 1, null);
            AIChatActivity r12 = this.OXO1;
            ArrayList r13 = new ArrayList(r3);
        L16:
            if (r2 >= r3) goto L18;
            String r14 = r6[r2];
            Intrinsics.XXI(r14);
            r12.addMoveQuestions(r14);
            r13.add(Unit.OXO1);
            r2 = r2 + 1;
            goto L16
        L18:
            MultiItemTypeAdapter r15 = AIChatActivity.access$getMAdapter$p(this.OXO1);
            if (r15 != null) goto L21;
            Intrinsics.XXO("mAdapter");
        L22:
            r10.notifyDataSetChanged();
            return;
        L21:
            r10 = r15;
            goto L22
        L30:
            return;
        }
    }

    public static final class XO0O10 implements BaseAIActivity.OXO1<AIAnswer> {
        public final /* synthetic */ AIChatActivity OXO1;

        public XO0O10(AIChatActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        public void OXO1(String r3) {
            Intrinsics.X0O(r3, "error");
            AIRecords r4 = this.OXO1.getReceived();
            if (r4 == null) goto L5;
            String r0 = this.OXO1.getString(R.string.request_error);
            Intrinsics.O10IXXX0X(r0, "getString(...)");
            r4.setMContent(r0);
        L5:
            MultiItemTypeAdapter r5 = AIChatActivity.access$getMAdapter$p(this.OXO1);
            if (r5 != null) goto L8;
            Intrinsics.XXO("mAdapter");
            r5 = null;
        L8:
            r5.notifyItemChanged(CollectionsKt__CollectionsKt.X11iII1O1(this.OXO1.getMList()));
            AIChatActivity.access$scrollView(this.OXO1);
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        public /* bridge */ /* synthetic */ void XIi00iiXO(AIAnswer r1) {
            iO(r1);
        }

        public void iO(AIAnswer r8) {
            Intrinsics.X0O(r8, "result");
            if (r8.getText().length() <= 0) goto L30;
            AIRecords r0 = this.OXO1.getReceived();
            if (r0 == null) goto L7;
            r0.setMContent(r8.getText());
        L7:
            AIRecords r1 = this.OXO1.getReceived();
            if (r1 != null) goto L10;
        L14:
            MultiItemTypeAdapter r2 = null;
            if (r8.getEnded() != 1) goto L23;
            MultiItemTypeAdapter r9 = AIChatActivity.access$getMAdapter$p(this.OXO1);
            if (r9 != null) goto L19;
            Intrinsics.XXO("mAdapter");
        L20:
            r2.notifyItemChanged(CollectionsKt__CollectionsKt.X11iII1O1(this.OXO1.getMList()));
            AIChatActivity.access$scrollView(this.OXO1);
            return;
        L19:
            r2 = r9;
            goto L20
        L23:
            if ((System.currentTimeMillis() - this.OXO1.getLastScrollTime()) <= 1000) goto L31;
            MultiItemTypeAdapter r10 = AIChatActivity.access$getMAdapter$p(this.OXO1);
            if (r10 != null) goto L27;
            Intrinsics.XXO("mAdapter");
        L28:
            r2.notifyItemChanged(CollectionsKt__CollectionsKt.X11iII1O1(this.OXO1.getMList()));
            AIChatActivity.access$scrollView(this.OXO1);
            return;
        L27:
            r2 = r10;
            goto L28
        L31:
            return;
        L10:
            if (r8.getEnded() != 1) goto L12;
            int r3 = 0;
        L13:
            r1.setMStatus(r3);
            goto L14
        L12:
            r3 = 1;
            goto L13
        }
    }

    public static final class iO extends SimpleDownloader {
        public final /* synthetic */ AIChatActivity OXO1;

        public iO(AIChatActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(AIChatActivity r0, Result r1) {
            XIi00iiXO(r0, r1);
        }

        public static final void XIi00iiXO(AIChatActivity r1, Result r2) {
            String r3 = r2.getResult();
            Intrinsics.O10IXXX0X(r3, "getResult(...)");
            AIChatActivity.access$addQuestion(r1, r3);
        }

        @Override // com.baidu.ai.speech.realtime.full.download.SimpleDownloader
        public void onFailure(String r2) {
            this.OXO1.dismissLoading();
            super.onFailure(r2);
        }

        @Override // com.baidu.ai.speech.realtime.full.download.SimpleDownloader
        public void onMessage(final Result r3) {
            Intrinsics.X0O(r3, "result");
            super.onMessage(r3);
            this.OXO1.dismissLoading();
            if (r3.isFin() == false) goto L6;
            final AIChatActivity r0 = this.OXO1;
            r0.runOnUiThread(new XOO0XOOii(r0, r3));
            return;
        L6:
            r3.isError();
        }
    }

    public AIChatActivity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new XXiIiX10(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new X00Xi1X(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new X1(this));
        this.mChatContent$delegate = LazyKt__LazyJVMKt.iO(new IXOIIIO(this));
        this.btnAudio$delegate = LazyKt__LazyJVMKt.iO(new IO0II0i(this));
        this.ivChatVoice$delegate = LazyKt__LazyJVMKt.iO(new Ii0i(this));
        this.btnChatSend$delegate = LazyKt__LazyJVMKt.iO(new IXI(this));
        this.tvOpenAiDeduction$delegate = LazyKt__LazyJVMKt.iO(new Ii1iii0(this));
        this.viewKeyboardHeight$delegate = LazyKt__LazyJVMKt.iO(new iiiO(this));
        this.inputMethod = true;
        this.longPressThreshold = 300;
        this.mRecyclerViewAutoRefresh = true;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mTipContent = "";
    }

    public static /* synthetic */ boolean I1(AIChatActivity r0) {
        return showDeleteTipPopup$lambda$0$1(r0);
    }

    public static /* synthetic */ PFMedium I1XOi1(AIChatActivity r0) {
        return tvOpenAiDeduction_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView II1Xi0(AIChatActivity r0) {
        return ivChatVoice_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IIX1OXO(AIChatActivity r0, View r1, MotionEvent r2) {
        return touchListener$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ View IXXOO(AIChatActivity r0) {
        return viewKeyboardHeight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O1O(AIChatActivity r0) {
        startRecording$lambda$0$0(r0);
    }

    public static /* synthetic */ EditText OII(AIChatActivity r0) {
        return mChatContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button OX(AIChatActivity r0) {
        return btnAudio_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button OiIIX101O(AIChatActivity r0) {
        return btnChatSend_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X01IiOiIi(AIChatActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(Ref.IntRef r0, AIChatActivity r1) {
        processingEditTextKeyboard$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(PermissionStatus r0) {
        return permission$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XXIIO1i11(AIChatActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(AIChatActivity r0) {
        return startRecording$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIii1(AIChatActivity r0, View r1) {
        onTitleRightClick$lambda$0(r0, r1);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(AIChatActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(AIChatActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ void access$addQuestion(AIChatActivity r0, String r1) {
        r0.addQuestion(r1);
    }

    public static final /* synthetic */ MultiItemTypeAdapter access$getMAdapter$p(AIChatActivity r0) {
        return r0.mAdapter;
    }

    public static final /* synthetic */ RecyclerView access$getMRecyclerView(AIChatActivity r0) {
        return r0.getMRecyclerView();
    }

    public static final /* synthetic */ View access$getViewKeyboardHeight(AIChatActivity r0) {
        return r0.getViewKeyboardHeight();
    }

    public static final /* synthetic */ void access$scrollView(AIChatActivity r0) {
        r0.scrollView();
    }

    public static final /* synthetic */ void access$setRecording$p(AIChatActivity r0, boolean r1) {
        r0.isRecording = r1;
    }

    public static /* synthetic */ void addMoveQuestions$default(AIChatActivity r0, String r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = "";
    L6:
        r0.addMoveQuestions(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMoveQuestions");
    }

    private final void addQuestion(String r25) {
        AIFunction r2 = getMAIFunction();
        Intrinsics.XXI(r2);
        AIRecords r1 = new AIRecords(0, 0, null, r2.getType().getType(), 1, r25, null, 0, 0, 0, null, null, null, null, null, 0, null, 131015, null);
        getMList().add(r1);
        addSendRecord(r1);
        AIFunction r3 = getMAIFunction();
        Intrinsics.XXI(r3);
        AIRecords r4 = new AIRecords(0, 0, null, r3.getType().getType(), 2, "", null, 1, 0, 0, null, null, null, null, null, 0, null, 130887, null);
        this.received = r4;
        getMList().add(r4);
        addReceivedRecord(r4);
        MultiItemTypeAdapter<AIRecords> r5 = this.mAdapter;
        if (r5 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r5 = null;
    L5:
        r5.notifyDataSetChanged();
        scrollView();
        sendCurrent(r25);
    }

    public static /* synthetic */ void addWelcomeQuestions$default(AIChatActivity r0, String r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = "";
    L6:
        r0.addWelcomeQuestions(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addWelcomeQuestions");
    }

    private static final Button btnAudio_delegate$lambda$0(AIChatActivity r1) {
        return (Button) r1.findViewById(R.id.btn_chat_audio);
    }

    private static final Button btnChatSend_delegate$lambda$0(AIChatActivity r1) {
        return (Button) r1.findViewById(R.id.btn_chat_send);
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final Button getBtnAudio() {
        return (Button) getValue();
    }

    private final Button getBtnChatSend() {
        return (Button) getValue();
    }

    private final ImageView getIvChatVoice() {
        return (ImageView) getValue();
    }

    private final EditText getMChatContent() {
        return (EditText) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final PFMedium getTvOpenAiDeduction() {
        return (PFMedium) getValue();
    }

    private final View getViewKeyboardHeight() {
        return (View) getValue();
    }

    public static /* synthetic */ ImageView i010I(AIChatActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iI(AIChatActivity r0, View r1, MotionEvent r2) {
        return touchListener$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ void iIiiO(AIChatActivity r0) {
        longClickDown$lambda$0(r0);
    }

    public static /* synthetic */ void iOO1ii1(AIChatActivity r0, View r1) {
        onTitleRightClick$lambda$1(r0, r1);
    }

    public static /* synthetic */ boolean iOOX010X() {
        return showDeleteTipPopup$lambda$0$0();
    }

    public static /* synthetic */ void iX(AIChatActivity r0, Ref.IntRef r1, int r2) {
        processingEditTextKeyboard$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ void iX1O1(AIChatActivity r0, View r1) {
        onTitleRightClick$lambda$2(r0, r1);
    }

    private final void initAdapter() {
        final List<AIRecords> r0 = getMList();
        this.mAdapter = new AnonymousClass1(this, r0);
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView r1 = getMRecyclerView();
        MultiItemTypeAdapter<AIRecords> r2 = this.mAdapter;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r2 = null;
    L5:
        r1.setAdapter(r2);
    }

    private final void initialRecorder() {
        this.mBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        this.mAudioRecord = new AudioRecord(1, 16000, 16, 2, this.mBufferSize);
    }

    private static final ImageView ivChatVoice_delegate$lambda$0(AIChatActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_chat_voice);
    }

    private static final void longClickDown$lambda$0(AIChatActivity r4) {
        if (r4.isRecording == false) goto L5;
        return;
    L5:
        if (r4.longPressStartTime != 0) goto L7;
        return;
    L7:
        if ((System.currentTimeMillis() - r4.longPressStartTime) > r4.longPressThreshold) goto L9;
        return;
    L9:
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.MICROPHONE}) == false) goto L12;
        r4.startRecording();
        return;
    L12:
        r4.permission();
    }

    private static final EditText mChatContent_delegate$lambda$0(AIChatActivity r1) {
        return (EditText) r1.findViewById(R.id.et_chat_content);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(AIChatActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.recycler_view);
    }

    private static final void onTitleRightClick$lambda$0(AIChatActivity r0, View r1) {
        r0.onSetModel();
        PopupWindow r2 = r0.mPopupWindow;
        if (r2 == null) goto L6;
        r2.dismiss();
        return;
    }

    private static final void onTitleRightClick$lambda$1(AIChatActivity r0, View r1) {
        r0.showDeleteTipPopup();
        PopupWindow r2 = r0.mPopupWindow;
        if (r2 == null) goto L6;
        r2.dismiss();
        return;
    }

    private static final void onTitleRightClick$lambda$2(AIChatActivity r1, View r2) {
        r1.startActivity(new Intent(r1, SearchOnlineActivity.class));
        PopupWindow r3 = r1.mPopupWindow;
        if (r3 == null) goto L6;
        r3.dismiss();
        return;
    }

    private static final Unit permission$lambda$0(PermissionStatus r1) {
        Intrinsics.X0O(r1, "it");
        PermissionStatus r2 = PermissionStatus.GRANTED;
        return Unit.OXO1;
    }

    private final void processingEditTextKeyboard() {
        final Ref.IntRef r0 = new Ref.IntRef();
        r0.element = -1;
        getMRecyclerView().post(new i0X000X0O(r0, this));
        KeyboardUtils.registerSoftInputChangedListener(getWindow(), new Ii0X0X(this, r0));
    }

    private static final void processingEditTextKeyboard$lambda$0(Ref.IntRef r0, AIChatActivity r1) {
        r0.element = r1.getMRecyclerView().getHeight();
    }

    private static final void processingEditTextKeyboard$lambda$1(AIChatActivity r6, Ref.IntRef r7, int r8) {
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r6), null, null, new AIChatActivity$processingEditTextKeyboard$2$1(r6, r8, r7, null), 3, null);
    }

    private final void scrollView() {
        RecyclerView.ItemAnimator r0 = getMRecyclerView().getItemAnimator();
        if (r0 == null) goto L5;
        r0.endAnimations();
    L5:
        this.lastScrollTime = System.currentTimeMillis();
        if (this.mRecyclerViewAutoRefresh == false) goto L9;
        RecyclerView.LayoutManager r1 = getMRecyclerView().getLayoutManager();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) r1).scrollToPositionWithOffset(CollectionsKt__CollectionsKt.X11iII1O1(getMList()), 0);
        return;
    }

    private final void setTitle(String r5) {
        switch(r5.hashCode()) {
            case -1671190941: goto L30;
            case -361646967: goto L22;
            case -345876046: goto L14;
            case 1088442160: goto L6;
            default: goto L32;
        };
    L6:
        if (r5.equals("sparkAIService") == false) goto L32;
        TextView r6 = (TextView) findViewById(R.id.abh_title_center);
        if (r6 == null) goto L11;
        r6.setText(getString(R.string.ai_model_spark_desk));
    L11:
        String r7 = getString(R.string.ai_welcome_spark_desk);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        addWelcomeQuestions(r7);
        return;
    L14:
        if (r5.equals("baiduAIService") == false) goto L32;
        TextView r8 = (TextView) findViewById(R.id.abh_title_center);
        if (r8 == null) goto L19;
        r8.setText(getString(R.string.wenxinyiyan));
    L19:
        String r9 = getString(R.string.ai_welcome);
        Intrinsics.O10IXXX0X(r9, "getString(...)");
        addWelcomeQuestions(r9);
        return;
    L22:
        if (r5.equals("deepseekAIService") == false) goto L32;
        TextView r10 = (TextView) findViewById(R.id.abh_title_center);
        if (r10 == null) goto L27;
        r10.setText(getString(R.string.pay_dail_aigc_deep_seek));
    L27:
        String r11 = getString(R.string.ai_welcome_gpt);
        Intrinsics.O10IXXX0X(r11, "getString(...)");
        addWelcomeQuestions(r11);
        return;
    L30:
        if (r5.equals("openAIService") == false) goto L32;
        TextView r12 = (TextView) findViewById(R.id.abh_title_center);
        if (r12 == null) goto L41;
        r12.setText(getString(R.string.chatgpt));
    L41:
        String r13 = getString(R.string.ai_welcome_gpt);
        Intrinsics.O10IXXX0X(r13, "getString(...)");
        addWelcomeQuestions(r13);
        return;
    L32:
        if (r5.length() <= 0) goto L43;
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        if (r0 == null) goto L36;
        r0.setText(r5);
    L36:
        String r14 = getString(R.string.ai_welcome_chat_tip);
        Intrinsics.O10IXXX0X(r14, "getString(...)");
        addWelcomeQuestions(r14);
        return;
    }

    private static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    private static final boolean showDeleteTipPopup$lambda$0$1(AIChatActivity r4) {
        List<AIRecords> r0 = r4.getMList();
        if (r0 == null) goto L8;
        Iterator<T> r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        AIRecords r2 = (AIRecords) r1.next();
        r2.setMIsDelete(1);
        r2.setMIsSync(0);
    L8:
        r4.getMRecordsDao().update(r4.getMList());
        r4.getMList().clear();
        r4.addListWelcome();
        MultiItemTypeAdapter<AIRecords> r5 = r4.mAdapter;
        if (r5 != null) goto L11;
        Intrinsics.XXO("mAdapter");
        r5 = null;
    L11:
        r5.notifyDataSetChanged();
        ToastUtils.showLong(R.string.clear_success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        return true;
    }

    private final void startRecording() {
        if (q62.OXO1.OIXOOi() == false) goto L9;
        if (this.isRecording == true) goto L12;
        this.isRecording = true;
        RecordingManager.Companion r0 = RecordingManager.Companion;
        r0.getInstance().startRecord();
        r0.getInstance().setRecordingCallback(new O00(this));
        return;
    L12:
        return;
    L9:
        if (this.isRecording == true) goto L13;
        this.isRecording = true;
        showRecordingPopup();
        initialRecorder();
        ThreadsKt.iO(true, false, null, null, 0, new iOiXi11II(this), 30, null);
        return;
    }

    private static final Unit startRecording$lambda$0(final AIChatActivity r6) {
        FileOutputStream r0 = null;
        AudioRecord r1 = r6.mAudioRecord;     // Catch: Throwable -> L6 Exception -> L8
        if (r1 == null) goto L10;
        r1.startRecording();     // Catch: Throwable -> L6 Exception -> L8
    L10:
        FileOutputStream r2 = new FileOutputStream(uz0.X11I(sz0.OXO1));     // Catch: Throwable -> L6 Exception -> L8
        int r3 = r6.mBufferSize;     // Catch: Throwable -> L17 Exception -> L19
        byte[] r4 = new byte[r3];     // Catch: Throwable -> L17 Exception -> L19
    L13:
        if (r6.isRecording == false) goto L22;
        AudioRecord r5 = r6.mAudioRecord;     // Catch: Throwable -> L17 Exception -> L19
        if (r5 == null) goto L21;
        r5.read(r4, 0, r3);     // Catch: Throwable -> L17 Exception -> L19
    L21:
        r2.write(r4);     // Catch: Throwable -> L17 Exception -> L19
        r2.flush();     // Catch: Throwable -> L17 Exception -> L19
        goto L13
    L22:
        AudioRecord r7 = r6.mAudioRecord;     // Catch: Throwable -> L17 Exception -> L19
        if (r7 == null) goto L25;
        r7.stop();     // Catch: Throwable -> L17 Exception -> L19
    L25:
        AudioRecord r8 = r6.mAudioRecord;     // Catch: Throwable -> L17 Exception -> L19
        if (r8 == null) goto L28;
        r8.release();     // Catch: Throwable -> L17 Exception -> L19
    L28:
        r2.flush();     // Catch: Throwable -> L17 Exception -> L19
        r2.close();
        r6.runOnUiThread(new OO(r6));
        if (r6.recordingIsClear == true) goto L41;
    L31:
        r6.recognition();
    L41:
        return Unit.OXO1;
    L19:
        e = move-exception;
        e = e;
        r0 = r2;
    L32:
        e.printStackTrace();     // Catch: Throwable -> L6
        if (r0 == null) goto L35;
        r0.close();     // Catch: Throwable -> L6
    L35:
        if (r0 == null) goto L37;
        r0.close();
    L37:
        r6.runOnUiThread(new OO(r6));
        if (r6.recordingIsClear == true) goto L41;
    L17:
        th = move-exception;
        th = th;
        r0 = r2;
    L42:
        if (r0 == null) goto L44;
        r0.close();
    L44:
        r6.runOnUiThread(new OO(r6));
        if (r6.recordingIsClear == true) goto L47;
        r6.recognition();
    L47:
        throw th;
    L8:
        e = e;
    L6:
        th = th;
        goto L42
    }

    private static final void startRecording$lambda$0$0(AIChatActivity r0) {
        r0.disRecordingPopup();
    }

    private final void stopRecording() {
        if (this.isRecording == false) goto L6;
        this.isRecording = false;
        return;
    }

    private static final boolean touchListener$lambda$0(AIChatActivity r3, View r4, MotionEvent r5) {
        int r6 = r5.getAction();
        if (r6 == 0) goto L23;
        if (r6 == 1) goto L15;
        boolean r2 = false;
        if (r6 == 2) goto L9;
        return false;
    L9:
        if ((r3.downY - r5.getY()) <= 100.0f) goto L11;
        r2 = true;
    L11:
        r3.recordingIsClear = r2;
        uf3 r7 = r3.mRecordingPopup;
        if (r7 == null) goto L14;
        r7.OX(r2);
    L14:
        return true;
    L15:
        r3.mHandler.removeCallbacksAndMessages(null);
        if (q62.OXO1.OIXOOi() == false) goto L19;
        RecordingManager.Companion.getInstance().stopRecording();
    L21:
        r3.longPressStartTime = 0;
        return true;
    L19:
        if (r3.isRecording == false) goto L21;
        r3.stopRecording();
        goto L21
    L23:
        r3.downY = r5.getY();
        r3.longPressStartTime = System.currentTimeMillis();
        r3.longClickDown();
        return true;
    }

    private static final boolean touchListener$lambda$1(AIChatActivity r1, View r2, MotionEvent r3) {
        if (r3.getAction() != 2) goto L5;
        r1.mRecyclerViewAutoRefresh = false;
    L5:
        return false;
    }

    private static final PFMedium tvOpenAiDeduction_delegate$lambda$0(AIChatActivity r1) {
        return (PFMedium) r1.findViewById(R.id.ai_chat_open_deduction_config_tv);
    }

    private static final View viewKeyboardHeight_delegate$lambda$0(AIChatActivity r1) {
        return r1.findViewById(R.id.view_keyboard_height);
    }

    public final void addListWelcome() {
        AIFunction r0 = getMAIFunction();
        if (r0 == null) goto L5;
        AIFunctionType r1 = r0.getType();
    L6:
        if (r1 != null) goto L8;
        int r2 = -1;
    L10:
        if (r2 != 1) goto L12;
        String r3 = getString(R.string.ai_welcome_health_qa);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        addWelcomeQuestions(r3);
        String r4 = getString(R.string.ai_welcome_health_qa_1);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        addMoveQuestions(r4);
        String r5 = getString(R.string.ai_welcome_health_qa_2);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        addMoveQuestions(r5);
        String r6 = getString(R.string.ai_welcome_health_qa_3);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        addMoveQuestions(r6);
        return;
    L12:
        if (r2 == 2) goto L19;
        q62 r7 = q62.OXO1;
        if (r7.XIi10().length() <= 0) goto L16;
        setTitle(r7.XIi10());
    L17:
        String r8 = getString(R.string.ai_welcome_aichat_1);
        Intrinsics.O10IXXX0X(r8, "getString(...)");
        addMoveQuestions(r8);
        String r9 = getString(R.string.ai_welcome_aichat_2);
        Intrinsics.O10IXXX0X(r9, "getString(...)");
        addMoveQuestions(r9);
        String r10 = getString(R.string.ai_welcome_aichat_3);
        Intrinsics.O10IXXX0X(r10, "getString(...)");
        addMoveQuestions(r10);
        return;
    L16:
        setTitle(AIManager.O10IXXX0X(AIManager.OXO1, 0, 1, null));
        goto L17
    L19:
        String r11 = getString(R.string.ai_welcome_personal_trainer);
        Intrinsics.O10IXXX0X(r11, "getString(...)");
        addWelcomeQuestions(r11);
        String r12 = getString(R.string.ai_welcome_personal_trainer_1);
        Intrinsics.O10IXXX0X(r12, "getString(...)");
        addMoveQuestions(r12);
        String r13 = getString(R.string.ai_welcome_personal_trainer_2);
        Intrinsics.O10IXXX0X(r13, "getString(...)");
        addMoveQuestions(r13);
        String r14 = getString(R.string.ai_welcome_personal_trainer_3);
        Intrinsics.O10IXXX0X(r14, "getString(...)");
        addMoveQuestions(r14);
        return;
    L8:
        r2 = OXO1.OXO1[r1.ordinal()];
        goto L10
    L5:
        r1 = null;
        goto L6
    }

    public final void addMoveQuestions(@aa1 String r23) {
        Intrinsics.X0O(r23, "content");
        AIFunction r0 = getMAIFunction();
        Intrinsics.XXI(r0);
        int r6 = r0.getType().getType();
        if (r23.length() != 0) goto L6;
        int r1 = 4;
    L7:
        AIRecords r2 = new AIRecords(0, 0, null, r6, r1, r23, null, 0, 0, 0, null, null, null, null, null, 0, null, 130887, null);
        getMList().add(r2);
        return;
    L6:
        r1 = 5;
        goto L7
    }

    public final void addWelcomeQuestions(@aa1 String r23) {
        Intrinsics.X0O(r23, "content");
        AIFunction r0 = getMAIFunction();
        Intrinsics.XXI(r0);
        AIRecords r1 = new AIRecords(0, 0, null, r0.getType().getType(), 2, r23, null, 1, 0, 0, null, null, null, null, null, 0, null, 130887, null);
        getMList().add(r1);
        addMoveQuestions$default(this, null, 1, null);
    }

    @Override // com.sma.smartv3.ui.ai.BaseAIActivity
    public void changeAiModel() {
        showOpenAiDeduction();
    }

    public final void disRecordingPopup() {
        uf3 r0 = this.mRecordingPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
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
        List<AIRecords> r0 = this.mList;
        if (r0 == null) goto L5;
        return r0;
    L5:
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
        AIRecordsDao r0 = getMRecordsDao();
        AIFunction r1 = getMAIFunction();
        if (r1 == null) goto L5;
        AIFunctionType r2 = r1.getType();
    L6:
        Intrinsics.XXI(r2);
        setMList(CollectionsKt___CollectionsKt.OO0Oi10(r0.getListASC(r2.getType())));
        addListWelcome();
        return getMList();
    L5:
        r2 = null;
        goto L6
    }

    @Override // com.sma.smartv3.ui.ai.BaseAIActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        if (AIManager.OXO1.iI() == false) goto L5;
        getAbhTitleOtherRight().setVisibility(0);
    L6:
        getAbhTitleOtherRight().setImageResource(R.drawable.ai_answer_speech_icon);
        getAbhTitleOtherRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getAbhTitleRight().setVisibility(0);
        q62 r0 = q62.OXO1;
        if (r0.I0O() == false) goto L9;
    L12:
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_more_icon);
    L13:
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        processingEditTextKeyboard();
        permission();
        initList();
        initAdapter();
        scrollView();
        touchListener();
        return;
    L9:
        if (r0.i0Ii001() == true) goto L12;
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        goto L13
    L5:
        getAbhTitleOtherRight().setVisibility(8);
        goto L6
    }

    public final void isShowTime(@aa1 TextView r5, long r6) {
        Intrinsics.X0O(r5, "tvTime");
        long r0 = this.showChatTime;
        if (r0 != 0) goto L5;
    L8:
        this.showChatTime = r6;
        r5.setText(O0X11OiO.iI().format(Long.valueOf(r6)));
        int r7 = 0;
    L9:
        r5.setVisibility(r7);
        return;
    L5:
        if ((r6 - r0) > 300000) goto L8;
        r7 = 8;
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_ai_chat;
    }

    public final void longClickDown() {
        this.mHandler.postDelayed(new XOX0O0(this), this.longPressThreshold + 100);
    }

    @Override // com.sma.smartv3.ui.ai.BaseAIActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (q62.OXO1.OIXOOi() == false) goto L5;
        VoiceManager.INSTANCE.setRecordingCallback();
    L5:
        I01XX0.XIi00iiXO(I01XX0.i100IXOX, null, 2, null);
        KeyboardUtils.unregisterSoftInputChangedListener(getWindow());
    }

    public final void onSend(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        q62 r3 = q62.OXO1;
        if (r3.IiX1ii() == false) goto L5;
    L12:
        Editable r4 = getMChatContent().getText();
        if (r4 == null) goto L16;
        String r5 = r4.toString();
        if (r5 == null) goto L16;
    L18:
        if (r5.length() != 0) goto L21;
        ToastUtils.showLong(getString(R.string.enter_content), new Object[0]);
        return;
    L21:
        KeyboardUtils.hideSoftInput(this);
        getMChatContent().getText().clear();
        addQuestion(r5);
        return;
    L16:
        r5 = "";
        goto L18
    L5:
        if (r3.OIXOOi() == true) goto L12;
        if (TextUtils.isEmpty(r3.iIiiO()) == false) goto L12;
        if (r3.XOX() == true) goto L12;
        ToastUtils.showLong(R.string.no_ai_key);
        startActivity(new Intent(this, AiKeySetActivity.class));
    }

    public final void onSwitchInputMethod(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        this.inputMethod = !this.inputMethod;
        ImageView r5 = getIvChatVoice();
        if (this.inputMethod == false) goto L5;
        getMChatContent().setVisibility(8);
        getBtnChatSend().setVisibility(8);
        getBtnAudio().setVisibility(0);
        int r0 = R.drawable.icon_chat_textbox;
    L6:
        r5.setImageResource(r0);
        return;
    L5:
        getMChatContent().setVisibility(0);
        getBtnChatSend().setVisibility(0);
        getBtnAudio().setVisibility(8);
        r0 = R.drawable.icon_chat_audio;
        goto L6
    }

    @SuppressLint({"MissingInflatedId"})
    public final void onTitleRightClick(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        q62 r0 = q62.OXO1;
        if (r0.I0O() == false) goto L5;
    L9:
        Object r1 = getSystemService("layout_inflater");
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type android.view.LayoutInflater");
        View r2 = ((LayoutInflater) r1).inflate(R.layout.popup_chat_layout, null);
        Intrinsics.O10IXXX0X(r2, "inflate(...)");
        PopupWindow r3 = this.mPopupWindow;
        if (r3 != null) goto L12;
        this.mPopupWindow = new PopupWindow(r2, -2, -2);
    L14:
        PopupWindow r4 = this.mPopupWindow;
        if (r4 == null) goto L17;
        r4.setFocusable(true);
    L17:
        int[] r5 = new int[2];
        r8.getLocationOnScreen(r5);
        int r6 = r5[0];
        int r7 = (r6 + (r6 - r8.getWidth())) + OXI1i1.XIi00iiXO(this, 20.0f);
        int r9 = r5[1] + r8.getHeight();
        PopupWindow r10 = this.mPopupWindow;
        if (r10 == null) goto L20;
        r10.showAtLocation(r8, 0, r7, r9);
    L20:
        View r11 = r2.findViewById(R.id.popup_switch_ai_model);
        r11.setOnClickListener(new X00XIX1(this));
        r2.findViewById(R.id.popup_clear_chats).setOnClickListener(new i11I(this));
        if (r0.I0O() == false) goto L23;
        r11.setVisibility(0);
    L24:
        LinearLayout r12 = (LinearLayout) r2.findViewById(R.id.popup_search_online);
        if (r0.i0Ii001() == false) goto L27;
        r12.setVisibility(0);
    L27:
        r12.setOnClickListener(new XO0X10iO(this));
        return;
    L23:
        r11.setVisibility(8);
        goto L24
    L12:
        if (r3 == null) goto L14;
        r3.dismiss();
        goto L14
    L5:
        if (r0.i0Ii001() == true) goto L9;
        showDeleteTipPopup();
    }

    public final void onTitleRightOtherClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        setPlayResult(!isPlayResult());
        ImageView r5 = getAbhTitleOtherRight();
        if (isPlayResult() == false) goto L5;
        int r0 = R.drawable.ai_answer_speech_icon;
    L6:
        r5.setImageResource(r0);
        return;
    L5:
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        r0 = R.drawable.ai_answer_speech_close_icon;
        goto L6
    }

    public final void permission() {
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.MICROPHONE});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        String r1 = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        String r3 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        ds1.XIi00iiXO(r0, r1, r3, new iXiiiO());
    }

    public final void questionAssistant(@aa1 String r12) {
        Intrinsics.X0O(r12, "content");
        this.mTipContent = r12;
        String r4 = getString(R.string.ai_question_more, new Object[]{r12});
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        AIFunction r0 = getMAIFunction();
        Intrinsics.XXI(r0);
        send(new AIQuestion(r0.getType(), r4, null, null, false, false, 60, null), new XIi00iiXO(this, r12), false, false, false);
    }

    public final void recognition() {
        showLoading(true);
        new Runner(new FileInputStream(uz0.X11I(sz0.OXO1)), 1).run(new iO(this));     // Catch: IOException -> L5
        return;
    L5:
        dismissLoading();
    }

    public final void sendCurrent(@aa1 String r11) {
        Intrinsics.X0O(r11, "content");
        this.mRecyclerViewAutoRefresh = true;
        scrollView();
        AIFunction r0 = getMAIFunction();
        Intrinsics.XXI(r0);
        BaseAIActivity.send$default(this, new AIQuestion(r0.getType(), r11, null, null, false, false, 60, null), new XO0O10(this), false, false, false, 28, null);
    }

    public final void setDownY(float r1) {
        this.downY = r1;
    }

    public final void setInputMethod(boolean r1) {
        this.inputMethod = r1;
    }

    public final void setLastScrollTime(long r1) {
        this.lastScrollTime = r1;
    }

    public final void setMBufferSize(int r1) {
        this.mBufferSize = r1;
    }

    public final void setMList(@aa1 List<AIRecords> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    public final void setMPopupWindow(@tb1 PopupWindow r1) {
        this.mPopupWindow = r1;
    }

    public final void setMRecyclerViewAutoRefresh(boolean r1) {
        this.mRecyclerViewAutoRefresh = r1;
    }

    public final void setMTipContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTipContent = r2;
    }

    public final void setReceived(@tb1 AIRecords r1) {
        this.received = r1;
    }

    public final void setRecordingIsClear(boolean r1) {
        this.recordingIsClear = r1;
    }

    public final void setShowChatTime(long r1) {
        this.showChatTime = r1;
    }

    public final void share(@aa1 String r2) {
        Intrinsics.X0O(r2, "content");
        startActivity(IntentUtils.getShareTextIntent(r2));
    }

    @Override // com.sma.smartv3.ui.ai.BaseAIActivity
    public void showAIDeductionPoints() {
        showOpenAiDeduction();
    }

    public final void showDeleteTipPopup() {
        if (this.mAllDeleteTipPopup != null) goto L5;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(R.string.clear_ai_chat_list));
        r0.IXXOO(1);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new XX1Oi());
        r0.X1IX(R.string.confirm, new OX110i(this));
        this.mAllDeleteTipPopup = r0;
    L5:
        go0 r1 = this.mAllDeleteTipPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    public final void showOpenAiDeduction() {
        i1O0OXO1O.OXO1.OXO1("AIChatActivity showOpenAiDeduction openAIDeductionPoints = " + getOpenAIDeductionPoints());
        getTvOpenAiDeduction().setVisibility(8);
    }

    public final void showRecordingPopup() {
        if (this.mRecordingPopup != null) goto L5;
        int r3 = 0;
        uf3 r0 = new uf3(this, r3, 2, null);
        r0.OX(this.recordingIsClear);
        this.mRecordingPopup = r0;
    L5:
        uf3 r1 = this.mRecordingPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    @sf5(tag = I01XX0.X00Xi1X)
    public final void switchAIServe(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        AIFunction r3 = getMAIFunction();
        if (r3 == null) goto L5;
        AIFunctionType r4 = r3.getType();
    L7:
        if (r4 != AIFunctionType.AI) goto L10;
        initView();
        return;
    L10:
        return;
    L5:
        r4 = null;
        goto L7
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void touchListener() {
        getBtnAudio().setOnTouchListener(new X11I(this));
        getMRecyclerView().setOnTouchListener(new X100O(this));
    }
}
