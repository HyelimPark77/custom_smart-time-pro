package com.sma.smartv3.p610ui.status;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.PaceProgressBar;
import com.sma.smartv3.view.text.DINCondBold;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportRecordDetailSpeedViewHolder extends RecyclerView.ViewHolder {

    @aa1
    private final DINCondBold number;

    /* JADX INFO: renamed from: pb */
    @aa1
    private final PaceProgressBar f54801pb;

    @aa1
    private final DINCondBold tvPace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportRecordDetailSpeedViewHolder(@aa1 View view) {
        super(view);
        Intrinsics.X0O(view, "view");
        View viewFindViewById = view.findViewById(R.id.number);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.number = (DINCondBold) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.f51421pb);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.f54801pb = (PaceProgressBar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tvPace);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.tvPace = (DINCondBold) viewFindViewById3;
    }

    @aa1
    public final DINCondBold getNumber() {
        return this.number;
    }

    @aa1
    public final PaceProgressBar getPb() {
        return this.f54801pb;
    }

    @aa1
    public final DINCondBold getTvPace() {
        return this.tvPace;
    }
}
