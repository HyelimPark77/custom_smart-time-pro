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
import com.android.mltcode.paycertificationapi.O110O1III;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.fq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.model.LeftAndRightPlayControl;
import com.sma.smartv3.model.ViewModelMain;
import com.sma.smartv3.otherdevice.charge.BaseTranslationActivity;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.AIRecordsDao;
import com.sma.smartv3.p608db.entity.AIRecords;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBaseTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n90#2:776\n90#2:777\n85#2,3:816\n85#2,3:819\n85#2,3:822\n85#2,3:825\n173#3,7:778\n180#3,3:786\n143#3,7:789\n183#3:796\n173#3,7:797\n180#3,3:805\n143#3,7:808\n183#3:815\n1#4:785\n1#4:804\n1#4:828\n*S KotlinDebug\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity\n*L\n184#1:776\n186#1:777\n359#1:816,3\n373#1:819,3\n407#1:822,3\n408#1:825,3\n340#1:778,7\n340#1:786,3\n340#1:789,7\n340#1:796\n345#1:797,7\n345#1:805,3\n345#1:808,7\n345#1:815\n340#1:785\n345#1:804\n*E\n"})
public class BaseTranslationActivity extends BaseActivity {
    private long elapsedTime;
    private boolean isAddListData;
    private boolean isAppSend;
    private boolean isEndTranslation;
    private boolean isStartAnalysis;
    private boolean isSteam;
    private boolean isSupportTransfer;

    @tb1
    private AIRecords mAIRecords;

    @tb1
    private LanguageTranslationData mCacheLanguage;
    public List<LanguageTranslationData> mLanguageTranslationList;
    public LanguageTranslationData mLeftLanguage;
    public LanguageTranslationData mRightLanguage;

    @tb1
    private O110O1III popCountdownPopup;
    private long startTime;

    @aa1
    private final String TAG = "BaseTranslationActivity";

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX0i1ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseTranslationActivity.abhTitleCenter_delegate$lambda$0(this.f3416IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIX1XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseTranslationActivity.abhTitleRight_delegate$lambda$0(this.f7905IO);
        }
    });

    @aa1
    private final AIRecordsDao mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();

    @aa1
    private final Lazy mTransformLanguageLeftTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1II011X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseTranslationActivity.mTransformLanguageLeftTv_delegate$lambda$0(this.f4258IO);
        }
    });

    @aa1
    private final Lazy mTransformLanguageImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiX011
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseTranslationActivity.mTransformLanguageImg_delegate$lambda$0(this.f5323IO);
        }
    });

    @aa1
    private final Lazy mTransformLanguageRightTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI0XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseTranslationActivity.mTransformLanguageRightTv_delegate$lambda$0(this.f4448IO);
        }
    });
    private final int loadTimeOut = 255;
    private final int loadTimeOutToast = 254;
    private long delayTime = 3000;
    private final long updateInterval = 1000;

    @aa1
    private final Runnable runnable = new XO0O10();

    @aa1
    private final OXO1 countdownRunnable = new OXO1();

    @aa1
    private final Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.XOOO00I
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return BaseTranslationActivity.mHandler$lambda$0(this.f4814IO, message);
        }
    });
    private int mAIRecordsType = 1;
    private boolean mRecyclerViewAutoRefresh = true;
    private boolean switchRotateAnimation = true;

    @aa1
    private final RecordingManager.OnRecordingCallback recordingCallBack = new C18625iO();
    private int mAIFunctionType = AIFunctionType.AI_TRANSLATION.getType();

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
    private String mContentResult = "";

    @aa1
    private final MicrosoftSDKManage.InterfaceC19048iO microsoftCallBack = new XIi00iiXO();

    public static final class OXO1 implements Runnable {
        public OXO1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTranslationActivity.this.delayTime -= BaseTranslationActivity.this.getUpdateInterval();
            if (BaseTranslationActivity.this.delayTime > 0) {
                O110O1III o110o1iii = BaseTranslationActivity.this.popCountdownPopup;
                if (o110o1iii != null) {
                    o110o1iii.XiOIii1(String.valueOf(BaseTranslationActivity.this.delayTime / ((long) 1000)));
                }
                BaseTranslationActivity.this.getMHandler().postDelayed(this, BaseTranslationActivity.this.getUpdateInterval());
                return;
            }
            O110O1III o110o1iii2 = BaseTranslationActivity.this.popCountdownPopup;
            if (o110o1iii2 != null) {
                o110o1iii2.dismiss();
            }
            BaseTranslationActivity.this.delayTime = 3000L;
            O110O1III o110o1iii3 = BaseTranslationActivity.this.popCountdownPopup;
            if (o110o1iii3 != null) {
                o110o1iii3.XiOIii1(String.valueOf(BaseTranslationActivity.this.delayTime / ((long) 1000)));
            }
            BaseTranslationActivity.this.countdownEnd();
        }
    }

    public static final class XIi00iiXO implements MicrosoftSDKManage.InterfaceC19048iO {
        public XIi00iiXO() {
        }

        public static final void IiI10X(BaseTranslationActivity baseTranslationActivity) {
            baseTranslationActivity.setMContentResult("");
            baseTranslationActivity.showRecordingPopup();
        }

        public static final void O00(BaseTranslationActivity baseTranslationActivity, int i, String str) {
            if (!baseTranslationActivity.isAddListData()) {
                baseTranslationActivity.setAddListData(true);
                baseTranslationActivity.addList();
            }
            if (i == 1) {
                baseTranslationActivity.getMHandler().removeMessages(baseTranslationActivity.loadTimeOut);
                baseTranslationActivity.getMHandler().removeMessages(baseTranslationActivity.loadTimeOutToast);
                AIRecords mAIRecords = baseTranslationActivity.getMAIRecords();
                if (mAIRecords != null) {
                    mAIRecords.setMContent(str);
                }
                baseTranslationActivity.upDataLastList();
                baseTranslationActivity.notifyView();
            }
        }

        public static final void XOO0ii0(BaseTranslationActivity baseTranslationActivity) {
            RecordingManager.Companion.getInstance().closeBluetooth();
            baseTranslationActivity.disRecordingPopup();
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(baseTranslationActivity.TAG + "   onStopTransmission  isEndTranslation = " + baseTranslationActivity.isEndTranslation() + " ");
            if (baseTranslationActivity.isEndTranslation()) {
                baseTranslationActivity.setEndTranslation(false);
                baseTranslationActivity.setAddListData(false);
                VoiceManager.INSTANCE.setSpeechRecRunning(false);
                if (baseTranslationActivity.getMContentResult().length() > 0) {
                    i1o0oxo1o.OXO1(baseTranslationActivity.TAG + "  sendTranslate onStopTransmission  content = " + baseTranslationActivity.getMContentResult() + " ");
                    baseTranslationActivity.sendTranslationResultInput(baseTranslationActivity.getMContentResult());
                    return;
                }
                i1o0oxo1o.OXO1(baseTranslationActivity.TAG + "  sendTranslate onStopTransmission  content = " + (baseTranslationActivity.getMContentResult().length() > 0));
                DcsTtsPlayer.INSTANCE.stop();
                String string = baseTranslationActivity.getString(R.string.request_error);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                baseTranslationActivity.sendTranslationResultInput(string);
            }
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onIdentifyResults(final int i, final String str) {
            Intrinsics.X0O(str, "str");
            if (i == 2) {
                i1O0OXO1O.OXO1.OXO1(BaseTranslationActivity.this.TAG + "  sendTranslate  onIdentifyResults content = " + str);
                BaseTranslationActivity.this.setMContentResult(str);
                BaseTranslationActivity.this.getMHandler().sendEmptyMessageDelayed(BaseTranslationActivity.this.loadTimeOut, 2000L);
            }
            final BaseTranslationActivity baseTranslationActivity = BaseTranslationActivity.this;
            baseTranslationActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I11i110I1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTranslationActivity.XIi00iiXO.O00(baseTranslationActivity, i, str);
                }
            });
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public /* bridge */ void onIdentifyResultsDetectedLanguage(int i, String str, String str2) {
            super.onIdentifyResultsDetectedLanguage(i, str, str2);
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStartTransmission() {
            i1O0OXO1O.OXO1.OXO1(BaseTranslationActivity.this.TAG + " onStartTransmission ");
            final BaseTranslationActivity baseTranslationActivity = BaseTranslationActivity.this;
            baseTranslationActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OiiXOI1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTranslationActivity.XIi00iiXO.IiI10X(baseTranslationActivity);
                }
            });
        }

        @Override // com.sma.smartv3.util.MicrosoftSDKManage.InterfaceC19048iO
        public void onStopTransmission() {
            final BaseTranslationActivity baseTranslationActivity = BaseTranslationActivity.this;
            baseTranslationActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IOI01IIIO
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTranslationActivity.XIi00iiXO.XOO0ii0(baseTranslationActivity);
                }
            });
        }
    }

    public static final class XO0O10 implements Runnable {
        public XO0O10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTranslationActivity baseTranslationActivity = BaseTranslationActivity.this;
            baseTranslationActivity.setElapsedTime(baseTranslationActivity.getElapsedTime() + BaseTranslationActivity.this.getUpdateInterval());
            BaseTranslationActivity.this.updateTimerText();
            BaseTranslationActivity.this.getMHandler().postDelayed(this, BaseTranslationActivity.this.getUpdateInterval());
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.BaseTranslationActivity$iO */
    @SourceDebugExtension({"SMAP\nBaseTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$recordingCallBack$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n1#2:776\n*E\n"})
    public static final class C18625iO implements RecordingManager.OnRecordingCallback {
        public C18625iO() {
        }

        public static final void XO0O10(BaseTranslationActivity baseTranslationActivity) {
            baseTranslationActivity.disRecordingPopup();
        }

        /* JADX INFO: renamed from: iO */
        public static final void m38254iO(BaseTranslationActivity baseTranslationActivity) {
            baseTranslationActivity.showRecordingPopup();
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onBeforeRecording() {
            final BaseTranslationActivity baseTranslationActivity = BaseTranslationActivity.this;
            baseTranslationActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O0OXX0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTranslationActivity.C18625iO.m38254iO(baseTranslationActivity);
                }
            });
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResult(AITranslation aITranslation) {
            String mContent;
            if (aITranslation == null || aITranslation.getStatus() != 2) {
                return;
            }
            DcsTtsPlayer.INSTANCE.stop();
            AIRecords mAIRecords = BaseTranslationActivity.this.getMAIRecords();
            if (mAIRecords != null) {
                String string = StringsKt__StringsKt.iX1X1(aITranslation.getText()).toString();
                BaseTranslationActivity baseTranslationActivity = BaseTranslationActivity.this;
                if (string.length() == 0) {
                    AIRecords mAIRecords2 = baseTranslationActivity.getMAIRecords();
                    Intrinsics.XXI(mAIRecords2);
                    string = mAIRecords2.getMContent();
                }
                mAIRecords.setMContent(string);
            }
            AIRecords mAIRecords3 = BaseTranslationActivity.this.getMAIRecords();
            if (mAIRecords3 != null) {
                String string2 = StringsKt__StringsKt.iX1X1(aITranslation.getDst()).toString();
                BaseTranslationActivity baseTranslationActivity2 = BaseTranslationActivity.this;
                if (string2.length() == 0) {
                    AIRecords mAIRecords4 = baseTranslationActivity2.getMAIRecords();
                    Intrinsics.XXI(mAIRecords4);
                    string2 = mAIRecords4.getMExtraInfo();
                }
                mAIRecords3.setMExtraInfo(string2);
            }
            BaseTranslationActivity.this.addList();
            BaseTranslationActivity.this.notifyView();
            AIRecords mAIRecords5 = BaseTranslationActivity.this.getMAIRecords();
            if (mAIRecords5 != null && (mContent = mAIRecords5.getMContent()) != null && mContent.length() > 0) {
                BaseTranslationActivity baseTranslationActivity3 = BaseTranslationActivity.this;
                AIRecords mAIRecords6 = baseTranslationActivity3.getMAIRecords();
                String mContent2 = mAIRecords6 != null ? mAIRecords6.getMContent() : null;
                Intrinsics.XXI(mContent2);
                baseTranslationActivity3.sendTranslate(mContent2);
                return;
            }
            AIRecords mAIRecords7 = BaseTranslationActivity.this.getMAIRecords();
            if (mAIRecords7 != null) {
                String string3 = BaseTranslationActivity.this.getString(R.string.recording_translate_error_tip);
                Intrinsics.O10IXXX0X(string3, "getString(...)");
                mAIRecords7.setMContent(string3);
            }
            AIRecords mAIRecords8 = BaseTranslationActivity.this.getMAIRecords();
            if (mAIRecords8 != null) {
                mAIRecords8.setMExtraInfo("");
            }
            BaseTranslationActivity.this.upDataLastList();
            BaseTranslationActivity.this.notifyView();
            BaseTranslationActivity.this.saveDBRecord();
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onRecordResultError(String error) {
            Intrinsics.X0O(error, "error");
            BaseTranslationActivity baseTranslationActivity = BaseTranslationActivity.this;
            String string = baseTranslationActivity.getString(R.string.speech_recognition_error);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            String string2 = BaseTranslationActivity.this.getString(R.string.failed_in_translation);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            baseTranslationActivity.sendTranslationResult(string, string2);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public /* bridge */ void onRecordResultLanguage(AISpeech aISpeech) {
            super.onRecordResultLanguage(aISpeech);
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStartRecording() {
        }

        @Override // com.sma.smartv3.biz.voice.RecordingManager.OnRecordingCallback
        public void onStopRecording() {
            final BaseTranslationActivity baseTranslationActivity = BaseTranslationActivity.this;
            baseTranslationActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XX0X0IX
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTranslationActivity.C18625iO.XO0O10(baseTranslationActivity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(BaseTranslationActivity baseTranslationActivity) {
        return (TextView) baseTranslationActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(BaseTranslationActivity baseTranslationActivity) {
        return (ImageView) baseTranslationActivity.findViewById(R.id.abh_title_right);
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
    public static final boolean initView$lambda$1(final BaseTranslationActivity baseTranslationActivity, int i, int i2, int i3) {
        i1O0OXO1O.OXO1.OXO1(baseTranslationActivity.TAG + " mode:" + i + ",type:" + i2 + ",earDirection:" + i3);
        int i4 = 2;
        if (i2 == 0) {
            baseTranslationActivity.isEndTranslation = false;
            if (i3 == 1 && !baseTranslationActivity.isAppSend) {
                i4 = 1;
            }
            baseTranslationActivity.mAIRecordsType = i4;
            baseTranslationActivity.isStartAnalysis = true;
            baseTranslationActivity.setLangAndVoice();
            DcsTtsPlayer.INSTANCE.stop();
            fq1.OXO1.OIi0();
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            voiceManager.setLanguageType(baseTranslationActivity.arsLanguage, baseTranslationActivity.ttsVoiceName);
            q62 q62Var = q62.OXO1;
            if (q62Var.X11I()) {
                baseTranslationActivity.startRecording();
            }
            if (q62Var.OIXOOi() && voiceManager.isRecordBluetooth()) {
                baseTranslationActivity.startRecording();
            } else {
                baseTranslationActivity.mAIRecords = new AIRecords(0, 0L, null, baseTranslationActivity.mAIFunctionType, baseTranslationActivity.mAIRecordsType, "", null, 0, 0, 0, null, null, null, null, null, 0, baseTranslationActivity.ttsVoiceName, 65479, null);
                baseTranslationActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i1XO0OXX
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7673IO.showRecordingPopup();
                    }
                });
            }
        } else if (i2 == 1) {
            RecordingManager.Companion companion = RecordingManager.Companion;
            if (!companion.getInstance().isRecording()) {
                companion.getInstance().setRecording(true);
            }
        } else if (i2 == 2) {
            baseTranslationActivity.isEndTranslation = true;
            stopRecording$default(baseTranslationActivity, false, 1, null);
            baseTranslationActivity.mHandler.removeMessages(baseTranslationActivity.loadTimeOut);
            baseTranslationActivity.mHandler.removeMessages(baseTranslationActivity.loadTimeOutToast);
            baseTranslationActivity.isStartAnalysis = false;
            q62 q62Var2 = q62.OXO1;
            if (q62Var2.X11I()) {
                MicrosoftSDKManage.O1O.OXO1().m38829Xi();
            }
            if (q62Var2.OIXOOi() && !q62Var2.X11I()) {
                baseTranslationActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I1O011
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1404IO.disRecordingPopup();
                    }
                });
            }
        } else if (i2 == 3) {
            baseTranslationActivity.deviceSuspend();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mHandler$lambda$0(BaseTranslationActivity baseTranslationActivity, Message it) {
        Intrinsics.X0O(it, "it");
        int i = it.what;
        if (i == baseTranslationActivity.loadTimeOut) {
            baseTranslationActivity.stopRecording(true);
        } else if (i == baseTranslationActivity.loadTimeOutToast) {
            ToastUtils.showLong(baseTranslationActivity.getString(R.string.no_sound_recognized), new Object[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mTransformLanguageImg_delegate$lambda$0(BaseTranslationActivity baseTranslationActivity) {
        return (ImageView) baseTranslationActivity.findViewById(R.id.transform_language_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTransformLanguageLeftTv_delegate$lambda$0(BaseTranslationActivity baseTranslationActivity) {
        return (TextView) baseTranslationActivity.findViewById(R.id.dialogue_translation_left_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTransformLanguageRightTv_delegate$lambda$0(BaseTranslationActivity baseTranslationActivity) {
        return (TextView) baseTranslationActivity.findViewById(R.id.dialogue_translation_right_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyView() {
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OO01I1i
            @Override // java.lang.Runnable
            public final void run() {
                this.f3122IO.notifyViewData();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit permission$lambda$0(PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        PermissionStatus permissionStatus = PermissionStatus.GRANTED;
        return Unit.OXO1;
    }

    private final void senAudioTextToDevice(BleVoice bleVoice) {
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, bleVoice, false, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendTranslate$lambda$0(final BaseTranslationActivity baseTranslationActivity, String str) {
        if (Intrinsics.XOO0ii0(baseTranslationActivity.lang, "cn") || Intrinsics.XOO0ii0(baseTranslationActivity.targetLang, "cn")) {
            translateITS$default(baseTranslationActivity, str, null, null, 6, null);
        } else {
            AISparkChainManager.OXO1.IX1XiI(str, baseTranslationActivity.lang, "cn", new O1XIiIO<String>() { // from class: com.sma.smartv3.otherdevice.charge.BaseTranslationActivity$sendTranslate$1$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str2) {
                    if (str2 != null && str2.length() > 0) {
                        BaseTranslationActivity baseTranslationActivity2 = this.OXO1;
                        baseTranslationActivity2.translateITS(str2, "cn", baseTranslationActivity2.getTargetLang());
                        return;
                    }
                    AIRecords mAIRecords = this.OXO1.getMAIRecords();
                    Intrinsics.XXI(mAIRecords);
                    String string = this.OXO1.getString(R.string.failed_in_translation);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    mAIRecords.setMExtraInfo(string);
                    this.OXO1.upDataLastList();
                    this.OXO1.notifyView();
                    this.OXO1.saveDBRecord();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1.TAG + " handleError error = " + error);
                    AIRecords mAIRecords = this.OXO1.getMAIRecords();
                    Intrinsics.XXI(mAIRecords);
                    String string = this.OXO1.getString(R.string.failed_in_translation);
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    mAIRecords.setMExtraInfo(string);
                    this.OXO1.upDataLastList();
                    this.OXO1.notifyView();
                    this.OXO1.saveDBRecord();
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendTranslationResultInput(final String str) {
        this.mHandler.removeMessages(this.loadTimeOut);
        this.mHandler.removeMessages(this.loadTimeOutToast);
        this.isStartAnalysis = false;
        this.mRecyclerViewAutoRefresh = true;
        if (str.length() <= 0 || Intrinsics.XOO0ii0(str, getString(R.string.request_error))) {
            AIRecords aIRecords = this.mAIRecords;
            if (aIRecords != null) {
                String string = getString(R.string.recording_translate_error_tip);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                aIRecords.setMContent(string);
            }
            AIRecords aIRecords2 = this.mAIRecords;
            if (aIRecords2 != null) {
                aIRecords2.setMExtraInfo("");
            }
            upDataLastList();
            notifyView();
            saveDBRecord();
            return;
        }
        i1O0OXO1O.OXO1.OXO1("startAudioStreamInput ===> str = " + str + " , targetLang = " + this.targetLang);
        MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
        xIi00iiXO.OXO1().IXI();
        xIi00iiXO.OXO1().m38826OI(str, this.targetLang, new Function1() { // from class: com.android.mltcode.paycertificationapi.OI1i01i01
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseTranslationActivity.sendTranslationResultInput$lambda$0(this.f2935IO, str, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendTranslationResultInput$lambda$0(BaseTranslationActivity baseTranslationActivity, String str, String it) {
        Intrinsics.X0O(it, "it");
        AIRecords aIRecords = baseTranslationActivity.mAIRecords;
        if (aIRecords != null) {
            String string = StringsKt__StringsKt.iX1X1(str).toString();
            if (string.length() == 0) {
                AIRecords aIRecords2 = baseTranslationActivity.mAIRecords;
                Intrinsics.XXI(aIRecords2);
                string = aIRecords2.getMContent();
            }
            aIRecords.setMContent(string);
        }
        AIRecords aIRecords3 = baseTranslationActivity.mAIRecords;
        if (aIRecords3 != null) {
            String string2 = StringsKt__StringsKt.iX1X1(it).toString();
            if (string2.length() == 0) {
                AIRecords aIRecords4 = baseTranslationActivity.mAIRecords;
                Intrinsics.XXI(aIRecords4);
                string2 = aIRecords4.getMExtraInfo();
            }
            aIRecords3.setMExtraInfo(string2);
        }
        MicrosoftSDKManage microsoftSDKManageOXO1 = MicrosoftSDKManage.O1O.OXO1();
        AIRecords aIRecords5 = baseTranslationActivity.mAIRecords;
        Intrinsics.XXI(aIRecords5);
        String mExtraInfo = aIRecords5.getMExtraInfo();
        AIRecords aIRecords6 = baseTranslationActivity.mAIRecords;
        Intrinsics.XXI(aIRecords6);
        String ttsVoiceName = aIRecords6.getTtsVoiceName();
        LeftAndRightPlayControl leftAndRightPlayControl = LeftAndRightPlayControl.LEFT_AND_RIGHT;
        AIRecords aIRecords7 = baseTranslationActivity.mAIRecords;
        Intrinsics.XXI(aIRecords7);
        microsoftSDKManageOXO1.iX1O1(mExtraInfo, ttsVoiceName, leftAndRightPlayControl, aIRecords7.getMType() == 1 ? 8 : 2);
        baseTranslationActivity.mContentResult = "";
        baseTranslationActivity.upDataLastList();
        baseTranslationActivity.notifyView();
        baseTranslationActivity.saveDBRecord();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRotateAnimation$lambda$0(RotateAnimation rotateAnimation, BaseTranslationActivity baseTranslationActivity) {
        rotateAnimation.cancel();
        baseTranslationActivity.getMTransformLanguageImg().clearAnimation();
        baseTranslationActivity.switchRotateAnimation = true;
    }

    public static /* synthetic */ void stopRecording$default(BaseTranslationActivity baseTranslationActivity, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecording");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseTranslationActivity.stopRecording(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void translateITS(String str, String str2, String str3) {
        AISparkChainManager.OXO1.IX1XiI(str, str2, str3, new O1XIiIO<String>() { // from class: com.sma.smartv3.otherdevice.charge.BaseTranslationActivity.translateITS.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str4) {
                if (str4 == null || str4.length() <= 0) {
                    AIRecords mAIRecords = BaseTranslationActivity.this.getMAIRecords();
                    Intrinsics.XXI(mAIRecords);
                    mAIRecords.setMExtraInfo("translate error");
                    BaseTranslationActivity.this.upDataLastList();
                    BaseTranslationActivity.this.notifyView();
                    BaseTranslationActivity.this.saveDBRecord();
                    return;
                }
                AIRecords mAIRecords2 = BaseTranslationActivity.this.getMAIRecords();
                Intrinsics.XXI(mAIRecords2);
                mAIRecords2.setMExtraInfo(StringsKt__StringsKt.iX1X1(str4).toString());
                BaseTranslationActivity.this.upDataLastList();
                BaseTranslationActivity.this.notifyView();
                BaseTranslationActivity.this.saveDBRecord();
                DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, str4, true, false, null, BaseTranslationActivity.this.getTtsVoiceName(), "translateITS1", 12, null);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                AIRecords mAIRecords = BaseTranslationActivity.this.getMAIRecords();
                Intrinsics.XXI(mAIRecords);
                String string = BaseTranslationActivity.this.getString(R.string.failed_in_translation);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                mAIRecords.setMExtraInfo(string);
                BaseTranslationActivity.this.upDataLastList();
                BaseTranslationActivity.this.notifyView();
                BaseTranslationActivity.this.saveDBRecord();
            }
        });
    }

    public static /* synthetic */ void translateITS$default(BaseTranslationActivity baseTranslationActivity, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translateITS");
        }
        if ((i & 2) != 0) {
            str2 = baseTranslationActivity.lang;
        }
        if ((i & 4) != 0) {
            str3 = baseTranslationActivity.targetLang;
        }
        baseTranslationActivity.translateITS(str, str2, str3);
    }

    public void addList() {
    }

    public final long addSendRecord(@aa1 AIRecords mAIRecords) {
        Intrinsics.X0O(mAIRecords, "mAIRecords");
        return this.mRecordsDao.insert(mAIRecords);
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
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
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
    public final AIRecordsDao getMRecordsDao() {
        return this.mRecordsDao;
    }

    public final boolean getMRecyclerViewAutoRefresh() {
        return this.mRecyclerViewAutoRefresh;
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

    public final ImageView getMTransformLanguageImg() {
        return (ImageView) this.mTransformLanguageImg$delegate.getValue();
    }

    public final TextView getMTransformLanguageLeftTv() {
        return (TextView) this.mTransformLanguageLeftTv$delegate.getValue();
    }

    public final TextView getMTransformLanguageRightTv() {
        return (TextView) this.mTransformLanguageRightTv$delegate.getValue();
    }

    @aa1
    public final MicrosoftSDKManage.InterfaceC19048iO getMicrosoftCallBack() {
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

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        initLanguage();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getMTransformLanguageImg().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XIiXXXiOI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4631IO.startRotateAnimation();
            }
        });
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        VoiceManager voiceManager = VoiceManager.INSTANCE;
        voiceManager.setActivityData(true);
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I()) {
            MicrosoftSDKManage.i100IXOX(MicrosoftSDKManage.O1O.OXO1(), this.microsoftCallBack, null, 2, null);
        } else if (q62Var.OIXOOi()) {
            RecordingManager.Companion.getInstance().setRecordingCallback(this.recordingCallBack);
        }
        voiceManager.setMListener(new Function3() { // from class: com.android.mltcode.paycertificationapi.X0OO
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(BaseTranslationActivity.initView$lambda$1(this.f3992IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
            }
        });
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

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ai_dialogue_translation;
    }

    public void notifyViewData() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 0) {
                Serializable serializableExtra = intent != null ? intent.getSerializableExtra("language") : null;
                Intrinsics.X1ii(serializableExtra, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
                LanguageTranslationData languageTranslationData = (LanguageTranslationData) serializableExtra;
                if (Intrinsics.XOO0ii0(languageTranslationData.getName(), getMRightLanguage().getName())) {
                    this.switchRotateAnimation = true;
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
                this.switchRotateAnimation = true;
                startRotateAnimation();
                return;
            }
            setMRightLanguage(languageTranslationData2);
            getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
            a01.OXO1.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
            I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DcsTtsPlayer.INSTANCE.stop();
        closeBluetooth();
        VoiceManager voiceManager = VoiceManager.INSTANCE;
        voiceManager.setMListener(null);
        ViewModelMain viewModelMain = ViewModelMain.INSTANCE;
        Boolean value = viewModelMain.isShowSuspenWindow().getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.XOO0ii0(value, bool)) {
            viewModelMain.isReSetList().postValue(bool);
            voiceManager.setActivityData(true);
        } else {
            voiceManager.setMicrosoftCallback();
            voiceManager.setActivityData(false);
        }
        O110O1III o110o1iii = this.popCountdownPopup;
        if (o110o1iii != null) {
            o110o1iii.dismiss();
        }
        RecordingManager.Companion.getInstance().closeBluetooth();
        stopRecording$default(this, false, 1, null);
        if (q62.OXO1.X11I()) {
            MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
            xIi00iiXO.OXO1().iX01();
            xIi00iiXO.OXO1().XOIO11O();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void onTranslationLanguage(@aa1 View view) {
        Intrinsics.X0O(view, "view");
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

    public void permission() {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.MICROPHONE);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        String string = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String string2 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOII0iI00
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseTranslationActivity.permission$lambda$0((PermissionStatus) obj);
            }
        });
    }

    public final void removeCountdownPopup() {
        this.mHandler.removeCallbacks(this.countdownRunnable);
        O110O1III o110o1iii = this.popCountdownPopup;
        if (o110o1iii != null) {
            o110o1iii.dismiss();
        }
    }

    public void saveDBRecord() {
        String mContent;
        String mExtraInfo;
        AIRecords aIRecords = this.mAIRecords;
        String str = "null";
        if (aIRecords == null || (mContent = aIRecords.getMContent()) == null) {
            mContent = "null";
        }
        AIRecords aIRecords2 = this.mAIRecords;
        if (aIRecords2 != null && (mExtraInfo = aIRecords2.getMExtraInfo()) != null) {
            str = mExtraInfo;
        }
        sendTranslationResult(mContent, str);
    }

    public final void sendTranslate(@aa1 final String content) {
        Intrinsics.X0O(content, "content");
        i1O0OXO1O.OXO1.OXO1(this.TAG + "  sendTranslate  content = " + content + " lang = " + this.lang + ", targetLang = " + this.targetLang);
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I()) {
            sendTranslationResultInput(content);
            return;
        }
        if (q62Var.OIXOOi()) {
            DcsTtsPlayer.INSTANCE.initSegmentation();
            ThreadsKt.m39451iO(true, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.O11OO1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return BaseTranslationActivity.sendTranslate$lambda$0(this.f2677IO, content);
                }
            }, 30, null);
            return;
        }
        AIRecords aIRecords = this.mAIRecords;
        Intrinsics.XXI(aIRecords);
        aIRecords.setMExtraInfo("AI " + getString(R.string.earphone_key_turn_off_translation));
        upDataLastList();
        notifyView();
    }

    public final void sendTranslationResult(@aa1 String inputText, @aa1 String outputText) {
        Intrinsics.X0O(inputText, "inputText");
        Intrinsics.X0O(outputText, "outputText");
        senAudioTextToDevice(new BleVoice(0, 0, 0, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(inputText).toString(), 14, null));
        senAudioTextToDevice(new BleVoice(1, 0, 0, null, System.currentTimeMillis(), StringsKt__StringsKt.iX1X1(outputText).toString(), 14, null));
    }

    public final void setAddListData(boolean z) {
        this.isAddListData = z;
    }

    public final void setAppSend(boolean z) {
        this.isAppSend = z;
    }

    public final void setArsAccent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.arsAccent = str;
    }

    public final void setArsLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.arsLanguage = str;
    }

    public final void setElapsedTime(long j) {
        this.elapsedTime = j;
    }

    public final void setEndTranslation(boolean z) {
        this.isEndTranslation = z;
    }

    public final void setLang(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.lang = str;
    }

    public final void setLangAndVoice() {
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        if (this.mAIRecordsType == 1) {
            this.lang = getMRightLanguage().getRtasrLanguage();
            this.isSupportTransfer = getMRightLanguage().isSupportTransfer();
            this.arsLanguage = getMRightLanguage().getAsrLanguage();
            this.arsAccent = getMRightLanguage().getAccent();
            this.targetLang = getMLeftLanguage().getRtasrLanguage();
            this.ttsVoiceName = getMLeftLanguage().getTtsViuceName();
            this.ttsTargetLang = getMLeftLanguage().getAsrLanguage();
            return;
        }
        this.lang = getMLeftLanguage().getRtasrLanguage();
        this.isSupportTransfer = getMLeftLanguage().isSupportTransfer();
        this.arsLanguage = getMLeftLanguage().getAsrLanguage();
        this.arsAccent = getMLeftLanguage().getAccent();
        this.targetLang = getMRightLanguage().getRtasrLanguage();
        this.ttsVoiceName = getMRightLanguage().getTtsViuceName();
        this.ttsTargetLang = getMRightLanguage().getAsrLanguage();
    }

    public final void setMAIFunctionType(int i) {
        this.mAIFunctionType = i;
    }

    public final void setMAIRecords(@tb1 AIRecords aIRecords) {
        this.mAIRecords = aIRecords;
    }

    public final void setMAIRecordsType(int i) {
        this.mAIRecordsType = i;
    }

    public final void setMCacheLanguage(@tb1 LanguageTranslationData languageTranslationData) {
        this.mCacheLanguage = languageTranslationData;
    }

    public final void setMContentResult(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContentResult = str;
    }

    public final void setMLanguageTranslationList(@aa1 List<LanguageTranslationData> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mLanguageTranslationList = list;
    }

    public final void setMLeftLanguage(@aa1 LanguageTranslationData languageTranslationData) {
        Intrinsics.X0O(languageTranslationData, "<set-?>");
        this.mLeftLanguage = languageTranslationData;
    }

    public final void setMRecyclerViewAutoRefresh(boolean z) {
        this.mRecyclerViewAutoRefresh = z;
    }

    public final void setMRightLanguage(@aa1 LanguageTranslationData languageTranslationData) {
        Intrinsics.X0O(languageTranslationData, "<set-?>");
        this.mRightLanguage = languageTranslationData;
    }

    public final void setStartAnalysis(boolean z) {
        this.isStartAnalysis = z;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setSteam(boolean z) {
        this.isSteam = z;
    }

    public final void setSwitchRotateAnimation(boolean z) {
        this.switchRotateAnimation = z;
    }

    public final void setTargetLang(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.targetLang = str;
    }

    public final void setTtsTargetLang(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.ttsTargetLang = str;
    }

    public final void setTtsVoiceName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.ttsVoiceName = str;
    }

    public final void showCountdownPopup(@aa1 View rootView) {
        Intrinsics.X0O(rootView, "rootView");
        this.delayTime = 3000L;
        if (this.popCountdownPopup == null) {
            O110O1III o110o1iii = new O110O1III(this);
            o110o1iii.XiOIii1(String.valueOf(this.delayTime / ((long) 1000)));
            o110o1iii.I0iXXO(false);
            this.popCountdownPopup = o110o1iii;
        }
        O110O1III o110o1iii2 = this.popCountdownPopup;
        if (o110o1iii2 != null) {
            o110o1iii2.XiOIO(rootView);
        }
        this.mHandler.postDelayed(this.countdownRunnable, this.updateInterval);
    }

    public void showRecordingPopup() {
    }

    public void startRecording() {
        this.mAIRecords = new AIRecords(0, 0L, null, this.mAIFunctionType, this.mAIRecordsType, "", null, 0, 0, 0, null, null, null, null, null, 0, this.ttsVoiceName, 65479, null);
        q62 q62Var = q62.OXO1;
        if (!q62Var.X11I()) {
            if (q62Var.OIXOOi()) {
                RecordingManager.recordPermission$default(RecordingManager.Companion.getInstance(), this.recordingCallBack, false, false, this.TAG, 6, null);
            }
        } else {
            if (this.isStartAnalysis) {
                return;
            }
            this.isEndTranslation = false;
            this.isStartAnalysis = true;
            MicrosoftSDKManage.O1O.OXO1().iIX0i(this.arsLanguage, true, this.ttsVoiceName, this.ttsTargetLang, false);
        }
    }

    public void startRotateAnimation() {
        if (this.switchRotateAnimation) {
            getMTransformLanguageImg().clearAnimation();
            CharSequence text = getMTransformLanguageLeftTv().getText();
            CharSequence text2 = getMTransformLanguageRightTv().getText();
            final RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(500L);
            rotateAnimation.setRepeatCount(-1);
            this.switchRotateAnimation = false;
            getMTransformLanguageImg().startAnimation(rotateAnimation);
            getMTransformLanguageLeftTv().setText(text2);
            getMTransformLanguageRightTv().setText(text);
            this.mCacheLanguage = getMLeftLanguage();
            setMLeftLanguage(getMRightLanguage());
            LanguageTranslationData languageTranslationData = this.mCacheLanguage;
            Intrinsics.XXI(languageTranslationData);
            setMRightLanguage(languageTranslationData);
            a01 a01Var = a01.OXO1;
            a01Var.m1440iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
            a01Var.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
            I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
            this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XXX11X1II
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTranslationActivity.startRotateAnimation$lambda$0(rotateAnimation, this);
                }
            }, 500L);
        }
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
        this.mHandler.removeMessages(this.loadTimeOut);
        this.mHandler.removeMessages(this.loadTimeOutToast);
        MicrosoftSDKManage.O1O.OXO1().XOIO11O();
    }

    public void upDataLastList() {
    }

    public void updateTimerText() {
    }
}
