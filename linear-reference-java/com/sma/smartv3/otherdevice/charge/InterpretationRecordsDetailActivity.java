package com.sma.smartv3.otherdevice.charge;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ab;
import com.android.mltcode.paycertificationapi.bb;
import com.android.mltcode.paycertificationapi.cb;
import com.android.mltcode.paycertificationapi.db;
import com.android.mltcode.paycertificationapi.eb;
import com.android.mltcode.paycertificationapi.fb;
import com.android.mltcode.paycertificationapi.fq1;
import com.android.mltcode.paycertificationapi.gb;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hb;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.la;
import com.android.mltcode.paycertificationapi.ma;
import com.android.mltcode.paycertificationapi.na;
import com.android.mltcode.paycertificationapi.oa;
import com.android.mltcode.paycertificationapi.pa;
import com.android.mltcode.paycertificationapi.qa;
import com.android.mltcode.paycertificationapi.r16;
import com.android.mltcode.paycertificationapi.ra;
import com.android.mltcode.paycertificationapi.sa;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.ta;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ua;
import com.android.mltcode.paycertificationapi.va;
import com.android.mltcode.paycertificationapi.wa;
import com.android.mltcode.paycertificationapi.xa;
import com.android.mltcode.paycertificationapi.ya;
import com.android.mltcode.paycertificationapi.za;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.io.Location;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.AIRecordsDao;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nInterpretationRecordsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpretationRecordsDetailActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1#2:293\n*E\n"})
public final class InterpretationRecordsDetailActivity extends BaseActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @tb1
    private AudioManager audioManager;
    private boolean isOpenVolume;
    private boolean isPlayAudio;

    @tb1
    private AIRecords mAIRecords;

    @tb1
    private iii1ii mEditPop;

    @aa1
    private final Lazy mRecordsAudioDuration$delegate;

    @aa1
    private final Lazy mRecordsAudioSeekBar$delegate;

    @aa1
    private final Lazy mRecordsContent$delegate;

    @aa1
    private final AIRecordsDao mRecordsDao;

    @aa1
    private final Lazy mRecordsExtraInfo$delegate;

    @aa1
    private final Lazy mRecordsLanguage$delegate;

    @aa1
    private final Lazy mRecordsLocation$delegate;

    @aa1
    private final Lazy mRecordsPlayAudioBtn$delegate;

    @aa1
    private final Lazy mRecordsPlayVolumeBtn$delegate;

    @aa1
    private final Lazy mRecordsTime$delegate;

    @aa1
    private final Lazy mRecordsTitle$delegate;

    @aa1
    private final Lazy mRecordsTitleEditImg$delegate;

    @aa1
    private final Lazy mRecordsToLanguage$delegate;

    @tb1
    private r16 mTranslationDetailPopup;
    private int recordingTime;

    @tb1
    private Timer timer;

    public static final class OXO1 extends TimerTask {
        public final /* synthetic */ InterpretationRecordsDetailActivity IO;

        public OXO1(InterpretationRecordsDetailActivity r1) {
            this.IO = r1;
        }

        public static /* synthetic */ void OXO1(InterpretationRecordsDetailActivity r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(InterpretationRecordsDetailActivity r2) {
            r2.setRecordingTime(r2.getRecordingTime() + 1);
            r2.getMRecordsAudioSeekBar().setProgress(r2.getRecordingTime());
            if (r2.getRecordingTime() < 13) goto L9;
            Timer r0 = InterpretationRecordsDetailActivity.access$getTimer$p(r2);
            if (r0 == null) goto L7;
            r0.cancel();
        L7:
            r2.setPlayAudio(false);
            r2.getMRecordsPlayAudioBtn().setImageResource(R.drawable.icon_run_start);
            fq1.OXO1.OIi0();
            return;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final InterpretationRecordsDetailActivity r0 = this.IO;
            r0.runOnUiThread(new hb(r0));
        }
    }

    public InterpretationRecordsDetailActivity() {
        this.mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new cb(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new ma(this));
        this.TAG = "InterpretationRecordsDetailActivity";
        this.mRecordsTitle$delegate = LazyKt__LazyJVMKt.iO(new na(this));
        this.mRecordsTitleEditImg$delegate = LazyKt__LazyJVMKt.iO(new oa(this));
        this.mRecordsLanguage$delegate = LazyKt__LazyJVMKt.iO(new pa(this));
        this.mRecordsToLanguage$delegate = LazyKt__LazyJVMKt.iO(new qa(this));
        this.mRecordsLocation$delegate = LazyKt__LazyJVMKt.iO(new ra(this));
        this.mRecordsTime$delegate = LazyKt__LazyJVMKt.iO(new sa(this));
        this.mRecordsContent$delegate = LazyKt__LazyJVMKt.iO(new ta(this));
        this.mRecordsExtraInfo$delegate = LazyKt__LazyJVMKt.iO(new ua(this));
        this.mRecordsAudioSeekBar$delegate = LazyKt__LazyJVMKt.iO(new db(this));
        this.mRecordsAudioDuration$delegate = LazyKt__LazyJVMKt.iO(new eb(this));
        this.mRecordsPlayAudioBtn$delegate = LazyKt__LazyJVMKt.iO(new fb(this));
        this.mRecordsPlayVolumeBtn$delegate = LazyKt__LazyJVMKt.iO(new gb(this));
        this.isOpenVolume = true;
    }

    public static /* synthetic */ PFMedium I0iXXO(InterpretationRecordsDetailActivity r0) {
        return mRecordsTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1(InterpretationRecordsDetailActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium I1XOi1(InterpretationRecordsDetailActivity r0) {
        return mRecordsToLanguage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit II1Xi0(InterpretationRecordsDetailActivity r0) {
        return showDeleteTipPopup$lambda$0$0$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(InterpretationRecordsDetailActivity r0) {
        return mRecordsLocation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IXXOO(InterpretationRecordsDetailActivity r0) {
        return mRecordsExtraInfo_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X() {
        return showDeleteTipPopup$lambda$0$0$1$0();
    }

    public static /* synthetic */ void OII(InterpretationRecordsDetailActivity r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ ImageView OIX0iXi(InterpretationRecordsDetailActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OX(InterpretationRecordsDetailActivity r0) {
        return mRecordsContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OiIIX101O(InterpretationRecordsDetailActivity r0, String r1) {
        return showEditPopup$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ ImageView X01IiOiIi(InterpretationRecordsDetailActivity r0) {
        return mRecordsTitleEditImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0O(InterpretationRecordsDetailActivity r0, int r1) {
        return showDeleteTipPopup$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void X1ii(InterpretationRecordsDetailActivity r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ ProgressBar XX0(InterpretationRecordsDetailActivity r0) {
        return mRecordsAudioSeekBar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(InterpretationRecordsDetailActivity r0) {
        return mRecordsPlayAudioBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XiOIO(InterpretationRecordsDetailActivity r0) {
        return mRecordsPlayVolumeBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XiOIii1(InterpretationRecordsDetailActivity r0) {
        return mRecordsAudioDuration_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ Timer access$getTimer$p(InterpretationRecordsDetailActivity r0) {
        return r0.timer;
    }

    public static /* synthetic */ void i010I(InterpretationRecordsDetailActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ PFMedium iIiiO(InterpretationRecordsDetailActivity r0) {
        return mRecordsTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iOOX010X(InterpretationRecordsDetailActivity r0) {
        return showDeleteTipPopup$lambda$0$0$1$1(r0);
    }

    public static /* synthetic */ PFMedium iX(InterpretationRecordsDetailActivity r0) {
        return mRecordsLanguage_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(InterpretationRecordsDetailActivity r0, View r1) {
        r0.showEditPopup();
    }

    private static final void initView$lambda$2(InterpretationRecordsDetailActivity r7, View r8) {
        boolean r9 = r7.isPlayAudio;
        r7.isPlayAudio = !r9;
        if (r9 == true) goto L18;
        r7.getMRecordsPlayAudioBtn().setImageResource(R.drawable.icon_run_pause);
        AIRecords r0 = r7.mAIRecords;     // Catch: Exception -> L12
        if (r0 == null) goto L23;
        Intrinsics.XXI(r0);     // Catch: Exception -> L12
        if (r0.getMAudioPath().length() <= 0) goto L22;
        fq1 r1 = fq1.OXO1;     // Catch: Exception -> L12
        AIRecords r2 = r7.mAIRecords;     // Catch: Exception -> L12
        Intrinsics.XXI(r2);     // Catch: Exception -> L12
        fq1.O00(r1, r2.getMAudioPath(), 0, 2, null);     // Catch: Exception -> L12
        r7.recordingTime = 0;     // Catch: Exception -> L12
        Timer r3 = r7.timer;     // Catch: Exception -> L12
        if (r3 == null) goto L14;
        r3.cancel();     // Catch: Exception -> L12
    L14:
        Timer r4 = new Timer();     // Catch: Exception -> L12
        r7.timer = r4;     // Catch: Exception -> L12
        r4.scheduleAtFixedRate(new OXO1(r7), 0, 1000);     // Catch: Exception -> L12
        return;
    L22:
        return;
    L23:
        return;
    L12:
        e = move-exception;
        i1O0OXO1O.OXO1.OXO1(r7.TAG + " play e = " + e);
        ToastUtils.showLong("音频文件已损坏", new Object[0]);
        return;
    L18:
        r7.getMRecordsPlayAudioBtn().setImageResource(R.drawable.icon_run_start);
        fq1.OXO1.OIi0();
    }

    private static final void initView$lambda$3(InterpretationRecordsDetailActivity r2, View r3) {
        boolean r4 = r2.isOpenVolume;
        r2.isOpenVolume = !r4;
        if (r4 == true) goto L6;
        fq1.OXO1.XOO0ii0();
        r2.getMRecordsPlayVolumeBtn().setImageResource(R.drawable.simultaneous_play_volume_icon);
        return;
    L6:
        Object r5 = r2.getSystemService("audio");
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager r6 = (AudioManager) r5;
        int r1 = r6.getStreamVolume(3);
        int r7 = r6.getStreamMaxVolume(3);
        fq1 r0 = fq1.OXO1;
        r0.OXO1(r1 / r7);
        r0.IO();
        r2.getMRecordsPlayVolumeBtn().setImageResource(R.drawable.simultaneous_closure_volume_icon);
    }

    private static final PFMedium mRecordsAudioDuration_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.interpretation_records_audio_duration);
    }

    private static final ProgressBar mRecordsAudioSeekBar_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (ProgressBar) r1.findViewById(R.id.interpretation_records_audio_seekbar);
    }

    private static final PFMedium mRecordsContent_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.interpretation_records_content);
    }

    private static final PFMedium mRecordsExtraInfo_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.interpretation_records_extraInfo);
    }

    private static final PFMedium mRecordsLanguage_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.interpretation_records_language);
    }

    private static final PFMedium mRecordsLocation_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.interpretation_records_location);
    }

    private static final ImageView mRecordsPlayAudioBtn_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (ImageView) r1.findViewById(R.id.simultaneous_play_audio_icon);
    }

    private static final ImageView mRecordsPlayVolumeBtn_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (ImageView) r1.findViewById(R.id.simultaneous_play_audio_volume_icon);
    }

    private static final PFMedium mRecordsTime_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.interpretation_records_time);
    }

    private static final ImageView mRecordsTitleEditImg_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (ImageView) r1.findViewById(R.id.transform_title_edit_img);
    }

    private static final PFMedium mRecordsTitle_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.interpretation_records_title);
    }

    private static final PFMedium mRecordsToLanguage_delegate$lambda$0(InterpretationRecordsDetailActivity r1) {
        return (PFMedium) r1.findViewById(R.id.interpretation_records_to_language);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean showDeleteTipPopup$lambda$0$0(final InterpretationRecordsDetailActivity r10, int r11) {
        String r0 = null;
        Object[] r1 = 0;
        if (r11 == 1) goto L17;
        int r2 = 2;
        if (r11 != 2) goto L7;
        AIRecords r12 = r10.mAIRecords;
        if (r12 == null) goto L21;
        String r13 = r12.getMContent();
        if (r13 == null) goto L21;
        if (r13.length() <= 0) goto L21;
        ThreadsKt.iO(true, false, null, null, 0, new va(r10), 30, null);
    L21:
        return true;
    L7:
        if (r11 != 3) goto L21;
        go0 r14 = new go0(r10.getMContext(), 0, r2, r1 == true ? 1 : 0);
        r14.O1O(R.string.weather_del_file);
        r14.iX1O1(Integer.valueOf(R.string.cancel), new xa());
        r14.X1IX(R.string.delete, new ya(r10));
        r14.IIX1OXO();
        goto L21
    L17:
        AIRecords r15 = r10.mAIRecords;
        if (r15 == null) goto L20;
        r0 = r15.getMContent();
    L20:
        ClipboardUtils.copyText(r0);
        ToastUtils.showLong(R.string.copied);
        goto L21
    }

    private static final Unit showDeleteTipPopup$lambda$0$0$0(InterpretationRecordsDetailActivity r1) {
        AIRecords r0 = r1.mAIRecords;
        if (r0 == null) goto L5;
        String r2 = r0.getMContent();
    L6:
        Intrinsics.XXI(r2);
        r1.exportTextToFile(r2);
        return Unit.OXO1;
    L5:
        r2 = null;
        goto L6
    }

    private static final boolean showDeleteTipPopup$lambda$0$0$1$0() {
        return true;
    }

    private static final boolean showDeleteTipPopup$lambda$0$0$1$1(InterpretationRecordsDetailActivity r4) {
        AIRecords r0 = r4.mAIRecords;
        if (r0 == null) goto L5;
        r0.setMIsSync(0);
    L5:
        AIRecords r1 = r4.mAIRecords;
        if (r1 == null) goto L8;
        r1.setMIsDelete(1);
    L8:
        AIRecordsDao r2 = r4.mRecordsDao;
        AIRecords r3 = r4.mAIRecords;
        Intrinsics.XXI(r3);
        r2.update(r3);
        I01XX0.XIi00iiXO(I01XX0.OXi001, null, 2, null);
        r4.finish();
        return true;
    }

    private final void showEditPopup() {
        if (this.mEditPop != null) goto L10;
        int r4 = 0;
        iii1ii r0 = new iii1ii(getMContext(), r4, 2, null);
        r0.X01IiOiIi().setTextColor(gk4.iO(getMContext(), R.color.line_color));
        r0.XXX11i(R.string.title);
        AIRecords r1 = this.mAIRecords;
        if (r1 == null) goto L8;
        String r2 = r1.getMAITitle();
        if (r2 == null) goto L8;
    L9:
        r0.iI(r2);
        r0.X11iII1O1(new bb(this));
        this.mEditPop = r0;
    L8:
        r2 = "";
    L10:
        iii1ii r3 = this.mEditPop;
        if (r3 == null) goto L14;
        r3.IIX1OXO();
        return;
    }

    private static final boolean showEditPopup$lambda$0$0(InterpretationRecordsDetailActivity r1, String r2) {
        Intrinsics.X0O(r2, "text");
        if (TextUtils.isEmpty(r2) == true) goto L14;
        r1.getMRecordsTitle().setText(r2);
        AIRecords r0 = r1.mAIRecords;
        if (r0 == null) goto L7;
        r0.setMAITitle(r2);
    L7:
        AIRecords r3 = r1.mAIRecords;
        if (r3 == null) goto L15;
        AIRecordsDao r4 = r1.mRecordsDao;
        Intrinsics.XXI(r3);
        if (r4.update(r3) <= 0) goto L16;
        I01XX0.XIi00iiXO(I01XX0.OXi001, null, 2, null);
        return true;
    L16:
        return true;
    L15:
        return true;
    L14:
        return true;
    }

    public final void exportTextToFile(@aa1 String r6) {
        Intrinsics.X0O(r6, "textToExport");
        sz0 r1 = sz0.OXO1;
        File r2 = r1.OXO1(Location.EXTERNAL, hn1.XIi00iiXO.O00().XIi00iiXO("share"), "record_text.txt");
    L6:
        e = move-exception;
        e.printStackTrace();
        return;
    L4:
        if (r2.exists() == false) goto L8;
        r2.delete();     // Catch: Exception -> L6
    L8:
        FileUtils.createOrExistsFile(r2);     // Catch: Exception -> L6
        FileWriter r3 = new FileWriter(r2);     // Catch: Exception -> L6
        r3.write(r6);     // Catch: Exception -> L6
        r3.close();     // Catch: Exception -> L6
        Uri r7 = r1.XO0O10(r2);     // Catch: Exception -> L6
        Intent r4 = new Intent("android.intent.action.SEND");     // Catch: Exception -> L6
        r4.putExtra("android.intent.extra.TEXT", "Share txt");     // Catch: Exception -> L6
        r4.putExtra("android.intent.extra.STREAM", r7);     // Catch: Exception -> L6
        r4.setType("*/*");     // Catch: Exception -> L6
        r4.addFlags(268435456);     // Catch: Exception -> L6
        startActivity(Intent.createChooser(r4, "Share txt"));     // Catch: Exception -> L6
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    public final PFMedium getMRecordsAudioDuration() {
        return (PFMedium) getValue();
    }

    public final ProgressBar getMRecordsAudioSeekBar() {
        return (ProgressBar) getValue();
    }

    public final PFMedium getMRecordsContent() {
        return (PFMedium) getValue();
    }

    public final PFMedium getMRecordsExtraInfo() {
        return (PFMedium) getValue();
    }

    public final PFMedium getMRecordsLanguage() {
        return (PFMedium) getValue();
    }

    public final PFMedium getMRecordsLocation() {
        return (PFMedium) getValue();
    }

    public final ImageView getMRecordsPlayAudioBtn() {
        return (ImageView) getValue();
    }

    public final ImageView getMRecordsPlayVolumeBtn() {
        return (ImageView) getValue();
    }

    public final PFMedium getMRecordsTime() {
        return (PFMedium) getValue();
    }

    public final PFMedium getMRecordsTitle() {
        return (PFMedium) getValue();
    }

    public final ImageView getMRecordsTitleEditImg() {
        return (ImageView) getValue();
    }

    public final PFMedium getMRecordsToLanguage() {
        return (PFMedium) getValue();
    }

    public final int getRecordingTime() {
        return this.recordingTime;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AIRecords");
        this.mAIRecords = (AIRecords) r3;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @SuppressLint({"DiscouragedApi"})
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.interpretation_record));
        int r1 = 0;
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_more_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        PFMedium r0 = getMRecordsTitle();
        AIRecords r2 = this.mAIRecords;
        String r3 = null;
        if (r2 == null) goto L5;
        String r4 = r2.getMAITitle();
    L6:
        r0.setText(r4);
        getMRecordsTitleEditImg().setOnClickListener(new la(this));
        PFMedium r5 = getMRecordsLanguage();
        AIRecords r6 = this.mAIRecords;
        if (r6 == null) goto L9;
        String r7 = r6.getMTranslateLanguage();
    L10:
        r5.setText(r7);
        PFMedium r8 = getMRecordsToLanguage();
        AIRecords r9 = this.mAIRecords;
        if (r9 == null) goto L13;
        String r10 = r9.getMTranslateToLanguage();
    L14:
        r8.setText(r10);
        PFMedium r11 = getMRecordsLocation();
        AIRecords r12 = this.mAIRecords;
        if (r12 == null) goto L21;
        String r13 = r12.getMLocation();
        if (r13 == null) goto L21;
        if (r13.length() != 0) goto L22;
        r13 = HelpFormatter.DEFAULT_OPT_PREFIX;
    L22:
        r11.setText(r13);
        PFMedium r14 = getMRecordsTime();
        AIRecords r15 = this.mAIRecords;
        if (r15 == null) goto L25;
        String r16 = r15.getMLocalTime();
    L26:
        r14.setText(r16);
        PFMedium r17 = getMRecordsContent();
        AIRecords r18 = this.mAIRecords;
        if (r18 == null) goto L29;
        String r19 = r18.getMContent();
    L30:
        r17.setText(r19);
        PFMedium r20 = getMRecordsExtraInfo();
        AIRecords r21 = this.mAIRecords;
        if (r21 == null) goto L33;
        String r22 = r21.getMExtraInfo();
    L34:
        r20.setText(r22);
        ProgressBar r23 = getMRecordsAudioSeekBar();
        AIRecords r24 = this.mAIRecords;
        if (r24 == null) goto L37;
        r1 = r24.getMAudioDuration();
    L37:
        r23.setMax(r1);
        PFMedium r25 = getMRecordsAudioDuration();
        AIRecords r26 = this.mAIRecords;
        if (r26 == null) goto L40;
        r3 = O0X11OiO.OX110i(r26.getMAudioDuration());
    L40:
        r25.setText(r3);
        getMRecordsPlayAudioBtn().setOnClickListener(new wa(this));
        getMRecordsPlayVolumeBtn().setOnClickListener(new za(this));
        return;
    L33:
        r22 = null;
        goto L34
    L29:
        r19 = null;
        goto L30
    L25:
        r16 = null;
    L21:
        r13 = null;
        goto L22
    L13:
        r10 = null;
        goto L14
    L9:
        r7 = null;
        goto L10
    L5:
        r4 = null;
        goto L6
    }

    public final boolean isOpenVolume() {
        return this.isOpenVolume;
    }

    public final boolean isPlayAudio() {
        return this.isPlayAudio;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_interpretation_records_detail;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        showDeleteTipPopup();
    }

    public final void setOpenVolume(boolean r1) {
        this.isOpenVolume = r1;
    }

    public final void setPlayAudio(boolean r1) {
        this.isPlayAudio = r1;
    }

    public final void setRecordingTime(int r1) {
        this.recordingTime = r1;
    }

    public final void showDeleteTipPopup() {
        if (this.mTranslationDetailPopup != null) goto L21;
        AIRecords r1 = this.mAIRecords;
        String r2 = null;
        if (r1 == null) goto L7;
        String r3 = r1.getMAudioPath();
    L8:
        File r0 = new File(r3);
        r16 r4 = new r16(getMContext());
        String r5 = getString(R.string.action_details);
        AIRecords r6 = this.mAIRecords;
        int r7 = 0;
        if (r6 == null) goto L11;
        int r8 = r6.getMAudioDuration();
    L12:
        r4.iXiX011(r5 + ": " + O0X11OiO.OX110i(r8));
        r4.XXO(getString(R.string.file_size_title_tip) + ": " + FileUtils.getSize(r0));
        String r9 = getString(R.string.number_of_words);
        AIRecords r10 = this.mAIRecords;
        if (r10 == null) goto L17;
        String r11 = r10.getMContent();
        if (r11 == null) goto L17;
        r7 = r11.length();
    L17:
        r4.Ii1iii0(r9 + ": " + r7);
        String r12 = getString(R.string.create_time_tip);
        AIRecords r13 = this.mAIRecords;
        if (r13 == null) goto L20;
        r2 = r13.getMLocalTime();
    L20:
        r4.O001I(r12 + ": " + r2);
        r4.iXiiiO(new ab(this));
        this.mTranslationDetailPopup = r4;
        goto L21
    L11:
        r8 = 0;
        goto L12
    L7:
        r3 = null;
    L21:
        r16 r14 = this.mTranslationDetailPopup;
        if (r14 == null) goto L25;
        r14.IIX1OXO();
        return;
    }
}
