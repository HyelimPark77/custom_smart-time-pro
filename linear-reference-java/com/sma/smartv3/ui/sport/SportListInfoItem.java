package com.sma.smartv3.ui.sport;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportListInfoItem extends BaseDslItem {
    private final int iconResID;
    private final int mode;
    private final int textResID;

    public SportListInfoItem(int r1, int r2, int r3) {
        this.mode = r1;
        this.iconResID = r2;
        this.textResID = r3;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        TintImageView r0 = (TintImageView) r3.v(R.id.iv);
        if (r0 == null) goto L5;
        r0.setImageResource(this.iconResID);
    L5:
        TextView r4 = r3.tv(R.id.tv_left);
        if (r4 == null) goto L9;
        r4.setText(this.textResID);
        return;
    }

    public final int getIconResID() {
        return this.iconResID;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getTextResID() {
        return this.textResID;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.sport_type_info_item;
    }
}
