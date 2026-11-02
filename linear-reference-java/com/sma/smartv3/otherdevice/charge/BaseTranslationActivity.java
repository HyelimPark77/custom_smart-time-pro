package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I11i110I1;
import com.android.mltcode.paycertificationapi.I1O011;
import com.android.mltcode.paycertificationapi.IOI01IIIO;
import com.android.mltcode.paycertificationapi.O0OXX0;
import com.android.mltcode.paycertificationapi.O110O1III;
import com.android.mltcode.paycertificationapi.O11OO1;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OI1i01i01;
import com.android.mltcode.paycertificationapi.OO01I1i;
import com.android.mltcode.paycertificationapi.OOII0iI00;
import com.android.mltcode.paycertificationapi.OX0i1ii;
import com.android.mltcode.paycertificationapi.OiiXOI1;
import com.android.mltcode.paycertificationapi.X0OO;
import com.android.mltcode.paycertificationapi.X1II011X0;
import com.android.mltcode.paycertificationapi.XI0XI;
import com.android.mltcode.paycertificationapi.XIiXXXiOI;
import com.android.mltcode.paycertificationapi.XOOO00I;
import com.android.mltcode.paycertificationapi.XX0X0IX;
import com.android.mltcode.paycertificationapi.XXX11X1II;
import com.android.mltcode.paycertificationapi.XiX011;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.fq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1XO0OXX;
import com.android.mltcode.paycertificationapi.iIX1XI;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.AIRecordsDao;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.model.LeftAndRightPlayControl;
import com.sma.smartv3.model.ViewModelMain;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleVoice;
import com.szabh.smable3.entity.Languages;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBaseTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n90#2:776\n90#2:777\n85#2,3:816\n85#2,3:819\n85#2,3:822\n85#2,3:825\n173#3,7:778\n180#3,3:786\n143#3,7:789\n183#3:796\n173#3,7:797\n180#3,3:805\n143#3,7:808\n183#3:815\n1#4:785\n1#4:804\n1#4:828\n*S KotlinDebug\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity\n*L\n184#1:776\n186#1:777\n359#1:816,3\n373#1:819,3\n407#1:822,3\n408#1:825,3\n340#1:778,7\n340#1:786,3\n340#1:789,7\n340#1:796\n345#1:797,7\n345#1:805,3\n345#1:808,7\n345#1:815\n340#1:785\n345#1:804\n*E\n"})
public class BaseTranslationActivity extends BaseActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private String arsAccent;

    @aa1
    private String arsLanguage;

    @aa1
    private final OXO1 countdownRunnable;
    private long delayTime;
    private long elapsedTime;
    private boolean isAddListData;
    private boolean isAppSend;
    private boolean isEndTranslation;
    private boolean isStartAnalysis;
    private boolean isSteam;
    private boolean isSupportTransfer;

    @aa1
    private String lang;
    private final int loadTimeOut;
    private final int loadTimeOutToast;
    private int mAIFunctionType;

    @tb1
    private AIRecords mAIRecords;
    private int mAIRecordsType;

    @tb1
    private LanguageTranslationData mCacheLanguage;

    @aa1
    private String mContentResult;

    @aa1
    private final Handler mHandler;
    public List<LanguageTranslationData> mLanguageTranslationList;
    public LanguageTranslationData mLeftLanguage;

    @aa1
    private final AIRecordsDao mRecordsDao;
    private boolean mRecyclerViewAutoRefresh;
    public LanguageTranslationData mRightLanguage;

    @aa1
    private final Lazy mTransformLanguageImg$delegate;

    @aa1
    private final Lazy mTransformLanguageLeftTv$delegate;

    @aa1
    private final Lazy mTransformLanguageRightTv$delegate;

    @aa1
    private final MicrosoftSDKManage.iO microsoftCallBack;

    @tb1
    private O110O1III popCountdownPopup;

    @aa1
    private final RecordingManager.OnRecordingCallback recordingCallBack;

    @aa1
    private final Runnable runnable;
    private long startTime;
    private boolean switchRotateAnimation;

    @aa1
    private String targetLang;

    @aa1
    private String ttsTargetLang;

    @aa1
    private String ttsVoiceName;
    private final long updateInterval;

    public static final class OXO1 implements Runnable {
        public final /* synthetic */ BaseTranslationActivity IO;

        public OXO1(BaseTranslationActivity r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTranslationActivity r0 = this.IO;
            BaseTranslationActivity.access$setDelayTime$p(r0, BaseTranslationActivity.access$getDelayTime$p(r0) - this.IO.getUpdateInterval());
            if (BaseTranslationActivity.access$getDelayTime$p(this.IO) > 0) goto L12;
            O110O1III r1 = BaseTranslationActivity.access$getPopCountdownPopup$p(this.IO);
            if (r1 == null) goto L7;
            r1.dismiss();
        L7:
            BaseTranslationActivity.access$setDelayTime$p(this.IO, 3000);
            O110O1III r2 = BaseTranslationActivity.access$getPopCountdownPopup$p(this.IO);
            if (r2 == null) goto L10;
            r2.XiOIii1(String.valueOf(BaseTranslationActivity.access$getDelayTime$p(this.IO) / ((long) 1000)));
        L10:
            this.IO.countdownEnd();
            return;
        L12:
            O110O1III r3 = BaseTranslationActivity.access$getPopCountdownPopup$p(this.IO);
            if (r3 == null) goto L15;
            r3.XiOIii1(String.valueOf(BaseTranslationActivity.access$getDelayTime$p(this.IO) / ((long) 1000)));
        L15:
            this.IO.getMHandler().postDelayed(this, this.IO.getUpdateInterval());
        }
    }

    public static final class XIi00iiXO implements MicrosoftSDKManage.iO {
        public final /* synthetic */ BaseTranslationActivity OXO1;

        public XIi00iiXO(BaseTranslationActivity r1) {
            this.OXO1 = r1;
        }

        public static final void IiI10X(BaseTranslationActivity r1) {
            r1.setMContentResult("");
            r1.showRecordingPopup();
        }

        public static final void O00(BaseTranslationActivity r2, int r3, String r4) {
            if (r2.isAddListData() == true) goto L5;
            r2.setAddListData(true);
            r2.addList();
        L5:
            if (r3 != 1) goto L11;
            r2.getMHandler().removeMessages(BaseTranslationActivity.access$getLoadTimeOut$p(r2));
            r2.getMHandler().removeMessages(BaseTranslationActivity.access$getLoadTimeOutToast$p(r2));
            AIRecords r5 = r2.getMAIRecords();
            if (r5 == null) goto L9;
            r5.setMContent(r4);
        L9:
            r2.upDataLastList();
            BaseTranslationActivity.access$notifyView(r2);
            return;
        }

        public static /* synthetic */ void XIi00iiXO(BaseTranslationActivity r0) {
            IiI10X(r0);
        }

        public static /* synthetic */ void XO0O10(BaseTranslationActivity r0) {
            XOO0ii0(r0);
        }

        public static final void XOO0ii0(BaseTranslationActivity r6) {
            RecordingManager.Companion.getInstance().closeBluetooth();
            r6.disRecordingPopup();
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            r0.OXO1(BaseTranslationActivity.access$getTAG$p(r6) + "   onStopTransmission  isEndTranslation = " + r6.isEndTranslation() + " ");
            if (r6.isEndTranslation() == false) goto L13;
            boolean r2 = false;
            r6.setEndTranslation(false);
            r6.setAddListData(false);
            VoiceManager.INSTANCE.setSpeechRecRunning(false);
            if (r6.getMContentResult().length() <= 0) goto L8;
            r0.OXO1(BaseTranslationActivity.access$getTAG$p(r6) + "  sendTranslate onStopTransmission  content = " + r6.getMContentResult() + " ");
            BaseTranslationActivity.access$sendTranslationResultInput(r6, r6.getMContentResult());
            return;
        L8:
            String r1 = BaseTranslationActivity.access$getTAG$p(r6);
            if (r6.getMContentResult().length() <= 0) goto L11;
            r2 = true;
        L11:
            r0.OXO1(r1 + "  sendTranslate onStopTransmission  content = " + r2);
            DcsTtsPlayer.INSTANCE.stop();
            String r3 = r6.getString(R.string.request_error);
            Intrinsics.O10IXXX0X(r3, "getString(...)");
            BaseTranslationActivity.access$sendTranslationResultInput(r6, r3);
            return;
        }

        public static /* synthetic */ void iO(BaseTranslationActivity r0, int r1, String r2) {
            O00(r0, r1, r2);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onIdentifyResults(final int r5, final String r6) {
            Intrinsics.X0O(r6, "str");
            if (r5 != 2) goto L5;
            i1O0OXO1O.OXO1.OXO1(BaseTranslationActivity.access$getTAG$p(this.OXO1) + "  sendTranslate  onIdentifyResults content = " + r6);
            this.OXO1.setMContentResult(r6);
            this.OXO1.getMHandler().sendEmptyMessageDelayed(BaseTranslationActivity.access$getLoadTimeOut$p(this.OXO1), 2000);
        L5:
            final BaseTranslationActivity r0 = this.OXO1;
            r0.runOnUiThread(new I11i110I1(r0, r5, r6));
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public /* bridge */ void onIdentifyResultsDetectedLanguage(int r1, String r2, String r3) {
            super.onIdentifyResultsDetectedLanguage(r1, r2, r3);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(BaseTranslationActivity.access$getTAG$p(this.OXO1) + " onStartTransmission ");
            final BaseTranslationActivity r0 = this.OXO1;
            r0.runOnUiThread(new OiiXOI1(r0));
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.iO
        public void onStopTransmission() {
            final BaseTranslationActivity r0 = this.OXO1;
            r0.runOnUiThread(new IOI01IIIO(r0));
        }
    }

    public static final class XO0O10 implements Runnable {
        public final /* synthetic */ BaseTranslationActivity IO;

        public XO0O10(BaseTranslationActivity r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTranslationActivity r0 = this.IO;
            r0.setElapsedTime(r0.getElapsedTime() + this.IO.getUpdateInterval());
            this.IO.updateTimerText();
            this.IO.getMHandler().postDelayed(this, this.IO.getUpdateInterval());
        }
    }

    @SourceDebugExtension({"SMAP\nBaseTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$recordingCallBack$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n1#2:776\n*E\n"})
    public static final class iO implements RecordingManager.OnRecordingCallback {
        public final /* synthetic */ BaseTranslationActivity OXO1;

        public iO(BaseTranslationActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(BaseTranslationActivity r0) {
            iO(r0);
        }

        public static /* synthetic */ void XIi00iiXO(BaseTranslationActivity r0) {
            XO0O10(r0);
        }

        public static final void XO0O10(BaseTranslationActivity r0) {
            r0.disRecordingPopup();
        }

        public static final void iO(BaseTranslationActivity r0) {
            r0.showRecordingPopup();
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onBeforeRecording() {
            final BaseTranslationActivity r0 = this.OXO1;
            r0.runOnUiThread(new O0OXX0(r0));
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResult(AITranslation r5) {
            if (r5 != null) goto L4;
            return;
        L4:
            if (r5.getStatus() != 2) goto L38;
            DcsTtsPlayer.INSTANCE.stop();
            AIRecords r0 = this.OXO1.getMAIRecords();
            if (r0 == null) goto L11;
            String r1 = StringsKt__StringsKt.iX1X1(r5.getText()).toString();
            BaseTranslationActivity r2 = this.OXO1;
            if (r1.length() != 0) goto L10;
            AIRecords r3 = r2.getMAIRecords();
            Intrinsics.XXI(r3);
            r1 = r3.getMContent();
        L10:
            r0.setMContent(r1);
        L11:
            AIRecords r4 = this.OXO1.getMAIRecords();
            if (r4 == null) goto L17;
            String r6 = StringsKt__StringsKt.iX1X1(r5.getDst()).toString();
            BaseTranslationActivity r7 = this.OXO1;
            if (r6.length() != 0) goto L16;
            AIRecords r8 = r7.getMAIRecords();
            Intrinsics.XXI(r8);
            r6 = r8.getMExtraInfo();
        L16:
            r4.setMExtraInfo(r6);
        L17:
            this.OXO1.addList();
            BaseTranslationActivity.access$notifyView(this.OXO1);
            AIRecords r9 = this.OXO1.getMAIRecords();
            if (r9 == null) goto L29;
            String r10 = r9.getMContent();
            if (r10 == null) goto L29;
            if (r10.length() <= 0) goto L29;
            BaseTranslationActivity r11 = this.OXO1;
            AIRecords r12 = r11.getMAIRecords();
            if (r12 == null) goto L26;
            String r13 = r12.getMContent();
        L27:
            Intrinsics.XXI(r13);
            r11.sendTranslate(r13);
            return;
        L26:
            r13 = null;
        L29:
            AIRecords r14 = this.OXO1.getMAIRecords();
            if (r14 == null) goto L32;
            String r15 = this.OXO1.getString(R.string.recording_translate_error_tip);
            Intrinsics.O10IXXX0X(r15, "getString(...)");
            r14.setMContent(r15);
        L32:
            AIRecords r16 = this.OXO1.getMAIRecords();
            if (r16 == null) goto L35;
            r16.setMExtraInfo("");
        L35:
            this.OXO1.upDataLastList();
            BaseTranslationActivity.access$notifyView(this.OXO1);
            this.OXO1.saveDBRecord();
            return;
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResultError(String r5) {
            Intrinsics.X0O(r5, "error");
            BaseTranslationActivity r6 = this.OXO1;
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
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStopRecording() {
            final BaseTranslationActivity r0 = this.OXO1;
            r0.runOnUiThread(new XX0X0IX(r0));
        }
    }

    public BaseTranslationActivity() {
        this.TAG = "BaseTranslationActivity";
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new OX0i1ii(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new iIX1XI(this));
        this.mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();
        this.mTransformLanguageLeftTv$delegate = LazyKt__LazyJVMKt.iO(new X1II011X0(this));
        this.mTransformLanguageImg$delegate = LazyKt__LazyJVMKt.iO(new XiX011(this));
        this.mTransformLanguageRightTv$delegate = LazyKt__LazyJVMKt.iO(new XI0XI(this));
        this.loadTimeOut = 255;
        this.loadTimeOutToast = 254;
        this.delayTime = 3000;
        this.updateInterval = 1000;
        this.runnable = new XO0O10(this);
        this.countdownRunnable = new OXO1(this);
        this.mHandler = new Handler(Looper.getMainLooper(), new XOOO00I(this));
        this.mAIRecordsType = 1;
        this.mRecyclerViewAutoRefresh = true;
        this.switchRotateAnimation = true;
        this.recordingCallBack = new iO(this);
        this.mAIFunctionType = AIFunctionType.AI_TRANSLATION.getType();
        this.lang = "cn";
        this.targetLang = Languages.DEFAULT_LANGUAGE;
        this.ttsTargetLang = Languages.DEFAULT_LANGUAGE;
        this.ttsVoiceName = "x4_enus_catherine_profnews";
        this.arsLanguage = "zh_cn";
        this.arsAccent = "mandarin";
        this.mContentResult = "";
        this.microsoftCallBack = new XIi00iiXO(this);
    }

    public static /* synthetic */ void I0iXXO(BaseTranslationActivity r0) {
        initView$lambda$1$0(r0);
    }

    public static /* synthetic */ void I1XOi1(RotateAnimation r0, BaseTranslationActivity r1) {
        startRotateAnimation$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView IIX1OXO(BaseTranslationActivity r0) {
        return mTransformLanguageRightTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O10IXXX0X(BaseTranslationActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OII(BaseTranslationActivity r0, String r1, String r2) {
        return sendTranslationResultInput$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean OIX0iXi(BaseTranslationActivity r0, Message r1) {
        return mHandler$lambda$0(r0, r1);
    }

    public static /* synthetic */ void OX(BaseTranslationActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView OiIIX101O(BaseTranslationActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(BaseTranslationActivity r0) {
        initView$lambda$1$1(r0);
    }

    public static /* synthetic */ Unit X1ii(PermissionStatus r0) {
        return permission$lambda$0(r0);
    }

    public static /* synthetic */ void XX0(BaseTranslationActivity r0) {
        notifyView$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(BaseTranslationActivity r0) {
        return mTransformLanguageImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(BaseTranslationActivity r0, String r1) {
        return sendTranslate$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean XiOIii1(BaseTranslationActivity r0, int r1, int r2, int r3) {
        return initView$lambda$1(r0, r1, r2, r3);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(BaseTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(BaseTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ long access$getDelayTime$p(BaseTranslationActivity r2) {
        return r2.delayTime;
    }

    public static final /* synthetic */ int access$getLoadTimeOut$p(BaseTranslationActivity r0) {
        return r0.loadTimeOut;
    }

    public static final /* synthetic */ int access$getLoadTimeOutToast$p(BaseTranslationActivity r0) {
        return r0.loadTimeOutToast;
    }

    public static final /* synthetic */ O110O1III access$getPopCountdownPopup$p(BaseTranslationActivity r0) {
        return r0.popCountdownPopup;
    }

    public static final /* synthetic */ String access$getTAG$p(BaseTranslationActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$notifyView(BaseTranslationActivity r0) {
        r0.notifyView();
    }

    public static final /* synthetic */ void access$sendTranslationResultInput(BaseTranslationActivity r0, String r1) {
        r0.sendTranslationResultInput(r1);
    }

    public static final /* synthetic */ void access$setDelayTime$p(BaseTranslationActivity r0, long r1) {
        r0.delayTime = r1;
    }

    public static final /* synthetic */ void access$translateITS(BaseTranslationActivity r0, String r1, String r2, String r3) {
        r0.translateITS(r1, r2, r3);
    }

    public static /* synthetic */ TextView iIiiO(BaseTranslationActivity r0) {
        return mTransformLanguageLeftTv_delegate$lambda$0(r0);
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

    private static final void initView$lambda$0(BaseTranslationActivity r0, View r1) {
        r0.startRotateAnimation();
    }

    private static final boolean initView$lambda$1(final BaseTranslationActivity r27, int r28, int r29, int r30) {
        i1O0OXO1O.OXO1.OXO1(r27.TAG + " mode:" + r28 + ",type:" + r29 + ",earDirection:" + r30);
        int r3 = 2;
        if (r29 == 0) goto L21;
        if (r29 == 1) goto L18;
        if (r29 != 2) goto L7;
        r27.isEndTranslation = true;
        stopRecording$default(r27, false, 1, null);
        r27.mHandler.removeMessages(r27.loadTimeOut);
        r27.mHandler.removeMessages(r27.loadTimeOutToast);
        r27.isStartAnalysis = false;
        q62 r1 = q62.OXO1;
        if (r1.X11I() == false) goto L14;
        MicrosoftSDKManage.O1O.OXO1().Xi();
    L14:
        if (r1.OIXOOi() == true) goto L16;
    L35:
        return true;
    L16:
        if (r1.X11I() == true) goto L35;
        r27.runOnUiThread(new I1O011(r27));
        goto L35
    L7:
        if (r29 != 3) goto L35;
        r27.deviceSuspend();
        goto L35
    L18:
        RecordingManager.Companion r0 = RecordingManager.Companion;
        if (r0.getInstance().isRecording() == true) goto L35;
        r0.getInstance().setRecording(true);
        goto L35
    L21:
        r27.isEndTranslation = false;
        if (r30 == 1) goto L24;
    L26:
        r27.mAIRecordsType = r3;
        r27.isStartAnalysis = true;
        r27.setLangAndVoice();
        DcsTtsPlayer.INSTANCE.stop();
        fq1.OXO1.OIi0();
        VoiceManager r2 = VoiceManager.INSTANCE;
        r2.setLanguageType(r27.arsLanguage, r27.ttsVoiceName);
        q62 r4 = q62.OXO1;
        if (r4.X11I() == false) goto L30;
        r27.startRecording();
    L30:
        if (r4.OIXOOi() == true) goto L32;
    L34:
        r27.mAIRecords = new AIRecords(0, 0, null, r27.mAIFunctionType, r27.mAIRecordsType, "", null, 0, 0, 0, null, null, null, null, null, 0, r27.ttsVoiceName, 65479, null);
        r27.runOnUiThread(new i1XO0OXX(r27));
        goto L35
    L32:
        if (r2.isRecordBluetooth() == false) goto L34;
        r27.startRecording();
        goto L35
    L24:
        if (r27.isAppSend == true) goto L26;
        r3 = 1;
        goto L26
    }

    private static final void initView$lambda$1$0(BaseTranslationActivity r0) {
        r0.showRecordingPopup();
    }

    private static final void initView$lambda$1$1(BaseTranslationActivity r0) {
        r0.disRecordingPopup();
    }

    private static final boolean mHandler$lambda$0(BaseTranslationActivity r2, Message r3) {
        Intrinsics.X0O(r3, "it");
        int r4 = r3.what;
        if (r4 != r2.loadTimeOut) goto L6;
        r2.stopRecording(true);
    L8:
        return false;
    L6:
        if (r4 != r2.loadTimeOutToast) goto L8;
        ToastUtils.showLong(r2.getString(R.string.no_sound_recognized), new Object[0]);
        goto L8
    }

    private static final ImageView mTransformLanguageImg_delegate$lambda$0(BaseTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.transform_language_img);
    }

    private static final TextView mTransformLanguageLeftTv_delegate$lambda$0(BaseTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.dialogue_translation_left_tv);
    }

    private static final TextView mTransformLanguageRightTv_delegate$lambda$0(BaseTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.dialogue_translation_right_tv);
    }

    private final void notifyView() {
        runOnUiThread(new OO01I1i(this));
    }

    private static final void notifyView$lambda$0(BaseTranslationActivity r0) {
        r0.notifyViewData();
    }

    private static final Unit permission$lambda$0(PermissionStatus r1) {
        Intrinsics.X0O(r1, "it");
        PermissionStatus r2 = PermissionStatus.GRANTED;
        return Unit.OXO1;
    }

    private final void senAudioTextToDevice(BleVoice r9) {
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r9, false, false, 24, null);
    }

    private static final Unit sendTranslate$lambda$0(final BaseTranslationActivity r9, String r10) {
        if (Intrinsics.XOO0ii0(r9.lang, "cn") == false) goto L5;
    L7:
        translateITS$default(r9, r10, null, null, 6, null);
    L9:
        return Unit.OXO1;
    L5:
        if (Intrinsics.XOO0ii0(r9.targetLang, "cn") == true) goto L7;
        AISparkChainManager r0 = AISparkChainManager.OXO1;
        O1XIiIO<String> r2 = new BaseTranslationActivity$sendTranslate$1$1(r9);
        r0.IX1XiI(r10, r9.lang, "cn", r2);
        goto L9
    }

    private final void sendTranslationResultInput(final String r5) {
        this.mHandler.removeMessages(this.loadTimeOut);
        this.mHandler.removeMessages(this.loadTimeOutToast);
        this.isStartAnalysis = false;
        this.mRecyclerViewAutoRefresh = true;
        if (r5.length() > 0) goto L5;
    L8:
        AIRecords r6 = this.mAIRecords;
        if (r6 == null) goto L11;
        String r0 = getString(R.string.recording_translate_error_tip);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        r6.setMContent(r0);
    L11:
        AIRecords r7 = this.mAIRecords;
        if (r7 == null) goto L14;
        r7.setMExtraInfo("");
    L14:
        upDataLastList();
        notifyView();
        saveDBRecord();
        return;
    L5:
        if (Intrinsics.XOO0ii0(r5, getString(R.string.request_error)) == true) goto L8;
        i1O0OXO1O.OXO1.OXO1("startAudioStreamInput ===> str = " + r5 + " , targetLang = " + this.targetLang);
        MicrosoftSDKManage.XIi00iiXO r1 = MicrosoftSDKManage.O1O;
        r1.OXO1().IXI();
        r1.OXO1().OI(r5, this.targetLang, new OI1i01i01(this, r5));
    }

    private static final Unit sendTranslationResultInput$lambda$0(BaseTranslationActivity r4, String r5, String r6) {
        Intrinsics.X0O(r6, "it");
        AIRecords r0 = r4.mAIRecords;
        if (r0 == null) goto L8;
        String r7 = StringsKt__StringsKt.iX1X1(r5).toString();
        if (r7.length() != 0) goto L7;
        AIRecords r8 = r4.mAIRecords;
        Intrinsics.XXI(r8);
        r7 = r8.getMContent();
    L7:
        r0.setMContent(r7);
    L8:
        AIRecords r9 = r4.mAIRecords;
        if (r9 == null) goto L14;
        String r10 = StringsKt__StringsKt.iX1X1(r6).toString();
        if (r10.length() != 0) goto L13;
        AIRecords r11 = r4.mAIRecords;
        Intrinsics.XXI(r11);
        r10 = r11.getMExtraInfo();
    L13:
        r9.setMExtraInfo(r10);
    L14:
        MicrosoftSDKManage r12 = MicrosoftSDKManage.O1O.OXO1();
        AIRecords r13 = r4.mAIRecords;
        Intrinsics.XXI(r13);
        String r14 = r13.getMExtraInfo();
        AIRecords r1 = r4.mAIRecords;
        Intrinsics.XXI(r1);
        String r2 = r1.getTtsVoiceName();
        LeftAndRightPlayControl r3 = LeftAndRightPlayControl.LEFT_AND_RIGHT;
        AIRecords r15 = r4.mAIRecords;
        Intrinsics.XXI(r15);
        if (r15.getMType() != 1) goto L17;
        int r16 = 8;
    L18:
        r12.iX1O1(r14, r2, r3, r16);
        r4.mContentResult = "";
        r4.upDataLastList();
        r4.notifyView();
        r4.saveDBRecord();
        return Unit.OXO1;
    L17:
        r16 = 2;
        goto L18
    }

    private static final void startRotateAnimation$lambda$0(RotateAnimation r0, BaseTranslationActivity r1) {
        r0.cancel();
        r1.getMTransformLanguageImg().clearAnimation();
        r1.switchRotateAnimation = true;
    }

    public static /* synthetic */ void stopRecording$default(BaseTranslationActivity r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        r0.stopRecording(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecording");
    }

    private final void translateITS(String r3, String r4, String r5) {
        AISparkChainManager.OXO1.IX1XiI(r3, r4, r5, new AnonymousClass1(this));
    }

    public static /* synthetic */ void translateITS$default(BaseTranslationActivity r0, String r1, String r2, String r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = r0.lang;
    L7:
        if ((r4 & 4) == 0) goto L9;
        r3 = r0.targetLang;
    L9:
        r0.translateITS(r1, r2, r3);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translateITS");
    }

    public void addList() {
    }

    public final long addSendRecord(@aa1 AIRecords r3) {
        Intrinsics.X0O(r3, "mAIRecords");
        return this.mRecordsDao.insert(r3);
    }

    public final void closeBluetooth() {
        RecordingManager.Companion.getInstance().closeBluetooth();
    }

    public void countdownEnd() {
    }

    public void deviceSuspend() {
    }

    public void disRecordingPopup() {
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final String getArsAccent() {
        return this.arsAccent;
    }

    @aa1
    public final String getArsLanguage() {
        return this.arsLanguage;
    }

    public final long getElapsedTime() {
        return this.elapsedTime;
    }

    @aa1
    public final String getLang() {
        return this.lang;
    }

    public final int getMAIFunctionType() {
        return this.mAIFunctionType;
    }

    @tb1
    public final AIRecords getMAIRecords() {
        return this.mAIRecords;
    }

    public final int getMAIRecordsType() {
        return this.mAIRecordsType;
    }

    @tb1
    public final LanguageTranslationData getMCacheLanguage() {
        return this.mCacheLanguage;
    }

    @aa1
    public final String getMContentResult() {
        return this.mContentResult;
    }

    @aa1
    public final Handler getMHandler() {
        return this.mHandler;
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
    public final AIRecordsDao getMRecordsDao() {
        return this.mRecordsDao;
    }

    public final boolean getMRecyclerViewAutoRefresh() {
        return this.mRecyclerViewAutoRefresh;
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

    public final ImageView getMTransformLanguageImg() {
        return (ImageView) getValue();
    }

    public final TextView getMTransformLanguageLeftTv() {
        return (TextView) getValue();
    }

    public final TextView getMTransformLanguageRightTv() {
        return (TextView) getValue();
    }

    @aa1
    public final MicrosoftSDKManage.iO getMicrosoftCallBack() {
        return this.microsoftCallBack;
    }

    @aa1
    public final RecordingManager.OnRecordingCallback getRecordingCallBack() {
        return this.recordingCallBack;
    }

    @aa1
    public final Runnable getRunnable() {
        return this.runnable;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getSwitchRotateAnimation() {
        return this.switchRotateAnimation;
    }

    @aa1
    public final String getTargetLang() {
        return this.targetLang;
    }

    @aa1
    public final String getTtsTargetLang() {
        return this.ttsTargetLang;
    }

    @aa1
    public final String getTtsVoiceName() {
        return this.ttsVoiceName;
    }

    public final long getUpdateInterval() {
        return this.updateInterval;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        initLanguage();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getMTransformLanguageImg().setOnClickListener(new XIiXXXiOI(this));
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        VoiceManager r0 = VoiceManager.INSTANCE;
        r0.setActivityData(true);
        q62 r1 = q62.OXO1;
        if (r1.X11I() == false) goto L6;
        MicrosoftSDKManage.i100IXOX(MicrosoftSDKManage.O1O.OXO1(), this.microsoftCallBack, null, 2, null);
    L8:
        r0.setMListener(new X0OO(this));
        return;
    L6:
        if (r1.OIXOOi() == false) goto L8;
        RecordingManager.Companion.getInstance().setRecordingCallback(this.recordingCallBack);
        goto L8
    }

    public final boolean isAddListData() {
        return this.isAddListData;
    }

    public final boolean isAppSend() {
        return this.isAppSend;
    }

    public final boolean isEndTranslation() {
        return this.isEndTranslation;
    }

    public final boolean isStartAnalysis() {
        return this.isStartAnalysis;
    }

    public final boolean isSteam() {
        return this.isSteam;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_ai_dialogue_translation;
    }

    public void notifyViewData() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
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
        a01.OXO1.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        return;
    L15:
        this.switchRotateAnimation = true;
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
        a01.OXO1.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        return;
    L24:
        this.switchRotateAnimation = true;
        startRotateAnimation();
        return;
    L19:
        r14 = null;
        goto L20
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DcsTtsPlayer.INSTANCE.stop();
        closeBluetooth();
        VoiceManager r0 = VoiceManager.INSTANCE;
        r0.setMListener(null);
        ViewModelMain r2 = ViewModelMain.INSTANCE;
        Boolean r3 = r2.isShowSuspenWindow().getValue();
        Boolean r4 = Boolean.TRUE;
        if (Intrinsics.XOO0ii0(r3, r4) == false) goto L5;
        r2.isReSetList().postValue(r4);
        r0.setActivityData(true);
    L6:
        O110O1III r1 = this.popCountdownPopup;
        if (r1 == null) goto L9;
        r1.dismiss();
    L9:
        RecordingManager.Companion.getInstance().closeBluetooth();
        stopRecording$default(this, false, 1, null);
        if (q62.OXO1.X11I() == false) goto L13;
        MicrosoftSDKManage.XIi00iiXO r5 = MicrosoftSDKManage.O1O;
        r5.OXO1().iX01();
        r5.OXO1().XOIO11O();
        return;
    L13:
        return;
    L5:
        r0.setMicrosoftCallback();
        r0.setActivityData(false);
        goto L6
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void onTranslationLanguage(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        switch(r7.getId()) {
            case 2131362573: goto L7;
            case 2131362574: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        LanguageTranslationData r8 = getMRightLanguage();
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", r8);
        Intent r9 = new Intent(this, ChooseLanguageActivity.class);
        r9.putExtras(r5);
        startActivityForResult(r9, 1);
        return;
    L7:
        LanguageTranslationData r10 = getMLeftLanguage();
        Bundle r6 = new Bundle();
        r6.putString("mArg0", null);
        r6.putParcelable("mArg2", null);
        r6.putSerializable("mArg3", r10);
        Intent r11 = new Intent(this, ChooseLanguageActivity.class);
        r11.putExtras(r6);
        startActivityForResult(r11, 0);
    }

    public void permission() {
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.MICROPHONE});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        String r1 = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        String r3 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        ds1.XIi00iiXO(r0, r1, r3, new OOII0iI00());
    }

    public final void removeCountdownPopup() {
        this.mHandler.removeCallbacks(this.countdownRunnable);
        O110O1III r0 = this.popCountdownPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
    }

    public void saveDBRecord() {
        AIRecords r0 = this.mAIRecords;
        String r1 = "null";
        if (r0 == null) goto L6;
        String r2 = r0.getMContent();
        if (r2 == null) goto L6;
    L7:
        AIRecords r3 = this.mAIRecords;
        if (r3 == null) goto L13;
        String r4 = r3.getMExtraInfo();
        if (r4 == null) goto L13;
        r1 = r4;
    L13:
        sendTranslationResult(r2, r1);
        return;
    L6:
        r2 = "null";
        goto L7
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
        DcsTtsPlayer.INSTANCE.initSegmentation();
        ThreadsKt.iO(true, false, null, null, 0, new O11OO1(this, r10), 30, null);
        return;
    L10:
        AIRecords r11 = this.mAIRecords;
        Intrinsics.XXI(r11);
        r11.setMExtraInfo("AI " + getString(R.string.earphone_key_turn_off_translation));
        upDataLastList();
        notifyView();
    }

    public final void sendTranslationResult(@aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r13, "inputText");
        Intrinsics.X0O(r14, "outputText");
        senAudioTextToDevice(new BleVoice(0, 0, 0, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(r13).toString(), 14, null));
        senAudioTextToDevice(new BleVoice(1, 0, 0, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(r14).toString(), 14, null));
    }

    public final void setAddListData(boolean r1) {
        this.isAddListData = r1;
    }

    public final void setAppSend(boolean r1) {
        this.isAppSend = r1;
    }

    public final void setArsAccent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.arsAccent = r2;
    }

    public final void setArsLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.arsLanguage = r2;
    }

    public final void setElapsedTime(long r1) {
        this.elapsedTime = r1;
    }

    public final void setEndTranslation(boolean r1) {
        this.isEndTranslation = r1;
    }

    public final void setLang(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.lang = r2;
    }

    public final void setLangAndVoice() {
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        if (this.mAIRecordsType != 1) goto L6;
        this.lang = getMRightLanguage().getRtasrLanguage();
        this.isSupportTransfer = getMRightLanguage().isSupportTransfer();
        this.arsLanguage = getMRightLanguage().getAsrLanguage();
        this.arsAccent = getMRightLanguage().getAccent();
        this.targetLang = getMLeftLanguage().getRtasrLanguage();
        this.ttsVoiceName = getMLeftLanguage().getTtsViuceName();
        this.ttsTargetLang = getMLeftLanguage().getAsrLanguage();
        return;
    L6:
        this.lang = getMLeftLanguage().getRtasrLanguage();
        this.isSupportTransfer = getMLeftLanguage().isSupportTransfer();
        this.arsLanguage = getMLeftLanguage().getAsrLanguage();
        this.arsAccent = getMLeftLanguage().getAccent();
        this.targetLang = getMRightLanguage().getRtasrLanguage();
        this.ttsVoiceName = getMRightLanguage().getTtsViuceName();
        this.ttsTargetLang = getMRightLanguage().getAsrLanguage();
    }

    public final void setMAIFunctionType(int r1) {
        this.mAIFunctionType = r1;
    }

    public final void setMAIRecords(@tb1 AIRecords r1) {
        this.mAIRecords = r1;
    }

    public final void setMAIRecordsType(int r1) {
        this.mAIRecordsType = r1;
    }

    public final void setMCacheLanguage(@tb1 LanguageTranslationData r1) {
        this.mCacheLanguage = r1;
    }

    public final void setMContentResult(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContentResult = r2;
    }

    public final void setMLanguageTranslationList(@aa1 List<LanguageTranslationData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLanguageTranslationList = r2;
    }

    public final void setMLeftLanguage(@aa1 LanguageTranslationData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLeftLanguage = r2;
    }

    public final void setMRecyclerViewAutoRefresh(boolean r1) {
        this.mRecyclerViewAutoRefresh = r1;
    }

    public final void setMRightLanguage(@aa1 LanguageTranslationData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRightLanguage = r2;
    }

    public final void setStartAnalysis(boolean r1) {
        this.isStartAnalysis = r1;
    }

    public final void setStartTime(long r1) {
        this.startTime = r1;
    }

    public final void setSteam(boolean r1) {
        this.isSteam = r1;
    }

    public final void setSwitchRotateAnimation(boolean r1) {
        this.switchRotateAnimation = r1;
    }

    public final void setTargetLang(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.targetLang = r2;
    }

    public final void setTtsTargetLang(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ttsTargetLang = r2;
    }

    public final void setTtsVoiceName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ttsVoiceName = r2;
    }

    public final void showCountdownPopup(@aa1 View r6) {
        Intrinsics.X0O(r6, "rootView");
        this.delayTime = 3000;
        if (this.popCountdownPopup != null) goto L5;
        O110O1III r0 = new O110O1III(this);
        r0.XiOIii1(String.valueOf(this.delayTime / ((long) 1000)));
        r0.I0iXXO(false);
        this.popCountdownPopup = r0;
    L5:
        O110O1III r1 = this.popCountdownPopup;
        if (r1 == null) goto L8;
        r1.XiOIO(r6);
    L8:
        this.mHandler.postDelayed(this.countdownRunnable, this.updateInterval);
    }

    public void showRecordingPopup() {
    }

    public void startRecording() {
        this.mAIRecords = new AIRecords(0, 0, null, this.mAIFunctionType, this.mAIRecordsType, "", null, 0, 0, 0, null, null, null, null, null, 0, this.ttsVoiceName, 65479, null);
        q62 r1 = q62.OXO1;
        if (r1.X11I() == false) goto L9;
        if (this.isStartAnalysis == true) goto L12;
        this.isEndTranslation = false;
        this.isStartAnalysis = true;
        MicrosoftSDKManage.O1O.OXO1().iIX0i(this.arsLanguage, true, this.ttsVoiceName, this.ttsTargetLang, false);
        return;
    L12:
        return;
    L9:
        if (r1.OIXOOi() == false) goto L13;
        RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), this.recordingCallBack, false, false, this.TAG, 6, null);
        return;
    }

    public void startRotateAnimation() {
        if (this.switchRotateAnimation == false) goto L6;
        getMTransformLanguageImg().clearAnimation();
        CharSequence r0 = getMTransformLanguageLeftTv().getText();
        CharSequence r1 = getMTransformLanguageRightTv().getText();
        final RotateAnimation r2 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r2.setDuration(500);
        r2.setRepeatCount(-1);
        this.switchRotateAnimation = false;
        getMTransformLanguageImg().startAnimation(r2);
        getMTransformLanguageLeftTv().setText(r1);
        getMTransformLanguageRightTv().setText(r0);
        this.mCacheLanguage = getMLeftLanguage();
        setMLeftLanguage(getMRightLanguage());
        LanguageTranslationData r3 = this.mCacheLanguage;
        Intrinsics.XXI(r3);
        setMRightLanguage(r3);
        a01 r4 = a01.OXO1;
        r4.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
        r4.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        this.mHandler.postDelayed(new XXX11X1II(r2, this), 500);
        return;
    }

    public final void stopRecording(boolean r2) {
        if (q62.OXO1.X11I() == false) goto L8;
        if (r2 == false) goto L6;
        this.isEndTranslation = true;
        RecordingManager.Companion.getInstance().setRecording(false);
        MicrosoftSDKManage.O1O.OXO1().Xi();
    L6:
        this.mHandler.removeMessages(this.loadTimeOut);
        this.mHandler.removeMessages(this.loadTimeOutToast);
        MicrosoftSDKManage.O1O.OXO1().XOIO11O();
        return;
    L8:
        RecordingManager.Companion.getInstance().stopRecording();
    }

    public void upDataLastList() {
    }

    public void updateTimerText() {
    }
}
