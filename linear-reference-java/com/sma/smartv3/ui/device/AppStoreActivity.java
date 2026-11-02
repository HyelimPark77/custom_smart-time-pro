package com.sma.smartv3.ui.device;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.IXXOi1X0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X011i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i001O;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.AppFileDetail;
import com.sma.smartv3.model.AppStoreDataItem;
import com.sma.smartv3.model.AppStoreFileList;
import com.sma.smartv3.model.AppStoreFileManager;
import com.sma.smartv3.model.AppStoreItemList;
import com.sma.smartv3.model.AppStoreItemType;
import com.sma.smartv3.model.FileTransmissionKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.fragment.AllAppStoreFragment;
import com.sma.smartv3.ui.device.fragment.BaseJLFileManageFragment;
import com.sma.smartv3.ui.device.fragment.MyAppStoreFragment;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAppInfo;
import com.szabh.smable3.entity.BleAppInfoList;
import com.szabh.smable3.entity.BleSDCardInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAppStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStoreActivity.kt\ncom/sma/smartv3/ui/device/AppStoreActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1563#2:433\n1634#2,3:434\n1869#2:437\n774#2:439\n865#2,2:440\n1870#2:444\n1869#2,2:445\n13805#3:438\n13806#3:443\n1#4:442\n*S KotlinDebug\n*F\n+ 1 AppStoreActivity.kt\ncom/sma/smartv3/ui/device/AppStoreActivity\n*L\n393#1:433\n393#1:434,3\n225#1:437\n228#1:439\n228#1:440,2\n225#1:444\n294#1:445,2\n226#1:438\n226#1:443\n*E\n"})
public final class AppStoreActivity extends BaseFragmentPagerActivity {

    @aa1
    private final String TAG;

    @aa1
    private String freeSizeDeviceStorage;
    private final int loadTimeOut;
    public AllAppStoreFragment mAllAppStoreFragment;

    @aa1
    private final List<AppStoreDataItem> mAppStoreGameItem;

    @aa1
    private final List<AppStoreItemList> mAppStoreItemList;

    @aa1
    private final List<AppStoreDataItem> mAppStoreToolItem;

    @aa1
    private AppStoreActivity$mBleHandleCallback$1 mBleHandleCallback;
    public MyAppStoreFragment mMyAppStoreFragment;

    @aa1
    private final Lazy table$delegate;

    @aa1
    private String totalDeviceStorage;

    /* JADX WARN: Type inference failed for: r0v8, types: [com.sma.smartv3.ui.device.AppStoreActivity$mBleHandleCallback$1] */
    public AppStoreActivity() {
        this.TAG = "AppStoreActivity";
        this.table$delegate = LazyKt__LazyJVMKt.iO(new X011i(this));
        this.mAppStoreGameItem = new ArrayList();
        this.mAppStoreToolItem = new ArrayList();
        this.mAppStoreItemList = new ArrayList();
        this.totalDeviceStorage = "";
        this.freeSizeDeviceStorage = "";
        this.loadTimeOut = 255;
        this.mBleHandleCallback = new AppStoreActivity$mBleHandleCallback$1(this);
    }

    public static /* synthetic */ Unit I0iXXO(AppStoreActivity r0, BleAppInfoList r1, List r2) {
        return checkAppStoreList$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ TabLayout OIX0iXi(AppStoreActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ Activity access$getMContext(AppStoreActivity r0) {
        return r0.getMContext();
    }

    private static final Unit checkAppStoreList$lambda$0(AppStoreActivity r24, BleAppInfoList r25, List r26) {
        if (r26 == null) goto L42;
        r24.mAppStoreToolItem.clear();
        r24.mAppStoreGameItem.clear();
        r24.mAppStoreItemList.clear();
        if (r26.isEmpty() == true) goto L33;
        i1O0OXO1O.OXO1.OXO1(r24.TAG + " checkAppStoreList it.isNotEmpty()");
        Iterator r1 = r26.iterator();
    L8:
        if (r1.hasNext() == false) goto L40;
        AppFileDetail[] r2 = ((AppStoreFileList) r1.next()).getAppx();
        if (r2 == null) goto L8;
        int r3 = r2.length;
        int r4 = 0;
    L12:
        if (r4 >= r3) goto L8;
        AppFileDetail r5 = r2[r4];
        List<BleAppInfo> r6 = r25.getMList();
        ArrayList r7 = new ArrayList();
        Iterator<T> r8 = r6.iterator();
    L15:
        if (r8.hasNext() == false) goto L20;
        Object r9 = r8.next();
        if (Intrinsics.XOO0ii0(((BleAppInfo) r9).getMPackage(), r5.getAppPackName()) == false) goto L15;
        r7.add(r9);
        goto L15
    L20:
        if (r7.isEmpty() == false) goto L28;
        String r10 = r5.getAppPackName();
        if (r10.length() != 0) goto L24;
        r10 = "if-empty";
    L24:
        BleAppInfo r16 = new BleAppInfo(r10, null, r5.getAppName(), (int) (r5.getAppSize() * ((double) 1024)), 1, OiOX0i.iO(!Intrinsics.XOO0ii0(r5.getAppGroupId(), "app_group:2")), null, 66, null);
        if (Intrinsics.XOO0ii0(r5.getAppGroupId(), "app_group:2") == false) goto L27;
        r24.mAppStoreGameItem.add(new AppStoreDataItem(0, r16, 0, r5.getAppPreImg(), r24.getAppStoreBinOnlinePath(r5.getAppPack()), r5.getAppNewFlag(), 0, 69, null));
    L32:
        r4 = r4 + 1;
        goto L12
    L27:
        r24.mAppStoreToolItem.add(new AppStoreDataItem(0, r16, 0, r5.getAppPreImg(), r24.getAppStoreBinOnlinePath(r5.getAppPack()), r5.getAppNewFlag(), 0, 69, null));
        goto L32
    L28:
        BleAppInfo r11 = (BleAppInfo) CollectionsKt___CollectionsKt.IIII0iI(r7);
        r11.setMName(r5.getAppName());
        if (r11.getMIsGame() != 0) goto L31;
        r24.mAppStoreGameItem.add(new AppStoreDataItem(0, r11, 0, r5.getAppPreImg(), r24.getAppStoreBinOnlinePath(r5.getAppPack()), r5.getAppNewFlag(), r24.getAppStoreItemType(r11, r5.getAppPackVersion()), 5, null));
        goto L32
    L31:
        r24.mAppStoreToolItem.add(new AppStoreDataItem(0, r11, 0, r5.getAppPreImg(), r24.getAppStoreBinOnlinePath(r5.getAppPack()), r5.getAppNewFlag(), r24.getAppStoreItemType(r11, r5.getAppPackVersion()), 5, null));
    L40:
        List<AppStoreItemList> r12 = r24.mAppStoreItemList;
        String r13 = r24.getString(R.string.app_store_tool);
        Intrinsics.O10IXXX0X(r13, "getString(...)");
        r12.add(new AppStoreItemList(r13, r24.mAppStoreToolItem, false, 4, null));
        List<AppStoreItemList> r14 = r24.mAppStoreItemList;
        String r15 = r24.getString(R.string.app_store_game);
        Intrinsics.O10IXXX0X(r15, "getString(...)");
        r14.add(new AppStoreItemList(r15, r24.mAppStoreGameItem, false, 4, null));
        r24.getMAllAppStoreFragment().upData(r24.mAppStoreItemList);
        r24.getMMyAppStoreFragment().upData(r24.mAppStoreItemList);
        goto L42
    L33:
        i1O0OXO1O.OXO1.OXO1(r24.TAG + " checkAppStoreList it.isEmpty()");
        Iterator<T> r17 = r25.getMList().iterator();
    L35:
        if (r17.hasNext() == false) goto L40;
        BleAppInfo r18 = (BleAppInfo) r17.next();
        if (OiOX0i.XIi00iiXO(r18.getMIsGame()) == true) goto L38;
        r24.mAppStoreGameItem.add(new AppStoreDataItem(0, r18, FileTransmissionKt.getAppStoreIcon(r18.getMPackage()), null, null, false, r24.getAppStoreItemType(r18, ""), 57, null));
        goto L35
    L38:
        r24.mAppStoreToolItem.add(new AppStoreDataItem(0, r18, FileTransmissionKt.getAppStoreIcon(r18.getMPackage()), null, null, false, r24.getAppStoreItemType(r18, ""), 57, null));
    L42:
        return Unit.OXO1;
    }

    private final String getAppStoreBinOnlinePath(String r1) {
        if (r1 != null) goto L5;
        return "";
    L5:
        return r1;
    }

    private final int getAppStoreInstallType(BleAppInfo r2) {
        if (r2 != null) goto L6;
        return AppStoreItemType.INSTALL.getType();
    L6:
        if (r2.getMHide() != 1) goto L10;
        return AppStoreItemType.INSTALL.getType();
    L10:
        return AppStoreItemType.INSTALLED.getType();
    }

    private final int getAppStoreItemType(BleAppInfo r10, String r11) {
        boolean r1 = true;
        if (r10 == null) goto L47;
        if (r11 == null) goto L47;
        String r3 = r10.getMVersion();
        String r4 = r10.getMApiVersion();
        if (r11.length() != 0) goto L10;
    L14:
        i1O0OXO1O r5 = i1O0OXO1O.OXO1;
        String r6 = this.TAG;
        if (r11.length() != 0) goto L17;
        boolean r12 = true;
    L19:
        if (r3.length() != 0) goto L21;
        boolean r7 = true;
    L23:
        if (r4.length() == 0) goto L26;
        r1 = false;
    L26:
        r5.XIi00iiXO(r6 + " version.isEmpty = " + r12 + ", " + r7 + " , " + r1);
        return getAppStoreInstallType(r10);
    L21:
        r7 = false;
        goto L23
    L17:
        r12 = false;
        goto L19
    L10:
        if (r3.length() == 0) goto L14;
        if (r4.length() == 0) goto L14;
        List<Long> r13 = versionToList(r11);
        List<Long> r0 = versionToList(r3);
        List<Long> r2 = versionToList(r4);
        if (r13.size() != 4) goto L46;
        if (r0.size() != 4) goto L46;
        if (r2.size() != 4) goto L46;
        long r8 = versionListToLong(r13);
        long r9 = versionListToLong(r0);
        versionListToLong(r2);
        if (r13.get(0).longValue() <= r2.get(0).longValue()) goto L40;
        return AppStoreItemType.NOT_RENEW.getType();
    L40:
        if (r8 <= r9) goto L44;
        return AppStoreItemType.RENEW.getType();
    L44:
        return getAppStoreInstallType(r10);
    L46:
        return getAppStoreInstallType(r10);
    L47:
        i1O0OXO1O r14 = i1O0OXO1O.OXO1;
        String r15 = this.TAG;
        if (r10 != null) goto L50;
        boolean r16 = true;
    L51:
        if (r11 == null) goto L54;
        r1 = false;
    L54:
        r14.XIi00iiXO(r15 + " bleAppInfo.isEmpty " + r16 + " , " + r1);
        return getAppStoreInstallType(r10);
    L50:
        r16 = false;
        goto L51
    }

    private final String[] getTiTle() {
        String r0 = getString(R.string.app_store_all_fg_title);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        String r2 = getString(R.string.app_store_my_fg_title);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        return new String[]{r0, r2};
    }

    private static final TabLayout table_delegate$lambda$0(AppStoreActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    private final long versionListToLong(List<Long> r6) {
        return (((r6.get(0).longValue() << 24) + (r6.get(1).longValue() << 16)) + (r6.get(2).longValue() << 8)) + r6.get(3).longValue();
    }

    private final List<Long> versionToList(String r4) {
        List<String> r5 = new Regex("\\.").split(r4, 0);
        ArrayList r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        r0.add(Long.valueOf(Long.parseLong((String) r6.next())));
        goto L4
    L6:
        return r0;
    }

    @sf5(tag = "add_app_store_error")
    public final void addAppStoreError(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        getAppStoreList();
    }

    public final void checkAppStoreList(@tb1 final BleAppInfoList r3) {
        if (r3 == null) goto L5;
        AppStoreFileManager.INSTANCE.getAppStoreFileList("1", new i001O(this, r3));
        return;
    }

    public final void getAppStoreList() {
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.APP_OP, BleKeyFlag.READ, null, false, false, 28, null);
    }

    @aa1
    public final String getFreeSizeDeviceStorage() {
        return this.freeSizeDeviceStorage;
    }

    @aa1
    public final AllAppStoreFragment getMAllAppStoreFragment() {
        AllAppStoreFragment r0 = this.mAllAppStoreFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mAllAppStoreFragment");
        return null;
    }

    @aa1
    public final List<AppStoreDataItem> getMAppStoreGameItem() {
        return this.mAppStoreGameItem;
    }

    @aa1
    public final List<AppStoreItemList> getMAppStoreItemList() {
        return this.mAppStoreItemList;
    }

    @aa1
    public final List<AppStoreDataItem> getMAppStoreToolItem() {
        return this.mAppStoreToolItem;
    }

    @aa1
    public final MyAppStoreFragment getMMyAppStoreFragment() {
        MyAppStoreFragment r0 = this.mMyAppStoreFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mMyAppStoreFragment");
        return null;
    }

    public final void getSDCardInfo() {
        if (q62.OXO1.XI1O1111i() == false) goto L6;
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.SDCARD_INFO, BleKeyFlag.READ, null, false, false, 28, null);
        return;
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @aa1
    public final String getTotalDeviceStorage() {
        return this.totalDeviceStorage;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        setMAllAppStoreFragment(new AllAppStoreFragment());
        setMMyAppStoreFragment(new MyAppStoreFragment());
        return CollectionsKt__CollectionsKt.iXiX011(new BaseJLFileManageFragment[]{getMAllAppStoreFragment(), getMMyAppStoreFragment()});
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.item_app_store_title));
        getTable().setBackgroundColor(gk4.iO(this, R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(getTiTle());
        getTable().setupWithViewPager(getMViewPager());
        getAppStoreList();
        getSDCardInfo();
        BleSDCardInfo r0 = (BleSDCardInfo) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.SDCARD_INFO, BleSDCardInfo.class, null, 4, null);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getMTotalSize() <= 0) goto L9;
        watchFreeSpaceToText(r0);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_app_store;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (BleInitializer.IO.i0X1iIO() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        super.onHandleBackPressed();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }

    public final void setFreeSizeDeviceStorage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.freeSizeDeviceStorage = r2;
    }

    public final void setMAllAppStoreFragment(@aa1 AllAppStoreFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAllAppStoreFragment = r2;
    }

    public final void setMMyAppStoreFragment(@aa1 MyAppStoreFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMyAppStoreFragment = r2;
    }

    public final void setTotalDeviceStorage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.totalDeviceStorage = r2;
    }

    public final void watchFreeSpaceToText(@tb1 BleSDCardInfo r13) {
        if (r13 == null) goto L5;
        long r2 = r13.getMFreeSize();
    L6:
        long r3 = r2 * 1024;
        if (r13 == null) goto L9;
        long r6 = r13.getMTotalSize();
    L10:
        long r7 = r6 * 1024;
        if (r7 > IXXOi1X0.i010I) goto L14;
        double r0 = 0.5d;
    L21:
        String r4 = ConvertUtils.byte2FitMemorySize((long) (((double) 1073741824) * r0), 0);
        StringCompanionObject r5 = StringCompanionObject.OXO1;
        String r1 = String.format("(%.0fGb)", Arrays.copyOf(new Object[]{Double.valueOf(r0 * ((double) 8))}, 1));
        Intrinsics.O10IXXX0X(r1, "format(...)");
        this.totalDeviceStorage = r4 + r1;
        String r14 = ConvertUtils.byte2FitMemorySize(r3, 0);
        Intrinsics.O10IXXX0X(r14, "byte2FitMemorySize(...)");
        this.freeSizeDeviceStorage = r14;
        return;
    L14:
        if (r7 > 1073741824) goto L16;
        r0 = 1.0d;
        goto L21
    L16:
        long r8 = 1073741824;
        if ((r7 % r8) != 0) goto L20;
        long r9 = r7 / r8;
    L19:
        r0 = r9;
        goto L21
    L20:
        r9 = (r7 / r8) + 1;
        goto L19
    L9:
        r6 = 0;
        goto L10
    L5:
        r2 = 0;
        goto L6
    }
}
