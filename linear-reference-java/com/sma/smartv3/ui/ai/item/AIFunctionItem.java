package com.sma.smartv3.ui.ai.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AIFunctionItem extends BaseDslItem {
    private final int type;

    public AIFunctionItem() {
        int r2 = 0;
        this(r2, 1, null);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r5) {
        Intrinsics.X0O(r5, "itemHolder");
        Object r0 = getItemData();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction");
        AIFunction r1 = (AIFunction) r0;
        View r2 = r5.itemView;
        if (this.type != 0) goto L5;
        r2.setBackgroundResource(r1.getBg());
    L5:
        Intrinsics.XXI(r2);
        UtilsKt.IX1XiI(r2, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        ImageView r3 = r5.img(R.id.iv);
        if (r3 == null) goto L8;
        r3.setImageResource(r1.getIcon());
    L8:
        TextView r4 = r5.tv(R.id.tv_title);
        TextView r6 = r5.tv(R.id.tv_desc);
        if (r4 == null) goto L11;
        r4.setText(r1.getTitle());
    L11:
        if (r6 == null) goto L14;
        r6.setText(r1.getDesc());
    L14:
        if (r1.isHot() == true) goto L16;
    L23:
        if (r6 == null) goto L27;
        r6.setTextColor(gk4.iO(r5.getContext(), R.color.line_color));
        return;
    L27:
        return;
    L16:
        if (this.type != 0) goto L23;
        if (r4 == null) goto L20;
        r4.setTextColor(gk4.iO(r5.getContext(), R.color.white));
    L20:
        if (r6 == null) goto L26;
        r6.setTextColor(gk4.iO(r5.getContext(), R.color.white));
        return;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_function;
    }

    public AIFunctionItem(int r1) {
        this.type = r1;
    }

    public /* synthetic */ AIFunctionItem(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
