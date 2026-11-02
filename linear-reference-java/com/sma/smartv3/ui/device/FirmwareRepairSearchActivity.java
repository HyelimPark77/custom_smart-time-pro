package com.sma.smartv3.ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0Ii0;
import com.android.mltcode.paycertificationapi.O0OIIO11I;
import com.android.mltcode.paycertificationapi.O0OXOI;
import com.android.mltcode.paycertificationapi.OI1X1iIXX;
import com.android.mltcode.paycertificationapi.OOXIOIiOO;
import com.android.mltcode.paycertificationapi.OOXXXiIIX;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.OXi1I0X0;
import com.android.mltcode.paycertificationapi.X1I00iiXI;
import com.android.mltcode.paycertificationapi.XI0X1OIIi;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.ut3;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.baseble.scanner.BleDevice;
import com.bestmafen.baseble.scanner.ScanMode;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n18#2,2:171\n15#2:173\n15#2:174\n11#2,2:175\n87#3,7:177\n94#3,3:185\n70#3,7:188\n97#3:195\n87#3,7:196\n94#3,3:204\n70#3,7:207\n97#3:214\n1#4:184\n1#4:203\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity\n*L\n26#1:171,2\n26#1:173\n27#1:174\n96#1:175,2\n98#1:177,7\n98#1:185,3\n98#1:188,7\n98#1:195\n100#1:196,7\n100#1:204,3\n100#1:207,7\n100#1:214\n98#1:184\n100#1:203\n*E\n"})
public final class FirmwareRepairSearchActivity extends BaseListFunctionActivity<BleDevice> {

    @aa1
    private final Lazy btnSearchAgain$delegate;

    @aa1
    private final Lazy llSearchAgain$delegate;

    @aa1
    private final Lazy llTryOrigin$delegate;

    @aa1
    private final BleDeviceInfo mDeviceInfo;

    @tb1
    private final FirmwareVersion mLatestFirmware;

    @aa1
    private final Lazy mScanner$delegate;
    private int mSearchTime;

    @aa1
    private final Lazy tvSearchTip$delegate;

    public static final class OXO1 implements OOXIOIiOO {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.OOXIOIiOO
        public boolean OXO1(BleDevice r3) {
            Intrinsics.X0O(r3, "device");
            if (TextUtils.isEmpty(r3.getMName()) == false) goto L5;
        L8:
            return false;
        L5:
            if (r3.getMRssi() <= (-120)) goto L8;
            return true;
        }
    }

    @SourceDebugExtension({"SMAP\nFirmwareRepairSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1011#2,2:171\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n*L\n67#1:171,2\n*E\n"})
    public static final class XIi00iiXO implements i1OIOOIiX {
        public final /* synthetic */ FirmwareRepairSearchActivity OXO1;

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n*L\n1#1,328:1\n67#2:329\n*E\n"})
        public static final class OXO1<T> implements Comparator {
            public OXO1() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T r1, T r2) {
                return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(-((BleDevice) r1).getMRssi()), Integer.valueOf(-((BleDevice) r2).getMRssi()));
            }
        }

        public XIi00iiXO(FirmwareRepairSearchActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean r1) {
            if (r1 == false) goto L5;
            FirmwareRepairSearchActivity.access$onScanStarted(this.OXO1);
            return;
        L5:
            FirmwareRepairSearchActivity.access$onScanStopped(this.OXO1);
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice r6) {
            Intrinsics.X0O(r6, "device");
            if (UtilsKt.XXiIiX10(r6) == true) goto L5;
            return;
        L5:
            if (UtilsKt.X00Xi1X(r6) == true) goto L7;
            return;
        L7:
            if (StringsKt__StringsKt.iIi011O(r6.getMName(), FirmwareRepairSearchActivity.access$getMDeviceInfo$p(this.OXO1).getMBleName(), false, 2, null) == true) goto L9;
            return;
        L9:
            if (FirmwareRepairSearchActivity.access$getMList(this.OXO1).contains(r6) == true) goto L19;
            FirmwareRepairSearchActivity.access$getMListView(this.OXO1).setVisibility(0);
            FirmwareRepairSearchActivity.access$getTvSearchTip(this.OXO1).setVisibility(8);
            FirmwareRepairSearchActivity.access$getLlSearchAgain(this.OXO1).setVisibility(8);
            FirmwareRepairSearchActivity.access$getMList(this.OXO1).add(r6);
            List r7 = FirmwareRepairSearchActivity.access$getMList(this.OXO1);
            if (r7.size() <= 1) goto L14;
            XiX0OOXI0.XOXiX0(r7, new OXO1());
        L14:
            FirmwareRepairSearchActivity.access$getMListAdapter(this.OXO1).notifyDataSetChanged();
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void iO() {
        }
    }

    public FirmwareRepairSearchActivity() {
        this.btnSearchAgain$delegate = LazyKt__LazyJVMKt.iO(new OXi1I0X0(this));
        this.llSearchAgain$delegate = LazyKt__LazyJVMKt.iO(new O0OXOI(this));
        this.llTryOrigin$delegate = LazyKt__LazyJVMKt.iO(new O0OIIO11I(this));
        this.tvSearchTip$delegate = LazyKt__LazyJVMKt.iO(new XI0X1OIIi(this));
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.XO0O10();
        Object r2 = new Gson().fromJson(r1.getString(BleDeviceInfo.class.getName()), BleDeviceInfo.class);
        if (r2 != null) goto L5;
        r2 = BleDeviceInfo.class.newInstance();
    L5:
        this.mDeviceInfo = (BleDeviceInfo) r2;
        SPUtils r3 = r0.XIi00iiXO();
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(r3.getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        this.mScanner$delegate = LazyKt__LazyJVMKt.iO(new X1I00iiXI(this));
    }

    public static /* synthetic */ View I1XOi1(FirmwareRepairSearchActivity r0) {
        return llTryOrigin_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View IIX1OXO(FirmwareRepairSearchActivity r0) {
        return llSearchAgain_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O10IXXX0X(FirmwareRepairSearchActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Button X0O(FirmwareRepairSearchActivity r0) {
        return btnSearchAgain_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(FirmwareRepairSearchActivity r0) {
        return tvSearchTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ OXOI0XII XX0(FirmwareRepairSearchActivity r0) {
        return mScanner_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(FirmwareRepairSearchActivity r0, BleDevice r1, View r2) {
        onScanStopped$lambda$0(r0, r1, r2);
    }

    public static final /* synthetic */ View access$getLlSearchAgain(FirmwareRepairSearchActivity r0) {
        return r0.getLlSearchAgain();
    }

    public static final /* synthetic */ BleDeviceInfo access$getMDeviceInfo$p(FirmwareRepairSearchActivity r0) {
        return r0.mDeviceInfo;
    }

    public static final /* synthetic */ List access$getMList(FirmwareRepairSearchActivity r0) {
        return r0.getMList();
    }

    public static final /* synthetic */ XII0Oi10O access$getMListAdapter(FirmwareRepairSearchActivity r0) {
        return r0.getMListAdapter();
    }

    public static final /* synthetic */ ListView access$getMListView(FirmwareRepairSearchActivity r0) {
        return r0.getMListView();
    }

    public static final /* synthetic */ TextView access$getTvSearchTip(FirmwareRepairSearchActivity r0) {
        return r0.getTvSearchTip();
    }

    public static final /* synthetic */ void access$onScanStarted(FirmwareRepairSearchActivity r0) {
        r0.onScanStarted();
    }

    public static final /* synthetic */ void access$onScanStopped(FirmwareRepairSearchActivity r0) {
        r0.onScanStopped();
    }

    private static final Button btnSearchAgain_delegate$lambda$0(FirmwareRepairSearchActivity r1) {
        return (Button) r1.findViewById(R.id.btn_search_again);
    }

    private final Button getBtnSearchAgain() {
        return (Button) getValue();
    }

    private final View getLlSearchAgain() {
        return (View) getValue();
    }

    private final View getLlTryOrigin() {
        return (View) getValue();
    }

    private final OXOI0XII getMScanner() {
        return (OXOI0XII) getValue();
    }

    private final TextView getTvSearchTip() {
        return (TextView) getValue();
    }

    public static /* synthetic */ void iIiiO(FirmwareRepairSearchActivity r0, AdapterView r1, View r2, int r3, long r4) {
        initView$lambda$0(r0, r1, r2, r3, r4);
    }

    private static final void initView$lambda$0(FirmwareRepairSearchActivity r0, AdapterView r1, View r2, int r3, long r4) {
        ToastUtils.showLong(String.valueOf(r3), new Object[0]);
        r0.getMScanner().XXI(false);
        r0.toRepair(r0.getMList().get(r3));
        r0.finish();
    }

    private static final void initView$lambda$1(FirmwareRepairSearchActivity r0, View r1) {
        r0.scan();
    }

    private static final View llSearchAgain_delegate$lambda$0(FirmwareRepairSearchActivity r1) {
        return r1.findViewById(R.id.ll_search_again);
    }

    private static final View llTryOrigin_delegate$lambda$0(FirmwareRepairSearchActivity r1) {
        return r1.findViewById(R.id.ll_try_origin);
    }

    private static final OXOI0XII mScanner_delegate$lambda$0(FirmwareRepairSearchActivity r4) {
        return ut3.XIi00iiXO(ut3.OXO1, null, ScanMode.LOW_LATENCY, 1, null).IIX1OXO(10).XiOIO(new OXO1()).X1ii(new XIi00iiXO(r4));
    }

    private final void onScanStarted() {
        getMListView().setVisibility(8);
        getTvSearchTip().setVisibility(0);
        getLlSearchAgain().setVisibility(8);
    }

    private final void onScanStopped() {
        getTvSearchTip().setVisibility(8);
        if (getMList().isEmpty() == false) goto L13;
        getMListView().setVisibility(8);
        getLlSearchAgain().setVisibility(0);
        if (BleConnector.INSTANCE.isAvailable() == false) goto L7;
        return;
    L7:
        if (this.mSearchTime < 2) goto L18;
        BluetoothDevice r4 = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(UtilsKt.I1(this.mDeviceInfo.getMBleAddress()));     // Catch: Exception -> L10
        Intrinsics.O10IXXX0X(r4, "getRemoteDevice(...)");     // Catch: Exception -> L10
        final BleDevice r3 = new BleDevice(r4, 0, null, this.mDeviceInfo.getMBleName(), 0, UtilsKt.I1(this.mDeviceInfo.getMBleAddress()));     // Catch: Exception -> L10
        getLlTryOrigin().setVisibility(0);     // Catch: Exception -> L10
        getLlTryOrigin().setOnClickListener(new O0Ii0(this, r3));     // Catch: Exception -> L10
        ((TextView) findViewById(R.id.tv_name)).setText(r3.getMName());     // Catch: Exception -> L10
        ((TextView) findViewById(R.id.tv_address)).setText(r3.getMAddress());     // Catch: Exception -> L10
        ((ImageView) findViewById(R.id.iv_rssi)).setImageLevel(-r3.getMRssi());     // Catch: Exception -> L10
        return;
    L10:
        e = move-exception;
        e.printStackTrace();
        return;
    L18:
        return;
    L13:
        getMListView().setVisibility(0);
        getLlSearchAgain().setVisibility(8);
    }

    private static final void onScanStopped$lambda$0(FirmwareRepairSearchActivity r0, BleDevice r1, View r2) {
        r0.toRepair(r1);
    }

    private final void scan() {
        this.mSearchTime++;
        getMList().clear();
        getMScanner().XXI(true);
    }

    private final void toRepair(BleDevice r6) {
        this.mDeviceInfo.setMBleAddress(UtilsKt.IXXOO(r6));
        a01.OXO1.XO0O10().put(BleDeviceInfo.class.getName(), new Gson().toJson(this.mDeviceInfo));
        FirmwareVersion r0 = this.mLatestFirmware;
        if (r0 == null) goto L5;
        String r1 = r0.getFileUrl2();
    L7:
        if (TextUtils.isEmpty(r1) == true) goto L10;
        String r7 = r6.getMAddress();
        Bundle r2 = new Bundle();
        r2.putString("mArg0", r7);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        Intent r8 = new Intent(this, FirmwareRepairJ2Activity.class);
        r8.putExtras(r2);
        startActivity(r8);
        return;
    L10:
        String r9 = r6.getMAddress();
        Bundle r3 = new Bundle();
        r3.putString("mArg0", r9);
        r3.putParcelable("mArg2", null);
        r3.putSerializable("mArg3", null);
        Intent r10 = new Intent(this, FirmwareRepairJActivity.class);
        r10.putExtras(r3);
        startActivity(r10);
        return;
    L5:
        r1 = null;
        goto L7
    }

    private static final TextView tvSearchTip_delegate$lambda$0(FirmwareRepairSearchActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_search_tip);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (BleDevice) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<BleDevice> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        BleInitializer.IO.i1iII1i1(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_repair);
        getMListView().setOnItemClickListener(new OI1X1iIXX(this));
        getBtnSearchAgain().setOnClickListener(new OOXXXiIIX(this));
        scan();
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_device;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_firmware_repair_search;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleInitializer.IO.i1iII1i1(false);
        getMScanner().XIi00iiXO();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void initItem(@aa1 ug6 r2, @aa1 BleDevice r3, int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        r2.OII(R.id.tv_name, r3.getMName());
        r2.OII(R.id.tv_address, r3.getMAddress());
        ((ImageView) r2.O00(R.id.iv_rssi)).setImageLevel(-r3.getMRssi());
    }
}
