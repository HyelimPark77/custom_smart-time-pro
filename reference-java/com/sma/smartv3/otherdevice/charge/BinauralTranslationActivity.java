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
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.z16;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
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
import com.sma.smartv3.otherdevice.charge.BinauralTranslationActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBinauralTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,738:1\n87#2,7:739\n94#2,3:747\n70#2,7:750\n97#2:757\n173#2,7:764\n180#2,3:772\n143#2,7:775\n183#2:782\n173#2,7:783\n180#2,3:791\n143#2,7:794\n183#2:801\n87#2,7:808\n94#2,3:816\n70#2,7:819\n97#2:826\n1#3:746\n1#3:771\n1#3:790\n1#3:815\n85#4,3:758\n85#4,3:761\n85#4,3:802\n85#4,3:805\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity\n*L\n483#1:739,7\n483#1:747,3\n483#1:750,7\n483#1:757\n648#1:764,7\n648#1:772,3\n648#1:775,7\n648#1:782\n653#1:783,7\n653#1:791,3\n653#1:794,7\n653#1:801\n713#1:808,7\n713#1:816,3\n713#1:819,7\n713#1:826\n483#1:746\n648#1:771\n653#1:790\n713#1:815\n522#1:758,3\n523#1:761,3\n668#1:802,3\n683#1:805,3\n*E\n"})
public final class BinauralTranslationActivity extends BaseTranslationActivity {

    @aa1
    private final MicrosoftSDKManage.InterfaceC19048iO binauralMicrosoftCallBack;
    private MultiItemTypeAdapter<AISpeech> mAdapter;
    private int mVoiceType;

    @tb1
    private z16 popTip;

    @aa1
    private final String TAG = "BinauralTranslationActivity";

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0OOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.rootView_delegate$lambda$0(this.f3996IO);
        }
    });

    @aa1
    private final Lazy tv_time$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiiXI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.tv_time_delegate$lambda$0(this.f2334IO);
        }
    });

    @aa1
    private final Lazy img_recording_status$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIO00O11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.img_recording_status_delegate$lambda$0(this.f1602IO);
        }
    });

    @aa1
    private final Lazy img_play$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1iOXOI10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.img_play_delegate$lambda$0(this.f4393IO);
        }
    });

    @aa1
    private final Lazy tv_tip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Iii01OiXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.tv_tip_delegate$lambda$0(this.f2314IO);
        }
    });

    @aa1
    private final Lazy record_line$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0iiXiXO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.record_line_delegate$lambda$0(this.f4116IO);
        }
    });

    @aa1
    private final Lazy ll_top_select_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O10OiiiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.ll_top_select_language_delegate$lambda$0(this.f2634IO);
        }
    });

    @aa1
    private final Lazy img_change_big$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I10IXiI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.img_change_big_delegate$lambda$0(this.f1308IO);
        }
    });

    @aa1
    private final Lazy ll_left_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO11OiOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.ll_left_language_delegate$lambda$0(this.f1754IO);
        }
    });

    @aa1
    private final Lazy ll_right_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIiXO0iXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.ll_right_language_delegate$lambda$0(this.f7958IO);
        }
    });

    @aa1
    private final Lazy tv_left_select_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXiOX0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.tv_left_select_language_delegate$lambda$0(this.f8445IO);
        }
    });

    @aa1
    private final Lazy tv_right_select_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXIII1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.tv_right_select_language_delegate$lambda$0(this.f3460IO);
        }
    });

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1i1O01II
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationActivity.rv_delegate$lambda$0(this.f7711IO);
        }
    });

    @aa1
    private ArrayList<AISpeech> aiSpeechList = new ArrayList<>();

    @SourceDebugExtension({"SMAP\nBinauralTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity$binauralMicrosoftCallBack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,738:1\n1563#2:739\n1634#2,3:740\n774#2:743\n865#2,2:744\n1563#2:746\n1634#2,3:747\n774#2:750\n865#2,2:751\n1563#2:753\n1634#2,3:754\n774#2:757\n865#2,2:758\n1563#2:760\n1634#2,3:761\n774#2:764\n865#2,2:765\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity$binauralMicrosoftCallBack$1\n*L\n118#1:739\n118#1:740,3\n119#1:743\n119#1:744,2\n183#1:746\n183#1:747,3\n184#1:750\n184#1:751,2\n214#1:753\n214#1:754,3\n215#1:757\n215#1:758,2\n279#1:760\n279#1:761,3\n280#1:764\n280#1:765,2\n*E\n"})
    public static final class OXO1 implements MicrosoftSDKManage.InterfaceC19048iO {
        public OXO1() {
        }

        public static final void O00(BinauralTranslationActivity binauralTranslationActivity) {
            if (binauralTranslationActivity.aiSpeechList.size() > 0) {
                binauralTranslationActivity.getRv().smoothScrollToPosition(binauralTranslationActivity.aiSpeechList.size() - 1);
            }
        }

        public static final void XO0O10(BinauralTranslationActivity binauralTranslationActivity) {
            if (binauralTranslationActivity.aiSpeechList.size() > 0) {
                binauralTranslationActivity.getRv().smoothScrollToPosition(binauralTranslationActivity.aiSpeechList.size() - 1);
            }
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onIdentifyResults(int i, String str) {
            Intrinsics.X0O(str, "str");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults status = " + i + " content = " + str + " ");
            int i2 = 0;
            if (i == 1) {
                i1o0oxo1o.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
                List<String> listSplit = new Regex("[*]+").split(str, 0);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listSplit, 10));
                Iterator<T> it = listSplit.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt__StringsKt.iX1X1((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults parts = " + arrayList2);
                int size = arrayList2.size();
                while (i2 < size) {
                    int i3 = i2 + 1;
                    if (BinauralTranslationActivity.this.aiSpeechList.size() < i3) {
                        BinauralTranslationActivity.this.aiSpeechList.add(new AISpeech((String) arrayList2.get(i2), null, 1, 0, null, null, null, 0L, 0L, 506, null));
                    }
                    if (BinauralTranslationActivity.this.aiSpeechList.size() == i3) {
                        ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i2)).setText((String) arrayList2.get(i2));
                    }
                    i2 = i3;
                }
            } else if (i == 2) {
                i1o0oxo1o.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
                List<String> listSplit2 = new Regex("[*]+").split(str, 0);
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listSplit2, 10));
                Iterator<T> it2 = listSplit2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(StringsKt__StringsKt.iX1X1((String) it2.next()).toString());
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (((String) obj2).length() > 0) {
                        arrayList4.add(obj2);
                    }
                }
                i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults parts = " + arrayList4);
                int size2 = arrayList4.size();
                int i4 = 0;
                while (i4 < size2) {
                    int i5 = i4 + 1;
                    if (BinauralTranslationActivity.this.aiSpeechList.size() < i5) {
                        AISpeech aISpeech = new AISpeech((String) arrayList4.get(i4), null, 2, 0, null, null, null, 0L, 0L, 506, null);
                        if (oe5.OX0X1O10X(LanguageTranslationKt.detectLanguage(aISpeech.getText()), BinauralTranslationActivity.this.getMLeftLanguage().getAsrLanguage(), true)) {
                            aISpeech.setLanguageModel(0);
                            aISpeech.setLang(BinauralTranslationActivity.this.getMLeftLanguage().getRtasrLanguage());
                            aISpeech.setTargetLang(BinauralTranslationActivity.this.getMRightLanguage().getRtasrLanguage());
                            aISpeech.setTtsVoiceName(BinauralTranslationActivity.this.getMRightLanguage().getTtsViuceName());
                        } else {
                            aISpeech.setLanguageModel(1);
                            aISpeech.setLang(BinauralTranslationActivity.this.getMRightLanguage().getRtasrLanguage());
                            aISpeech.setTargetLang(BinauralTranslationActivity.this.getMLeftLanguage().getRtasrLanguage());
                            aISpeech.setTtsVoiceName(BinauralTranslationActivity.this.getMLeftLanguage().getTtsViuceName());
                        }
                        BinauralTranslationActivity.this.aiSpeechList.add(aISpeech);
                        if (i4 > 0) {
                            ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).setStartTime(((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4 - 1)).getEndTime());
                        } else {
                            aISpeech.setStartTime(0L);
                        }
                        ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).setEndTime(System.currentTimeMillis() - BinauralTranslationActivity.this.getStartTime());
                        BinauralTranslationActivity binauralTranslationActivity = BinauralTranslationActivity.this;
                        binauralTranslationActivity.binauralSendTranslationResultInput((AISpeech) binauralTranslationActivity.aiSpeechList.get(i4), i4);
                    }
                    if (BinauralTranslationActivity.this.aiSpeechList.size() == i5 && ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).getStatus() == 1) {
                        i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
                        i1o0oxo1o2.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults istrue = " + (BinauralTranslationActivity.this.aiSpeechList.size() == i5 && ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).getStatus() == 1));
                        Object obj3 = BinauralTranslationActivity.this.aiSpeechList.get(i4);
                        Intrinsics.O10IXXX0X(obj3, "get(...)");
                        AISpeech aISpeech2 = (AISpeech) obj3;
                        aISpeech2.setText((String) arrayList4.get(i4));
                        aISpeech2.setStatus(2);
                        if (oe5.OX0X1O10X(LanguageTranslationKt.detectLanguage(aISpeech2.getText()), BinauralTranslationActivity.this.getMLeftLanguage().getAsrLanguage(), true)) {
                            aISpeech2.setLanguageModel(0);
                            aISpeech2.setLang(BinauralTranslationActivity.this.getMLeftLanguage().getRtasrLanguage());
                            aISpeech2.setTargetLang(BinauralTranslationActivity.this.getMRightLanguage().getRtasrLanguage());
                            aISpeech2.setTtsVoiceName(BinauralTranslationActivity.this.getMRightLanguage().getTtsViuceName());
                        } else {
                            aISpeech2.setLanguageModel(1);
                            aISpeech2.setLang(BinauralTranslationActivity.this.getMRightLanguage().getRtasrLanguage());
                            aISpeech2.setTargetLang(BinauralTranslationActivity.this.getMLeftLanguage().getRtasrLanguage());
                            aISpeech2.setTtsVoiceName(BinauralTranslationActivity.this.getMLeftLanguage().getTtsViuceName());
                        }
                        if (i4 > 0) {
                            ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).setStartTime(((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4 - 1)).getEndTime());
                        } else {
                            aISpeech2.setStartTime(0L);
                        }
                        ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).setEndTime(System.currentTimeMillis() - BinauralTranslationActivity.this.getStartTime());
                        i1o0oxo1o2.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults aiSpeechList " + BinauralTranslationActivity.this.aiSpeechList);
                        BinauralTranslationActivity binauralTranslationActivity2 = BinauralTranslationActivity.this;
                        binauralTranslationActivity2.binauralSendTranslationResultInput((AISpeech) binauralTranslationActivity2.aiSpeechList.get(i4), i4);
                    }
                    i4 = i5;
                }
            }
            MultiItemTypeAdapter multiItemTypeAdapter = BinauralTranslationActivity.this.mAdapter;
            if (multiItemTypeAdapter == null) {
                Intrinsics.XXO("mAdapter");
                multiItemTypeAdapter = null;
            }
            multiItemTypeAdapter.notifyDataSetChanged();
            Handler mHandler = BinauralTranslationActivity.this.getMHandler();
            final BinauralTranslationActivity binauralTranslationActivity3 = BinauralTranslationActivity.this;
            mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XXO1XOOI
                @Override // java.lang.Runnable
                public final void run() {
                    BinauralTranslationActivity.OXO1.XO0O10(binauralTranslationActivity3);
                }
            }, 50L);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onIdentifyResultsDetectedLanguage(int i, String str, String detectedLanguage) {
            Intrinsics.X0O(str, "str");
            Intrinsics.X0O(detectedLanguage, "detectedLanguage");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults status = " + i + " content = " + str + " ");
            int i2 = 0;
            if (i == 1) {
                i1o0oxo1o.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
                List<String> listSplit = new Regex("[*]+").split(str, 0);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listSplit, 10));
                Iterator<T> it = listSplit.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt__StringsKt.iX1X1((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults parts = " + arrayList2);
                int size = arrayList2.size();
                while (i2 < size) {
                    int i3 = i2 + 1;
                    if (BinauralTranslationActivity.this.aiSpeechList.size() < i3) {
                        BinauralTranslationActivity.this.aiSpeechList.add(new AISpeech((String) arrayList2.get(i2), null, 1, 0, null, null, null, 0L, 0L, 506, null));
                    }
                    if (BinauralTranslationActivity.this.aiSpeechList.size() == i3) {
                        ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i2)).setText((String) arrayList2.get(i2));
                    }
                    i2 = i3;
                }
            } else if (i == 2) {
                i1o0oxo1o.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
                List<String> listSplit2 = new Regex("[*]+").split(str, 0);
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listSplit2, 10));
                Iterator<T> it2 = listSplit2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(StringsKt__StringsKt.iX1X1((String) it2.next()).toString());
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (((String) obj2).length() > 0) {
                        arrayList4.add(obj2);
                    }
                }
                i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults parts = " + arrayList4);
                int size2 = arrayList4.size();
                int i4 = 0;
                while (i4 < size2) {
                    int i5 = i4 + 1;
                    if (BinauralTranslationActivity.this.aiSpeechList.size() < i5) {
                        AISpeech aISpeech = new AISpeech((String) arrayList4.get(i4), null, 2, 0, null, null, null, 0L, 0L, 506, null);
                        if (oe5.OX0X1O10X(detectedLanguage, BinauralTranslationActivity.this.getMLeftLanguage().getAsrLanguage(), true)) {
                            aISpeech.setLanguageModel(0);
                            aISpeech.setLang(BinauralTranslationActivity.this.getMLeftLanguage().getRtasrLanguage());
                            aISpeech.setTargetLang(BinauralTranslationActivity.this.getMRightLanguage().getRtasrLanguage());
                            aISpeech.setTtsVoiceName(BinauralTranslationActivity.this.getMRightLanguage().getTtsViuceName());
                        } else {
                            aISpeech.setLanguageModel(1);
                            aISpeech.setLang(BinauralTranslationActivity.this.getMRightLanguage().getRtasrLanguage());
                            aISpeech.setTargetLang(BinauralTranslationActivity.this.getMLeftLanguage().getRtasrLanguage());
                            aISpeech.setTtsVoiceName(BinauralTranslationActivity.this.getMLeftLanguage().getTtsViuceName());
                        }
                        BinauralTranslationActivity.this.aiSpeechList.add(aISpeech);
                        if (i4 > 0) {
                            ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).setStartTime(((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4 - 1)).getEndTime());
                        } else {
                            aISpeech.setStartTime(0L);
                        }
                        ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).setEndTime(System.currentTimeMillis() - BinauralTranslationActivity.this.getStartTime());
                        BinauralTranslationActivity binauralTranslationActivity = BinauralTranslationActivity.this;
                        binauralTranslationActivity.binauralSendTranslationResultInput((AISpeech) binauralTranslationActivity.aiSpeechList.get(i4), i4);
                    }
                    if (BinauralTranslationActivity.this.aiSpeechList.size() == i5 && ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).getStatus() == 1) {
                        i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
                        i1o0oxo1o2.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults istrue = " + (BinauralTranslationActivity.this.aiSpeechList.size() == i5 && ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).getStatus() == 1));
                        Object obj3 = BinauralTranslationActivity.this.aiSpeechList.get(i4);
                        Intrinsics.O10IXXX0X(obj3, "get(...)");
                        AISpeech aISpeech2 = (AISpeech) obj3;
                        aISpeech2.setText((String) arrayList4.get(i4));
                        aISpeech2.setStatus(2);
                        if (oe5.OX0X1O10X(detectedLanguage, BinauralTranslationActivity.this.getMLeftLanguage().getAsrLanguage(), true)) {
                            aISpeech2.setLanguageModel(0);
                            aISpeech2.setLang(BinauralTranslationActivity.this.getMLeftLanguage().getRtasrLanguage());
                            aISpeech2.setTargetLang(BinauralTranslationActivity.this.getMRightLanguage().getRtasrLanguage());
                            aISpeech2.setTtsVoiceName(BinauralTranslationActivity.this.getMRightLanguage().getTtsViuceName());
                        } else {
                            aISpeech2.setLanguageModel(1);
                            aISpeech2.setLang(BinauralTranslationActivity.this.getMRightLanguage().getRtasrLanguage());
                            aISpeech2.setTargetLang(BinauralTranslationActivity.this.getMLeftLanguage().getRtasrLanguage());
                            aISpeech2.setTtsVoiceName(BinauralTranslationActivity.this.getMLeftLanguage().getTtsViuceName());
                        }
                        if (i4 > 0) {
                            ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).setStartTime(((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4 - 1)).getEndTime());
                        } else {
                            aISpeech2.setStartTime(0L);
                        }
                        ((AISpeech) BinauralTranslationActivity.this.aiSpeechList.get(i4)).setEndTime(System.currentTimeMillis() - BinauralTranslationActivity.this.getStartTime());
                        i1o0oxo1o2.OXO1(BinauralTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults aiSpeechList " + BinauralTranslationActivity.this.aiSpeechList);
                        BinauralTranslationActivity binauralTranslationActivity2 = BinauralTranslationActivity.this;
                        binauralTranslationActivity2.binauralSendTranslationResultInput((AISpeech) binauralTranslationActivity2.aiSpeechList.get(i4), i4);
                    }
                    i4 = i5;
                }
            }
            MultiItemTypeAdapter multiItemTypeAdapter = BinauralTranslationActivity.this.mAdapter;
            if (multiItemTypeAdapter == null) {
                Intrinsics.XXO("mAdapter");
                multiItemTypeAdapter = null;
            }
            multiItemTypeAdapter.notifyDataSetChanged();
            Handler mHandler = BinauralTranslationActivity.this.getMHandler();
            final BinauralTranslationActivity binauralTranslationActivity3 = BinauralTranslationActivity.this;
            mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O110X
                @Override // java.lang.Runnable
                public final void run() {
                    BinauralTranslationActivity.OXO1.O00(binauralTranslationActivity3);
                }
            }, 50L);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(BinauralTranslationActivity.this.TAG + " onStartTransmission ");
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStopTransmission() {
        }
    }

    public BinauralTranslationActivity() {
        setMAIRecordsType(2);
        this.binauralMicrosoftCallBack = new OXO1();
        this.mVoiceType = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addVoiceListener$lambda$0(BinauralTranslationActivity binauralTranslationActivity, int i, int i2, int i3) {
        if (i2 == 0) {
            if (binauralTranslationActivity.mVoiceType == 0) {
                return true;
            }
            binauralTranslationActivity.mVoiceType = i2;
            VoiceManager.INSTANCE.setLanguageType(binauralTranslationActivity.getArsLanguage(), binauralTranslationActivity.getTtsVoiceName());
            binauralTranslationActivity.startVoice();
            return true;
        }
        if (i2 == 2) {
            if (binauralTranslationActivity.mVoiceType != 0) {
                return true;
            }
            binauralTranslationActivity.mVoiceType = i2;
            binauralTranslationActivity.endVoice();
            return true;
        }
        if (i2 != 3 || binauralTranslationActivity.mVoiceType != 0) {
            return true;
        }
        binauralTranslationActivity.mVoiceType = i2;
        binauralTranslationActivity.endVoice();
        MicrosoftSDKManage.O1O.OXO1().I0i0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void binauralSendTranslationResultInput(final AISpeech aISpeech, int i) {
        String text;
        setStartAnalysis(false);
        setMRecyclerViewAutoRefresh(true);
        if (aISpeech == null || (text = aISpeech.getText()) == null || text.length() <= 0 || Intrinsics.XOO0ii0(aISpeech.getText(), getString(R.string.request_error))) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " binauralSendTranslationResultInput ===> str = " + aISpeech.getText() + " , targetLang = " + aISpeech.getTargetLang());
        MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
        xIi00iiXO.OXO1().IXI();
        xIi00iiXO.OXO1().m38826OI(aISpeech.getText(), aISpeech.getTargetLang(), new Function1() { // from class: com.android.mltcode.paycertificationapi.iiIOX110O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BinauralTranslationActivity.binauralSendTranslationResultInput$lambda$0(aISpeech, this, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit binauralSendTranslationResultInput$lambda$0(AISpeech aISpeech, final BinauralTranslationActivity binauralTranslationActivity, String it) {
        Intrinsics.X0O(it, "it");
        aISpeech.setDst(StringsKt__StringsKt.iX1X1(it).toString());
        i1O0OXO1O.OXO1.OXO1(binauralTranslationActivity.TAG + " binauralSendTranslationResultInput ===> str = " + aISpeech.getText() + " " + aISpeech.getDst());
        binauralTranslationActivity.getMHandler().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XOX1Xi
            @Override // java.lang.Runnable
            public final void run() {
                BinauralTranslationActivity.binauralSendTranslationResultInput$lambda$0$0(this.f4854IO);
            }
        });
        MicrosoftSDKManage.X11iII1O1(MicrosoftSDKManage.O1O.OXO1(), aISpeech.getDst(), aISpeech.getTtsVoiceName(), aISpeech.getLanguageModel() == 0 ? LeftAndRightPlayControl.RIGHT : LeftAndRightPlayControl.LEFT, 0, 8, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void binauralSendTranslationResultInput$lambda$0$0(final BinauralTranslationActivity binauralTranslationActivity) {
        MultiItemTypeAdapter<AISpeech> multiItemTypeAdapter = binauralTranslationActivity.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.notifyDataSetChanged();
        binauralTranslationActivity.getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iOI010
            @Override // java.lang.Runnable
            public final void run() {
                BinauralTranslationActivity.binauralSendTranslationResultInput$lambda$0$0$0(this.f8056IO);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void binauralSendTranslationResultInput$lambda$0$0$0(BinauralTranslationActivity binauralTranslationActivity) {
        if (binauralTranslationActivity.aiSpeechList.size() > 0) {
            binauralTranslationActivity.getRv().smoothScrollToPosition(binauralTranslationActivity.aiSpeechList.size() - 1);
        }
    }

    private final void clickDownRecording() {
        if (PermissionUtils.isGranted(PermissionConstants.MICROPHONE)) {
            startRecordingBinaural();
        } else {
            permission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endVoice$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        ToastUtils.showShort(binauralTranslationActivity.getString(R.string.not_record_data), new Object[0]);
    }

    private final ImageView getImg_change_big() {
        return (ImageView) this.img_change_big$delegate.getValue();
    }

    private final ImageView getImg_play() {
        return (ImageView) this.img_play$delegate.getValue();
    }

    private final ImageView getImg_recording_status() {
        return (ImageView) this.img_recording_status$delegate.getValue();
    }

    private final LinearLayout getLl_left_language() {
        return (LinearLayout) this.ll_left_language$delegate.getValue();
    }

    private final LinearLayout getLl_right_language() {
        return (LinearLayout) this.ll_right_language$delegate.getValue();
    }

    private final LinearLayout getLl_top_select_language() {
        return (LinearLayout) this.ll_top_select_language$delegate.getValue();
    }

    private final WaveformView getRecord_line() {
        return (WaveformView) this.record_line$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRv() {
        return (RecyclerView) this.rv$delegate.getValue();
    }

    private final TextView getTv_left_select_language() {
        return (TextView) this.tv_left_select_language$delegate.getValue();
    }

    private final TextView getTv_right_select_language() {
        return (TextView) this.tv_right_select_language$delegate.getValue();
    }

    private final TextView getTv_time() {
        return (TextView) this.tv_time$delegate.getValue();
    }

    private final TextView getTv_tip() {
        return (TextView) this.tv_tip$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_change_big_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (ImageView) binauralTranslationActivity.findViewById(R.id.img_change_big);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_play_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (ImageView) binauralTranslationActivity.findViewById(R.id.img_play);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_recording_status_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (ImageView) binauralTranslationActivity.findViewById(R.id.img_recording_status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRecord$lambda$0(BinauralTranslationActivity binauralTranslationActivity, View view) {
        if (RecordingManager.Companion.getInstance().isRecording()) {
            binauralTranslationActivity.endVoice();
        } else {
            binauralTranslationActivity.startVoice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout ll_left_language_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (LinearLayout) binauralTranslationActivity.findViewById(R.id.ll_left_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout ll_right_language_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (LinearLayout) binauralTranslationActivity.findViewById(R.id.ll_right_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout ll_top_select_language_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (LinearLayout) binauralTranslationActivity.findViewById(R.id.ll_top_select_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit permission$lambda$0(BinauralTranslationActivity binauralTranslationActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            binauralTranslationActivity.startRecordingBinaural();
        }
        return Unit.OXO1;
    }

    private final void preConnect() {
        MicrosoftSDKManage.iiII(MicrosoftSDKManage.O1O.OXO1(), getArsLanguage(), true, getTtsVoiceName(), getTtsTargetLang(), false, null, CollectionsKt__CollectionsKt.Ii1iii0(getMLeftLanguage().getAsrLanguage(), getMRightLanguage().getAsrLanguage()), false, 160, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaveformView record_line_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (WaveformView) binauralTranslationActivity.findViewById(R.id.record_line);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return binauralTranslationActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (RecyclerView) binauralTranslationActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTranslationTipPopup() {
        if (this.popTip == null) {
            z16 z16Var = new z16(this);
            z16Var.X1IX(Boolean.valueOf(a01.OXO1.OXO1().getBoolean(b01.O0i, false)));
            z16Var.m3361iX().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.IiOiOI0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    BinauralTranslationActivity.showTranslationTipPopup$lambda$0$0(compoundButton, z);
                }
            });
            z16Var.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IOX1X1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BinauralTranslationActivity.showTranslationTipPopup$lambda$0$1(this.f1863IO, view);
                }
            });
            this.popTip = z16Var;
        }
        z16 z16Var2 = this.popTip;
        if (z16Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            z16Var2.XiOIO(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTranslationTipPopup$lambda$0$0(CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        LogUtils.m11128d("isChecked = " + z);
        a01.OXO1.OXO1().put(b01.O0i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTranslationTipPopup$lambda$0$1(BinauralTranslationActivity binauralTranslationActivity, View view) {
        String str;
        q62 q62Var = q62.OXO1;
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            str = "2";
        } else {
            str = q62Var.X0100I() ? "3" : "1";
        }
        int iM38573iO = WebViewActivity.Companion.m38573iO();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/videoPlayer/?type=" + str + "&id=1");
        bundle.putInt("mArg1", iM38573iO);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(binauralTranslationActivity, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        binauralTranslationActivity.startActivity(intent);
    }

    private final void startRecordingBinaural() {
        if (q62.OXO1.X11I()) {
            MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
            MicrosoftSDKManage.i100IXOX(xIi00iiXO.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
            MicrosoftSDKManage.iIi0(xIi00iiXO.OXO1(), false, 1, null);
        }
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        showCountdownPopup(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRotateAnimation$lambda$0(RotateAnimation rotateAnimation, RotateAnimation rotateAnimation2, BinauralTranslationActivity binauralTranslationActivity) {
        rotateAnimation.cancel();
        rotateAnimation2.cancel();
        binauralTranslationActivity.getMTransformLanguageImg().clearAnimation();
        binauralTranslationActivity.getImg_change_big().clearAnimation();
        binauralTranslationActivity.setSwitchRotateAnimation(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startVoice$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        binauralTranslationActivity.aiSpeechList.clear();
        OIXO1IIOO.iIX0i(binauralTranslationActivity.aiSpeechList, new Function1() { // from class: com.android.mltcode.paycertificationapi.i11X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(BinauralTranslationActivity.startVoice$lambda$0$0((AISpeech) obj));
            }
        });
        MultiItemTypeAdapter<AISpeech> multiItemTypeAdapter = binauralTranslationActivity.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean startVoice$lambda$0$0(AISpeech it) {
        Intrinsics.X0O(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_left_select_language_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (TextView) binauralTranslationActivity.findViewById(R.id.tv_left_select_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_right_select_language_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (TextView) binauralTranslationActivity.findViewById(R.id.tv_right_select_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_time_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (TextView) binauralTranslationActivity.findViewById(R.id.tv_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_tip_delegate$lambda$0(BinauralTranslationActivity binauralTranslationActivity) {
        return (TextView) binauralTranslationActivity.findViewById(R.id.tv_tip);
    }

    public final void addVoiceListener() {
        VoiceManager.INSTANCE.setMListener(new Function3() { // from class: com.android.mltcode.paycertificationapi.IXOOOIX0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(BinauralTranslationActivity.addVoiceListener$lambda$0(this.f2066IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
            }
        });
    }

    public final void binauralStopRecording() {
        if (!q62.OXO1.X11I()) {
            RecordingManager.Companion.getInstance().stopRecording();
        } else {
            closeBluetooth();
            MicrosoftSDKManage.O1O.OXO1().XOIO11O();
        }
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void countdownEnd() {
        super.countdownEnd();
        RecordingManager.Companion companion = RecordingManager.Companion;
        if (companion.getInstance().isRecording()) {
            setStartTime(System.currentTimeMillis());
            getImg_recording_status().setVisibility(0);
            getRecord_line().setVisibility(8);
            companion.getInstance().setRecording(true);
            Glide.with(getMContext()).asGif().load(Integer.valueOf(R.drawable.pop_recording_animation_img)).into(getImg_recording_status());
            setElapsedTime(0L);
            getMHandler().postDelayed(getRunnable(), getUpdateInterval());
        }
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
        setElapsedTime(0L);
        updateTimerText();
        finish();
        if (this.aiSpeechList.size() <= 0) {
            getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OI0IIii
                @Override // java.lang.Runnable
                public final void run() {
                    BinauralTranslationActivity.endVoice$lambda$0(this.f2877IO);
                }
            }, 500L);
            return;
        }
        ArrayList<AISpeech> arrayList = this.aiSpeechList;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", arrayList);
        Intent intent = new Intent(this, (Class<?>) BinauralTranslationRecordActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @aa1
    public final MicrosoftSDKManage.InterfaceC19048iO getBinauralMicrosoftCallBack() {
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
        return (View) this.rootView$delegate.getValue();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public final void initRecord() {
        getImg_play().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X1XX01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BinauralTranslationActivity.initRecord$lambda$0(this.f4351IO, view);
            }
        });
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setLangAndVoice();
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I()) {
            preConnect();
        }
        a01 a01Var = a01.OXO1;
        a01Var.OXO1().put(b01.iIXX0i, true);
        this.mAdapter = new MultiItemTypeAdapter<AISpeech>(this, this.aiSpeechList) { // from class: com.sma.smartv3.otherdevice.charge.BinauralTranslationActivity.initView.1

            /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.BinauralTranslationActivity$initView$1$OXO1 */
            public static final class OXO1 implements InterfaceC2572jc<AISpeech> {
                public static final void IiI10X(AISpeech aISpeech, View view) {
                    MicrosoftSDKManage.X11iII1O1(MicrosoftSDKManage.O1O.OXO1(), aISpeech.getDst(), aISpeech.getTtsVoiceName(), aISpeech.getLanguageModel() == 0 ? LeftAndRightPlayControl.RIGHT : LeftAndRightPlayControl.LEFT, 0, 8, null);
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, final AISpeech mAISpeech, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAISpeech, "mAISpeech");
                    TextView textView = (TextView) holder.getView(R.id.tv_original);
                    TextView textView2 = (TextView) holder.getView(R.id.tv_translated);
                    textView.setText(mAISpeech.getText());
                    textView2.setText(mAISpeech.getDst());
                    if (mAISpeech.getDst().length() > 0) {
                        holder.setVisible(R.id.iv_play, true);
                    } else {
                        holder.setVisible(R.id.iv_play, false);
                    }
                    holder.setOnClickListener(R.id.translated_play_ll, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X1IO0i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BinauralTranslationActivity.C186271.OXO1.IiI10X(mAISpeech, view);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_binaural_left;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AISpeech aISpeech, int i) {
                    return aISpeech != null && aISpeech.getLanguageModel() == 0;
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.BinauralTranslationActivity$initView$1$XIi00iiXO */
            public static final class XIi00iiXO implements InterfaceC2572jc<AISpeech> {
                /* JADX INFO: Access modifiers changed from: private */
                public static final void IiI10X(AISpeech aISpeech, View view) {
                    MicrosoftSDKManage.X11iII1O1(MicrosoftSDKManage.O1O.OXO1(), aISpeech.getDst(), aISpeech.getTtsVoiceName(), aISpeech.getLanguageModel() == 0 ? LeftAndRightPlayControl.RIGHT : LeftAndRightPlayControl.LEFT, 0, 8, null);
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, final AISpeech mAISpeech, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAISpeech, "mAISpeech");
                    TextView textView = (TextView) holder.getView(R.id.tv_original);
                    TextView textView2 = (TextView) holder.getView(R.id.tv_translated);
                    textView.setText(mAISpeech.getText());
                    textView2.setText(mAISpeech.getDst());
                    if (mAISpeech.getDst().length() > 0) {
                        holder.setVisible(R.id.iv_play, true);
                    } else {
                        holder.setVisible(R.id.iv_play, false);
                    }
                    holder.setOnClickListener(R.id.translated_play_ll, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IOi0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BinauralTranslationActivity.C186271.XIi00iiXO.IiI10X(mAISpeech, view);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_binaural_right;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AISpeech aISpeech, int i) {
                    return aISpeech != null && aISpeech.getLanguageModel() == 1;
                }
            }

            {
                addItemViewDelegate(0, new OXO1());
                addItemViewDelegate(1, new XIi00iiXO());
            }
        };
        getRv().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView rv = getRv();
        MultiItemTypeAdapter<AISpeech> multiItemTypeAdapter = this.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        rv.setAdapter(multiItemTypeAdapter);
        getMTransformLanguageImg().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X101iII
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4136IO.startRotateAnimation();
            }
        });
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        getTv_left_select_language().setText(getMLeftLanguage().getName());
        getTv_right_select_language().setText(getMRightLanguage().getName());
        VoiceManager.INSTANCE.setActivityData(true);
        if (q62Var.X11I()) {
            MicrosoftSDKManage.i100IXOX(MicrosoftSDKManage.O1O.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
        }
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iOXiI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8174IO.showTranslationTipPopup();
            }
        });
        getAbhTitleCenter().setVisibility(8);
        if (!a01Var.OXO1().getBoolean(b01.O0i, false)) {
            getRootView().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XOOi1I0I1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4833IO.showTranslationTipPopup();
                }
            });
        }
        getImg_change_big().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XX1XXXi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5005IO.startRotateAnimation();
            }
        });
        initRecord();
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            addVoiceListener();
        }
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_binaural_translation;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 0) {
                Serializable serializableExtra = intent != null ? intent.getSerializableExtra("language") : null;
                Intrinsics.X1ii(serializableExtra, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
                LanguageTranslationData languageTranslationData = (LanguageTranslationData) serializableExtra;
                if (Intrinsics.XOO0ii0(languageTranslationData.getName(), getMRightLanguage().getName())) {
                    setSwitchRotateAnimation(true);
                    startRotateAnimation();
                    return;
                }
                setMLeftLanguage(languageTranslationData);
                getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
                getTv_left_select_language().setText(getMLeftLanguage().getName());
                a01.OXO1.m1440iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
                I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
                return;
            }
            if (i != 1) {
                return;
            }
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("language") : null;
            Intrinsics.X1ii(serializableExtra2, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
            LanguageTranslationData languageTranslationData2 = (LanguageTranslationData) serializableExtra2;
            if (Intrinsics.XOO0ii0(getMLeftLanguage().getName(), languageTranslationData2.getName())) {
                setSwitchRotateAnimation(true);
                startRotateAnimation();
                return;
            }
            setMRightLanguage(languageTranslationData2);
            getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
            getTv_right_select_language().setText(getMRightLanguage().getName());
            a01.OXO1.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
            I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        }
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
    public final void onLanguageChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onLanguageChange event = " + data);
        setLangAndVoice();
        if (q62.OXO1.X11I()) {
            preConnect();
        }
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void onTranslationLanguage(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (RecordingManager.Companion.getInstance().isRecording()) {
            ToastUtils.showLong(getString(R.string.recording_tip), new Object[0]);
        }
        switch (view.getId()) {
            case R.id.dialogue_translation_left_tv /* 2131362573 */:
            case R.id.ll_left_language /* 2131363583 */:
                LanguageTranslationData mLeftLanguage = getMLeftLanguage();
                Bundle bundle = new Bundle();
                bundle.putString("mArg0", null);
                bundle.putParcelable("mArg2", null);
                bundle.putSerializable("mArg3", mLeftLanguage);
                Intent intent = new Intent(this, (Class<?>) ChooseLanguageActivity.class);
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                break;
            case R.id.dialogue_translation_right_tv /* 2131362574 */:
            case R.id.ll_right_language /* 2131363609 */:
                LanguageTranslationData mRightLanguage = getMRightLanguage();
                Bundle bundle2 = new Bundle();
                bundle2.putString("mArg0", null);
                bundle2.putParcelable("mArg2", null);
                bundle2.putSerializable("mArg3", mRightLanguage);
                Intent intent2 = new Intent(this, (Class<?>) ChooseLanguageActivity.class);
                intent2.putExtras(bundle2);
                startActivityForResult(intent2, 1);
                break;
        }
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void permission() {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.MICROPHONE);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        String string = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String string2 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.XOO10X1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BinauralTranslationActivity.permission$lambda$0(this.f4800IO, (PermissionStatus) obj);
            }
        });
    }

    public final void setMVoiceType(int i) {
        this.mVoiceType = i;
    }

    public final void setPopTip(@tb1 z16 z16Var) {
        this.popTip = z16Var;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRotateAnimation() {
        if (getSwitchRotateAnimation()) {
            getMTransformLanguageImg().clearAnimation();
            getImg_change_big().clearAnimation();
            CharSequence text = getMTransformLanguageLeftTv().getText();
            CharSequence text2 = getMTransformLanguageRightTv().getText();
            final RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(500L);
            rotateAnimation.setRepeatCount(-1);
            setSwitchRotateAnimation(false);
            getMTransformLanguageImg().startAnimation(rotateAnimation);
            final RotateAnimation rotateAnimation2 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation2.setDuration(500L);
            rotateAnimation2.setRepeatCount(-1);
            getImg_change_big().startAnimation(rotateAnimation2);
            getMTransformLanguageLeftTv().setText(text2);
            getMTransformLanguageRightTv().setText(text);
            getTv_left_select_language().setText(text2);
            getTv_right_select_language().setText(text);
            setMCacheLanguage(getMLeftLanguage());
            setMLeftLanguage(getMRightLanguage());
            LanguageTranslationData mCacheLanguage = getMCacheLanguage();
            Intrinsics.XXI(mCacheLanguage);
            setMRightLanguage(mCacheLanguage);
            a01 a01Var = a01.OXO1;
            a01Var.m1440iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
            a01Var.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
            I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
            getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iI001
                @Override // java.lang.Runnable
                public final void run() {
                    BinauralTranslationActivity.startRotateAnimation$lambda$0(rotateAnimation, rotateAnimation2, this);
                }
            }, 500L);
        }
    }

    public final void startVoice() {
        RecordingManager.Companion.getInstance().setRecording(true);
        getLl_top_select_language().setVisibility(8);
        getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O0OOOOI
            @Override // java.lang.Runnable
            public final void run() {
                BinauralTranslationActivity.startVoice$lambda$0(this.f2507IO);
            }
        }, 500L);
        getImg_play().setImageResource(R.drawable.ic_binaural_stop);
        getTv_tip().setText(R.string.click_stop_recording);
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        setLangAndVoice();
        clickDownRecording();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void updateTimerText() {
        long elapsedTime = getElapsedTime();
        long j = TimeConstants.HOUR;
        int i = (int) (elapsedTime / j);
        long j2 = 60000;
        int elapsedTime2 = (int) ((getElapsedTime() % j) / j2);
        int elapsedTime3 = (int) ((getElapsedTime() % j2) / ((long) 1000));
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(elapsedTime2), Integer.valueOf(elapsedTime3)}, 3));
        Intrinsics.O10IXXX0X(str, "format(...)");
        getTv_time().setText(str);
    }
}
