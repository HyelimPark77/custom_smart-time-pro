package com.sma.smartv3.p610ui.device.watchface.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.az1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.p610ui.device.watchface.fragment.PointerElementFragment;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPointerElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1869#2,2:121\n1869#2,2:123\n*S KotlinDebug\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment\n*L\n111#1:121,2\n116#1:123,2\n*E\n"})
public final class PointerElementFragment extends BaseElementFragment {

    @aa1
    private final az1<Integer> callback;
    private final boolean isRound;

    @aa1
    private final List<ResourcesIdInfo> pointers;

    @aa1
    private final Lazy rvPointer$delegate;

    @aa1
    private final Lazy rvScale$delegate;

    @aa1
    private final List<ResourcesIdInfo> scales;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.fragment.PointerElementFragment$initView$3 */
    @SourceDebugExtension({"SMAP\nPointerElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1878#2,3:121\n*S KotlinDebug\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3\n*L\n63#1:121,3\n*E\n"})
    public static final class C188333 extends CommonAdapter<ResourcesIdInfo> {
        public C188333(FragmentActivity fragmentActivity, int i, List<ResourcesIdInfo> list) {
            super(fragmentActivity, i, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(C188333 c188333, PointerElementFragment pointerElementFragment, int i, View view) {
            Iterable mDatas = ((CommonAdapter) c188333).mDatas;
            Intrinsics.O10IXXX0X(mDatas, "mDatas");
            int i2 = 0;
            for (Object obj : mDatas) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                ResourcesIdInfo resourcesIdInfo = (ResourcesIdInfo) obj;
                if (i2 == i) {
                    resourcesIdInfo.setSelect(!resourcesIdInfo.isSelect());
                } else {
                    resourcesIdInfo.setSelect(false);
                }
                i2 = i3;
            }
            pointerElementFragment.getCallback().OXO1(Integer.valueOf(i), ((ResourcesIdInfo) ((CommonAdapter) c188333).mDatas.get(i)).isSelect());
            c188333.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, ResourcesIdInfo resourcesIdInfo, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(resourcesIdInfo, "resourcesIdInfo");
            ((ImageView) holder.getView(R.id.pointerIv)).setImageResource(resourcesIdInfo.getResId());
            ((ImageView) holder.getView(R.id.selectStatus)).setVisibility(resourcesIdInfo.isSelect() ? 0 : 8);
            RelativeLayout relativeLayout = (RelativeLayout) holder.getView(R.id.f51422rv);
            final PointerElementFragment pointerElementFragment = PointerElementFragment.this;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.dz1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PointerElementFragment.C188333.convert$lambda$0(this.f6303IO, pointerElementFragment, i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.fragment.PointerElementFragment$initView$4 */
    @SourceDebugExtension({"SMAP\nPointerElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1878#2,3:121\n*S KotlinDebug\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$4\n*L\n95#1:121,3\n*E\n"})
    public static final class C188344 extends CommonAdapter<ResourcesIdInfo> {
        public C188344(FragmentActivity fragmentActivity, int i, List<ResourcesIdInfo> list) {
            super(fragmentActivity, i, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(C188344 c188344, PointerElementFragment pointerElementFragment, int i, View view) {
            Iterable mDatas = ((CommonAdapter) c188344).mDatas;
            Intrinsics.O10IXXX0X(mDatas, "mDatas");
            int i2 = 0;
            for (Object obj : mDatas) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                ResourcesIdInfo resourcesIdInfo = (ResourcesIdInfo) obj;
                if (i2 == i) {
                    resourcesIdInfo.setSelect(!resourcesIdInfo.isSelect());
                } else {
                    resourcesIdInfo.setSelect(false);
                }
                i2 = i3;
            }
            pointerElementFragment.getCallback().XIi00iiXO(Integer.valueOf(i), ((ResourcesIdInfo) ((CommonAdapter) c188344).mDatas.get(i)).isSelect());
            c188344.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, ResourcesIdInfo resourcesIdInfo, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(resourcesIdInfo, "resourcesIdInfo");
            ((ImageView) holder.getView(R.id.pointerIv)).setImageResource(resourcesIdInfo.getResId());
            ((ImageView) holder.getView(R.id.selectStatus)).setVisibility(resourcesIdInfo.isSelect() ? 0 : 8);
            RelativeLayout relativeLayout = (RelativeLayout) holder.getView(R.id.f51422rv);
            final PointerElementFragment pointerElementFragment = PointerElementFragment.this;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ez1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PointerElementFragment.C188344.convert$lambda$0(this.f6529IO, pointerElementFragment, i, view);
                }
            });
        }
    }

    public PointerElementFragment(@aa1 List<ResourcesIdInfo> pointers, @aa1 List<ResourcesIdInfo> scales, boolean z, @aa1 az1<Integer> callback) {
        Intrinsics.X0O(pointers, "pointers");
        Intrinsics.X0O(scales, "scales");
        Intrinsics.X0O(callback, "callback");
        this.pointers = pointers;
        this.scales = scales;
        this.isRound = z;
        this.callback = callback;
        this.rvPointer$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bz1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return PointerElementFragment.rvPointer_delegate$lambda$0(this.f5855IO);
            }
        });
        this.rvScale$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cz1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return PointerElementFragment.rvScale_delegate$lambda$0(this.f6087IO);
            }
        });
    }

    private final RecyclerView getRvPointer() {
        return (RecyclerView) this.rvPointer$delegate.getValue();
    }

    private final RecyclerView getRvScale() {
        return (RecyclerView) this.rvScale$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rvPointer_delegate$lambda$0(PointerElementFragment pointerElementFragment) {
        return (RecyclerView) pointerElementFragment.getMView().findViewById(R.id.rvPointer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rvScale_delegate$lambda$0(PointerElementFragment pointerElementFragment) {
        return (RecyclerView) pointerElementFragment.getMView().findViewById(R.id.rvScale);
    }

    @aa1
    public final az1<Integer> getCallback() {
        return this.callback;
    }

    @aa1
    public final List<ResourcesIdInfo> getPointers() {
        return this.pointers;
    }

    @aa1
    public final List<ResourcesIdInfo> getScales() {
        return this.scales;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        RecyclerView rvPointer = getRvPointer();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(0);
        rvPointer.setLayoutManager(linearLayoutManager);
        RecyclerView rvScale = getRvScale();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getActivity());
        linearLayoutManager2.setOrientation(0);
        rvScale.setLayoutManager(linearLayoutManager2);
        RecyclerView rvPointer2 = getRvPointer();
        FragmentActivity activity = getActivity();
        boolean z = this.isRound;
        int i = R.layout.item_watchface_pointer_select_r;
        rvPointer2.setAdapter(new C188333(activity, z ? R.layout.item_watchface_pointer_select : R.layout.item_watchface_pointer_select_r, this.pointers));
        RecyclerView rvScale2 = getRvScale();
        FragmentActivity activity2 = getActivity();
        if (this.isRound) {
            i = R.layout.item_watchface_pointer_select;
        }
        rvScale2.setAdapter(new C188344(activity2, i, this.scales));
    }

    public final boolean isRound() {
        return this.isRound;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.layout_watchface_pointer;
    }

    @Override // com.sma.smartv3.p610ui.device.watchface.fragment.BaseElementFragment
    public void reset() {
        RecyclerView.Adapter adapter = getRvPointer().getAdapter();
        Intrinsics.X1ii(adapter, "null cannot be cast to non-null type com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter<com.sma.smartv3.model.ResourcesIdInfo>");
        CommonAdapter commonAdapter = (CommonAdapter) adapter;
        Iterable datas = commonAdapter.getDatas();
        Intrinsics.O10IXXX0X(datas, "getDatas(...)");
        Iterator it = datas.iterator();
        while (it.hasNext()) {
            ((ResourcesIdInfo) it.next()).setSelect(false);
        }
        commonAdapter.notifyDataSetChanged();
        RecyclerView.Adapter adapter2 = getRvScale().getAdapter();
        Intrinsics.X1ii(adapter2, "null cannot be cast to non-null type com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter<com.sma.smartv3.model.ResourcesIdInfo>");
        CommonAdapter commonAdapter2 = (CommonAdapter) adapter2;
        Iterable datas2 = commonAdapter2.getDatas();
        Intrinsics.O10IXXX0X(datas2, "getDatas(...)");
        Iterator it2 = datas2.iterator();
        while (it2.hasNext()) {
            ((ResourcesIdInfo) it2.next()).setSelect(false);
        }
        commonAdapter2.notifyDataSetChanged();
    }
}
