package com.sma.smartv3.p610ui.device.watchface.fragment;

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
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.p610ui.device.watchface.fragment.TimeElementFragment;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.watchface.fragment.TimeElementFragment$initView$2 */
    @SourceDebugExtension({"SMAP\nTimeElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment$initView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1878#2,3:80\n*S KotlinDebug\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment$initView$2\n*L\n52#1:80,3\n*E\n"})
    public static final class C188352 extends CommonAdapter<ResourcesIdInfo> {
        public C188352(FragmentActivity fragmentActivity, List<ResourcesIdInfo> list) {
            super(fragmentActivity, R.layout.item_watchface_element_color_select, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(C188352 c188352, int i, TimeElementFragment timeElementFragment, View view) {
            Iterable mDatas = ((CommonAdapter) c188352).mDatas;
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
            boolean zIsSelect = ((ResourcesIdInfo) ((CommonAdapter) c188352).mDatas.get(i)).isSelect();
            timeElementFragment.getDialSelectStatus0().setVisibility(zIsSelect ? 0 : 8);
            timeElementFragment.getCallback().OXO1(Integer.valueOf(i), zIsSelect);
            c188352.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, ResourcesIdInfo resourcesIdInfo, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(resourcesIdInfo, "resourcesIdInfo");
            ((ImageView) holder.getView(R.id.colorIv)).setImageResource(resourcesIdInfo.getResId());
            ((ImageView) holder.getView(R.id.selectStatus)).setVisibility(resourcesIdInfo.isSelect() ? 0 : 8);
            RelativeLayout relativeLayout = (RelativeLayout) holder.getView(R.id.f51422rv);
            final TimeElementFragment timeElementFragment = TimeElementFragment.this;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ys5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TimeElementFragment.C188352.convert$lambda$0(this.f12444IO, i, timeElementFragment, view);
                }
            });
        }
    }

    public TimeElementFragment(@aa1 List<ResourcesIdInfo> colors, boolean z, @aa1 IXI011X11<Integer> callback) {
        Intrinsics.X0O(colors, "colors");
        Intrinsics.X0O(callback, "callback");
        this.colors = colors;
        this.isRound = z;
        this.callback = callback;
        this.dialSelect0$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.us5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return TimeElementFragment.dialSelect0_delegate$lambda$0(this.f11562IO);
            }
        });
        this.dialSelectStatus0$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vs5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return TimeElementFragment.dialSelectStatus0_delegate$lambda$0(this.f11804IO);
            }
        });
        this.rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ws5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return TimeElementFragment.rv_delegate$lambda$0(this.f12026IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout dialSelect0_delegate$lambda$0(TimeElementFragment timeElementFragment) {
        return (RelativeLayout) timeElementFragment.getMView().findViewById(R.id.dialSelect0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView dialSelectStatus0_delegate$lambda$0(TimeElementFragment timeElementFragment) {
        return (ImageView) timeElementFragment.getMView().findViewById(R.id.dialSelectStatus0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(TimeElementFragment timeElementFragment, View view) {
        View.OnClickListener mOnViewClickListener = timeElementFragment.getMOnViewClickListener();
        if (mOnViewClickListener != null) {
            mOnViewClickListener.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_delegate$lambda$0(TimeElementFragment timeElementFragment) {
        return (RecyclerView) timeElementFragment.getMView().findViewById(R.id.f51422rv);
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
        return (RelativeLayout) this.dialSelect0$delegate.getValue();
    }

    public final ImageView getDialSelectStatus0() {
        return (ImageView) this.dialSelectStatus0$delegate.getValue();
    }

    public final RecyclerView getRv() {
        return (RecyclerView) this.rv$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (this.isRound) {
            getDialSelect0().setBackgroundResource(R.drawable.shape_dial_control_bg);
        } else {
            getDialSelect0().setBackgroundResource(R.drawable.shape_dial_control_bg_r);
        }
        RecyclerView rv = getRv();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(0);
        rv.setLayoutManager(linearLayoutManager);
        getRv().setAdapter(new C188352(getActivity(), this.colors));
        getDialSelect0().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimeElementFragment.initView$lambda$1(this.f12228IO, view);
            }
        });
    }

    public final boolean isRound() {
        return this.isRound;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.layout_watchface_time;
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
        getDialSelectStatus0().setVisibility(8);
    }
}
