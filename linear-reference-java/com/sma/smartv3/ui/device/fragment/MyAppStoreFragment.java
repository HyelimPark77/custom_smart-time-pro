package com.sma.smartv3.ui.device.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.az0;
import com.android.mltcode.paycertificationapi.bz0;
import com.android.mltcode.paycertificationapi.cz0;
import com.android.mltcode.paycertificationapi.dz0;
import com.android.mltcode.paycertificationapi.ez0;
import com.android.mltcode.paycertificationapi.fz0;
import com.android.mltcode.paycertificationapi.gz0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.vy0;
import com.android.mltcode.paycertificationapi.wy0;
import com.android.mltcode.paycertificationapi.xy0;
import com.android.mltcode.paycertificationapi.yy0;
import com.android.mltcode.paycertificationapi.zy0;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.blankj.utilcode.util.LogUtils;
import com.bumptech.glide.Glide;
import com.ironsource.C2985d4;
import com.sma.smartv3.model.AppStoreDataItem;
import com.sma.smartv3.model.AppStoreItemList;
import com.sma.smartv3.model.FileTransmissionKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.AppStoreActivity;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAppOp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MyAppStoreFragment extends BaseJLFileManageFragment {
    private int mAppNumber;

    @aa1
    private List<AppStoreItemList> mAppStoreItemList;

    @aa1
    private final Lazy mDeviceStorage$delegate;

    @aa1
    private final Lazy mEmptyLayout$delegate;

    @aa1
    private String mItemPositionPackageName;

    public MyAppStoreFragment() {
        this.mDeviceStorage$delegate = LazyKt__LazyJVMKt.iO(new cz0(this));
        this.mEmptyLayout$delegate = LazyKt__LazyJVMKt.iO(new dz0(this));
        this.mAppStoreItemList = new ArrayList();
        this.mItemPositionPackageName = "";
    }

    public static /* synthetic */ boolean I0iXXO(DslViewHolder r0, View r1, MotionEvent r2) {
        return showData$lambda$1$0$1$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1XOi1(MyAppStoreFragment r0, AppStoreItemList r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showData$lambda$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit IIX1OXO(AppStoreDataItem r0, MyAppStoreFragment r1, DslAdapterItem r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        return showData$lambda$1$0(r0, r1, r2, r3, r4, r5, r6);
    }

    public static /* synthetic */ Unit IO(MyAppStoreFragment r0) {
        return upData$lambda$0(r0);
    }

    public static /* synthetic */ void O10IXXX0X(MyAppStoreFragment r0, AppStoreDataItem r1, DslAdapterItem r2, View r3) {
        showData$lambda$1$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit OIX0iXi(MyAppStoreFragment r0, DslAdapter r1) {
        return upData$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ PFMedium X0O(MyAppStoreFragment r0) {
        return mDeviceStorage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(View r0) {
        return showData$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit XX0(AppStoreItemList r0, AppStoreDataItem r1, MyAppStoreFragment r2, DslAdapterItem r3) {
        return showData$lambda$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ View XXI(MyAppStoreFragment r0) {
        return mEmptyLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(AppStoreItemList r0, MyAppStoreFragment r1, DslAdapterItem r2) {
        return showData$lambda$0(r0, r1, r2);
    }

    private final boolean getIsShowHeader(List<AppStoreDataItem> r2) {
        Iterator<AppStoreDataItem> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        if (OiOX0i.XIi00iiXO(r3.next().getBleAppInfo().getMHide()) == true) goto L4;
        return true;
    L9:
        return false;
    }

    public static /* synthetic */ Unit iIiiO(DslAdapterItem r0, View r1) {
        return showData$lambda$1$1(r0, r1);
    }

    private static final PFMedium mDeviceStorage_delegate$lambda$0(MyAppStoreFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.storage_device);
    }

    private static final View mEmptyLayout_delegate$lambda$0(MyAppStoreFragment r1) {
        return r1.getMView().findViewById(R.id.app_store_empty_layout);
    }

    public static /* synthetic */ void setDeviceStorage$default(MyAppStoreFragment r1, String r2, String r3, int r4, Object r5) {
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

    private static final Unit showData$lambda$0(final AppStoreItemList r1, final MyAppStoreFragment r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemIsGroupHead(true);
        r3.setItemIsHover(false);
        r3.setItemSwipeMenuEnable(false);
        r3.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getTypeName()}));
        r3.setItemBindOverride(new vy0(r2, r1));
        r3.setItemTag(r1.getTypeName());
        r3.setItemClick(new yy0());
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(MyAppStoreFragment r1, AppStoreItemList r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "<unused var>");
        Intrinsics.X0O(r6, "<unused var>");
        View r7 = r3.itemView;
        int r8 = OXI1i1.XIi00iiXO(r1.getContext(), 8.0f);
        int r9 = OXI1i1.XIi00iiXO(r1.getContext(), 8.0f);
        int r0 = 0;
        r7.setPadding(0, r8, 0, r9);
        TextView r10 = r3.tv(R.id.tv_name);
        if (r10 == null) goto L5;
        r10.setText(r2.getTypeName());
    L5:
        TextView r11 = r3.tv(R.id.app_store_more_tv);
        if (r11 != null) goto L8;
    L12:
        if (r11 == null) goto L19;
        if (r2.getList().size() > 5) goto L17;
        r0 = 4;
    L17:
        r11.setVisibility(r0);
    L19:
        return Unit.OXO1;
    L8:
        if (r2.isShowAll() == false) goto L10;
        String r12 = r1.getString(R.string.app_store_list_tip_expand);
    L11:
        r11.setText(r12);
        goto L12
    L10:
        r12 = r1.getString(R.string.app_store_list_tip_retract);
        goto L11
    }

    private static final Unit showData$lambda$0$1(View r1) {
        Intrinsics.X0O(r1, "it");
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$1(AppStoreItemList r1, final AppStoreDataItem r2, final MyAppStoreFragment r3, final DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemSwipeMenuFlag(4);
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getTypeName()}));
        r4.setItemBindOverride(new zy0(r2, r3, r4));
        r4.setItemClick(new az0(r4));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$1$0(final AppStoreDataItem r1, final MyAppStoreFragment r2, final DslAdapterItem r3, final DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        Intrinsics.X0O(r4, "itemHolder");
        Intrinsics.X0O(r6, "adapterItem");
        Intrinsics.X0O(r7, "payloads");
        ImageView r8 = r4.img(R.id.iv);
        if (r1.getPath() == (-1)) goto L7;
        if (r8 == null) goto L10;
        r8.setImageResource(r1.getPath());
    L10:
        ImageView r9 = r4.img(R.id.iv_new_icon);
        if (r9 != null) goto L13;
    L17:
        TextView r10 = r4.tv(R.id.tv_name);
        if (r10 == null) goto L20;
        r10.setText(r1.getBleAppInfo().getMName());
    L20:
        TextView r11 = r4.tv(R.id.tv_size);
        if (r11 == null) goto L23;
        r11.setText(r1.getBleAppInfo().getMSize() + "kb");
    L23:
        TextView r12 = r4.tv(R.id.tv_btn);
        if (r12 == null) goto L26;
        r12.setText(r2.getString(R.string.app_store_installed));
    L26:
        TextView r13 = r4.tv(R.id.tv_btn);
        if (r13 == null) goto L29;
        r13.setEnabled(false);
    L29:
        r4.click(R.id.bt_delete_record, new fz0(r2, r1, r3));
        View r14 = r4.view(R.id.ll_item_panel);
        if (r14 == null) goto L33;
        r14.setOnTouchListener(new gz0(r4));
    L33:
        return Unit.OXO1;
    L13:
        if (r1.isShowNewFlag() == false) goto L15;
        int r15 = 0;
    L16:
        r9.setVisibility(r15);
        goto L17
    L15:
        r15 = 8;
        goto L16
    L7:
        if (r1.getOnlinePath().length() <= 0) goto L10;
        if (r8 == null) goto L10;
        Glide.with(r8.getContext()).load(r1.getOnlinePath()).error(R.drawable.audiobook_normal_icon).into(r8);
        goto L10
    }

    private static final void showData$lambda$1$0$0(MyAppStoreFragment r2, AppStoreDataItem r3, DslAdapterItem r4, View r5) {
        r2.mItemPositionPackageName = r3.getBleAppInfo().getMPackage();
        r3.getBleAppInfo().setMHide(1);
        r2.showDeleteTipPopup(R.string.audio_book_delete_pop_title, R.string.app_store_delete_pop_content, R.string.audio_book_delete_pop_sure);
        DslAdapter r6 = r4.getItemDslAdapter();
        if (r6 == null) goto L6;
        DslAdapter.updateItemDepend$default(r6, null, 1, null);
        return;
    }

    private static final boolean showData$lambda$1$0$1$0(DslViewHolder r0, View r1, MotionEvent r2) {
        return r0.itemView.onTouchEvent(r2);
    }

    private static final Unit showData$lambda$1$1(DslAdapterItem r1, View r2) {
        Intrinsics.X0O(r2, "view");
        SwipeMenuHelper r3 = r1.get_itemSwipeMenuHelper();
        if (r3 == null) goto L6;
        SwipeMenuHelper.closeSwipeMenu$default(r3, null, 1, null);
    L6:
        return Unit.OXO1;
    }

    private static final Unit upData$lambda$0(final MyAppStoreFragment r1) {
        r1.renderAdapter(new bz0(r1));
        return Unit.OXO1;
    }

    private static final Unit upData$lambda$0$0(MyAppStoreFragment r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r4, 0, null, 2, null);
        r3.showData();
        return Unit.OXO1;
    }

    @sf5(tag = "add_app_store_success")
    public final void addAppStoreSuccess(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        getDslAdapter().clearAllItems();
        getDslAdapter().notifyDataChanged();
        showData();
        getDslAdapter().notifyDataChanged();
    }

    @Override // com.sma.smartv3.ui.device.fragment.BaseJLFileManageFragment
    public void confirmDeleteFile() {
        super.confirmDeleteFile();
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.APP_OP, BleKeyFlag.UPDATE, new BleAppOp(0, this.mItemPositionPackageName, 0, 4, null), false, false, 24, null);
        FileTransmissionKt.changAppStoreCurrentCategory(this.mItemPositionPackageName);
        I01XX0.OXO1("updata_app_store_success", this.mItemPositionPackageName);
        getDslAdapter().clearAllItems();
        showData();
        getDslAdapter().notifyDataChanged();
    }

    public final int getMAppNumber() {
        return this.mAppNumber;
    }

    @aa1
    public final List<AppStoreItemList> getMAppStoreItemList() {
        return this.mAppStoreItemList;
    }

    public final PFMedium getMDeviceStorage() {
        return (PFMedium) getValue();
    }

    public final View getMEmptyLayout() {
        return (View) getValue();
    }

    @aa1
    public final String getMItemPositionPackageName() {
        return this.mItemPositionPackageName;
    }

    @Override // com.sma.smartv3.ui.device.fragment.BaseJLFileManageFragment, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.device.fragment.BaseJLFileManageFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_my_app_store;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getMActivity()));
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
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

    public final void setMAppNumber(int r1) {
        this.mAppNumber = r1;
    }

    public final void setMAppStoreItemList(@aa1 List<AppStoreItemList> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAppStoreItemList = r2;
    }

    public final void setMItemPositionPackageName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mItemPositionPackageName = r2;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void showData() {
        getDslAdapter().resetItem(new ArrayList());
        int r0 = 0;
        this.mAppNumber = 0;
        Iterator<AppStoreItemList> r1 = this.mAppStoreItemList.iterator();
    L4:
        if (r1.hasNext() == false) goto L20;
        final AppStoreItemList r2 = r1.next();
        if (r2.getList().isEmpty() == true) goto L11;
        if (getIsShowHeader(r2.getList()) == false) goto L11;
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_app_store_title_name, new wy0(r2, this));
    L11:
        if (r2.isShowAll() == false) goto L13;
        List<AppStoreDataItem> r3 = CollectionsKt___CollectionsKt.IO0OOi(r2.getList(), 5);
    L14:
        LogUtils.i(new Object[]{"category.listFor" + r3.size()});
        Iterator<AppStoreDataItem> r4 = r3.iterator();
    L16:
        if (r4.hasNext() == false) goto L4;
        final AppStoreDataItem r5 = r4.next();
        if (OiOX0i.XIi00iiXO(r5.getBleAppInfo().getMHide()) == true) goto L16;
        this.mAppNumber++;
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_app_store, new xy0(r2, r5, this));
        goto L16
    L13:
        r3 = r2.getList();
        goto L14
    L20:
        View r6 = getMEmptyLayout();
        if (this.mAppNumber == 0) goto L24;
        r0 = 8;
    L24:
        r6.setVisibility(r0);
    }

    public final void upData(@aa1 List<AppStoreItemList> r4) {
        Intrinsics.X0O(r4, "list");
        this.mAppStoreItemList = r4;
        getDslViewHolder().postDelay(300, new ez0(this));
    }
}
