package com.sma.smartv3.p610ui.p612me.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class MainMiddleItem extends BaseDslItem {
    private LinearLayout btContactUs;
    private LinearLayout btFAQ;
    private LinearLayout btHelp;
    private LinearLayout btTalk;
    private final boolean initEvent = true;

    @tb1
    private ImageView ivContactUs;

    @tb1
    private View.OnClickListener mOnClick;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.btHelp);
        Intrinsics.XXI(viewM3483v);
        this.btHelp = (LinearLayout) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.btTalk);
        Intrinsics.XXI(viewM3483v2);
        this.btTalk = (LinearLayout) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.btContactUs);
        Intrinsics.XXI(viewM3483v3);
        this.btContactUs = (LinearLayout) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.btFAQ);
        Intrinsics.XXI(viewM3483v4);
        this.btFAQ = (LinearLayout) viewM3483v4;
        this.ivContactUs = (ImageView) itemHolder.m3483v(R.id.iv_contact_us);
        itemHolder.click(R.id.btGoal, this.mOnClick);
        itemHolder.click(R.id.btHelp, this.mOnClick);
        itemHolder.click(R.id.btTalk, this.mOnClick);
        itemHolder.click(R.id.btFAQ, this.mOnClick);
        itemHolder.click(R.id.btContactUs, this.mOnClick);
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
        LinearLayout linearLayout = this.btHelp;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.XXO("btHelp");
            linearLayout = null;
        }
        i72 i72Var = i72.OXO1;
        linearLayout.setVisibility(i72Var.IX0IXOi() ? 0 : 8);
        LinearLayout linearLayout3 = this.btTalk;
        if (linearLayout3 == null) {
            Intrinsics.XXO("btTalk");
            linearLayout3 = null;
        }
        linearLayout3.setVisibility(i72Var.iIX0i() ? 0 : 8);
        LinearLayout linearLayout4 = this.btContactUs;
        if (linearLayout4 == null) {
            Intrinsics.XXO("btContactUs");
            linearLayout4 = null;
        }
        linearLayout4.setVisibility(i72Var.m2050Oi() ? 0 : 8);
        if (q62.OXO1.i000X()) {
            linearLayout4.setVisibility(0);
            ImageView imageView = this.ivContactUs;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.icon_contact_us_ca19);
            }
        }
        LinearLayout linearLayout5 = this.btFAQ;
        if (linearLayout5 == null) {
            Intrinsics.XXO("btFAQ");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout2.setVisibility(i72Var.iOI() ? 0 : 8);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.me_item_middle;
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void onBindStateChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
    }

    public final void setMOnClick(@tb1 View.OnClickListener onClickListener) {
        this.mOnClick = onClickListener;
    }
}
