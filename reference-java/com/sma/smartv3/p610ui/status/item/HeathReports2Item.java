package com.sma.smartv3.p610ui.status.item;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.angcyo.dsladapter.DslViewHolder;
import com.sma.smartv3.p610ui.device.item.BaseDeviceItem;
import com.sma.smartv3.p610ui.status.item.HeathReports2Item;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.HeathReportsUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HeathReports2Item extends BaseDeviceItem {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(View it) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(it, "it");
        HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
        Context context = it.getContext();
        Intrinsics.X1ii(context, "null cannot be cast to non-null type android.app.Activity");
        heathReportsUtils.O0O((Activity) context, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOii1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HeathReports2Item.bindView$lambda$0$0(((Boolean) obj).booleanValue());
            }
        }, heathReportsUtils.IXXOO());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0$0(boolean z) {
        return Unit.OXO1;
    }

    private final void setViewBg(View view, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        gradientDrawable.setColor(gk4.O00(view.getContext(), R.color.view_page_main_bg_v2));
        view.setBackground(gradientDrawable);
    }

    public static /* synthetic */ void setViewBg$default(HeathReports2Item heathReports2Item, View view, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 15.0f;
        }
        heathReports2Item.setViewBg(view, f);
    }

    @Override // com.sma.smartv3.p610ui.device.item.BaseDeviceItem, com.bestmafen.androidbase.dsl.BaseDslItem
    @CallSuper
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.bindView(itemHolder);
        View viewM3483v = itemHolder.m3483v(R.id.tv_heath_reports);
        Intrinsics.XXI(viewM3483v);
        setViewBg$default(this, (TextView) viewM3483v, 0.0f, 2, null);
        itemHolder.clickItem(new Function1() { // from class: com.android.mltcode.paycertificationapi.i0IOI0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HeathReports2Item.bindView$lambda$0((View) obj);
            }
        });
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.heath_reports2_item;
    }
}
