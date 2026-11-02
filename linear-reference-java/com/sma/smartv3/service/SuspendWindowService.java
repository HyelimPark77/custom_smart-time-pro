package com.sma.smartv3.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.Observer;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ah5;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bh5;
import com.android.mltcode.paycertificationapi.ch5;
import com.android.mltcode.paycertificationapi.dh5;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.eh5;
import com.android.mltcode.paycertificationapi.fh5;
import com.android.mltcode.paycertificationapi.fq1;
import com.android.mltcode.paycertificationapi.gh5;
import com.android.mltcode.paycertificationapi.hh5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ih5;
import com.android.mltcode.paycertificationapi.jh5;
import com.android.mltcode.paycertificationapi.kh5;
import com.android.mltcode.paycertificationapi.lh5;
import com.android.mltcode.paycertificationapi.mh5;
import com.android.mltcode.paycertificationapi.nh5;
import com.android.mltcode.paycertificationapi.oh5;
import com.android.mltcode.paycertificationapi.ph5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qh5;
import com.android.mltcode.paycertificationapi.rg5;
import com.android.mltcode.paycertificationapi.rh5;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sg5;
import com.android.mltcode.paycertificationapi.sh5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tg5;
import com.android.mltcode.paycertificationapi.th5;
import com.android.mltcode.paycertificationapi.ug5;
import com.android.mltcode.paycertificationapi.uh5;
import com.android.mltcode.paycertificationapi.vg5;
import com.android.mltcode.paycertificationapi.wg5;
import com.android.mltcode.paycertificationapi.xg5;
import com.android.mltcode.paycertificationapi.yg5;
import com.android.mltcode.paycertificationapi.zg5;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.model.ViewModelMain;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.main.MainActivity;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.FloatFrameLayout;
import com.szabh.smable3.entity.BleVoice;
import com.szabh.smable3.entity.Languages;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSuspendWindowService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendWindowService.kt\ncom/sma/smartv3/service/SuspendWindowService\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,1026:1\n90#2:1027\n90#2:1028\n439#3:1029\n*S KotlinDebug\n*F\n+ 1 SuspendWindowService.kt\ncom/sma/smartv3/service/SuspendWindowService\n*L\n445#1:1027\n449#1:1028\n858#1:1029\n*E\n"})
public final class SuspendWindowService extends LifecycleService {

    @aa1
    private final String CHANNEL_ID;
    private final int NOTIFICATION_ID;

    @aa1
    private final String TAG;

    @aa1
    private String arsAccent;

    @aa1
    private String arsLanguage;
    public View bottom_line;
    private boolean broadcastCheckStatus;
    public CheckBox broadcast_check;
    public ClipboardManager clipboard;
    public FrameLayout fl_recording;

    @tb1
    private FloatFrameLayout floatRootView;

    @aa1
    private final Handler handle;
    public ImageView img_close;
    public ImageView img_record;
    public ImageView img_record_show;
    public ImageView img_recording;
    public ImageView img_recording_animation;
    private boolean isAddListData;
    private boolean isEndTranslation;
    private boolean isShow;
    private boolean isShowRecordImg;
    private boolean isStartAnalysis;

    @aa1
    private String lang;
    public View ll_hide_content;
    public LinearLayout ll_show_set;

    @aa1
    private String mContent;

    @aa1
    private String mContentResult;

    @aa1
    private String mExtraInfo;
    public List<LanguageTranslationData> mLanguageTranslationList;
    public LanguageTranslationData mLeftLanguage;
    public LanguageTranslationData mRightLanguage;

    @aa1
    private final MicrosoftSDKManage.iO microsoftCallBack;
    private boolean onlyshowTranslate;
    public CheckBox original_check;
    public AnimationDrawable recordAnimation;

    @aa1
    private final RecordingManager.OnRecordingCallback recordingCallBack;
    public View rl_show_all;
    public View root;
    private boolean showOriginalTextStatus;

    @aa1
    private String targetLang;
    private boolean translateCheckStatus;
    public CheckBox translate_check;

    @aa1
    private String ttsTargetLang;

    @aa1
    private String ttsVoiceName;
    public TextView tv_original_t;
    public TextView tv_translate;
    public TextView tv_translate_t;

    @tb1
    private WindowManager windowManager;

    public static final class IiI10X implements RecordingManager.OnRecordingCallback {
        public final /* synthetic */ SuspendWindowService OXO1;

        public IiI10X(SuspendWindowService r1) {
            this.OXO1 = r1;
        }

        public static final void IiI10X(SuspendWindowService r0) {
            r0.disRecordingPopup();
        }

        public static final void O00(SuspendWindowService r0) {
            r0.showRecordingPopup();
        }

        public static /* synthetic */ void OXO1(SuspendWindowService r0) {
            IiI10X(r0);
        }

        public static /* synthetic */ void XIi00iiXO(SuspendWindowService r0) {
            O00(r0);
        }

        public static final void XO0O10(SuspendWindowService r0) {
            r0.showRecordingPopup();
        }

        public static /* synthetic */ void iO(SuspendWindowService r0) {
            XO0O10(r0);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onBeforeRecording() {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.access$getTAG$p(this.OXO1) + " onBeforeRecording ");
            Handler r0 = SuspendWindowService.access$getHandle$p(this.OXO1);
            final SuspendWindowService r1 = this.OXO1;
            r0.post(new rh5(r1));
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResult(AITranslation r4) {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.access$getTAG$p(this.OXO1) + " onRecordResult result = " + r4);
            if (r4 != null) goto L5;
            return;
        L5:
            if (r4.getStatus() != 2) goto L11;
            DcsTtsPlayer.INSTANCE.stop();
            this.OXO1.setMContent(StringsKt__StringsKt.iX1X1(r4.getText()).toString());
            this.OXO1.setMExtraInfo(StringsKt__StringsKt.iX1X1(r4.getDst()).toString());
            if (this.OXO1.getMContent().length() <= 0) goto L12;
            SuspendWindowService r5 = this.OXO1;
            r5.sendTranslate(r5.getMContent());
            return;
        L12:
            return;
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResultError(String r5) {
            Intrinsics.X0O(r5, "error");
            SuspendWindowService r6 = this.OXO1;
            String r0 = r6.getString(R.string.speech_recognition_error);
            Intrinsics.O10IXXX0X(r0, "getString(...)");
            String r2 = this.OXO1.getString(R.string.failed_in_translation);
            Intrinsics.O10IXXX0X(r2, "getString(...)");
            r6.sendTranslationResult(r0, r2);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public /* bridge */ void onRecordResultLanguage(AISpeech r1) {
            super.onRecordResultLanguage(r1);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStartRecording() {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.access$getTAG$p(this.OXO1) + " onStartRecording ");
            Handler r0 = SuspendWindowService.access$getHandle$p(this.OXO1);
            final SuspendWindowService r1 = this.OXO1;
            r0.post(new sh5(r1));
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStopRecording() {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.access$getTAG$p(this.OXO1) + " onStartRecording ");
            Handler r0 = SuspendWindowService.access$getHandle$p(this.OXO1);
            final SuspendWindowService r1 = this.OXO1;
            r0.post(new th5(r1));
        }
    }

    public static final class O00 implements MicrosoftSDKManage.iO {
        public final /* synthetic */ SuspendWindowService OXO1;

        public O00(SuspendWindowService r1) {
            this.OXO1 = r1;
        }

        public static final void IiI10X(SuspendWindowService r1) {
            r1.setMContentResult("");
            r1.showRecordingPopup();
        }

        public static final void O00(int r1, SuspendWindowService r2, String r3) {
            if (r1 != 1) goto L8;
            r2.setMContent(r3);
            r2.getTv_original_t().setText(r3);
            r2.getTv_original_t().setVisibility(0);
            if (r2.isAddListData() == true) goto L9;
            r2.setAddListData(true);
            return;
        L9:
            return;
        }

        public static /* synthetic */ void XIi00iiXO(int r0, SuspendWindowService r1, String r2) {
            O00(r0, r1, r2);
        }

        public static /* synthetic */ void XO0O10(SuspendWindowService r0) {
            XOO0ii0(r0);
        }

        public static final void XOO0ii0(SuspendWindowService r6) {
            r6.disRecordingPopup();
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            r0.OXO1(SuspendWindowService.access$getTAG$p(r6) + "   onStopTransmission  isEndTranslation = " + r6.isEndTranslation() + " ");
            boolean r2 = false;
            r6.showRecordingPopup(false);
            if (r6.isEndTranslation() == false) goto L13;
            r6.setEndTranslation(false);
            r6.setAddListData(false);
            VoiceManager.INSTANCE.setSpeechRecRunning(false);
            r0.OXO1(SuspendWindowService.access$getTAG$p(r6) + "  sendTranslate onStopTransmission  show content = " + r6.getMContentResult() + " ");
            if (r6.getMContentResult().length() <= 0) goto L8;
            r0.OXO1(SuspendWindowService.access$getTAG$p(r6) + "  sendTranslate onStopTransmission  content = " + r6.getMContentResult() + " ");
            SuspendWindowService.access$sendTranslationResultInput(r6, r6.getMContentResult());
            return;
        L8:
            String r1 = SuspendWindowService.access$getTAG$p(r6);
            if (r6.getMContentResult().length() <= 0) goto L11;
            r2 = true;
        L11:
            r0.OXO1(r1 + "  sendTranslate onStopTransmission  content = " + r2);
            DcsTtsPlayer.INSTANCE.stop();
            String r3 = r6.getString(R.string.no_content_detected);
            Intrinsics.O10IXXX0X(r3, "getString(...)");
            SuspendWindowService.access$sendTranslationResultInput(r6, r3);
            return;
        }

        public static /* synthetic */ void iO(SuspendWindowService r0) {
            IiI10X(r0);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onIdentifyResults(final int r4, final String r5) {
            Intrinsics.X0O(r5, "str");
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            r0.OXO1(SuspendWindowService.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults Show Content is : " + r5);
            this.OXO1.setMContentResult(r5);
            if (r4 != 2) goto L5;
            r0.OXO1(SuspendWindowService.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults content = " + r5);
            this.OXO1.setMContentResult(r5);
        L5:
            Handler r1 = SuspendWindowService.access$getHandle$p(this.OXO1);
            final SuspendWindowService r2 = this.OXO1;
            r1.post(new ph5(r4, r2, r5));
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public /* bridge */ void onIdentifyResultsDetectedLanguage(int r1, String r2, String r3) {
            super.onIdentifyResultsDetectedLanguage(r1, r2, r3);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.access$getTAG$p(this.OXO1) + " onStartTransmission ");
            Handler r0 = SuspendWindowService.access$getHandle$p(this.OXO1);
            final SuspendWindowService r1 = this.OXO1;
            r0.post(new oh5(r1));
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStopTransmission() {
            Handler r0 = SuspendWindowService.access$getHandle$p(this.OXO1);
            final SuspendWindowService r1 = this.OXO1;
            r0.post(new qh5(r1));
        }
    }

    public static final class OXO1 implements View.OnTouchListener {

        @aa1
        public final WindowManager I1;

        @aa1
        public final WindowManager.LayoutParams IO;
        public int X11iII1O1;
        public int XXX11i;

        @aa1
        public final String iX1O1;

        public OXO1(@aa1 WindowManager.LayoutParams r2, @aa1 WindowManager r3) {
            Intrinsics.X0O(r2, "wl");
            Intrinsics.X0O(r3, "windowManager");
            this.IO = r2;
            this.I1 = r3;
            this.iX1O1 = "ItemViewTouchListener";
        }

        @aa1
        public final WindowManager OXO1() {
            return this.I1;
        }

        @aa1
        public final WindowManager.LayoutParams XIi00iiXO() {
            return this.IO;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@aa1 View r9, @aa1 MotionEvent r10) {
            Intrinsics.X0O(r9, "view");
            Intrinsics.X0O(r10, "motionEvent");
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            r0.OXO1(this.iX1O1 + " onTouch event = " + r10);
            int r1 = r10.getAction();
            if (r1 != 0) goto L5;
            this.X11iII1O1 = (int) r10.getRawX();
            this.XXX11i = (int) r10.getRawY();
            return false;
        L5:
            if (r1 != 2) goto L17;
            int r2 = (int) r10.getRawX();
            int r11 = (int) r10.getRawY();
            int r3 = this.XXX11i;
            if (r3 == 0) goto L12;
            int r4 = this.X11iII1O1;
            int r5 = r2 - r4;
            int r6 = r11 - r3;
            r0.OXO1(this.iX1O1 + " movedX = " + r5 + " , movedY = " + r6 + " , x = " + r4 + " , y = " + r3 + " , nowX = " + r2 + " , nowY = " + r11);
            WindowManager.LayoutParams r7 = this.IO;
            r7.x = r7.x + r5;
            r7.y = r7.y + r6;
            WindowManager r8 = this.I1;
            if (r8 == null) goto L12;
            r8.updateViewLayout(r9, r7);
        L12:
            this.X11iII1O1 = r2;
            this.XXX11i = r11;
            return false;
        L17:
            return false;
        }
    }

    public static final class XIi00iiXO {

        @aa1
        public String OXO1;

        @aa1
        public String XIi00iiXO;

        /* JADX WARN: Multi-variable type inference failed */
        public XIi00iiXO() {
            Object[] r0 = 0 == true ? 1 : 0;
            this(null, r0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ XIi00iiXO XO0O10(XIi00iiXO r0, String r1, String r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.OXO1;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.XIi00iiXO;
        L9:
            return r0.iO(r1, r2);
        }

        public final void I0IIOi(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.XIi00iiXO = r2;
        }

        @aa1
        public final String IiI10X() {
            return this.XIi00iiXO;
        }

        @aa1
        public final String O00() {
            return this.OXO1;
        }

        @aa1
        public final String OXO1() {
            return this.OXO1;
        }

        @aa1
        public final String XIi00iiXO() {
            return this.XIi00iiXO;
        }

        public final void XOO0ii0(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.OXO1 = r2;
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof XIi00iiXO) == true) goto L8;
            return false;
        L8:
            XIi00iiXO r6 = (XIi00iiXO) r5;
            if (Intrinsics.XOO0ii0(this.OXO1, r6.OXO1) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.XIi00iiXO, r6.XIi00iiXO) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode();
        }

        @aa1
        public final XIi00iiXO iO(@aa1 String r2, @aa1 String r3) {
            Intrinsics.X0O(r2, "mContent");
            Intrinsics.X0O(r3, "mExtraInfo");
            return new XIi00iiXO(r2, r3);
        }

        @aa1
        public String toString() {
            return "TranslateDate(mContent=" + this.OXO1 + ", mExtraInfo=" + this.XIi00iiXO + I000IiI1O.iO.iO;
        }

        public XIi00iiXO(@aa1 String r2, @aa1 String r3) {
            Intrinsics.X0O(r2, "mContent");
            Intrinsics.X0O(r3, "mExtraInfo");
            this.OXO1 = r2;
            this.XIi00iiXO = r3;
        }

        public /* synthetic */ XIi00iiXO(String r2, String r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = "";
        L8:
            this(r2, r3);
        }
    }

    public static final class XO0O10 implements Runnable {
        public final /* synthetic */ SuspendWindowService IO;

        public XO0O10(SuspendWindowService r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.IO.showBg(false);
        }
    }

    public static final class XOO0ii0 implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 IO;

        public XOO0ii0(Function1 r2) {
            Intrinsics.X0O(r2, "function");
            this.IO = r2;
        }

        public final boolean equals(@tb1 Object r3) {
            if ((r3 instanceof Observer) == true) goto L5;
        L8:
            return false;
        L5:
            if ((r3 instanceof FunctionAdapter) == false) goto L8;
            return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) r3).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object r2) {
            invoke(r2);
        }
    }

    public static final class iO implements Runnable {
        public final /* synthetic */ SuspendWindowService IO;

        public iO(SuspendWindowService r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.IO.showBg(false);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.service.SuspendWindowService$translateITS$1, reason: invalid class name */
    public static final class AnonymousClass1 implements O1XIiIO<String> {
        public final /* synthetic */ SuspendWindowService OXO1;

        public AnonymousClass1(SuspendWindowService r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(SuspendWindowService r0) {
            iO(r0);
        }

        public static final void iO(SuspendWindowService r4) {
            r4.getTv_translate_t().setVisibility(0);
            r4.setRecordText();
            if (SuspendWindowService.access$getOnlyshowTranslate$p(r4) == false) goto L6;
            r4.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", String.valueOf(r4.getMExtraInfo())));
            return;
        L6:
            r4.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", r4.getMExtraInfo() + "\n(" + r4.getMContent() + I000IiI1O.iO.iO));
        }

        public void XIi00iiXO(String r3) {
            LogUtils.d(new Object[]{SuspendWindowService.access$getTAG$p(this.OXO1) + " translateITS text = " + r3});
            if (r3 != null) goto L5;
        L8:
            this.OXO1.setMContent("");
            this.OXO1.setMExtraInfo("");
            this.OXO1.saveDBRecord();
            this.OXO1.sendTranslationResult();
            return;
        L5:
            if (r3.length() <= 0) goto L8;
            this.OXO1.setMExtraInfo(StringsKt__StringsKt.iX1X1(r3).toString());
            Handler r4 = SuspendWindowService.access$getHandle$p(this.OXO1);
            final SuspendWindowService r0 = this.OXO1;
            r4.post(new uh5(r0));
            I01XX0.OXO1(I01XX0.XOXOIX0Oi, new XIi00iiXO(this.OXO1.getMContent(), this.OXO1.getMExtraInfo()));
            this.OXO1.saveDBRecord();
            this.OXO1.sendTranslationResult();
            SuspendWindowService r5 = this.OXO1;
            SuspendWindowService.access$voiceChainAi(r5, r5.getMExtraInfo());
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r3) {
            Intrinsics.X0O(r3, "error");
            LogUtils.d(new Object[]{SuspendWindowService.access$getTAG$p(this.OXO1) + " translateITS text = " + r3});
            this.OXO1.setMContent("");
            this.OXO1.setMExtraInfo("");
            this.OXO1.saveDBRecord();
            this.OXO1.sendTranslationResult();
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(String r1) {
            XIi00iiXO(r1);
        }
    }

    public SuspendWindowService() {
        this.TAG = "SuspendWindowService";
        this.CHANNEL_ID = "recording_channel";
        this.NOTIFICATION_ID = 101;
        this.handle = new Handler(Looper.getMainLooper());
        this.mContentResult = "";
        this.lang = "cn";
        this.targetLang = Languages.DEFAULT_LANGUAGE;
        this.ttsTargetLang = Languages.DEFAULT_LANGUAGE;
        this.ttsVoiceName = "x4_enus_catherine_profnews";
        this.arsLanguage = "zh_cn";
        this.arsAccent = "mandarin";
        this.mContent = "";
        this.mExtraInfo = "";
        this.microsoftCallBack = new O00(this);
        this.recordingCallBack = new IiI10X(this);
    }

    public static /* synthetic */ void I0IIOi(SuspendWindowService r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit I0iXXO(SuspendWindowService r0, String r1, String r2) {
        return sendTranslationResultInput$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1XOi1(PermissionStatus r0) {
        return permission$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(SuspendWindowService r0, String r1) {
        sendChainAiTranslationResultInput$lambda$0(r0, r1);
    }

    public static /* synthetic */ void IO(SuspendWindowService r0, CompoundButton r1, boolean r2) {
        initView$lambda$3(r0, r1, r2);
    }

    public static /* synthetic */ void IiI10X(SuspendWindowService r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void O00(SuspendWindowService r0, View r1) {
        initView$lambda$9(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(SuspendWindowService r0, Boolean r1) {
        return initObserve$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(SuspendWindowService r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ void OIi0(SuspendWindowService r0, CompoundButton r1, boolean r2) {
        initView$lambda$5(r0, r1, r2);
    }

    public static /* synthetic */ void OXO1(SuspendWindowService r0) {
        initViedo$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean X0O(SuspendWindowService r0, int r1, int r2, int r3) {
        return initViedo$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ void X1ii(SuspendWindowService r0, View r1) {
        initView$lambda$10(r0, r1);
    }

    public static /* synthetic */ Unit XIi00iiXO(SuspendWindowService r0, String r1) {
        return sendTranslate$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XO0O10(SuspendWindowService r0, CompoundButton r1, boolean r2) {
        initView$lambda$7(r0, r1, r2);
    }

    public static /* synthetic */ void XOO0ii0(SuspendWindowService r0, String r1) {
        sendTranslationResultInput$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(SuspendWindowService r0, Boolean r1) {
        return initObserve$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ void XXI(View r0) {
        initView$lambda$4(r0);
    }

    public static /* synthetic */ void XiOIO(View r0) {
        initView$lambda$8(r0);
    }

    public static final /* synthetic */ Handler access$getHandle$p(SuspendWindowService r0) {
        return r0.handle;
    }

    public static final /* synthetic */ boolean access$getOnlyshowTranslate$p(SuspendWindowService r0) {
        return r0.onlyshowTranslate;
    }

    public static final /* synthetic */ String access$getTAG$p(SuspendWindowService r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$sendTranslationResultInput(SuspendWindowService r0, String r1) {
        r0.sendTranslationResultInput(r1);
    }

    public static final /* synthetic */ void access$translateITS(SuspendWindowService r0, String r1, String r2, String r3) {
        r0.translateITS(r1, r2, r3);
    }

    public static final /* synthetic */ void access$voiceChainAi(SuspendWindowService r0, String r1) {
        r0.voiceChainAi(r1);
    }

    private final Notification buildNotification() {
        PendingIntent r0 = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 67108864);
        Notification r1 = new NotificationCompat.Builder(this, this.CHANNEL_ID).setSmallIcon(R.mipmap.ic_launcher).setContentTitle(getString(R.string.recording_services)).setContentText(getString(R.string.recording_in_the_background)).setOngoing(true).setPriority(1).setContentIntent(r0).build();
        Intrinsics.O10IXXX0X(r1, "build(...)");
        return r1;
    }

    private final void createNotificationChannel() {
        NotificationChannel r0 = new NotificationChannel(this.CHANNEL_ID, getString(R.string.recording_services), 2);
        NotificationManager r1 = (NotificationManager) getSystemService(NotificationManager.class);
        if (r1 == null) goto L6;
        r1.createNotificationChannel(r0);
        return;
    }

    public static /* synthetic */ void iIiiO(SuspendWindowService r0) {
        initViedo$lambda$0$1(r0);
    }

    public static /* synthetic */ void iO(View r0) {
        initView$lambda$6(r0);
    }

    private final void initLanguage() {
        setMLanguageTranslationList(LanguageTranslationKt.getTranslationLanguageList());
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.iO();
        LanguageTranslationData r2 = (LanguageTranslationData) new Gson().fromJson(r1.getString(b01.OXii10I + '_' + LanguageTranslationData.class.getName()), LanguageTranslationData.class);
        if (r2 != null) goto L5;
        r2 = getMLanguageTranslationList().get(0);
    L5:
        setMLeftLanguage(r2);
        SPUtils r3 = r0.iO();
        LanguageTranslationData r4 = (LanguageTranslationData) new Gson().fromJson(r3.getString(b01.I011X + '_' + LanguageTranslationData.class.getName()), LanguageTranslationData.class);
        if (r4 != null) goto L8;
        r4 = getMLanguageTranslationList().get(1);
    L8:
        setMRightLanguage(r4);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " initLanguage mLeftLanguage = " + getMLeftLanguage() + " , mRightLanguage = " + getMRightLanguage());
    }

    private static final Unit initObserve$lambda$0$0(SuspendWindowService r5, Boolean r6) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        rg5 r1 = rg5.OXO1;
        r0.OXO1("isShowSuspenWindow: " + r6 + "  show:" + r1.OXO1());
        if (Intrinsics.XOO0ii0(Boolean.valueOf(r1.OXO1()), r6) == true) goto L9;
        if (r6.booleanValue() == false) goto L7;
        r5.showWindow();
        r1.XIi00iiXO(true);
        goto L9
    L7:
        r5.handle.removeCallbacksAndMessages(null);
        r1.XIi00iiXO(false);
        r5.stopSelf();
    L9:
        return Unit.OXO1;
    }

    private static final Unit initObserve$lambda$0$1(SuspendWindowService r3, Boolean r4) {
        if (r4.booleanValue() == false) goto L6;
        i1O0OXO1O.OXO1.OXO1("isReSetList: " + r4);
        r3.setMicrosoftCallback();
    L6:
        return Unit.OXO1;
    }

    private static final boolean initViedo$lambda$0(final SuspendWindowService r3, int r4, int r5, int r6) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(r3.TAG + " mode:" + r4 + ",type:" + r5 + ",earDirection:" + r6);
        if (r5 == 0) goto L19;
        if (r5 != 1) goto L6;
        r0.OXO1(r3.TAG + " TRANSFER_STATUS_GO_ON");
        RecordingManager.Companion r7 = RecordingManager.Companion;
        if (r7.getInstance().isRecording() == true) goto L26;
        r7.getInstance().setRecording(true);
    L26:
        return true;
    L6:
        if (r5 != 2) goto L26;
        r0.OXO1(r3.TAG + " TRANSFER_STATUS_END");
        r3.isEndTranslation = true;
        stopRecording$default(r3, false, 1, null);
        r3.isStartAnalysis = false;
        q62 r8 = q62.OXO1;
        if (r8.X11I() == false) goto L12;
        MicrosoftSDKManage.O1O.OXO1().Xi();
    L12:
        if (r8.OIXOOi() == false) goto L26;
        if (r8.X11I() == true) goto L26;
        r3.handle.post(new ih5(r3));
        goto L26
    L19:
        r0.OXO1(r3.TAG + " TRANSFER_STATUS_START");
        r3.isEndTranslation = false;
        r3.isStartAnalysis = true;
        DcsTtsPlayer r9 = DcsTtsPlayer.INSTANCE;
        r9.deleteReplayMusic();
        r9.stop();
        fq1.OXO1.OIi0();
        VoiceManager.INSTANCE.setLanguageType(r3.arsLanguage, r3.ttsVoiceName);
        r3.getTv_original_t().setText("");
        r3.getTv_translate_t().setText("");
        q62 r10 = q62.OXO1;
        if (r10.X11I() == false) goto L23;
        r3.startRecording();
        goto L26
    L23:
        if (r10.OIXOOi() == false) goto L25;
        r0.OXO1(r3.TAG + " startRecording1");
        r3.startRecording();
        goto L26
    L25:
        r3.handle.post(new hh5(r3));
        goto L26
    }

    private static final void initViedo$lambda$0$0(SuspendWindowService r0) {
        r0.showRecordingPopup();
    }

    private static final void initViedo$lambda$0$1(SuspendWindowService r0) {
        r0.disRecordingPopup();
    }

    private static final void initView$lambda$0(SuspendWindowService r3, View r4) {
        r3.getTv_translate().setText(R.string.enter_content);
        r3.getTv_original_t().setText("");
        r3.getTv_translate_t().setText("");
        r3.setLaunguage();
        RecordingManager.Companion r5 = RecordingManager.Companion;
        LogUtils.d(new Object[]{"isRecording = " + r5.getInstance().isRecording()});
        if (r5.getInstance().isRecording() == false) goto L5;
        r3.stopRecording(true);
        DcsTtsPlayer.INSTANCE.stop();
    L5:
        r3.showRecordingPopup(true);
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        r3.clickDownRecording(1);
    }

    private static final void initView$lambda$1(SuspendWindowService r3, View r4) {
        RecordingManager.Companion r5 = RecordingManager.Companion;
        LogUtils.d(new Object[]{"isRecording = " + r5.getInstance().isRecording()});
        if (r5.getInstance().isRecording() == false) goto L5;
        r3.stopRecording(true);
        DcsTtsPlayer.INSTANCE.stop();
    L5:
        r3.showRecordingPopup(false);
    }

    private static final void initView$lambda$10(SuspendWindowService r0, View r1) {
        r0.showBg(false);
    }

    private static final void initView$lambda$2(SuspendWindowService r1, View r2) {
        Log.d(r1.TAG, "img_close: ");
        a01.OXO1.OXO1().put(b01.i0O, false);
        I01XX0.XIi00iiXO(I01XX0.I0i0, null, 2, null);
        ViewModelMain.INSTANCE.isShowSuspenWindow().postValue(Boolean.FALSE);
    }

    private static final void initView$lambda$3(SuspendWindowService r2, CompoundButton r3, boolean r4) {
        Intrinsics.X0O(r3, "<unused var>");
        Log.d(r2.TAG, "translate_check: " + r4);
        a01.OXO1.OXO1().put(b01.IOX1, r4);
        r2.translateCheckStatus = r4;
        I01XX0.XIi00iiXO(I01XX0.OI, null, 2, null);
    }

    private static final void initView$lambda$4(View r0) {
    }

    private static final void initView$lambda$5(SuspendWindowService r2, CompoundButton r3, boolean r4) {
        Intrinsics.X0O(r3, "buttonView");
        Log.d(r2.TAG, "broadcast_check: " + r4);
        a01.OXO1.OXO1().put(b01.XIIIO, r4);
        r2.broadcastCheckStatus = r4;
        I01XX0.XIi00iiXO(I01XX0.I0iOXO, null, 2, null);
    }

    private static final void initView$lambda$6(View r0) {
    }

    private static final void initView$lambda$7(SuspendWindowService r2, CompoundButton r3, boolean r4) {
        Intrinsics.X0O(r3, "buttonView");
        Log.d(r2.TAG, "original_check: " + r4);
        a01.OXO1.OXO1().put(b01.Oiii, r4);
        r2.showOriginalTextStatus = r4;
        r2.setRecordText();
        CheckBox r5 = r2.getOriginal_check();
        if (r2.showOriginalTextStatus == false) goto L6;
        int r6 = R.string.show_original_text;
    L7:
        r5.setText(r2.getString(r6));
        return;
    L6:
        r6 = R.string.show_translation_result;
        goto L7
    }

    private static final void initView$lambda$8(View r0) {
    }

    private static final void initView$lambda$9(SuspendWindowService r3, View r4) {
        r3.showBg(true);
        r3.handle.postDelayed(new iO(r3), 3000);
    }

    private static final Unit permission$lambda$0(PermissionStatus r1) {
        Intrinsics.X0O(r1, "it");
        PermissionStatus r2 = PermissionStatus.GRANTED;
        return Unit.OXO1;
    }

    private final void sendChainAiTranslationResultInput(final String r8) {
        if (this.translateCheckStatus == true) goto L6;
        this.handle.post(new fh5(this, r8));
        return;
    L6:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " sendChainAiTranslationResultInput str = " + r8 + " , lang = " + this.lang + " , targetLang = " + this.targetLang);
        this.mContent = StringsKt__StringsKt.iX1X1(r8).toString();
        if (Intrinsics.XOO0ii0(this.lang, "cn") == false) goto L9;
    L12:
        LogUtils.d(new Object[]{this.TAG + " sendChainAiTranslationResultInput str = " + r8 + " , lang = " + this.lang + " , targetLang = " + this.targetLang});
        translateITS$default(this, r8, null, null, 6, null);
        return;
    L9:
        if (Intrinsics.XOO0ii0(this.targetLang, "cn") == true) goto L12;
        AISparkChainManager.OXO1.IX1XiI(r8, this.lang, "cn", new AnonymousClass2(this));
    }

    private static final void sendChainAiTranslationResultInput$lambda$0(SuspendWindowService r2, String r3) {
        r2.getTv_translate_t().setVisibility(0);
        if (r2.onlyshowTranslate == true) goto L5;
        r2.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", r3));
    L5:
        r2.mContent = r3;
        r2.mExtraInfo = "";
        r2.setRecordText();
        I01XX0.OXO1(I01XX0.XOXOIX0Oi, new XIi00iiXO(r2.mContent, r2.mExtraInfo));
    }

    private static final Unit sendTranslate$lambda$0(SuspendWindowService r0, String r1) {
        r0.sendChainAiTranslationResultInput(r1);
        return Unit.OXO1;
    }

    private final void sendTranslationResultInput(final String r5) {
        if (this.translateCheckStatus == true) goto L7;
        this.handle.post(new dh5(this, r5));
        return;
    L7:
        if (r5.length() > 0) goto L9;
    L12:
        this.mContent = "";
        this.mExtraInfo = "";
        getClipboard().setPrimaryClip(ClipData.newPlainText("aura", this.mContent));
        ToastUtils.showShort(getString(R.string.request_error), new Object[0]);
        saveDBRecord();
        sendTranslationResult();
        return;
    L9:
        if (Intrinsics.XOO0ii0(r5, UtilsKt.XXO(R.string.request_error)) == true) goto L12;
        i1O0OXO1O.OXO1.OXO1("startAudioStreamInput ===> str = " + r5 + " , targetLang = " + this.targetLang);
        MicrosoftSDKManage.XIi00iiXO r0 = MicrosoftSDKManage.O1O;
        r0.OXO1().IXI();
        r0.OXO1().OI(r5, this.targetLang, new gh5(this, r5));
    }

    private static final void sendTranslationResultInput$lambda$0(SuspendWindowService r3, String r4) {
        r3.getTv_translate_t().setVisibility(0);
        if (r4.length() > 0) goto L5;
    L7:
        r3.mContent = "";
    L9:
        if (r3.onlyshowTranslate == true) goto L11;
        r3.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", r3.mContent));
    L11:
        r3.mExtraInfo = "";
        r3.setRecordText();
        I01XX0.OXO1(I01XX0.XOXOIX0Oi, new XIi00iiXO(r3.mContent, r3.mExtraInfo));
        return;
    L5:
        if (Intrinsics.XOO0ii0(r4, UtilsKt.XXO(R.string.request_error)) == true) goto L7;
        r3.mContent = r4;
        goto L9
    }

    private static final Unit sendTranslationResultInput$lambda$1(SuspendWindowService r4, String r5, String r6) {
        Intrinsics.X0O(r6, "it");
        LogUtils.d(new Object[]{r4.TAG + " sendTranslationResultInput it = " + r6});
        r4.mContent = StringsKt__StringsKt.iX1X1(r5).toString();
        String r7 = StringsKt__StringsKt.iX1X1(r6).toString();
        r4.mExtraInfo = r7;
        I01XX0.OXO1(I01XX0.XOXOIX0Oi, new XIi00iiXO(r4.mContent, r7));
        r4.getTv_translate_t().setVisibility(0);
        r4.setRecordText();
        if (r4.onlyshowTranslate == false) goto L5;
        r4.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", String.valueOf(r4.mExtraInfo)));
    L6:
        r4.voiceMicrosoft(r6);
        r4.saveDBRecord();
        r4.sendTranslationResult();
        return Unit.OXO1;
    L5:
        r4.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", r4.mExtraInfo + "\n(" + r4.mContent + I000IiI1O.iO.iO));
        goto L6
    }

    public static /* synthetic */ void stopRecording$default(SuspendWindowService r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.stopRecording(r1);
    }

    private final void translateITS(String r3, String r4, String r5) {
        AISparkChainManager.OXO1.IX1XiI(r3, r4, r5, new AnonymousClass1(this));
    }

    public static /* synthetic */ void translateITS$default(SuspendWindowService r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = r0.lang;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = r0.targetLang;
    L8:
        r0.translateITS(r1, r2, r3);
    }

    private final void voiceChainAi(String r11) {
        if (this.broadcastCheckStatus == false) goto L6;
        DcsTtsPlayer r1 = DcsTtsPlayer.INSTANCE;
        r1.initSegmentation();
        DcsTtsPlayer.play$default(r1, r11, true, false, null, this.ttsVoiceName, "voiceChainAi", 12, null);
        return;
    }

    private final void voiceMicrosoft(String r3) {
        if (this.broadcastCheckStatus == false) goto L6;
        MicrosoftSDKManage.O1O.OXO1().XXIIO1i11(r3, this.ttsVoiceName);
        return;
    }

    public final void bindView() {
        FloatFrameLayout r0 = this.floatRootView;
        ImageView r1 = null;
        if (r0 == null) goto L5;
        View r2 = r0.findViewById(R.id.rootView);
    L6:
        Intrinsics.XXI(r2);
        setRoot(r2);
        FloatFrameLayout r3 = this.floatRootView;
        if (r3 == null) goto L9;
        View r4 = r3.findViewById(R.id.rl_show_all);
    L10:
        Intrinsics.XXI(r4);
        setRl_show_all(r4);
        FloatFrameLayout r5 = this.floatRootView;
        if (r5 == null) goto L13;
        View r6 = r5.findViewById(R.id.ll_hide_content);
    L14:
        Intrinsics.XXI(r6);
        setLl_hide_content(r6);
        FloatFrameLayout r7 = this.floatRootView;
        if (r7 == null) goto L17;
        ImageView r8 = (ImageView) r7.findViewById(R.id.img_record);
    L18:
        Intrinsics.XXI(r8);
        setImg_record(r8);
        FloatFrameLayout r9 = this.floatRootView;
        if (r9 == null) goto L21;
        AppCompatImageView r10 = (AppCompatImageView) r9.findViewById(R.id.img_close);
    L22:
        Intrinsics.XXI(r10);
        setImg_close(r10);
        FloatFrameLayout r11 = this.floatRootView;
        if (r11 == null) goto L25;
        CheckBox r12 = (CheckBox) r11.findViewById(R.id.translate_check);
    L26:
        Intrinsics.XXI(r12);
        setTranslate_check(r12);
        FloatFrameLayout r13 = this.floatRootView;
        if (r13 == null) goto L29;
        CheckBox r14 = (CheckBox) r13.findViewById(R.id.broadcast_check);
    L30:
        Intrinsics.XXI(r14);
        setBroadcast_check(r14);
        FloatFrameLayout r15 = this.floatRootView;
        if (r15 == null) goto L33;
        CheckBox r16 = (CheckBox) r15.findViewById(R.id.original_check);
    L34:
        Intrinsics.XXI(r16);
        setOriginal_check(r16);
        FloatFrameLayout r17 = this.floatRootView;
        if (r17 == null) goto L37;
        View r18 = r17.findViewById(R.id.bottom_line);
    L38:
        Intrinsics.XXI(r18);
        setBottom_line(r18);
        FloatFrameLayout r19 = this.floatRootView;
        if (r19 == null) goto L41;
        TextView r20 = (TextView) r19.findViewById(R.id.tv_translate_t);
    L42:
        Intrinsics.XXI(r20);
        setTv_translate_t(r20);
        FloatFrameLayout r21 = this.floatRootView;
        if (r21 == null) goto L45;
        TextView r22 = (TextView) r21.findViewById(R.id.tv_translate);
    L46:
        Intrinsics.XXI(r22);
        setTv_translate(r22);
        FloatFrameLayout r23 = this.floatRootView;
        if (r23 == null) goto L49;
        LinearLayout r24 = (LinearLayout) r23.findViewById(R.id.ll_show_set);
    L50:
        Intrinsics.XXI(r24);
        setLl_show_set(r24);
        FloatFrameLayout r25 = this.floatRootView;
        if (r25 == null) goto L53;
        FrameLayout r26 = (FrameLayout) r25.findViewById(R.id.fl_recording);
    L54:
        Intrinsics.XXI(r26);
        setFl_recording(r26);
        FloatFrameLayout r27 = this.floatRootView;
        if (r27 == null) goto L57;
        TextView r28 = (TextView) r27.findViewById(R.id.tv_original_t);
    L58:
        Intrinsics.XXI(r28);
        setTv_original_t(r28);
        FloatFrameLayout r29 = this.floatRootView;
        if (r29 == null) goto L61;
        ImageView r30 = (ImageView) r29.findViewById(R.id.img_recording_animation);
    L62:
        Intrinsics.XXI(r30);
        setImg_recording_animation(r30);
        FloatFrameLayout r31 = this.floatRootView;
        if (r31 == null) goto L65;
        ImageView r32 = (ImageView) r31.findViewById(R.id.img_recording);
    L66:
        Intrinsics.XXI(r32);
        setImg_recording(r32);
        FloatFrameLayout r33 = this.floatRootView;
        if (r33 == null) goto L69;
        r1 = (ImageView) r33.findViewById(R.id.img_record_show);
    L69:
        Intrinsics.XXI(r1);
        setImg_record_show(r1);
        return;
    L65:
        r32 = null;
        goto L66
    L61:
        r30 = null;
        goto L62
    L57:
        r28 = null;
        goto L58
    L53:
        r26 = null;
        goto L54
    L49:
        r24 = null;
        goto L50
    L45:
        r22 = null;
        goto L46
    L41:
        r20 = null;
        goto L42
    L37:
        r18 = null;
        goto L38
    L33:
        r16 = null;
        goto L34
    L29:
        r14 = null;
        goto L30
    L25:
        r12 = null;
        goto L26
    L21:
        r10 = null;
        goto L22
    L17:
        r8 = null;
        goto L18
    L13:
        r6 = null;
        goto L14
    L9:
        r4 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }

    public final void clickDownRecording(int r1) {
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.MICROPHONE}) == false) goto L6;
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        startRecording();
        return;
    L6:
        permission();
    }

    public final void disRecordingPopup() {
        showRecordingPopup(false);
    }

    @aa1
    public final String getArsAccent() {
        return this.arsAccent;
    }

    @aa1
    public final String getArsLanguage() {
        return this.arsLanguage;
    }

    @aa1
    public final View getBottom_line() {
        View r0 = this.bottom_line;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("bottom_line");
        return null;
    }

    @aa1
    public final CheckBox getBroadcast_check() {
        CheckBox r0 = this.broadcast_check;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("broadcast_check");
        return null;
    }

    @aa1
    public final ClipboardManager getClipboard() {
        ClipboardManager r0 = this.clipboard;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("clipboard");
        return null;
    }

    @aa1
    public final FrameLayout getFl_recording() {
        FrameLayout r0 = this.fl_recording;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("fl_recording");
        return null;
    }

    @aa1
    public final ImageView getImg_close() {
        ImageView r0 = this.img_close;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("img_close");
        return null;
    }

    @aa1
    public final ImageView getImg_record() {
        ImageView r0 = this.img_record;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("img_record");
        return null;
    }

    @aa1
    public final ImageView getImg_record_show() {
        ImageView r0 = this.img_record_show;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("img_record_show");
        return null;
    }

    @aa1
    public final ImageView getImg_recording() {
        ImageView r0 = this.img_recording;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("img_recording");
        return null;
    }

    @aa1
    public final ImageView getImg_recording_animation() {
        ImageView r0 = this.img_recording_animation;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("img_recording_animation");
        return null;
    }

    @aa1
    public final String getLang() {
        return this.lang;
    }

    @aa1
    public final View getLl_hide_content() {
        View r0 = this.ll_hide_content;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("ll_hide_content");
        return null;
    }

    @aa1
    public final LinearLayout getLl_show_set() {
        LinearLayout r0 = this.ll_show_set;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("ll_show_set");
        return null;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @aa1
    public final String getMContentResult() {
        return this.mContentResult;
    }

    @aa1
    public final String getMExtraInfo() {
        return this.mExtraInfo;
    }

    @aa1
    public final List<LanguageTranslationData> getMLanguageTranslationList() {
        List<LanguageTranslationData> r0 = this.mLanguageTranslationList;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mLanguageTranslationList");
        return null;
    }

    @aa1
    public final LanguageTranslationData getMLeftLanguage() {
        LanguageTranslationData r0 = this.mLeftLanguage;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mLeftLanguage");
        return null;
    }

    @aa1
    public final LanguageTranslationData getMRightLanguage() {
        LanguageTranslationData r0 = this.mRightLanguage;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mRightLanguage");
        return null;
    }

    @aa1
    public final MicrosoftSDKManage.iO getMicrosoftCallBack() {
        return this.microsoftCallBack;
    }

    @aa1
    public final CheckBox getOriginal_check() {
        CheckBox r0 = this.original_check;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("original_check");
        return null;
    }

    @aa1
    public final AnimationDrawable getRecordAnimation() {
        AnimationDrawable r0 = this.recordAnimation;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("recordAnimation");
        return null;
    }

    @aa1
    public final RecordingManager.OnRecordingCallback getRecordingCallBack() {
        return this.recordingCallBack;
    }

    @aa1
    public final View getRl_show_all() {
        View r0 = this.rl_show_all;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("rl_show_all");
        return null;
    }

    @aa1
    public final View getRoot() {
        View r0 = this.root;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("root");
        return null;
    }

    @aa1
    public final String getTargetLang() {
        return this.targetLang;
    }

    @aa1
    public final CheckBox getTranslate_check() {
        CheckBox r0 = this.translate_check;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("translate_check");
        return null;
    }

    @aa1
    public final String getTtsTargetLang() {
        return this.ttsTargetLang;
    }

    @aa1
    public final String getTtsVoiceName() {
        return this.ttsVoiceName;
    }

    @aa1
    public final TextView getTv_original_t() {
        TextView r0 = this.tv_original_t;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tv_original_t");
        return null;
    }

    @aa1
    public final TextView getTv_translate() {
        TextView r0 = this.tv_translate;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tv_translate");
        return null;
    }

    @aa1
    public final TextView getTv_translate_t() {
        TextView r0 = this.tv_translate_t;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tv_translate_t");
        return null;
    }

    public final void initObserve() {
        ViewModelMain r0 = ViewModelMain.INSTANCE;
        r0.isShowSuspenWindow().observe(this, new XOO0ii0(new lh5(this)));
        r0.isReSetList().observe(this, new XOO0ii0(new mh5(this)));
    }

    public final void initViedo() {
        VoiceManager r0 = VoiceManager.INSTANCE;
        r0.setActivityData(true);
        q62 r1 = q62.OXO1;
        if (r1.X11I() == false) goto L6;
        MicrosoftSDKManage.XIi00iiXO r2 = MicrosoftSDKManage.O1O;
        r2.OXO1().IX1XiI();
        r2.OXO1().iIi1(this.microsoftCallBack, this.TAG);
    L8:
        r0.setMListener(new eh5(this));
        return;
    L6:
        if (r1.OIXOOi() == false) goto L8;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " initViedo");
        RecordingManager.Companion.getInstance().setRecordingCallback(this.recordingCallBack);
        goto L8
    }

    public final void initView() {
        a01 r0 = a01.OXO1;
        this.translateCheckStatus = r0.OXO1().getBoolean(b01.IOX1, true);
        this.broadcastCheckStatus = r0.OXO1().getBoolean(b01.XIIIO, true);
        this.showOriginalTextStatus = r0.OXO1().getBoolean(b01.Oiii, false);
        this.onlyshowTranslate = r0.OXO1().getBoolean(b01.i0iIXiI, false);
        Drawable r1 = getImg_recording_animation().getBackground();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        setRecordAnimation((AnimationDrawable) r1);
        initLanguage();
        setLaunguage();
        showBg(true);
        initViedo();
        this.handle.postDelayed(new XO0O10(this), 3000);
        if (this.isShowRecordImg == false) goto L5;
        getImg_record().setVisibility(0);
    L6:
        getImg_record().setOnClickListener(new nh5(this));
        getImg_recording().setOnClickListener(new ug5(this));
        getImg_close().setOnClickListener(new vg5(this));
        getTranslate_check().setChecked(this.translateCheckStatus);
        getTranslate_check().setOnCheckedChangeListener(new wg5(this));
        getTranslate_check().setOnClickListener(new xg5());
        getBroadcast_check().setChecked(this.broadcastCheckStatus);
        getBroadcast_check().setOnCheckedChangeListener(new yg5(this));
        getBroadcast_check().setOnClickListener(new zg5());
        String r2 = getString(R.string.enter_content);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        this.mContent = r2;
        getOriginal_check().setChecked(this.showOriginalTextStatus);
        CheckBox r3 = getOriginal_check();
        if (this.showOriginalTextStatus == false) goto L10;
        int r4 = R.string.show_original_text;
    L11:
        r3.setText(getString(r4));
        getOriginal_check().setOnCheckedChangeListener(new ah5(this));
        getOriginal_check().setOnClickListener(new bh5());
        getLl_show_set().setOnClickListener(new ch5(this));
        getImg_record_show().setOnClickListener(new tg5(this));
        Object r5 = getSystemService("clipboard");
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type android.content.ClipboardManager");
        setClipboard((ClipboardManager) r5);
        return;
    L10:
        r4 = R.string.show_translation_result;
        goto L11
    L5:
        getImg_record().setVisibility(8);
        goto L6
    }

    public final boolean isAddListData() {
        return this.isAddListData;
    }

    public final boolean isEndTranslation() {
        return this.isEndTranslation;
    }

    public final boolean isStartAnalysis() {
        return this.isStartAnalysis;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        initObserve();
        createNotificationChannel();
        LogUtils.d(new Object[]{"onCreate: "});
        O11XO1X.XO0O10().X1ii(this);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtils.d(new Object[]{"onDestroy"});
        stopForeground(1);
        this.handle.removeCallbacksAndMessages(null);
        O11XO1X.XO0O10().OiIIX101O(this);
        FloatFrameLayout r1 = this.floatRootView;
        if (r1 == null) goto L8;
        WindowManager r4 = this.windowManager;
        if (r4 == null) goto L7;
        r4.removeView(r1);
    L7:
        this.isShow = false;
        getRecordAnimation().stop();
    L8:
        DcsTtsPlayer.INSTANCE.stop();
        VoiceManager r2 = VoiceManager.INSTANCE;
        r2.setMListener(null);
        r2.setMicrosoftCallback();
        RecordingManager.Companion.getInstance().closeBluetooth();
        r2.setActivityData(false);
        stopRecording$default(this, false, 1, null);
    }

    @sf5(tag = I01XX0.iX01)
    public final void onLanguageChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onLanguageChange event = " + r4);
        initLanguage();
        setLaunguage();
    }

    @sf5(tag = I01XX0.IiXIIX1O1)
    public final void onOnlyShowTranslation(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        this.onlyshowTranslate = a01.OXO1.OXO1().getBoolean(b01.i0iIXiI, false);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@tb1 Intent r1, int r2, int r3) {
        super.onStartCommand(r1, r2, r3);
        Notification r4 = buildNotification();
        if (Build.VERSION.SDK_INT < 30) goto L5;
        sg5.OXO1(this, this.NOTIFICATION_ID, r4, 128);
        return 1;
    L5:
        startForeground(this.NOTIFICATION_ID, r4);
        return 1;
    }

    public final void permission() {
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.MICROPHONE});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        String r1 = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        String r3 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        ds1.XIi00iiXO(r0, r1, r3, new kh5());
    }

    public void saveDBRecord() {
    }

    public final void sendTranslate(@aa1 final String r10) {
        Intrinsics.X0O(r10, "content");
        i1O0OXO1O.OXO1.OXO1(this.TAG + "  sendTranslate  content = " + r10 + " lang = " + this.lang + ", targetLang = " + this.targetLang);
        q62 r0 = q62.OXO1;
        if (r0.X11I() == false) goto L7;
        sendTranslationResultInput(r10);
        return;
    L7:
        if (r0.OIXOOi() == false) goto L10;
        ThreadsKt.iO(true, false, null, null, 0, new jh5(this, r10), 30, null);
        return;
    }

    public final void sendTranslationResult() {
        String r0 = this.mContent;
        String r1 = "null";
        if (r0 != null) goto L5;
        r0 = "null";
    L5:
        String r2 = this.mExtraInfo;
        if (r2 == null) goto L9;
        r1 = r2;
    L9:
        sendTranslationResult(r0, r1);
    }

    public final void setAddListData(boolean r1) {
        this.isAddListData = r1;
    }

    public final void setArsAccent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.arsAccent = r2;
    }

    public final void setArsLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.arsLanguage = r2;
    }

    public final void setBottom_line(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bottom_line = r2;
    }

    public final void setBroadcast_check(@aa1 CheckBox r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.broadcast_check = r2;
    }

    public final void setClipboard(@aa1 ClipboardManager r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.clipboard = r2;
    }

    public final void setEndTranslation(boolean r1) {
        this.isEndTranslation = r1;
    }

    public final void setFl_recording(@aa1 FrameLayout r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fl_recording = r2;
    }

    public final void setImg_close(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.img_close = r2;
    }

    public final void setImg_record(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.img_record = r2;
    }

    public final void setImg_record_show(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.img_record_show = r2;
    }

    public final void setImg_recording(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.img_recording = r2;
    }

    public final void setImg_recording_animation(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.img_recording_animation = r2;
    }

    public final void setLang(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.lang = r2;
    }

    public final void setLaunguage() {
        VoiceManager r0 = VoiceManager.INSTANCE;
        r0.setActivityData(true);
        this.lang = getMLeftLanguage().getRtasrLanguage();
        this.arsLanguage = getMLeftLanguage().getAsrLanguage();
        this.arsAccent = getMLeftLanguage().getAccent();
        this.targetLang = getMRightLanguage().getRtasrLanguage();
        this.ttsVoiceName = getMRightLanguage().getTtsViuceName();
        this.ttsTargetLang = getMRightLanguage().getAsrLanguage();
        r0.setLanguageType(this.arsLanguage, this.ttsVoiceName);
    }

    public final void setLl_hide_content(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ll_hide_content = r2;
    }

    public final void setLl_show_set(@aa1 LinearLayout r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ll_show_set = r2;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMContentResult(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContentResult = r2;
    }

    public final void setMExtraInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mExtraInfo = r2;
    }

    public final void setMLanguageTranslationList(@aa1 List<LanguageTranslationData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLanguageTranslationList = r2;
    }

    public final void setMLeftLanguage(@aa1 LanguageTranslationData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLeftLanguage = r2;
    }

    public final void setMRightLanguage(@aa1 LanguageTranslationData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRightLanguage = r2;
    }

    public final void setMicrosoftCallback() {
        initViedo();
    }

    public final void setOriginal_check(@aa1 CheckBox r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.original_check = r2;
    }

    public final void setRecordAnimation(@aa1 AnimationDrawable r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.recordAnimation = r2;
    }

    public final void setRecordText() {
        if (this.showOriginalTextStatus == false) goto L14;
        if (this.mContent.length() != 0) goto L8;
    L9:
        getTv_translate_t().setText("");
        getTv_translate_t().setVisibility(8);
    L11:
        getTv_translate().setText(this.mContent);
        return;
    L8:
        if (Intrinsics.XOO0ii0(this.mContent, getString(R.string.request_error)) == true) goto L9;
        getTv_translate_t().setText(this.mContent);
        goto L11
    L14:
        if (this.mExtraInfo.length() != 0) goto L16;
        getTv_translate_t().setVisibility(8);
    L16:
        getTv_translate_t().setText(this.mExtraInfo);
        getTv_translate().setText(this.mExtraInfo);
    }

    public final void setRl_show_all(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.rl_show_all = r2;
    }

    public final void setRoot(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.root = r2;
    }

    public final void setStartAnalysis(boolean r1) {
        this.isStartAnalysis = r1;
    }

    public final void setTargetLang(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.targetLang = r2;
    }

    public final void setTranslate_check(@aa1 CheckBox r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.translate_check = r2;
    }

    public final void setTtsTargetLang(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ttsTargetLang = r2;
    }

    public final void setTtsVoiceName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ttsVoiceName = r2;
    }

    public final void setTv_original_t(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tv_original_t = r2;
    }

    public final void setTv_translate(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tv_translate = r2;
    }

    public final void setTv_translate_t(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tv_translate_t = r2;
    }

    public final void showBg(boolean r4) {
        if (r4 == false) goto L6;
        getRoot().setBackgroundColor(Color.parseColor("#B2000000"));
        getRl_show_all().setVisibility(0);
        getLl_hide_content().setVisibility(8);
        return;
    L6:
        getRoot().setBackgroundColor(0);
        getRl_show_all().setVisibility(8);
        getLl_hide_content().setVisibility(0);
    }

    public final void showRecordingPopup(boolean r3) {
        if (r3 == false) goto L7;
        getImg_record().setVisibility(8);
        getFl_recording().setVisibility(0);
        getTv_translate_t().setVisibility(8);
        getRecordAnimation().start();
        return;
    L7:
        if (this.isShowRecordImg == false) goto L9;
        getImg_record().setVisibility(0);
    L9:
        getFl_recording().setVisibility(8);
        getTv_original_t().setVisibility(8);
        CharSequence r4 = getTv_translate_t().getText();
        Intrinsics.O10IXXX0X(r4, "getText(...)");
        if (r4.length() <= 0) goto L12;
        getTv_translate_t().setVisibility(0);
    L12:
        getRecordAnimation().stop();
    }

    public final void showWindow() {
        Log.d(this.TAG, "showWindow: ");
        Object r0 = getSystemService("window");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) r0;
        DisplayMetrics r1 = new DisplayMetrics();
        WindowManager r2 = this.windowManager;
        if (r2 == null) goto L7;
        Display r3 = r2.getDefaultDisplay();
        if (r3 == null) goto L7;
        r3.getMetrics(r1);
    L7:
        WindowManager.LayoutParams r4 = new WindowManager.LayoutParams();
        r4.type = 2038;
        r4.format = 1;
        r4.flags = 40;
        r4.width = -1;
        r4.height = -2;
        r4.gravity = 8388659;
        r4.x = 0;
        int r5 = r1.heightPixels;
        r4.y = (r5 * 2) / 3;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " outMetrics.heightPixels * 2 / 3 = " + ((r5 * 2) / 3));
        LayoutInflater r6 = LayoutInflater.from(this);
        View r7 = null;
        if (r6 == null) goto L10;
        r7 = r6.inflate(R.layout.floating_interface, null);
    L10:
        Intrinsics.X1ii(r7, "null cannot be cast to non-null type com.sma.smartv3.view.FloatFrameLayout");
        this.floatRootView = (FloatFrameLayout) r7;
        bindView();
        initView();
        WindowManager r8 = this.windowManager;
        if (r8 == null) goto L19;
        FloatFrameLayout r9 = this.floatRootView;
        if (r9 == null) goto L15;
        Intrinsics.XXI(r8);
        r9.setOnTouchListener(new OXO1(r4, r8));
    L15:
        WindowManager r10 = this.windowManager;
        if (r10 == null) goto L20;
        r10.addView(this.floatRootView, r4);
        return;
    L20:
        return;
    }

    public void startRecording() {
        q62 r0 = q62.OXO1;
        if (r0.X11I() == false) goto L7;
        LogUtils.d(new Object[]{this.TAG + " " + this.isStartAnalysis});
        this.isEndTranslation = false;
        this.isStartAnalysis = true;
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        MicrosoftSDKManage.O1O.OXO1().iIX0i(this.arsLanguage, true, this.ttsVoiceName, this.ttsTargetLang, false);
        return;
    L7:
        if (r0.OIXOOi() == false) goto L10;
        RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), this.recordingCallBack, false, false, this.TAG, 6, null);
        return;
    }

    public final void stopRecording(boolean r2) {
        if (q62.OXO1.X11I() == false) goto L8;
        if (r2 == false) goto L6;
        this.isEndTranslation = true;
        RecordingManager.Companion.getInstance().setRecording(false);
        MicrosoftSDKManage.O1O.OXO1().Xi();
    L6:
        MicrosoftSDKManage.O1O.OXO1().XOIO11O();
        return;
    L8:
        RecordingManager.Companion.getInstance().stopRecording();
    }

    public final void sendTranslationResult(@aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r13, "inputText");
        Intrinsics.X0O(r14, "outputText");
        VoiceManager r0 = VoiceManager.INSTANCE;
        r0.senAudioTextToDevice(new BleVoice(0, 0, 0, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(r13).toString(), 14, null));
        r0.senAudioTextToDevice(new BleVoice(1, 0, 0, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(r14).toString(), 14, null));
    }

    public final void showRecordingPopup() {
        showRecordingPopup(true);
    }
}
