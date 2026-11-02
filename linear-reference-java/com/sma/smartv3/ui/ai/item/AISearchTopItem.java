package com.sma.smartv3.ui.ai.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AIGridSpacingItemDecoration;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAISearchTopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AISearchTopItem.kt\ncom/sma/smartv3/ui/ai/item/AISearchTopItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public class AISearchTopItem extends BaseDslItem {
    public Context mContext;
    private RecyclerView mHotrv;

    @aa1
    private List<String> mList;
    private TextView mRecordsCleartv;
    private RecyclerView mRecordsrv;
    private TextView mRecordstv;

    public AISearchTopItem(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "mList");
        this.mList = r2;
    }

    public static /* synthetic */ void O00(View r0) {
        bindView$lambda$0(r0);
    }

    private static final void bindView$lambda$0(View r1) {
        I01XX0.OXO1(I01XX0.X11I, "");
    }

    public static /* synthetic */ void setRecyclerView$default(AISearchTopItem r0, RecyclerView r1, int r2, List r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r2 = 3;
    L6:
        r0.setRecyclerView(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRecyclerView");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r4) {
        Intrinsics.X0O(r4, "itemHolder");
        View r0 = r4.v(R.id.search_func_records_tv);
        Intrinsics.XXI(r0);
        TextView r1 = (TextView) r0;
        this.mRecordstv = r1;
        TextView r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mRecordstv");
        r1 = null;
    L5:
        Context r3 = r1.getContext();
        Intrinsics.O10IXXX0X(r3, "getContext(...)");
        setMContext(r3);
        View r5 = r4.v(R.id.search_func_records_rv);
        Intrinsics.XXI(r5);
        this.mRecordsrv = (RecyclerView) r5;
        View r6 = r4.v(R.id.search_func_hot_rv);
        Intrinsics.XXI(r6);
        this.mHotrv = (RecyclerView) r6;
        View r7 = r4.v(R.id.search_records_clear_tv);
        Intrinsics.XXI(r7);
        TextView r8 = (TextView) r7;
        this.mRecordsCleartv = r8;
        if (r8 != null) goto L8;
        Intrinsics.XXO("mRecordsCleartv");
    L9:
        r2.setOnClickListener(new O0i());
        return;
    L8:
        r2 = r8;
        goto L9
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    @aa1
    public final List<String> getMList() {
        return this.mList;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        String[] r0 = getMContext().getResources().getStringArray(R.array.search_hot);
        Intrinsics.O10IXXX0X(r0, "getStringArray(...)");
        List r5 = ArraysKt___ArraysKt.OXI0X0(r0);
        q62 r1 = q62.OXO1;
        int r8 = 0;
        TextView r9 = null;
        if (r1.XIi10().length() <= 0) goto L5;
        setTitle(r1.XIi10());
    L6:
        RecyclerView r2 = this.mHotrv;
        if (r2 != null) goto L9;
        Intrinsics.XXO("mHotrv");
        RecyclerView r3 = null;
    L10:
        setRecyclerView$default(this, r3, 0, r5, 2, null);
        TextView r4 = this.mRecordstv;
        if (r4 != null) goto L13;
        Intrinsics.XXO("mRecordstv");
        r4 = null;
    L13:
        List<String> r6 = this.mList;
        if (r6 != null) goto L16;
    L28:
        RecyclerView r7 = this.mRecordsrv;
        if (r7 != null) goto L31;
        Intrinsics.XXO("mRecordsrv");
        r7 = null;
    L31:
        r8 = 8;
        r7.setVisibility(8);
        TextView r10 = this.mRecordsCleartv;
        if (r10 != null) goto L34;
        Intrinsics.XXO("mRecordsCleartv");
    L35:
        r9.setVisibility(8);
    L36:
        r4.setVisibility(r8);
        return;
    L34:
        r9 = r10;
        goto L35
    L16:
        if (r6.isEmpty() == true) goto L28;
        RecyclerView r11 = this.mRecordsrv;
        if (r11 != null) goto L20;
        Intrinsics.XXO("mRecordsrv");
        r11 = null;
    L20:
        r11.setVisibility(0);
        RecyclerView r12 = this.mRecordsrv;
        if (r12 != null) goto L23;
        Intrinsics.XXO("mRecordsrv");
        r12 = null;
    L23:
        setRecyclerView(r12, 3, this.mList);
        TextView r13 = this.mRecordsCleartv;
        if (r13 != null) goto L26;
        Intrinsics.XXO("mRecordsCleartv");
    L27:
        r9.setVisibility(0);
        goto L36
    L26:
        r9 = r13;
        goto L27
    L9:
        r3 = r2;
        goto L10
    L5:
        setTitle(AIManager.O10IXXX0X(AIManager.OXO1, 0, 1, null));
        goto L6
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_search_top;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public final void setMList(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    public final void setRecyclerView(@aa1 RecyclerView r3, int r4, @aa1 List<String> r5) {
        Intrinsics.X0O(r3, "mRecyclerView");
        Intrinsics.X0O(r5, "list");
        r3.setLayoutManager(new GridLayoutManager(getMContext(), r4));
        r3.setAdapter(new AISearchTopItem$setRecyclerView$mAdapter$1(r5, getMContext()));
        if (r3.getItemDecorationCount() != 0) goto L6;
        r3.addItemDecoration(new AIGridSpacingItemDecoration(r4, SizeUtils.dp2px(15.0f)));
        return;
    }

    @aa1
    public final String setTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "titleStr");
        return AIManager.OXO1.iOiXi11II(r2);
    }
}
