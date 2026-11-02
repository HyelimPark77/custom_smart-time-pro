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
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.w16;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.otherdevice.charge.SimultaneousInterpretationActivity;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n69#2,3:279\n72#2,5:283\n1#3:282\n*S KotlinDebug\n*F\n+ 1 SimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity\n*L\n126#1:279,3\n126#1:283,5\n126#1:282\n*E\n"})
public final class SimultaneousInterpretationActivity extends BaseTranslationActivity {

    @tb1
    private AnimationDrawable mAnimationDrawable;

    @tb1
    private C3006uq mLoadPopup;

    @tb1
    private w16 mTranslationSavePopup;
    private int recordingTime;

    @tb1
    private Timer timer;

    @aa1
    private final String TAG = "SimultaneousInterpretationActivity";

    @aa1
    private final Lazy mTopLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ri4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SimultaneousInterpretationActivity.mTopLayout_delegate$lambda$0(this.f10819IO);
        }
    });

    @aa1
    private final Lazy mTopTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.si4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SimultaneousInterpretationActivity.mTopTv_delegate$lambda$0(this.f11054IO);
        }
    });

    @aa1
    private final Lazy mBtnTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ti4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SimultaneousInterpretationActivity.mBtnTv_delegate$lambda$0(this.f11261IO);
        }
    });

    @aa1
    private final Lazy mAudioPlayImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ui4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SimultaneousInterpretationActivity.mAudioPlayImg_delegate$lambda$0(this.f11492IO);
        }
    });

    @aa1
    private final Lazy mAudioPlayTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vi4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SimultaneousInterpretationActivity.mAudioPlayTime_delegate$lambda$0(this.f11724IO);
        }
    });

    @aa1
    private final Lazy mPlayAudioBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wi4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SimultaneousInterpretationActivity.mPlayAudioBtn_delegate$lambda$0(this.f11953IO);
        }
    });
    private boolean isFirstTranslation = true;
    private boolean isFirstIdentifySuccess = true;
    private boolean isFirstTranslateSuccess = true;

    public static final class OXO1 extends TimerTask {
        public OXO1() {
        }

        public static final void XIi00iiXO(SimultaneousInterpretationActivity simultaneousInterpretationActivity) {
            simultaneousInterpretationActivity.setRecordingTime(simultaneousInterpretationActivity.getRecordingTime() + 1);
            simultaneousInterpretationActivity.getMAudioPlayTime().setText(O0X11OiO.OX110i(simultaneousInterpretationActivity.getRecordingTime()));
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Handler mHandler = SimultaneousInterpretationActivity.this.getMHandler();
            final SimultaneousInterpretationActivity simultaneousInterpretationActivity = SimultaneousInterpretationActivity.this;
            mHandler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.yi4
                @Override // java.lang.Runnable
                public final void run() {
                    SimultaneousInterpretationActivity.OXO1.XIi00iiXO(simultaneousInterpretationActivity);
                }
            });
        }
    }

    public SimultaneousInterpretationActivity() {
        setMAIFunctionType(AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType());
        setMAIRecordsType(2);
        setSteam(true);
        setAppSend(true);
    }

    private final void clickDownRecording() {
        if (!PermissionUtils.isGranted(PermissionConstants.MICROPHONE)) {
            permission();
        } else {
            setLangAndVoice();
            startRecording();
        }
    }

    private final void endRecording(boolean z) {
        getMPlayAudioBtn().setImageResource(R.drawable.simultaneous_play_icon);
        getMAudioPlayTime().setText(O0X11OiO.OX110i(0));
        AnimationDrawable animationDrawable = this.mAnimationDrawable;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        stopRecording(z);
        if (z) {
            return;
        }
        showLoadPopup();
        getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.oi4
            @Override // java.lang.Runnable
            public final void run() {
                SimultaneousInterpretationActivity.endRecording$lambda$0(this.f10148IO);
            }
        }, 3000L);
    }

    public static /* synthetic */ void endRecording$default(SimultaneousInterpretationActivity simultaneousInterpretationActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        simultaneousInterpretationActivity.endRecording(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endRecording$lambda$0(SimultaneousInterpretationActivity simultaneousInterpretationActivity) {
        C3006uq c3006uq = simultaneousInterpretationActivity.mLoadPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
        simultaneousInterpretationActivity.showSaveDialog();
    }

    private final ImageView getMAudioPlayImg() {
        return (ImageView) this.mAudioPlayImg$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getMAudioPlayTime() {
        return (TextView) this.mAudioPlayTime$delegate.getValue();
    }

    private final TextView getMBtnTv() {
        return (TextView) this.mBtnTv$delegate.getValue();
    }

    private final ImageView getMPlayAudioBtn() {
        return (ImageView) this.mPlayAudioBtn$delegate.getValue();
    }

    private final View getMTopLayout() {
        return (View) this.mTopLayout$delegate.getValue();
    }

    private final TextView getMTopTv() {
        return (TextView) this.mTopTv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SimultaneousInterpretationActivity simultaneousInterpretationActivity, View view) {
        if (RecordingManager.Companion.getInstance().isRecording()) {
            simultaneousInterpretationActivity.endRecording(true);
        } else {
            simultaneousInterpretationActivity.clickDownRecording();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SimultaneousInterpretationActivity simultaneousInterpretationActivity, View view) {
        if (simultaneousInterpretationActivity.isFirstTranslation) {
            simultaneousInterpretationActivity.clickDownRecording();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mAudioPlayImg_delegate$lambda$0(SimultaneousInterpretationActivity simultaneousInterpretationActivity) {
        return (ImageView) simultaneousInterpretationActivity.findViewById(R.id.simultaneous_interpretation_audio_play_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mAudioPlayTime_delegate$lambda$0(SimultaneousInterpretationActivity simultaneousInterpretationActivity) {
        return (TextView) simultaneousInterpretationActivity.findViewById(R.id.simultaneous_interpretation_audio_play_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mBtnTv_delegate$lambda$0(SimultaneousInterpretationActivity simultaneousInterpretationActivity) {
        return (TextView) simultaneousInterpretationActivity.findViewById(R.id.simultaneous_interpretation_btn_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mPlayAudioBtn_delegate$lambda$0(SimultaneousInterpretationActivity simultaneousInterpretationActivity) {
        return (ImageView) simultaneousInterpretationActivity.findViewById(R.id.simultaneous_interpretation_play_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mTopLayout_delegate$lambda$0(SimultaneousInterpretationActivity simultaneousInterpretationActivity) {
        return simultaneousInterpretationActivity.findViewById(R.id.simultaneous_interpretation_top_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTopTv_delegate$lambda$0(SimultaneousInterpretationActivity simultaneousInterpretationActivity) {
        return (TextView) simultaneousInterpretationActivity.findViewById(R.id.simultaneous_interpretation_top_tv);
    }

    private final void setViewLayoutParams(TextView textView, int i) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            if (textView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = i;
            }
            textView.setLayoutParams(layoutParams);
        }
    }

    private final void showLoadPopup() {
        C3006uq c3006uq = this.mLoadPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
        if (this.mLoadPopup == null) {
            this.mLoadPopup = new C3006uq(this);
        }
        C3006uq c3006uq2 = this.mLoadPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
    }

    private final void showSaveDialog() {
        sendTranslationResult(getMTopTv().getText().toString(), getMBtnTv().getText().toString());
        w16 w16Var = this.mTranslationSavePopup;
        if (w16Var != null) {
            w16Var.dismiss();
        }
        if (this.mTranslationSavePopup == null) {
            w16 w16Var2 = new w16(this);
            w16Var2.m3247iI(getMLeftLanguage().getName());
            w16Var2.XXX11i(getMRightLanguage().getName());
            w16Var2.X11iII1O1(O0X11OiO.OX110i(this.recordingTime));
            w16Var2.iX1O1(new Function2() { // from class: com.android.mltcode.paycertificationapi.xi4
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj, Object obj2) {
                    return SimultaneousInterpretationActivity.showSaveDialog$lambda$0$0(this.f12175IO, (String) obj, (String) obj2);
                }
            });
            this.mTranslationSavePopup = w16Var2;
        }
        w16 w16Var3 = this.mTranslationSavePopup;
        if (w16Var3 != null) {
            w16Var3.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSaveDialog$lambda$0$0(final SimultaneousInterpretationActivity simultaneousInterpretationActivity, String title, String location) {
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(location, "location");
        if (simultaneousInterpretationActivity.recordingTime > 0) {
            simultaneousInterpretationActivity.showLoadPopup();
            if (simultaneousInterpretationActivity.getMAIRecords() == null) {
                simultaneousInterpretationActivity.setMAIRecords(new AIRecords(0, 0L, null, simultaneousInterpretationActivity.getMAIFunctionType(), simultaneousInterpretationActivity.getMAIRecordsType(), "", null, 0, 0, 0, null, null, null, null, null, 0, null, 131015, null));
            }
            AIRecords mAIRecords = simultaneousInterpretationActivity.getMAIRecords();
            if (mAIRecords != null) {
                mAIRecords.setMAITitle(title);
            }
            AIRecords mAIRecords2 = simultaneousInterpretationActivity.getMAIRecords();
            if (mAIRecords2 != null) {
                mAIRecords2.setMTranslateLanguage(simultaneousInterpretationActivity.getMLeftLanguage().getName());
            }
            AIRecords mAIRecords3 = simultaneousInterpretationActivity.getMAIRecords();
            if (mAIRecords3 != null) {
                mAIRecords3.setMTranslateToLanguage(simultaneousInterpretationActivity.getMRightLanguage().getName());
            }
            AIRecords mAIRecords4 = simultaneousInterpretationActivity.getMAIRecords();
            if (mAIRecords4 != null) {
                mAIRecords4.setMLocation(location);
            }
            AIRecords mAIRecords5 = simultaneousInterpretationActivity.getMAIRecords();
            if (mAIRecords5 != null) {
                mAIRecords5.setMAudioDuration(simultaneousInterpretationActivity.recordingTime);
            }
            AIRecords mAIRecords6 = simultaneousInterpretationActivity.getMAIRecords();
            if (mAIRecords6 != null) {
                mAIRecords6.setMContent(simultaneousInterpretationActivity.getMTopTv().getText().toString());
            }
            AIRecords mAIRecords7 = simultaneousInterpretationActivity.getMAIRecords();
            if (mAIRecords7 != null) {
                mAIRecords7.setMExtraInfo(simultaneousInterpretationActivity.getMBtnTv().getText().toString());
            }
            File file = new File(PathUtils.getExternalAppDataPath() + "/files/" + System.currentTimeMillis() + "_record.pcm");
            FileUtils.copy(VoiceManager.INSTANCE.getMPcmFile(), file);
            AIRecords mAIRecords8 = simultaneousInterpretationActivity.getMAIRecords();
            if (mAIRecords8 != null) {
                String absolutePath = file.getAbsolutePath();
                Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
                mAIRecords8.setMAudioPath(absolutePath);
            }
            simultaneousInterpretationActivity.saveDBRecord();
            AIRecords mAIRecords9 = simultaneousInterpretationActivity.getMAIRecords();
            Intrinsics.XXI(mAIRecords9);
            if (simultaneousInterpretationActivity.addSendRecord(mAIRecords9) > 0) {
                ToastUtils.showLong(simultaneousInterpretationActivity.getString(R.string.save) + " " + simultaneousInterpretationActivity.getString(R.string.success_save), new Object[0]);
            } else {
                ToastUtils.showLong(simultaneousInterpretationActivity.getString(R.string.save) + " " + simultaneousInterpretationActivity.getString(R.string.fail), new Object[0]);
            }
            simultaneousInterpretationActivity.getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.qi4
                @Override // java.lang.Runnable
                public final void run() {
                    SimultaneousInterpretationActivity.showSaveDialog$lambda$0$0$0(this.f10606IO);
                }
            }, 1500L);
        } else {
            ToastUtils.showLong(simultaneousInterpretationActivity.getString(R.string.save) + " " + simultaneousInterpretationActivity.getString(R.string.fail) + " , " + simultaneousInterpretationActivity.getString(R.string.recording_translate_error_tip), new Object[0]);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSaveDialog$lambda$0$0$0(SimultaneousInterpretationActivity simultaneousInterpretationActivity) {
        i1O0OXO1O.OXO1.OXO1(simultaneousInterpretationActivity.TAG + " mAIRecords = " + simultaneousInterpretationActivity.getMAIRecords());
        C3006uq c3006uq = simultaneousInterpretationActivity.mLoadPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
        w16 w16Var = simultaneousInterpretationActivity.mTranslationSavePopup;
        if (w16Var != null) {
            w16Var.dismiss();
        }
    }

    @SuppressLint({"DiscouragedApi"})
    private final void startAudioRecording() {
        getMTopTv().setText(getString(R.string.in_the_recording));
        getMPlayAudioBtn().setImageResource(R.drawable.simultaneous_pause_icon);
        if (this.mAnimationDrawable == null) {
            Drawable drawable = getResources().getDrawable(R.drawable.audio_play_animation_list);
            Intrinsics.X1ii(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            this.mAnimationDrawable = (AnimationDrawable) drawable;
        }
        getMAudioPlayImg().setImageDrawable(this.mAnimationDrawable);
        AnimationDrawable animationDrawable = this.mAnimationDrawable;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        this.recordingTime = 0;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.timer = timer2;
        timer2.scheduleAtFixedRate(new OXO1(), 0L, 1000L);
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

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        super.init(bundle);
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.simultaneous_interpretation));
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_simultaneous_right_img);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getMPlayAudioBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ni4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimultaneousInterpretationActivity.initView$lambda$0(this.f9944IO, view);
            }
        });
        getMTopLayout().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.pi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimultaneousInterpretationActivity.initView$lambda$1(this.f10371IO, view);
            }
        });
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_simultaneous_interpretation;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void notifyViewData() {
        String mExtraInfo;
        String mContent;
        super.notifyViewData();
        AIRecords mAIRecords = getMAIRecords();
        if (mAIRecords != null && (mContent = mAIRecords.getMContent()) != null && mContent.length() > 0) {
            if (this.isFirstIdentifySuccess) {
                TextView mTopTv = getMTopTv();
                Intrinsics.O10IXXX0X(mTopTv, "<get-mTopTv>(...)");
                setViewLayoutParams(mTopTv, 3);
                getMTopTv().setGravity(3);
            }
            TextView mTopTv2 = getMTopTv();
            AIRecords mAIRecords2 = getMAIRecords();
            mTopTv2.setText(mAIRecords2 != null ? mAIRecords2.getMContent() : null);
        }
        AIRecords mAIRecords3 = getMAIRecords();
        if (mAIRecords3 == null || (mExtraInfo = mAIRecords3.getMExtraInfo()) == null || mExtraInfo.length() <= 0) {
            return;
        }
        if (this.isFirstTranslateSuccess) {
            TextView mBtnTv = getMBtnTv();
            Intrinsics.O10IXXX0X(mBtnTv, "<get-mBtnTv>(...)");
            setViewLayoutParams(mBtnTv, 3);
        }
        TextView mBtnTv2 = getMBtnTv();
        AIRecords mAIRecords4 = getMAIRecords();
        mBtnTv2.setText(mAIRecords4 != null ? mAIRecords4.getMExtraInfo() : null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isFirstTranslation) {
            return;
        }
        getMTopTv().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) InterpretationRecordsActivity.class));
    }

    public final void setMAnimationDrawable(@tb1 AnimationDrawable animationDrawable) {
        this.mAnimationDrawable = animationDrawable;
    }

    public final void setRecordingTime(int i) {
        this.recordingTime = i;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRecording() {
        if (this.isFirstTranslation) {
            this.isFirstTranslation = false;
            getMTopTv().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        startAudioRecording();
        super.startRecording();
    }
}
