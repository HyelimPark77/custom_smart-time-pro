package com.sma.smartv3.ui.me.item;

import android.view.View;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class MeMiddle2Item extends BaseDslItem {
    private View btUserInfo;
    private final boolean initEvent;

    @tb1
    private View.OnClickListener mOnClick;

    public MeMiddle2Item() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r4) {
        Intrinsics.X0O(r4, "itemHolder");
        View r1 = r4.v(R.id.btUserInfo);
        Intrinsics.XXI(r1);
        this.btUserInfo = r1;
        r4.click(R.id.btGoal, this.mOnClick);
        r4.click(R.id.btUserInfo, this.mOnClick);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @tb1
    public final View.OnClickListener getMOnClick() {
        return this.mOnClick;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_me_item_middle;
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void onBindStateChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }

    public final void setMOnClick(@tb1 View.OnClickListener r1) {
        this.mOnClick = r1;
    }
}
