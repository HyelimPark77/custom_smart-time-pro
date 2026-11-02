package com.sma.smartv3.pop;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I0OIO1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.co0;
import com.android.mltcode.paycertificationapi.do0;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MessageListV2Popup extends I0OIO1i {

    @aa1
    public final RecyclerView I0IIOi;

    @aa1
    public final CommonAdapter<String> IO;

    @tb1
    public OXO1 OIX0iXi;

    @aa1
    public final TextView OIi0;

    /* JADX INFO: renamed from: com.sma.smartv3.pop.MessageListV2Popup$2, reason: invalid class name */
    public static final class AnonymousClass2 extends CommonAdapter<String> {
        final /* synthetic */ MessageListV2Popup this$0;

        public AnonymousClass2(Activity r1, List<String> r2, MessageListV2Popup r3) {
            this.this$0 = r3;
            super(r1, R.layout.pop_list_tv_item, r2);
        }

        public static /* synthetic */ void OXO1(MessageListV2Popup r0, int r1, String r2, View r3) {
            convert$lambda$0(r0, r1, r2, r3);
        }

        private static final void convert$lambda$0(MessageListV2Popup r0, int r1, String r2, View r3) {
            OXO1 r4 = r0.OII();
            if (r4 == null) goto L5;
            r4.OXO1(r1, r2);
        L5:
            r0.dismiss();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, String r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r3, final String r4, final int r5) {
            Intrinsics.X0O(r3, "holder");
            Intrinsics.X0O(r4, MapController.ITEM_LAYER_TAG);
            r3.setText(R.id.pop_tv, r4);
            View r6 = r3.itemView;
            final MessageListV2Popup r0 = this.this$0;
            r6.setOnClickListener(new do0(r0, r5, r4));
        }
    }

    public interface OXO1 {
        void OXO1(int r1, @aa1 String r2);
    }

    public MessageListV2Popup(@aa1 Activity r4, int r5, @aa1 List<String> r6) {
        Intrinsics.X0O(r4, "activity");
        Intrinsics.X0O(r6, "mData");
        super(r4);
        LayoutInflater.from(XO0O10()).inflate(r5, IiI10X());
        View r7 = IiI10X().findViewById(R.id.list);
        Intrinsics.O10IXXX0X(r7, "findViewById(...)");
        RecyclerView r8 = (RecyclerView) r7;
        this.I0IIOi = r8;
        View r1 = IiI10X().findViewById(R.id.abh_pop_cancel);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        TextView r2 = (TextView) r1;
        this.OIi0 = r2;
        r2.setOnClickListener(new co0(this));
        r8.setLayoutManager(new LinearLayoutManager(XO0O10()));
        AnonymousClass2 r0 = new AnonymousClass2(r4, r6, this);
        this.IO = r0;
        r8.setAdapter(r0);
    }

    public static /* synthetic */ void OiIIX101O(MessageListV2Popup r0, View r1) {
        XiOIii1(r0, r1);
    }

    public static final void XiOIii1(MessageListV2Popup r0, View r1) {
        r0.dismiss();
    }

    @tb1
    public final OXO1 OII() {
        return this.OIX0iXi;
    }

    public final void OX(@tb1 OXO1 r1) {
        this.OIX0iXi = r1;
    }

    public /* synthetic */ MessageListV2Popup(Activity r1, int r2, List r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = R.layout.pop_message_list_v2;
    L5:
        this(r1, r2, r3);
    }
}
