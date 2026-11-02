package com.sma.smartv3.p610ui.device.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.AppStoreDataItem;
import com.sma.smartv3.model.AppStoreFileManager;
import com.sma.smartv3.model.AppStoreItemList;
import com.sma.smartv3.model.AppStoreItemType;
import com.sma.smartv3.p610ui.device.AppStoreActivity;
import com.sma.smartv3.p610ui.device.fragment.AllAppStoreFragment;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAllAppStoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllAppStoreFragment.kt\ncom/sma/smartv3/ui/device/fragment/AllAppStoreFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1869#2,2:239\n1869#2,2:241\n*S KotlinDebug\n*F\n+ 1 AllAppStoreFragment.kt\ncom/sma/smartv3/ui/device/fragment/AllAppStoreFragment\n*L\n203#1:239,2\n222#1:241,2\n*E\n"})
public final class AllAppStoreFragment extends BaseJLFileManageFragment {

    @aa1
    private List<AppStoreItemList> mAppStoreItemList;

    @aa1
    private final Lazy mDeviceStorage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii0X00i11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AllAppStoreFragment.mDeviceStorage_delegate$lambda$0(this.f2180IO);
        }
    });
    private int mHaveAppNumber;
    private final int mHaveAppNumberMax;
    private int mItemPosition;

    public AllAppStoreFragment() {
        this.mHaveAppNumberMax = q62.OXO1.i000X() ? 10 : 8;
        this.mAppStoreItemList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mDeviceStorage_delegate$lambda$0(AllAppStoreFragment allAppStoreFragment) {
        return (PFMedium) allAppStoreFragment.getMView().findViewById(R.id.storage_device);
    }

    public static /* synthetic */ void setDeviceStorage$default(AllAppStoreFragment allAppStoreFragment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            FragmentActivity activity = allAppStoreFragment.getActivity();
            Intrinsics.X1ii(activity, "null cannot be cast to non-null type com.sma.smartv3.ui.device.AppStoreActivity");
            str = ((AppStoreActivity) activity).getTotalDeviceStorage();
        }
        if ((i & 2) != 0) {
            FragmentActivity activity2 = allAppStoreFragment.getActivity();
            Intrinsics.X1ii(activity2, "null cannot be cast to non-null type com.sma.smartv3.ui.device.AppStoreActivity");
            str2 = ((AppStoreActivity) activity2).getFreeSizeDeviceStorage();
        }
        allAppStoreFragment.setDeviceStorage(str, str2);
    }

    private final void showData() {
        getDslAdapter().resetItem(new ArrayList());
        for (final AppStoreItemList appStoreItemList : this.mAppStoreItemList) {
            if (!appStoreItemList.getList().isEmpty()) {
                DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_app_store_title_name, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOO11OI
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AllAppStoreFragment.showData$lambda$0(appStoreItemList, this, (DslAdapterItem) obj);
                    }
                });
            }
            getCurHaveAppNumber();
            for (final AppStoreDataItem appStoreDataItem : appStoreItemList.isShowAll() ? CollectionsKt___CollectionsKt.IO0OOi(appStoreItemList.getList(), 5) : appStoreItemList.getList()) {
                DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_app_store, new Function1() { // from class: com.android.mltcode.paycertificationapi.XI001
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AllAppStoreFragment.showData$lambda$1(appStoreItemList, appStoreDataItem, this, (DslAdapterItem) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final AppStoreItemList appStoreItemList, final AllAppStoreFragment allAppStoreFragment, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsGroupHead(true);
        dslItem.setItemIsHover(false);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(appStoreItemList.getTypeName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.XiXOO
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AllAppStoreFragment.showData$lambda$0$0(appStoreItemList, allAppStoreFragment, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag(appStoreItemList.getTypeName());
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X1IOXI1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AllAppStoreFragment.showData$lambda$0$1(appStoreItemList, allAppStoreFragment, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(AppStoreItemList appStoreItemList, AllAppStoreFragment allAppStoreFragment, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_name);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(appStoreItemList.getTypeName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.app_store_more_tv);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(appStoreItemList.isShowAll() ? allAppStoreFragment.getString(R.string.app_store_list_tip_expand) : allAppStoreFragment.getString(R.string.app_store_list_tip_retract));
        }
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setVisibility(appStoreItemList.getList().size() > 5 ? 0 : 8);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$1(AppStoreItemList appStoreItemList, AllAppStoreFragment allAppStoreFragment, View it) {
        Intrinsics.X0O(it, "it");
        appStoreItemList.setShowAll(!appStoreItemList.isShowAll());
        allAppStoreFragment.syncAdapterData();
        allAppStoreFragment.getDslAdapter().notifyDataChanged();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$1(AppStoreItemList appStoreItemList, final AppStoreDataItem appStoreDataItem, final AllAppStoreFragment allAppStoreFragment, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(appStoreItemList.getTypeName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.O1O1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AllAppStoreFragment.showData$lambda$1$0(appStoreDataItem, allAppStoreFragment, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$1$0(final AppStoreDataItem appStoreDataItem, final AllAppStoreFragment allAppStoreFragment, DslViewHolder itemHolder, final int i, DslAdapterItem adapterItem, List payloads) {
        String string;
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(payloads, "payloads");
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (appStoreDataItem.getPath() != -1) {
            if (imageViewImg != null) {
                imageViewImg.setImageResource(appStoreDataItem.getPath());
            }
        } else if (appStoreDataItem.getOnlinePath().length() > 0 && imageViewImg != null) {
            Glide.with(imageViewImg.getContext()).load(appStoreDataItem.getOnlinePath()).error(R.drawable.audiobook_normal_icon).into(imageViewImg);
        }
        ImageView imageViewImg2 = itemHolder.img(R.id.iv_new_icon);
        if (imageViewImg2 != null) {
            imageViewImg2.setVisibility(appStoreDataItem.isShowNewFlag() ? 0 : 8);
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_name);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(appStoreDataItem.getBleAppInfo().getMName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_size);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(appStoreDataItem.getBleAppInfo().getMSize() + "kb");
        }
        TextView textView = (TextView) itemHolder.m3483v(R.id.tv_btn);
        if (textView != null) {
            int appStoreType = appStoreDataItem.getAppStoreType();
            if (appStoreType == AppStoreItemType.INSTALL.getType()) {
                string = allAppStoreFragment.getString(R.string.app_store_install);
            } else {
                string = appStoreType == AppStoreItemType.INSTALLED.getType() ? allAppStoreFragment.getString(R.string.app_store_installed) : allAppStoreFragment.getString(R.string.app_store_item_renew);
            }
            textView.setText(string);
        }
        if (textView != null) {
            textView.setEnabled(appStoreDataItem.getAppStoreType() != AppStoreItemType.INSTALLED.getType());
        }
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iX11Ii0O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AllAppStoreFragment.showData$lambda$1$0$0(appStoreDataItem, allAppStoreFragment, i, view);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showData$lambda$1$0$0(AppStoreDataItem appStoreDataItem, AllAppStoreFragment allAppStoreFragment, int i, View view) {
        int appStoreType = appStoreDataItem.getAppStoreType();
        AppStoreItemType appStoreItemType = AppStoreItemType.INSTALL;
        if (appStoreType != appStoreItemType.getType() && appStoreType != AppStoreItemType.RENEW.getType()) {
            if (appStoreType == AppStoreItemType.NOT_RENEW.getType()) {
                ToastUtils.showLong(allAppStoreFragment.getString(R.string.app_store_item_not_renew_tip), new Object[0]);
            }
        } else {
            if (appStoreItemType.getType() == appStoreDataItem.getAppStoreType() && allAppStoreFragment.mHaveAppNumber >= allAppStoreFragment.mHaveAppNumberMax) {
                ToastUtils.showLong(allAppStoreFragment.getString(R.string.app_store_excess_tip), new Object[0]);
                return;
            }
            allAppStoreFragment.syncData();
            allAppStoreFragment.setSync(true);
            allAppStoreFragment.mItemPosition = i;
            if (appStoreDataItem.getPath() != -1) {
                BleConnector.INSTANCE.sendStream(BleKey.APP_FILE, new BleAppFile(appStoreDataItem.getBleAppInfo().getMPackage(), AppStoreItemType.RENEW.getType() == appStoreDataItem.getAppStoreType() ? 1 : 0, null, 4, null).toByteArray(), 2);
            } else {
                allAppStoreFragment.setNeedToDownloadFile(true);
                AppStoreFileManager.INSTANCE.downloadAppFile(appStoreDataItem.getBinOnlinePath(), appStoreDataItem.getBleAppInfo().getMPackage(), appStoreDataItem.getBleAppInfo().getMIsGame() == 1 ? 0 : 1, AppStoreItemType.RENEW.getType() != appStoreDataItem.getAppStoreType() ? 0 : 1);
            }
            appStoreDataItem.getBleAppInfo().setMHide(0);
            appStoreDataItem.setAppStoreType(AppStoreItemType.INSTALLED.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncAdapterData$lambda$0(AllAppStoreFragment allAppStoreFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        allAppStoreFragment.showData();
        return Unit.OXO1;
    }

    @sf5(tag = "add_app_store_success")
    public final void addAppStoreSuccess(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        getCurHaveAppNumber();
        getDslAdapter().notifyItemChanged(this.mItemPosition);
    }

    public final void getCurHaveAppNumber() {
        this.mHaveAppNumber = 0;
        Iterator<T> it = this.mAppStoreItemList.iterator();
        while (it.hasNext()) {
            Iterator<AppStoreDataItem> it2 = ((AppStoreItemList) it.next()).getList().iterator();
            while (it2.hasNext()) {
                if (it2.next().getAppStoreType() == AppStoreItemType.INSTALLED.getType()) {
                    this.mHaveAppNumber++;
                }
            }
        }
    }

    @aa1
    public final List<AppStoreItemList> getMAppStoreItemList() {
        return this.mAppStoreItemList;
    }

    public final PFMedium getMDeviceStorage() {
        return (PFMedium) this.mDeviceStorage$delegate.getValue();
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

    @Override // com.sma.smartv3.p610ui.device.fragment.BaseJLFileManageFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
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

    @Override // com.sma.smartv3.p610ui.device.fragment.BaseJLFileManageFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.sma.smartv3.p610ui.device.fragment.BaseJLFileManageFragment, com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setDeviceStorage(@aa1 String total, @aa1 String surplus) {
        PFMedium mDeviceStorage;
        Intrinsics.X0O(total, "total");
        Intrinsics.X0O(surplus, "surplus");
        if (!q62.OXO1.XI1O1111i() || (mDeviceStorage = getMDeviceStorage()) == null) {
            return;
        }
        mDeviceStorage.setText(getString(R.string.app_store_title_tip_2, total, surplus));
    }

    public final void setMAppStoreItemList(@aa1 List<AppStoreItemList> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAppStoreItemList = list;
    }

    public final void setMHaveAppNumber(int i) {
        this.mHaveAppNumber = i;
    }

    public final void setMItemPosition(int i) {
        this.mItemPosition = i;
    }

    public final void syncAdapterData() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0O1O1OO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AllAppStoreFragment.syncAdapterData$lambda$0(this.f1152IO, (DslAdapter) obj);
            }
        });
    }

    public final void upData(@aa1 List<AppStoreItemList> list) {
        Intrinsics.X0O(list, "list");
        this.mAppStoreItemList = list;
        syncAdapterData();
    }

    @sf5(tag = "updata_app_store_success")
    public final void upDataAppStoreSuccess(@aa1 String data) {
        Intrinsics.X0O(data, "data");
        Iterator<T> it = this.mAppStoreItemList.iterator();
        while (it.hasNext()) {
            for (AppStoreDataItem appStoreDataItem : ((AppStoreItemList) it.next()).getList()) {
                if (Intrinsics.XOO0ii0(appStoreDataItem.getBleAppInfo().getMPackage(), data)) {
                    appStoreDataItem.getBleAppInfo().setMHide(1);
                    appStoreDataItem.setAppStoreType(AppStoreItemType.INSTALL.getType());
                    break;
                }
            }
        }
        getDslAdapter().clearAllItems();
        showData();
        getCurHaveAppNumber();
        getDslAdapter().notifyDataChanged();
    }
}
