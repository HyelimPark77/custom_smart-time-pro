package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
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
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.otherdevice.charge.LiveRecordingActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.view.WaveformView;
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
@SourceDebugExtension({"SMAP\nLiveRecordingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n87#2,7:443\n94#2,3:451\n70#2,7:454\n97#2:461\n173#2,7:462\n180#2,3:470\n143#2,7:473\n183#2:480\n173#2,7:481\n180#2,3:489\n143#2,7:492\n183#2:499\n87#2,7:500\n94#2,3:508\n70#2,7:511\n97#2:518\n1#3:450\n1#3:469\n1#3:488\n1#3:507\n*S KotlinDebug\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity\n*L\n303#1:443,7\n303#1:451,3\n303#1:454,7\n303#1:461\n334#1:462,7\n334#1:470,3\n334#1:473,7\n334#1:480\n339#1:481,7\n339#1:489,3\n339#1:492,7\n339#1:499\n194#1:500,7\n194#1:508,3\n194#1:511,7\n194#1:518\n303#1:450\n334#1:469\n339#1:488\n194#1:507\n*E\n"})
public final class LiveRecordingActivity extends BaseTranslationActivity {

    @aa1
    private final MicrosoftSDKManage.InterfaceC19048iO binauralMicrosoftCallBack;
    private MultiItemTypeAdapter<AISpeech> mAdapter;
    private int mVoiceType;
    private z16 popTip;

    @aa1
    private final String TAG = "LiveRecordingActivity";

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jq
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LiveRecordingActivity.rootView_delegate$lambda$0(this.f9024IO);
        }
    });

    @aa1
    private final Lazy tv_time$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kq
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LiveRecordingActivity.tv_time_delegate$lambda$0(this.f9257IO);
        }
    });

    @aa1
    private final Lazy img_recording_status$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lq
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LiveRecordingActivity.img_recording_status_delegate$lambda$0(this.f9494IO);
        }
    });

    @aa1
    private final Lazy img_play$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mq
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LiveRecordingActivity.img_play_delegate$lambda$0(this.f9763IO);
        }
    });

    @aa1
    private final Lazy record_line$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nq
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LiveRecordingActivity.record_line_delegate$lambda$0(this.f9993IO);
        }
    });

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oq
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return LiveRecordingActivity.rv_delegate$lambda$0(this.f10194IO);
        }
    });

    @aa1
    private ArrayList<AISpeech> aiSpeechList = new ArrayList<>();

    @SourceDebugExtension({"SMAP\nLiveRecordingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$binauralMicrosoftCallBack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n1563#2:443\n1634#2,3:444\n774#2:447\n865#2,2:448\n1563#2:450\n1634#2,3:451\n774#2:454\n865#2,2:455\n*S KotlinDebug\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$binauralMicrosoftCallBack$1\n*L\n91#1:443\n91#1:444,3\n92#1:447\n92#1:448,2\n134#1:450\n134#1:451,3\n135#1:454\n135#1:455,2\n*E\n"})
    public static final class OXO1 implements MicrosoftSDKManage.InterfaceC19048iO {
        public OXO1() {
        }

        /* JADX INFO: renamed from: iO */
        public static final void m38276iO(LiveRecordingActivity liveRecordingActivity) {
            if (liveRecordingActivity.aiSpeechList.size() > 0) {
                liveRecordingActivity.getRv().smoothScrollToPosition(liveRecordingActivity.aiSpeechList.size() - 1);
            }
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onIdentifyResults(int i, String str) {
            Intrinsics.X0O(str, "str");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(LiveRecordingActivity.this.TAG + "  sendTranslate  onIdentifyResults status = " + i + " content = " + str + " ");
            int i2 = 0;
            if (i == 1) {
                i1o0oxo1o.OXO1(LiveRecordingActivity.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
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
                i1O0OXO1O.OXO1.OXO1(LiveRecordingActivity.this.TAG + "  sendTranslate  onIdentifyResults parts = " + arrayList2);
                int size = arrayList2.size();
                while (i2 < size) {
                    int i3 = i2 + 1;
                    if (LiveRecordingActivity.this.aiSpeechList.size() < i3) {
                        LiveRecordingActivity.this.aiSpeechList.add(new AISpeech((String) arrayList2.get(i2), null, 1, 0, null, null, null, 0L, 0L, 506, null));
                    }
                    if (LiveRecordingActivity.this.aiSpeechList.size() == i3) {
                        ((AISpeech) LiveRecordingActivity.this.aiSpeechList.get(i2)).setText((String) arrayList2.get(i2));
                    }
                    i2 = i3;
                }
            } else if (i == 2) {
                i1o0oxo1o.OXO1(LiveRecordingActivity.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
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
                i1O0OXO1O.OXO1.OXO1(LiveRecordingActivity.this.TAG + "  sendTranslate  onIdentifyResults parts = " + arrayList4);
                int size2 = arrayList4.size();
                int i4 = 0;
                while (i4 < size2) {
                    int i5 = i4 + 1;
                    if (LiveRecordingActivity.this.aiSpeechList.size() < i5) {
                        AISpeech aISpeech = new AISpeech((String) arrayList4.get(i4), null, 2, 0, null, null, null, 0L, 0L, 506, null);
                        aISpeech.setLanguageModel(0);
                        aISpeech.setLang(LiveRecordingActivity.this.getMLeftLanguage().getRtasrLanguage());
                        aISpeech.setTargetLang(LiveRecordingActivity.this.getMLeftLanguage().getRtasrLanguage());
                        aISpeech.setTtsVoiceName(LiveRecordingActivity.this.getMLeftLanguage().getTtsViuceName());
                        LiveRecordingActivity.this.aiSpeechList.add(aISpeech);
                        if (i4 > 0) {
                            ((AISpeech) LiveRecordingActivity.this.aiSpeechList.get(i4)).setStartTime(((AISpeech) LiveRecordingActivity.this.aiSpeechList.get(i4 - 1)).getEndTime());
                        } else {
                            aISpeech.setStartTime(0L);
                        }
                        ((AISpeech) LiveRecordingActivity.this.aiSpeechList.get(i4)).setEndTime(System.currentTimeMillis() - LiveRecordingActivity.this.getStartTime());
                    }
                    if (LiveRecordingActivity.this.aiSpeechList.size() == i5 && ((AISpeech) LiveRecordingActivity.this.aiSpeechList.get(i4)).getStatus() == 1) {
                        i1O0OXO1O.OXO1.OXO1(LiveRecordingActivity.this.TAG + "  sendTranslate  onIdentifyResults istrue = " + (LiveRecordingActivity.this.aiSpeechList.size() == i5 && ((AISpeech) LiveRecordingActivity.this.aiSpeechList.get(i4)).getStatus() == 1));
                        Object obj3 = LiveRecordingActivity.this.aiSpeechList.get(i4);
                        Intrinsics.O10IXXX0X(obj3, "get(...)");
                        AISpeech aISpeech2 = (AISpeech) obj3;
                        aISpeech2.setText((String) arrayList4.get(i4));
                        aISpeech2.setStatus(2);
                        aISpeech2.setLanguageModel(0);
                        aISpeech2.setLang(LiveRecordingActivity.this.getMLeftLanguage().getRtasrLanguage());
                        aISpeech2.setTargetLang(LiveRecordingActivity.this.getMLeftLanguage().getRtasrLanguage());
                        aISpeech2.setTtsVoiceName(LiveRecordingActivity.this.getMLeftLanguage().getTtsViuceName());
                        if (i4 > 0) {
                            ((AISpeech) LiveRecordingActivity.this.aiSpeechList.get(i4)).setStartTime(((AISpeech) LiveRecordingActivity.this.aiSpeechList.get(i4 - 1)).getEndTime());
                        } else {
                            aISpeech2.setStartTime(0L);
                        }
                        ((AISpeech) LiveRecordingActivity.this.aiSpeechList.get(i4)).setEndTime(System.currentTimeMillis() - LiveRecordingActivity.this.getStartTime());
                    }
                    i4 = i5;
                }
            }
            i1O0OXO1O.OXO1.OXO1(LiveRecordingActivity.this.TAG + "  aiSpeechList.size = " + LiveRecordingActivity.this.aiSpeechList.size());
            MultiItemTypeAdapter multiItemTypeAdapter = LiveRecordingActivity.this.mAdapter;
            if (multiItemTypeAdapter == null) {
                Intrinsics.XXO("mAdapter");
                multiItemTypeAdapter = null;
            }
            multiItemTypeAdapter.notifyDataSetChanged();
            Handler mHandler = LiveRecordingActivity.this.getMHandler();
            final LiveRecordingActivity liveRecordingActivity = LiveRecordingActivity.this;
            mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.pq
                @Override // java.lang.Runnable
                public final void run() {
                    LiveRecordingActivity.OXO1.m38276iO(liveRecordingActivity);
                }
            }, 50L);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public /* bridge */ void onIdentifyResultsDetectedLanguage(int i, String str, String str2) {
            super.onIdentifyResultsDetectedLanguage(i, str, str2);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(LiveRecordingActivity.this.TAG + " onStartTransmission ");
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStopTransmission() {
        }
    }

    public LiveRecordingActivity() {
        setMAIRecordsType(2);
        this.binauralMicrosoftCallBack = new OXO1();
        this.mVoiceType = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addVoiceListener$lambda$0(LiveRecordingActivity liveRecordingActivity, int i, int i2, int i3) {
        if (i2 == 0) {
            if (liveRecordingActivity.mVoiceType == 0) {
                return true;
            }
            liveRecordingActivity.mVoiceType = i2;
            VoiceManager.INSTANCE.setLanguageType(liveRecordingActivity.getArsLanguage(), liveRecordingActivity.getTtsVoiceName());
            liveRecordingActivity.startVoice();
            return true;
        }
        if (i2 == 2) {
            if (liveRecordingActivity.mVoiceType != 0) {
                return true;
            }
            liveRecordingActivity.mVoiceType = i2;
            liveRecordingActivity.endVoice();
            return true;
        }
        if (i2 != 3 || liveRecordingActivity.mVoiceType != 0) {
            return true;
        }
        liveRecordingActivity.mVoiceType = i2;
        liveRecordingActivity.endVoice();
        MicrosoftSDKManage.O1O.OXO1().I0i0();
        return true;
    }

    private final void clickDownRecording() {
        if (PermissionUtils.isGranted(PermissionConstants.MICROPHONE)) {
            startRecordingBinaural();
        } else {
            permission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endVoice$lambda$0(LiveRecordingActivity liveRecordingActivity) {
        ToastUtils.showShort(liveRecordingActivity.getString(R.string.not_record_data), new Object[0]);
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

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRv() {
        return (RecyclerView) this.rv$delegate.getValue();
    }

    private final TextView getTv_time() {
        return (TextView) this.tv_time$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_play_delegate$lambda$0(LiveRecordingActivity liveRecordingActivity) {
        return (ImageView) liveRecordingActivity.findViewById(R.id.img_play);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_recording_status_delegate$lambda$0(LiveRecordingActivity liveRecordingActivity) {
        return (ImageView) liveRecordingActivity.findViewById(R.id.img_recording_status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRecord$lambda$0(LiveRecordingActivity liveRecordingActivity, View view) {
        if (RecordingManager.Companion.getInstance().isRecording()) {
            liveRecordingActivity.endVoice();
        } else {
            liveRecordingActivity.startVoice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final LiveRecordingActivity liveRecordingActivity) {
        z16 z16Var = new z16(liveRecordingActivity);
        z16Var.X11iII1O1(liveRecordingActivity.getString(R.string.live_record_tip_1));
        z16Var.XXX11i(liveRecordingActivity.getString(R.string.dialogue_tip_2));
        z16Var.XXIIO1i11(Integer.valueOf(R.drawable.ic_live_record_tip));
        a01 a01Var = a01.OXO1;
        z16Var.X1IX(Boolean.valueOf(a01Var.OXO1().getBoolean(b01.OIIOI, false)));
        z16Var.m3361iX().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.hq
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LiveRecordingActivity.initView$lambda$0$0$0(compoundButton, z);
            }
        });
        z16Var.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveRecordingActivity.initView$lambda$0$0$1(this.f8735IO, view);
            }
        });
        liveRecordingActivity.popTip = z16Var;
        if (a01Var.OXO1().getBoolean(b01.OIIOI, false)) {
            return;
        }
        z16 z16Var2 = liveRecordingActivity.popTip;
        if (z16Var2 == null) {
            Intrinsics.XXO("popTip");
            z16Var2 = null;
        }
        View rootView = liveRecordingActivity.getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        z16Var2.XiOIO(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0$0(CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        LogUtils.m11128d("isChecked = " + z);
        a01.OXO1.OXO1().put(b01.OIIOI, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0$1(LiveRecordingActivity liveRecordingActivity, View view) {
        String str;
        q62 q62Var = q62.OXO1;
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            str = "2";
        } else {
            str = q62Var.X0100I() ? "3" : "1";
        }
        int iM38573iO = WebViewActivity.Companion.m38573iO();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/videoPlayer/?type=" + str + "&id=3");
        bundle.putInt("mArg1", iM38573iO);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(liveRecordingActivity, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        liveRecordingActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(LiveRecordingActivity liveRecordingActivity, View view) {
        z16 z16Var = liveRecordingActivity.popTip;
        if (z16Var == null) {
            Intrinsics.XXO("popTip");
            z16Var = null;
        }
        View rootView = liveRecordingActivity.getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        z16Var.XiOIO(rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit permission$lambda$0(LiveRecordingActivity liveRecordingActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            liveRecordingActivity.startRecordingBinaural();
        }
        return Unit.OXO1;
    }

    private final void preConnect() {
        MicrosoftSDKManage.iiII(MicrosoftSDKManage.O1O.OXO1(), getArsLanguage(), true, getTtsVoiceName(), getTtsTargetLang(), false, null, CollectionsKt__CollectionsKt.Ii1iii0(getMLeftLanguage().getAsrLanguage(), getMRightLanguage().getAsrLanguage()), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaveformView record_line_delegate$lambda$0(LiveRecordingActivity liveRecordingActivity) {
        return (WaveformView) liveRecordingActivity.findViewById(R.id.record_line);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(LiveRecordingActivity liveRecordingActivity) {
        return liveRecordingActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_delegate$lambda$0(LiveRecordingActivity liveRecordingActivity) {
        return (RecyclerView) liveRecordingActivity.findViewById(R.id.f51422rv);
    }

    private final void startRecordingBinaural() {
        if (q62.OXO1.Ii1iii0()) {
            MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
            MicrosoftSDKManage.i100IXOX(xIi00iiXO.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
            xIi00iiXO.OXO1().m38825I0(false);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            showCountdownPopup(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startVoice$lambda$0(LiveRecordingActivity liveRecordingActivity) {
        liveRecordingActivity.aiSpeechList.clear();
        OIXO1IIOO.iIX0i(liveRecordingActivity.aiSpeechList, new Function1() { // from class: com.android.mltcode.paycertificationapi.cq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(LiveRecordingActivity.startVoice$lambda$0$0((AISpeech) obj));
            }
        });
        MultiItemTypeAdapter<AISpeech> multiItemTypeAdapter = liveRecordingActivity.mAdapter;
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
    public static final TextView tv_time_delegate$lambda$0(LiveRecordingActivity liveRecordingActivity) {
        return (TextView) liveRecordingActivity.findViewById(R.id.tv_time);
    }

    public final void addVoiceListener() {
        VoiceManager.INSTANCE.setMListener(new Function3() { // from class: com.android.mltcode.paycertificationapi.dq
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(LiveRecordingActivity.addVoiceListener$lambda$0(this.f6245IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
            }
        });
    }

    public final void binauralStopRecording() {
        if (!q62.OXO1.Ii1iii0()) {
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
        RecordingManager.Companion.getInstance().setRecording(true);
        Glide.with(getMContext()).asGif().load(Integer.valueOf(R.drawable.pop_recording_animation_img)).into(getImg_recording_status());
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
        if (this.aiSpeechList.size() <= 0) {
            getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.aq
                @Override // java.lang.Runnable
                public final void run() {
                    LiveRecordingActivity.endVoice$lambda$0(this.f5537IO);
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

    public final void initAdapter() {
        this.mAdapter = new MultiItemTypeAdapter<AISpeech>(this, this.aiSpeechList) { // from class: com.sma.smartv3.otherdevice.charge.LiveRecordingActivity.initAdapter.1

            /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.LiveRecordingActivity$initAdapter$1$OXO1 */
            public static final class OXO1 implements InterfaceC2572jc<AISpeech> {
                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AISpeech aISpeech, int i) {
                    return aISpeech != null && aISpeech.getLanguageModel() == 0;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_live_record;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, AISpeech mAISpeech, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAISpeech, "mAISpeech");
                    ((TextView) holder.getView(R.id.tv_original)).setText(mAISpeech.getText());
                }
            }

            {
                addItemViewDelegate(0, new OXO1());
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
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public final void initRecord() {
        getImg_play().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.bq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveRecordingActivity.initRecord$lambda$0(this.f5784IO, view);
            }
        });
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setLangAndVoice();
        q62 q62Var = q62.OXO1;
        if (q62Var.Ii1iii0()) {
            preConnect();
        }
        a01.OXO1.OXO1().put(b01.iIXX0i, true);
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleCenter().setVisibility(8);
        VoiceManager.INSTANCE.setActivityData(true);
        if (q62Var.Ii1iii0()) {
            MicrosoftSDKManage.i100IXOX(MicrosoftSDKManage.O1O.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
        }
        getRootView().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.eq
            @Override // java.lang.Runnable
            public final void run() {
                LiveRecordingActivity.initView$lambda$0(this.f6464IO);
            }
        });
        getAbhTitleRight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.fq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveRecordingActivity.initView$lambda$1(this.f6701IO, view);
            }
        });
        initAdapter();
        initRecord();
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            addVoiceListener();
        }
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_live_recording;
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
        if (q62.OXO1.Ii1iii0()) {
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
            case R.id.img_select /* 2131362926 */:
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
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.zp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LiveRecordingActivity.permission$lambda$0(this.f12660IO, (PermissionStatus) obj);
            }
        });
    }

    public final void setMVoiceType(int i) {
        this.mVoiceType = i;
    }

    public final void startVoice() {
        RecordingManager.Companion.getInstance().setRecording(true);
        getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.gq
            @Override // java.lang.Runnable
            public final void run() {
                LiveRecordingActivity.startVoice$lambda$0(this.f6936IO);
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
