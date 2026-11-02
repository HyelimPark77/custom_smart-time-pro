package com.sma.smartv3.p610ui.status;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.w85;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.p610ui.sport.SportDetailV2Activity;
import com.sma.smartv3.p610ui.status.TodayHealthyDataActivity$initData$mAdapter$1;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTodayHealthyDataActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n69#2,3:172\n72#2,5:176\n69#2,3:181\n72#2,5:185\n69#2,3:190\n72#2,5:194\n69#2,3:199\n72#2,5:203\n69#2,3:208\n72#2,5:212\n69#2,3:217\n72#2,5:221\n69#2,3:226\n72#2,5:230\n69#2,3:235\n72#2,5:239\n69#2,3:244\n72#2,5:248\n69#2,3:253\n72#2,5:257\n87#2,7:262\n94#2,3:270\n70#2,7:273\n97#2:280\n1#3:175\n1#3:184\n1#3:193\n1#3:202\n1#3:211\n1#3:220\n1#3:229\n1#3:238\n1#3:247\n1#3:256\n1#3:269\n*S KotlinDebug\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1\n*L\n140#1:172,3\n140#1:176,5\n141#1:181,3\n141#1:185,5\n142#1:190,3\n142#1:194,5\n143#1:199,3\n143#1:203,5\n144#1:208,3\n144#1:212,5\n145#1:217,3\n145#1:221,5\n146#1:226,3\n146#1:230,5\n147#1:235,3\n147#1:239,5\n148#1:244,3\n148#1:248,5\n149#1:253,3\n149#1:257,5\n150#1:262,7\n150#1:270,3\n150#1:273,7\n150#1:280\n140#1:175\n141#1:184\n142#1:193\n143#1:202\n144#1:211\n145#1:220\n146#1:229\n147#1:238\n148#1:247\n149#1:256\n150#1:269\n*E\n"})
public final class TodayHealthyDataActivity$initData$mAdapter$1 extends CommonAdapter<TodayData> {
    final /* synthetic */ List<TodayData> $list;
    final /* synthetic */ TodayHealthyDataActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayHealthyDataActivity$initData$mAdapter$1(TodayHealthyDataActivity todayHealthyDataActivity, List<TodayData> list) {
        super(todayHealthyDataActivity, R.layout.item_today_healthy_data, list);
        this.this$0 = todayHealthyDataActivity;
        this.$list = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void convert$lambda$0$0(TodayData todayData, TodayHealthyDataActivity todayHealthyDataActivity, View view) {
        if (w85.OXO1.OXO1()) {
            String dataType = todayData.getDataType();
            switch (dataType.hashCode()) {
                case -2030863703:
                    if (dataType.equals(q62.Oi0X)) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) BloodGlucoseActivity.class));
                        break;
                    }
                    break;
                case -1276242363:
                    if (dataType.equals(q62.IIII0II)) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) PressureActivity.class));
                        break;
                    }
                    break;
                case -791592328:
                    if (dataType.equals("weight")) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) WeightActivity.class));
                        break;
                    }
                    break;
                case -657581851:
                    if (dataType.equals("sportRecord")) {
                        int onClickID = todayData.getOnClickID();
                        Bundle bundle = new Bundle();
                        bundle.putString("mArg0", null);
                        bundle.putInt("mArg1", onClickID);
                        bundle.putParcelable("mArg2", null);
                        bundle.putSerializable("mArg3", null);
                        Intent intent = new Intent(todayHealthyDataActivity, (Class<?>) SportDetailV2Activity.class);
                        intent.putExtras(bundle);
                        todayHealthyDataActivity.startActivity(intent);
                        break;
                    }
                    break;
                case -240915579:
                    if (dataType.equals(q62.IiOIO1OX)) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) BloodOxyGenActivity.class));
                        break;
                    }
                    break;
                case 100233:
                    if (dataType.equals(q62.XiI1iO1i)) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) ElectrocardiogramActivity.class));
                        break;
                    }
                    break;
                case 103596:
                    if (dataType.equals(q62.XOX1)) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) HrvActivity.class));
                        break;
                    }
                    break;
                case 109522647:
                    if (dataType.equals("sleep")) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) SleepActivity.class));
                        break;
                    }
                    break;
                case 321701236:
                    if (dataType.equals("temperature")) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) TemperatureActivity.class));
                        break;
                    }
                    break;
                case 560044778:
                    if (dataType.equals(q62.OXOXXiI)) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) BloodPressureActivity.class));
                        break;
                    }
                    break;
                case 1930449209:
                    if (dataType.equals("heart_rate")) {
                        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) HeartRateActivity.class));
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, final TodayData item, int i) {
        int color;
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(item, "item");
        viewHolder.getView(R.id.today_healthy_data_top_view).setVisibility(i == 0 ? 4 : 0);
        viewHolder.getView(R.id.today_healthy_data_btn_view).setVisibility(i != this.$list.size() - 1 ? 0 : 4);
        TextView textView = (TextView) viewHolder.getView(R.id.item_today_healthy_data_time);
        TextView textView2 = (TextView) viewHolder.getView(R.id.item_today_healthy_data_title);
        TextView textView3 = (TextView) viewHolder.getView(R.id.item_today_healthy_data_value);
        TextView textView4 = (TextView) viewHolder.getView(R.id.item_today_healthy_data_state);
        textView.setText(O0X11OiO.IXI(false, 1, null).format(Long.valueOf(item.getTime())));
        textView2.setText(item.getTitle());
        textView3.setText(item.getValue());
        textView4.setText(item.getState());
        int stateColor = item.getStateColor();
        if (stateColor == 0) {
            color = Color.parseColor("#FE6D00");
        } else if (stateColor != 1) {
            color = stateColor != 2 ? -65536 : -16711936;
        } else {
            color = this.this$0.getColor(R.color.colorAccent);
        }
        textView4.setTextColor(color);
        View view = viewHolder.getView(R.id.item_today_healthy_data_layout);
        final TodayHealthyDataActivity todayHealthyDataActivity = this.this$0;
        view.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(view.getContext(), R.color.today_healthy_item_bg)));
        view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.gv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TodayHealthyDataActivity$initData$mAdapter$1.convert$lambda$0$0(item, todayHealthyDataActivity, view2);
            }
        });
    }
}
