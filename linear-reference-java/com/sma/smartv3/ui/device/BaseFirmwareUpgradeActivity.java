package com.sma.smartv3.ui.device;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I10I0OO;
import com.android.mltcode.paycertificationapi.I1O0iOX0i;
import com.android.mltcode.paycertificationapi.I1iOO;
import com.android.mltcode.paycertificationapi.IXXXXXi10;
import com.android.mltcode.paycertificationapi.Ii0OX1;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIXX0X;
import com.android.mltcode.paycertificationapi.XI00I;
import com.android.mltcode.paycertificationapi.XO01OX1;
import com.android.mltcode.paycertificationapi.XOOXXOX1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0I01;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileUtils;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Y5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.StatManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.network.UploadOtaRecord;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"Registered"})
@SourceDebugExtension({"SMAP\nBaseFirmwareUpgradeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFirmwareUpgradeActivity.kt\ncom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,173:1\n27#2,2:174\n235#3,11:176\n246#3:188\n256#3:198\n1#4:187\n278#5,8:189\n298#5:197\n*S KotlinDebug\n*F\n+ 1 BaseFirmwareUpgradeActivity.kt\ncom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity\n*L\n126#1:174,2\n155#1:176,11\n155#1:188\n155#1:198\n155#1:187\n155#1:189,8\n155#1:197\n*E\n"})
public abstract class BaseFirmwareUpgradeActivity extends BaseActivity {

    @aa1
    private final Lazy devInfo$delegate;
    private boolean isAutoUpdate;

    @aa1
    private String mCurrentVersion;
    private boolean mStarted;

    @aa1
    private String mTargetVersion;

    @aa1
    private final Lazy progressButton$delegate;

    @aa1
    private final Lazy tvAlreadyOta$delegate;

    @aa1
    private final Lazy tvCurrent$delegate;

    @aa1
    private final Lazy tvInfo$delegate;

    @aa1
    private final Lazy tvLatest$delegate;

    @aa1
    private final Lazy tvSpeed$delegate;

    @aa1
    private final Lazy tvStep$delegate;

    @aa1
    private final Lazy tvTip$delegate;

    @tb1
    private TextView tvTopTip;

    @aa1
    private final Lazy tvUpdateDesc$delegate;

    public BaseFirmwareUpgradeActivity() {
        this.tvLatest$delegate = LazyKt__LazyJVMKt.iO(new XO01OX1(this));
        this.tvCurrent$delegate = LazyKt__LazyJVMKt.iO(new I10I0OO(this));
        this.tvStep$delegate = LazyKt__LazyJVMKt.iO(new XOOXXOX1(this));
        this.progressButton$delegate = LazyKt__LazyJVMKt.iO(new OIXX0X(this));
        this.devInfo$delegate = LazyKt__LazyJVMKt.iO(new IXXXXXi10(this));
        this.tvAlreadyOta$delegate = LazyKt__LazyJVMKt.iO(new Ii0OX1(this));
        this.tvSpeed$delegate = LazyKt__LazyJVMKt.iO(new I1O0iOX0i(this));
        this.tvInfo$delegate = LazyKt__LazyJVMKt.iO(new XI00I(this));
        this.tvTip$delegate = LazyKt__LazyJVMKt.iO(new i0I01(this));
        this.tvUpdateDesc$delegate = LazyKt__LazyJVMKt.iO(new I1iOO(this));
        this.mCurrentVersion = "0.0.0";
        this.mTargetVersion = "0.0.0";
    }

    public static /* synthetic */ TextView I0iXXO(BaseFirmwareUpgradeActivity r0) {
        return tvTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(BaseFirmwareUpgradeActivity r0) {
        return tvLatest_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(BaseFirmwareUpgradeActivity r0) {
        return tvUpdateDesc_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout O10IXXX0X(BaseFirmwareUpgradeActivity r0) {
        return devInfo_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(BaseFirmwareUpgradeActivity r0) {
        return tvStep_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(BaseFirmwareUpgradeActivity r0) {
        return tvAlreadyOta_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(BaseFirmwareUpgradeActivity r0) {
        return tvSpeed_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ProgressButton XXI(BaseFirmwareUpgradeActivity r0) {
        return progressButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(BaseFirmwareUpgradeActivity r0) {
        return tvCurrent_delegate$lambda$0(r0);
    }

    private static final LinearLayout devInfo_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_dev_info);
    }

    public static /* synthetic */ TextView iIiiO(BaseFirmwareUpgradeActivity r0) {
        return tvInfo_delegate$lambda$0(r0);
    }

    private static final ProgressButton progressButton_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (ProgressButton) r1.findViewById(R.id.btn_bottom);
    }

    private static final TextView tvAlreadyOta_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_already_ota);
    }

    private static final TextView tvCurrent_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_current);
    }

    private static final TextView tvInfo_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_info);
    }

    private static final TextView tvLatest_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_latest);
    }

    private static final TextView tvSpeed_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_speed);
    }

    private static final TextView tvStep_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_step);
    }

    private static final TextView tvTip_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_tip);
    }

    private static final TextView tvUpdateDesc_delegate$lambda$0(BaseFirmwareUpgradeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_update_desc);
    }

    public static /* synthetic */ void uploadDownloadInfo$default(BaseFirmwareUpgradeActivity r0, String r1, String r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = -1;
    L6:
        r0.uploadDownloadInfo(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadDownloadInfo");
    }

    public static /* synthetic */ void uploadOtaRecord$default(BaseFirmwareUpgradeActivity r6, String r7, String r8, String r9, String r10, String r11, int r12, Object r13) {
        if (r13 != null) goto L18;
        if ((r12 & 2) == 0) goto L6;
        r8 = null;
    L6:
        String r2 = r8;
        if ((r12 & 4) == 0) goto L9;
        r9 = "1";
    L9:
        String r3 = r9;
        if ((r12 & 8) == 0) goto L12;
        r10 = r6.mCurrentVersion;
    L12:
        String r4 = r10;
        if ((r12 & 16) == 0) goto L15;
        r11 = r6.mTargetVersion;
    L15:
        r6.uploadOtaRecord(r7, r2, r3, r4, r11);
        return;
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadOtaRecord");
    }

    @aa1
    public final LinearLayout getDevInfo() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (LinearLayout) r0;
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
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (ProgressButton) r0;
    }

    @aa1
    public final TextView getTvAlreadyOta() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @aa1
    public final TextView getTvCurrent() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @aa1
    public final TextView getTvInfo() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @aa1
    public final TextView getTvLatest() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @aa1
    public final TextView getTvSpeed() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @aa1
    public final TextView getTvStep() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @aa1
    public final TextView getTvTip() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @tb1
    public final TextView getTvTopTip() {
        return this.tvTopTip;
    }

    @aa1
    public final TextView getTvUpdateDesc() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (TextView) r0;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @CallSuper
    public void initView() {
        this.tvTopTip = (TextView) findViewById(R.id.tv_firmware_upgrade_top_tip);
        this.isAutoUpdate = getIntent().getBooleanExtra("isAutoUpdate", false);
        BleInitializer.IO.i1iII1i1(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_upgrade);
        ProgressButton.O00(getProgressButton(), R.string.upgrade, false, 2, null);
        TextView r0 = getTvTip();
        q62 r1 = q62.OXO1;
        if (r1.iiOOI() == false) goto L5;
    L10:
        String r2 = getString(R.string.jl_firmware_upgrade_support_dual_backup_tip);
    L11:
        r0.setText(r2);
        return;
    L5:
        if (r1.X0100I() == true) goto L10;
        if (r1.I0i1OXiI() == true) goto L10;
        r2 = getString(R.string.jl_firmware_upgrade_tip);
        goto L11
    }

    public final boolean isAutoUpdate() {
        return this.isAutoUpdate;
    }

    public boolean isNeedLaunch() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_firmware_upgrade;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @CallSuper
    public void onDestroy() {
        BleInitializer.IO.i1iII1i1(false);
        BleCache r0 = BleCache.INSTANCE;
        BaseBleCache.remove$default(r0, BleKey.WEATHER_REALTIME, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_FORECAST, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_REALTIME2, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_FORECAST2, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_REALTIME3, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_FORECAST3, null, 2, null);
        if (isNeedLaunch() == false) goto L5;
        BleConnector.INSTANCE.launch();
    L5:
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.mStarted == false) goto L5;
        return;
    L5:
        super.onHandleBackPressed();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }

    public final void setAutoUpdate(boolean r1) {
        this.isAutoUpdate = r1;
    }

    public final void setMCurrentVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCurrentVersion = r2;
    }

    public final void setMStarted(boolean r3) {
        this.mStarted = r3;
        getProgressButton().setEnabled(!r3);
        if (r3 == false) goto L6;
        disableOrientation();
        return;
    }

    public final void setMTargetVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTargetVersion = r2;
    }

    public final void setTvTopTip(@tb1 TextView r1) {
        this.tvTopTip = r1;
    }

    public final void updateDeviceInfo(@aa1 String r10) {
        Intrinsics.X0O(r10, "firmwareVersion");
        a01.OXO1.XIi00iiXO().remove(FirmwareVersion.class.getName());
        I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
        BaseBleCache.putString$default(BleCache.INSTANCE, BleKey.FIRMWARE_VERSION, r10, null, 4, null);
        RequestCommonMethod.INSTANCE.updateDeviceInfo(new AnonymousClass1());
    }

    public final void uploadDownloadInfo(@aa1 String r8, @aa1 String r9, int r10) {
        Intrinsics.X0O(r8, "url");
        Intrinsics.X0O(r9, Y5.c.b);
        StatManager.OXO1.XO0O10(r8, FileUtils.getLength(new File(uz0.XXI(sz0.OXO1), r9)), 0, r10);
    }

    public final void uploadOtaRecord(@aa1 String r7, @tb1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r7, UploadOtaRecord.SUCCESS_FLAG);
        Intrinsics.X0O(r9, UploadOtaRecord.OTA_TYPE);
        Intrinsics.X0O(r10, UploadOtaRecord.CURRENT_VERSION);
        Intrinsics.X0O(r11, "targetVersion");
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        HashMap r4 = new HashMap();
        r4.put(UploadOtaRecord.CURRENT_VERSION, r10);
        r4.put(UploadOtaRecord.TARGET_VERSION, r11);
        r4.put(UploadOtaRecord.OTA_TYPE, r9);
        r4.put(UploadOtaRecord.SUCCESS_FLAG, r7);
        if (r8 != null) goto L5;
        r8 = "";
    L5:
        r4.put(UploadOtaRecord.REMARK, r8);
        final O1XIiIO<Object> r12 = new AnonymousClass2();
        Map<String, String> r13 = r3.getHeadersMap();
        final Activity r14 = null;
        final uq r15 = r3.loadPopup(null, null);
        String r16 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), UploadOtaRecord.URL);
        String r1 = r16 + UploadOtaRecord.URL;
        Map<String, ? extends Object> r2 = kotlin.collections.OXO1.X111IO(r4);
        r2.putAll(r13);
        Unit r5 = Unit.OXO1;
        r3.printParam(r1, r2);
        NetWork r6 = NetWork.OXO1;
        String r17 = r16 + UploadOtaRecord.URL;
        final O1XIiIO<Response<Object>> r0 = new BaseFirmwareUpgradeActivity$uploadOtaRecord$$inlined$postV2$default$1(r14, r12, r15);
        AndroidNetworking.post(r17).addHeaders(r13).addBodyParameter(r4).setTag(r17).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Object.class}), new BaseFirmwareUpgradeActivity$uploadOtaRecord$$inlined$postV2$default$2(r0));
    }
}
