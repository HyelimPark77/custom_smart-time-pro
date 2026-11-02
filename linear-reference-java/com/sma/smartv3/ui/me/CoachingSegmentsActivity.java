package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.mltcode.paycertificationapi.OOXI;
import com.android.mltcode.paycertificationapi.OOi0iOO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.iI0OII;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.vg6;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CompletionValueView;
import com.sma.smartv3.view.swipelist.DragListView;
import com.sma.smartv3.view.swipelist.SwipeLayout;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleCoaching;
import com.szabh.smable3.entity.BleCoachingSegment;
import com.szabh.smable3.entity.CompletionCondition;
import com.szabh.smable3.entity.SegmentActivity;
import com.szabh.smable3.entity.Stage;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCoachingSegmentsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingSegmentsActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,206:1\n18#2,2:207\n15#2:209\n18#2,2:211\n15#2:213\n18#2,2:214\n15#2:216\n11#2,2:217\n23#2:238\n18#2,2:239\n15#2:241\n11#2,2:243\n24#2:245\n1#3:210\n1#3:226\n1#3:242\n173#4,7:219\n180#4,3:227\n143#4,7:230\n183#4:237\n*S KotlinDebug\n*F\n+ 1 CoachingSegmentsActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentsActivity\n*L\n93#1:207,2\n93#1:209\n159#1:211,2\n159#1:213\n161#1:214,2\n161#1:216\n179#1:217,2\n201#1:238\n201#1:239,2\n201#1:241\n201#1:243,2\n201#1:245\n180#1:226\n201#1:242\n180#1:219,7\n180#1:227,3\n180#1:230,7\n180#1:237\n*E\n"})
public final class CoachingSegmentsActivity extends BaseListActivity<BleCoachingSegment> {

    @tb1
    private go0 mDeleteFailedPopup;

    @tb1
    private go0 mDeletePopup;

    @aa1
    private final Rect mDragRect;
    private int mIndex;

    @aa1
    private final Lazy titleRight$delegate;

    public static final class OXO1 implements SwipeLayout.XIi00iiXO {
        public final /* synthetic */ CoachingSegmentsActivity OXO1;
        public final /* synthetic */ int XIi00iiXO;

        public OXO1(CoachingSegmentsActivity r1, int r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        public static /* synthetic */ boolean XIi00iiXO(CoachingSegmentsActivity r0) {
            return iO(r0);
        }

        public static final boolean iO(CoachingSegmentsActivity r6) {
            if (CoachingSegmentsActivity.access$getMList(r6).size() <= 1) goto L5;
            CoachingSegmentsActivity.access$getMList(r6).remove(CoachingSegmentsActivity.access$getMIndex$p(r6));
            CoachingSegmentsActivity.access$getMListAdapter(r6).notifyDataSetChanged();
            CoachingSegmentsActivity.access$checkCount(r6);
        L11:
            return true;
        L5:
            if (CoachingSegmentsActivity.access$getMDeleteFailedPopup$p(r6) != null) goto L7;
            go0 r0 = new go0(CoachingSegmentsActivity.access$getMContext(r6), 0, 2, null);
            r0.O1O(R.string.failed_to_delete);
            r0.iX(Integer.valueOf(R.string.segment_delete_failed_tip));
            go0.X11iII1O1(r0, null, null, 2, null);
            go0.X0i1O(r0, R.string.confirm, null, 2, null);
            CoachingSegmentsActivity.access$setMDeleteFailedPopup$p(r6, r0);
        L7:
            go0 r7 = CoachingSegmentsActivity.access$getMDeleteFailedPopup$p(r6);
            if (r7 == null) goto L11;
            r7.IIX1OXO();
            goto L11
        }

        @Override // com.sma.smartv3.view.swipelist.SwipeLayout.XIi00iiXO
        public void OXO1() {
            CoachingSegmentsActivity.access$toEdit(this.OXO1, this.XIi00iiXO);
        }

        @Override // com.sma.smartv3.view.swipelist.SwipeLayout.XIi00iiXO
        public void onDelete() {
            CoachingSegmentsActivity.access$setMIndex$p(this.OXO1, this.XIi00iiXO);
            if (CoachingSegmentsActivity.access$getMDeletePopup$p(this.OXO1) != null) goto L5;
            CoachingSegmentsActivity r0 = this.OXO1;
            go0 r1 = new go0(CoachingSegmentsActivity.access$getMContext(this.OXO1), 0, 2, null);
            final CoachingSegmentsActivity r2 = this.OXO1;
            r1.O1O(R.string.delete_segment_tip);
            go0.X11iII1O1(r1, Integer.valueOf(R.string.cancel), null, 2, null);
            r1.X1IX(R.string.confirm, new OOi0iOO(r2));
            CoachingSegmentsActivity.access$setMDeletePopup$p(r0, r1);
        L5:
            go0 r3 = CoachingSegmentsActivity.access$getMDeletePopup$p(this.OXO1);
            if (r3 == null) goto L9;
            r3.IIX1OXO();
            return;
        }
    }

    public static final class XIi00iiXO extends DragListView.iO {
        public final /* synthetic */ CoachingSegmentsActivity OXO1;

        public XIi00iiXO(CoachingSegmentsActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public boolean IiI10X(int r2, int r3) {
            Collections.swap(CoachingSegmentsActivity.access$getMList(this.OXO1), r2, r3);
            CoachingSegmentsActivity.access$getMListAdapter(this.OXO1).notifyDataSetChanged();
            return true;
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public void O00(View r1) {
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public Bitmap XO0O10(View r1, Bitmap r2) {
            return null;
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public boolean iO(View r5, int r6, int r7) {
            Intrinsics.XXI(r5);
            View r0 = r5.findViewById(R.id.iv_reorder);
            if (r0 != null) goto L5;
        L12:
            return false;
        L5:
            if (r0.getVisibility() != 0) goto L12;
            ViewGroup r8 = (ViewGroup) r5;
            if (r8.getChildAt(0).getTranslationX() >= 0.0f) goto L10;
            return false;
        L10:
            float r9 = r6 - r8.getX();
            float r10 = r7 - r8.getY();
            r0.getHitRect(CoachingSegmentsActivity.access$getMDragRect$p(this.OXO1));
            return CoachingSegmentsActivity.access$getMDragRect$p(this.OXO1).contains((int) r9, (int) r10);
        }
    }

    public CoachingSegmentsActivity() {
        this.titleRight$delegate = LazyKt__LazyJVMKt.iO(new OOXI(this));
        this.mDragRect = new Rect();
        this.mIndex = -1;
    }

    public static /* synthetic */ View I0iXXO(CoachingSegmentsActivity r0) {
        return titleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OIX0iXi(CoachingSegmentsActivity r0, BleConnector r1) {
        return onBottomClick$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$checkCount(CoachingSegmentsActivity r0) {
        r0.checkCount();
    }

    public static final /* synthetic */ Activity access$getMContext(CoachingSegmentsActivity r0) {
        return r0.getMContext();
    }

    public static final /* synthetic */ go0 access$getMDeleteFailedPopup$p(CoachingSegmentsActivity r0) {
        return r0.mDeleteFailedPopup;
    }

    public static final /* synthetic */ go0 access$getMDeletePopup$p(CoachingSegmentsActivity r0) {
        return r0.mDeletePopup;
    }

    public static final /* synthetic */ Rect access$getMDragRect$p(CoachingSegmentsActivity r0) {
        return r0.mDragRect;
    }

    public static final /* synthetic */ int access$getMIndex$p(CoachingSegmentsActivity r0) {
        return r0.mIndex;
    }

    public static final /* synthetic */ List access$getMList(CoachingSegmentsActivity r0) {
        return r0.getMList();
    }

    public static final /* synthetic */ XII0Oi10O access$getMListAdapter(CoachingSegmentsActivity r0) {
        return r0.getMListAdapter();
    }

    public static final /* synthetic */ void access$setMDeleteFailedPopup$p(CoachingSegmentsActivity r0, go0 r1) {
        r0.mDeleteFailedPopup = r1;
    }

    public static final /* synthetic */ void access$setMDeletePopup$p(CoachingSegmentsActivity r0, go0 r1) {
        r0.mDeletePopup = r1;
    }

    public static final /* synthetic */ void access$setMIndex$p(CoachingSegmentsActivity r0, int r1) {
        r0.mIndex = r1;
    }

    public static final /* synthetic */ void access$toEdit(CoachingSegmentsActivity r0, int r1) {
        r0.toEdit(r1);
    }

    private final void checkCount() {
        View r0 = getTitleRight();
        if (getMList().size() >= q62.OXO1.Ii0i()) goto L5;
        boolean r1 = true;
    L6:
        r0.setEnabled(r1);
        return;
    L5:
        r1 = false;
        goto L6
    }

    private final View getTitleRight() {
        return (View) getValue();
    }

    private final BleCoachingSegment newSegment() {
        return new BleCoachingSegment(CompletionCondition.DURATION.getCondition(), "", SegmentActivity.TIMER.getActivity(), Stage.GO_FOR.getStage(), 0, 0, 16, null);
    }

    private static final Unit onBottomClick$lambda$0(CoachingSegmentsActivity r4, BleConnector r5) {
        Intrinsics.X0O(r5, "it");
        SPUtils r6 = a01.OXO1.XO0O10();
        Object r0 = new Gson().fromJson(r6.getString(BleCoaching.class.getName()), BleCoaching.class);
        if (r0 != null) goto L5;
        r0 = BleCoaching.class.newInstance();
    L5:
        ((BleCoaching) r0).setMSegments(r4.getMList());
        r6.put(BleCoaching.class.getName(), new Gson().toJson(r0));
        r4.setResult(-1);
        r4.finish();
        return Unit.OXO1;
    }

    private static final View titleRight_delegate$lambda$0(CoachingSegmentsActivity r1) {
        return r1.findViewById(R.id.abh_title_right);
    }

    private final void toEdit(int r4) {
        this.mIndex = r4;
        if (r4 >= 0) goto L5;
        BleCoachingSegment r5 = newSegment();
    L6:
        a01.OXO1.XO0O10().put(BleCoachingSegment.class.getName(), new Gson().toJson(r5));
        int r6 = this.mIndex;
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", r6);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r7 = new Intent(this, CoachingSegmentEditActivity.class);
        r7.putExtras(r0);
        startActivityForResult(r7, 0);
        return;
    L5:
        r5 = getMList().get(r4);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (BleCoachingSegment) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<BleCoachingSegment> initList() {
        SPUtils r0 = a01.OXO1.XO0O10();
        Object r1 = new Gson().fromJson(r0.getString(BleCoaching.class.getName()), BleCoaching.class);
        if (r1 != null) goto L6;
        r1 = BleCoaching.class.newInstance();
    L6:
        return CollectionsKt___CollectionsKt.OO0Oi10(((BleCoaching) r1).getMSegments());
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.coaching_segments);
        ImageView r0 = (ImageView) findViewById(R.id.abh_title_right);
        r0.setImageResource(R.drawable.ic_coaching_add);
        r0.setVisibility(0);
        ListView r1 = getMListView();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.sma.smartv3.view.swipelist.DragListView");
        ((DragListView) r1).setDragItemListener(new XIi00iiXO(this));
        checkCount();
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_coaching_segment;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_coaching_segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r4, int r5, @tb1 Intent r6) {
        super.onActivityResult(r4, r5, r6);
        if (r5 == (-1)) goto L5;
        return;
    L5:
        if (this.mIndex >= 0) goto L10;
        List<BleCoachingSegment> r7 = getMList();
        SPUtils r8 = a01.OXO1.XO0O10();
        Object r9 = new Gson().fromJson(r8.getString(BleCoachingSegment.class.getName()), BleCoachingSegment.class);
        if (r9 != null) goto L9;
        r9 = BleCoachingSegment.class.newInstance();
    L9:
        r7.add(r9);
    L14:
        getMListAdapter().notifyDataSetChanged();
        checkCount();
        return;
    L10:
        List<BleCoachingSegment> r10 = getMList();
        int r11 = this.mIndex;
        SPUtils r0 = a01.OXO1.XO0O10();
        Object r1 = new Gson().fromJson(r0.getString(BleCoachingSegment.class.getName()), BleCoachingSegment.class);
        if (r1 != null) goto L13;
        r1 = BleCoachingSegment.class.newInstance();
    L13:
        r10.set(r11, r1);
        goto L14
    }

    public final void onBottomClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new iI0OII(this), 1, null);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        toEdit(-1);
    }

    public void initItem(@aa1 ug6 r5, @aa1 BleCoachingSegment r6, int r7) {
        Intrinsics.X0O(r5, "holder");
        Intrinsics.X0O(r6, MapController.ITEM_LAYER_TAG);
        BleCoachingSegment r8 = getMList().get(r7);
        r5.XXI(R.id.iv_activity, X1OOO.OXO1(getMContext(), "ic_segment_activity" + r8.getMActivity(), "drawable", R.drawable.ic_segment_activity0));
        vg6.XO0O10(r5, R.id.tv_stage, X1OOO.OXO1(getMContext(), "segment_stage" + r8.getMStage(), TypedValues.Custom.S_STRING, R.string.segment_stage255));
        String r0 = r8.getMName();
        if (StringsKt__StringsKt.i0XI0(r0) == false) goto L5;
        r0 = getString(R.string.coaching_segment_d, new Object[]{Integer.valueOf(r7 + 1)});
        Intrinsics.O10IXXX0X(r0, "getString(...)");
    L5:
        r5.OII(R.id.tv_name, r0);
        CompletionValueView r1 = (CompletionValueView) r5.O00(R.id.completion_value);
        int r2 = r8.getMCompletionCondition();
        if (r2 != CompletionCondition.DURATION.getCondition()) goto L8;
    L17:
        r1.setMDuration(r8.getMCompletionValue());
    L18:
        SwipeLayout r9 = (SwipeLayout) r5.O00(R.id.swipe_layout);
        r9.O00(true);
        r9.setSwipeListener(new OXO1(this, r7));
        return;
    L8:
        if (r2 == CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) goto L17;
        if (r2 == CompletionCondition.MANUAL.getCondition()) goto L18;
        if (r2 != CompletionCondition.HR_BELOW.getCondition()) goto L15;
    L16:
        r1.setMBpm(r8.getMCompletionValue());
        goto L18
    L15:
        if (r2 != CompletionCondition.HR_ABOVE.getCondition()) goto L18;
        goto L16
    }
}
