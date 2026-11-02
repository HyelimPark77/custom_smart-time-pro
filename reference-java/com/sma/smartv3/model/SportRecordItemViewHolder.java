package com.sma.smartv3.model;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class SportRecordItemViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: iv */
    @aa1
    private final ImageView f51322iv;

    /* JADX INFO: renamed from: tv */
    @aa1
    private final DINCondBold f51323tv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportRecordItemViewHolder(@aa1 View view) {
        super(view);
        Intrinsics.X0O(view, "view");
        View viewFindViewById = view.findViewById(R.id.f51423tv);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f51323tv = (DINCondBold) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.f51417iv);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.f51322iv = (ImageView) viewFindViewById2;
    }

    @aa1
    public final ImageView getIv() {
        return this.f51322iv;
    }

    @aa1
    public final DINCondBold getTv() {
        return this.f51323tv;
    }
}
