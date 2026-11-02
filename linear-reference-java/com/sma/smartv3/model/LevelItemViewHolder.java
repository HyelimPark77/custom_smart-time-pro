package com.sma.smartv3.model;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LevelItemViewHolder extends RecyclerView.ViewHolder {

    @aa1
    private final ImageView iv;

    @aa1
    private final LinearLayout llLevelPanel;

    @aa1
    private final DINCondBold tv;

    public LevelItemViewHolder(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        super(r3);
        View r0 = r3.findViewById(R.id.tv);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        this.tv = (DINCondBold) r0;
        View r1 = r3.findViewById(R.id.iv);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        this.iv = (ImageView) r1;
        View r4 = r3.findViewById(R.id.llLevelPanel);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.llLevelPanel = (LinearLayout) r4;
    }

    @aa1
    public final ImageView getIv() {
        return this.iv;
    }

    @aa1
    public final LinearLayout getLlLevelPanel() {
        return this.llLevelPanel;
    }

    @aa1
    public final DINCondBold getTv() {
        return this.tv;
    }
}
