package com.sma.smartv3.p610ui.p612me;

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
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.vg6;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.p610ui.p612me.CoachingSegmentsActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
    private final Lazy titleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentsActivity.titleRight_delegate$lambda$0(this.f3322IO);
        }
    });

    @aa1
    private final Rect mDragRect = new Rect();
    private int mIndex = -1;

    public static final class OXO1 implements SwipeLayout.XIi00iiXO {
        public final /* synthetic */ int XIi00iiXO;

        public OXO1(int i) {
            this.XIi00iiXO = i;
        }

        /* JADX INFO: renamed from: iO */
        public static final boolean m38508iO(CoachingSegmentsActivity coachingSegmentsActivity) {
            if (coachingSegmentsActivity.getMList().size() <= 1) {
                if (coachingSegmentsActivity.mDeleteFailedPopup == null) {
                    go0 go0Var = new go0(coachingSegmentsActivity.getMContext(), 0, 2, null);
                    go0Var.O1O(R.string.failed_to_delete);
                    go0Var.m1865iX(Integer.valueOf(R.string.segment_delete_failed_tip));
                    go0.X11iII1O1(go0Var, null, null, 2, null);
                    go0.X0i1O(go0Var, R.string.confirm, null, 2, null);
                    coachingSegmentsActivity.mDeleteFailedPopup = go0Var;
                }
                go0 go0Var2 = coachingSegmentsActivity.mDeleteFailedPopup;
                if (go0Var2 != null) {
                    go0Var2.IIX1OXO();
                }
            } else {
                coachingSegmentsActivity.getMList().remove(coachingSegmentsActivity.mIndex);
                coachingSegmentsActivity.getMListAdapter().notifyDataSetChanged();
                coachingSegmentsActivity.checkCount();
            }
            return true;
        }

        @Override // com.sma.smartv3.view.swipelist.SwipeLayout.XIi00iiXO
        public void OXO1() {
            CoachingSegmentsActivity.this.toEdit(this.XIi00iiXO);
        }

        @Override // com.sma.smartv3.view.swipelist.SwipeLayout.XIi00iiXO
        public void onDelete() {
            CoachingSegmentsActivity.this.mIndex = this.XIi00iiXO;
            if (CoachingSegmentsActivity.this.mDeletePopup == null) {
                CoachingSegmentsActivity coachingSegmentsActivity = CoachingSegmentsActivity.this;
                go0 go0Var = new go0(CoachingSegmentsActivity.this.getMContext(), 0, 2, null);
                final CoachingSegmentsActivity coachingSegmentsActivity2 = CoachingSegmentsActivity.this;
                go0Var.O1O(R.string.delete_segment_tip);
                go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
                go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OOi0iOO
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return Boolean.valueOf(CoachingSegmentsActivity.OXO1.m38508iO(coachingSegmentsActivity2));
                    }
                });
                coachingSegmentsActivity.mDeletePopup = go0Var;
            }
            go0 go0Var2 = CoachingSegmentsActivity.this.mDeletePopup;
            if (go0Var2 != null) {
                go0Var2.IIX1OXO();
            }
        }
    }

    public static final class XIi00iiXO extends DragListView.AbstractC19079iO {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public boolean IiI10X(int i, int i2) {
            Collections.swap(CoachingSegmentsActivity.this.getMList(), i, i2);
            CoachingSegmentsActivity.this.getMListAdapter().notifyDataSetChanged();
            return true;
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public void O00(View view) {
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public Bitmap XO0O10(View view, Bitmap bitmap) {
            return null;
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        /* JADX INFO: renamed from: iO */
        public boolean mo38509iO(View view, int i, int i2) {
            Intrinsics.XXI(view);
            View viewFindViewById = view.findViewById(R.id.iv_reorder);
            if (viewFindViewById == null || viewFindViewById.getVisibility() != 0) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildAt(0).getTranslationX() < 0.0f) {
                return false;
            }
            float x = i - viewGroup.getX();
            float y = i2 - viewGroup.getY();
            viewFindViewById.getHitRect(CoachingSegmentsActivity.this.mDragRect);
            return CoachingSegmentsActivity.this.mDragRect.contains((int) x, (int) y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCount() {
        getTitleRight().setEnabled(getMList().size() < q62.OXO1.Ii0i());
    }

    private final View getTitleRight() {
        return (View) this.titleRight$delegate.getValue();
    }

    private final BleCoachingSegment newSegment() {
        return new BleCoachingSegment(CompletionCondition.DURATION.getCondition(), "", SegmentActivity.TIMER.getActivity(), Stage.GO_FOR.getStage(), 0, 0, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBottomClick$lambda$0(CoachingSegmentsActivity coachingSegmentsActivity, BleConnector it) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(it, "it");
        SPUtils sPUtilsXO0O10 = a01.OXO1.XO0O10();
        Object objFromJson = new Gson().fromJson(sPUtilsXO0O10.getString(BleCoaching.class.getName()), (Class<Object>) BleCoaching.class);
        if (objFromJson == null) {
            objFromJson = BleCoaching.class.newInstance();
        }
        ((BleCoaching) objFromJson).setMSegments(coachingSegmentsActivity.getMList());
        sPUtilsXO0O10.put(BleCoaching.class.getName(), new Gson().toJson(objFromJson));
        coachingSegmentsActivity.setResult(-1);
        coachingSegmentsActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View titleRight_delegate$lambda$0(CoachingSegmentsActivity coachingSegmentsActivity) {
        return coachingSegmentsActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toEdit(int i) {
        this.mIndex = i;
        a01.OXO1.XO0O10().put(BleCoachingSegment.class.getName(), new Gson().toJson(i < 0 ? newSegment() : getMList().get(i)));
        int i2 = this.mIndex;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", i2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) CoachingSegmentEditActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 0);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<BleCoachingSegment> initList() throws IllegalAccessException, InstantiationException {
        Object objFromJson = new Gson().fromJson(a01.OXO1.XO0O10().getString(BleCoaching.class.getName()), (Class<Object>) BleCoaching.class);
        if (objFromJson == null) {
            objFromJson = BleCoaching.class.newInstance();
        }
        return CollectionsKt___CollectionsKt.OO0Oi10(((BleCoaching) objFromJson).getMSegments());
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.coaching_segments);
        ImageView imageView = (ImageView) findViewById(R.id.abh_title_right);
        imageView.setImageResource(R.drawable.ic_coaching_add);
        imageView.setVisibility(0);
        ListView mListView = getMListView();
        Intrinsics.X1ii(mListView, "null cannot be cast to non-null type com.sma.smartv3.view.swipelist.DragListView");
        ((DragListView) mListView).setDragItemListener(new XIi00iiXO());
        checkCount();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.item_coaching_segment;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_coaching_segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IllegalAccessException, InstantiationException {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (this.mIndex < 0) {
                List<BleCoachingSegment> mList = getMList();
                Object objFromJson = new Gson().fromJson(a01.OXO1.XO0O10().getString(BleCoachingSegment.class.getName()), (Class<Object>) BleCoachingSegment.class);
                if (objFromJson == null) {
                    objFromJson = BleCoachingSegment.class.newInstance();
                }
                mList.add(objFromJson);
            } else {
                List<BleCoachingSegment> mList2 = getMList();
                int i3 = this.mIndex;
                Object objFromJson2 = new Gson().fromJson(a01.OXO1.XO0O10().getString(BleCoachingSegment.class.getName()), (Class<Object>) BleCoachingSegment.class);
                if (objFromJson2 == null) {
                    objFromJson2 = BleCoachingSegment.class.newInstance();
                }
                mList2.set(i3, objFromJson2);
            }
            getMListAdapter().notifyDataSetChanged();
            checkCount();
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iI0OII
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CoachingSegmentsActivity.onBottomClick$lambda$0(this.f7798IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        toEdit(-1);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 BleCoachingSegment item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        BleCoachingSegment bleCoachingSegment = getMList().get(i);
        holder.XXI(R.id.iv_activity, X1OOO.OXO1(getMContext(), "ic_segment_activity" + bleCoachingSegment.getMActivity(), "drawable", R.drawable.ic_segment_activity0));
        vg6.XO0O10(holder, R.id.tv_stage, X1OOO.OXO1(getMContext(), "segment_stage" + bleCoachingSegment.getMStage(), TypedValues.Custom.S_STRING, R.string.segment_stage255));
        String mName = bleCoachingSegment.getMName();
        if (StringsKt__StringsKt.i0XI0(mName)) {
            mName = getString(R.string.coaching_segment_d, Integer.valueOf(i + 1));
            Intrinsics.O10IXXX0X(mName, "getString(...)");
        }
        holder.OII(R.id.tv_name, mName);
        CompletionValueView completionValueView = (CompletionValueView) holder.O00(R.id.completion_value);
        int mCompletionCondition = bleCoachingSegment.getMCompletionCondition();
        if (mCompletionCondition == CompletionCondition.DURATION.getCondition() || mCompletionCondition == CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) {
            completionValueView.setMDuration(bleCoachingSegment.getMCompletionValue());
        } else if (mCompletionCondition != CompletionCondition.MANUAL.getCondition() && (mCompletionCondition == CompletionCondition.HR_BELOW.getCondition() || mCompletionCondition == CompletionCondition.HR_ABOVE.getCondition())) {
            completionValueView.setMBpm(bleCoachingSegment.getMCompletionValue());
        }
        SwipeLayout swipeLayout = (SwipeLayout) holder.O00(R.id.swipe_layout);
        swipeLayout.O00(true);
        swipeLayout.setSwipeListener(new OXO1(i));
    }
}
