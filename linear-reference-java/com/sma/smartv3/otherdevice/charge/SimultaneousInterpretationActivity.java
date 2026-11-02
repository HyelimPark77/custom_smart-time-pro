package com.sma.smartv3.otherdevice.charge;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ni4;
import com.android.mltcode.paycertificationapi.oi4;
import com.android.mltcode.paycertificationapi.pi4;
import com.android.mltcode.paycertificationapi.qi4;
import com.android.mltcode.paycertificationapi.ri4;
import com.android.mltcode.paycertificationapi.si4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ti4;
import com.android.mltcode.paycertificationapi.ui4;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.vi4;
import com.android.mltcode.paycertificationapi.w16;
import com.android.mltcode.paycertificationapi.wi4;
import com.android.mltcode.paycertificationapi.xi4;
import com.android.mltcode.paycertificationapi.yi4;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n69#2,3:279\n72#2,5:283\n1#3:282\n*S KotlinDebug\n*F\n+ 1 SimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity\n*L\n126#1:279,3\n126#1:283,5\n126#1:282\n*E\n"})
public final class SimultaneousInterpretationActivity extends BaseTranslationActivity {

    @aa1
    private final String TAG;
    private boolean isFirstIdentifySuccess;
    private boolean isFirstTranslateSuccess;
    private boolean isFirstTranslation;

    @tb1
    private AnimationDrawable mAnimationDrawable;

    @aa1
    private final Lazy mAudioPlayImg$delegate;

    @aa1
    private final Lazy mAudioPlayTime$delegate;

    @aa1
    private final Lazy mBtnTv$delegate;

    @tb1
    private uq mLoadPopup;

    @aa1
    private final Lazy mPlayAudioBtn$delegate;

    @aa1
    private final Lazy mTopLayout$delegate;

    @aa1
    private final Lazy mTopTv$delegate;

    @tb1
    private w16 mTranslationSavePopup;
    private int recordingTime;

    @tb1
    private Timer timer;

    public static final class OXO1 extends TimerTask {
        public final /* synthetic */ SimultaneousInterpretationActivity IO;

        public OXO1(SimultaneousInterpretationActivity r1) {
            this.IO = r1;
        }

        public static /* synthetic */ void OXO1(SimultaneousInterpretationActivity r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(SimultaneousInterpretationActivity r1) {
            r1.setRecordingTime(r1.getRecordingTime() + 1);
            SimultaneousInterpretationActivity.access$getMAudioPlayTime(r1).setText(O0X11OiO.OX110i(r1.getRecordingTime()));
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Handler r0 = this.IO.getMHandler();
            final SimultaneousInterpretationActivity r1 = this.IO;
            r0.post(new yi4(r1));
        }
    }

    public SimultaneousInterpretationActivity() {
        this.TAG = "SimultaneousInterpretationActivity";
        this.mTopLayout$delegate = LazyKt__LazyJVMKt.iO(new ri4(this));
        this.mTopTv$delegate = LazyKt__LazyJVMKt.iO(new si4(this));
        this.mBtnTv$delegate = LazyKt__LazyJVMKt.iO(new ti4(this));
        this.mAudioPlayImg$delegate = LazyKt__LazyJVMKt.iO(new ui4(this));
        this.mAudioPlayTime$delegate = LazyKt__LazyJVMKt.iO(new vi4(this));
        this.mPlayAudioBtn$delegate = LazyKt__LazyJVMKt.iO(new wi4(this));
        this.isFirstTranslation = true;
        this.isFirstIdentifySuccess = true;
        this.isFirstTranslateSuccess = true;
        setMAIFunctionType(AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType());
        setMAIRecordsType(2);
        setSteam(true);
        setAppSend(true);
    }

    public static /* synthetic */ TextView I1(SimultaneousInterpretationActivity r0) {
        return mAudioPlayTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView II1Xi0(SimultaneousInterpretationActivity r0) {
        return mAudioPlayImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IXXOO(SimultaneousInterpretationActivity r0) {
        return mBtnTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O1O(SimultaneousInterpretationActivity r0, String r1, String r2) {
        return showSaveDialog$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ View X01IiOiIi(SimultaneousInterpretationActivity r0) {
        return mTopLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXIIO1i11(SimultaneousInterpretationActivity r0) {
        endRecording$lambda$0(r0);
    }

    public static final /* synthetic */ TextView access$getMAudioPlayTime(SimultaneousInterpretationActivity r0) {
        return r0.getMAudioPlayTime();
    }

    private final void clickDownRecording() {
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.MICROPHONE}) == false) goto L6;
        setLangAndVoice();
        startRecording();
        return;
    L6:
        permission();
    }

    private final void endRecording(boolean r4) {
        getMPlayAudioBtn().setImageResource(R.drawable.simultaneous_play_icon);
        getMAudioPlayTime().setText(O0X11OiO.OX110i(0));
        AnimationDrawable r0 = this.mAnimationDrawable;
        if (r0 == null) goto L5;
        r0.stop();
    L5:
        Timer r1 = this.timer;
        if (r1 == null) goto L8;
        r1.cancel();
    L8:
        stopRecording(r4);
        if (r4 == true) goto L12;
        showLoadPopup();
        getMHandler().postDelayed(new oi4(this), 3000);
        return;
    }

    public static /* synthetic */ void endRecording$default(SimultaneousInterpretationActivity r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.endRecording(r1);
    }

    private static final void endRecording$lambda$0(SimultaneousInterpretationActivity r1) {
        uq r0 = r1.mLoadPopup;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        r1.showSaveDialog();
    }

    private final ImageView getMAudioPlayImg() {
        return (ImageView) getValue();
    }

    private final TextView getMAudioPlayTime() {
        return (TextView) getValue();
    }

    private final TextView getMBtnTv() {
        return (TextView) getValue();
    }

    private final ImageView getMPlayAudioBtn() {
        return (ImageView) getValue();
    }

    private final View getMTopLayout() {
        return (View) getValue();
    }

    private final TextView getMTopTv() {
        return (TextView) getValue();
    }

    public static /* synthetic */ void i010I(SimultaneousInterpretationActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ ImageView iI(SimultaneousInterpretationActivity r0) {
        return mPlayAudioBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iOO1ii1(SimultaneousInterpretationActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void iOOX010X(SimultaneousInterpretationActivity r0) {
        showSaveDialog$lambda$0$0$0(r0);
    }

    public static /* synthetic */ TextView iX(SimultaneousInterpretationActivity r0) {
        return mTopTv_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(SimultaneousInterpretationActivity r0, View r1) {
        if (RecordingManager.Companion.getInstance().isRecording() == false) goto L6;
        r0.endRecording(true);
        return;
    L6:
        r0.clickDownRecording();
    }

    private static final void initView$lambda$1(SimultaneousInterpretationActivity r0, View r1) {
        if (r0.isFirstTranslation == false) goto L6;
        r0.clickDownRecording();
        return;
    }

    private static final ImageView mAudioPlayImg_delegate$lambda$0(SimultaneousInterpretationActivity r1) {
        return (ImageView) r1.findViewById(R.id.simultaneous_interpretation_audio_play_img);
    }

    private static final TextView mAudioPlayTime_delegate$lambda$0(SimultaneousInterpretationActivity r1) {
        return (TextView) r1.findViewById(R.id.simultaneous_interpretation_audio_play_time);
    }

    private static final TextView mBtnTv_delegate$lambda$0(SimultaneousInterpretationActivity r1) {
        return (TextView) r1.findViewById(R.id.simultaneous_interpretation_btn_tv);
    }

    private static final ImageView mPlayAudioBtn_delegate$lambda$0(SimultaneousInterpretationActivity r1) {
        return (ImageView) r1.findViewById(R.id.simultaneous_interpretation_play_btn);
    }

    private static final View mTopLayout_delegate$lambda$0(SimultaneousInterpretationActivity r1) {
        return r1.findViewById(R.id.simultaneous_interpretation_top_layout);
    }

    private static final TextView mTopTv_delegate$lambda$0(SimultaneousInterpretationActivity r1) {
        return (TextView) r1.findViewById(R.id.simultaneous_interpretation_top_tv);
    }

    private final void setViewLayoutParams(TextView r7, int r8) {
        ViewGroup.LayoutParams r0 = r7.getLayoutParams();
        if ((r0 instanceof ViewGroup.MarginLayoutParams) == false) goto L9;
        ViewGroup.MarginLayoutParams r1 = (ViewGroup.MarginLayoutParams) r0;
        r1.setMargins(r1.leftMargin, r1.topMargin, r1.rightMargin, r1.bottomMargin);
        if ((r7.getLayoutParams() instanceof LinearLayout.LayoutParams) == false) goto L7;
        ((LinearLayout.LayoutParams) r0).gravity = r8;
    L7:
        r7.setLayoutParams(r0);
        return;
    }

    private final void showLoadPopup() {
        uq r0 = this.mLoadPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
    L6:
        if (this.mLoadPopup != null) goto L8;
        this.mLoadPopup = new uq(this);
    L8:
        uq r1 = this.mLoadPopup;
        if (r1 == null) goto L12;
        r1.IIX1OXO();
        return;
    }

    private final void showSaveDialog() {
        sendTranslationResult(getMTopTv().getText().toString(), getMBtnTv().getText().toString());
        w16 r0 = this.mTranslationSavePopup;
        if (r0 == null) goto L6;
        r0.dismiss();
    L6:
        if (this.mTranslationSavePopup != null) goto L8;
        w16 r1 = new w16(this);
        r1.iI(getMLeftLanguage().getName());
        r1.XXX11i(getMRightLanguage().getName());
        r1.X11iII1O1(O0X11OiO.OX110i(this.recordingTime));
        r1.iX1O1(new xi4(this));
        this.mTranslationSavePopup = r1;
    L8:
        w16 r2 = this.mTranslationSavePopup;
        if (r2 == null) goto L12;
        r2.IIX1OXO();
        return;
    }

    private static final Unit showSaveDialog$lambda$0$0(final SimultaneousInterpretationActivity r29, String r30, String r31) {
        Intrinsics.X0O(r30, "title");
        Intrinsics.X0O(r31, "location");
        if (r29.recordingTime <= 0) goto L36;
        r29.showLoadPopup();
        if (r29.getMAIRecords() != null) goto L7;
        r29.setMAIRecords(new AIRecords(0, 0, null, r29.getMAIFunctionType(), r29.getMAIRecordsType(), "", null, 0, 0, 0, null, null, null, null, null, 0, null, 131015, null));
    L7:
        AIRecords r3 = r29.getMAIRecords();
        if (r3 == null) goto L10;
        r3.setMAITitle(r30);
    L10:
        AIRecords r1 = r29.getMAIRecords();
        if (r1 == null) goto L13;
        r1.setMTranslateLanguage(r29.getMLeftLanguage().getName());
    L13:
        AIRecords r2 = r29.getMAIRecords();
        if (r2 == null) goto L16;
        r2.setMTranslateToLanguage(r29.getMRightLanguage().getName());
    L16:
        AIRecords r4 = r29.getMAIRecords();
        if (r4 == null) goto L19;
        r4.setMLocation(r31);
    L19:
        AIRecords r5 = r29.getMAIRecords();
        if (r5 == null) goto L22;
        r5.setMAudioDuration(r29.recordingTime);
    L22:
        AIRecords r6 = r29.getMAIRecords();
        if (r6 == null) goto L25;
        r6.setMContent(r29.getMTopTv().getText().toString());
    L25:
        AIRecords r7 = r29.getMAIRecords();
        if (r7 == null) goto L28;
        r7.setMExtraInfo(r29.getMBtnTv().getText().toString());
    L28:
        File r8 = new File(PathUtils.getExternalAppDataPath() + "/files/" + System.currentTimeMillis() + "_record.pcm");
        FileUtils.copy(VoiceManager.INSTANCE.getMPcmFile(), r8);
        AIRecords r9 = r29.getMAIRecords();
        if (r9 == null) goto L31;
        String r10 = r8.getAbsolutePath();
        Intrinsics.O10IXXX0X(r10, "getAbsolutePath(...)");
        r9.setMAudioPath(r10);
    L31:
        r29.saveDBRecord();
        AIRecords r11 = r29.getMAIRecords();
        Intrinsics.XXI(r11);
        if (r29.addSendRecord(r11) <= 0) goto L34;
        ToastUtils.showLong(r29.getString(R.string.save) + " " + r29.getString(R.string.success_save), new Object[0]);
    L35:
        r29.getMHandler().postDelayed(new qi4(r29), 1500);
    L38:
        return Unit.OXO1;
    L34:
        ToastUtils.showLong(r29.getString(R.string.save) + " " + r29.getString(R.string.fail), new Object[0]);
        goto L35
    L36:
        ToastUtils.showLong(r29.getString(R.string.save) + " " + r29.getString(R.string.fail) + " , " + r29.getString(R.string.recording_translate_error_tip), new Object[0]);
        goto L38
    }

    private static final void showSaveDialog$lambda$0$0$0(SimultaneousInterpretationActivity r4) {
        i1O0OXO1O.OXO1.OXO1(r4.TAG + " mAIRecords = " + r4.getMAIRecords());
        uq r0 = r4.mLoadPopup;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        w16 r5 = r4.mTranslationSavePopup;
        if (r5 == null) goto L9;
        r5.dismiss();
        return;
    }

    @SuppressLint({"DiscouragedApi"})
    private final void startAudioRecording() {
        getMTopTv().setText(getString(R.string.in_the_recording));
        getMPlayAudioBtn().setImageResource(R.drawable.simultaneous_pause_icon);
        if (this.mAnimationDrawable != null) goto L5;
        Drawable r0 = getResources().getDrawable(R.drawable.audio_play_animation_list);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        this.mAnimationDrawable = (AnimationDrawable) r0;
    L5:
        getMAudioPlayImg().setImageDrawable(this.mAnimationDrawable);
        AnimationDrawable r1 = this.mAnimationDrawable;
        if (r1 == null) goto L8;
        r1.start();
    L8:
        this.recordingTime = 0;
        Timer r2 = this.timer;
        if (r2 == null) goto L11;
        r2.cancel();
    L11:
        Timer r3 = new Timer();
        this.timer = r3;
        r3.scheduleAtFixedRate(new OXO1(this), 0, 1000);
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void disRecordingPopup() {
        super.disRecordingPopup();
        endRecording$default(this, false, 1, null);
    }

    @tb1
    public final AnimationDrawable getMAnimationDrawable() {
        return this.mAnimationDrawable;
    }

    public final int getRecordingTime() {
        return this.recordingTime;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        super.init(r1);
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.simultaneous_interpretation));
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_simultaneous_right_img);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getMPlayAudioBtn().setOnClickListener(new ni4(this));
        getMTopLayout().setOnClickListener(new pi4(this));
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_simultaneous_interpretation;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void notifyViewData() {
        super.notifyViewData();
        AIRecords r0 = getMAIRecords();
        String r1 = null;
        if (r0 == null) goto L16;
        String r2 = r0.getMContent();
        if (r2 == null) goto L16;
        if (r2.length() <= 0) goto L16;
        if (this.isFirstIdentifySuccess == false) goto L11;
        TextView r3 = getMTopTv();
        Intrinsics.O10IXXX0X(r3, "<get-mTopTv>(...)");
        setViewLayoutParams(r3, 3);
        getMTopTv().setGravity(3);
    L11:
        TextView r4 = getMTopTv();
        AIRecords r5 = getMAIRecords();
        if (r5 == null) goto L14;
        String r6 = r5.getMContent();
    L15:
        r4.setText(r6);
        goto L16
    L14:
        r6 = null;
    L16:
        AIRecords r7 = getMAIRecords();
        if (r7 == null) goto L30;
        String r8 = r7.getMExtraInfo();
        if (r8 != null) goto L21;
        return;
    L21:
        if (r8.length() > 0) goto L23;
        return;
    L23:
        if (this.isFirstTranslateSuccess == false) goto L25;
        TextView r9 = getMBtnTv();
        Intrinsics.O10IXXX0X(r9, "<get-mBtnTv>(...)");
        setViewLayoutParams(r9, 3);
    L25:
        TextView r10 = getMBtnTv();
        AIRecords r11 = getMAIRecords();
        if (r11 == null) goto L28;
        r1 = r11.getMExtraInfo();
    L28:
        r10.setText(r1);
        return;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isFirstTranslation == true) goto L6;
        getMTopTv().setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        return;
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, InterpretationRecordsActivity.class));
    }

    public final void setMAnimationDrawable(@tb1 AnimationDrawable r1) {
        this.mAnimationDrawable = r1;
    }

    public final void setRecordingTime(int r1) {
        this.recordingTime = r1;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRecording() {
        if (this.isFirstTranslation == false) goto L5;
        this.isFirstTranslation = false;
        getMTopTv().setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    L5:
        startAudioRecording();
        super.startRecording();
    }
}
