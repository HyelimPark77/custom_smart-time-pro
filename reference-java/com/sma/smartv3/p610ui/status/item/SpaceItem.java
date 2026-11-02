package com.sma.smartv3.p610ui.status.item;

import android.view.View;
import android.view.ViewGroup;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SpaceItem extends BaseDslItem {
    private int height = 20;
    private View view;

    private final float dp2px(int i) {
        return SizeUtils.dp2px(i);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.view);
        Intrinsics.XXI(viewM3483v);
        this.view = viewM3483v;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        View view = this.view;
        View view2 = null;
        if (view == null) {
            Intrinsics.XXO("view");
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) dp2px(this.height);
        View view3 = this.view;
        if (view3 == null) {
            Intrinsics.XXO("view");
        } else {
            view2 = view3;
        }
        view2.setLayoutParams(layoutParams);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.alta_space_item;
    }

    public final void setHeight(int i) {
        this.height = i;
    }
}
