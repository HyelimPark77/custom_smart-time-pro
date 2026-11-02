package com.sma.smartv3.ui.status.item;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.OOii1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0IOI0X;
import com.angcyo.dsladapter.DslViewHolder;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.item.BaseDeviceItem;
import com.sma.smartv3.util.HeathReportsUtils;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HeathReports2Item extends BaseDeviceItem {
    public HeathReports2Item() {
    }

    public static /* synthetic */ Unit IiI10X(View r0) {
        return bindView$lambda$0(r0);
    }

    public static /* synthetic */ Unit O00(boolean r0) {
        return bindView$lambda$0$0(r0);
    }

    private static final Unit bindView$lambda$0(View r3) {
        Intrinsics.X0O(r3, "it");
        HeathReportsUtils r0 = HeathReportsUtils.OXO1;
        Context r4 = r3.getContext();
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type android.app.Activity");
        r0.O0O((Activity) r4, new OOii1(), r0.IXXOO());
        return Unit.OXO1;
    }

    private static final Unit bindView$lambda$0$0(boolean r0) {
        return Unit.OXO1;
    }

    private final void setViewBg(View r4, float r5) {
        GradientDrawable r0 = new GradientDrawable();
        r0.setCornerRadii(new float[]{r5, r5, r5, r5, r5, r5, r5, r5});
        r0.setColor(gk4.O00(r4.getContext(), R.color.view_page_main_bg_v2));
        r4.setBackground(r0);
    }

    public static /* synthetic */ void setViewBg$default(HeathReports2Item r0, View r1, float r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 15.0f;
    L5:
        r0.setViewBg(r1, r2);
    }

    @Override // com.sma.smartv3.ui.device.item.BaseDeviceItem, com.bestmafen.androidbase.dsl.BaseDslItem
    @CallSuper
    public void bindView(@aa1 DslViewHolder r5) {
        Intrinsics.X0O(r5, "itemHolder");
        super.bindView(r5);
        View r0 = r5.v(R.id.tv_heath_reports);
        Intrinsics.XXI(r0);
        setViewBg$default(this, (TextView) r0, 0.0f, 2, null);
        r5.clickItem(new i0IOI0X());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.heath_reports2_item;
    }
}
