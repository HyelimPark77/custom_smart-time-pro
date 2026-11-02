package com.sma.smartv3.ui.device.dialpay.item;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDialClassItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialClassItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/DialClassItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class DialClassItem extends BaseDslItem {

    @aa1
    private final List<OnlineWatchFaceV2> categorys;
    public Context mContext;

    @tb1
    private OXO1 mOnItemClickListener;
    private RecyclerView mRecyclerView;

    public interface OXO1 {
        void OXO1(int r1);
    }

    public DialClassItem(@aa1 List<OnlineWatchFaceV2> r2) {
        Intrinsics.X0O(r2, "categorys");
        this.categorys = r2;
    }

    public static final /* synthetic */ void access$onAdapterClick(DialClassItem r0, int r1) {
        r0.onAdapterClick(r1);
    }

    private final void onAdapterClick(int r2) {
        OXO1 r0 = this.mOnItemClickListener;
        if (r0 == null) goto L6;
        r0.OXO1(r2);
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r6) {
        Intrinsics.X0O(r6, "itemHolder");
        View r7 = r6.v(R.id.my_class_recyclerView);
        Intrinsics.XXI(r7);
        RecyclerView r8 = (RecyclerView) r7;
        this.mRecyclerView = r8;
        RecyclerView r0 = null;
        if (r8 != null) goto L5;
        Intrinsics.XXO("mRecyclerView");
        r8 = null;
    L5:
        Context r9 = r8.getContext();
        Intrinsics.O10IXXX0X(r9, "getContext(...)");
        setMContext(r9);
        RecyclerView r10 = this.mRecyclerView;
        if (r10 != null) goto L8;
        Intrinsics.XXO("mRecyclerView");
        r10 = null;
    L8:
        r10.setLayoutManager(new LinearLayoutManager(getMContext(), 0, false));
        if (this.categorys.isEmpty() == true) goto L16;
        DialClassItem$bindView$mAdapter$1 r3 = new DialClassItem$bindView$mAdapter$1(this, getMContext(), this.categorys);
        RecyclerView r11 = this.mRecyclerView;
        if (r11 != null) goto L13;
        Intrinsics.XXO("mRecyclerView");
    L14:
        r0.setAdapter(r3);
        return;
    L13:
        r0 = r11;
        goto L14
    }

    @aa1
    public final List<OnlineWatchFaceV2> getCategorys() {
        return this.categorys;
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

    @tb1
    public final OXO1 getMOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.layout_online_watchface_class_head;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public final void setMOnItemClickListener(@tb1 OXO1 r1) {
        this.mOnItemClickListener = r1;
    }

    public final void setOnItemClickListener(@aa1 OXO1 r2) {
        Intrinsics.X0O(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.mOnItemClickListener = r2;
    }
}
