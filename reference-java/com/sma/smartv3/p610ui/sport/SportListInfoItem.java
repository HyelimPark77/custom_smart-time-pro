package com.sma.smartv3.p610ui.sport;

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

    public SportListInfoItem(int i, int i2, int i3) {
        this.mode = i;
        this.iconResID = i2;
        this.textResID = i3;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        TintImageView tintImageView = (TintImageView) itemHolder.m3483v(R.id.f51417iv);
        if (tintImageView != null) {
            tintImageView.setImageResource(this.iconResID);
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_left);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(this.textResID);
        }
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
