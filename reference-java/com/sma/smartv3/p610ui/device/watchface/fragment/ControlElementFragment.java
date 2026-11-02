package com.sma.smartv3.p610ui.device.watchface.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.IXI011X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.p610ui.device.watchface.fragment.ControlElementFragment;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.fragment.ControlElementFragment$initView$2 */
    @SourceDebugExtension({"SMAP\nControlElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment$initView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1878#2,3:101\n*S KotlinDebug\n*F\n+ 1 ControlElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment$initView$2\n*L\n67#1:101,3\n*E\n"})
    public static final class C188302 extends CommonAdapter<ResourcesIdInfo> {
        public C188302(FragmentActivity fragmentActivity, List<ResourcesIdInfo> list) {
            super(fragmentActivity, R.layout.item_watchface_element_color_select, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(C188302 c188302, ControlElementFragment controlElementFragment, int i, View view) {
            Iterable mDatas = ((CommonAdapter) c188302).mDatas;
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
            controlElementFragment.getCallback().OXO1(Integer.valueOf(i), ((ResourcesIdInfo) ((CommonAdapter) c188302).mDatas.get(i)).isSelect());
            c188302.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, ResourcesIdInfo resourcesIdInfo, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(resourcesIdInfo, "resourcesIdInfo");
            ((ImageView) holder.getView(R.id.colorIv)).setImageResource(resourcesIdInfo.getResId());
            ((ImageView) holder.getView(R.id.selectStatus)).setVisibility(resourcesIdInfo.isSelect() ? 0 : 8);
            RelativeLayout relativeLayout = (RelativeLayout) holder.getView(R.id.f51422rv);
            final ControlElementFragment controlElementFragment = ControlElementFragment.this;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I01Xi0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ControlElementFragment.C188302.convert$lambda$0(this.f1097IO, controlElementFragment, i, view);
                }
            });
        }
    }

    public ControlElementFragment(@aa1 List<ResourcesIdInfo> colors, boolean z, @aa1 IXI011X11<Integer> callback) {
        Intrinsics.X0O(colors, "colors");
        Intrinsics.X0O(callback, "callback");
        this.colors = colors;
        this.isRound = z;
        this.callback = callback;
        this.rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1XIi
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.rv_delegate$lambda$0(this.f4342IO);
            }
        });
        this.dialSelect0$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO11XXI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.dialSelect0_delegate$lambda$0(this.f1760IO);
            }
        });
        this.dialSelect1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOXOi0i0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.dialSelect1_delegate$lambda$0(this.f3340IO);
            }
        });
        this.dialSelect2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0OX11
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.dialSelect2_delegate$lambda$0(this.f2510IO);
            }
        });
        this.dialSelect3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiO00
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.dialSelect3_delegate$lambda$0(this.f8595IO);
            }
        });
        this.dialSelectStatus0$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOi11
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.dialSelectStatus0_delegate$lambda$0(this.f1893IO);
            }
        });
        this.dialSelectStatus1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0OiXIOI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.dialSelectStatus1_delegate$lambda$0(this.f2521IO);
            }
        });
        this.dialSelectStatus2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO1i0IO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.dialSelectStatus2_delegate$lambda$0(this.f1778IO);
            }
        });
        this.dialSelectStatus3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O11XO0i
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.dialSelectStatus3_delegate$lambda$0(this.f2684IO);
            }
        });
        this.ivDialSelect0$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii1OII0I0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.ivDialSelect0_delegate$lambda$0(this.f8557IO);
            }
        });
        this.ivDialSelect1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX1OXIOi
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.ivDialSelect1_delegate$lambda$0(this.f1974IO);
            }
        });
        this.ivDialSelect2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIXiOO1X
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.ivDialSelect2_delegate$lambda$0(this.f3061IO);
            }
        });
        this.ivDialSelect3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX1iX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ControlElementFragment.ivDialSelect3_delegate$lambda$0(this.f3448IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout dialSelect0_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (LinearLayout) controlElementFragment.getMView().findViewById(R.id.dialSelect0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout dialSelect1_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (LinearLayout) controlElementFragment.getMView().findViewById(R.id.dialSelect1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout dialSelect2_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (LinearLayout) controlElementFragment.getMView().findViewById(R.id.dialSelect2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout dialSelect3_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (LinearLayout) controlElementFragment.getMView().findViewById(R.id.dialSelect3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView dialSelectStatus0_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (ImageView) controlElementFragment.getMView().findViewById(R.id.dialSelectStatus0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView dialSelectStatus1_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (ImageView) controlElementFragment.getMView().findViewById(R.id.dialSelectStatus1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView dialSelectStatus2_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (ImageView) controlElementFragment.getMView().findViewById(R.id.dialSelectStatus2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView dialSelectStatus3_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (ImageView) controlElementFragment.getMView().findViewById(R.id.dialSelectStatus3);
    }

    private final RecyclerView getRv() {
        return (RecyclerView) this.rv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(ControlElementFragment controlElementFragment, View view) {
        View.OnClickListener mOnViewClickListener = controlElementFragment.getMOnViewClickListener();
        if (mOnViewClickListener != null) {
            mOnViewClickListener.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(ControlElementFragment controlElementFragment, View view) {
        View.OnClickListener mOnViewClickListener = controlElementFragment.getMOnViewClickListener();
        if (mOnViewClickListener != null) {
            mOnViewClickListener.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(ControlElementFragment controlElementFragment, View view) {
        View.OnClickListener mOnViewClickListener = controlElementFragment.getMOnViewClickListener();
        if (mOnViewClickListener != null) {
            mOnViewClickListener.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(ControlElementFragment controlElementFragment, View view) {
        View.OnClickListener mOnViewClickListener = controlElementFragment.getMOnViewClickListener();
        if (mOnViewClickListener != null) {
            mOnViewClickListener.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivDialSelect0_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (ImageView) controlElementFragment.getMView().findViewById(R.id.ivDialSelect0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivDialSelect1_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (ImageView) controlElementFragment.getMView().findViewById(R.id.ivDialSelect1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivDialSelect2_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (ImageView) controlElementFragment.getMView().findViewById(R.id.ivDialSelect2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivDialSelect3_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (ImageView) controlElementFragment.getMView().findViewById(R.id.ivDialSelect3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_delegate$lambda$0(ControlElementFragment controlElementFragment) {
        return (RecyclerView) controlElementFragment.getMView().findViewById(R.id.f51422rv);
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
        return (LinearLayout) this.dialSelect0$delegate.getValue();
    }

    public final LinearLayout getDialSelect1() {
        return (LinearLayout) this.dialSelect1$delegate.getValue();
    }

    public final LinearLayout getDialSelect2() {
        return (LinearLayout) this.dialSelect2$delegate.getValue();
    }

    public final LinearLayout getDialSelect3() {
        return (LinearLayout) this.dialSelect3$delegate.getValue();
    }

    public final ImageView getDialSelectStatus0() {
        return (ImageView) this.dialSelectStatus0$delegate.getValue();
    }

    public final ImageView getDialSelectStatus1() {
        return (ImageView) this.dialSelectStatus1$delegate.getValue();
    }

    public final ImageView getDialSelectStatus2() {
        return (ImageView) this.dialSelectStatus2$delegate.getValue();
    }

    public final ImageView getDialSelectStatus3() {
        return (ImageView) this.dialSelectStatus3$delegate.getValue();
    }

    public final ImageView getIvDialSelect0() {
        return (ImageView) this.ivDialSelect0$delegate.getValue();
    }

    public final ImageView getIvDialSelect1() {
        return (ImageView) this.ivDialSelect1$delegate.getValue();
    }

    public final ImageView getIvDialSelect2() {
        return (ImageView) this.ivDialSelect2$delegate.getValue();
    }

    public final ImageView getIvDialSelect3() {
        return (ImageView) this.ivDialSelect3$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (this.isRound) {
            getIvDialSelect0().setBackgroundResource(R.drawable.shape_dial_control_bg);
            getIvDialSelect1().setBackgroundResource(R.drawable.shape_dial_control_bg);
            getIvDialSelect2().setBackgroundResource(R.drawable.shape_dial_control_bg);
            getIvDialSelect3().setBackgroundResource(R.drawable.shape_dial_control_bg);
        } else {
            getIvDialSelect0().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
            getIvDialSelect1().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
            getIvDialSelect2().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
            getIvDialSelect3().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
        }
        RecyclerView rv = getRv();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(0);
        rv.setLayoutManager(linearLayoutManager);
        getRv().setAdapter(new C188302(getActivity(), this.colors));
        getDialSelect0().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OO10ii0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlElementFragment.initView$lambda$1(this.f3172IO, view);
            }
        });
        getDialSelect1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iiiOXX1XI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlElementFragment.initView$lambda$2(this.f8680IO, view);
            }
        });
        getDialSelect2().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O1OOiXOI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlElementFragment.initView$lambda$3(this.f2753IO, view);
            }
        });
        getDialSelect3().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I001IIIOO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ControlElementFragment.initView$lambda$4(this.f1010IO, view);
            }
        });
    }

    public final boolean isRound() {
        return this.isRound;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.layout_watchface_control;
    }

    @Override // com.sma.smartv3.p610ui.device.watchface.fragment.BaseElementFragment
    public void reset() {
        RecyclerView.Adapter adapter = getRv().getAdapter();
        Intrinsics.X1ii(adapter, "null cannot be cast to non-null type com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter<com.sma.smartv3.model.ResourcesIdInfo>");
        CommonAdapter commonAdapter = (CommonAdapter) adapter;
        Iterable datas = commonAdapter.getDatas();
        Intrinsics.O10IXXX0X(datas, "getDatas(...)");
        Iterator it = datas.iterator();
        while (it.hasNext()) {
            ((ResourcesIdInfo) it.next()).setSelect(false);
        }
        commonAdapter.notifyDataSetChanged();
    }
}
