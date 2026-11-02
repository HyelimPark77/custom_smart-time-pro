package com.sma.smartv3.ui.device.watchface.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.IXI011X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.us5;
import com.android.mltcode.paycertificationapi.vs5;
import com.android.mltcode.paycertificationapi.ws5;
import com.android.mltcode.paycertificationapi.xs5;
import com.android.mltcode.paycertificationapi.ys5;
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
@SourceDebugExtension({"SMAP\nTimeElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1869#2,2:80\n*S KotlinDebug\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment\n*L\n74#1:80,2\n*E\n"})
public class TimeElementFragment extends BaseElementFragment {

    @aa1
    private final IXI011X11<Integer> callback;

    @aa1
    private final List<ResourcesIdInfo> colors;

    @aa1
    private final Lazy dialSelect0$delegate;

    @aa1
    private final Lazy dialSelectStatus0$delegate;
    private final boolean isRound;

    @aa1
    private final Lazy rv$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.fragment.TimeElementFragment$initView$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nTimeElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment$initView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1878#2,3:80\n*S KotlinDebug\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment$initView$2\n*L\n52#1:80,3\n*E\n"})
    public static final class AnonymousClass2 extends CommonAdapter<ResourcesIdInfo> {
        final /* synthetic */ TimeElementFragment this$0;

        public AnonymousClass2(TimeElementFragment r1, FragmentActivity r2, List<ResourcesIdInfo> r3) {
            this.this$0 = r1;
            super(r2, R.layout.item_watchface_element_color_select, r3);
        }

        public static /* synthetic */ void OXO1(AnonymousClass2 r0, int r1, TimeElementFragment r2, View r3) {
            convert$lambda$0(r0, r1, r2, r3);
        }

        private static final void convert$lambda$0(AnonymousClass2 r4, int r5, TimeElementFragment r6, View r7) {
            Iterable r8 = r4.mDatas;
            Intrinsics.O10IXXX0X(r8, "mDatas");
            Iterator r9 = r8.iterator();
            int r0 = 0;
            int r1 = 0;
        L4:
            if (r9.hasNext() == false) goto L13;
            Object r2 = r9.next();
            int r3 = r1 + 1;
            if (r1 >= 0) goto L8;
            CollectionsKt__CollectionsKt.XOX0O0();
        L8:
            ResourcesIdInfo r10 = (ResourcesIdInfo) r2;
            if (r1 != r5) goto L11;
            r10.setSelect(!r10.isSelect());
        L12:
            r1 = r3;
            goto L4
        L11:
            r10.setSelect(false);
            goto L12
        L13:
            boolean r11 = ((ResourcesIdInfo) r4.mDatas.get(r5)).isSelect();
            ImageView r12 = r6.getDialSelectStatus0();
            if (r11 == true) goto L17;
            r0 = 8;
        L17:
            r12.setVisibility(r0);
            r6.getCallback().OXO1(Integer.valueOf(r5), r11);
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
            ((ImageView) r3.getView(R.id.colorIv)).setImageResource(r4.getResId());
            ImageView r0 = (ImageView) r3.getView(R.id.selectStatus);
            if (r4.isSelect() == false) goto L5;
            int r6 = 0;
        L6:
            r0.setVisibility(r6);
            RelativeLayout r7 = (RelativeLayout) r3.getView(R.id.rv);
            final TimeElementFragment r8 = this.this$0;
            r7.setOnClickListener(new ys5(this, r5, r8));
            return;
        L5:
            r6 = 8;
            goto L6
        }
    }

    public TimeElementFragment(@aa1 List<ResourcesIdInfo> r2, boolean r3, @aa1 IXI011X11<Integer> r4) {
        Intrinsics.X0O(r2, "colors");
        Intrinsics.X0O(r4, "callback");
        this.colors = r2;
        this.isRound = r3;
        this.callback = r4;
        this.dialSelect0$delegate = LazyKt__LazyJVMKt.iO(new us5(this));
        this.dialSelectStatus0$delegate = LazyKt__LazyJVMKt.iO(new vs5(this));
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new ws5(this));
    }

    public static /* synthetic */ ImageView O00(TimeElementFragment r0) {
        return dialSelectStatus0_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout XIi00iiXO(TimeElementFragment r0) {
        return dialSelect0_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XO0O10(TimeElementFragment r0) {
        return rv_delegate$lambda$0(r0);
    }

    private static final RelativeLayout dialSelect0_delegate$lambda$0(TimeElementFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.dialSelect0);
    }

    private static final ImageView dialSelectStatus0_delegate$lambda$0(TimeElementFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.dialSelectStatus0);
    }

    public static /* synthetic */ void iO(TimeElementFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    private static final void initView$lambda$1(TimeElementFragment r0, View r1) {
        View.OnClickListener r2 = r0.getMOnViewClickListener();
        if (r2 == null) goto L6;
        r2.onClick(r1);
        return;
    }

    private static final RecyclerView rv_delegate$lambda$0(TimeElementFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.rv);
    }

    @aa1
    public final IXI011X11<Integer> getCallback() {
        return this.callback;
    }

    @aa1
    public final List<ResourcesIdInfo> getColors() {
        return this.colors;
    }

    public final RelativeLayout getDialSelect0() {
        return (RelativeLayout) getValue();
    }

    public final ImageView getDialSelectStatus0() {
        return (ImageView) getValue();
    }

    public final RecyclerView getRv() {
        return (RecyclerView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (this.isRound == false) goto L5;
        getDialSelect0().setBackgroundResource(R.drawable.shape_dial_control_bg);
    L6:
        RecyclerView r0 = getRv();
        LinearLayoutManager r1 = new LinearLayoutManager(getActivity());
        r1.setOrientation(0);
        r0.setLayoutManager(r1);
        getRv().setAdapter(new AnonymousClass2(this, getActivity(), this.colors));
        getDialSelect0().setOnClickListener(new xs5(this));
        return;
    L5:
        getDialSelect0().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
        goto L6
    }

    public final boolean isRound() {
        return this.isRound;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.layout_watchface_time;
    }

    @Override // com.sma.smartv3.ui.device.watchface.fragment.BaseElementFragment
    public void reset() {
        RecyclerView.Adapter r0 = getRv().getAdapter();
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
        getDialSelectStatus0().setVisibility(8);
    }
}
