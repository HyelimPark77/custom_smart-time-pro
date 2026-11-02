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
import android.view.ViewGroup;
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
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.fq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.rg5;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
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
import com.sma.smartv3.p610ui.main.MainActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.service.SuspendWindowService;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.FloatFrameLayout;
import com.szabh.smable3.entity.BleVoice;
import com.szabh.smable3.entity.Languages;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSuspendWindowService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendWindowService.kt\ncom/sma/smartv3/service/SuspendWindowService\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,1026:1\n90#2:1027\n90#2:1028\n439#3:1029\n*S KotlinDebug\n*F\n+ 1 SuspendWindowService.kt\ncom/sma/smartv3/service/SuspendWindowService\n*L\n445#1:1027\n449#1:1028\n858#1:1029\n*E\n"})
public final class SuspendWindowService extends LifecycleService {
    public View bottom_line;
    private boolean broadcastCheckStatus;
    public CheckBox broadcast_check;
    public ClipboardManager clipboard;
    public FrameLayout fl_recording;

    @tb1
    private FloatFrameLayout floatRootView;
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
    public View ll_hide_content;
    public LinearLayout ll_show_set;
    public List<LanguageTranslationData> mLanguageTranslationList;
    public LanguageTranslationData mLeftLanguage;
    public LanguageTranslationData mRightLanguage;
    private boolean onlyshowTranslate;
    public CheckBox original_check;
    public AnimationDrawable recordAnimation;
    public View rl_show_all;
    public View root;
    private boolean showOriginalTextStatus;
    private boolean translateCheckStatus;
    public CheckBox translate_check;
    public TextView tv_original_t;
    public TextView tv_translate;
    public TextView tv_translate_t;

    @tb1
    private WindowManager windowManager;

    @aa1
    private final String TAG = "SuspendWindowService";

    @aa1
    private final String CHANNEL_ID = "recording_channel";
    private final int NOTIFICATION_ID = 101;

    @aa1
    private final Handler handle = new Handler(Looper.getMainLooper());

    @aa1
    private String mContentResult = "";

    @aa1
    private String lang = "cn";

    @aa1
    private String targetLang = Languages.DEFAULT_LANGUAGE;

    @aa1
    private String ttsTargetLang = Languages.DEFAULT_LANGUAGE;

    @aa1
    private String ttsVoiceName = "x4_enus_catherine_profnews";

    @aa1
    private String arsLanguage = "zh_cn";

    @aa1
    private String arsAccent = "mandarin";

    @aa1
    private String mContent = "";

    @aa1
    private String mExtraInfo = "";

    @aa1
    private final MicrosoftSDKManage.InterfaceC19048iO microsoftCallBack = new O00();

    @aa1
    private final RecordingManager.OnRecordingCallback recordingCallBack = new IiI10X();

    public static final class IiI10X implements RecordingManager.OnRecordingCallback {
        public IiI10X() {
        }

        public static final void IiI10X(SuspendWindowService suspendWindowService) {
            suspendWindowService.disRecordingPopup();
        }

        public static final void O00(SuspendWindowService suspendWindowService) {
            suspendWindowService.showRecordingPopup();
        }

        public static final void XO0O10(SuspendWindowService suspendWindowService) {
            suspendWindowService.showRecordingPopup();
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onBeforeRecording() {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.this.TAG + " onBeforeRecording ");
            Handler handler = SuspendWindowService.this.handle;
            final SuspendWindowService suspendWindowService = SuspendWindowService.this;
            handler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.rh5
                @Override // java.lang.Runnable
                public final void run() {
                    SuspendWindowService.IiI10X.XO0O10(suspendWindowService);
                }
            });
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResult(AITranslation aITranslation) {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.this.TAG + " onRecordResult result = " + aITranslation);
            if (aITranslation == null || aITranslation.getStatus() != 2) {
                return;
            }
            DcsTtsPlayer.INSTANCE.stop();
            SuspendWindowService.this.setMContent(StringsKt__StringsKt.iX1X1(aITranslation.getText()).toString());
            SuspendWindowService.this.setMExtraInfo(StringsKt__StringsKt.iX1X1(aITranslation.getDst()).toString());
            if (SuspendWindowService.this.getMContent().length() > 0) {
                SuspendWindowService suspendWindowService = SuspendWindowService.this;
                suspendWindowService.sendTranslate(suspendWindowService.getMContent());
            }
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResultError(String error) {
            Intrinsics.X0O(error, "error");
            SuspendWindowService suspendWindowService = SuspendWindowService.this;
            String string = suspendWindowService.getString(R.string.speech_recognition_error);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            String string2 = SuspendWindowService.this.getString(R.string.failed_in_translation);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            suspendWindowService.sendTranslationResult(string, string2);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public /* bridge */ void onRecordResultLanguage(AISpeech aISpeech) {
            super.onRecordResultLanguage(aISpeech);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStartRecording() {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.this.TAG + " onStartRecording ");
            Handler handler = SuspendWindowService.this.handle;
            final SuspendWindowService suspendWindowService = SuspendWindowService.this;
            handler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.sh5
                @Override // java.lang.Runnable
                public final void run() {
                    SuspendWindowService.IiI10X.O00(suspendWindowService);
                }
            });
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStopRecording() {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.this.TAG + " onStartRecording ");
            Handler handler = SuspendWindowService.this.handle;
            final SuspendWindowService suspendWindowService = SuspendWindowService.this;
            handler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.th5
                @Override // java.lang.Runnable
                public final void run() {
                    SuspendWindowService.IiI10X.IiI10X(suspendWindowService);
                }
            });
        }
    }

    public static final class O00 implements MicrosoftSDKManage.InterfaceC19048iO {
        public O00() {
        }

        public static final void IiI10X(SuspendWindowService suspendWindowService) {
            suspendWindowService.setMContentResult("");
            suspendWindowService.showRecordingPopup();
        }

        public static final void O00(int i, SuspendWindowService suspendWindowService, String str) {
            if (i == 1) {
                suspendWindowService.setMContent(str);
                suspendWindowService.getTv_original_t().setText(str);
                suspendWindowService.getTv_original_t().setVisibility(0);
                if (suspendWindowService.isAddListData()) {
                    return;
                }
                suspendWindowService.setAddListData(true);
            }
        }

        public static final void XOO0ii0(SuspendWindowService suspendWindowService) {
            suspendWindowService.disRecordingPopup();
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(suspendWindowService.TAG + "   onStopTransmission  isEndTranslation = " + suspendWindowService.isEndTranslation() + " ");
            suspendWindowService.showRecordingPopup(false);
            if (suspendWindowService.isEndTranslation()) {
                suspendWindowService.setEndTranslation(false);
                suspendWindowService.setAddListData(false);
                VoiceManager.INSTANCE.setSpeechRecRunning(false);
                i1o0oxo1o.OXO1(suspendWindowService.TAG + "  sendTranslate onStopTransmission  show content = " + suspendWindowService.getMContentResult() + " ");
                if (suspendWindowService.getMContentResult().length() > 0) {
                    i1o0oxo1o.OXO1(suspendWindowService.TAG + "  sendTranslate onStopTransmission  content = " + suspendWindowService.getMContentResult() + " ");
                    suspendWindowService.sendTranslationResultInput(suspendWindowService.getMContentResult());
                    return;
                }
                i1o0oxo1o.OXO1(suspendWindowService.TAG + "  sendTranslate onStopTransmission  content = " + (suspendWindowService.getMContentResult().length() > 0));
                DcsTtsPlayer.INSTANCE.stop();
                String string = suspendWindowService.getString(R.string.no_content_detected);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                suspendWindowService.sendTranslationResultInput(string);
            }
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onIdentifyResults(final int i, final String str) {
            Intrinsics.X0O(str, "str");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(SuspendWindowService.this.TAG + "  sendTranslate  onIdentifyResults Show Content is : " + str);
            SuspendWindowService.this.setMContentResult(str);
            if (i == 2) {
                i1o0oxo1o.OXO1(SuspendWindowService.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
                SuspendWindowService.this.setMContentResult(str);
            }
            Handler handler = SuspendWindowService.this.handle;
            final SuspendWindowService suspendWindowService = SuspendWindowService.this;
            handler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ph5
                @Override // java.lang.Runnable
                public final void run() {
                    SuspendWindowService.O00.O00(i, suspendWindowService, str);
                }
            });
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public /* bridge */ void onIdentifyResultsDetectedLanguage(int i, String str, String str2) {
            super.onIdentifyResultsDetectedLanguage(i, str, str2);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(SuspendWindowService.this.TAG + " onStartTransmission ");
            Handler handler = SuspendWindowService.this.handle;
            final SuspendWindowService suspendWindowService = SuspendWindowService.this;
            handler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.oh5
                @Override // java.lang.Runnable
                public final void run() {
                    SuspendWindowService.O00.IiI10X(suspendWindowService);
                }
            });
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStopTransmission() {
            Handler handler = SuspendWindowService.this.handle;
            final SuspendWindowService suspendWindowService = SuspendWindowService.this;
            handler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.qh5
                @Override // java.lang.Runnable
                public final void run() {
                    SuspendWindowService.O00.XOO0ii0(suspendWindowService);
                }
            });
        }
    }

    public static final class OXO1 implements View.OnTouchListener {

        /* JADX INFO: renamed from: I1 */
        @aa1
        public final WindowManager f54417I1;

        /* JADX INFO: renamed from: IO */
        @aa1
        public final WindowManager.LayoutParams f54418IO;
        public int X11iII1O1;
        public int XXX11i;

        @aa1
        public final String iX1O1;

        public OXO1(@aa1 WindowManager.LayoutParams wl, @aa1 WindowManager windowManager) {
            Intrinsics.X0O(wl, "wl");
            Intrinsics.X0O(windowManager, "windowManager");
            this.f54418IO = wl;
            this.f54417I1 = windowManager;
            this.iX1O1 = "ItemViewTouchListener";
        }

        @aa1
        public final WindowManager OXO1() {
            return this.f54417I1;
        }

        @aa1
        public final WindowManager.LayoutParams XIi00iiXO() {
            return this.f54418IO;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@aa1 View view, @aa1 MotionEvent motionEvent) {
            Intrinsics.X0O(view, "view");
            Intrinsics.X0O(motionEvent, "motionEvent");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(this.iX1O1 + " onTouch event = " + motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.X11iII1O1 = (int) motionEvent.getRawX();
                this.XXX11i = (int) motionEvent.getRawY();
                return false;
            }
            if (action != 2) {
                return false;
            }
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int i = this.XXX11i;
            if (i != 0) {
                int i2 = this.X11iII1O1;
                int i3 = rawX - i2;
                int i4 = rawY - i;
                i1o0oxo1o.OXO1(this.iX1O1 + " movedX = " + i3 + " , movedY = " + i4 + " , x = " + i2 + " , y = " + i + " , nowX = " + rawX + " , nowY = " + rawY);
                WindowManager.LayoutParams layoutParams = this.f54418IO;
                layoutParams.x = layoutParams.x + i3;
                layoutParams.y = layoutParams.y + i4;
                WindowManager windowManager = this.f54417I1;
                if (windowManager != null) {
                    windowManager.updateViewLayout(view, layoutParams);
                }
            }
            this.X11iII1O1 = rawX;
            this.XXX11i = rawY;
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
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ XIi00iiXO XO0O10(XIi00iiXO xIi00iiXO, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = xIi00iiXO.OXO1;
            }
            if ((i & 2) != 0) {
                str2 = xIi00iiXO.XIi00iiXO;
            }
            return xIi00iiXO.m38298iO(str, str2);
        }

        public final void I0IIOi(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.XIi00iiXO = str;
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

        public final void XOO0ii0(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.OXO1 = str;
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof XIi00iiXO)) {
                return false;
            }
            XIi00iiXO xIi00iiXO = (XIi00iiXO) obj;
            return Intrinsics.XOO0ii0(this.OXO1, xIi00iiXO.OXO1) && Intrinsics.XOO0ii0(this.XIi00iiXO, xIi00iiXO.XIi00iiXO);
        }

        public int hashCode() {
            return (this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode();
        }

        @aa1
        /* JADX INFO: renamed from: iO */
        public final XIi00iiXO m38298iO(@aa1 String mContent, @aa1 String mExtraInfo) {
            Intrinsics.X0O(mContent, "mContent");
            Intrinsics.X0O(mExtraInfo, "mExtraInfo");
            return new XIi00iiXO(mContent, mExtraInfo);
        }

        @aa1
        public String toString() {
            return "TranslateDate(mContent=" + this.OXO1 + ", mExtraInfo=" + this.XIi00iiXO + I000IiI1O.C2156iO.f1007iO;
        }

        public XIi00iiXO(@aa1 String mContent, @aa1 String mExtraInfo) {
            Intrinsics.X0O(mContent, "mContent");
            Intrinsics.X0O(mExtraInfo, "mExtraInfo");
            this.OXO1 = mContent;
            this.XIi00iiXO = mExtraInfo;
        }

        public /* synthetic */ XIi00iiXO(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    public static final class XO0O10 implements Runnable {
        public XO0O10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SuspendWindowService.this.showBg(false);
        }
    }

    public static final class XOO0ii0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Function1 f54420IO;

        public XOO0ii0(Function1 function) {
            Intrinsics.X0O(function, "function");
            this.f54420IO = function;
        }

        public final boolean equals(@tb1 Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.f54420IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54420IO.invoke2(obj);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.service.SuspendWindowService$iO */
    public static final class RunnableC18641iO implements Runnable {
        public RunnableC18641iO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SuspendWindowService.this.showBg(false);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.service.SuspendWindowService$translateITS$1 */
    public static final class C186431 implements O1XIiIO<String> {
        public C186431() {
        }

        /* JADX INFO: renamed from: iO */
        public static final void m38299iO(SuspendWindowService suspendWindowService) {
            suspendWindowService.getTv_translate_t().setVisibility(0);
            suspendWindowService.setRecordText();
            if (suspendWindowService.onlyshowTranslate) {
                suspendWindowService.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", String.valueOf(suspendWindowService.getMExtraInfo())));
                return;
            }
            suspendWindowService.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", suspendWindowService.getMExtraInfo() + "\n(" + suspendWindowService.getMContent() + I000IiI1O.C2156iO.f1007iO));
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public void handleResponse(String str) {
            LogUtils.m11128d(SuspendWindowService.this.TAG + " translateITS text = " + str);
            if (str == null || str.length() <= 0) {
                SuspendWindowService.this.setMContent("");
                SuspendWindowService.this.setMExtraInfo("");
                SuspendWindowService.this.saveDBRecord();
                SuspendWindowService.this.sendTranslationResult();
                return;
            }
            SuspendWindowService.this.setMExtraInfo(StringsKt__StringsKt.iX1X1(str).toString());
            Handler handler = SuspendWindowService.this.handle;
            final SuspendWindowService suspendWindowService = SuspendWindowService.this;
            handler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.uh5
                @Override // java.lang.Runnable
                public final void run() {
                    SuspendWindowService.C186431.m38299iO(suspendWindowService);
                }
            });
            I01XX0.OXO1(I01XX0.XOXOIX0Oi, new XIi00iiXO(SuspendWindowService.this.getMContent(), SuspendWindowService.this.getMExtraInfo()));
            SuspendWindowService.this.saveDBRecord();
            SuspendWindowService.this.sendTranslationResult();
            SuspendWindowService suspendWindowService2 = SuspendWindowService.this;
            suspendWindowService2.voiceChainAi(suspendWindowService2.getMExtraInfo());
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            LogUtils.m11128d(SuspendWindowService.this.TAG + " translateITS text = " + error);
            SuspendWindowService.this.setMContent("");
            SuspendWindowService.this.setMExtraInfo("");
            SuspendWindowService.this.saveDBRecord();
            SuspendWindowService.this.sendTranslationResult();
        }
    }

    private final Notification buildNotification() {
        Notification notificationBuild = new NotificationCompat.Builder(this, this.CHANNEL_ID).setSmallIcon(R.mipmap.ic_launcher).setContentTitle(getString(R.string.recording_services)).setContentText(getString(R.string.recording_in_the_background)).setOngoing(true).setPriority(1).setContentIntent(PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) MainActivity.class), 67108864)).build();
        Intrinsics.O10IXXX0X(notificationBuild, "build(...)");
        return notificationBuild;
    }

    private final void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(this.CHANNEL_ID, getString(R.string.recording_services), 2);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private final void initLanguage() {
        setMLanguageTranslationList(LanguageTranslationKt.getTranslationLanguageList());
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsM1440iO = a01Var.m1440iO();
        LanguageTranslationData languageTranslationData = (LanguageTranslationData) new Gson().fromJson(sPUtilsM1440iO.getString(b01.OXii10I + '_' + LanguageTranslationData.class.getName()), LanguageTranslationData.class);
        if (languageTranslationData == null) {
            languageTranslationData = getMLanguageTranslationList().get(0);
        }
        setMLeftLanguage(languageTranslationData);
        SPUtils sPUtilsM1440iO2 = a01Var.m1440iO();
        LanguageTranslationData languageTranslationData2 = (LanguageTranslationData) new Gson().fromJson(sPUtilsM1440iO2.getString(b01.I011X + '_' + LanguageTranslationData.class.getName()), LanguageTranslationData.class);
        if (languageTranslationData2 == null) {
            languageTranslationData2 = getMLanguageTranslationList().get(1);
        }
        setMRightLanguage(languageTranslationData2);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " initLanguage mLeftLanguage = " + getMLeftLanguage() + " , mRightLanguage = " + getMRightLanguage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initObserve$lambda$0$0(SuspendWindowService suspendWindowService, Boolean bool) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        rg5 rg5Var = rg5.OXO1;
        i1o0oxo1o.OXO1("isShowSuspenWindow: " + bool + "  show:" + rg5Var.OXO1());
        if (!Intrinsics.XOO0ii0(Boolean.valueOf(rg5Var.OXO1()), bool)) {
            if (bool.booleanValue()) {
                suspendWindowService.showWindow();
                rg5Var.XIi00iiXO(true);
            } else {
                suspendWindowService.handle.removeCallbacksAndMessages(null);
                rg5Var.XIi00iiXO(false);
                suspendWindowService.stopSelf();
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initObserve$lambda$0$1(SuspendWindowService suspendWindowService, Boolean bool) {
        if (bool.booleanValue()) {
            i1O0OXO1O.OXO1.OXO1("isReSetList: " + bool);
            suspendWindowService.setMicrosoftCallback();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initViedo$lambda$0(final SuspendWindowService suspendWindowService, int i, int i2, int i3) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(suspendWindowService.TAG + " mode:" + i + ",type:" + i2 + ",earDirection:" + i3);
        if (i2 == 0) {
            i1o0oxo1o.OXO1(suspendWindowService.TAG + " TRANSFER_STATUS_START");
            suspendWindowService.isEndTranslation = false;
            suspendWindowService.isStartAnalysis = true;
            DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
            dcsTtsPlayer.deleteReplayMusic();
            dcsTtsPlayer.stop();
            fq1.OXO1.OIi0();
            VoiceManager.INSTANCE.setLanguageType(suspendWindowService.arsLanguage, suspendWindowService.ttsVoiceName);
            suspendWindowService.getTv_original_t().setText("");
            suspendWindowService.getTv_translate_t().setText("");
            q62 q62Var = q62.OXO1;
            if (q62Var.X11I()) {
                suspendWindowService.startRecording();
            } else if (q62Var.OIXOOi()) {
                i1o0oxo1o.OXO1(suspendWindowService.TAG + " startRecording1");
                suspendWindowService.startRecording();
            } else {
                suspendWindowService.handle.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.hh5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7131IO.showRecordingPopup();
                    }
                });
            }
        } else if (i2 == 1) {
            i1o0oxo1o.OXO1(suspendWindowService.TAG + " TRANSFER_STATUS_GO_ON");
            RecordingManager.Companion companion = RecordingManager.Companion;
            if (!companion.getInstance().isRecording()) {
                companion.getInstance().setRecording(true);
            }
        } else if (i2 == 2) {
            i1o0oxo1o.OXO1(suspendWindowService.TAG + " TRANSFER_STATUS_END");
            suspendWindowService.isEndTranslation = true;
            stopRecording$default(suspendWindowService, false, 1, null);
            suspendWindowService.isStartAnalysis = false;
            q62 q62Var2 = q62.OXO1;
            if (q62Var2.X11I()) {
                MicrosoftSDKManage.O1O.OXO1().m38829Xi();
            }
            if (q62Var2.OIXOOi() && !q62Var2.X11I()) {
                suspendWindowService.handle.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ih5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8508IO.disRecordingPopup();
                    }
                });
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SuspendWindowService suspendWindowService, View view) {
        suspendWindowService.getTv_translate().setText(R.string.enter_content);
        suspendWindowService.getTv_original_t().setText("");
        suspendWindowService.getTv_translate_t().setText("");
        suspendWindowService.setLaunguage();
        RecordingManager.Companion companion = RecordingManager.Companion;
        LogUtils.m11128d("isRecording = " + companion.getInstance().isRecording());
        if (companion.getInstance().isRecording()) {
            suspendWindowService.stopRecording(true);
            DcsTtsPlayer.INSTANCE.stop();
        }
        suspendWindowService.showRecordingPopup(true);
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        suspendWindowService.clickDownRecording(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SuspendWindowService suspendWindowService, View view) {
        RecordingManager.Companion companion = RecordingManager.Companion;
        LogUtils.m11128d("isRecording = " + companion.getInstance().isRecording());
        if (companion.getInstance().isRecording()) {
            suspendWindowService.stopRecording(true);
            DcsTtsPlayer.INSTANCE.stop();
        }
        suspendWindowService.showRecordingPopup(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(SuspendWindowService suspendWindowService, View view) {
        Log.d(suspendWindowService.TAG, "img_close: ");
        a01.OXO1.OXO1().put(b01.i0O, false);
        I01XX0.XIi00iiXO(I01XX0.I0i0, null, 2, null);
        ViewModelMain.INSTANCE.isShowSuspenWindow().postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(SuspendWindowService suspendWindowService, CompoundButton compoundButton, boolean z) {
        Intrinsics.X0O(compoundButton, "<unused var>");
        Log.d(suspendWindowService.TAG, "translate_check: " + z);
        a01.OXO1.OXO1().put(b01.IOX1, z);
        suspendWindowService.translateCheckStatus = z;
        I01XX0.XIi00iiXO(I01XX0.f1086OI, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(SuspendWindowService suspendWindowService, CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        Log.d(suspendWindowService.TAG, "broadcast_check: " + z);
        a01.OXO1.OXO1().put(b01.XIIIO, z);
        suspendWindowService.broadcastCheckStatus = z;
        I01XX0.XIi00iiXO(I01XX0.I0iOXO, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$6(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7(SuspendWindowService suspendWindowService, CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        Log.d(suspendWindowService.TAG, "original_check: " + z);
        a01.OXO1.OXO1().put(b01.Oiii, z);
        suspendWindowService.showOriginalTextStatus = z;
        suspendWindowService.setRecordText();
        suspendWindowService.getOriginal_check().setText(suspendWindowService.getString(suspendWindowService.showOriginalTextStatus ? R.string.show_original_text : R.string.show_translation_result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$9(SuspendWindowService suspendWindowService, View view) {
        suspendWindowService.showBg(true);
        suspendWindowService.handle.postDelayed(suspendWindowService.new RunnableC18641iO(), 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit permission$lambda$0(PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        PermissionStatus permissionStatus = PermissionStatus.GRANTED;
        return Unit.OXO1;
    }

    private final void sendChainAiTranslationResultInput(final String str) {
        if (!this.translateCheckStatus) {
            this.handle.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.fh5
                @Override // java.lang.Runnable
                public final void run() {
                    SuspendWindowService.sendChainAiTranslationResultInput$lambda$0(this.f6646IO, str);
                }
            });
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " sendChainAiTranslationResultInput str = " + str + " , lang = " + this.lang + " , targetLang = " + this.targetLang);
        this.mContent = StringsKt__StringsKt.iX1X1(str).toString();
        if (!Intrinsics.XOO0ii0(this.lang, "cn") && !Intrinsics.XOO0ii0(this.targetLang, "cn")) {
            AISparkChainManager.OXO1.IX1XiI(str, this.lang, "cn", new O1XIiIO<String>() { // from class: com.sma.smartv3.service.SuspendWindowService.sendChainAiTranslationResultInput.2
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str2) {
                    if (str2 == null || str2.length() <= 0) {
                        return;
                    }
                    SuspendWindowService suspendWindowService = SuspendWindowService.this;
                    suspendWindowService.translateITS(str2, "cn", suspendWindowService.getTargetLang());
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.XIi00iiXO(SuspendWindowService.this.TAG + " handleError error = " + error);
                }
            });
            return;
        }
        LogUtils.m11128d(this.TAG + " sendChainAiTranslationResultInput str = " + str + " , lang = " + this.lang + " , targetLang = " + this.targetLang);
        translateITS$default(this, str, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendChainAiTranslationResultInput$lambda$0(SuspendWindowService suspendWindowService, String str) {
        suspendWindowService.getTv_translate_t().setVisibility(0);
        if (!suspendWindowService.onlyshowTranslate) {
            suspendWindowService.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", str));
        }
        suspendWindowService.mContent = str;
        suspendWindowService.mExtraInfo = "";
        suspendWindowService.setRecordText();
        I01XX0.OXO1(I01XX0.XOXOIX0Oi, new XIi00iiXO(suspendWindowService.mContent, suspendWindowService.mExtraInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendTranslate$lambda$0(SuspendWindowService suspendWindowService, String str) {
        suspendWindowService.sendChainAiTranslationResultInput(str);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendTranslationResultInput(final String str) {
        if (!this.translateCheckStatus) {
            this.handle.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.dh5
                @Override // java.lang.Runnable
                public final void run() {
                    SuspendWindowService.sendTranslationResultInput$lambda$0(this.f6190IO, str);
                }
            });
            return;
        }
        if (str.length() <= 0 || Intrinsics.XOO0ii0(str, UtilsKt.XXO(R.string.request_error))) {
            this.mContent = "";
            this.mExtraInfo = "";
            getClipboard().setPrimaryClip(ClipData.newPlainText("aura", this.mContent));
            ToastUtils.showShort(getString(R.string.request_error), new Object[0]);
            saveDBRecord();
            sendTranslationResult();
            return;
        }
        i1O0OXO1O.OXO1.OXO1("startAudioStreamInput ===> str = " + str + " , targetLang = " + this.targetLang);
        MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
        xIi00iiXO.OXO1().IXI();
        xIi00iiXO.OXO1().m38826OI(str, this.targetLang, new Function1() { // from class: com.android.mltcode.paycertificationapi.gh5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SuspendWindowService.sendTranslationResultInput$lambda$1(this.f6886IO, str, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendTranslationResultInput$lambda$0(SuspendWindowService suspendWindowService, String str) {
        suspendWindowService.getTv_translate_t().setVisibility(0);
        if (str.length() <= 0 || Intrinsics.XOO0ii0(str, UtilsKt.XXO(R.string.request_error))) {
            suspendWindowService.mContent = "";
        } else {
            suspendWindowService.mContent = str;
        }
        if (!suspendWindowService.onlyshowTranslate) {
            suspendWindowService.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", suspendWindowService.mContent));
        }
        suspendWindowService.mExtraInfo = "";
        suspendWindowService.setRecordText();
        I01XX0.OXO1(I01XX0.XOXOIX0Oi, new XIi00iiXO(suspendWindowService.mContent, suspendWindowService.mExtraInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendTranslationResultInput$lambda$1(SuspendWindowService suspendWindowService, String str, String it) {
        Intrinsics.X0O(it, "it");
        LogUtils.m11128d(suspendWindowService.TAG + " sendTranslationResultInput it = " + it);
        suspendWindowService.mContent = StringsKt__StringsKt.iX1X1(str).toString();
        String string = StringsKt__StringsKt.iX1X1(it).toString();
        suspendWindowService.mExtraInfo = string;
        I01XX0.OXO1(I01XX0.XOXOIX0Oi, new XIi00iiXO(suspendWindowService.mContent, string));
        suspendWindowService.getTv_translate_t().setVisibility(0);
        suspendWindowService.setRecordText();
        if (suspendWindowService.onlyshowTranslate) {
            suspendWindowService.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", String.valueOf(suspendWindowService.mExtraInfo)));
        } else {
            suspendWindowService.getClipboard().setPrimaryClip(ClipData.newPlainText("aura", suspendWindowService.mExtraInfo + "\n(" + suspendWindowService.mContent + I000IiI1O.C2156iO.f1007iO));
        }
        suspendWindowService.voiceMicrosoft(it);
        suspendWindowService.saveDBRecord();
        suspendWindowService.sendTranslationResult();
        return Unit.OXO1;
    }

    public static /* synthetic */ void stopRecording$default(SuspendWindowService suspendWindowService, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        suspendWindowService.stopRecording(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void translateITS(String str, String str2, String str3) {
        AISparkChainManager.OXO1.IX1XiI(str, str2, str3, new C186431());
    }

    public static /* synthetic */ void translateITS$default(SuspendWindowService suspendWindowService, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = suspendWindowService.lang;
        }
        if ((i & 4) != 0) {
            str3 = suspendWindowService.targetLang;
        }
        suspendWindowService.translateITS(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void voiceChainAi(String str) {
        if (this.broadcastCheckStatus) {
            DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
            dcsTtsPlayer.initSegmentation();
            DcsTtsPlayer.play$default(dcsTtsPlayer, str, true, false, null, this.ttsVoiceName, "voiceChainAi", 12, null);
        }
    }

    private final void voiceMicrosoft(String str) {
        if (this.broadcastCheckStatus) {
            MicrosoftSDKManage.O1O.OXO1().XXIIO1i11(str, this.ttsVoiceName);
        }
    }

    public final void bindView() {
        FloatFrameLayout floatFrameLayout = this.floatRootView;
        View viewFindViewById = floatFrameLayout != null ? floatFrameLayout.findViewById(R.id.rootView) : null;
        Intrinsics.XXI(viewFindViewById);
        setRoot(viewFindViewById);
        FloatFrameLayout floatFrameLayout2 = this.floatRootView;
        View viewFindViewById2 = floatFrameLayout2 != null ? floatFrameLayout2.findViewById(R.id.rl_show_all) : null;
        Intrinsics.XXI(viewFindViewById2);
        setRl_show_all(viewFindViewById2);
        FloatFrameLayout floatFrameLayout3 = this.floatRootView;
        View viewFindViewById3 = floatFrameLayout3 != null ? floatFrameLayout3.findViewById(R.id.ll_hide_content) : null;
        Intrinsics.XXI(viewFindViewById3);
        setLl_hide_content(viewFindViewById3);
        FloatFrameLayout floatFrameLayout4 = this.floatRootView;
        ImageView imageView = floatFrameLayout4 != null ? (ImageView) floatFrameLayout4.findViewById(R.id.img_record) : null;
        Intrinsics.XXI(imageView);
        setImg_record(imageView);
        FloatFrameLayout floatFrameLayout5 = this.floatRootView;
        AppCompatImageView appCompatImageView = floatFrameLayout5 != null ? (AppCompatImageView) floatFrameLayout5.findViewById(R.id.img_close) : null;
        Intrinsics.XXI(appCompatImageView);
        setImg_close(appCompatImageView);
        FloatFrameLayout floatFrameLayout6 = this.floatRootView;
        CheckBox checkBox = floatFrameLayout6 != null ? (CheckBox) floatFrameLayout6.findViewById(R.id.translate_check) : null;
        Intrinsics.XXI(checkBox);
        setTranslate_check(checkBox);
        FloatFrameLayout floatFrameLayout7 = this.floatRootView;
        CheckBox checkBox2 = floatFrameLayout7 != null ? (CheckBox) floatFrameLayout7.findViewById(R.id.broadcast_check) : null;
        Intrinsics.XXI(checkBox2);
        setBroadcast_check(checkBox2);
        FloatFrameLayout floatFrameLayout8 = this.floatRootView;
        CheckBox checkBox3 = floatFrameLayout8 != null ? (CheckBox) floatFrameLayout8.findViewById(R.id.original_check) : null;
        Intrinsics.XXI(checkBox3);
        setOriginal_check(checkBox3);
        FloatFrameLayout floatFrameLayout9 = this.floatRootView;
        View viewFindViewById4 = floatFrameLayout9 != null ? floatFrameLayout9.findViewById(R.id.bottom_line) : null;
        Intrinsics.XXI(viewFindViewById4);
        setBottom_line(viewFindViewById4);
        FloatFrameLayout floatFrameLayout10 = this.floatRootView;
        TextView textView = floatFrameLayout10 != null ? (TextView) floatFrameLayout10.findViewById(R.id.tv_translate_t) : null;
        Intrinsics.XXI(textView);
        setTv_translate_t(textView);
        FloatFrameLayout floatFrameLayout11 = this.floatRootView;
        TextView textView2 = floatFrameLayout11 != null ? (TextView) floatFrameLayout11.findViewById(R.id.tv_translate) : null;
        Intrinsics.XXI(textView2);
        setTv_translate(textView2);
        FloatFrameLayout floatFrameLayout12 = this.floatRootView;
        LinearLayout linearLayout = floatFrameLayout12 != null ? (LinearLayout) floatFrameLayout12.findViewById(R.id.ll_show_set) : null;
        Intrinsics.XXI(linearLayout);
        setLl_show_set(linearLayout);
        FloatFrameLayout floatFrameLayout13 = this.floatRootView;
        FrameLayout frameLayout = floatFrameLayout13 != null ? (FrameLayout) floatFrameLayout13.findViewById(R.id.fl_recording) : null;
        Intrinsics.XXI(frameLayout);
        setFl_recording(frameLayout);
        FloatFrameLayout floatFrameLayout14 = this.floatRootView;
        TextView textView3 = floatFrameLayout14 != null ? (TextView) floatFrameLayout14.findViewById(R.id.tv_original_t) : null;
        Intrinsics.XXI(textView3);
        setTv_original_t(textView3);
        FloatFrameLayout floatFrameLayout15 = this.floatRootView;
        ImageView imageView2 = floatFrameLayout15 != null ? (ImageView) floatFrameLayout15.findViewById(R.id.img_recording_animation) : null;
        Intrinsics.XXI(imageView2);
        setImg_recording_animation(imageView2);
        FloatFrameLayout floatFrameLayout16 = this.floatRootView;
        ImageView imageView3 = floatFrameLayout16 != null ? (ImageView) floatFrameLayout16.findViewById(R.id.img_recording) : null;
        Intrinsics.XXI(imageView3);
        setImg_recording(imageView3);
        FloatFrameLayout floatFrameLayout17 = this.floatRootView;
        ImageView imageView4 = floatFrameLayout17 != null ? (ImageView) floatFrameLayout17.findViewById(R.id.img_record_show) : null;
        Intrinsics.XXI(imageView4);
        setImg_record_show(imageView4);
    }

    public final void clickDownRecording(int i) {
        if (!PermissionUtils.isGranted(PermissionConstants.MICROPHONE)) {
            permission();
        } else {
            DcsTtsPlayer.INSTANCE.deleteReplayMusic();
            startRecording();
        }
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
        View view = this.bottom_line;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("bottom_line");
        return null;
    }

    @aa1
    public final CheckBox getBroadcast_check() {
        CheckBox checkBox = this.broadcast_check;
        if (checkBox != null) {
            return checkBox;
        }
        Intrinsics.XXO("broadcast_check");
        return null;
    }

    @aa1
    public final ClipboardManager getClipboard() {
        ClipboardManager clipboardManager = this.clipboard;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Intrinsics.XXO("clipboard");
        return null;
    }

    @aa1
    public final FrameLayout getFl_recording() {
        FrameLayout frameLayout = this.fl_recording;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.XXO("fl_recording");
        return null;
    }

    @aa1
    public final ImageView getImg_close() {
        ImageView imageView = this.img_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("img_close");
        return null;
    }

    @aa1
    public final ImageView getImg_record() {
        ImageView imageView = this.img_record;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("img_record");
        return null;
    }

    @aa1
    public final ImageView getImg_record_show() {
        ImageView imageView = this.img_record_show;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("img_record_show");
        return null;
    }

    @aa1
    public final ImageView getImg_recording() {
        ImageView imageView = this.img_recording;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("img_recording");
        return null;
    }

    @aa1
    public final ImageView getImg_recording_animation() {
        ImageView imageView = this.img_recording_animation;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("img_recording_animation");
        return null;
    }

    @aa1
    public final String getLang() {
        return this.lang;
    }

    @aa1
    public final View getLl_hide_content() {
        View view = this.ll_hide_content;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("ll_hide_content");
        return null;
    }

    @aa1
    public final LinearLayout getLl_show_set() {
        LinearLayout linearLayout = this.ll_show_set;
        if (linearLayout != null) {
            return linearLayout;
        }
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
        List<LanguageTranslationData> list = this.mLanguageTranslationList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("mLanguageTranslationList");
        return null;
    }

    @aa1
    public final LanguageTranslationData getMLeftLanguage() {
        LanguageTranslationData languageTranslationData = this.mLeftLanguage;
        if (languageTranslationData != null) {
            return languageTranslationData;
        }
        Intrinsics.XXO("mLeftLanguage");
        return null;
    }

    @aa1
    public final LanguageTranslationData getMRightLanguage() {
        LanguageTranslationData languageTranslationData = this.mRightLanguage;
        if (languageTranslationData != null) {
            return languageTranslationData;
        }
        Intrinsics.XXO("mRightLanguage");
        return null;
    }

    @aa1
    public final MicrosoftSDKManage.InterfaceC19048iO getMicrosoftCallBack() {
        return this.microsoftCallBack;
    }

    @aa1
    public final CheckBox getOriginal_check() {
        CheckBox checkBox = this.original_check;
        if (checkBox != null) {
            return checkBox;
        }
        Intrinsics.XXO("original_check");
        return null;
    }

    @aa1
    public final AnimationDrawable getRecordAnimation() {
        AnimationDrawable animationDrawable = this.recordAnimation;
        if (animationDrawable != null) {
            return animationDrawable;
        }
        Intrinsics.XXO("recordAnimation");
        return null;
    }

    @aa1
    public final RecordingManager.OnRecordingCallback getRecordingCallBack() {
        return this.recordingCallBack;
    }

    @aa1
    public final View getRl_show_all() {
        View view = this.rl_show_all;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("rl_show_all");
        return null;
    }

    @aa1
    public final View getRoot() {
        View view = this.root;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("root");
        return null;
    }

    @aa1
    public final String getTargetLang() {
        return this.targetLang;
    }

    @aa1
    public final CheckBox getTranslate_check() {
        CheckBox checkBox = this.translate_check;
        if (checkBox != null) {
            return checkBox;
        }
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
        TextView textView = this.tv_original_t;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO("tv_original_t");
        return null;
    }

    @aa1
    public final TextView getTv_translate() {
        TextView textView = this.tv_translate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO("tv_translate");
        return null;
    }

    @aa1
    public final TextView getTv_translate_t() {
        TextView textView = this.tv_translate_t;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO("tv_translate_t");
        return null;
    }

    public final void initObserve() {
        ViewModelMain viewModelMain = ViewModelMain.INSTANCE;
        viewModelMain.isShowSuspenWindow().observe(this, new XOO0ii0(new Function1() { // from class: com.android.mltcode.paycertificationapi.lh5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SuspendWindowService.initObserve$lambda$0$0(this.f9438IO, (Boolean) obj);
            }
        }));
        viewModelMain.isReSetList().observe(this, new XOO0ii0(new Function1() { // from class: com.android.mltcode.paycertificationapi.mh5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SuspendWindowService.initObserve$lambda$0$1(this.f9701IO, (Boolean) obj);
            }
        }));
    }

    public final void initViedo() {
        VoiceManager voiceManager = VoiceManager.INSTANCE;
        voiceManager.setActivityData(true);
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I()) {
            MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
            xIi00iiXO.OXO1().IX1XiI();
            xIi00iiXO.OXO1().iIi1(this.microsoftCallBack, this.TAG);
        } else if (q62Var.OIXOOi()) {
            i1O0OXO1O.OXO1.OXO1(this.TAG + " initViedo");
            RecordingManager.Companion.getInstance().setRecordingCallback(this.recordingCallBack);
        }
        voiceManager.setMListener(new Function3() { // from class: com.android.mltcode.paycertificationapi.eh5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(SuspendWindowService.initViedo$lambda$0(this.f6421IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
            }
        });
    }

    public final void initView() {
        a01 a01Var = a01.OXO1;
        this.translateCheckStatus = a01Var.OXO1().getBoolean(b01.IOX1, true);
        this.broadcastCheckStatus = a01Var.OXO1().getBoolean(b01.XIIIO, true);
        this.showOriginalTextStatus = a01Var.OXO1().getBoolean(b01.Oiii, false);
        this.onlyshowTranslate = a01Var.OXO1().getBoolean(b01.i0iIXiI, false);
        Drawable background = getImg_recording_animation().getBackground();
        Intrinsics.X1ii(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        setRecordAnimation((AnimationDrawable) background);
        initLanguage();
        setLaunguage();
        showBg(true);
        initViedo();
        this.handle.postDelayed(new XO0O10(), 3000L);
        if (this.isShowRecordImg) {
            getImg_record().setVisibility(0);
        } else {
            getImg_record().setVisibility(8);
        }
        getImg_record().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.nh5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuspendWindowService.initView$lambda$0(this.f9934IO, view);
            }
        });
        getImg_recording().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ug5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuspendWindowService.initView$lambda$1(this.f11481IO, view);
            }
        });
        getImg_close().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.vg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuspendWindowService.initView$lambda$2(this.f11717IO, view);
            }
        });
        getTranslate_check().setChecked(this.translateCheckStatus);
        getTranslate_check().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.wg5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SuspendWindowService.initView$lambda$3(this.f11945IO, compoundButton, z);
            }
        });
        getTranslate_check().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuspendWindowService.initView$lambda$4(view);
            }
        });
        getBroadcast_check().setChecked(this.broadcastCheckStatus);
        getBroadcast_check().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.yg5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SuspendWindowService.initView$lambda$5(this.f12374IO, compoundButton, z);
            }
        });
        getBroadcast_check().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.zg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuspendWindowService.initView$lambda$6(view);
            }
        });
        String string = getString(R.string.enter_content);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        this.mContent = string;
        getOriginal_check().setChecked(this.showOriginalTextStatus);
        getOriginal_check().setText(getString(this.showOriginalTextStatus ? R.string.show_original_text : R.string.show_translation_result));
        getOriginal_check().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.ah5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SuspendWindowService.initView$lambda$7(this.f5500IO, compoundButton, z);
            }
        });
        getOriginal_check().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.bh5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuspendWindowService.initView$lambda$8(view);
            }
        });
        getLl_show_set().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ch5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuspendWindowService.initView$lambda$9(this.f5979IO, view);
            }
        });
        getImg_record_show().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.tg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11253IO.showBg(false);
            }
        });
        Object systemService = getSystemService("clipboard");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        setClipboard((ClipboardManager) systemService);
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
        LogUtils.m11128d("onCreate: ");
        O11XO1X.XO0O10().X1ii(this);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtils.m11128d("onDestroy");
        stopForeground(1);
        this.handle.removeCallbacksAndMessages(null);
        O11XO1X.XO0O10().OiIIX101O(this);
        FloatFrameLayout floatFrameLayout = this.floatRootView;
        if (floatFrameLayout != null) {
            WindowManager windowManager = this.windowManager;
            if (windowManager != null) {
                windowManager.removeView(floatFrameLayout);
            }
            this.isShow = false;
            getRecordAnimation().stop();
        }
        DcsTtsPlayer.INSTANCE.stop();
        VoiceManager voiceManager = VoiceManager.INSTANCE;
        voiceManager.setMListener(null);
        voiceManager.setMicrosoftCallback();
        RecordingManager.Companion.getInstance().closeBluetooth();
        voiceManager.setActivityData(false);
        stopRecording$default(this, false, 1, null);
    }

    @sf5(tag = I01XX0.iX01)
    public final void onLanguageChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onLanguageChange event = " + data);
        initLanguage();
        setLaunguage();
    }

    @sf5(tag = I01XX0.IiXIIX1O1)
    public final void onOnlyShowTranslation(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        this.onlyshowTranslate = a01.OXO1.OXO1().getBoolean(b01.i0iIXiI, false);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@tb1 Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        Notification notificationBuildNotification = buildNotification();
        if (Build.VERSION.SDK_INT >= 30) {
            startForeground(this.NOTIFICATION_ID, notificationBuildNotification, 128);
            return 1;
        }
        startForeground(this.NOTIFICATION_ID, notificationBuildNotification);
        return 1;
    }

    public final void permission() {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.MICROPHONE);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        String string = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String string2 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.kh5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SuspendWindowService.permission$lambda$0((PermissionStatus) obj);
            }
        });
    }

    public void saveDBRecord() {
    }

    public final void sendTranslate(@aa1 final String content) {
        Intrinsics.X0O(content, "content");
        i1O0OXO1O.OXO1.OXO1(this.TAG + "  sendTranslate  content = " + content + " lang = " + this.lang + ", targetLang = " + this.targetLang);
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I()) {
            sendTranslationResultInput(content);
        } else if (q62Var.OIXOOi()) {
            ThreadsKt.m39451iO(true, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.jh5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return SuspendWindowService.sendTranslate$lambda$0(this.f8967IO, content);
                }
            }, 30, null);
        }
    }

    public final void sendTranslationResult() {
        String str = this.mContent;
        if (str == null) {
            str = "null";
        }
        String str2 = this.mExtraInfo;
        sendTranslationResult(str, str2 != null ? str2 : "null");
    }

    public final void setAddListData(boolean z) {
        this.isAddListData = z;
    }

    public final void setArsAccent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.arsAccent = str;
    }

    public final void setArsLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.arsLanguage = str;
    }

    public final void setBottom_line(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.bottom_line = view;
    }

    public final void setBroadcast_check(@aa1 CheckBox checkBox) {
        Intrinsics.X0O(checkBox, "<set-?>");
        this.broadcast_check = checkBox;
    }

    public final void setClipboard(@aa1 ClipboardManager clipboardManager) {
        Intrinsics.X0O(clipboardManager, "<set-?>");
        this.clipboard = clipboardManager;
    }

    public final void setEndTranslation(boolean z) {
        this.isEndTranslation = z;
    }

    public final void setFl_recording(@aa1 FrameLayout frameLayout) {
        Intrinsics.X0O(frameLayout, "<set-?>");
        this.fl_recording = frameLayout;
    }

    public final void setImg_close(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.img_close = imageView;
    }

    public final void setImg_record(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.img_record = imageView;
    }

    public final void setImg_record_show(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.img_record_show = imageView;
    }

    public final void setImg_recording(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.img_recording = imageView;
    }

    public final void setImg_recording_animation(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.img_recording_animation = imageView;
    }

    public final void setLang(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.lang = str;
    }

    public final void setLaunguage() {
        VoiceManager voiceManager = VoiceManager.INSTANCE;
        voiceManager.setActivityData(true);
        this.lang = getMLeftLanguage().getRtasrLanguage();
        this.arsLanguage = getMLeftLanguage().getAsrLanguage();
        this.arsAccent = getMLeftLanguage().getAccent();
        this.targetLang = getMRightLanguage().getRtasrLanguage();
        this.ttsVoiceName = getMRightLanguage().getTtsViuceName();
        this.ttsTargetLang = getMRightLanguage().getAsrLanguage();
        voiceManager.setLanguageType(this.arsLanguage, this.ttsVoiceName);
    }

    public final void setLl_hide_content(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.ll_hide_content = view;
    }

    public final void setLl_show_set(@aa1 LinearLayout linearLayout) {
        Intrinsics.X0O(linearLayout, "<set-?>");
        this.ll_show_set = linearLayout;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMContentResult(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContentResult = str;
    }

    public final void setMExtraInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mExtraInfo = str;
    }

    public final void setMLanguageTranslationList(@aa1 List<LanguageTranslationData> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mLanguageTranslationList = list;
    }

    public final void setMLeftLanguage(@aa1 LanguageTranslationData languageTranslationData) {
        Intrinsics.X0O(languageTranslationData, "<set-?>");
        this.mLeftLanguage = languageTranslationData;
    }

    public final void setMRightLanguage(@aa1 LanguageTranslationData languageTranslationData) {
        Intrinsics.X0O(languageTranslationData, "<set-?>");
        this.mRightLanguage = languageTranslationData;
    }

    public final void setMicrosoftCallback() {
        initViedo();
    }

    public final void setOriginal_check(@aa1 CheckBox checkBox) {
        Intrinsics.X0O(checkBox, "<set-?>");
        this.original_check = checkBox;
    }

    public final void setRecordAnimation(@aa1 AnimationDrawable animationDrawable) {
        Intrinsics.X0O(animationDrawable, "<set-?>");
        this.recordAnimation = animationDrawable;
    }

    public final void setRecordText() {
        if (!this.showOriginalTextStatus) {
            if (this.mExtraInfo.length() == 0) {
                getTv_translate_t().setVisibility(8);
            }
            getTv_translate_t().setText(this.mExtraInfo);
            getTv_translate().setText(this.mExtraInfo);
            return;
        }
        if (this.mContent.length() == 0 || Intrinsics.XOO0ii0(this.mContent, getString(R.string.request_error))) {
            getTv_translate_t().setText("");
            getTv_translate_t().setVisibility(8);
        } else {
            getTv_translate_t().setText(this.mContent);
        }
        getTv_translate().setText(this.mContent);
    }

    public final void setRl_show_all(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.rl_show_all = view;
    }

    public final void setRoot(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.root = view;
    }

    public final void setStartAnalysis(boolean z) {
        this.isStartAnalysis = z;
    }

    public final void setTargetLang(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.targetLang = str;
    }

    public final void setTranslate_check(@aa1 CheckBox checkBox) {
        Intrinsics.X0O(checkBox, "<set-?>");
        this.translate_check = checkBox;
    }

    public final void setTtsTargetLang(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.ttsTargetLang = str;
    }

    public final void setTtsVoiceName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.ttsVoiceName = str;
    }

    public final void setTv_original_t(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.tv_original_t = textView;
    }

    public final void setTv_translate(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.tv_translate = textView;
    }

    public final void setTv_translate_t(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.tv_translate_t = textView;
    }

    public final void showBg(boolean z) {
        if (z) {
            getRoot().setBackgroundColor(Color.parseColor("#B2000000"));
            getRl_show_all().setVisibility(0);
            getLl_hide_content().setVisibility(8);
        } else {
            getRoot().setBackgroundColor(0);
            getRl_show_all().setVisibility(8);
            getLl_hide_content().setVisibility(0);
        }
    }

    public final void showRecordingPopup(boolean z) {
        if (z) {
            getImg_record().setVisibility(8);
            getFl_recording().setVisibility(0);
            getTv_translate_t().setVisibility(8);
            getRecordAnimation().start();
            return;
        }
        if (this.isShowRecordImg) {
            getImg_record().setVisibility(0);
        }
        getFl_recording().setVisibility(8);
        getTv_original_t().setVisibility(8);
        CharSequence text = getTv_translate_t().getText();
        Intrinsics.O10IXXX0X(text, "getText(...)");
        if (text.length() > 0) {
            getTv_translate_t().setVisibility(0);
        }
        getRecordAnimation().stop();
    }

    public final void showWindow() {
        Display defaultDisplay;
        Log.d(this.TAG, "showWindow: ");
        Object systemService = getSystemService("window");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = this.windowManager;
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = 2038;
        layoutParams.format = 1;
        layoutParams.flags = 40;
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        int i = displayMetrics.heightPixels;
        layoutParams.y = (i * 2) / 3;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " outMetrics.heightPixels * 2 / 3 = " + ((i * 2) / 3));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        View viewInflate = layoutInflaterFrom != null ? layoutInflaterFrom.inflate(R.layout.floating_interface, (ViewGroup) null) : null;
        Intrinsics.X1ii(viewInflate, "null cannot be cast to non-null type com.sma.smartv3.view.FloatFrameLayout");
        this.floatRootView = (FloatFrameLayout) viewInflate;
        bindView();
        initView();
        WindowManager windowManager2 = this.windowManager;
        if (windowManager2 != null) {
            FloatFrameLayout floatFrameLayout = this.floatRootView;
            if (floatFrameLayout != null) {
                Intrinsics.XXI(windowManager2);
                floatFrameLayout.setOnTouchListener(new OXO1(layoutParams, windowManager2));
            }
            WindowManager windowManager3 = this.windowManager;
            if (windowManager3 != null) {
                windowManager3.addView(this.floatRootView, layoutParams);
            }
        }
    }

    public void startRecording() {
        q62 q62Var = q62.OXO1;
        if (!q62Var.X11I()) {
            if (q62Var.OIXOOi()) {
                RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), this.recordingCallBack, false, false, this.TAG, 6, null);
                return;
            }
            return;
        }
        LogUtils.m11128d(this.TAG + " " + this.isStartAnalysis);
        this.isEndTranslation = false;
        this.isStartAnalysis = true;
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        MicrosoftSDKManage.O1O.OXO1().iIX0i(this.arsLanguage, true, this.ttsVoiceName, this.ttsTargetLang, false);
    }

    public final void stopRecording(boolean z) {
        if (!q62.OXO1.X11I()) {
            RecordingManager.Companion.getInstance().stopRecording();
            return;
        }
        if (z) {
            this.isEndTranslation = true;
            RecordingManager.Companion.getInstance().setRecording(false);
            MicrosoftSDKManage.O1O.OXO1().m38829Xi();
        }
        MicrosoftSDKManage.O1O.OXO1().XOIO11O();
    }

    public final void sendTranslationResult(@aa1 String inputText, @aa1 String outputText) {
        Intrinsics.X0O(inputText, "inputText");
        Intrinsics.X0O(outputText, "outputText");
        VoiceManager voiceManager = VoiceManager.INSTANCE;
        voiceManager.senAudioTextToDevice(new BleVoice(0, 0, 0, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(inputText).toString(), 14, null));
        voiceManager.senAudioTextToDevice(new BleVoice(1, 0, 0, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(outputText).toString(), 14, null));
    }

    public final void showRecordingPopup() {
        showRecordingPopup(true);
    }
}
