package com.sma.smartv3.pop.dial;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.mltcode.paycertificationapi.II01IOiX;
import com.android.mltcode.paycertificationapi.IXI0O;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.ResourcesIdInfo;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BaseDialPop$adapter$1 extends CommonAdapter<ResourcesIdInfo> {
    final /* synthetic */ II01IOiX<Integer> $callback;

    public BaseDialPop$adapter$1(Activity r1, List<ResourcesIdInfo> r2, II01IOiX<Integer> r3) {
        this.$callback = r3;
        super(r1, R.layout.item_color_select, r2);
    }

    public static /* synthetic */ void OXO1(BaseDialPop$adapter$1 r0, ResourcesIdInfo r1, II01IOiX r2, int r3, View r4) {
        convert$lambda$0(r0, r1, r2, r3, r4);
    }

    private static final void convert$lambda$0(BaseDialPop$adapter$1 r2, ResourcesIdInfo r3, II01IOiX r4, int r5, View r6) {
        Iterator r7 = r2.mDatas.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        ((ResourcesIdInfo) r7.next()).setSelect(false);
        goto L4
    L6:
        r3.setSelect(true);
        r4.OXO1(Integer.valueOf(r5));
        r2.notifyDataSetChanged();
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, ResourcesIdInfo r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r3, final ResourcesIdInfo r4, final int r5) {
        Intrinsics.X0O(r3, "holder");
        Intrinsics.X0O(r4, "resourcesIdInfo");
        ((ImageView) r3.getView(R.id.colorIv)).setImageResource(r4.getResId());
        ImageView r0 = (ImageView) r3.getView(R.id.selectStatus);
        if (r4.isSelect() == false) goto L5;
        int r1 = 0;
    L6:
        r0.setVisibility(r1);
        RelativeLayout r6 = (RelativeLayout) r3.getView(R.id.rv);
        final II01IOiX<Integer> r2 = this.$callback;
        r6.setOnClickListener(new IXI0O(this, r4, r2, r5));
        return;
    L5:
        r1 = 8;
        goto L6
    }
}
