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
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
import com.google.gson.Gson;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LeftAndRightPlayControl;
import com.sma.smartv3.otherdevice.charge.NewSimultaneousInterpretationActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNewSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,654:1\n87#2,7:655\n94#2,3:663\n70#2,7:666\n97#2:673\n173#2,7:680\n180#2,3:688\n143#2,7:691\n183#2:698\n173#2,7:699\n180#2,3:707\n143#2,7:710\n183#2:717\n87#2,7:724\n94#2,3:732\n70#2,7:735\n97#2:742\n1#3:662\n1#3:687\n1#3:706\n1#3:731\n85#4,3:674\n85#4,3:677\n85#4,3:718\n85#4,3:721\n*S KotlinDebug\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity\n*L\n390#1:655,7\n390#1:663,3\n390#1:666,7\n390#1:673\n563#1:680,7\n563#1:688,3\n563#1:691,7\n563#1:698\n568#1:699,7\n568#1:707,3\n568#1:710,7\n568#1:717\n629#1:724,7\n629#1:732,3\n629#1:735,7\n629#1:742\n390#1:662\n563#1:687\n568#1:706\n629#1:731\n424#1:674,3\n425#1:677,3\n582#1:718,3\n596#1:721,3\n*E\n"})
public final class NewSimultaneousInterpretationActivity extends BaseTranslationActivity {

    @aa1
    private final MicrosoftSDKManage.InterfaceC19048iO binauralMicrosoftCallBack;
    private MultiItemTypeAdapter<AISpeech> mAdapter;

    @tb1
    private AnimationDrawable mAnimationDrawable;
    private int mVoiceType;

    @tb1
    private z16 popTip;

    @aa1
    private final String TAG = "BinauralTranslationActivity";

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u61
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NewSimultaneousInterpretationActivity.rootView_delegate$lambda$0(this.f11430IO);
        }
    });

    @aa1
    private final Lazy tv_time$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.v61
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NewSimultaneousInterpretationActivity.tv_time_delegate$lambda$0(this.f11653IO);
        }
    });

    @aa1
    private final Lazy img_recording_status$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.w61
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NewSimultaneousInterpretationActivity.img_recording_status_delegate$lambda$0(this.f11893IO);
        }
    });

    @aa1
    private final Lazy img_play$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.x61
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NewSimultaneousInterpretationActivity.img_play_delegate$lambda$0(this.f12116IO);
        }
    });

    @aa1
    private final Lazy record_line$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y61
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NewSimultaneousInterpretationActivity.record_line_delegate$lambda$0(this.f12320IO);
        }
    });

    @aa1
    private final Lazy img_broadcast$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z61
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NewSimultaneousInterpretationActivity.img_broadcast_delegate$lambda$0(this.f12547IO);
        }
    });

    @aa1
    private final Lazy img_direction$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a71
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NewSimultaneousInterpretationActivity.img_direction_delegate$lambda$0(this.f5433IO);
        }
    });

    @aa1
    private final Lazy img_Left$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b71
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NewSimultaneousInterpretationActivity.img_Left_delegate$lambda$0(this.f5680IO);
        }
    });

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c71
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NewSimultaneousInterpretationActivity.rv_delegate$lambda$0(this.f5921IO);
        }
    });

    @aa1
    private ArrayList<AISpeech> aiSpeechList = new ArrayList<>();
    private boolean isCanBroadCast = true;

    @SourceDebugExtension({"SMAP\nNewSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$binauralMicrosoftCallBack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,654:1\n1563#2:655\n1634#2,3:656\n774#2:659\n865#2,2:660\n1563#2:662\n1634#2,3:663\n774#2:666\n865#2,2:667\n*S KotlinDebug\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$binauralMicrosoftCallBack$1\n*L\n111#1:655\n111#1:656,3\n112#1:659\n112#1:660,2\n160#1:662\n160#1:663,3\n161#1:666\n161#1:667,2\n*E\n"})
    public static final class OXO1 implements MicrosoftSDKManage.InterfaceC19048iO {
        public long OXO1;

        public OXO1() {
        }

        public static final void XO0O10(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
            if (newSimultaneousInterpretationActivity.aiSpeechList.size() > 0) {
                newSimultaneousInterpretationActivity.getRv().smoothScrollToPosition(newSimultaneousInterpretationActivity.aiSpeechList.size() - 1);
            }
        }

        public final void O00(long j) {
            this.OXO1 = j;
        }

        /* JADX INFO: renamed from: iO */
        public final long m38280iO() {
            return this.OXO1;
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onIdentifyResults(int i, String str) {
            Intrinsics.X0O(str, "str");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(NewSimultaneousInterpretationActivity.this.TAG + "  sendTranslate  onIdentifyResults status = " + i + " content = " + str + " ");
            int i2 = 0;
            if (i == 1) {
                i1o0oxo1o.OXO1(NewSimultaneousInterpretationActivity.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
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
                i1O0OXO1O.OXO1.OXO1(NewSimultaneousInterpretationActivity.this.TAG + "  sendTranslate  onIdentifyResults parts = " + arrayList2);
                int size = arrayList2.size();
                while (i2 < size) {
                    int i3 = i2 + 1;
                    if (NewSimultaneousInterpretationActivity.this.aiSpeechList.size() < i3) {
                        NewSimultaneousInterpretationActivity.this.aiSpeechList.add(new AISpeech((String) arrayList2.get(i2), null, 1, 0, null, null, null, this.OXO1, 0L, 378, null));
                    }
                    if (NewSimultaneousInterpretationActivity.this.aiSpeechList.size() == i3) {
                        ((AISpeech) NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i2)).setText((String) arrayList2.get(i2));
                    }
                    i2 = i3;
                }
            } else if (i == 2) {
                i1o0oxo1o.OXO1(NewSimultaneousInterpretationActivity.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
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
                i1O0OXO1O.OXO1.OXO1(NewSimultaneousInterpretationActivity.this.TAG + "  sendTranslate  onIdentifyResults parts = " + arrayList4);
                int size2 = arrayList4.size();
                int i4 = 0;
                while (i4 < size2) {
                    int i5 = i4 + 1;
                    if (NewSimultaneousInterpretationActivity.this.aiSpeechList.size() < i5) {
                        AISpeech aISpeech = new AISpeech((String) arrayList4.get(i4), null, 2, 0, null, null, null, 0L, 0L, 506, null);
                        aISpeech.setLanguageModel(0);
                        aISpeech.setLang(NewSimultaneousInterpretationActivity.this.getMLeftLanguage().getRtasrLanguage());
                        aISpeech.setTargetLang(NewSimultaneousInterpretationActivity.this.getMLeftLanguage().getRtasrLanguage());
                        aISpeech.setTtsVoiceName(NewSimultaneousInterpretationActivity.this.getMLeftLanguage().getTtsViuceName());
                        NewSimultaneousInterpretationActivity.this.aiSpeechList.add(aISpeech);
                        if (i4 > 0) {
                            ((AISpeech) NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i4)).setStartTime(((AISpeech) NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i4 - 1)).getEndTime());
                        } else {
                            aISpeech.setStartTime(this.OXO1);
                        }
                        ((AISpeech) NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i4)).setEndTime(System.currentTimeMillis());
                        NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity = NewSimultaneousInterpretationActivity.this;
                        newSimultaneousInterpretationActivity.binauralSendTranslationResultInput((AISpeech) newSimultaneousInterpretationActivity.aiSpeechList.get(i4), i4);
                    }
                    if (NewSimultaneousInterpretationActivity.this.aiSpeechList.size() == i5 && ((AISpeech) NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i4)).getStatus() == 1) {
                        i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
                        i1o0oxo1o2.OXO1(NewSimultaneousInterpretationActivity.this.TAG + "  sendTranslate  onIdentifyResults istrue = " + (NewSimultaneousInterpretationActivity.this.aiSpeechList.size() == i5 && ((AISpeech) NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i4)).getStatus() == 1));
                        Object obj3 = NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i4);
                        Intrinsics.O10IXXX0X(obj3, "get(...)");
                        AISpeech aISpeech2 = (AISpeech) obj3;
                        aISpeech2.setText((String) arrayList4.get(i4));
                        aISpeech2.setStatus(2);
                        aISpeech2.setLanguageModel(0);
                        aISpeech2.setLang(NewSimultaneousInterpretationActivity.this.getMLeftLanguage().getRtasrLanguage());
                        aISpeech2.setTargetLang(NewSimultaneousInterpretationActivity.this.getMLeftLanguage().getRtasrLanguage());
                        aISpeech2.setTtsVoiceName(NewSimultaneousInterpretationActivity.this.getMLeftLanguage().getTtsViuceName());
                        if (i4 > 0) {
                            ((AISpeech) NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i4)).setStartTime(((AISpeech) NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i4 - 1)).getEndTime());
                        } else {
                            aISpeech2.setStartTime(this.OXO1);
                        }
                        ((AISpeech) NewSimultaneousInterpretationActivity.this.aiSpeechList.get(i4)).setEndTime(System.currentTimeMillis() - NewSimultaneousInterpretationActivity.this.getStartTime());
                        i1o0oxo1o2.OXO1(NewSimultaneousInterpretationActivity.this.TAG + "  sendTranslate  onIdentifyResults aiSpeechList " + NewSimultaneousInterpretationActivity.this.aiSpeechList);
                        NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity2 = NewSimultaneousInterpretationActivity.this;
                        newSimultaneousInterpretationActivity2.binauralSendTranslationResultInput((AISpeech) newSimultaneousInterpretationActivity2.aiSpeechList.get(i4), i4);
                    }
                    i4 = i5;
                }
            }
            MultiItemTypeAdapter multiItemTypeAdapter = NewSimultaneousInterpretationActivity.this.mAdapter;
            if (multiItemTypeAdapter == null) {
                Intrinsics.XXO("mAdapter");
                multiItemTypeAdapter = null;
            }
            multiItemTypeAdapter.notifyDataSetChanged();
            Handler mHandler = NewSimultaneousInterpretationActivity.this.getMHandler();
            final NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity3 = NewSimultaneousInterpretationActivity.this;
            mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.s71
                @Override // java.lang.Runnable
                public final void run() {
                    NewSimultaneousInterpretationActivity.OXO1.XO0O10(newSimultaneousInterpretationActivity3);
                }
            }, 50L);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onIdentifyResultsDetectedLanguage(int i, String str, String detectedLanguage) {
            Intrinsics.X0O(str, "str");
            Intrinsics.X0O(detectedLanguage, "detectedLanguage");
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(NewSimultaneousInterpretationActivity.this.TAG + " onStartTransmission ");
            this.OXO1 = System.currentTimeMillis();
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStopTransmission() {
        }
    }

    public NewSimultaneousInterpretationActivity() {
        setMAIRecordsType(1);
        this.binauralMicrosoftCallBack = new OXO1();
        this.mVoiceType = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addVoiceListener$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity, int i, int i2, int i3) {
        if (i2 == 0) {
            if (newSimultaneousInterpretationActivity.mVoiceType == 0) {
                return true;
            }
            newSimultaneousInterpretationActivity.mVoiceType = i2;
            VoiceManager.INSTANCE.setLanguageType(newSimultaneousInterpretationActivity.getArsLanguage(), newSimultaneousInterpretationActivity.getTtsVoiceName());
            newSimultaneousInterpretationActivity.startVoice();
            return true;
        }
        if (i2 == 2) {
            if (newSimultaneousInterpretationActivity.mVoiceType != 0) {
                return true;
            }
            newSimultaneousInterpretationActivity.mVoiceType = i2;
            newSimultaneousInterpretationActivity.endVoice();
            return true;
        }
        if (i2 != 3 || newSimultaneousInterpretationActivity.mVoiceType != 0) {
            return true;
        }
        newSimultaneousInterpretationActivity.mVoiceType = i2;
        newSimultaneousInterpretationActivity.endVoice();
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
        i1O0OXO1O.OXO1.OXO1(this.TAG + " binauralSendTranslationResultInput ===> str = " + aISpeech.getText() + " , targetLang = " + getTargetLang());
        MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
        xIi00iiXO.OXO1().IXI();
        xIi00iiXO.OXO1().m38826OI(aISpeech.getText(), aISpeech.getTargetLang(), new Function1() { // from class: com.android.mltcode.paycertificationapi.d71
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NewSimultaneousInterpretationActivity.binauralSendTranslationResultInput$lambda$0(aISpeech, this, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit binauralSendTranslationResultInput$lambda$0(AISpeech aISpeech, final NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity, String it) {
        Intrinsics.X0O(it, "it");
        aISpeech.setDst(StringsKt__StringsKt.iX1X1(it).toString());
        i1O0OXO1O.OXO1.OXO1(newSimultaneousInterpretationActivity.TAG + " binauralSendTranslationResultInput ===> str = " + aISpeech.getText() + " " + aISpeech.getDst());
        newSimultaneousInterpretationActivity.getMHandler().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.p71
            @Override // java.lang.Runnable
            public final void run() {
                NewSimultaneousInterpretationActivity.binauralSendTranslationResultInput$lambda$0$0(this.f10303IO);
            }
        });
        if (newSimultaneousInterpretationActivity.isCanBroadCast) {
            MicrosoftSDKManage.X11iII1O1(MicrosoftSDKManage.O1O.OXO1(), aISpeech.getDst(), aISpeech.getTtsVoiceName(), LeftAndRightPlayControl.LEFT_AND_RIGHT, 0, 8, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void binauralSendTranslationResultInput$lambda$0$0(final NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        MultiItemTypeAdapter<AISpeech> multiItemTypeAdapter = newSimultaneousInterpretationActivity.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.notifyDataSetChanged();
        newSimultaneousInterpretationActivity.getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.j71
            @Override // java.lang.Runnable
            public final void run() {
                NewSimultaneousInterpretationActivity.binauralSendTranslationResultInput$lambda$0$0$0(this.f8896IO);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void binauralSendTranslationResultInput$lambda$0$0$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        if (newSimultaneousInterpretationActivity.aiSpeechList.size() > 0) {
            newSimultaneousInterpretationActivity.getRv().smoothScrollToPosition(newSimultaneousInterpretationActivity.aiSpeechList.size() - 1);
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
    public static final void endVoice$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        ToastUtils.showShort(newSimultaneousInterpretationActivity.getString(R.string.not_record_data), new Object[0]);
    }

    private final ImageView getImg_Left() {
        return (ImageView) this.img_Left$delegate.getValue();
    }

    private final ImageView getImg_broadcast() {
        return (ImageView) this.img_broadcast$delegate.getValue();
    }

    private final ImageView getImg_direction() {
        return (ImageView) this.img_direction$delegate.getValue();
    }

    private final ImageView getImg_play() {
        return (ImageView) this.img_play$delegate.getValue();
    }

    private final ImageView getImg_recording_status() {
        return (ImageView) this.img_recording_status$delegate.getValue();
    }

    private final WaveformView getRecord_line() {
        return (WaveformView) this.record_line$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRv() {
        return (RecyclerView) this.rv$delegate.getValue();
    }

    private final TextView getTv_time() {
        return (TextView) this.tv_time$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_Left_delegate$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        return (ImageView) newSimultaneousInterpretationActivity.findViewById(R.id.translate_left_iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_broadcast_delegate$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        return (ImageView) newSimultaneousInterpretationActivity.findViewById(R.id.img_broadcast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_direction_delegate$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        return (ImageView) newSimultaneousInterpretationActivity.findViewById(R.id.img_direction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_play_delegate$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        return (ImageView) newSimultaneousInterpretationActivity.findViewById(R.id.img_play);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_recording_status_delegate$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        return (ImageView) newSimultaneousInterpretationActivity.findViewById(R.id.img_recording_status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRecord$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity, View view) {
        if (RecordingManager.Companion.getInstance().isRecording()) {
            newSimultaneousInterpretationActivity.endVoice();
        } else {
            newSimultaneousInterpretationActivity.startVoice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity, View view) {
        if (newSimultaneousInterpretationActivity.isCanBroadCast) {
            newSimultaneousInterpretationActivity.getImg_broadcast().setImageResource(R.drawable.ic_simultan_broadcast_close);
            MicrosoftSDKManage.O1O.OXO1().iX01();
        } else {
            newSimultaneousInterpretationActivity.getImg_broadcast().setImageResource(R.drawable.ic_simultan_broadcast_open);
        }
        newSimultaneousInterpretationActivity.isCanBroadCast = !newSimultaneousInterpretationActivity.isCanBroadCast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit permission$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            newSimultaneousInterpretationActivity.startRecordingBinaural();
        }
        return Unit.OXO1;
    }

    private final void preConnect() {
        MicrosoftSDKManage.iiII(MicrosoftSDKManage.O1O.OXO1(), getArsLanguage(), true, getTtsVoiceName(), getTtsTargetLang(), false, null, CollectionsKt__CollectionsKt.Ii1iii0(getMLeftLanguage().getAsrLanguage(), getMRightLanguage().getAsrLanguage()), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaveformView record_line_delegate$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        return (WaveformView) newSimultaneousInterpretationActivity.findViewById(R.id.record_line);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        return newSimultaneousInterpretationActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_delegate$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        return (RecyclerView) newSimultaneousInterpretationActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTranslationTipPopup() {
        if (this.popTip == null) {
            z16 z16Var = new z16(this);
            z16Var.X11iII1O1(getString(R.string.simultaneous_tip_1));
            z16Var.XXX11i(getString(R.string.simultaneous_tip_2));
            z16Var.XXIIO1i11(Integer.valueOf(R.drawable.ic_simultan_tip));
            z16Var.X1IX(Boolean.valueOf(a01.OXO1.OXO1().getBoolean(b01.X10i, false)));
            z16Var.m3361iX().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.r71
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    NewSimultaneousInterpretationActivity.showTranslationTipPopup$lambda$0$0(compoundButton, z);
                }
            });
            z16Var.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.t61
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NewSimultaneousInterpretationActivity.showTranslationTipPopup$lambda$0$1(this.f11196IO, view);
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
        a01.OXO1.OXO1().put(b01.X10i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTranslationTipPopup$lambda$0$1(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity, View view) {
        String str;
        q62 q62Var = q62.OXO1;
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            str = "2";
        } else {
            str = q62Var.X0100I() ? "3" : "1";
        }
        int iM38573iO = WebViewActivity.Companion.m38573iO();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/videoPlayer/?type=" + str + "&id=2");
        bundle.putInt("mArg1", iM38573iO);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(newSimultaneousInterpretationActivity, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        newSimultaneousInterpretationActivity.startActivity(intent);
    }

    private final void startRecordingBinaural() {
        if (q62.OXO1.X11I()) {
            MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
            MicrosoftSDKManage.i100IXOX(xIi00iiXO.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
            xIi00iiXO.OXO1().m38825I0(false);
        }
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        showCountdownPopup(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRotateAnimation$lambda$0(RotateAnimation rotateAnimation, NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        rotateAnimation.cancel();
        newSimultaneousInterpretationActivity.getMTransformLanguageImg().clearAnimation();
        newSimultaneousInterpretationActivity.setSwitchRotateAnimation(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startVoice$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        newSimultaneousInterpretationActivity.aiSpeechList.clear();
        OIXO1IIOO.iIX0i(newSimultaneousInterpretationActivity.aiSpeechList, new Function1() { // from class: com.android.mltcode.paycertificationapi.o71
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(NewSimultaneousInterpretationActivity.startVoice$lambda$0$0((AISpeech) obj));
            }
        });
        MultiItemTypeAdapter<AISpeech> multiItemTypeAdapter = newSimultaneousInterpretationActivity.mAdapter;
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
    public static final TextView tv_time_delegate$lambda$0(NewSimultaneousInterpretationActivity newSimultaneousInterpretationActivity) {
        return (TextView) newSimultaneousInterpretationActivity.findViewById(R.id.tv_time);
    }

    public final void addVoiceListener() {
        VoiceManager.INSTANCE.setMListener(new Function3() { // from class: com.android.mltcode.paycertificationapi.l71
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(NewSimultaneousInterpretationActivity.addVoiceListener$lambda$0(this.f9368IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
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
        setStartTime(System.currentTimeMillis());
        getImg_recording_status().setVisibility(0);
        getRecord_line().setVisibility(8);
        if (this.mAnimationDrawable == null) {
            Drawable drawable = getResources().getDrawable(R.drawable.audio_play_animation_list);
            Intrinsics.X1ii(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            this.mAnimationDrawable = (AnimationDrawable) drawable;
        }
        getImg_recording_status().setImageDrawable(this.mAnimationDrawable);
        AnimationDrawable animationDrawable = this.mAnimationDrawable;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        setElapsedTime(0L);
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
        setElapsedTime(0L);
        updateTimerText();
        finish();
        if (this.aiSpeechList.size() > 0) {
            ArrayList<AISpeech> arrayList = this.aiSpeechList;
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", null);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", arrayList);
            Intent intent = new Intent(this, (Class<?>) BinauralTranslationRecordActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        } else {
            getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.s61
                @Override // java.lang.Runnable
                public final void run() {
                    NewSimultaneousInterpretationActivity.endVoice$lambda$0(this.f10973IO);
                }
            }, 500L);
        }
        AnimationDrawable animationDrawable = this.mAnimationDrawable;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    @aa1
    public final MicrosoftSDKManage.InterfaceC19048iO getBinauralMicrosoftCallBack() {
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
        return (View) this.rootView$delegate.getValue();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public final void initRecord() {
        getImg_play().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.q71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewSimultaneousInterpretationActivity.initRecord$lambda$0(this.f10547IO, view);
            }
        });
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        int i;
        setLangAndVoice();
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I()) {
            preConnect();
        }
        getImg_direction().setVisibility(0);
        getMTransformLanguageImg().setVisibility(8);
        getImg_direction().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.e71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6348IO.startRotateAnimation();
            }
        });
        ImageView img_Left = getImg_Left();
        if (q62Var.X0100I()) {
            i = R.drawable.ic_left_ear_ring;
        } else {
            i = (q62.OiO0IOX(q62Var, null, 1, null) || !BleConnector.INSTANCE.isBound()) ? R.drawable.ic_left_ear : R.drawable.ic_left_ear_watch;
        }
        img_Left.setBackgroundResource(i);
        a01 a01Var = a01.OXO1;
        a01Var.OXO1().put(b01.iIXX0i, true);
        this.mAdapter = new MultiItemTypeAdapter<AISpeech>(this, this.aiSpeechList) { // from class: com.sma.smartv3.otherdevice.charge.NewSimultaneousInterpretationActivity.initView.2

            /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.NewSimultaneousInterpretationActivity$initView$2$OXO1 */
            public static final class OXO1 implements InterfaceC2572jc<AISpeech> {
                /* JADX INFO: Access modifiers changed from: private */
                public static final void IiI10X(AISpeech aISpeech, View view) {
                    MicrosoftSDKManage.X11iII1O1(MicrosoftSDKManage.O1O.OXO1(), aISpeech.getDst(), aISpeech.getTtsVoiceName(), LeftAndRightPlayControl.LEFT_AND_RIGHT, 0, 8, null);
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
                    holder.setOnClickListener(R.id.translated_play_ll, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.t71
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            NewSimultaneousInterpretationActivity.C186352.OXO1.IiI10X(mAISpeech, view);
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

            /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.NewSimultaneousInterpretationActivity$initView$2$XIi00iiXO */
            public static final class XIi00iiXO implements InterfaceC2572jc<AISpeech> {
                /* JADX INFO: Access modifiers changed from: private */
                public static final void IiI10X(AISpeech aISpeech, View view) {
                    MicrosoftSDKManage.X11iII1O1(MicrosoftSDKManage.O1O.OXO1(), aISpeech.getDst(), aISpeech.getTtsVoiceName(), LeftAndRightPlayControl.LEFT_AND_RIGHT, 0, 8, null);
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
                    holder.setOnClickListener(R.id.translated_play_ll, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.u71
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            NewSimultaneousInterpretationActivity.C186352.XIi00iiXO.IiI10X(mAISpeech, view);
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
        getMTransformLanguageImg().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.f71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6592IO.startRotateAnimation();
            }
        });
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        VoiceManager.INSTANCE.setActivityData(true);
        if (q62Var.X11I()) {
            MicrosoftSDKManage.i100IXOX(MicrosoftSDKManage.O1O.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
        }
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.g71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6824IO.showTranslationTipPopup();
            }
        });
        getAbhTitleCenter().setVisibility(8);
        if (!a01Var.OXO1().getBoolean(b01.X10i, false)) {
            getRootView().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.h71
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7053IO.showTranslationTipPopup();
                }
            });
        }
        getImg_broadcast().setImageResource(this.isCanBroadCast ? R.drawable.ic_simultan_broadcast_open : R.drawable.ic_simultan_broadcast_close);
        getImg_broadcast().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewSimultaneousInterpretationActivity.initView$lambda$4(this.f7765IO, view);
            }
        });
        initRecord();
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            addVoiceListener();
        }
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_new_simultaneous_interpretation;
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
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.m71
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NewSimultaneousInterpretationActivity.permission$lambda$0(this.f9640IO, (PermissionStatus) obj);
            }
        });
    }

    public final void setMAnimationDrawable(@tb1 AnimationDrawable animationDrawable) {
        this.mAnimationDrawable = animationDrawable;
    }

    public final void setMVoiceType(int i) {
        this.mVoiceType = i;
    }

    public final void setPopTip(@tb1 z16 z16Var) {
        this.popTip = z16Var;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRecording() {
        clickDownRecording();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRotateAnimation() {
        if (RecordingManager.Companion.getInstance().isRecording()) {
            ToastUtils.showLong(getString(R.string.recording_tip), new Object[0]);
            return;
        }
        if (getSwitchRotateAnimation()) {
            getMTransformLanguageImg().clearAnimation();
            CharSequence text = getMTransformLanguageLeftTv().getText();
            CharSequence text2 = getMTransformLanguageRightTv().getText();
            final RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(500L);
            rotateAnimation.setRepeatCount(-1);
            setSwitchRotateAnimation(false);
            getMTransformLanguageImg().startAnimation(rotateAnimation);
            getMTransformLanguageLeftTv().setText(text2);
            getMTransformLanguageRightTv().setText(text);
            setMCacheLanguage(getMLeftLanguage());
            setMLeftLanguage(getMRightLanguage());
            LanguageTranslationData mCacheLanguage = getMCacheLanguage();
            Intrinsics.XXI(mCacheLanguage);
            setMRightLanguage(mCacheLanguage);
            a01 a01Var = a01.OXO1;
            a01Var.m1440iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
            a01Var.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
            I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
            getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.n71
                @Override // java.lang.Runnable
                public final void run() {
                    NewSimultaneousInterpretationActivity.startRotateAnimation$lambda$0(rotateAnimation, this);
                }
            }, 500L);
        }
    }

    public final void startVoice() {
        RecordingManager.Companion.getInstance().setRecording(true);
        getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.k71
            @Override // java.lang.Runnable
            public final void run() {
                NewSimultaneousInterpretationActivity.startVoice$lambda$0(this.f9118IO);
            }
        }, 500L);
        getImg_play().setImageResource(R.drawable.ic_binaural_stop);
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
