package com.sma.smartv3.p610ui.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OOXIOIiOO;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.ut3;
import com.bestmafen.baseble.scanner.BleDevice;
import com.bestmafen.baseble.scanner.ScanMode;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.p610ui.device.FirmwareRepairSearchActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n18#2,2:171\n15#2:173\n15#2:174\n11#2,2:175\n87#3,7:177\n94#3,3:185\n70#3,7:188\n97#3:195\n87#3,7:196\n94#3,3:204\n70#3,7:207\n97#3:214\n1#4:184\n1#4:203\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity\n*L\n26#1:171,2\n26#1:173\n27#1:174\n96#1:175,2\n98#1:177,7\n98#1:185,3\n98#1:188,7\n98#1:195\n100#1:196,7\n100#1:204,3\n100#1:207,7\n100#1:214\n98#1:184\n100#1:203\n*E\n"})
public final class FirmwareRepairSearchActivity extends BaseListFunctionActivity<BleDevice> {

    @aa1
    private final BleDeviceInfo mDeviceInfo;

    @tb1
    private final FirmwareVersion mLatestFirmware;

    @aa1
    private final Lazy mScanner$delegate;
    private int mSearchTime;

    @aa1
    private final Lazy btnSearchAgain$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXi1I0X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FirmwareRepairSearchActivity.btnSearchAgain_delegate$lambda$0(this.f3572IO);
        }
    });

    @aa1
    private final Lazy llSearchAgain$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0OXOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FirmwareRepairSearchActivity.llSearchAgain_delegate$lambda$0(this.f2513IO);
        }
    });

    @aa1
    private final Lazy llTryOrigin$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0OIIO11I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FirmwareRepairSearchActivity.llTryOrigin_delegate$lambda$0(this.f2499IO);
        }
    });

    @aa1
    private final Lazy tvSearchTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI0X1OIIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return FirmwareRepairSearchActivity.tvSearchTip_delegate$lambda$0(this.f4447IO);
        }
    });

    public static final class OXO1 implements OOXIOIiOO {
        @Override // com.android.mltcode.paycertificationapi.OOXIOIiOO
        public boolean OXO1(BleDevice device) {
            Intrinsics.X0O(device, "device");
            return !TextUtils.isEmpty(device.getMName()) && device.getMRssi() > -120;
        }
    }

    @SourceDebugExtension({"SMAP\nFirmwareRepairSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1011#2,2:171\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n*L\n67#1:171,2\n*E\n"})
    public static final class XIi00iiXO implements i1OIOOIiX {

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n*L\n1#1,328:1\n67#2:329\n*E\n"})
        public static final class OXO1<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(-((BleDevice) t).getMRssi()), Integer.valueOf(-((BleDevice) t2).getMRssi()));
            }
        }

        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean z) {
            if (z) {
                FirmwareRepairSearchActivity.this.onScanStarted();
            } else {
                FirmwareRepairSearchActivity.this.onScanStopped();
            }
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice device) {
            Intrinsics.X0O(device, "device");
            if (UtilsKt.XXiIiX10(device) && UtilsKt.X00Xi1X(device) && StringsKt__StringsKt.iIi011O(device.getMName(), FirmwareRepairSearchActivity.this.mDeviceInfo.getMBleName(), false, 2, null) && !FirmwareRepairSearchActivity.this.getMList().contains(device)) {
                FirmwareRepairSearchActivity.this.getMListView().setVisibility(0);
                FirmwareRepairSearchActivity.this.getTvSearchTip().setVisibility(8);
                FirmwareRepairSearchActivity.this.getLlSearchAgain().setVisibility(8);
                FirmwareRepairSearchActivity.this.getMList().add(device);
                List mList = FirmwareRepairSearchActivity.this.getMList();
                if (mList.size() > 1) {
                    XiX0OOXI0.XOXiX0(mList, new OXO1());
                }
                FirmwareRepairSearchActivity.this.getMListAdapter().notifyDataSetChanged();
            }
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        /* JADX INFO: renamed from: iO */
        public void mo2019iO() {
        }
    }

    public FirmwareRepairSearchActivity() {
        a01 a01Var = a01.OXO1;
        Object objFromJson = new Gson().fromJson(a01Var.XO0O10().getString(BleDeviceInfo.class.getName()), (Class<Object>) BleDeviceInfo.class);
        this.mDeviceInfo = (BleDeviceInfo) (objFromJson == null ? BleDeviceInfo.class.newInstance() : objFromJson);
        this.mLatestFirmware = (FirmwareVersion) new Gson().fromJson(a01Var.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        this.mScanner$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1I00iiXI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return FirmwareRepairSearchActivity.mScanner_delegate$lambda$0(this.f4245IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnSearchAgain_delegate$lambda$0(FirmwareRepairSearchActivity firmwareRepairSearchActivity) {
        return (Button) firmwareRepairSearchActivity.findViewById(R.id.btn_search_again);
    }

    private final Button getBtnSearchAgain() {
        return (Button) this.btnSearchAgain$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getLlSearchAgain() {
        return (View) this.llSearchAgain$delegate.getValue();
    }

    private final View getLlTryOrigin() {
        return (View) this.llTryOrigin$delegate.getValue();
    }

    private final OXOI0XII getMScanner() {
        return (OXOI0XII) this.mScanner$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvSearchTip() {
        return (TextView) this.tvSearchTip$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(FirmwareRepairSearchActivity firmwareRepairSearchActivity, AdapterView adapterView, View view, int i, long j) {
        ToastUtils.showLong(String.valueOf(i), new Object[0]);
        firmwareRepairSearchActivity.getMScanner().XXI(false);
        firmwareRepairSearchActivity.toRepair(firmwareRepairSearchActivity.getMList().get(i));
        firmwareRepairSearchActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llSearchAgain_delegate$lambda$0(FirmwareRepairSearchActivity firmwareRepairSearchActivity) {
        return firmwareRepairSearchActivity.findViewById(R.id.ll_search_again);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llTryOrigin_delegate$lambda$0(FirmwareRepairSearchActivity firmwareRepairSearchActivity) {
        return firmwareRepairSearchActivity.findViewById(R.id.ll_try_origin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OXOI0XII mScanner_delegate$lambda$0(FirmwareRepairSearchActivity firmwareRepairSearchActivity) {
        return ut3.XIi00iiXO(ut3.OXO1, null, ScanMode.LOW_LATENCY, 1, null).IIX1OXO(10).XiOIO(new OXO1()).X1ii(firmwareRepairSearchActivity.new XIi00iiXO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScanStarted() {
        getMListView().setVisibility(8);
        getTvSearchTip().setVisibility(0);
        getLlSearchAgain().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScanStopped() {
        getTvSearchTip().setVisibility(8);
        if (!getMList().isEmpty()) {
            getMListView().setVisibility(0);
            getLlSearchAgain().setVisibility(8);
            return;
        }
        getMListView().setVisibility(8);
        getLlSearchAgain().setVisibility(0);
        if (BleConnector.INSTANCE.isAvailable() || this.mSearchTime < 2) {
            return;
        }
        try {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(UtilsKt.m38841I1(this.mDeviceInfo.getMBleAddress()));
            Intrinsics.O10IXXX0X(remoteDevice, "getRemoteDevice(...)");
            final BleDevice bleDevice = new BleDevice(remoteDevice, 0, null, this.mDeviceInfo.getMBleName(), 0, UtilsKt.m38841I1(this.mDeviceInfo.getMBleAddress()));
            getLlTryOrigin().setVisibility(0);
            getLlTryOrigin().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O0Ii0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2466IO.toRepair(bleDevice);
                }
            });
            ((TextView) findViewById(R.id.tv_name)).setText(bleDevice.getMName());
            ((TextView) findViewById(R.id.tv_address)).setText(bleDevice.getMAddress());
            ((ImageView) findViewById(R.id.iv_rssi)).setImageLevel(-bleDevice.getMRssi());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scan() {
        this.mSearchTime++;
        getMList().clear();
        getMScanner().XXI(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toRepair(BleDevice bleDevice) {
        this.mDeviceInfo.setMBleAddress(UtilsKt.IXXOO(bleDevice));
        a01.OXO1.XO0O10().put(BleDeviceInfo.class.getName(), new Gson().toJson(this.mDeviceInfo));
        FirmwareVersion firmwareVersion = this.mLatestFirmware;
        if (TextUtils.isEmpty(firmwareVersion != null ? firmwareVersion.getFileUrl2() : null)) {
            String mAddress = bleDevice.getMAddress();
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", mAddress);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(this, (Class<?>) FirmwareRepairJActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        String mAddress2 = bleDevice.getMAddress();
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", mAddress2);
        bundle2.putParcelable("mArg2", null);
        bundle2.putSerializable("mArg3", null);
        Intent intent2 = new Intent(this, (Class<?>) FirmwareRepairJ2Activity.class);
        intent2.putExtras(bundle2);
        startActivity(intent2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSearchTip_delegate$lambda$0(FirmwareRepairSearchActivity firmwareRepairSearchActivity) {
        return (TextView) firmwareRepairSearchActivity.findViewById(R.id.tv_search_tip);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<BleDevice> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        BleInitializer.f51208IO.i1iII1i1(true);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_repair);
        getMListView().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.android.mltcode.paycertificationapi.OI1X1iIXX
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                FirmwareRepairSearchActivity.initView$lambda$0(this.f2928IO, adapterView, view, i, j);
            }
        });
        getBtnSearchAgain().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OOXXXiIIX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3351IO.scan();
            }
        });
        scan();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.item_device;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_firmware_repair_search;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleInitializer.f51208IO.i1iII1i1(false);
        getMScanner().XIi00iiXO();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 BleDevice item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.OII(R.id.tv_name, item.getMName());
        holder.OII(R.id.tv_address, item.getMAddress());
        ((ImageView) holder.O00(R.id.iv_rssi)).setImageLevel(-item.getMRssi());
    }
}
