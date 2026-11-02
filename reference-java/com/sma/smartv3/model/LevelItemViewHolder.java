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

    /* JADX INFO: renamed from: iv */
    @aa1
    private final ImageView f51312iv;

    @aa1
    private final LinearLayout llLevelPanel;

    /* JADX INFO: renamed from: tv */
    @aa1
    private final DINCondBold f51313tv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelItemViewHolder(@aa1 View view) {
        super(view);
        Intrinsics.X0O(view, "view");
        View viewFindViewById = view.findViewById(R.id.f51423tv);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f51313tv = (DINCondBold) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.f51417iv);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.f51312iv = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.llLevelPanel);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.llLevelPanel = (LinearLayout) viewFindViewById3;
    }

    @aa1
    public final ImageView getIv() {
        return this.f51312iv;
    }

    @aa1
    public final LinearLayout getLlLevelPanel() {
        return this.llLevelPanel;
    }

    @aa1
    public final DINCondBold getTv() {
        return this.f51313tv;
    }
}
