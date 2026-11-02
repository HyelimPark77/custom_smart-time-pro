package com.sma.smartv3.ui.status.item;

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
    private int height;
    private View view;

    public SpaceItem() {
        this.height = 20;
    }

    private final float dp2px(int r1) {
        return SizeUtils.dp2px(r1);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r3 = r2.v(R.id.view);
        Intrinsics.XXI(r3);
        this.view = r3;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        View r0 = this.view;
        View r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("view");
        r0 = null;
    L5:
        ViewGroup.LayoutParams r2 = r0.getLayoutParams();
        r2.height = (int) dp2px(this.height);
        View r3 = this.view;
        if (r3 != null) goto L8;
        Intrinsics.XXO("view");
    L9:
        r1.setLayoutParams(r2);
        return;
    L8:
        r1 = r3;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.alta_space_item;
    }

    public final void setHeight(int r1) {
        this.height = r1;
    }
}
