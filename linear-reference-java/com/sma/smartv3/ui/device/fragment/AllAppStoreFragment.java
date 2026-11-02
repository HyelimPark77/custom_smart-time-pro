package com.sma.smartv3.ui.device.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I0O1O1OO;
import com.android.mltcode.paycertificationapi.Ii0X00i11;
import com.android.mltcode.paycertificationapi.O1O1;
import com.android.mltcode.paycertificationapi.OOO11OI;
import com.android.mltcode.paycertificationapi.X1IOXI1;
import com.android.mltcode.paycertificationapi.XI001;
import com.android.mltcode.paycertificationapi.XiXOO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iX11Ii0O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.ironsource.C2985d4;
import com.sma.smartv3.model.AppStoreDataItem;
import com.sma.smartv3.model.AppStoreFileManager;
import com.sma.smartv3.model.AppStoreItemList;
import com.sma.smartv3.model.AppStoreItemType;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.AppStoreActivity;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAppFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAllAppStoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllAppStoreFragment.kt\ncom/sma/smartv3/ui/device/fragment/AllAppStoreFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1869#2,2:239\n1869#2,2:241\n*S KotlinDebug\n*F\n+ 1 AllAppStoreFragment.kt\ncom/sma/smartv3/ui/device/fragment/AllAppStoreFragment\n*L\n203#1:239,2\n222#1:241,2\n*E\n"})
public final class AllAppStoreFragment extends BaseJLFileManageFragment {

    @aa1
    private List<AppStoreItemList> mAppStoreItemList;

    @aa1
    private final Lazy mDeviceStorage$delegate;
    private int mHaveAppNumber;
    private final int mHaveAppNumberMax;
    private int mItemPosition;

    public AllAppStoreFragment() {
        this.mDeviceStorage$delegate = LazyKt__LazyJVMKt.iO(new Ii0X00i11(this));
        if (q62.OXO1.i000X() == false) goto L5;
        int r0 = 10;
    L6:
        this.mHaveAppNumberMax = r0;
        this.mAppStoreItemList = new ArrayList();
        return;
    L5:
        r0 = 8;
        goto L6
    }

    public static /* synthetic */ Unit I0iXXO(AppStoreItemList r0, AllAppStoreFragment r1, DslAdapterItem r2) {
        return showData$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ PFMedium I1XOi1(AllAppStoreFragment r0) {
        return mDeviceStorage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IO(AppStoreDataItem r0, AllAppStoreFragment r1, int r2, View r3) {
        showData$lambda$1$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit O10IXXX0X(AllAppStoreFragment r0, DslAdapter r1) {
        return syncAdapterData$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit OIX0iXi(AppStoreItemList r0, AllAppStoreFragment r1, View r2) {
        return showData$lambda$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit X0O(AppStoreItemList r0, AllAppStoreFragment r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showData$lambda$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit X1ii(AppStoreDataItem r0, AllAppStoreFragment r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showData$lambda$1$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit XXI(AppStoreItemList r0, AppStoreDataItem r1, AllAppStoreFragment r2, DslAdapterItem r3) {
        return showData$lambda$1(r0, r1, r2, r3);
    }

    private static final PFMedium mDeviceStorage_delegate$lambda$0(AllAppStoreFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.storage_device);
    }

    public static /* synthetic */ void setDeviceStorage$default(AllAppStoreFragment r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        FragmentActivity r6 = r1.getActivity();
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type com.sma.smartv3.ui.device.AppStoreActivity");
        r2 = ((AppStoreActivity) r6).getTotalDeviceStorage();
    L6:
        if ((r4 & 2) == 0) goto L8;
        FragmentActivity r7 = r1.getActivity();
        Intrinsics.X1ii(r7, "null cannot be cast to non-null type com.sma.smartv3.ui.device.AppStoreActivity");
        r3 = ((AppStoreActivity) r7).getFreeSizeDeviceStorage();
    L8:
        r1.setDeviceStorage(r2, r3);
    }

    private final void showData() {
        getDslAdapter().resetItem(new ArrayList());
        Iterator<AppStoreItemList> r0 = this.mAppStoreItemList.iterator();
    L4:
        if (r0.hasNext() == false) goto L16;
        final AppStoreItemList r1 = r0.next();
        if (r1.getList().isEmpty() == true) goto L8;
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_app_store_title_name, new OOO11OI(r1, this));
    L8:
        getCurHaveAppNumber();
        if (r1.isShowAll() == false) goto L11;
        List<AppStoreDataItem> r2 = CollectionsKt___CollectionsKt.IO0OOi(r1.getList(), 5);
    L12:
        Iterator<AppStoreDataItem> r3 = r2.iterator();
    L14:
        if (r3.hasNext() == false) goto L4;
        final AppStoreDataItem r4 = r3.next();
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_app_store, new XI001(r1, r4, this));
        goto L14
    L11:
        r2 = r1.getList();
        goto L12
    }

    private static final Unit showData$lambda$0(final AppStoreItemList r1, final AllAppStoreFragment r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemIsGroupHead(true);
        r3.setItemIsHover(false);
        r3.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getTypeName()}));
        r3.setItemBindOverride(new XiXOO(r1, r2));
        r3.setItemTag(r1.getTypeName());
        r3.setItemClick(new X1IOXI1(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(AppStoreItemList r0, AllAppStoreFragment r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tv_name);
        if (r6 == null) goto L5;
        r6.setText(r0.getTypeName());
    L5:
        TextView r7 = r2.tv(R.id.app_store_more_tv);
        if (r7 != null) goto L8;
    L12:
        if (r7 == null) goto L19;
        if (r0.getList().size() <= 5) goto L16;
        int r8 = 0;
    L17:
        r7.setVisibility(r8);
        goto L19
    L16:
        r8 = 8;
    L19:
        return Unit.OXO1;
    L8:
        if (r0.isShowAll() == false) goto L10;
        String r9 = r1.getString(R.string.app_store_list_tip_expand);
    L11:
        r7.setText(r9);
        goto L12
    L10:
        r9 = r1.getString(R.string.app_store_list_tip_retract);
        goto L11
    }

    private static final Unit showData$lambda$0$1(AppStoreItemList r1, AllAppStoreFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r1.setShowAll(!r1.isShowAll());
        r2.syncAdapterData();
        r2.getDslAdapter().notifyDataChanged();
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$1(AppStoreItemList r1, final AppStoreDataItem r2, final AllAppStoreFragment r3, DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getTypeName()}));
        r4.setItemBindOverride(new O1O1(r2, r3));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$1$0(final AppStoreDataItem r2, final AllAppStoreFragment r3, DslViewHolder r4, final int r5, DslAdapterItem r6, List r7) {
        Intrinsics.X0O(r4, "itemHolder");
        Intrinsics.X0O(r6, "adapterItem");
        Intrinsics.X0O(r7, "payloads");
        ImageView r8 = r4.img(R.id.iv);
        if (r2.getPath() == (-1)) goto L7;
        if (r8 == null) goto L10;
        r8.setImageResource(r2.getPath());
    L10:
        ImageView r9 = r4.img(R.id.iv_new_icon);
        boolean r10 = false;
        if (r9 != null) goto L13;
    L17:
        TextView r11 = r4.tv(R.id.tv_name);
        if (r11 == null) goto L20;
        r11.setText(r2.getBleAppInfo().getMName());
    L20:
        TextView r12 = r4.tv(R.id.tv_size);
        if (r12 == null) goto L23;
        r12.setText(r2.getBleAppInfo().getMSize() + "kb");
    L23:
        TextView r13 = (TextView) r4.v(R.id.tv_btn);
        if (r13 == null) goto L33;
        int r14 = r2.getAppStoreType();
        if (r14 != AppStoreItemType.INSTALL.getType()) goto L29;
        String r15 = r3.getString(R.string.app_store_install);
    L32:
        r13.setText(r15);
        goto L33
    L29:
        if (r14 != AppStoreItemType.INSTALLED.getType()) goto L31;
        r15 = r3.getString(R.string.app_store_installed);
        goto L32
    L31:
        r15 = r3.getString(R.string.app_store_item_renew);
    L33:
        if (r13 != null) goto L35;
    L38:
        if (r13 == null) goto L41;
        r13.setOnClickListener(new iX11Ii0O(r2, r3, r5));
    L41:
        return Unit.OXO1;
    L35:
        if (r2.getAppStoreType() == AppStoreItemType.INSTALLED.getType()) goto L37;
        r10 = true;
    L37:
        r13.setEnabled(r10);
        goto L38
    L13:
        if (r2.isShowNewFlag() == false) goto L15;
        int r0 = 0;
    L16:
        r9.setVisibility(r0);
        goto L17
    L15:
        r0 = 8;
        goto L16
    L7:
        if (r2.getOnlinePath().length() <= 0) goto L10;
        if (r8 == null) goto L10;
        Glide.with(r8.getContext()).load(r2.getOnlinePath()).error(R.drawable.audiobook_normal_icon).into(r8);
        goto L10
    }

    private static final void showData$lambda$1$0$0(AppStoreDataItem r9, AllAppStoreFragment r10, int r11, View r12) {
        int r13 = r9.getAppStoreType();
        AppStoreItemType r0 = AppStoreItemType.INSTALL;
        if (r13 == r0.getType()) goto L12;
        if (r13 == AppStoreItemType.RENEW.getType()) goto L12;
        if (r13 != AppStoreItemType.NOT_RENEW.getType()) goto L35;
        ToastUtils.showLong(r10.getString(R.string.app_store_item_not_renew_tip), new Object[0]);
        return;
    L35:
        return;
    L12:
        if (r0.getType() == r9.getAppStoreType()) goto L14;
    L17:
        r10.syncData();
        int r14 = 1;
        r10.setSync(true);
        r10.mItemPosition = r11;
        if (r9.getPath() == (-1)) goto L24;
        BleConnector r15 = BleConnector.INSTANCE;
        BleKey r16 = BleKey.APP_FILE;
        String r4 = r9.getBleAppInfo().getMPackage();
        if (AppStoreItemType.RENEW.getType() != r9.getAppStoreType()) goto L22;
        int r5 = 1;
    L23:
        r15.sendStream(r16, new BleAppFile(r4, r5, null, 4, null).toByteArray(), 2);
    L33:
        r9.getBleAppInfo().setMHide(0);
        r9.setAppStoreType(AppStoreItemType.INSTALLED.getType());
        return;
    L22:
        r5 = 0;
        goto L23
    L24:
        r10.setNeedToDownloadFile(true);
        AppStoreFileManager r17 = AppStoreFileManager.INSTANCE;
        String r18 = r9.getBinOnlinePath();
        String r1 = r9.getBleAppInfo().getMPackage();
        if (r9.getBleAppInfo().getMIsGame() != 1) goto L27;
        int r2 = 0;
    L29:
        if (AppStoreItemType.RENEW.getType() == r9.getAppStoreType()) goto L32;
        r14 = 0;
    L32:
        r17.downloadAppFile(r18, r1, r2, r14);
        goto L33
    L27:
        r2 = 1;
        goto L29
    L14:
        if (r10.mHaveAppNumber < r10.mHaveAppNumberMax) goto L17;
        ToastUtils.showLong(r10.getString(R.string.app_store_excess_tip), new Object[0]);
    }

    private static final Unit syncAdapterData$lambda$0(AllAppStoreFragment r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r4, 0, null, 2, null);
        r3.showData();
        return Unit.OXO1;
    }

    @sf5(tag = "add_app_store_success")
    public final void addAppStoreSuccess(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        getCurHaveAppNumber();
        getDslAdapter().notifyItemChanged(this.mItemPosition);
    }

    public final void getCurHaveAppNumber() {
        this.mHaveAppNumber = 0;
        Iterator<T> r0 = this.mAppStoreItemList.iterator();
    L4:
        if (r0.hasNext() == false) goto L11;
        Iterator<AppStoreDataItem> r1 = ((AppStoreItemList) r0.next()).getList().iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        if (r1.next().getAppStoreType() != AppStoreItemType.INSTALLED.getType()) goto L7;
        this.mHaveAppNumber++;
        goto L7
    }

    @aa1
    public final List<AppStoreItemList> getMAppStoreItemList() {
        return this.mAppStoreItemList;
    }

    public final PFMedium getMDeviceStorage() {
        return (PFMedium) getValue();
    }

    public final int getMHaveAppNumber() {
        return this.mHaveAppNumber;
    }

    public final int getMHaveAppNumberMax() {
        return this.mHaveAppNumberMax;
    }

    public final int getMItemPosition() {
        return this.mItemPosition;
    }

    @Override // com.sma.smartv3.ui.device.fragment.BaseJLFileManageFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_all_app_store;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getMActivity()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        setDeviceStorage$default(this, null, null, 3, null);
    }

    @Override // com.sma.smartv3.ui.device.fragment.BaseJLFileManageFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.sma.smartv3.ui.device.fragment.BaseJLFileManageFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setDeviceStorage(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, C2985d4.i.l);
        Intrinsics.X0O(r4, "surplus");
        if (q62.OXO1.XI1O1111i() == false) goto L8;
        PFMedium r0 = getMDeviceStorage();
        if (r0 == null) goto L9;
        r0.setText(getString(R.string.app_store_title_tip_2, new Object[]{r3, r4}));
        return;
    L9:
        return;
    }

    public final void setMAppStoreItemList(@aa1 List<AppStoreItemList> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAppStoreItemList = r2;
    }

    public final void setMHaveAppNumber(int r1) {
        this.mHaveAppNumber = r1;
    }

    public final void setMItemPosition(int r1) {
        this.mItemPosition = r1;
    }

    public final void syncAdapterData() {
        renderAdapter(new I0O1O1OO(this));
    }

    public final void upData(@aa1 List<AppStoreItemList> r2) {
        Intrinsics.X0O(r2, "list");
        this.mAppStoreItemList = r2;
        syncAdapterData();
    }

    @sf5(tag = "updata_app_store_success")
    public final void upDataAppStoreSuccess(@aa1 String r5) {
        Intrinsics.X0O(r5, "data");
        Iterator<T> r0 = this.mAppStoreItemList.iterator();
    L4:
        if (r0.hasNext() == false) goto L11;
        Iterator<AppStoreDataItem> r1 = ((AppStoreItemList) r0.next()).getList().iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        AppStoreDataItem r2 = r1.next();
        if (Intrinsics.XOO0ii0(r2.getBleAppInfo().getMPackage(), r5) == false) goto L7;
        r2.getBleAppInfo().setMHide(1);
        r2.setAppStoreType(AppStoreItemType.INSTALL.getType());
        goto L4
    L11:
        getDslAdapter().clearAllItems();
        showData();
        getCurHaveAppNumber();
        getDslAdapter().notifyDataChanged();
    }
}
