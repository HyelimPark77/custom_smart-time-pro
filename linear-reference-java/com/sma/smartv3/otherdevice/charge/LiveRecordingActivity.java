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
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aq;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bq;
import com.android.mltcode.paycertificationapi.cq;
import com.android.mltcode.paycertificationapi.dq;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.eq;
import com.android.mltcode.paycertificationapi.fq;
import com.android.mltcode.paycertificationapi.gq;
import com.android.mltcode.paycertificationapi.hq;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iq;
import com.android.mltcode.paycertificationapi.jq;
import com.android.mltcode.paycertificationapi.kq;
import com.android.mltcode.paycertificationapi.lq;
import com.android.mltcode.paycertificationapi.mq;
import com.android.mltcode.paycertificationapi.nq;
import com.android.mltcode.paycertificationapi.oq;
import com.android.mltcode.paycertificationapi.pq;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.z16;
import com.android.mltcode.paycertificationapi.zp;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLiveRecordingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n87#2,7:443\n94#2,3:451\n70#2,7:454\n97#2:461\n173#2,7:462\n180#2,3:470\n143#2,7:473\n183#2:480\n173#2,7:481\n180#2,3:489\n143#2,7:492\n183#2:499\n87#2,7:500\n94#2,3:508\n70#2,7:511\n97#2:518\n1#3:450\n1#3:469\n1#3:488\n1#3:507\n*S KotlinDebug\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity\n*L\n303#1:443,7\n303#1:451,3\n303#1:454,7\n303#1:461\n334#1:462,7\n334#1:470,3\n334#1:473,7\n334#1:480\n339#1:481,7\n339#1:489,3\n339#1:492,7\n339#1:499\n194#1:500,7\n194#1:508,3\n194#1:511,7\n194#1:518\n303#1:450\n334#1:469\n339#1:488\n194#1:507\n*E\n"})
public final class LiveRecordingActivity extends BaseTranslationActivity {

    @aa1
    private final String TAG;

    @aa1
    private ArrayList<AISpeech> aiSpeechList;

    @aa1
    private final MicrosoftSDKManage.iO binauralMicrosoftCallBack;

    @aa1
    private final Lazy img_play$delegate;

    @aa1
    private final Lazy img_recording_status$delegate;
    private MultiItemTypeAdapter<AISpeech> mAdapter;
    private int mVoiceType;
    private z16 popTip;

    @aa1
    private final Lazy record_line$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy rv$delegate;

    @aa1
    private final Lazy tv_time$delegate;

    @SourceDebugExtension({"SMAP\nLiveRecordingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$binauralMicrosoftCallBack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n1563#2:443\n1634#2,3:444\n774#2:447\n865#2,2:448\n1563#2:450\n1634#2,3:451\n774#2:454\n865#2,2:455\n*S KotlinDebug\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$binauralMicrosoftCallBack$1\n*L\n91#1:443\n91#1:444,3\n92#1:447\n92#1:448,2\n134#1:450\n134#1:451,3\n135#1:454\n135#1:455,2\n*E\n"})
    public static final class OXO1 implements MicrosoftSDKManage.iO {
        public final /* synthetic */ LiveRecordingActivity OXO1;

        public OXO1(LiveRecordingActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void XIi00iiXO(LiveRecordingActivity r0) {
            iO(r0);
        }

        public static final void iO(LiveRecordingActivity r1) {
            if (LiveRecordingActivity.access$getAiSpeechList$p(r1).size() <= 0) goto L6;
            LiveRecordingActivity.access$getRv(r1).smoothScrollToPosition(LiveRecordingActivity.access$getAiSpeechList$p(r1).size() - 1);
            return;
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onIdentifyResults(int r26, String r27) {
            Intrinsics.X0O(r27, "str");
            i1O0OXO1O r3 = i1O0OXO1O.OXO1;
            r3.OXO1(LiveRecordingActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults status = " + r26 + " content = " + r27 + " ");
            int r8 = 0;
            if (r26 != 1) goto L5;
            r3.OXO1(LiveRecordingActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults content = " + r27);
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
            i1O0OXO1O.OXO1.OXO1(LiveRecordingActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults parts = " + r5);
            int r9 = r5.size();
        L53:
            if (r8 >= r9) goto L61;
            int r10 = r8 + 1;
            if (LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).size() >= r10) goto L58;
            LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).add(new AISpeech((String) r5.get(r8), null, 1, 0, null, null, null, 0, 0, 506, null));
        L58:
            if (LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).size() != r10) goto L60;
            ((AISpeech) LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r8)).setText((String) r5.get(r8));
        L60:
            r8 = r10;
        L61:
            i1O0OXO1O.OXO1.OXO1(LiveRecordingActivity.access$getTAG$p(this.OXO1) + "  aiSpeechList.size = " + LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).size());
            MultiItemTypeAdapter r11 = LiveRecordingActivity.access$getMAdapter$p(this.OXO1);
            if (r11 != null) goto L64;
            Intrinsics.XXO("mAdapter");
            r11 = null;
        L64:
            r11.notifyDataSetChanged();
            Handler r12 = this.OXO1.getMHandler();
            final LiveRecordingActivity r13 = this.OXO1;
            r12.postDelayed(new pq(r13), 50);
            return;
        L5:
            if (r26 != 2) goto L61;
            r3.OXO1(LiveRecordingActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults content = " + r27);
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
            i1O0OXO1O.OXO1.OXO1(LiveRecordingActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults parts = " + r17);
            int r20 = r17.size();
            int r21 = 0;
        L18:
            if (r21 >= r20) goto L61;
            int r22 = r21 + 1;
            if (LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).size() >= r22) goto L27;
            AISpeech r110 = new AISpeech((String) r17.get(r21), null, 2, 0, null, null, null, 0, 0, 506, null);
            r110.setLanguageModel(0);
            r110.setLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r110.setTargetLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r110.setTtsVoiceName(this.OXO1.getMLeftLanguage().getTtsViuceName());
            LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).add(r110);
            if (r21 <= 0) goto L24;
            ((AISpeech) LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setStartTime(((AISpeech) LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r21 - 1)).getEndTime());
        L25:
            ((AISpeech) LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setEndTime(System.currentTimeMillis() - this.OXO1.getStartTime());
            goto L27
        L24:
            r110.setStartTime(0);
        L27:
            if (LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).size() != r22) goto L41;
            if (((AISpeech) LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).getStatus() != 1) goto L41;
            i1O0OXO1O r23 = i1O0OXO1O.OXO1;
            String r111 = LiveRecordingActivity.access$getTAG$p(this.OXO1);
            if (LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).size() == r22) goto L33;
        L35:
            boolean r112 = false;
        L36:
            r23.OXO1(r111 + "  sendTranslate  onIdentifyResults istrue = " + r112);
            Object r24 = LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r21);
            Intrinsics.O10IXXX0X(r24, "get(...)");
            AISpeech r25 = (AISpeech) r24;
            r25.setText((String) r17.get(r21));
            r25.setStatus(2);
            r25.setLanguageModel(0);
            r25.setLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r25.setTargetLang(this.OXO1.getMLeftLanguage().getRtasrLanguage());
            r25.setTtsVoiceName(this.OXO1.getMLeftLanguage().getTtsViuceName());
            if (r21 <= 0) goto L39;
            ((AISpeech) LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setStartTime(((AISpeech) LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r21 - 1)).getEndTime());
        L40:
            ((AISpeech) LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).setEndTime(System.currentTimeMillis() - this.OXO1.getStartTime());
            goto L41
        L39:
            r25.setStartTime(0);
            goto L40
        L33:
            if (((AISpeech) LiveRecordingActivity.access$getAiSpeechList$p(this.OXO1).get(r21)).getStatus() != 1) goto L35;
            r112 = true;
        L41:
            r21 = r22;
            goto L18
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public /* bridge */ void onIdentifyResultsDetectedLanguage(int r1, String r2, String r3) {
            super.onIdentifyResultsDetectedLanguage(r1, r2, r3);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(LiveRecordingActivity.access$getTAG$p(this.OXO1) + " onStartTransmission ");
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStopTransmission() {
        }
    }

    public LiveRecordingActivity() {
        this.TAG = "LiveRecordingActivity";
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new jq(this));
        this.tv_time$delegate = LazyKt__LazyJVMKt.iO(new kq(this));
        this.img_recording_status$delegate = LazyKt__LazyJVMKt.iO(new lq(this));
        this.img_play$delegate = LazyKt__LazyJVMKt.iO(new mq(this));
        this.record_line$delegate = LazyKt__LazyJVMKt.iO(new nq(this));
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new oq(this));
        this.aiSpeechList = new ArrayList();
        setMAIRecordsType(2);
        this.binauralMicrosoftCallBack = new OXO1(this);
        this.mVoiceType = -1;
    }

    public static /* synthetic */ void I1(LiveRecordingActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ RecyclerView II1Xi0(LiveRecordingActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IXXOO(LiveRecordingActivity r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ void O1O(CompoundButton r0, boolean r1) {
        initView$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean X01IiOiIi(AISpeech r0) {
        return startVoice$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit X0i1O(LiveRecordingActivity r0, PermissionStatus r1) {
        return permission$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean X11iII1O1(LiveRecordingActivity r0, int r1, int r2, int r3) {
        return addVoiceListener$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ void X1IX(LiveRecordingActivity r0, View r1) {
        initRecord$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView XXIIO1i11(LiveRecordingActivity r0) {
        return tv_time_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXX11i(LiveRecordingActivity r0) {
        return img_recording_status_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ ArrayList access$getAiSpeechList$p(LiveRecordingActivity r0) {
        return r0.aiSpeechList;
    }

    public static final /* synthetic */ MultiItemTypeAdapter access$getMAdapter$p(LiveRecordingActivity r0) {
        return r0.mAdapter;
    }

    public static final /* synthetic */ RecyclerView access$getRv(LiveRecordingActivity r0) {
        return r0.getRv();
    }

    public static final /* synthetic */ String access$getTAG$p(LiveRecordingActivity r0) {
        return r0.TAG;
    }

    private static final boolean addVoiceListener$lambda$0(LiveRecordingActivity r0, int r1, int r2, int r3) {
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

    private final void clickDownRecording() {
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.MICROPHONE}) == false) goto L6;
        startRecordingBinaural();
        return;
    L6:
        permission();
    }

    private static final void endVoice$lambda$0(LiveRecordingActivity r1) {
        ToastUtils.showShort(r1.getString(R.string.not_record_data), new Object[0]);
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

    private final View getRootView() {
        return (View) getValue();
    }

    private final RecyclerView getRv() {
        return (RecyclerView) getValue();
    }

    private final TextView getTv_time() {
        return (TextView) getValue();
    }

    public static /* synthetic */ void i010I(LiveRecordingActivity r0) {
        startVoice$lambda$0(r0);
    }

    public static /* synthetic */ void iI(LiveRecordingActivity r0) {
        endVoice$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iOO1ii1(LiveRecordingActivity r0) {
        return img_play_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iOOX010X(LiveRecordingActivity r0, View r1) {
        initView$lambda$0$0$1(r0, r1);
    }

    public static /* synthetic */ WaveformView iX(LiveRecordingActivity r0) {
        return record_line_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iX1O1(LiveRecordingActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    private static final ImageView img_play_delegate$lambda$0(LiveRecordingActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_play);
    }

    private static final ImageView img_recording_status_delegate$lambda$0(LiveRecordingActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_recording_status);
    }

    private static final void initRecord$lambda$0(LiveRecordingActivity r0, View r1) {
        if (RecordingManager.Companion.getInstance().isRecording() == false) goto L6;
        r0.endVoice();
        return;
    L6:
        r0.startVoice();
    }

    private static final void initView$lambda$0(final LiveRecordingActivity r6) {
        z16 r0 = new z16(r6);
        r0.X11iII1O1(r6.getString(R.string.live_record_tip_1));
        r0.XXX11i(r6.getString(R.string.dialogue_tip_2));
        r0.XXIIO1i11(Integer.valueOf(R.drawable.ic_live_record_tip));
        a01 r1 = a01.OXO1;
        r0.X1IX(Boolean.valueOf(r1.OXO1().getBoolean(b01.OIIOI, false)));
        r0.iX().setOnCheckedChangeListener(new hq());
        r0.OII().setOnClickListener(new iq(r6));
        r6.popTip = r0;
        if (r1.OXO1().getBoolean(b01.OIIOI, false) == true) goto L9;
        z16 r2 = r6.popTip;
        if (r2 != null) goto L7;
        Intrinsics.XXO("popTip");
        r2 = null;
    L7:
        View r7 = r6.getRootView();
        Intrinsics.O10IXXX0X(r7, "<get-rootView>(...)");
        r2.XiOIO(r7);
        return;
    }

    private static final void initView$lambda$0$0$0(CompoundButton r1, boolean r2) {
        Intrinsics.X0O(r1, "buttonView");
        LogUtils.d(new Object[]{"isChecked = " + r2});
        a01.OXO1.OXO1().put(b01.OIIOI, r2);
    }

    private static final void initView$lambda$0$0$1(LiveRecordingActivity r4, View r5) {
        q62 r6 = q62.OXO1;
        if (q62.OiO0IOX(r6, null, 1, null) == false) goto L6;
        String r7 = "2";
    L9:
        int r0 = WebViewActivity.Companion.iO();
        Bundle r2 = new Bundle();
        r2.putString("mArg0", "https://api.iot-solution.net/videoPlayer/?type=" + r7 + "&id=3");
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

    private static final void initView$lambda$1(LiveRecordingActivity r1, View r2) {
        z16 r3 = r1.popTip;
        if (r3 != null) goto L5;
        Intrinsics.XXO("popTip");
        r3 = null;
    L5:
        View r4 = r1.getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r3.XiOIO(r4);
    }

    private static final Unit permission$lambda$0(LiveRecordingActivity r1, PermissionStatus r2) {
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

    private static final WaveformView record_line_delegate$lambda$0(LiveRecordingActivity r1) {
        return (WaveformView) r1.findViewById(R.id.record_line);
    }

    private static final View rootView_delegate$lambda$0(LiveRecordingActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final RecyclerView rv_delegate$lambda$0(LiveRecordingActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    private final void startRecordingBinaural() {
        if (q62.OXO1.Ii1iii0() == false) goto L6;
        MicrosoftSDKManage.XIi00iiXO r0 = MicrosoftSDKManage.O1O;
        MicrosoftSDKManage.i100IXOX(r0.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
        r0.OXO1().I0(false);
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        showCountdownPopup(r1);
        return;
    }

    private static final void startVoice$lambda$0(LiveRecordingActivity r2) {
        r2.aiSpeechList.clear();
        OIXO1IIOO.iIX0i(r2.aiSpeechList, new cq());
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

    private static final TextView tv_time_delegate$lambda$0(LiveRecordingActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_time);
    }

    public final void addVoiceListener() {
        VoiceManager.INSTANCE.setMListener(new dq(this));
    }

    public final void binauralStopRecording() {
        if (q62.OXO1.Ii1iii0() == false) goto L6;
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
        RecordingManager.Companion.getInstance().setRecording(true);
        Glide.with(getMContext()).asGif().load(Integer.valueOf(R.drawable.pop_recording_animation_img)).into(getImg_recording_status());
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
        getMHandler().postDelayed(new aq(this), 500);
    }

    @aa1
    public final MicrosoftSDKManage.iO getBinauralMicrosoftCallBack() {
        return this.binauralMicrosoftCallBack;
    }

    public final int getMVoiceType() {
        return this.mVoiceType;
    }

    public final void initAdapter() {
        final ArrayList<AISpeech> r0 = this.aiSpeechList;
        this.mAdapter = new AnonymousClass1(this, r0);
        getRv().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView r1 = getRv();
        MultiItemTypeAdapter<AISpeech> r2 = this.mAdapter;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r2 = null;
    L5:
        r1.setAdapter(r2);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    public final void initRecord() {
        getImg_play().setOnClickListener(new bq(this));
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setLangAndVoice();
        q62 r0 = q62.OXO1;
        if (r0.Ii1iii0() == false) goto L5;
        preConnect();
    L5:
        a01.OXO1.OXO1().put(b01.iIXX0i, true);
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleCenter().setVisibility(8);
        VoiceManager.INSTANCE.setActivityData(true);
        if (r0.Ii1iii0() == false) goto L8;
        MicrosoftSDKManage.i100IXOX(MicrosoftSDKManage.O1O.OXO1(), this.binauralMicrosoftCallBack, null, 2, null);
    L8:
        getRootView().post(new eq(this));
        getAbhTitleRight().setOnClickListener(new fq(this));
        initAdapter();
        initRecord();
        if (q62.OiO0IOX(r0, null, 1, null) == false) goto L12;
        addVoiceListener();
        return;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
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
    public final void onLanguageChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onLanguageChange event = " + r4);
        setLangAndVoice();
        if (q62.OXO1.Ii1iii0() == false) goto L6;
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
            case 2131362926: goto L11;
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
        ds1.XIi00iiXO(r0, r1, r3, new zp(this));
    }

    public final void setMVoiceType(int r1) {
        this.mVoiceType = r1;
    }

    public final void startVoice() {
        RecordingManager.Companion.getInstance().setRecording(true);
        getMHandler().postDelayed(new gq(this), 500);
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
