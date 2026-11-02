package com.sma.smartv3.p610ui.device.fragment;

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
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.blankj.utilcode.util.LogUtils;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.AppStoreDataItem;
import com.sma.smartv3.model.AppStoreItemList;
import com.sma.smartv3.model.FileTransmissionKt;
import com.sma.smartv3.p610ui.device.AppStoreActivity;
import com.sma.smartv3.p610ui.device.fragment.MyAppStoreFragment;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MyAppStoreFragment extends BaseJLFileManageFragment {
    private int mAppNumber;

    @aa1
    private final Lazy mDeviceStorage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cz0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MyAppStoreFragment.mDeviceStorage_delegate$lambda$0(this.f6086IO);
        }
    });

    @aa1
    private final Lazy mEmptyLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dz0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MyAppStoreFragment.mEmptyLayout_delegate$lambda$0(this.f6301IO);
        }
    });

    @aa1
    private List<AppStoreItemList> mAppStoreItemList = new ArrayList();

    @aa1
    private String mItemPositionPackageName = "";

    private final boolean getIsShowHeader(List<AppStoreDataItem> list) {
        Iterator<AppStoreDataItem> it = list.iterator();
        while (it.hasNext()) {
            if (!OiOX0i.XIi00iiXO(it.next().getBleAppInfo().getMHide())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mDeviceStorage_delegate$lambda$0(MyAppStoreFragment myAppStoreFragment) {
        return (PFMedium) myAppStoreFragment.getMView().findViewById(R.id.storage_device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mEmptyLayout_delegate$lambda$0(MyAppStoreFragment myAppStoreFragment) {
        return myAppStoreFragment.getMView().findViewById(R.id.app_store_empty_layout);
    }

    public static /* synthetic */ void setDeviceStorage$default(MyAppStoreFragment myAppStoreFragment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            FragmentActivity activity = myAppStoreFragment.getActivity();
            Intrinsics.X1ii(activity, "null cannot be cast to non-null type com.sma.smartv3.ui.device.AppStoreActivity");
            str = ((AppStoreActivity) activity).getTotalDeviceStorage();
        }
        if ((i & 2) != 0) {
            FragmentActivity activity2 = myAppStoreFragment.getActivity();
            Intrinsics.X1ii(activity2, "null cannot be cast to non-null type com.sma.smartv3.ui.device.AppStoreActivity");
            str2 = ((AppStoreActivity) activity2).getFreeSizeDeviceStorage();
        }
        myAppStoreFragment.setDeviceStorage(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final AppStoreItemList appStoreItemList, final MyAppStoreFragment myAppStoreFragment, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsGroupHead(true);
        dslItem.setItemIsHover(false);
        dslItem.setItemSwipeMenuEnable(false);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(appStoreItemList.getTypeName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.vy0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MyAppStoreFragment.showData$lambda$0$0(this.f11838IO, appStoreItemList, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag(appStoreItemList.getTypeName());
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.yy0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyAppStoreFragment.showData$lambda$0$1((View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(MyAppStoreFragment myAppStoreFragment, AppStoreItemList appStoreItemList, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        itemHolder.itemView.setPadding(0, OXI1i1.XIi00iiXO(myAppStoreFragment.getContext(), 8.0f), 0, OXI1i1.XIi00iiXO(myAppStoreFragment.getContext(), 8.0f));
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_name);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(appStoreItemList.getTypeName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.app_store_more_tv);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(appStoreItemList.isShowAll() ? myAppStoreFragment.getString(R.string.app_store_list_tip_expand) : myAppStoreFragment.getString(R.string.app_store_list_tip_retract));
        }
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setVisibility(appStoreItemList.getList().size() <= 5 ? 4 : 0);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$1(View it) {
        Intrinsics.X0O(it, "it");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$1(AppStoreItemList appStoreItemList, final AppStoreDataItem appStoreDataItem, final MyAppStoreFragment myAppStoreFragment, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(appStoreItemList.getTypeName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.zy0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MyAppStoreFragment.showData$lambda$1$0(appStoreDataItem, myAppStoreFragment, dslItem, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.az0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyAppStoreFragment.showData$lambda$1$1(dslItem, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$1$0(final AppStoreDataItem appStoreDataItem, final MyAppStoreFragment myAppStoreFragment, final DslAdapterItem dslAdapterItem, final DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List payloads) {
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
        TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.tv_btn);
        if (textViewM3482tv3 != null) {
            textViewM3482tv3.setText(myAppStoreFragment.getString(R.string.app_store_installed));
        }
        TextView textViewM3482tv4 = itemHolder.m3482tv(R.id.tv_btn);
        if (textViewM3482tv4 != null) {
            textViewM3482tv4.setEnabled(false);
        }
        itemHolder.click(R.id.bt_delete_record, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.fz0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyAppStoreFragment.showData$lambda$1$0$0(this.f6772IO, appStoreDataItem, dslAdapterItem, view);
            }
        });
        View view = itemHolder.view(R.id.ll_item_panel);
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.gz0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return MyAppStoreFragment.showData$lambda$1$0$1$0(itemHolder, view2, motionEvent);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showData$lambda$1$0$0(MyAppStoreFragment myAppStoreFragment, AppStoreDataItem appStoreDataItem, DslAdapterItem dslAdapterItem, View view) {
        myAppStoreFragment.mItemPositionPackageName = appStoreDataItem.getBleAppInfo().getMPackage();
        appStoreDataItem.getBleAppInfo().setMHide(1);
        myAppStoreFragment.showDeleteTipPopup(R.string.audio_book_delete_pop_title, R.string.app_store_delete_pop_content, R.string.audio_book_delete_pop_sure);
        DslAdapter itemDslAdapter = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter != null) {
            DslAdapter.updateItemDepend$default(itemDslAdapter, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showData$lambda$1$0$1$0(DslViewHolder dslViewHolder, View view, MotionEvent motionEvent) {
        return dslViewHolder.itemView.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$1$1(DslAdapterItem dslAdapterItem, View view) {
        Intrinsics.X0O(view, "view");
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            SwipeMenuHelper.closeSwipeMenu$default(swipeMenuHelper, null, 1, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit upData$lambda$0(final MyAppStoreFragment myAppStoreFragment) {
        myAppStoreFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.bz0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyAppStoreFragment.upData$lambda$0$0(this.f5854IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit upData$lambda$0$0(MyAppStoreFragment myAppStoreFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        myAppStoreFragment.showData();
        return Unit.OXO1;
    }

    @sf5(tag = "add_app_store_success")
    public final void addAppStoreSuccess(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        getDslAdapter().clearAllItems();
        getDslAdapter().notifyDataChanged();
        showData();
        getDslAdapter().notifyDataChanged();
    }

    @Override // com.sma.smartv3.p610ui.device.fragment.BaseJLFileManageFragment
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
        return (PFMedium) this.mDeviceStorage$delegate.getValue();
    }

    public final View getMEmptyLayout() {
        return (View) this.mEmptyLayout$delegate.getValue();
    }

    @aa1
    public final String getMItemPositionPackageName() {
        return this.mItemPositionPackageName;
    }

    @Override // com.sma.smartv3.p610ui.device.fragment.BaseJLFileManageFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.device.fragment.BaseJLFileManageFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_my_app_store;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getMActivity()));
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().m3483v(recyclerViewId()));
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

    public final void setMAppNumber(int i) {
        this.mAppNumber = i;
    }

    public final void setMAppStoreItemList(@aa1 List<AppStoreItemList> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAppStoreItemList = list;
    }

    public final void setMItemPositionPackageName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mItemPositionPackageName = str;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void showData() {
        getDslAdapter().resetItem(new ArrayList());
        this.mAppNumber = 0;
        for (final AppStoreItemList appStoreItemList : this.mAppStoreItemList) {
            if (!appStoreItemList.getList().isEmpty() && getIsShowHeader(appStoreItemList.getList())) {
                DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_app_store_title_name, new Function1() { // from class: com.android.mltcode.paycertificationapi.wy0
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MyAppStoreFragment.showData$lambda$0(appStoreItemList, this, (DslAdapterItem) obj);
                    }
                });
            }
            List<AppStoreDataItem> listIO0OOi = appStoreItemList.isShowAll() ? CollectionsKt___CollectionsKt.IO0OOi(appStoreItemList.getList(), 5) : appStoreItemList.getList();
            LogUtils.m11130i("category.listFor" + listIO0OOi.size());
            for (final AppStoreDataItem appStoreDataItem : listIO0OOi) {
                if (!OiOX0i.XIi00iiXO(appStoreDataItem.getBleAppInfo().getMHide())) {
                    this.mAppNumber++;
                    DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_app_store, new Function1() { // from class: com.android.mltcode.paycertificationapi.xy0
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return MyAppStoreFragment.showData$lambda$1(appStoreItemList, appStoreDataItem, this, (DslAdapterItem) obj);
                        }
                    });
                }
            }
        }
        getMEmptyLayout().setVisibility(this.mAppNumber != 0 ? 8 : 0);
    }

    public final void upData(@aa1 List<AppStoreItemList> list) {
        Intrinsics.X0O(list, "list");
        this.mAppStoreItemList = list;
        getDslViewHolder().postDelay(300L, new Function0() { // from class: com.android.mltcode.paycertificationapi.ez0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return MyAppStoreFragment.upData$lambda$0(this.f6527IO);
            }
        });
    }
}
