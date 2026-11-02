package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cw3;
import com.android.mltcode.paycertificationapi.fi5;
import com.android.mltcode.paycertificationapi.hi5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ji5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.p610ui.device.SchedulesActivity;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleSchedule;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSchedulesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchedulesActivity.kt\ncom/sma/smartv3/ui/device/SchedulesActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n173#2,7:111\n180#2,3:119\n143#2,7:122\n183#2:129\n173#2,7:130\n180#2,3:138\n143#2,7:141\n183#2:148\n1#3:118\n1#3:137\n*S KotlinDebug\n*F\n+ 1 SchedulesActivity.kt\ncom/sma/smartv3/ui/device/SchedulesActivity\n*L\n99#1:111,7\n99#1:119,3\n99#1:122,7\n99#1:129\n59#1:130,7\n59#1:138,3\n59#1:141,7\n59#1:148\n99#1:118\n59#1:137\n*E\n"})
public final class SchedulesActivity extends BaseListActivity<BleSchedule> {

    @aa1
    private final Lazy tvTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wv3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SchedulesActivity.tvTip_delegate$lambda$0(this.f12045IO);
        }
    });

    @aa1
    private final Lazy btnBottom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xv3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SchedulesActivity.btnBottom_delegate$lambda$0(this.f12242IO);
        }
    });

    @aa1
    private final SimpleDateFormat mDateFormat = O0X11OiO.i0X000X0O(i72.OXO1.i0X000X0O(), false, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnBottom_delegate$lambda$0(SchedulesActivity schedulesActivity) {
        return schedulesActivity.findViewById(R.id.btn_bottom);
    }

    private final void checkScheduleCount() {
        getTvTip().setVisibility(getMList().size() == 0 ? 8 : 0);
        int iX111IO = q62.OXO1.X111IO();
        getTvTip().setText(getString(R.string.schedule_max_tip, Integer.valueOf(iX111IO)));
        getBtnBottom().setEnabled(getMList().size() < iX111IO);
    }

    private final View getBtnBottom() {
        return (View) this.btnBottom$delegate.getValue();
    }

    private final TextView getTvTip() {
        return (TextView) this.tvTip$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0(SchedulesActivity schedulesActivity, fi5 fi5Var) {
        ji5 ji5Var = new ji5(schedulesActivity.getMContext());
        ji5Var.I1XOi1(SizeUtils.dp2px(72.0f));
        ji5Var.m2396IO(R.drawable.ic_delete);
        ji5Var.I0IIOi(R.drawable.hr_color);
        fi5Var.OXO1(ji5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$0$1(final SchedulesActivity schedulesActivity, final int i, fi5 fi5Var, int i2) {
        return !X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.yv3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SchedulesActivity.initView$lambda$0$1$0(this.f12460IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$1$0(SchedulesActivity schedulesActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.SCHEDULE, BleKeyFlag.DELETE, schedulesActivity.getMList().remove(i).getMId(), false, false, 24, null);
        schedulesActivity.getMListAdapter().notifyDataSetChanged();
        schedulesActivity.checkScheduleCount();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SchedulesActivity schedulesActivity, AdapterView adapterView, View view, int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", i);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(schedulesActivity, (Class<?>) ScheduleEditActivity.class);
        intent.putExtras(bundle);
        schedulesActivity.startActivityForResult(intent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTip_delegate$lambda$0(SchedulesActivity schedulesActivity) {
        return (TextView) schedulesActivity.findViewById(R.id.tv_tip);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<BleSchedule> initList() {
        return BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SCHEDULE, BleSchedule.class, null, 4, null);
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getMListView().setEmptyView(findViewById(R.id.empty));
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.schedule);
        ListView mListView = getMListView();
        Intrinsics.X1ii(mListView, "null cannot be cast to non-null type com.baoyz.swipemenulistview.SwipeMenuListView");
        SwipeMenuListView swipeMenuListView = (SwipeMenuListView) mListView;
        swipeMenuListView.setMenuCreator(new hi5() { // from class: com.android.mltcode.paycertificationapi.zv3
            @Override // com.android.mltcode.paycertificationapi.hi5
            public final void OXO1(fi5 fi5Var) {
                SchedulesActivity.initView$lambda$0$0(this.OXO1, fi5Var);
            }
        });
        swipeMenuListView.setOnMenuItemClickListener(new SwipeMenuListView.XIi00iiXO() { // from class: com.android.mltcode.paycertificationapi.aw3
            @Override // com.baoyz.swipemenulistview.SwipeMenuListView.XIi00iiXO
            public final boolean OXO1(int i, fi5 fi5Var, int i2) {
                return SchedulesActivity.initView$lambda$0$1(this.OXO1, i, fi5Var, i2);
            }
        });
        getMListView().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.android.mltcode.paycertificationapi.bw3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                SchedulesActivity.initView$lambda$1(this.f5835IO, adapterView, view, i, j);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.item_schedule;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_schedules;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            getMList().clear();
            getMList().addAll(BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SCHEDULE, BleSchedule.class, null, 4, null));
            getMListAdapter().notifyDataSetChanged();
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", -1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) ScheduleEditActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkScheduleCount();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 BleSchedule item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        ((TextView) holder.O00(R.id.tv_title)).setText(item.getMTitle());
        ((TextView) holder.O00(R.id.tv_time)).setText(this.mDateFormat.format(cw3.OXO1(item)));
    }
}
