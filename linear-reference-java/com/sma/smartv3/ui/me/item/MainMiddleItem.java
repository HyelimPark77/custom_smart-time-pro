package com.sma.smartv3.ui.me.item;

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
    private final boolean initEvent;

    @tb1
    private ImageView ivContactUs;

    @tb1
    private View.OnClickListener mOnClick;

    public MainMiddleItem() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r7) {
        Intrinsics.X0O(r7, "itemHolder");
        View r1 = r7.v(R.id.btHelp);
        Intrinsics.XXI(r1);
        this.btHelp = (LinearLayout) r1;
        View r2 = r7.v(R.id.btTalk);
        Intrinsics.XXI(r2);
        this.btTalk = (LinearLayout) r2;
        View r3 = r7.v(R.id.btContactUs);
        Intrinsics.XXI(r3);
        this.btContactUs = (LinearLayout) r3;
        View r4 = r7.v(R.id.btFAQ);
        Intrinsics.XXI(r4);
        this.btFAQ = (LinearLayout) r4;
        this.ivContactUs = (ImageView) r7.v(R.id.iv_contact_us);
        r7.click(R.id.btGoal, this.mOnClick);
        r7.click(R.id.btHelp, this.mOnClick);
        r7.click(R.id.btTalk, this.mOnClick);
        r7.click(R.id.btFAQ, this.mOnClick);
        r7.click(R.id.btContactUs, this.mOnClick);
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
        LinearLayout r0 = this.btHelp;
        LinearLayout r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("btHelp");
        r0 = null;
    L5:
        i72 r2 = i72.OXO1;
        int r4 = 8;
        if (r2.IX0IXOi() == false) goto L8;
        int r3 = 0;
    L9:
        r0.setVisibility(r3);
        LinearLayout r5 = this.btTalk;
        if (r5 != null) goto L13;
        Intrinsics.XXO("btTalk");
        r5 = null;
    L13:
        if (r2.iIX0i() == false) goto L15;
        int r6 = 0;
    L16:
        r5.setVisibility(r6);
        LinearLayout r7 = this.btContactUs;
        if (r7 != null) goto L20;
        Intrinsics.XXO("btContactUs");
        r7 = null;
    L20:
        if (r2.Oi() == false) goto L22;
        int r8 = 0;
    L23:
        r7.setVisibility(r8);
        if (q62.OXO1.i000X() == false) goto L28;
        r7.setVisibility(0);
        ImageView r9 = this.ivContactUs;
        if (r9 == null) goto L28;
        r9.setImageResource(R.drawable.icon_contact_us_ca19);
    L28:
        LinearLayout r10 = this.btFAQ;
        if (r10 != null) goto L31;
        Intrinsics.XXO("btFAQ");
    L33:
        if (r2.iOI() == false) goto L35;
        r4 = 0;
    L35:
        r1.setVisibility(r4);
        return;
    L31:
        r1 = r10;
        goto L33
    L22:
        r8 = 8;
        goto L23
    L15:
        r6 = 8;
        goto L16
    L8:
        r3 = 8;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.me_item_middle;
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
