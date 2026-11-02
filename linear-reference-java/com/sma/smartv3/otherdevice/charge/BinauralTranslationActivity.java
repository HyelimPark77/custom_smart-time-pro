package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I10IXiI0;
import com.android.mltcode.paycertificationapi.IIO00O11;
import com.android.mltcode.paycertificationapi.IO11OiOO;
import com.android.mltcode.paycertificationapi.IOX1X1;
import com.android.mltcode.paycertificationapi.IXOOOIX0;
import com.android.mltcode.paycertificationapi.IiOiOI0;
import com.android.mltcode.paycertificationapi.Iii01OiXi;
import com.android.mltcode.paycertificationapi.IiiXI0;
import com.android.mltcode.paycertificationapi.O0OOOOI;
import com.android.mltcode.paycertificationapi.O10OiiiI;
import com.android.mltcode.paycertificationapi.O110X;
import com.android.mltcode.paycertificationapi.OI0IIii;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OXIII1i;
import com.android.mltcode.paycertificationapi.X0OOX;
import com.android.mltcode.paycertificationapi.X0iiXiXO1;
import com.android.mltcode.paycertificationapi.X101iII;
import com.android.mltcode.paycertificationapi.X1XX01;
import com.android.mltcode.paycertificationapi.X1iOXOI10;
import com.android.mltcode.paycertificationapi.XOO10X1;
import com.android.mltcode.paycertificationapi.XOOi1I0I1;
import com.android.mltcode.paycertificationapi.XOX1Xi;
import com.android.mltcode.paycertificationapi.XX1XXXi;
import com.android.mltcode.paycertificationapi.XXO1XOOI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1i1O01II;
import com.android.mltcode.paycertificationapi.iI001;
import com.android.mltcode.paycertificationapi.iIiXO0iXI;
import com.android.mltcode.paycertificationapi.iOI010;
import com.android.mltcode.paycertificationapi.iOXiI;
import com.android.mltcode.paycertificationapi.iXiOX0O;
import com.android.mltcode.paycertificationapi.iiIOX110O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.z16;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.model.LeftAndRightPlayControl;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.view.WaveformView;
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
@SourceDebugExtension({"SMAP\nBinauralTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,738:1\n87#2,7:739\n94#2,3:747\n70#2,7:750\n97#2:757\n173#2,7:764\n180#2,3:772\n143#2,7:775\n183#2:782\n173#2,7:783\n180#2,3:791\n143#2,7:794\n183#2:801\n87#2,7:808\n94#2,3:816\n70#2,7:819\n97#2:826\n1#3:746\n1#3:771\n1#3:790\n1#3:815\n85#4,3:758\n85#4,3:761\n85#4,3:802\n85#4,3:805\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity\n*L\n483#1:739,7\n483#1:747,3\n483#1:750,7\n483#1:757\n648#1:764,7\n648#1:772,3\n648#1:775,7\n648#1:782\n653#1:783,7\n653#1:791,3\n653#1:794,7\n653#1:801\n713#1:808,7\n713#1:816,3\n713#1:819,7\n713#1:826\n483#1:746\n648#1:771\n653#1:790\n713#1:815\n522#1:758,3\n523#1:761,3\n668#1:802,3\n683#1:805,3\n*E\n"})
public final class BinauralTranslationActivity extends BaseTranslationActivity {

    @aa1
    private final String TAG;

    @aa1
    private ArrayList<AISpeech> aiSpeechList;

    @aa1
    private final MicrosoftSDKManage.iO binauralMicrosoftCallBack;

    @aa1
    private final Lazy img_change_big$delegate;

    @aa1
    private final Lazy img_play$delegate;

    @aa1
    private final Lazy img_recording_status$delegate;

    @aa1
    private final Lazy ll_left_language$delegate;

    @aa1
    private final Lazy ll_right_language$delegate;

    @aa1
    private final Lazy ll_top_select_language$delegate;
    private MultiItemTypeAdapter<AISpeech> mAdapter;
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
    private final Lazy tv_left_select_language$delegate;

    @aa1
    private final Lazy tv_right_select_language$delegate;

    @aa1
    private final Lazy tv_time$delegate;

    @aa1
    private final Lazy tv_tip$delegate;

    @SourceDebugExtension({"SMAP\nBinauralTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity$binauralMicrosoftCallBack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,738:1\n1563#2:739\n1634#2,3:740\n774#2:743\n865#2,2:744\n1563#2:746\n1634#2,3:747\n774#2:750\n865#2,2:751\n1563#2:753\n1634#2,3:754\n774#2:757\n865#2,2:758\n1563#2:760\n1634#2,3:761\n774#2:764\n865#2,2:765\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity$binauralMicrosoftCallBack$1\n*L\n118#1:739\n118#1:740,3\n119#1:743\n119#1:744,2\n183#1:746\n183#1:747,3\n184#1:750\n184#1:751,2\n214#1:753\n214#1:754,3\n215#1:757\n215#1:758,2\n279#1:760\n279#1:761,3\n280#1:764\n280#1:765,2\n*E\n"})
    public static final class OXO1 implements MicrosoftSDKManage.iO {
        public final /* synthetic */ BinauralTranslationActivity OXO1;

        public OXO1(BinauralTranslationActivity r1) {
            this.OXO1 = r1;
        }

        public static final void O00(BinauralTranslationActivity r1) {
            if (BinauralTranslationActivity.access$getAiSpeechList$p(r1).size() <= 0) goto L6;
            BinauralTranslationActivity.access$getRv(r1).smoothScrollToPosition(BinauralTranslationActivity.access$getAiSpeechList$p(r1).size() - 1);
            return;
        }

        public static /* synthetic */ void XIi00iiXO(BinauralTranslationActivity r0) {
            XO0O10(r0);
        }

        public static final void XO0O10(BinauralTranslationActivity r1) {
            if (BinauralTranslationActivity.access$getAiSpeechList$p(r1).size() <= 0) goto L6;
            BinauralTranslationActivity.access$getRv(r1).smoothScrollToPosition(BinauralTranslationActivity.access$getAiSpeechList$p(r1).size() - 1);
            return;
        }

        public static /* synthetic */ void iO(BinauralTranslationActivity r0) {
            O00(r0);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onIdentifyResults(int r26, String r27) {
            Intrinsics.X0O(r27, "str");
            i1O0OXO1O r3 = i1O0OXO1O.OXO1;
            r3.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults status = " + r26 + " content = " + r27 + " ");
            int r8 = 0;
            if (r26 != 1) goto L5;
            r3.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults content = " + r27);
            List<String> r1 = new Regex("[*]+").split(r27, 0);
            ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r4 = r1.iterator();
        L51:
            if (r4.hasNext() == false) goto L53;
            r2.add(StringsKt__StringsKt.iX1X1((String) r4.next()).toString());
            goto L51
        L53:
            ArrayList r5 = new ArrayList();
            Iterator r6 = r2.iterator();
        L55:
            if (r6.hasNext() == false) goto L59;
            Object r7 = r6.next();
            if (((String) r7).length() <= 0) goto L55;
            r5.add(r7);
            goto L55
        L59:
            i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults parts = " + r5);
            int r9 = r5.size();
        L60:
            if (r8 >= r9) goto L68;
            int r10 = r8 + 1;
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() >= r10) goto L65;
            BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).add(new AISpeech((String) r5.get(r8), null, 1, 0, null, null, null, 0, 0, 506, null));
        L65:
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() != r10) goto L67;
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r8)).setText((String) r5.get(r8));
        L67:
            r8 = r10;
        L68:
            MultiItemTypeAdapter r11 = BinauralTranslationActivity.access$getMAdapter$p(this.OXO1);
            if (r11 != null) goto L71;
            Intrinsics.XXO("mAdapter");
            r11 = null;
        L71:
            r11.notifyDataSetChanged();
            Handler r12 = this.OXO1.getMHandler();
            final BinauralTranslationActivity r13 = this.OXO1;
            r12.postDelayed(new XXO1XOOI(r13), 50);
            return;
        L5:
            if (r26 != 2) goto L68;
            r3.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults content = " + r27);
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
            i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults parts = " + r17);
            int r20 = r17.size();
            int r21 = 0;
        L18:
            if (r21 >= r20) goto L68;
            int r22 = r21 + 1;
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() >= r22) goto L31;
            AISpeech r110 = new AISpeech((String) r17.get(r21), null, 2, 0, null, null, null, 0, 0, 506, null);
            if (oe5.OX0X1O10X(LanguageTranslationKt.detectLanguage(r110.getText()), this.OXO1.getMLeftLanguage().getAsrLanguage(), true) == false) goto L24;
            r110.setLanguageModel(0);
            r110.setLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r110.setTargetLang(this.OXO1.getMRightLanguage().getRtasrLanguage());
            r110.setTtsVoiceName(this.OXO1.getMRightLanguage().getTtsViuceName());
        L25:
            BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).add(r110);
            if (r21 <= 0) goto L28;
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setStartTime(((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21 - 1)).getEndTime());
        L29:
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setEndTime(System.currentTimeMillis() - this.OXO1.getStartTime());
            BinauralTranslationActivity r23 = this.OXO1;
            BinauralTranslationActivity.access$binauralSendTranslationResultInput(r23, (AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(r23).get(r21), r21);
            goto L31
        L28:
            r110.setStartTime(0);
            goto L29
        L24:
            r110.setLanguageModel(1);
            r110.setLang(this.OXO1.getMRightLanguage().getRtasrLanguage());
            r110.setTargetLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r110.setTtsVoiceName(this.OXO1.getMLeftLanguage().getTtsViuceName());
        L31:
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() != r22) goto L48;
            if (((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).getStatus() != 1) goto L48;
            i1O0OXO1O r24 = i1O0OXO1O.OXO1;
            String r111 = BinauralTranslationActivity.access$getTAG$p(this.OXO1);
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() == r22) goto L37;
        L39:
            boolean r112 = false;
        L40:
            r24.OXO1(r111 + "  sendTranslate  onIdentifyResults istrue = " + r112);
            Object r113 = BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21);
            Intrinsics.O10IXXX0X(r113, "get(...)");
            AISpeech r114 = (AISpeech) r113;
            r114.setText((String) r17.get(r21));
            r114.setStatus(2);
            if (oe5.OX0X1O10X(LanguageTranslationKt.detectLanguage(r114.getText()), this.OXO1.getMLeftLanguage().getAsrLanguage(), true) == false) goto L43;
            r114.setLanguageModel(0);
            r114.setLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r114.setTargetLang(this.OXO1.getMRightLanguage().getRtasrLanguage());
            r114.setTtsVoiceName(this.OXO1.getMRightLanguage().getTtsViuceName());
        L44:
            if (r21 <= 0) goto L46;
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setStartTime(((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21 - 1)).getEndTime());
        L47:
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setEndTime(System.currentTimeMillis() - this.OXO1.getStartTime());
            r24.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults aiSpeechList " + BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1));
            BinauralTranslationActivity r25 = this.OXO1;
            BinauralTranslationActivity.access$binauralSendTranslationResultInput(r25, (AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(r25).get(r21), r21);
            goto L48
        L46:
            r114.setStartTime(0);
            goto L47
        L43:
            r114.setLanguageModel(1);
            r114.setLang(this.OXO1.getMRightLanguage().getRtasrLanguage());
            r114.setTargetLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r114.setTtsVoiceName(this.OXO1.getMLeftLanguage().getTtsViuceName());
            goto L44
        L37:
            if (((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).getStatus() != 1) goto L39;
            r112 = true;
        L48:
            r21 = r22;
            goto L18
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onIdentifyResultsDetectedLanguage(int r27, String r28, String r29) {
            Intrinsics.X0O(r28, "str");
            Intrinsics.X0O(r29, "detectedLanguage");
            i1O0OXO1O r4 = i1O0OXO1O.OXO1;
            r4.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults status = " + r27 + " content = " + r28 + " ");
            int r9 = 0;
            if (r27 != 1) goto L5;
            r4.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults content = " + r28);
            List<String> r1 = new Regex("[*]+").split(r28, 0);
            ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
            Iterator<T> r3 = r1.iterator();
        L51:
            if (r3.hasNext() == false) goto L53;
            r2.add(StringsKt__StringsKt.iX1X1((String) r3.next()).toString());
            goto L51
        L53:
            ArrayList r5 = new ArrayList();
            Iterator r6 = r2.iterator();
        L55:
            if (r6.hasNext() == false) goto L59;
            Object r7 = r6.next();
            if (((String) r7).length() <= 0) goto L55;
            r5.add(r7);
            goto L55
        L59:
            i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults parts = " + r5);
            int r8 = r5.size();
        L60:
            if (r9 >= r8) goto L68;
            int r10 = r9 + 1;
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() >= r10) goto L65;
            BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).add(new AISpeech((String) r5.get(r9), null, 1, 0, null, null, null, 0, 0, 506, null));
        L65:
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() != r10) goto L67;
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r9)).setText((String) r5.get(r9));
        L67:
            r9 = r10;
        L68:
            MultiItemTypeAdapter r11 = BinauralTranslationActivity.access$getMAdapter$p(this.OXO1);
            if (r11 != null) goto L71;
            Intrinsics.XXO("mAdapter");
            r11 = null;
        L71:
            r11.notifyDataSetChanged();
            Handler r12 = this.OXO1.getMHandler();
            final BinauralTranslationActivity r13 = this.OXO1;
            r12.postDelayed(new O110X(r13), 50);
            return;
        L5:
            if (r27 != 2) goto L68;
            r4.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults content = " + r28);
            List<String> r14 = new Regex("[*]+").split(r28, 0);
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
            i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults parts = " + r17);
            int r20 = r17.size();
            int r21 = 0;
        L18:
            if (r21 >= r20) goto L68;
            int r22 = r21 + 1;
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() >= r22) goto L31;
            AISpeech r110 = new AISpeech((String) r17.get(r21), null, 2, 0, null, null, null, 0, 0, 506, null);
            if (oe5.OX0X1O10X(r29, this.OXO1.getMLeftLanguage().getAsrLanguage(), true) == false) goto L24;
            r110.setLanguageModel(0);
            r110.setLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r110.setTargetLang(this.OXO1.getMRightLanguage().getRtasrLanguage());
            r110.setTtsVoiceName(this.OXO1.getMRightLanguage().getTtsViuceName());
        L25:
            BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).add(r110);
            if (r21 <= 0) goto L28;
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setStartTime(((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21 - 1)).getEndTime());
        L29:
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setEndTime(System.currentTimeMillis() - this.OXO1.getStartTime());
            BinauralTranslationActivity r23 = this.OXO1;
            BinauralTranslationActivity.access$binauralSendTranslationResultInput(r23, (AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(r23).get(r21), r21);
            goto L31
        L28:
            r110.setStartTime(0);
            goto L29
        L24:
            r110.setLanguageModel(1);
            r110.setLang(this.OXO1.getMRightLanguage().getRtasrLanguage());
            r110.setTargetLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r110.setTtsVoiceName(this.OXO1.getMLeftLanguage().getTtsViuceName());
        L31:
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() != r22) goto L48;
            if (((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).getStatus() != 1) goto L48;
            i1O0OXO1O r24 = i1O0OXO1O.OXO1;
            String r111 = BinauralTranslationActivity.access$getTAG$p(this.OXO1);
            if (BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).size() == r22) goto L37;
        L39:
            boolean r112 = false;
        L40:
            r24.OXO1(r111 + "  sendTranslate  onIdentifyResults istrue = " + r112);
            Object r113 = BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21);
            Intrinsics.O10IXXX0X(r113, "get(...)");
            AISpeech r114 = (AISpeech) r113;
            r114.setText((String) r17.get(r21));
            r114.setStatus(2);
            if (oe5.OX0X1O10X(r29, this.OXO1.getMLeftLanguage().getAsrLanguage(), true) == false) goto L43;
            r114.setLanguageModel(0);
            r114.setLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r114.setTargetLang(this.OXO1.getMRightLanguage().getRtasrLanguage());
            r114.setTtsVoiceName(this.OXO1.getMRightLanguage().getTtsViuceName());
        L44:
            if (r21 <= 0) goto L46;
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setStartTime(((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21 - 1)).getEndTime());
        L47:
            ((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setEndTime(System.currentTimeMillis() - this.OXO1.getStartTime());
            r24.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults aiSpeechList " + BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1));
            BinauralTranslationActivity r25 = this.OXO1;
            BinauralTranslationActivity.access$binauralSendTranslationResultInput(r25, (AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(r25).get(r21), r21);
            goto L48
        L46:
            r114.setStartTime(0);
            goto L47
        L43:
            r114.setLanguageModel(1);
            r114.setLang(this.OXO1.getMRightLanguage().getRtasrLanguage());
            r114.setTargetLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r114.setTtsVoiceName(this.OXO1.getMLeftLanguage().getTtsViuceName());
            goto L44
        L37:
            if (((AISpeech) BinauralTranslationActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).getStatus() != 1) goto L39;
            r112 = true;
        L48:
            r21 = r22;
            goto L18
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.access$getTAG$p(this.OXO1) + " onStartTransmission ");
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStopTransmission() {
        }
    }

    public BinauralTranslationActivity() {
        this.TAG = "BinauralTranslationActivity";
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new X0OOX(this));
        this.tv_time$delegate = LazyKt__LazyJVMKt.iO(new IiiXI0(this));
        this.img_recording_status$delegate = LazyKt__LazyJVMKt.iO(new IIO00O11(this));
        this.img_play$delegate = LazyKt__LazyJVMKt.iO(new X1iOXOI10(this));
        this.tv_tip$delegate = LazyKt__LazyJVMKt.iO(new Iii01OiXi(this));
        this.record_line$delegate = LazyKt__LazyJVMKt.iO(new X0iiXiXO1(this));
        this.ll_top_select_language$delegate = LazyKt__LazyJVMKt.iO(new O10OiiiI(this));
        this.img_change_big$delegate = LazyKt__LazyJVMKt.iO(new I10IXiI0(this));
        this.ll_left_language$delegate = LazyKt__LazyJVMKt.iO(new IO11OiOO(this));
        this.ll_right_language$delegate = LazyKt__LazyJVMKt.iO(new iIiXO0iXI(this));
        this.tv_left_select_language$delegate = LazyKt__LazyJVMKt.iO(new iXiOX0O(this));
        this.tv_right_select_language$delegate = LazyKt__LazyJVMKt.iO(new OXIII1i(this));
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new i1i1O01II(this));
        this.aiSpeechList = new ArrayList();
        setMAIRecordsType(2);
        this.binauralMicrosoftCallBack = new OXO1(this);
        this.mVoiceType = -1;
    }

    public static /* synthetic */ TextView I1(BinauralTranslationActivity r0) {
        return tv_time_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void II1Xi0(BinauralTranslationActivity r0) {
        endVoice$lambda$0(r0);
    }

    public static /* synthetic */ boolean IXXOO(BinauralTranslationActivity r0, int r1, int r2, int r3) {
        return addVoiceListener$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ boolean Ii1iii0(AISpeech r0) {
        return startVoice$lambda$0$0(r0);
    }

    public static /* synthetic */ void O001I(BinauralTranslationActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void O1O(BinauralTranslationActivity r0, View r1) {
        initRecord$lambda$0(r0, r1);
    }

    public static /* synthetic */ LinearLayout OO(BinauralTranslationActivity r0) {
        return ll_left_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OX110i(BinauralTranslationActivity r0) {
        binauralSendTranslationResultInput$lambda$0$0$0(r0);
    }

    public static /* synthetic */ TextView X01IiOiIi(BinauralTranslationActivity r0) {
        return tv_left_select_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0i1O(BinauralTranslationActivity r0) {
        initView$lambda$2(r0);
    }

    public static /* synthetic */ void X100O(RotateAnimation r0, RotateAnimation r1, BinauralTranslationActivity r2) {
        startRotateAnimation$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void X11I(BinauralTranslationActivity r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ RecyclerView X11iII1O1(BinauralTranslationActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1IX(BinauralTranslationActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ TextView XOX0O0(BinauralTranslationActivity r0) {
        return tv_right_select_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XX1Oi(BinauralTranslationActivity r0) {
        return ll_top_select_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXIIO1i11(CompoundButton r0, boolean r1) {
        showTranslationTipPopup$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void XXO(BinauralTranslationActivity r0) {
        binauralSendTranslationResultInput$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit XXX11i(BinauralTranslationActivity r0, PermissionStatus r1) {
        return permission$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$binauralSendTranslationResultInput(BinauralTranslationActivity r0, AISpeech r1, int r2) {
        r0.binauralSendTranslationResultInput(r1, r2);
    }

    public static final /* synthetic */ ArrayList access$getAiSpeechList$p(BinauralTranslationActivity r0) {
        return r0.aiSpeechList;
    }

    public static final /* synthetic */ MultiItemTypeAdapter access$getMAdapter$p(BinauralTranslationActivity r0) {
        return r0.mAdapter;
    }

    public static final /* synthetic */ RecyclerView access$getRv(BinauralTranslationActivity r0) {
        return r0.getRv();
    }

    public static final /* synthetic */ String access$getTAG$p(BinauralTranslationActivity r0) {
        return r0.TAG;
    }

    private static final boolean addVoiceListener$lambda$0(BinauralTranslationActivity r0, int r1, int r2, int r3) {
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
        i1O0OXO1O.OXO1.OXO1(this.TAG + " binauralSendTranslationResultInput ===> str = " + r5.getText() + " , targetLang = " + r5.getTargetLang());
        MicrosoftSDKManage.XIi00iiXO r8 = MicrosoftSDKManage.O1O;
        r8.OXO1().IXI();
        r8.OXO1().OI(r5.getText(), r5.getTargetLang(), new iiIOX110O(r5, this));
        return;
    L15:
        return;
    }

    private static final Unit binauralSendTranslationResultInput$lambda$0(AISpeech r7, final BinauralTranslationActivity r8, String r9) {
        Intrinsics.X0O(r9, "it");
        r7.setDst(StringsKt__StringsKt.iX1X1(r9).toString());
        i1O0OXO1O.OXO1.OXO1(r8.TAG + " binauralSendTranslationResultInput ===> str = " + r7.getText() + " " + r7.getDst());
        r8.getMHandler().post(new XOX1Xi(r8));
        MicrosoftSDKManage r0 = MicrosoftSDKManage.O1O.OXO1();
        String r1 = r7.getDst();
        String r2 = r7.getTtsVoiceName();
        if (r7.getLanguageModel() != 0) goto L6;
        LeftAndRightPlayControl r10 = LeftAndRightPlayControl.RIGHT;
    L7:
        MicrosoftSDKManage.X11iII1O1(r0, r1, r2, r10, 0, 8, null);
        return Unit.OXO1;
    L6:
        r10 = LeftAndRightPlayControl.LEFT;
        goto L7
    }

    private static final void binauralSendTranslationResultInput$lambda$0$0(final BinauralTranslationActivity r4) {
        MultiItemTypeAdapter<AISpeech> r0 = r4.mAdapter;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r0 = null;
    L5:
        r0.notifyDataSetChanged();
        r4.getMHandler().postDelayed(new iOI010(r4), 300);
    }

    private static final void binauralSendTranslationResultInput$lambda$0$0$0(BinauralTranslationActivity r1) {
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

    private static final void endVoice$lambda$0(BinauralTranslationActivity r1) {
        ToastUtils.showShort(r1.getString(R.string.not_record_data), new Object[0]);
    }

    private final ImageView getImg_change_big() {
        return (ImageView) getValue();
    }

    private final ImageView getImg_play() {
        return (ImageView) getValue();
    }

    private final ImageView getImg_recording_status() {
        return (ImageView) getValue();
    }

    private final LinearLayout getLl_left_language() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLl_right_language() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLl_top_select_language() {
        return (LinearLayout) getValue();
    }

    private final WaveformView getRecord_line() {
        return (WaveformView) getValue();
    }

    private final RecyclerView getRv() {
        return (RecyclerView) getValue();
    }

    private final TextView getTv_left_select_language() {
        return (TextView) getValue();
    }

    private final TextView getTv_right_select_language() {
        return (TextView) getValue();
    }

    private final TextView getTv_time() {
        return (TextView) getValue();
    }

    private final TextView getTv_tip() {
        return (TextView) getValue();
    }

    public static /* synthetic */ View i010I(BinauralTranslationActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iI(BinauralTranslationActivity r0) {
        return img_change_big_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iIXi1iiXI(BinauralTranslationActivity r0) {
        startVoice$lambda$0(r0);
    }

    public static /* synthetic */ void iOO1ii1(BinauralTranslationActivity r0, View r1) {
        showTranslationTipPopup$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ Unit iOOX010X(AISpeech r0, BinauralTranslationActivity r1, String r2) {
        return binauralSendTranslationResultInput$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ LinearLayout iX(BinauralTranslationActivity r0) {
        return ll_right_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iX1O1(BinauralTranslationActivity r0) {
        return tv_tip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iXiX011(BinauralTranslationActivity r0) {
        return img_play_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iXiiiO(BinauralTranslationActivity r0) {
        return img_recording_status_delegate$lambda$0(r0);
    }

    public static /* synthetic */ WaveformView iiiO(BinauralTranslationActivity r0) {
        return record_line_delegate$lambda$0(r0);
    }

    private static final ImageView img_change_big_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_change_big);
    }

    private static final ImageView img_play_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_play);
    }

    private static final ImageView img_recording_status_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_recording_status);
    }

    private static final void initRecord$lambda$0(BinauralTranslationActivity r0, View r1) {
        if (RecordingManager.Companion.getInstance().isRecording() == false) goto L6;
        r0.endVoice();
        return;
    L6:
        r0.startVoice();
    }

    private static final void initView$lambda$0(BinauralTranslationActivity r0, View r1) {
        r0.startRotateAnimation();
    }

    private static final void initView$lambda$1(BinauralTranslationActivity r0, View r1) {
        r0.showTranslationTipPopup();
    }

    private static final void initView$lambda$2(BinauralTranslationActivity r0) {
        r0.showTranslationTipPopup();
    }

    private static final void initView$lambda$3(BinauralTranslationActivity r0, View r1) {
        r0.startRotateAnimation();
    }

    private static final LinearLayout ll_left_language_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_left_language);
    }

    private static final LinearLayout ll_right_language_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_right_language);
    }

    private static final LinearLayout ll_top_select_language_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_top_select_language);
    }

    private static final Unit permission$lambda$0(BinauralTranslationActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        if (r2 != PermissionStatus.GRANTED) goto L6;
        r1.startRecordingBinaural();
    L6:
        return Unit.OXO1;
    }

    private final void preConnect() {
        List r8 = CollectionsKt__CollectionsKt.Ii1iii0(new String[]{getMLeftLanguage().getAsrLanguage(), getMRightLanguage().getAsrLanguage()});
        MicrosoftSDKManage.iiII(MicrosoftSDKManage.O1O.OXO1(), getArsLanguage(), true, getTtsVoiceName(), getTtsTargetLang(), false, null, r8, false, 160, null);
    }

    private static final WaveformView record_line_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (WaveformView) r1.findViewById(R.id.record_line);
    }

    private static final View rootView_delegate$lambda$0(BinauralTranslationActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final RecyclerView rv_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    private final void showTranslationTipPopup() {
        if (this.popTip != null) goto L5;
        z16 r0 = new z16(this);
        r0.X1IX(Boolean.valueOf(a01.OXO1.OXO1().getBoolean(b01.O0i, false)));
        r0.iX().setOnCheckedChangeListener(new IiOiOI0());
        r0.OII().setOnClickListener(new IOX1X1(this));
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
        a01.OXO1.OXO1().put(b01.O0i, r2);
    }

    private static final void showTranslationTipPopup$lambda$0$1(BinauralTranslationActivity r4, View r5) {
        q62 r6 = q62.OXO1;
        if (q62.OiO0IOX(r6, null, 1, null) == false) goto L6;
        String r7 = "2";
    L9:
        int r0 = WebViewActivity.Companion.iO();
        Bundle r2 = new Bundle();
        r2.putString("mArg0", "https://api.iot-solution.net/videoPlayer/?type=" + r7 + "&id=1");
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
        MicrosoftSDKManage.iIi0(r0.OXO1(), false, 1, null);
    L5:
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        showCountdownPopup(r1);
    }

    private static final void startRotateAnimation$lambda$0(RotateAnimation r0, RotateAnimation r1, BinauralTranslationActivity r2) {
        r0.cancel();
        r1.cancel();
        r2.getMTransformLanguageImg().clearAnimation();
        r2.getImg_change_big().clearAnimation();
        r2.setSwitchRotateAnimation(true);
    }

    private static final void startVoice$lambda$0(BinauralTranslationActivity r2) {
        r2.aiSpeechList.clear();
        OIXO1IIOO.iIX0i(r2.aiSpeechList, new i11X());
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

    private static final TextView tv_left_select_language_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_left_select_language);
    }

    private static final TextView tv_right_select_language_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_right_select_language);
    }

    private static final TextView tv_time_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_time);
    }

    private static final TextView tv_tip_delegate$lambda$0(BinauralTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_tip);
    }

    public final void addVoiceListener() {
        VoiceManager.INSTANCE.setMListener(new IXOOOIX0(this));
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
        RecordingManager.Companion r0 = RecordingManager.Companion;
        if (r0.getInstance().isRecording() == false) goto L6;
        setStartTime(System.currentTimeMillis());
        getImg_recording_status().setVisibility(0);
        getRecord_line().setVisibility(8);
        r0.getInstance().setRecording(true);
        Glide.with(getMContext()).asGif().load(Integer.valueOf(R.drawable.pop_recording_animation_img)).into(getImg_recording_status());
        setElapsedTime(0);
        getMHandler().postDelayed(getRunnable(), getUpdateInterval());
        return;
    }

    public final void endVoice() {
        RecordingManager.Companion.getInstance().setRecording(false);
        getImg_play().setImageResource(R.drawable.ic_binaural_start);
        getTv_tip().setText(R.string.click_start_recording);
        getImg_recording_status().setVisibility(4);
        getRecord_line().setVisibility(8);
        binauralStopRecording();
        getMHandler().removeCallbacks(getRunnable());
        removeCountdownPopup();
        setElapsedTime(0);
        updateTimerText();
        finish();
        if (this.aiSpeechList.size() <= 0) goto L6;
        ArrayList<AISpeech> r0 = this.aiSpeechList;
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r0);
        Intent r2 = new Intent(this, BinauralTranslationRecordActivity.class);
        r2.putExtras(r1);
        startActivity(r2);
        return;
    L6:
        getMHandler().postDelayed(new OI0IIii(this), 500);
    }

    @aa1
    public final MicrosoftSDKManage.iO getBinauralMicrosoftCallBack() {
        return this.binauralMicrosoftCallBack;
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
        getImg_play().setOnClickListener(new X1XX01(this));
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setLangAndVoice();
        q62 r0 = q62.OXO1;
        if (r0.X11I() == false) goto L5;
        preConnect();
    L5:
        a01 r1 = a01.OXO1;
        r1.OXO1().put(b01.iIXX0i, true);
        final ArrayList<AISpeech> r2 = this.aiSpeechList;
        this.mAdapter = new AnonymousClass1(this, r2);
        getRv().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView r3 = getRv();
        MultiItemTypeAdapter<AISpeech> r4 = this.mAdapter;
        if (r4 != null) goto L8;
        Intrinsics.XXO("mAdapter");
        r4 = null;
    L8:
        r3.setAdapter(r4);
        getMTransformLanguageImg().setOnClickListener(new X101iII(this));
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        getTv_left_select_language().setText(getMLeftLanguage().getName());
        getTv_right_select_language().setText(getMRightLanguage().getName());
        VoiceManager.INSTANCE.setActivityData(true);
        if (r0.X11I() == false) goto L11;
        MicrosoftSDKManage.i100IXOX(MicrosoftSDKManage.O1O.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
    L11:
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setOnClickListener(new iOXiI(this));
        getAbhTitleCenter().setVisibility(8);
        if (r1.OXO1().getBoolean(b01.O0i, false) == true) goto L14;
        getRootView().post(new XOOi1I0I1(this));
    L14:
        getImg_change_big().setOnClickListener(new XX1XXXi(this));
        initRecord();
        if (q62.OiO0IOX(r0, null, 1, null) == false) goto L18;
        addVoiceListener();
        return;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_binaural_translation;
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
        getTv_right_select_language().setText(getMRightLanguage().getName());
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
        getTv_left_select_language().setText(getMLeftLanguage().getName());
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
            case 2131363583: goto L11;
            case 2131363609: goto L9;
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
        ds1.XIi00iiXO(r0, r1, r3, new XOO10X1(this));
    }

    public final void setMVoiceType(int r1) {
        this.mVoiceType = r1;
    }

    public final void setPopTip(@tb1 z16 r1) {
        this.popTip = r1;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRotateAnimation() {
        if (getSwitchRotateAnimation() == false) goto L6;
        getMTransformLanguageImg().clearAnimation();
        getImg_change_big().clearAnimation();
        CharSequence r0 = getMTransformLanguageLeftTv().getText();
        CharSequence r1 = getMTransformLanguageRightTv().getText();
        final RotateAnimation r2 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r2.setDuration(500);
        r2.setRepeatCount(-1);
        setSwitchRotateAnimation(false);
        getMTransformLanguageImg().startAnimation(r2);
        final RotateAnimation r8 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r8.setDuration(500);
        r8.setRepeatCount(-1);
        getImg_change_big().startAnimation(r8);
        getMTransformLanguageLeftTv().setText(r1);
        getMTransformLanguageRightTv().setText(r0);
        getTv_left_select_language().setText(r1);
        getTv_right_select_language().setText(r0);
        setMCacheLanguage(getMLeftLanguage());
        setMLeftLanguage(getMRightLanguage());
        LanguageTranslationData r3 = getMCacheLanguage();
        Intrinsics.XXI(r3);
        setMRightLanguage(r3);
        a01 r4 = a01.OXO1;
        r4.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
        r4.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        getMHandler().postDelayed(new iI001(r2, r8, this), 500);
        return;
    }

    public final void startVoice() {
        RecordingManager.Companion.getInstance().setRecording(true);
        getLl_top_select_language().setVisibility(8);
        getMHandler().postDelayed(new O0OOOOI(this), 500);
        getImg_play().setImageResource(R.drawable.ic_binaural_stop);
        getTv_tip().setText(R.string.click_stop_recording);
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
