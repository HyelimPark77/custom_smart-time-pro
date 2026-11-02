package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aw3;
import com.android.mltcode.paycertificationapi.bw3;
import com.android.mltcode.paycertificationapi.cw3;
import com.android.mltcode.paycertificationapi.fi5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ji5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.wv3;
import com.android.mltcode.paycertificationapi.xv3;
import com.android.mltcode.paycertificationapi.yv3;
import com.android.mltcode.paycertificationapi.zv3;
import com.baidu.platform.comapi.map.MapController;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SizeUtils;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSchedulesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchedulesActivity.kt\ncom/sma/smartv3/ui/device/SchedulesActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n173#2,7:111\n180#2,3:119\n143#2,7:122\n183#2:129\n173#2,7:130\n180#2,3:138\n143#2,7:141\n183#2:148\n1#3:118\n1#3:137\n*S KotlinDebug\n*F\n+ 1 SchedulesActivity.kt\ncom/sma/smartv3/ui/device/SchedulesActivity\n*L\n99#1:111,7\n99#1:119,3\n99#1:122,7\n99#1:129\n59#1:130,7\n59#1:138,3\n59#1:141,7\n59#1:148\n99#1:118\n59#1:137\n*E\n"})
public final class SchedulesActivity extends BaseListActivity<BleSchedule> {

    @aa1
    private final Lazy btnBottom$delegate;

    @aa1
    private final SimpleDateFormat mDateFormat;

    @aa1
    private final Lazy tvTip$delegate;

    public SchedulesActivity() {
        this.tvTip$delegate = LazyKt__LazyJVMKt.iO(new wv3(this));
        this.btnBottom$delegate = LazyKt__LazyJVMKt.iO(new xv3(this));
        this.mDateFormat = O0X11OiO.i0X000X0O(i72.OXO1.i0X000X0O(), false, 2, null);
    }

    public static /* synthetic */ void I0iXXO(SchedulesActivity r0, AdapterView r1, View r2, int r3, long r4) {
        initView$lambda$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ TextView O10IXXX0X(SchedulesActivity r0) {
        return tvTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OIX0iXi(SchedulesActivity r0, fi5 r1) {
        initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ View X0O(SchedulesActivity r0) {
        return btnBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X1ii(SchedulesActivity r0, int r1, fi5 r2, int r3) {
        return initView$lambda$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XXI(SchedulesActivity r0, int r1, BleConnector r2) {
        return initView$lambda$0$1$0(r0, r1, r2);
    }

    private static final View btnBottom_delegate$lambda$0(SchedulesActivity r1) {
        return r1.findViewById(R.id.btn_bottom);
    }

    private final void checkScheduleCount() {
        TextView r0 = getTvTip();
        boolean r2 = false;
        if (getMList().size() != 0) goto L5;
        int r1 = 8;
    L6:
        r0.setVisibility(r1);
        int r3 = q62.OXO1.X111IO();
        getTvTip().setText(getString(R.string.schedule_max_tip, new Object[]{Integer.valueOf(r3)}));
        View r4 = getBtnBottom();
        if (getMList().size() >= r3) goto L9;
        r2 = true;
    L9:
        r4.setEnabled(r2);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    private final View getBtnBottom() {
        return (View) getValue();
    }

    private final TextView getTvTip() {
        return (TextView) getValue();
    }

    private static final void initView$lambda$0$0(SchedulesActivity r1, fi5 r2) {
        ji5 r0 = new ji5(r1.getMContext());
        r0.I1XOi1(SizeUtils.dp2px(72.0f));
        r0.IO(R.drawable.ic_delete);
        r0.I0IIOi(R.drawable.hr_color);
        r2.OXO1(r0);
    }

    private static final boolean initView$lambda$0$1(final SchedulesActivity r0, final int r1, fi5 r2, int r3) {
        return !X0IOiX1O.XIi00iiXO(false, new yv3(r0, r1), 1, null);
    }

    private static final Unit initView$lambda$0$1$0(SchedulesActivity r8, int r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        BleSchedule r11 = r8.getMList().remove(r9);
        BaseBleConnector.sendInt8$default(r10, BleKey.SCHEDULE, BleKeyFlag.DELETE, r11.getMId(), false, false, 24, null);
        r8.getMListAdapter().notifyDataSetChanged();
        r8.checkScheduleCount();
        return Unit.OXO1;
    }

    private static final void initView$lambda$1(SchedulesActivity r0, AdapterView r1, View r2, int r3, long r4) {
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", r3);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r6 = new Intent(r0, ScheduleEditActivity.class);
        r6.putExtras(r5);
        r0.startActivityForResult(r6, 0);
    }

    private static final TextView tvTip_delegate$lambda$0(SchedulesActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_tip);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (BleSchedule) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<BleSchedule> initList() {
        return BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SCHEDULE, BleSchedule.class, null, 4, null);
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getMListView().setEmptyView(findViewById(R.id.empty));
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.schedule);
        ListView r0 = getMListView();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.baoyz.swipemenulistview.SwipeMenuListView");
        SwipeMenuListView r1 = (SwipeMenuListView) r0;
        r1.setMenuCreator(new zv3(this));
        r1.setOnMenuItemClickListener(new aw3(this));
        getMListView().setOnItemClickListener(new bw3(this));
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_schedule;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_schedules;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r7, int r8, @tb1 Intent r9) {
        super.onActivityResult(r7, r8, r9);
        if (r8 != (-1)) goto L6;
        getMList().clear();
        getMList().addAll(BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SCHEDULE, BleSchedule.class, null, 4, null));
        getMListAdapter().notifyDataSetChanged();
        return;
    }

    public final void onBottomClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", -1);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, ScheduleEditActivity.class);
        r0.putExtras(r5);
        startActivityForResult(r0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkScheduleCount();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void initItem(@aa1 ug6 r2, @aa1 BleSchedule r3, int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        ((TextView) r2.O00(R.id.tv_title)).setText(r3.getMTitle());
        ((TextView) r2.O00(R.id.tv_time)).setText(this.mDateFormat.format(cw3.OXO1(r3)));
    }
}
