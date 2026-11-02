package com.sma.smartv3.pop;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I0OIO1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.pop.MessageListV2Popup;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MessageListV2Popup extends I0OIO1i {

    @aa1
    public final RecyclerView I0IIOi;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final CommonAdapter<String> f51370IO;

    @tb1
    public OXO1 OIX0iXi;

    @aa1
    public final TextView OIi0;

    /* JADX INFO: renamed from: com.sma.smartv3.pop.MessageListV2Popup$2 */
    public static final class C186382 extends CommonAdapter<String> {
        final /* synthetic */ MessageListV2Popup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186382(Activity activity, List<String> list, MessageListV2Popup messageListV2Popup) {
            super(activity, R.layout.pop_list_tv_item, list);
            this.this$0 = messageListV2Popup;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(MessageListV2Popup messageListV2Popup, int i, String str, View view) {
            OXO1 oxo1OII = messageListV2Popup.OII();
            if (oxo1OII != null) {
                oxo1OII.OXO1(i, str);
            }
            messageListV2Popup.dismiss();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, final String item, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(item, "item");
            holder.setText(R.id.pop_tv, item);
            View view = holder.itemView;
            final MessageListV2Popup messageListV2Popup = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.do0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MessageListV2Popup.C186382.convert$lambda$0(messageListV2Popup, i, item, view2);
                }
            });
        }
    }

    public interface OXO1 {
        void OXO1(int i, @aa1 String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListV2Popup(@aa1 Activity activity, int i, @aa1 List<String> mData) {
        super(activity);
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(mData, "mData");
        LayoutInflater.from(XO0O10()).inflate(i, IiI10X());
        View viewFindViewById = IiI10X().findViewById(R.id.list);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.I0IIOi = recyclerView;
        View viewFindViewById2 = IiI10X().findViewById(R.id.abh_pop_cancel);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.OIi0 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.co0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageListV2Popup.XiOIii1(this.f6015IO, view);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(XO0O10()));
        C186382 c186382 = new C186382(activity, mData, this);
        this.f51370IO = c186382;
        recyclerView.setAdapter(c186382);
    }

    public static final void XiOIii1(MessageListV2Popup messageListV2Popup, View view) {
        messageListV2Popup.dismiss();
    }

    @tb1
    public final OXO1 OII() {
        return this.OIX0iXi;
    }

    /* JADX INFO: renamed from: OX */
    public final void m38292OX(@tb1 OXO1 oxo1) {
        this.OIX0iXi = oxo1;
    }

    public /* synthetic */ MessageListV2Popup(Activity activity, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i2 & 2) != 0 ? R.layout.pop_message_list_v2 : i, list);
    }
}
