package com.sma.smartv3.p610ui.device;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.StatManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.network.UploadOtaRecord;
import com.sma.smartv3.p610ui.device.BaseFirmwareUpgradeActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.OXO1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"Registered"})
@SourceDebugExtension({"SMAP\nBaseFirmwareUpgradeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFirmwareUpgradeActivity.kt\ncom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,173:1\n27#2,2:174\n235#3,11:176\n246#3:188\n256#3:198\n1#4:187\n278#5,8:189\n298#5:197\n*S KotlinDebug\n*F\n+ 1 BaseFirmwareUpgradeActivity.kt\ncom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity\n*L\n126#1:174,2\n155#1:176,11\n155#1:188\n155#1:198\n155#1:187\n155#1:189,8\n155#1:197\n*E\n"})
public abstract class BaseFirmwareUpgradeActivity extends BaseActivity {
    private boolean isAutoUpdate;
    private boolean mStarted;

    @tb1
    private TextView tvTopTip;

    @aa1
    private final Lazy tvLatest$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO01OX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.tvLatest_delegate$lambda$0(this.f4654IO);
        }
    });

    @aa1
    private final Lazy tvCurrent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I10I0OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.tvCurrent_delegate$lambda$0(this.f1300IO);
        }
    });

    @aa1
    private final Lazy tvStep$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOOXXOX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.tvStep_delegate$lambda$0(this.f4830IO);
        }
    });

    @aa1
    private final Lazy progressButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIXX0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.progressButton_delegate$lambda$0(this.f3052IO);
        }
    });

    @aa1
    private final Lazy devInfo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXXXXXi10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.devInfo_delegate$lambda$0(this.f2117IO);
        }
    });

    @aa1
    private final Lazy tvAlreadyOta$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii0OX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.tvAlreadyOta_delegate$lambda$0(this.f2178IO);
        }
    });

    @aa1
    private final Lazy tvSpeed$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1O0iOX0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.tvSpeed_delegate$lambda$0(this.f1410IO);
        }
    });

    @aa1
    private final Lazy tvInfo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI00I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.tvInfo_delegate$lambda$0(this.f4406IO);
        }
    });

    @aa1
    private final Lazy tvTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0I01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.tvTip_delegate$lambda$0(this.f7338IO);
        }
    });

    @aa1
    private final Lazy tvUpdateDesc$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1iOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseFirmwareUpgradeActivity.tvUpdateDesc_delegate$lambda$0(this.f1493IO);
        }
    });

    @aa1
    private String mCurrentVersion = "0.0.0";

    @aa1
    private String mTargetVersion = "0.0.0";

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout devInfo_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (LinearLayout) baseFirmwareUpgradeActivity.findViewById(R.id.ll_dev_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressButton progressButton_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (ProgressButton) baseFirmwareUpgradeActivity.findViewById(R.id.btn_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAlreadyOta_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (TextView) baseFirmwareUpgradeActivity.findViewById(R.id.tv_already_ota);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCurrent_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (TextView) baseFirmwareUpgradeActivity.findViewById(R.id.tv_current);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvInfo_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (TextView) baseFirmwareUpgradeActivity.findViewById(R.id.tv_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvLatest_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (TextView) baseFirmwareUpgradeActivity.findViewById(R.id.tv_latest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSpeed_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (TextView) baseFirmwareUpgradeActivity.findViewById(R.id.tv_speed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvStep_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (TextView) baseFirmwareUpgradeActivity.findViewById(R.id.tv_step);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTip_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (TextView) baseFirmwareUpgradeActivity.findViewById(R.id.tv_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvUpdateDesc_delegate$lambda$0(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity) {
        return (TextView) baseFirmwareUpgradeActivity.findViewById(R.id.tv_update_desc);
    }

    public static /* synthetic */ void uploadDownloadInfo$default(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity, String str, String str2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadDownloadInfo");
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        baseFirmwareUpgradeActivity.uploadDownloadInfo(str, str2, i);
    }

    public static /* synthetic */ void uploadOtaRecord$default(BaseFirmwareUpgradeActivity baseFirmwareUpgradeActivity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadOtaRecord");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = "1";
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = baseFirmwareUpgradeActivity.mCurrentVersion;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = baseFirmwareUpgradeActivity.mTargetVersion;
        }
        baseFirmwareUpgradeActivity.uploadOtaRecord(str, str6, str7, str8, str5);
    }

    @aa1
    public final LinearLayout getDevInfo() {
        Object value = this.devInfo$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (LinearLayout) value;
    }

    @aa1
    public final String getMCurrentVersion() {
        return this.mCurrentVersion;
    }

    public final boolean getMStarted() {
        return this.mStarted;
    }

    @aa1
    public final String getMTargetVersion() {
        return this.mTargetVersion;
    }

    @aa1
    public final ProgressButton getProgressButton() {
        Object value = this.progressButton$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (ProgressButton) value;
    }

    @aa1
    public final TextView getTvAlreadyOta() {
        Object value = this.tvAlreadyOta$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @aa1
    public final TextView getTvCurrent() {
        Object value = this.tvCurrent$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @aa1
    public final TextView getTvInfo() {
        Object value = this.tvInfo$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @aa1
    public final TextView getTvLatest() {
        Object value = this.tvLatest$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @aa1
    public final TextView getTvSpeed() {
        Object value = this.tvSpeed$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @aa1
    public final TextView getTvStep() {
        Object value = this.tvStep$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @aa1
    public final TextView getTvTip() {
        Object value = this.tvTip$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @tb1
    public final TextView getTvTopTip() {
        return this.tvTopTip;
    }

    @aa1
    public final TextView getTvUpdateDesc() {
        Object value = this.tvUpdateDesc$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @CallSuper
    public void initView() {
        this.tvTopTip = (TextView) findViewById(R.id.tv_firmware_upgrade_top_tip);
        this.isAutoUpdate = getIntent().getBooleanExtra("isAutoUpdate", false);
        BleInitializer.f51208IO.i1iII1i1(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_upgrade);
        ProgressButton.O00(getProgressButton(), R.string.upgrade, false, 2, null);
        TextView tvTip = getTvTip();
        q62 q62Var = q62.OXO1;
        tvTip.setText((q62Var.iiOOI() || q62Var.X0100I() || q62Var.I0i1OXiI()) ? getString(R.string.jl_firmware_upgrade_support_dual_backup_tip) : getString(R.string.jl_firmware_upgrade_tip));
    }

    public final boolean isAutoUpdate() {
        return this.isAutoUpdate;
    }

    public boolean isNeedLaunch() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_firmware_upgrade;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onDestroy() {
        BleInitializer.f51208IO.i1iII1i1(false);
        BleCache bleCache = BleCache.INSTANCE;
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME2, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST2, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME3, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST3, null, 2, null);
        if (isNeedLaunch()) {
            BleConnector.INSTANCE.launch();
        }
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.mStarted) {
            return;
        }
        super.onHandleBackPressed();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onHandleBackPressed();
    }

    public final void setAutoUpdate(boolean z) {
        this.isAutoUpdate = z;
    }

    public final void setMCurrentVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCurrentVersion = str;
    }

    public final void setMStarted(boolean z) {
        this.mStarted = z;
        getProgressButton().setEnabled(!z);
        if (z) {
            disableOrientation();
        }
    }

    public final void setMTargetVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTargetVersion = str;
    }

    public final void setTvTopTip(@tb1 TextView textView) {
        this.tvTopTip = textView;
    }

    public final void updateDeviceInfo(@aa1 String firmwareVersion) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(firmwareVersion, "firmwareVersion");
        a01.OXO1.XIi00iiXO().remove(FirmwareVersion.class.getName());
        I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
        BaseBleCache.putString$default(BleCache.INSTANCE, BleKey.FIRMWARE_VERSION, firmwareVersion, null, 4, null);
        RequestCommonMethod.INSTANCE.updateDeviceInfo(new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity.updateDeviceInfo.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        });
    }

    public final void uploadDownloadInfo(@aa1 String url, @aa1 String fileName, int i) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(fileName, "fileName");
        StatManager.OXO1.XO0O10(url, FileUtils.getLength(new File(uz0.XXI(sz0.OXO1), fileName)), 0, i);
    }

    public final void uploadOtaRecord(@aa1 String successFlag, @tb1 String str, @aa1 String otaType, @aa1 String currentVersion, @aa1 String targetVersion) {
        Intrinsics.X0O(successFlag, "successFlag");
        Intrinsics.X0O(otaType, "otaType");
        Intrinsics.X0O(currentVersion, "currentVersion");
        Intrinsics.X0O(targetVersion, "targetVersion");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap map = new HashMap();
        map.put(UploadOtaRecord.CURRENT_VERSION, currentVersion);
        map.put(UploadOtaRecord.TARGET_VERSION, targetVersion);
        map.put(UploadOtaRecord.OTA_TYPE, otaType);
        map.put(UploadOtaRecord.SUCCESS_FLAG, successFlag);
        if (str == null) {
            str = "";
        }
        map.put(UploadOtaRecord.REMARK, str);
        final O1XIiIO<Object> o1XIiIO = new O1XIiIO<Object>() { // from class: com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity.uploadOtaRecord.2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Object obj) {
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), UploadOtaRecord.URL);
        String str2 = strConvertBaseUrl + UploadOtaRecord.URL;
        Map<String, ? extends Object> mapX111IO = OXO1.X111IO(map);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str2, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str3 = strConvertBaseUrl + UploadOtaRecord.URL;
        final O1XIiIO<Response<Object>> o1XIiIO2 = new O1XIiIO<Response<Object>>() { // from class: com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity$uploadOtaRecord$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<Object> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str3).addHeaders(headersMap).addBodyParameter((Map<String, String>) map).setTag((Object) str3).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Object.class), new ParsedRequestListener<Response<Object>>() { // from class: com.sma.smartv3.ui.device.BaseFirmwareUpgradeActivity$uploadOtaRecord$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<Object> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }
}
