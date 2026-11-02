package com.sma.smartv3.ui.device.watchface.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I001IIIOO;
import com.android.mltcode.paycertificationapi.I01Xi0;
import com.android.mltcode.paycertificationapi.IO11XXI;
import com.android.mltcode.paycertificationapi.IO1i0IO;
import com.android.mltcode.paycertificationapi.IOi11;
import com.android.mltcode.paycertificationapi.IX1OXIOi;
import com.android.mltcode.paycertificationapi.IXI011X11;
import com.android.mltcode.paycertificationapi.O0OX11;
import com.android.mltcode.paycertificationapi.O0OiXIOI;
import com.android.mltcode.paycertificationapi.O11XO0i;
import com.android.mltcode.paycertificationapi.O1OOiXOI;
import com.android.mltcode.paycertificationapi.OIXiOO1X;
import com.android.mltcode.paycertificationapi.OO10ii0;
import com.android.mltcode.paycertificationapi.OOXOi0i0;
import com.android.mltcode.paycertificationapi.OX1iX;
import com.android.mltcode.paycertificationapi.X1XIi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ii1OII0I0;
import com.android.mltcode.paycertificationapi.iiO00;
import com.android.mltcode.paycertificationapi.iiiOXX1XI;
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
@SourceDebugExtension({"SMAP\nControlElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1869#2,2:101\n*S KotlinDebug\n*F\n+ 1 ControlElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment\n*L\n96#1:101,2\n*E\n"})
public class ControlElementFragment extends BaseElementFragment {

    @aa1
    private final IXI011X11<Integer> callback;

    @aa1
    private final List<ResourcesIdInfo> colors;

    @aa1
    private final Lazy dialSelect0$delegate;

    @aa1
    private final Lazy dialSelect1$delegate;

    @aa1
    private final Lazy dialSelect2$delegate;

    @aa1
    private final Lazy dialSelect3$delegate;

    @aa1
    private final Lazy dialSelectStatus0$delegate;

    @aa1
    private final Lazy dialSelectStatus1$delegate;

    @aa1
    private final Lazy dialSelectStatus2$delegate;

    @aa1
    private final Lazy dialSelectStatus3$delegate;
    private final boolean isRound;

    @aa1
    private final Lazy ivDialSelect0$delegate;

    @aa1
    private final Lazy ivDialSelect1$delegate;

    @aa1
    private final Lazy ivDialSelect2$delegate;

    @aa1
    private final Lazy ivDialSelect3$delegate;

    @aa1
    private final Lazy rv$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.fragment.ControlElementFragment$initView$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nControlElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment$initView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1878#2,3:101\n*S KotlinDebug\n*F\n+ 1 ControlElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment$initView$2\n*L\n67#1:101,3\n*E\n"})
    public static final class AnonymousClass2 extends CommonAdapter<ResourcesIdInfo> {
        final /* synthetic */ ControlElementFragment this$0;

        public AnonymousClass2(ControlElementFragment r1, FragmentActivity r2, List<ResourcesIdInfo> r3) {
            this.this$0 = r1;
            super(r2, R.layout.item_watchface_element_color_select, r3);
        }

        public static /* synthetic */ void OXO1(AnonymousClass2 r0, ControlElementFragment r1, int r2, View r3) {
            convert$lambda$0(r0, r1, r2, r3);
        }

        private static final void convert$lambda$0(AnonymousClass2 r4, ControlElementFragment r5, int r6, View r7) {
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
            ((ImageView) r3.getView(R.id.colorIv)).setImageResource(r4.getResId());
            ImageView r0 = (ImageView) r3.getView(R.id.selectStatus);
            if (r4.isSelect() == false) goto L5;
            int r6 = 0;
        L6:
            r0.setVisibility(r6);
            RelativeLayout r7 = (RelativeLayout) r3.getView(R.id.rv);
            final ControlElementFragment r8 = this.this$0;
            r7.setOnClickListener(new I01Xi0(this, r8, r5));
            return;
        L5:
            r6 = 8;
            goto L6
        }
    }

    public ControlElementFragment(@aa1 List<ResourcesIdInfo> r2, boolean r3, @aa1 IXI011X11<Integer> r4) {
        Intrinsics.X0O(r2, "colors");
        Intrinsics.X0O(r4, "callback");
        this.colors = r2;
        this.isRound = r3;
        this.callback = r4;
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new X1XIi(this));
        this.dialSelect0$delegate = LazyKt__LazyJVMKt.iO(new IO11XXI(this));
        this.dialSelect1$delegate = LazyKt__LazyJVMKt.iO(new OOXOi0i0(this));
        this.dialSelect2$delegate = LazyKt__LazyJVMKt.iO(new O0OX11(this));
        this.dialSelect3$delegate = LazyKt__LazyJVMKt.iO(new iiO00(this));
        this.dialSelectStatus0$delegate = LazyKt__LazyJVMKt.iO(new IOi11(this));
        this.dialSelectStatus1$delegate = LazyKt__LazyJVMKt.iO(new O0OiXIOI(this));
        this.dialSelectStatus2$delegate = LazyKt__LazyJVMKt.iO(new IO1i0IO(this));
        this.dialSelectStatus3$delegate = LazyKt__LazyJVMKt.iO(new O11XO0i(this));
        this.ivDialSelect0$delegate = LazyKt__LazyJVMKt.iO(new ii1OII0I0(this));
        this.ivDialSelect1$delegate = LazyKt__LazyJVMKt.iO(new IX1OXIOi(this));
        this.ivDialSelect2$delegate = LazyKt__LazyJVMKt.iO(new OIXiOO1X(this));
        this.ivDialSelect3$delegate = LazyKt__LazyJVMKt.iO(new OX1iX(this));
    }

    public static /* synthetic */ LinearLayout I0IIOi(ControlElementFragment r0) {
        return dialSelect0_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView I0iXXO(ControlElementFragment r0) {
        return dialSelectStatus1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout I1XOi1(ControlElementFragment r0) {
        return dialSelect2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView IIX1OXO(ControlElementFragment r0) {
        return ivDialSelect1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IO(ControlElementFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ ImageView IiI10X(ControlElementFragment r0) {
        return dialSelectStatus3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O00(ControlElementFragment r0) {
        return ivDialSelect0_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O10IXXX0X(ControlElementFragment r0) {
        return dialSelectStatus0_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout OIX0iXi(ControlElementFragment r0) {
        return dialSelect1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIi0(ControlElementFragment r0) {
        return dialSelectStatus2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(ControlElementFragment r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ void X1ii(ControlElementFragment r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ RecyclerView XIi00iiXO(ControlElementFragment r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XO0O10(ControlElementFragment r0) {
        return ivDialSelect2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XOO0ii0(ControlElementFragment r0, View r1) {
        initView$lambda$4(r0, r1);
    }

    public static /* synthetic */ LinearLayout XXI(ControlElementFragment r0) {
        return dialSelect3_delegate$lambda$0(r0);
    }

    private static final LinearLayout dialSelect0_delegate$lambda$0(ControlElementFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.dialSelect0);
    }

    private static final LinearLayout dialSelect1_delegate$lambda$0(ControlElementFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.dialSelect1);
    }

    private static final LinearLayout dialSelect2_delegate$lambda$0(ControlElementFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.dialSelect2);
    }

    private static final LinearLayout dialSelect3_delegate$lambda$0(ControlElementFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.dialSelect3);
    }

    private static final ImageView dialSelectStatus0_delegate$lambda$0(ControlElementFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.dialSelectStatus0);
    }

    private static final ImageView dialSelectStatus1_delegate$lambda$0(ControlElementFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.dialSelectStatus1);
    }

    private static final ImageView dialSelectStatus2_delegate$lambda$0(ControlElementFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.dialSelectStatus2);
    }

    private static final ImageView dialSelectStatus3_delegate$lambda$0(ControlElementFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.dialSelectStatus3);
    }

    private final RecyclerView getRv() {
        return (RecyclerView) getValue();
    }

    public static /* synthetic */ ImageView iO(ControlElementFragment r0) {
        return ivDialSelect3_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$1(ControlElementFragment r0, View r1) {
        View.OnClickListener r2 = r0.getMOnViewClickListener();
        if (r2 == null) goto L6;
        r2.onClick(r1);
        return;
    }

    private static final void initView$lambda$2(ControlElementFragment r0, View r1) {
        View.OnClickListener r2 = r0.getMOnViewClickListener();
        if (r2 == null) goto L6;
        r2.onClick(r1);
        return;
    }

    private static final void initView$lambda$3(ControlElementFragment r0, View r1) {
        View.OnClickListener r2 = r0.getMOnViewClickListener();
        if (r2 == null) goto L6;
        r2.onClick(r1);
        return;
    }

    private static final void initView$lambda$4(ControlElementFragment r0, View r1) {
        View.OnClickListener r2 = r0.getMOnViewClickListener();
        if (r2 == null) goto L6;
        r2.onClick(r1);
        return;
    }

    private static final ImageView ivDialSelect0_delegate$lambda$0(ControlElementFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.ivDialSelect0);
    }

    private static final ImageView ivDialSelect1_delegate$lambda$0(ControlElementFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.ivDialSelect1);
    }

    private static final ImageView ivDialSelect2_delegate$lambda$0(ControlElementFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.ivDialSelect2);
    }

    private static final ImageView ivDialSelect3_delegate$lambda$0(ControlElementFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.ivDialSelect3);
    }

    private static final RecyclerView rv_delegate$lambda$0(ControlElementFragment r1) {
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

    public final LinearLayout getDialSelect0() {
        return (LinearLayout) getValue();
    }

    public final LinearLayout getDialSelect1() {
        return (LinearLayout) getValue();
    }

    public final LinearLayout getDialSelect2() {
        return (LinearLayout) getValue();
    }

    public final LinearLayout getDialSelect3() {
        return (LinearLayout) getValue();
    }

    public final ImageView getDialSelectStatus0() {
        return (ImageView) getValue();
    }

    public final ImageView getDialSelectStatus1() {
        return (ImageView) getValue();
    }

    public final ImageView getDialSelectStatus2() {
        return (ImageView) getValue();
    }

    public final ImageView getDialSelectStatus3() {
        return (ImageView) getValue();
    }

    public final ImageView getIvDialSelect0() {
        return (ImageView) getValue();
    }

    public final ImageView getIvDialSelect1() {
        return (ImageView) getValue();
    }

    public final ImageView getIvDialSelect2() {
        return (ImageView) getValue();
    }

    public final ImageView getIvDialSelect3() {
        return (ImageView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (this.isRound == false) goto L5;
        getIvDialSelect0().setBackgroundResource(R.drawable.shape_dial_control_bg);
        getIvDialSelect1().setBackgroundResource(R.drawable.shape_dial_control_bg);
        getIvDialSelect2().setBackgroundResource(R.drawable.shape_dial_control_bg);
        getIvDialSelect3().setBackgroundResource(R.drawable.shape_dial_control_bg);
    L6:
        RecyclerView r0 = getRv();
        LinearLayoutManager r1 = new LinearLayoutManager(getActivity());
        r1.setOrientation(0);
        r0.setLayoutManager(r1);
        getRv().setAdapter(new AnonymousClass2(this, getActivity(), this.colors));
        getDialSelect0().setOnClickListener(new OO10ii0(this));
        getDialSelect1().setOnClickListener(new iiiOXX1XI(this));
        getDialSelect2().setOnClickListener(new O1OOiXOI(this));
        getDialSelect3().setOnClickListener(new I001IIIOO(this));
        return;
    L5:
        getIvDialSelect0().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
        getIvDialSelect1().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
        getIvDialSelect2().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
        getIvDialSelect3().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
        goto L6
    }

    public final boolean isRound() {
        return this.isRound;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.layout_watchface_control;
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
    }
}
