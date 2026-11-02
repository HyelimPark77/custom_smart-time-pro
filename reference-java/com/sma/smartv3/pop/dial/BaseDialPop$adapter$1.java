package com.sma.smartv3.pop.dial;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.mltcode.paycertificationapi.II01IOiX;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pop.dial.BaseDialPop$adapter$1;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BaseDialPop$adapter$1 extends CommonAdapter<ResourcesIdInfo> {
    final /* synthetic */ II01IOiX<Integer> $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDialPop$adapter$1(Activity activity, List<ResourcesIdInfo> list, II01IOiX<Integer> iI01IOiX) {
        super(activity, R.layout.item_color_select, list);
        this.$callback = iI01IOiX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$0(BaseDialPop$adapter$1 baseDialPop$adapter$1, ResourcesIdInfo resourcesIdInfo, II01IOiX iI01IOiX, int i, View view) {
        Iterator it = ((CommonAdapter) baseDialPop$adapter$1).mDatas.iterator();
        while (it.hasNext()) {
            ((ResourcesIdInfo) it.next()).setSelect(false);
        }
        resourcesIdInfo.setSelect(true);
        iI01IOiX.OXO1(Integer.valueOf(i));
        baseDialPop$adapter$1.notifyDataSetChanged();
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder holder, final ResourcesIdInfo resourcesIdInfo, final int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(resourcesIdInfo, "resourcesIdInfo");
        ((ImageView) holder.getView(R.id.colorIv)).setImageResource(resourcesIdInfo.getResId());
        ((ImageView) holder.getView(R.id.selectStatus)).setVisibility(resourcesIdInfo.isSelect() ? 0 : 8);
        RelativeLayout relativeLayout = (RelativeLayout) holder.getView(R.id.f51422rv);
        final II01IOiX<Integer> iI01IOiX = this.$callback;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IXI0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseDialPop$adapter$1.convert$lambda$0(this.f1994IO, resourcesIdInfo, iI01IOiX, i, view);
            }
        });
    }
}
