package com.sma.smartv3.ui.status;

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

    @aa1
    private final PaceProgressBar pb;

    @aa1
    private final DINCondBold tvPace;

    public SportRecordDetailSpeedViewHolder(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        super(r3);
        View r0 = r3.findViewById(R.id.number);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        this.number = (DINCondBold) r0;
        View r1 = r3.findViewById(R.id.pb);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        this.pb = (PaceProgressBar) r1;
        View r4 = r3.findViewById(R.id.tvPace);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.tvPace = (DINCondBold) r4;
    }

    @aa1
    public final DINCondBold getNumber() {
        return this.number;
    }

    @aa1
    public final PaceProgressBar getPb() {
        return this.pb;
    }

    @aa1
    public final DINCondBold getTvPace() {
        return this.tvPace;
    }
}
