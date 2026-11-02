package com.sma.smartv3.ui.status;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gv5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.w85;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.SportDetailV2Activity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTodayHealthyDataActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n69#2,3:172\n72#2,5:176\n69#2,3:181\n72#2,5:185\n69#2,3:190\n72#2,5:194\n69#2,3:199\n72#2,5:203\n69#2,3:208\n72#2,5:212\n69#2,3:217\n72#2,5:221\n69#2,3:226\n72#2,5:230\n69#2,3:235\n72#2,5:239\n69#2,3:244\n72#2,5:248\n69#2,3:253\n72#2,5:257\n87#2,7:262\n94#2,3:270\n70#2,7:273\n97#2:280\n1#3:175\n1#3:184\n1#3:193\n1#3:202\n1#3:211\n1#3:220\n1#3:229\n1#3:238\n1#3:247\n1#3:256\n1#3:269\n*S KotlinDebug\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1\n*L\n140#1:172,3\n140#1:176,5\n141#1:181,3\n141#1:185,5\n142#1:190,3\n142#1:194,5\n143#1:199,3\n143#1:203,5\n144#1:208,3\n144#1:212,5\n145#1:217,3\n145#1:221,5\n146#1:226,3\n146#1:230,5\n147#1:235,3\n147#1:239,5\n148#1:244,3\n148#1:248,5\n149#1:253,3\n149#1:257,5\n150#1:262,7\n150#1:270,3\n150#1:273,7\n150#1:280\n140#1:175\n141#1:184\n142#1:193\n143#1:202\n144#1:211\n145#1:220\n146#1:229\n147#1:238\n148#1:247\n149#1:256\n150#1:269\n*E\n"})
public final class TodayHealthyDataActivity$initData$mAdapter$1 extends CommonAdapter<TodayData> {
    final /* synthetic */ List<TodayData> $list;
    final /* synthetic */ TodayHealthyDataActivity this$0;

    public TodayHealthyDataActivity$initData$mAdapter$1(TodayHealthyDataActivity r2, List<TodayData> r3) {
        this.this$0 = r2;
        this.$list = r3;
        super(r2, R.layout.item_today_healthy_data, r3);
    }

    public static /* synthetic */ void OXO1(TodayData r0, TodayHealthyDataActivity r1, View r2) {
        convert$lambda$0$0(r0, r1, r2);
    }

    private static final void convert$lambda$0$0(TodayData r2, TodayHealthyDataActivity r3, View r4) {
        if (w85.OXO1.OXO1() == false) goto L62;
        String r5 = r2.getDataType();
        switch(r5.hashCode()) {
            case -2030863703: goto L58;
            case -1276242363: goto L53;
            case -791592328: goto L48;
            case -657581851: goto L43;
            case -240915579: goto L38;
            case 100233: goto L33;
            case 103596: goto L28;
            case 109522647: goto L23;
            case 321701236: goto L18;
            case 560044778: goto L13;
            case 1930449209: goto L8;
            default: goto L63;
        };
    L63:
        return;
    L8:
        if (r5.equals("heart_rate") == false) goto L64;
        r3.startActivity(new Intent(r3, HeartRateActivity.class));
        return;
    L64:
        return;
    L13:
        if (r5.equals(q62.OXOXXiI) == false) goto L65;
        r3.startActivity(new Intent(r3, BloodPressureActivity.class));
        return;
    L65:
        return;
    L18:
        if (r5.equals("temperature") == false) goto L66;
        r3.startActivity(new Intent(r3, TemperatureActivity.class));
        return;
    L66:
        return;
    L23:
        if (r5.equals("sleep") == false) goto L67;
        r3.startActivity(new Intent(r3, SleepActivity.class));
        return;
    L67:
        return;
    L28:
        if (r5.equals(q62.XOX1) == false) goto L68;
        r3.startActivity(new Intent(r3, HrvActivity.class));
        return;
    L68:
        return;
    L33:
        if (r5.equals(q62.XiI1iO1i) == false) goto L69;
        r3.startActivity(new Intent(r3, ElectrocardiogramActivity.class));
        return;
    L69:
        return;
    L38:
        if (r5.equals(q62.IiOIO1OX) == false) goto L70;
        r3.startActivity(new Intent(r3, BloodOxyGenActivity.class));
        return;
    L70:
        return;
    L43:
        if (r5.equals("sportRecord") == false) goto L71;
        int r6 = r2.getOnClickID();
        Bundle r7 = new Bundle();
        r7.putString("mArg0", null);
        r7.putInt("mArg1", r6);
        r7.putParcelable("mArg2", null);
        r7.putSerializable("mArg3", null);
        Intent r8 = new Intent(r3, SportDetailV2Activity.class);
        r8.putExtras(r7);
        r3.startActivity(r8);
        return;
    L71:
        return;
    L48:
        if (r5.equals("weight") == false) goto L72;
        r3.startActivity(new Intent(r3, WeightActivity.class));
        return;
    L72:
        return;
    L53:
        if (r5.equals(q62.IIII0II) == false) goto L73;
        r3.startActivity(new Intent(r3, PressureActivity.class));
        return;
    L73:
        return;
    L58:
        if (r5.equals(q62.Oi0X) == false) goto L74;
        r3.startActivity(new Intent(r3, BloodGlucoseActivity.class));
        return;
    L74:
        return;
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, TodayData r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r8, final TodayData r9, int r10) {
        Intrinsics.X0O(r8, "viewHolder");
        Intrinsics.X0O(r9, MapController.ITEM_LAYER_TAG);
        View r0 = r8.getView(R.id.today_healthy_data_top_view);
        int r1 = 4;
        if (r10 != 0) goto L5;
        int r3 = 4;
    L6:
        r0.setVisibility(r3);
        View r2 = r8.getView(R.id.today_healthy_data_btn_view);
        if (r10 == (this.$list.size() - 1)) goto L10;
        r1 = 0;
    L10:
        r2.setVisibility(r1);
        TextView r11 = (TextView) r8.getView(R.id.item_today_healthy_data_time);
        TextView r4 = (TextView) r8.getView(R.id.item_today_healthy_data_title);
        TextView r5 = (TextView) r8.getView(R.id.item_today_healthy_data_value);
        TextView r6 = (TextView) r8.getView(R.id.item_today_healthy_data_state);
        r11.setText(O0X11OiO.IXI(false, 1, null).format(Long.valueOf(r9.getTime())));
        r4.setText(r9.getTitle());
        r5.setText(r9.getValue());
        r6.setText(r9.getState());
        int r12 = r9.getStateColor();
        if (r12 == 0) goto L18;
        if (r12 != 1) goto L14;
        int r13 = this.this$0.getColor(R.color.colorAccent);
    L19:
        r6.setTextColor(r13);
        View r14 = r8.getView(R.id.item_today_healthy_data_layout);
        final TodayHealthyDataActivity r15 = this.this$0;
        r14.setBackgroundTintList(ColorStateList.valueOf(gk4.iO(r14.getContext(), R.color.today_healthy_item_bg)));
        r14.setOnClickListener(new gv5(r9, r15));
        return;
    L14:
        if (r12 == 2) goto L16;
        r13 = -65536;
        goto L19
    L16:
        r13 = -16711936;
        goto L19
    L18:
        r13 = Color.parseColor("#FE6D00");
        goto L19
    L5:
        r3 = 0;
        goto L6
    }
}
