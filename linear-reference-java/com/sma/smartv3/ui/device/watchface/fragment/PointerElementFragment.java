package com.sma.smartv3.ui.device.watchface.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.az1;
import com.android.mltcode.paycertificationapi.bz1;
import com.android.mltcode.paycertificationapi.cz1;
import com.android.mltcode.paycertificationapi.dz1;
import com.android.mltcode.paycertificationapi.ez1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.fragment.PointerElementFragment$initView$3, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nPointerElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1878#2,3:121\n*S KotlinDebug\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3\n*L\n63#1:121,3\n*E\n"})
    public static final class AnonymousClass3 extends CommonAdapter<ResourcesIdInfo> {
        final /* synthetic */ PointerElementFragment this$0;

        public AnonymousClass3(PointerElementFragment r1, FragmentActivity r2, int r3, List<ResourcesIdInfo> r4) {
            this.this$0 = r1;
            super(r2, r3, r4);
        }

        public static /* synthetic */ void OXO1(AnonymousClass3 r0, PointerElementFragment r1, int r2, View r3) {
            convert$lambda$0(r0, r1, r2, r3);
        }

        private static final void convert$lambda$0(AnonymousClass3 r4, PointerElementFragment r5, int r6, View r7) {
            Iterable r8 = r4.mDatas;
            Intrinsics.O10IXXX0X(r8, "mDatas");
            Iterator r9 = r8.iterator();
            int r1 = 0;
        L4:
            if (r9.hasNext() == false) goto L13;
            Object r2 = r9.next();
            int r3 = r1 + 1;
            if (r1 >= 0) goto L8;
            CollectionsKt__CollectionsKt.XOX0O0();
        L8:
            ResourcesIdInfo r10 = (ResourcesIdInfo) r2;
            if (r1 != r6) goto L11;
            r10.setSelect(!r10.isSelect());
        L12:
            r1 = r3;
            goto L4
        L11:
            r10.setSelect(false);
            goto L12
        L13:
            r5.getCallback().OXO1(Integer.valueOf(r6), ((ResourcesIdInfo) r4.mDatas.get(r6)).isSelect());
            r4.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, ResourcesIdInfo r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r3, ResourcesIdInfo r4, final int r5) {
            Intrinsics.X0O(r3, "holder");
            Intrinsics.X0O(r4, "resourcesIdInfo");
            ((ImageView) r3.getView(R.id.pointerIv)).setImageResource(r4.getResId());
            ImageView r0 = (ImageView) r3.getView(R.id.selectStatus);
            if (r4.isSelect() == false) goto L5;
            int r6 = 0;
        L6:
            r0.setVisibility(r6);
            RelativeLayout r7 = (RelativeLayout) r3.getView(R.id.rv);
            final PointerElementFragment r8 = this.this$0;
            r7.setOnClickListener(new dz1(this, r8, r5));
            return;
        L5:
            r6 = 8;
            goto L6
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.fragment.PointerElementFragment$initView$4, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nPointerElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1878#2,3:121\n*S KotlinDebug\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$4\n*L\n95#1:121,3\n*E\n"})
    public static final class AnonymousClass4 extends CommonAdapter<ResourcesIdInfo> {
        final /* synthetic */ PointerElementFragment this$0;

        public AnonymousClass4(PointerElementFragment r1, FragmentActivity r2, int r3, List<ResourcesIdInfo> r4) {
            this.this$0 = r1;
            super(r2, r3, r4);
        }

        public static /* synthetic */ void OXO1(AnonymousClass4 r0, PointerElementFragment r1, int r2, View r3) {
            convert$lambda$0(r0, r1, r2, r3);
        }

        private static final void convert$lambda$0(AnonymousClass4 r4, PointerElementFragment r5, int r6, View r7) {
            Iterable r8 = r4.mDatas;
            Intrinsics.O10IXXX0X(r8, "mDatas");
            Iterator r9 = r8.iterator();
            int r1 = 0;
        L4:
            if (r9.hasNext() == false) goto L13;
            Object r2 = r9.next();
            int r3 = r1 + 1;
            if (r1 >= 0) goto L8;
            CollectionsKt__CollectionsKt.XOX0O0();
        L8:
            ResourcesIdInfo r10 = (ResourcesIdInfo) r2;
            if (r1 != r6) goto L11;
            r10.setSelect(!r10.isSelect());
        L12:
            r1 = r3;
            goto L4
        L11:
            r10.setSelect(false);
            goto L12
        L13:
            r5.getCallback().XIi00iiXO(Integer.valueOf(r6), ((ResourcesIdInfo) r4.mDatas.get(r6)).isSelect());
            r4.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, ResourcesIdInfo r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r3, ResourcesIdInfo r4, final int r5) {
            Intrinsics.X0O(r3, "holder");
            Intrinsics.X0O(r4, "resourcesIdInfo");
            ((ImageView) r3.getView(R.id.pointerIv)).setImageResource(r4.getResId());
            ImageView r0 = (ImageView) r3.getView(R.id.selectStatus);
            if (r4.isSelect() == false) goto L5;
            int r6 = 0;
        L6:
            r0.setVisibility(r6);
            RelativeLayout r7 = (RelativeLayout) r3.getView(R.id.rv);
            final PointerElementFragment r8 = this.this$0;
            r7.setOnClickListener(new ez1(this, r8, r5));
            return;
        L5:
            r6 = 8;
            goto L6
        }
    }

    public PointerElementFragment(@aa1 List<ResourcesIdInfo> r2, @aa1 List<ResourcesIdInfo> r3, boolean r4, @aa1 az1<Integer> r5) {
        Intrinsics.X0O(r2, "pointers");
        Intrinsics.X0O(r3, "scales");
        Intrinsics.X0O(r5, "callback");
        this.pointers = r2;
        this.scales = r3;
        this.isRound = r4;
        this.callback = r5;
        this.rvPointer$delegate = LazyKt__LazyJVMKt.iO(new bz1(this));
        this.rvScale$delegate = LazyKt__LazyJVMKt.iO(new cz1(this));
    }

    public static /* synthetic */ RecyclerView XIi00iiXO(PointerElementFragment r0) {
        return rvPointer_delegate$lambda$0(r0);
    }

    private final RecyclerView getRvPointer() {
        return (RecyclerView) getValue();
    }

    private final RecyclerView getRvScale() {
        return (RecyclerView) getValue();
    }

    public static /* synthetic */ RecyclerView iO(PointerElementFragment r0) {
        return rvScale_delegate$lambda$0(r0);
    }

    private static final RecyclerView rvPointer_delegate$lambda$0(PointerElementFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.rvPointer);
    }

    private static final RecyclerView rvScale_delegate$lambda$0(PointerElementFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.rvScale);
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

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        RecyclerView r0 = getRvPointer();
        LinearLayoutManager r1 = new LinearLayoutManager(getActivity());
        r1.setOrientation(0);
        r0.setLayoutManager(r1);
        RecyclerView r2 = getRvScale();
        LinearLayoutManager r3 = new LinearLayoutManager(getActivity());
        r3.setOrientation(0);
        r2.setLayoutManager(r3);
        RecyclerView r4 = getRvPointer();
        FragmentActivity r5 = getActivity();
        boolean r6 = this.isRound;
        int r7 = R.layout.item_watchface_pointer_select_r;
        if (r6 == false) goto L5;
        int r8 = R.layout.item_watchface_pointer_select;
    L6:
        r4.setAdapter(new AnonymousClass3(this, r5, r8, this.pointers));
        RecyclerView r9 = getRvScale();
        FragmentActivity r10 = getActivity();
        if (this.isRound == false) goto L9;
        r7 = R.layout.item_watchface_pointer_select;
    L9:
        r9.setAdapter(new AnonymousClass4(this, r10, r7, this.scales));
        return;
    L5:
        r8 = R.layout.item_watchface_pointer_select_r;
        goto L6
    }

    public final boolean isRound() {
        return this.isRound;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.layout_watchface_pointer;
    }

    @Override // com.sma.smartv3.ui.device.watchface.fragment.BaseElementFragment
    public void reset() {
        RecyclerView.Adapter r0 = getRvPointer().getAdapter();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter<com.sma.smartv3.model.ResourcesIdInfo>");
        CommonAdapter r1 = (CommonAdapter) r0;
        Iterable r2 = r1.getDatas();
        Intrinsics.O10IXXX0X(r2, "getDatas(...)");
        Iterator r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        ((ResourcesIdInfo) r3.next()).setSelect(false);
        goto L4
    L6:
        r1.notifyDataSetChanged();
        RecyclerView.Adapter r4 = getRvScale().getAdapter();
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter<com.sma.smartv3.model.ResourcesIdInfo>");
        CommonAdapter r5 = (CommonAdapter) r4;
        Iterable r6 = r5.getDatas();
        Intrinsics.O10IXXX0X(r6, "getDatas(...)");
        Iterator r7 = r6.iterator();
    L8:
        if (r7.hasNext() == false) goto L10;
        ((ResourcesIdInfo) r7.next()).setSelect(false);
        goto L8
    L10:
        r5.notifyDataSetChanged();
    }
}
