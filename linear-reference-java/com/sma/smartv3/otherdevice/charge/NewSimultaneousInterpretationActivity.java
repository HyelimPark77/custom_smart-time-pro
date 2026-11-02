package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a71;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.b71;
import com.android.mltcode.paycertificationapi.c71;
import com.android.mltcode.paycertificationapi.d71;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.e71;
import com.android.mltcode.paycertificationapi.f71;
import com.android.mltcode.paycertificationapi.g71;
import com.android.mltcode.paycertificationapi.h71;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i71;
import com.android.mltcode.paycertificationapi.j71;
import com.android.mltcode.paycertificationapi.k71;
import com.android.mltcode.paycertificationapi.l71;
import com.android.mltcode.paycertificationapi.m71;
import com.android.mltcode.paycertificationapi.n71;
import com.android.mltcode.paycertificationapi.o71;
import com.android.mltcode.paycertificationapi.p71;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.q71;
import com.android.mltcode.paycertificationapi.r71;
import com.android.mltcode.paycertificationapi.s61;
import com.android.mltcode.paycertificationapi.s71;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.t61;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u61;
import com.android.mltcode.paycertificationapi.v61;
import com.android.mltcode.paycertificationapi.w61;
import com.android.mltcode.paycertificationapi.x61;
import com.android.mltcode.paycertificationapi.y61;
import com.android.mltcode.paycertificationapi.z16;
import com.android.mltcode.paycertificationapi.z61;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LeftAndRightPlayControl;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.view.WaveformView;
import com.szabh.smable3.component.BleConnector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNewSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,654:1\n87#2,7:655\n94#2,3:663\n70#2,7:666\n97#2:673\n173#2,7:680\n180#2,3:688\n143#2,7:691\n183#2:698\n173#2,7:699\n180#2,3:707\n143#2,7:710\n183#2:717\n87#2,7:724\n94#2,3:732\n70#2,7:735\n97#2:742\n1#3:662\n1#3:687\n1#3:706\n1#3:731\n85#4,3:674\n85#4,3:677\n85#4,3:718\n85#4,3:721\n*S KotlinDebug\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity\n*L\n390#1:655,7\n390#1:663,3\n390#1:666,7\n390#1:673\n563#1:680,7\n563#1:688,3\n563#1:691,7\n563#1:698\n568#1:699,7\n568#1:707,3\n568#1:710,7\n568#1:717\n629#1:724,7\n629#1:732,3\n629#1:735,7\n629#1:742\n390#1:662\n563#1:687\n568#1:706\n629#1:731\n424#1:674,3\n425#1:677,3\n582#1:718,3\n596#1:721,3\n*E\n"})
public final class NewSimultaneousInterpretationActivity extends BaseTranslationActivity {

    @aa1
    private final String TAG;

    @aa1
    private ArrayList<AISpeech> aiSpeechList;

    @aa1
    private final MicrosoftSDKManage.iO binauralMicrosoftCallBack;

    @aa1
    private final Lazy img_Left$delegate;

    @aa1
    private final Lazy img_broadcast$delegate;

    @aa1
    private final Lazy img_direction$delegate;

    @aa1
    private final Lazy img_play$delegate;

    @aa1
    private final Lazy img_recording_status$delegate;
    private boolean isCanBroadCast;
    private MultiItemTypeAdapter<AISpeech> mAdapter;

    @tb1
    private AnimationDrawable mAnimationDrawable;
    private int mVoiceType;

    @tb1
    private z16 popTip;

    @aa1
    private final Lazy record_line$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy rv$delegate;

    @aa1
    private final Lazy tv_time$delegate;

    @SourceDebugExtension({"SMAP\nNewSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$binauralMicrosoftCallBack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,654:1\n1563#2:655\n1634#2,3:656\n774#2:659\n865#2,2:660\n1563#2:662\n1634#2,3:663\n774#2:666\n865#2,2:667\n*S KotlinDebug\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$binauralMicrosoftCallBack$1\n*L\n111#1:655\n111#1:656,3\n112#1:659\n112#1:660,2\n160#1:662\n160#1:663,3\n161#1:666\n161#1:667,2\n*E\n"})
    public static final class OXO1 implements MicrosoftSDKManage.iO {
        public long OXO1;
        public final /* synthetic */ NewSimultaneousInterpretationActivity XIi00iiXO;

        public OXO1(NewSimultaneousInterpretationActivity r1) {
            this.XIi00iiXO = r1;
        }

        public static /* synthetic */ void XIi00iiXO(NewSimultaneousInterpretationActivity r0) {
            XO0O10(r0);
        }

        public static final void XO0O10(NewSimultaneousInterpretationActivity r1) {
            if (NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(r1).size() <= 0) goto L6;
            NewSimultaneousInterpretationActivity.access$getRv(r1).smoothScrollToPosition(NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(r1).size() - 1);
            return;
        }

        public final void O00(long r1) {
            this.OXO1 = r1;
        }

        public final long iO() {
            return this.OXO1;
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onIdentifyResults(int r26, String r27) {
            Intrinsics.X0O(r27, "str");
            i1O0OXO1O r3 = i1O0OXO1O.OXO1;
            r3.OXO1(NewSimultaneousInterpretationActivity.access$getTAG$p(this.XIi00iiXO) + "  sendTranslate  onIdentifyResults status = " + r26 + " content = " + r27 + " ");
            int r8 = 0;
            if (r26 != 1) goto L5;
            r3.OXO1(NewSimultaneousInterpretationActivity.access$getTAG$p(this.XIi00iiXO) + "  sendTranslate  onIdentifyResults content = " + r27);
            List<String> r1 = new Regex("[*]+").split(r27, 0);
            ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r4 = r1.iterator();
        L44:
            if (r4.hasNext() == false) goto L46;
            r2.add(StringsKt__StringsKt.iX1X1((String) r4.next()).toString());
            goto L44
        L46:
            ArrayList r5 = new ArrayList();
            Iterator r6 = r2.iterator();
        L48:
            if (r6.hasNext() == false) goto L52;
            Object r7 = r6.next();
            if (((String) r7).length() <= 0) goto L48;
            r5.add(r7);
            goto L48
        L52:
            i1O0OXO1O.OXO1.OXO1(NewSimultaneousInterpretationActivity.access$getTAG$p(this.XIi00iiXO) + "  sendTranslate  onIdentifyResults parts = " + r5);
            int r9 = r5.size();
        L53:
            if (r8 >= r9) goto L61;
            int r10 = r8 + 1;
            if (NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).size() >= r10) goto L58;
            NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).add(new AISpeech((String) r5.get(r8), null, 1, 0, null, null, null, this.OXO1, 0, 378, null));
        L58:
            if (NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).size() != r10) goto L60;
            ((AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r8)).setText((String) r5.get(r8));
        L60:
            r8 = r10;
        L61:
            MultiItemTypeAdapter r11 = NewSimultaneousInterpretationActivity.access$getMAdapter$p(this.XIi00iiXO);
            if (r11 != null) goto L64;
            Intrinsics.XXO("mAdapter");
            r11 = null;
        L64:
            r11.notifyDataSetChanged();
            Handler r12 = this.XIi00iiXO.getMHandler();
            final NewSimultaneousInterpretationActivity r13 = this.XIi00iiXO;
            r12.postDelayed(new s71(r13), 50);
            return;
        L5:
            if (r26 != 2) goto L61;
            r3.OXO1(NewSimultaneousInterpretationActivity.access$getTAG$p(this.XIi00iiXO) + "  sendTranslate  onIdentifyResults content = " + r27);
            List<String> r14 = new Regex("[*]+").split(r27, 0);
            ArrayList r15 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r14, 10));
            Iterator<T> r16 = r14.iterator();
        L9:
            if (r16.hasNext() == false) goto L11;
            r15.add(StringsKt__StringsKt.iX1X1((String) r16.next()).toString());
            goto L9
        L11:
            ArrayList r17 = new ArrayList();
            Iterator r18 = r15.iterator();
        L13:
            if (r18.hasNext() == false) goto L17;
            Object r19 = r18.next();
            if (((String) r19).length() <= 0) goto L13;
            r17.add(r19);
            goto L13
        L17:
            i1O0OXO1O.OXO1.OXO1(NewSimultaneousInterpretationActivity.access$getTAG$p(this.XIi00iiXO) + "  sendTranslate  onIdentifyResults parts = " + r17);
            int r20 = r17.size();
            int r21 = 0;
        L18:
            if (r21 >= r20) goto L61;
            int r22 = r21 + 1;
            if (NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).size() >= r22) goto L27;
            AISpeech r110 = new AISpeech((String) r17.get(r21), null, 2, 0, null, null, null, 0, 0, 506, null);
            r110.setLanguageModel(0);
            r110.setLang(this.XIi00iiXO.getMLeftLanguage().getRtasrLanguage());
            r110.setTargetLang(this.XIi00iiXO.getMLeftLanguage().getRtasrLanguage());
            r110.setTtsVoiceName(this.XIi00iiXO.getMLeftLanguage().getTtsViuceName());
            NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).add(r110);
            if (r21 <= 0) goto L24;
            ((AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r21)).setStartTime(((AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r21 - 1)).getEndTime());
        L25:
            ((AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r21)).setEndTime(System.currentTimeMillis());
            NewSimultaneousInterpretationActivity r23 = this.XIi00iiXO;
            NewSimultaneousInterpretationActivity.access$binauralSendTranslationResultInput(r23, (AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(r23).get(r21), r21);
            goto L27
        L24:
            r110.setStartTime(this.OXO1);
        L27:
            if (NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).size() != r22) goto L41;
            if (((AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r21)).getStatus() != 1) goto L41;
            i1O0OXO1O r24 = i1O0OXO1O.OXO1;
            String r25 = NewSimultaneousInterpretationActivity.access$getTAG$p(this.XIi00iiXO);
            if (NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).size() == r22) goto L33;
        L35:
            boolean r28 = false;
        L36:
            r24.OXO1(r25 + "  sendTranslate  onIdentifyResults istrue = " + r28);
            Object r29 = NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r21);
            Intrinsics.O10IXXX0X(r29, "get(...)");
            AISpeech r30 = (AISpeech) r29;
            r30.setText((String) r17.get(r21));
            r30.setStatus(2);
            r30.setLanguageModel(0);
            r30.setLang(this.XIi00iiXO.getMLeftLanguage().getRtasrLanguage());
            r30.setTargetLang(this.XIi00iiXO.getMLeftLanguage().getRtasrLanguage());
            r30.setTtsVoiceName(this.XIi00iiXO.getMLeftLanguage().getTtsViuceName());
            if (r21 <= 0) goto L39;
            ((AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r21)).setStartTime(((AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r21 - 1)).getEndTime());
        L40:
            ((AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r21)).setEndTime(System.currentTimeMillis() - this.XIi00iiXO.getStartTime());
            r24.OXO1(NewSimultaneousInterpretationActivity.access$getTAG$p(this.XIi00iiXO) + "  sendTranslate  onIdentifyResults aiSpeechList " + NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO));
            NewSimultaneousInterpretationActivity r31 = this.XIi00iiXO;
            NewSimultaneousInterpretationActivity.access$binauralSendTranslationResultInput(r31, (AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(r31).get(r21), r21);
            goto L41
        L39:
            r30.setStartTime(this.OXO1);
            goto L40
        L33:
            if (((AISpeech) NewSimultaneousInterpretationActivity.access$getAiSpeechList$p(this.XIi00iiXO).get(r21)).getStatus() != 1) goto L35;
            r28 = true;
        L41:
            r21 = r22;
            goto L18
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onIdentifyResultsDetectedLanguage(int r1, String r2, String r3) {
            Intrinsics.X0O(r2, "str");
            Intrinsics.X0O(r3, "detectedLanguage");
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(NewSimultaneousInterpretationActivity.access$getTAG$p(this.XIi00iiXO) + " onStartTransmission ");
            this.OXO1 = System.currentTimeMillis();
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStopTransmission() {
        }
    }

    public NewSimultaneousInterpretationActivity() {
        this.TAG = "BinauralTranslationActivity";
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new u61(this));
        this.tv_time$delegate = LazyKt__LazyJVMKt.iO(new v61(this));
        this.img_recording_status$delegate = LazyKt__LazyJVMKt.iO(new w61(this));
        this.img_play$delegate = LazyKt__LazyJVMKt.iO(new x61(this));
        this.record_line$delegate = LazyKt__LazyJVMKt.iO(new y61(this));
        this.img_broadcast$delegate = LazyKt__LazyJVMKt.iO(new z61(this));
        this.img_direction$delegate = LazyKt__LazyJVMKt.iO(new a71(this));
        this.img_Left$delegate = LazyKt__LazyJVMKt.iO(new b71(this));
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new c71(this));
        this.aiSpeechList = new ArrayList();
        this.isCanBroadCast = true;
        setMAIRecordsType(1);
        this.binauralMicrosoftCallBack = new OXO1(this);
        this.mVoiceType = -1;
    }

    public static /* synthetic */ void I1(NewSimultaneousInterpretationActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ ImageView II1Xi0(NewSimultaneousInterpretationActivity r0) {
        return img_Left_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IXXOO(NewSimultaneousInterpretationActivity r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ boolean Ii1iii0(AISpeech r0) {
        return startVoice$lambda$0$0(r0);
    }

    public static /* synthetic */ void O001I(NewSimultaneousInterpretationActivity r0, View r1) {
        initView$lambda$4(r0, r1);
    }

    public static /* synthetic */ Unit O1O(AISpeech r0, NewSimultaneousInterpretationActivity r1, String r2) {
        return binauralSendTranslationResultInput$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void X01IiOiIi(NewSimultaneousInterpretationActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView X0i1O(NewSimultaneousInterpretationActivity r0) {
        return img_recording_status_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X100O(NewSimultaneousInterpretationActivity r0) {
        startVoice$lambda$0(r0);
    }

    public static /* synthetic */ TextView X11I(NewSimultaneousInterpretationActivity r0) {
        return tv_time_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X11iII1O1(NewSimultaneousInterpretationActivity r0) {
        endVoice$lambda$0(r0);
    }

    public static /* synthetic */ WaveformView X1IX(NewSimultaneousInterpretationActivity r0) {
        return record_line_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XX1Oi(NewSimultaneousInterpretationActivity r0) {
        initView$lambda$3(r0);
    }

    public static /* synthetic */ ImageView XXIIO1i11(NewSimultaneousInterpretationActivity r0) {
        return img_play_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXO(NewSimultaneousInterpretationActivity r0, View r1) {
        showTranslationTipPopup$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ void XXX11i(RotateAnimation r0, NewSimultaneousInterpretationActivity r1) {
        startRotateAnimation$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$binauralSendTranslationResultInput(NewSimultaneousInterpretationActivity r0, AISpeech r1, int r2) {
        r0.binauralSendTranslationResultInput(r1, r2);
    }

    public static final /* synthetic */ ArrayList access$getAiSpeechList$p(NewSimultaneousInterpretationActivity r0) {
        return r0.aiSpeechList;
    }

    public static final /* synthetic */ MultiItemTypeAdapter access$getMAdapter$p(NewSimultaneousInterpretationActivity r0) {
        return r0.mAdapter;
    }

    public static final /* synthetic */ RecyclerView access$getRv(NewSimultaneousInterpretationActivity r0) {
        return r0.getRv();
    }

    public static final /* synthetic */ String access$getTAG$p(NewSimultaneousInterpretationActivity r0) {
        return r0.TAG;
    }

    private static final boolean addVoiceListener$lambda$0(NewSimultaneousInterpretationActivity r0, int r1, int r2, int r3) {
        if (r2 == 0) goto L15;
        if (r2 == 2) goto L12;
        if (r2 == 3) goto L9;
        return true;
    L9:
        if (r0.mVoiceType != 0) goto L19;
        r0.mVoiceType = r2;
        r0.endVoice();
        MicrosoftSDKManage.O1O.OXO1().I0i0();
        return true;
    L19:
        return true;
    L12:
        if (r0.mVoiceType != 0) goto L21;
        r0.mVoiceType = r2;
        r0.endVoice();
        return true;
    L21:
        return true;
    L15:
        if (r0.mVoiceType == 0) goto L23;
        r0.mVoiceType = r2;
        VoiceManager.INSTANCE.setLanguageType(r0.getArsLanguage(), r0.getTtsVoiceName());
        r0.startVoice();
        return true;
    L23:
        return true;
    }

    private final void binauralSendTranslationResultInput(final AISpeech r5, int r6) {
        setStartAnalysis(false);
        setMRecyclerViewAutoRefresh(true);
        if (r5 == null) goto L12;
        String r7 = r5.getText();
        if (r7 != null) goto L7;
        return;
    L7:
        if (r7.length() > 0) goto L9;
        return;
    L9:
        if (Intrinsics.XOO0ii0(r5.getText(), getString(R.string.request_error)) == true) goto L15;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " binauralSendTranslationResultInput ===> str = " + r5.getText() + " , targetLang = " + getTargetLang());
        MicrosoftSDKManage.XIi00iiXO r8 = MicrosoftSDKManage.O1O;
        r8.OXO1().IXI();
        r8.OXO1().OI(r5.getText(), r5.getTargetLang(), new d71(r5, this));
        return;
    L15:
        return;
    }

    private static final Unit binauralSendTranslationResultInput$lambda$0(AISpeech r7, final NewSimultaneousInterpretationActivity r8, String r9) {
        Intrinsics.X0O(r9, "it");
        r7.setDst(StringsKt__StringsKt.iX1X1(r9).toString());
        i1O0OXO1O.OXO1.OXO1(r8.TAG + " binauralSendTranslationResultInput ===> str = " + r7.getText() + " " + r7.getDst());
        r8.getMHandler().post(new p71(r8));
        if (r8.isCanBroadCast == false) goto L6;
        MicrosoftSDKManage.X11iII1O1(MicrosoftSDKManage.O1O.OXO1(), r7.getDst(), r7.getTtsVoiceName(), LeftAndRightPlayControl.LEFT_AND_RIGHT, 0, 8, null);
    L6:
        return Unit.OXO1;
    }

    private static final void binauralSendTranslationResultInput$lambda$0$0(final NewSimultaneousInterpretationActivity r4) {
        MultiItemTypeAdapter<AISpeech> r0 = r4.mAdapter;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r0 = null;
    L5:
        r0.notifyDataSetChanged();
        r4.getMHandler().postDelayed(new j71(r4), 300);
    }

    private static final void binauralSendTranslationResultInput$lambda$0$0$0(NewSimultaneousInterpretationActivity r1) {
        if (r1.aiSpeechList.size() <= 0) goto L6;
        r1.getRv().smoothScrollToPosition(r1.aiSpeechList.size() - 1);
        return;
    }

    private final void clickDownRecording() {
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.MICROPHONE}) == false) goto L6;
        startRecordingBinaural();
        return;
    L6:
        permission();
    }

    private static final void endVoice$lambda$0(NewSimultaneousInterpretationActivity r1) {
        ToastUtils.showShort(r1.getString(R.string.not_record_data), new Object[0]);
    }

    private final ImageView getImg_Left() {
        return (ImageView) getValue();
    }

    private final ImageView getImg_broadcast() {
        return (ImageView) getValue();
    }

    private final ImageView getImg_direction() {
        return (ImageView) getValue();
    }

    private final ImageView getImg_play() {
        return (ImageView) getValue();
    }

    private final ImageView getImg_recording_status() {
        return (ImageView) getValue();
    }

    private final WaveformView getRecord_line() {
        return (WaveformView) getValue();
    }

    private final RecyclerView getRv() {
        return (RecyclerView) getValue();
    }

    private final TextView getTv_time() {
        return (TextView) getValue();
    }

    public static /* synthetic */ void i010I(NewSimultaneousInterpretationActivity r0) {
        binauralSendTranslationResultInput$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit iI(NewSimultaneousInterpretationActivity r0, PermissionStatus r1) {
        return permission$lambda$0(r0, r1);
    }

    public static /* synthetic */ RecyclerView iIXi1iiXI(NewSimultaneousInterpretationActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iOO1ii1(NewSimultaneousInterpretationActivity r0) {
        binauralSendTranslationResultInput$lambda$0$0$0(r0);
    }

    public static /* synthetic */ ImageView iOOX010X(NewSimultaneousInterpretationActivity r0) {
        return img_direction_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iX(NewSimultaneousInterpretationActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iX1O1(NewSimultaneousInterpretationActivity r0, int r1, int r2, int r3) {
        return addVoiceListener$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ ImageView iXiX011(NewSimultaneousInterpretationActivity r0) {
        return img_broadcast_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iXiiiO(CompoundButton r0, boolean r1) {
        showTranslationTipPopup$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void iiiO(NewSimultaneousInterpretationActivity r0, View r1) {
        initRecord$lambda$0(r0, r1);
    }

    private static final ImageView img_Left_delegate$lambda$0(NewSimultaneousInterpretationActivity r1) {
        return (ImageView) r1.findViewById(R.id.translate_left_iv);
    }

    private static final ImageView img_broadcast_delegate$lambda$0(NewSimultaneousInterpretationActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_broadcast);
    }

    private static final ImageView img_direction_delegate$lambda$0(NewSimultaneousInterpretationActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_direction);
    }

    private static final ImageView img_play_delegate$lambda$0(NewSimultaneousInterpretationActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_play);
    }

    private static final ImageView img_recording_status_delegate$lambda$0(NewSimultaneousInterpretationActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_recording_status);
    }

    private static final void initRecord$lambda$0(NewSimultaneousInterpretationActivity r0, View r1) {
        if (RecordingManager.Companion.getInstance().isRecording() == false) goto L6;
        r0.endVoice();
        return;
    L6:
        r0.startVoice();
    }

    private static final void initView$lambda$0(NewSimultaneousInterpretationActivity r0, View r1) {
        r0.startRotateAnimation();
    }

    private static final void initView$lambda$1(NewSimultaneousInterpretationActivity r0, View r1) {
        r0.startRotateAnimation();
    }

    private static final void initView$lambda$2(NewSimultaneousInterpretationActivity r0, View r1) {
        r0.showTranslationTipPopup();
    }

    private static final void initView$lambda$3(NewSimultaneousInterpretationActivity r0) {
        r0.showTranslationTipPopup();
    }

    private static final void initView$lambda$4(NewSimultaneousInterpretationActivity r1, View r2) {
        if (r1.isCanBroadCast == false) goto L5;
        r1.getImg_broadcast().setImageResource(R.drawable.ic_simultan_broadcast_close);
        MicrosoftSDKManage.O1O.OXO1().iX01();
    L6:
        r1.isCanBroadCast = !r1.isCanBroadCast;
        return;
    L5:
        r1.getImg_broadcast().setImageResource(R.drawable.ic_simultan_broadcast_open);
        goto L6
    }

    private static final Unit permission$lambda$0(NewSimultaneousInterpretationActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        if (r2 != PermissionStatus.GRANTED) goto L6;
        r1.startRecordingBinaural();
    L6:
        return Unit.OXO1;
    }

    private final void preConnect() {
        List r8 = CollectionsKt__CollectionsKt.Ii1iii0(new String[]{getMLeftLanguage().getAsrLanguage(), getMRightLanguage().getAsrLanguage()});
        MicrosoftSDKManage.iiII(MicrosoftSDKManage.O1O.OXO1(), getArsLanguage(), true, getTtsVoiceName(), getTtsTargetLang(), false, null, r8, false, 32, null);
    }

    private static final WaveformView record_line_delegate$lambda$0(NewSimultaneousInterpretationActivity r1) {
        return (WaveformView) r1.findViewById(R.id.record_line);
    }

    private static final View rootView_delegate$lambda$0(NewSimultaneousInterpretationActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final RecyclerView rv_delegate$lambda$0(NewSimultaneousInterpretationActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    private final void showTranslationTipPopup() {
        if (this.popTip != null) goto L5;
        z16 r0 = new z16(this);
        r0.X11iII1O1(getString(R.string.simultaneous_tip_1));
        r0.XXX11i(getString(R.string.simultaneous_tip_2));
        r0.XXIIO1i11(Integer.valueOf(R.drawable.ic_simultan_tip));
        r0.X1IX(Boolean.valueOf(a01.OXO1.OXO1().getBoolean(b01.X10i, false)));
        r0.iX().setOnCheckedChangeListener(new r71());
        r0.OII().setOnClickListener(new t61(this));
        this.popTip = r0;
    L5:
        z16 r1 = this.popTip;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.XiOIO(r2);
        return;
    }

    private static final void showTranslationTipPopup$lambda$0$0(CompoundButton r1, boolean r2) {
        Intrinsics.X0O(r1, "buttonView");
        LogUtils.d(new Object[]{"isChecked = " + r2});
        a01.OXO1.OXO1().put(b01.X10i, r2);
    }

    private static final void showTranslationTipPopup$lambda$0$1(NewSimultaneousInterpretationActivity r4, View r5) {
        q62 r6 = q62.OXO1;
        if (q62.OiO0IOX(r6, null, 1, null) == false) goto L6;
        String r7 = "2";
    L9:
        int r0 = WebViewActivity.Companion.iO();
        Bundle r2 = new Bundle();
        r2.putString("mArg0", "https://api.iot-solution.net/videoPlayer/?type=" + r7 + "&id=2");
        r2.putInt("mArg1", r0);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        Intent r8 = new Intent(r4, WebViewActivity.class);
        r8.putExtras(r2);
        r4.startActivity(r8);
        return;
    L6:
        if (r6.X0100I() == false) goto L8;
        r7 = "3";
        goto L9
    L8:
        r7 = "1";
        goto L9
    }

    private final void startRecordingBinaural() {
        if (q62.OXO1.X11I() == false) goto L5;
        MicrosoftSDKManage.XIi00iiXO r0 = MicrosoftSDKManage.O1O;
        MicrosoftSDKManage.i100IXOX(r0.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
        r0.OXO1().I0(false);
    L5:
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        showCountdownPopup(r1);
    }

    private static final void startRotateAnimation$lambda$0(RotateAnimation r0, NewSimultaneousInterpretationActivity r1) {
        r0.cancel();
        r1.getMTransformLanguageImg().clearAnimation();
        r1.setSwitchRotateAnimation(true);
    }

    private static final void startVoice$lambda$0(NewSimultaneousInterpretationActivity r2) {
        r2.aiSpeechList.clear();
        OIXO1IIOO.iIX0i(r2.aiSpeechList, new o71());
        MultiItemTypeAdapter<AISpeech> r3 = r2.mAdapter;
        if (r3 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r3 = null;
    L5:
        r3.notifyDataSetChanged();
    }

    private static final boolean startVoice$lambda$0$0(AISpeech r1) {
        Intrinsics.X0O(r1, "it");
        return true;
    }

    private static final TextView tv_time_delegate$lambda$0(NewSimultaneousInterpretationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_time);
    }

    public final void addVoiceListener() {
        VoiceManager.INSTANCE.setMListener(new l71(this));
    }

    public final void binauralStopRecording() {
        if (q62.OXO1.X11I() == false) goto L6;
        closeBluetooth();
        MicrosoftSDKManage.O1O.OXO1().XOIO11O();
        return;
    L6:
        RecordingManager.Companion.getInstance().stopRecording();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void countdownEnd() {
        super.countdownEnd();
        setStartTime(System.currentTimeMillis());
        getImg_recording_status().setVisibility(0);
        getRecord_line().setVisibility(8);
        if (this.mAnimationDrawable != null) goto L5;
        Drawable r0 = getResources().getDrawable(R.drawable.audio_play_animation_list);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        this.mAnimationDrawable = (AnimationDrawable) r0;
    L5:
        getImg_recording_status().setImageDrawable(this.mAnimationDrawable);
        AnimationDrawable r1 = this.mAnimationDrawable;
        if (r1 == null) goto L8;
        r1.start();
    L8:
        setElapsedTime(0);
        getMHandler().postDelayed(getRunnable(), getUpdateInterval());
    }

    public final void endVoice() {
        RecordingManager.Companion.getInstance().setRecording(false);
        getImg_play().setImageResource(R.drawable.ic_binaural_start);
        getImg_recording_status().setVisibility(4);
        getRecord_line().setVisibility(8);
        binauralStopRecording();
        getMHandler().removeCallbacks(getRunnable());
        removeCountdownPopup();
        setElapsedTime(0);
        updateTimerText();
        finish();
        if (this.aiSpeechList.size() <= 0) goto L5;
        ArrayList<AISpeech> r0 = this.aiSpeechList;
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r0);
        Intent r2 = new Intent(this, BinauralTranslationRecordActivity.class);
        r2.putExtras(r1);
        startActivity(r2);
    L6:
        AnimationDrawable r3 = this.mAnimationDrawable;
        if (r3 == null) goto L10;
        r3.stop();
        return;
    L10:
        return;
    L5:
        getMHandler().postDelayed(new s61(this), 500);
        goto L6
    }

    @aa1
    public final MicrosoftSDKManage.iO getBinauralMicrosoftCallBack() {
        return this.binauralMicrosoftCallBack;
    }

    @tb1
    public final AnimationDrawable getMAnimationDrawable() {
        return this.mAnimationDrawable;
    }

    public final int getMVoiceType() {
        return this.mVoiceType;
    }

    @tb1
    public final z16 getPopTip() {
        return this.popTip;
    }

    public final View getRootView() {
        return (View) getValue();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    public final void initRecord() {
        getImg_play().setOnClickListener(new q71(this));
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setLangAndVoice();
        q62 r0 = q62.OXO1;
        if (r0.X11I() == false) goto L5;
        preConnect();
    L5:
        getImg_direction().setVisibility(0);
        getMTransformLanguageImg().setVisibility(8);
        getImg_direction().setOnClickListener(new e71(this));
        ImageView r1 = getImg_Left();
        if (r0.X0100I() == false) goto L9;
        int r4 = R.drawable.ic_left_ear_ring;
    L14:
        r1.setBackgroundResource(r4);
        a01 r2 = a01.OXO1;
        r2.OXO1().put(b01.iIXX0i, true);
        final ArrayList<AISpeech> r5 = this.aiSpeechList;
        this.mAdapter = new AnonymousClass2(this, r5);
        getRv().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView r6 = getRv();
        MultiItemTypeAdapter<AISpeech> r7 = this.mAdapter;
        if (r7 != null) goto L17;
        Intrinsics.XXO("mAdapter");
        r7 = null;
    L17:
        r6.setAdapter(r7);
        getMTransformLanguageImg().setOnClickListener(new f71(this));
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        VoiceManager.INSTANCE.setActivityData(true);
        if (r0.X11I() == false) goto L20;
        MicrosoftSDKManage.i100IXOX(MicrosoftSDKManage.O1O.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
    L20:
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setOnClickListener(new g71(this));
        getAbhTitleCenter().setVisibility(8);
        if (r2.OXO1().getBoolean(b01.X10i, false) == true) goto L23;
        getRootView().post(new h71(this));
    L23:
        ImageView r3 = getImg_broadcast();
        if (this.isCanBroadCast == false) goto L26;
        int r8 = R.drawable.ic_simultan_broadcast_open;
    L27:
        r3.setImageResource(r8);
        getImg_broadcast().setOnClickListener(new i71(this));
        initRecord();
        if (q62.OiO0IOX(r0, null, 1, null) == false) goto L31;
        addVoiceListener();
        return;
    L31:
        return;
    L26:
        r8 = R.drawable.ic_simultan_broadcast_close;
        goto L27
    L9:
        if (q62.OiO0IOX(r0, null, 1, null) == false) goto L11;
    L13:
        r4 = R.drawable.ic_left_ear;
        goto L14
    L11:
        if (BleConnector.INSTANCE.isBound() == false) goto L13;
        r4 = R.drawable.ic_left_ear_watch;
        goto L14
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_new_simultaneous_interpretation;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r9, int r10, @tb1 Intent r11) {
        super.onActivityResult(r9, r10, r11);
        if (r10 == (-1)) goto L5;
        return;
    L5:
        if (r9 == 0) goto L17;
        if (r9 != 1) goto L27;
        if (r11 == null) goto L10;
        Serializable r12 = r11.getSerializableExtra("language");
    L11:
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
        LanguageTranslationData r13 = (LanguageTranslationData) r12;
        if (Intrinsics.XOO0ii0(getMLeftLanguage().getName(), r13.getName()) == true) goto L15;
        setMRightLanguage(r13);
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        a01.OXO1.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        return;
    L15:
        setSwitchRotateAnimation(true);
        startRotateAnimation();
        return;
    L10:
        r12 = null;
        goto L11
    L27:
        return;
    L17:
        if (r11 == null) goto L19;
        Serializable r14 = r11.getSerializableExtra("language");
    L20:
        Intrinsics.X1ii(r14, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
        LanguageTranslationData r15 = (LanguageTranslationData) r14;
        if (Intrinsics.XOO0ii0(r15.getName(), getMRightLanguage().getName()) == true) goto L24;
        setMLeftLanguage(r15);
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        a01.OXO1.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        return;
    L24:
        setSwitchRotateAnimation(true);
        startRotateAnimation();
        return;
    L19:
        r14 = null;
        goto L20
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RecordingManager.Companion.getInstance().setRecording(false);
        BaseTranslationActivity.stopRecording$default(this, false, 1, null);
        getMHandler().removeCallbacks(getRunnable());
        a01.OXO1.OXO1().put(b01.iIXX0i, false);
    }

    @sf5(tag = I01XX0.iX01)
    public final void onLanguageChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onLanguageChange event = " + r4);
        setLangAndVoice();
        if (q62.OXO1.X11I() == false) goto L6;
        preConnect();
        return;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void onTranslationLanguage(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        if (RecordingManager.Companion.getInstance().isRecording() == false) goto L7;
        ToastUtils.showLong(getString(R.string.recording_tip), new Object[0]);
        return;
    L7:
        switch(r8.getId()) {
            case 2131362573: goto L11;
            case 2131362574: goto L9;
            default: goto L8;
        };
    L8:
        return;
    L9:
        LanguageTranslationData r9 = getMRightLanguage();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r9);
        Intent r10 = new Intent(this, ChooseLanguageActivity.class);
        r10.putExtras(r1);
        startActivityForResult(r10, 1);
        return;
    L11:
        LanguageTranslationData r11 = getMLeftLanguage();
        Bundle r6 = new Bundle();
        r6.putString("mArg0", null);
        r6.putParcelable("mArg2", null);
        r6.putSerializable("mArg3", r11);
        Intent r12 = new Intent(this, ChooseLanguageActivity.class);
        r12.putExtras(r6);
        startActivityForResult(r12, 0);
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void permission() {
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.MICROPHONE});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        String r1 = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        String r3 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        ds1.XIi00iiXO(r0, r1, r3, new m71(this));
    }

    public final void setMAnimationDrawable(@tb1 AnimationDrawable r1) {
        this.mAnimationDrawable = r1;
    }

    public final void setMVoiceType(int r1) {
        this.mVoiceType = r1;
    }

    public final void setPopTip(@tb1 z16 r1) {
        this.popTip = r1;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRecording() {
        clickDownRecording();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRotateAnimation() {
        if (RecordingManager.Companion.getInstance().isRecording() == false) goto L7;
        ToastUtils.showLong(getString(R.string.recording_tip), new Object[0]);
        return;
    L7:
        if (getSwitchRotateAnimation() == false) goto L10;
        getMTransformLanguageImg().clearAnimation();
        CharSequence r0 = getMTransformLanguageLeftTv().getText();
        CharSequence r2 = getMTransformLanguageRightTv().getText();
        final RotateAnimation r3 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r3.setDuration(500);
        r3.setRepeatCount(-1);
        setSwitchRotateAnimation(false);
        getMTransformLanguageImg().startAnimation(r3);
        getMTransformLanguageLeftTv().setText(r2);
        getMTransformLanguageRightTv().setText(r0);
        setMCacheLanguage(getMLeftLanguage());
        setMLeftLanguage(getMRightLanguage());
        LanguageTranslationData r1 = getMCacheLanguage();
        Intrinsics.XXI(r1);
        setMRightLanguage(r1);
        a01 r4 = a01.OXO1;
        r4.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
        r4.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        getMHandler().postDelayed(new n71(r3, this), 500);
        return;
    }

    public final void startVoice() {
        RecordingManager.Companion.getInstance().setRecording(true);
        getMHandler().postDelayed(new k71(this), 500);
        getImg_play().setImageResource(R.drawable.ic_binaural_stop);
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        setLangAndVoice();
        clickDownRecording();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void updateTimerText() {
        long r0 = getElapsedTime();
        long r2 = TimeConstants.HOUR;
        int r1 = (int) (r0 / r2);
        long r3 = 60000;
        int r4 = (int) ((getElapsedTime() % r2) / r3);
        int r5 = (int) ((getElapsedTime() % r3) / ((long) 1000));
        StringCompanionObject r6 = StringCompanionObject.OXO1;
        String r7 = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(r1), Integer.valueOf(r4), Integer.valueOf(r5)}, 3));
        Intrinsics.O10IXXX0X(r7, "format(...)");
        getTv_time().setText(r7);
    }
}
