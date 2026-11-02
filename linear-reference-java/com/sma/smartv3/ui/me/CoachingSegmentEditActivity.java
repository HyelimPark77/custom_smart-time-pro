package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I0OOi10II;
import com.android.mltcode.paycertificationapi.I0XIXI11O;
import com.android.mltcode.paycertificationapi.IIXIOXO;
import com.android.mltcode.paycertificationapi.IOiI0XX;
import com.android.mltcode.paycertificationapi.Ii1iX11;
import com.android.mltcode.paycertificationapi.IiO0I;
import com.android.mltcode.paycertificationapi.Iii1OOI;
import com.android.mltcode.paycertificationapi.O00O;
import com.android.mltcode.paycertificationapi.O10OIXOX;
import com.android.mltcode.paycertificationapi.O11X1Xii;
import com.android.mltcode.paycertificationapi.O1Xii;
import com.android.mltcode.paycertificationapi.OOI11;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X10100Ii;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XIOII0;
import com.android.mltcode.paycertificationapi.XO0IXO1O;
import com.android.mltcode.paycertificationapi.XOO1I0I;
import com.android.mltcode.paycertificationapi.Xi0IOi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.iOXX;
import com.android.mltcode.paycertificationapi.iOXX1i;
import com.android.mltcode.paycertificationapi.iXIiIiO;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.FontEditText;
import com.sma.smartv3.view.text.FontTextView;
import com.szabh.smable3.entity.BleCoachingSegment;
import com.szabh.smable3.entity.CompletionCondition;
import com.szabh.smable3.entity.HrZone;
import com.szabh.smable3.entity.SegmentActivity;
import com.szabh.smable3.entity.Stage;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCoachingSegmentEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingSegmentEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentEditActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n18#2,2:346\n15#2:348\n11#2,2:395\n55#3,12:349\n84#3,3:361\n11561#4:364\n11896#4,3:365\n1772#4,6:368\n11561#4:374\n11896#4,3:375\n1772#4,6:378\n11561#4:385\n11896#4,3:386\n1772#4,6:389\n1#5:384\n*S KotlinDebug\n*F\n+ 1 CoachingSegmentEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentEditActivity\n*L\n68#1:346,2\n68#1:348\n336#1:395,2\n83#1:349,12\n83#1:361,3\n170#1:364\n170#1:365,3\n183#1:368,6\n224#1:374\n224#1:375,3\n252#1:378,6\n278#1:385\n278#1:386,3\n290#1:389,6\n*E\n"})
public final class CoachingSegmentEditActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    public static final int HR_MAX = 220;
    public static final int HR_MIN = 40;

    @aa1
    private final Lazy btnBottom$delegate;

    @aa1
    private final Lazy edtName$delegate;

    @aa1
    private final SegmentActivity[] mActivities;

    @tb1
    private iXIiIiO mActivityPop;

    @tb1
    private qv1 mBpmPopup;

    @tb1
    private dj4 mCompletionConditionPopup;

    @aa1
    private final CompletionCondition[] mConditions;

    @tb1
    private go0 mDiscardChangesPopup;

    @tb1
    private I0OOi10II mDurationPickerPopup;
    private final int mGridItemPadding;

    @tb1
    private dj4 mHrZonePopup;

    @aa1
    private HrZone[] mHrZones;

    @aa1
    private final BleCoachingSegment mOriginSegment;

    @tb1
    private qv1 mRepeatPopup;

    @aa1
    private final BleCoachingSegment mSegment;

    @tb1
    private dj4 mStagePopup;

    @aa1
    private final Stage[] mStages;

    @aa1
    private final Function1<Editable, Unit> mTextWatcher;

    @aa1
    private final Lazy tv12$delegate;

    @aa1
    private final Lazy tv21$delegate;

    @aa1
    private final Lazy tv22$delegate;

    @aa1
    private final Lazy tv31$delegate;

    @aa1
    private final Lazy tv32$delegate;

    @aa1
    private final Lazy tvActivity$delegate;

    @aa1
    private final Lazy tvStage$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n59#2:83\n62#3:84\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {
        public final /* synthetic */ Function1 IO;

        public XIi00iiXO(Function1 r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            invoke(r2);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class iO extends BaseAdapter {
        public final /* synthetic */ iXIiIiO I1;
        public final /* synthetic */ CoachingSegmentEditActivity IO;

        public iO(CoachingSegmentEditActivity r1, iXIiIiO r2) {
            this.IO = r1;
            this.I1 = r2;
        }

        public static /* synthetic */ void OXO1(CoachingSegmentEditActivity r0, int r1, iXIiIiO r2, View r3) {
            XIi00iiXO(r0, r1, r2, r3);
        }

        public static final void XIi00iiXO(CoachingSegmentEditActivity r1, int r2, iXIiIiO r3, View r4) {
            CoachingSegmentEditActivity.access$getMSegment$p(r1).setMActivity(CoachingSegmentEditActivity.access$getMActivities$p(r1)[r2].getActivity());
            CoachingSegmentEditActivity.access$updateActivity(r1);
            r3.dismiss();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return CoachingSegmentEditActivity.access$getMActivities$p(this.IO).length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int r1) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
            return r3;
        }

        @Override // android.widget.Adapter
        public View getView(final int r5, View r6, ViewGroup r7) {
            ImageView r8 = new ImageView(CoachingSegmentEditActivity.access$getMContext(this.IO));
            final CoachingSegmentEditActivity r9 = this.IO;
            final iXIiIiO r0 = this.I1;
            r8.setPadding(0, CoachingSegmentEditActivity.access$getMGridItemPadding$p(r9), 0, CoachingSegmentEditActivity.access$getMGridItemPadding$p(r9));
            r8.setColorFilter(R.color.text_color, PorterDuff.Mode.DST);
            r8.setImageResource(X1OOO.OXO1(r9, "ic_segment_activity" + CoachingSegmentEditActivity.access$getMActivities$p(r9)[r5].getActivity(), "drawable", R.drawable.ic_segment_activity0));
            r8.setOnClickListener(new XO0IXO1O(r9, r5, r0));
            return r8;
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public CoachingSegmentEditActivity() {
        this.edtName$delegate = LazyKt__LazyJVMKt.iO(new Xi0IOi(this));
        this.tvStage$delegate = LazyKt__LazyJVMKt.iO(new O11X1Xii(this));
        this.tvActivity$delegate = LazyKt__LazyJVMKt.iO(new O00O(this));
        this.tv12$delegate = LazyKt__LazyJVMKt.iO(new IOiI0XX(this));
        this.tv21$delegate = LazyKt__LazyJVMKt.iO(new Iii1OOI(this));
        this.tv22$delegate = LazyKt__LazyJVMKt.iO(new O1Xii(this));
        this.tv31$delegate = LazyKt__LazyJVMKt.iO(new XOO1I0I(this));
        this.tv32$delegate = LazyKt__LazyJVMKt.iO(new OOI11(this));
        this.btnBottom$delegate = LazyKt__LazyJVMKt.iO(new XIOII0(this));
        this.mTextWatcher = new IiO0I(this);
        this.mStages = Stage.values();
        this.mActivities = SegmentActivity.values();
        this.mGridItemPadding = ConvertUtils.dp2px(12.0f);
        this.mConditions = CompletionCondition.values();
        this.mHrZones = HrZone.values();
        SPUtils r0 = a01.OXO1.XO0O10();
        Object r1 = new Gson().fromJson(r0.getString(BleCoachingSegment.class.getName()), BleCoachingSegment.class);
        if (r1 != null) goto L5;
        r1 = BleCoachingSegment.class.newInstance();
    L5:
        BleCoachingSegment r2 = (BleCoachingSegment) r1;
        this.mSegment = r2;
        this.mOriginSegment = BleCoachingSegment.copy$default(r2, 0, null, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ FontTextView I0iXXO(CoachingSegmentEditActivity r0) {
        return tv31_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FontTextView I1(CoachingSegmentEditActivity r0) {
        return tv22_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FontEditText I1XOi1(CoachingSegmentEditActivity r0) {
        return edtName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IIX1OXO(CoachingSegmentEditActivity r0, int r1) {
        return setCondition2$lambda$4$0(r0, r1);
    }

    public static /* synthetic */ FontTextView O10IXXX0X(CoachingSegmentEditActivity r0) {
        return tvStage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FontTextView OII(CoachingSegmentEditActivity r0) {
        return tv32_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(CoachingSegmentEditActivity r0, int r1) {
        return setCondition3$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OX(CoachingSegmentEditActivity r0, Editable r1) {
        return mTextWatcher$lambda$0(r0, r1);
    }

    public static /* synthetic */ FontTextView OiIIX101O(CoachingSegmentEditActivity r0) {
        return tvActivity_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0O(CoachingSegmentEditActivity r0, int r1) {
        return setCondition2$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ FontTextView X1ii(CoachingSegmentEditActivity r0) {
        return tv21_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XX0(CoachingSegmentEditActivity r0) {
        return onTitleLeftClick$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean XXI(CoachingSegmentEditActivity r0, int r1) {
        return setCondition3$lambda$3$0(r0, r1);
    }

    public static /* synthetic */ View XiOIO(CoachingSegmentEditActivity r0) {
        return btnBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FontTextView XiOIii1(CoachingSegmentEditActivity r0) {
        return tv12_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ SegmentActivity[] access$getMActivities$p(CoachingSegmentEditActivity r0) {
        return r0.mActivities;
    }

    public static final /* synthetic */ Activity access$getMContext(CoachingSegmentEditActivity r0) {
        return r0.getMContext();
    }

    public static final /* synthetic */ int access$getMGridItemPadding$p(CoachingSegmentEditActivity r0) {
        return r0.mGridItemPadding;
    }

    public static final /* synthetic */ BleCoachingSegment access$getMSegment$p(CoachingSegmentEditActivity r0) {
        return r0.mSegment;
    }

    public static final /* synthetic */ void access$updateActivity(CoachingSegmentEditActivity r0) {
        r0.updateActivity();
    }

    private static final View btnBottom_delegate$lambda$0(CoachingSegmentEditActivity r1) {
        return r1.findViewById(R.id.btn_bottom);
    }

    private final void checkFields() {
        getBtnBottom().setEnabled(!TextUtils.isEmpty(this.mSegment.getMName()));
    }

    private static final FontEditText edtName_delegate$lambda$0(CoachingSegmentEditActivity r1) {
        return (FontEditText) r1.findViewById(R.id.edt_name);
    }

    private final View getBtnBottom() {
        return (View) getValue();
    }

    private final FontEditText getEdtName() {
        return (FontEditText) getValue();
    }

    private final FontTextView getTv12() {
        return (FontTextView) getValue();
    }

    private final FontTextView getTv21() {
        return (FontTextView) getValue();
    }

    private final FontTextView getTv22() {
        return (FontTextView) getValue();
    }

    private final FontTextView getTv31() {
        return (FontTextView) getValue();
    }

    private final FontTextView getTv32() {
        return (FontTextView) getValue();
    }

    private final FontTextView getTvActivity() {
        return (FontTextView) getValue();
    }

    private final FontTextView getTvStage() {
        return (FontTextView) getValue();
    }

    public static /* synthetic */ boolean iIiiO(CoachingSegmentEditActivity r0, int r1) {
        return setCompletionCondition$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ boolean iOOX010X(CoachingSegmentEditActivity r0, int r1) {
        return setStage$lambda$1$0(r0, r1);
    }

    private static final Unit mTextWatcher$lambda$0(CoachingSegmentEditActivity r1, Editable r2) {
        BleCoachingSegment r0 = r1.mSegment;
        if (r2 == null) goto L6;
        String r3 = r2.toString();
        if (r3 == null) goto L6;
    L7:
        r0.setMName(r3);
        r1.checkFields();
        return Unit.OXO1;
    L6:
        r3 = "";
        goto L7
    }

    private static final boolean onTitleLeftClick$lambda$0$0(CoachingSegmentEditActivity r0) {
        r0.finish();
        return true;
    }

    private static final boolean setCompletionCondition$lambda$1$0(CoachingSegmentEditActivity r2, int r3) {
        r2.mSegment.setMCompletionCondition(r2.mConditions[r3].getCondition());
        int r4 = r2.mSegment.getMCompletionCondition();
        if (r4 != CompletionCondition.DURATION.getCondition()) goto L6;
        r2.mSegment.setMCompletionValue(30);
    L16:
        r2.updateCompleteCondition();
        return true;
    L6:
        if (r4 != CompletionCondition.MANUAL.getCondition()) goto L9;
        r2.mSegment.setMCompletionValue(10);
        goto L16
    L9:
        if (r4 != CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) goto L12;
        r2.mSegment.setMCompletionValue(30);
        r2.mSegment.setMHrZone(HrZone.MODERATE.getZone());
        goto L16
    L12:
        if (r4 != CompletionCondition.HR_ABOVE.getCondition()) goto L14;
    L15:
        r2.mSegment.setMCompletionValue(100);
        goto L16
    L14:
        if (r4 != CompletionCondition.HR_BELOW.getCondition()) goto L16;
        goto L15
    }

    private static final boolean setCondition2$lambda$1$0(CoachingSegmentEditActivity r2, int r3) {
        r2.mSegment.setMCompletionValue(r3 + 1);
        r2.updateCompletionValue();
        return true;
    }

    private static final boolean setCondition2$lambda$4$0(CoachingSegmentEditActivity r2, int r3) {
        r2.mSegment.setMHrZone(r2.mHrZones[r3].getZone());
        r2.updateCompletionValue();
        return true;
    }

    private static final boolean setCondition3$lambda$0$0(CoachingSegmentEditActivity r1, int r2) {
        r1.mSegment.setMCompletionValue(r2);
        r1.updateCompletionValue();
        return true;
    }

    private static final boolean setCondition3$lambda$3$0(CoachingSegmentEditActivity r1, int r2) {
        r1.mSegment.setMCompletionValue(r2 + 40);
        r1.updateCompletionValue();
        return true;
    }

    private static final boolean setStage$lambda$1$0(CoachingSegmentEditActivity r2, int r3) {
        r2.mSegment.setMStage(r2.mStages[r3].getStage());
        r2.updateStage();
        return true;
    }

    private static final FontTextView tv12_delegate$lambda$0(CoachingSegmentEditActivity r1) {
        return (FontTextView) r1.findViewById(R.id.tv_1_2);
    }

    private static final FontTextView tv21_delegate$lambda$0(CoachingSegmentEditActivity r1) {
        return (FontTextView) r1.findViewById(R.id.tv_2_1);
    }

    private static final FontTextView tv22_delegate$lambda$0(CoachingSegmentEditActivity r1) {
        return (FontTextView) r1.findViewById(R.id.tv_2_2);
    }

    private static final FontTextView tv31_delegate$lambda$0(CoachingSegmentEditActivity r1) {
        return (FontTextView) r1.findViewById(R.id.tv_3_1);
    }

    private static final FontTextView tv32_delegate$lambda$0(CoachingSegmentEditActivity r1) {
        return (FontTextView) r1.findViewById(R.id.tv_3_2);
    }

    private static final FontTextView tvActivity_delegate$lambda$0(CoachingSegmentEditActivity r1) {
        return (FontTextView) r1.findViewById(R.id.tv_activity);
    }

    private static final FontTextView tvStage_delegate$lambda$0(CoachingSegmentEditActivity r1) {
        return (FontTextView) r1.findViewById(R.id.tv_stage);
    }

    private final void updateActivity() {
        getTvActivity().setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(getMContext(), X1OOO.OXO1(this, "ic_segment_activity" + this.mSegment.getMActivity(), "drawable", R.drawable.ic_segment_activity0)), null, null, null);
        getTvActivity().setText(X1OOO.OXO1(this, "segment_activity" + this.mSegment.getMActivity(), TypedValues.Custom.S_STRING, R.string.segment_activity0));
    }

    private final void updateCompleteCondition() {
        getTv12().setText(X1OOO.OXO1(this, "completion_condition" + this.mSegment.getMCompletionCondition(), TypedValues.Custom.S_STRING, R.string.completion_condition0));
        updateCompletionValue();
    }

    private final void updateCompletionValue() {
        int r0 = this.mSegment.getMCompletionCondition();
        if (r0 != CompletionCondition.DURATION.getCondition()) goto L7;
        FontTextView r1 = getTv21();
        Intrinsics.O10IXXX0X(r1, "<get-tv21>(...)");
        OiOX0i.OXO1(r1).setVisibility(8);
        getTv31().setText(R.string.duration);
        getTv32().setText(cp5.iOiXi11II(this.mSegment.getMCompletionValue()));
        return;
    L7:
        if (r0 != CompletionCondition.MANUAL.getCondition()) goto L11;
        FontTextView r2 = getTv21();
        Intrinsics.O10IXXX0X(r2, "<get-tv21>(...)");
        OiOX0i.OXO1(r2).setVisibility(0);
        getTv21().setText(R.string.repeat);
        getTv22().setText(String.valueOf(this.mSegment.getMCompletionValue()));
        getTv31().setText(R.string.duration);
        getTv32().setText(R.string.util_button_pressed);
        return;
    L11:
        if (r0 != CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) goto L15;
        FontTextView r3 = getTv21();
        Intrinsics.O10IXXX0X(r3, "<get-tv21>(...)");
        OiOX0i.OXO1(r3).setVisibility(0);
        getTv21().setText(R.string.hr_zone);
        getTv22().setText(X1OOO.OXO1(this, "hr_zone" + this.mSegment.getMHrZone(), TypedValues.Custom.S_STRING, R.string.hr_zone1));
        getTv31().setText(R.string.duration);
        getTv32().setText(cp5.iOiXi11II(this.mSegment.getMCompletionValue()));
        return;
    L15:
        if (r0 != CompletionCondition.HR_ABOVE.getCondition()) goto L17;
    L20:
        FontTextView r4 = getTv22();
        Intrinsics.O10IXXX0X(r4, "<get-tv22>(...)");
        OiOX0i.OXO1(r4).setVisibility(8);
        getTv31().setText(R.string.value);
        getTv32().setText(getString(R.string.d_bpm, new Object[]{Integer.valueOf(this.mSegment.getMCompletionValue())}));
        return;
    L17:
        if (r0 == CompletionCondition.HR_BELOW.getCondition()) goto L20;
    }

    private final void updateStage() {
        getTvStage().setText(X1OOO.OXO1(getMContext(), "segment_stage" + this.mSegment.getMStage(), TypedValues.Custom.S_STRING, R.string.segment_stage255));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (getMArg1() >= 0) goto L5;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add);
    L6:
        getEdtName().setText(this.mSegment.getMName());
        FontEditText r0 = getEdtName();
        Intrinsics.O10IXXX0X(r0, "<get-edtName>(...)");
        r0.addTextChangedListener(new XIi00iiXO(this.mTextWatcher));
        updateStage();
        updateActivity();
        updateCompleteCondition();
        checkFields();
        return;
    L5:
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_coaching_segment_edit;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r1, int r2, @tb1 Intent r3) {
        super.onActivityResult(r1, r2, r3);
        if (r2 != (-1)) goto L6;
        setResult(-1);
        finish();
        return;
    }

    public final void onBottomClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        SPUtils r5 = a01.OXO1.XO0O10();
        BleCoachingSegment r0 = this.mSegment;
        r5.put(BleCoachingSegment.class.getName(), new Gson().toJson(r0));
        setResult(-1);
        finish();
    }

    public final void onTitleLeftClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (Intrinsics.XOO0ii0(this.mSegment, this.mOriginSegment) == false) goto L7;
        finish();
        return;
    L7:
        if (this.mDiscardChangesPopup != null) goto L9;
        go0 r6 = new go0(getMContext(), 0, 2, null);
        r6.O1O(R.string.discard_change_to_segment_tip);
        go0.X11iII1O1(r6, Integer.valueOf(R.string.cancel), null, 2, null);
        r6.X1IX(R.string.confirm, new iOXX(this));
        this.mDiscardChangesPopup = r6;
    L9:
        go0 r7 = this.mDiscardChangesPopup;
        if (r7 == null) goto L13;
        r7.IIX1OXO();
        return;
    }

    public final void setActivity(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.mActivityPop != null) goto L5;
        iXIiIiO r3 = new iXIiIiO(getMContext());
        r3.OX(R.string.segment_activity);
        r3.OII(new iO(this, r3));
        this.mActivityPop = r3;
    L5:
        iXIiIiO r4 = this.mActivityPop;
        if (r4 == null) goto L9;
        r4.IIX1OXO();
        return;
    }

    public final void setCompletionCondition(@aa1 View r9) {
        Intrinsics.X0O(r9, "view");
        int r0 = 0;
        if (this.mCompletionConditionPopup != null) goto L8;
        CompletionCondition[] r10 = this.mConditions;
        ArrayList r3 = new ArrayList(r10.length);
        int r1 = r10.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        CompletionCondition r4 = r10[r2];
        String r5 = getString(X1OOO.OXO1(getMContext(), "completion_condition" + r4.getCondition(), TypedValues.Custom.S_STRING, R.string.completion_condition0));
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        r3.add(r5);
        r2 = r2 + 1;
        goto L5
    L7:
        CoachingSegmentEditActivity r6 = this;
        dj4 r7 = new dj4(r6, r3, 0, 4, null);
        r7.iX(R.string.set_to);
        r7.i010I(new O10OIXOX(this));
        r6.mCompletionConditionPopup = r7;
    L9:
        dj4 r11 = r6.mCompletionConditionPopup;
        if (r11 == null) goto L23;
        CompletionCondition[] r8 = r6.mConditions;
        int r12 = r8.length;
    L12:
        if (r0 >= r12) goto L17;
        if (r8[r0].getCondition() == r6.mSegment.getMCompletionCondition()) goto L18;
        r0 = r0 + 1;
    L18:
        r11.II1Xi0(r0);
        r11.IIX1OXO();
        return;
    L17:
        r0 = -1;
        goto L18
    L23:
        return;
    L8:
        r6 = this;
        goto L9
    }

    public final void setCondition2(@aa1 View r9) {
        Intrinsics.X0O(r9, "view");
        int r10 = this.mSegment.getMCompletionCondition();
        int r1 = 0;
        if (r10 != CompletionCondition.MANUAL.getCondition()) goto L16;
        if (this.mRepeatPopup != null) goto L10;
        Activity r11 = getMContext();
        ArrayList r0 = new ArrayList(100);
    L7:
        if (r1 >= 100) goto L9;
        r1 = r1 + 1;
        r0.add(String.valueOf(r1));
        goto L7
    L9:
        qv1 r2 = new qv1(r11, r0);
        r2.IXXOO(R.string.repeat);
        r2.iOO1ii1(R.string.times);
        r2.iX(new X10100Ii(this));
        this.mRepeatPopup = r2;
    L10:
        qv1 r12 = this.mRepeatPopup;
        if (r12 == null) goto L39;
        r12.O1O(this.mSegment.getMCompletionValue() - 1);
        r12.IIX1OXO();
        return;
    L39:
        return;
    L16:
        if (r10 != CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) goto L39;
        if (this.mHrZonePopup != null) goto L23;
        HrZone[] r13 = this.mHrZones;
        ArrayList r4 = new ArrayList(r13.length);
        int r3 = r13.length;
        int r5 = 0;
    L20:
        if (r5 >= r3) goto L22;
        String r6 = getString(X1OOO.OXO1(this, "hr_zone" + r13[r5].getZone(), TypedValues.Custom.S_STRING, R.string.hr_zone1));
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        r4.add(r6);
        r5 = r5 + 1;
        goto L20
    L22:
        CoachingSegmentEditActivity r7 = this;
        dj4 r8 = new dj4(r7, r4, 0, 4, null);
        r8.iX(R.string.hr_zone);
        r8.i010I(new I0XIXI11O(this));
        r7.mHrZonePopup = r8;
    L24:
        dj4 r14 = r7.mHrZonePopup;
        if (r14 == null) goto L40;
        HrZone[] r15 = r7.mHrZones;
        int r16 = r15.length;
    L27:
        if (r1 >= r16) goto L32;
        if (r15[r1].getZone() == r7.mSegment.getMHrZone()) goto L33;
        r1 = r1 + 1;
    L33:
        r14.II1Xi0(r1);
        r14.IIX1OXO();
        return;
    L32:
        r1 = -1;
        goto L33
    L40:
        return;
    L23:
        r7 = this;
        goto L24
    }

    public final void setCondition3(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        int r6 = this.mSegment.getMCompletionCondition();
        if (r6 == CompletionCondition.DURATION.getCondition()) goto L22;
        if (r6 == CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) goto L22;
        if (r6 == CompletionCondition.HR_ABOVE.getCondition()) goto L12;
        if (r6 == CompletionCondition.HR_BELOW.getCondition()) goto L12;
        return;
    L12:
        if (this.mBpmPopup != null) goto L17;
        Activity r7 = getMContext();
        ArrayList r0 = new ArrayList(180);
        int r2 = 0;
    L14:
        if (r2 >= 180) goto L16;
        r0.add(String.valueOf(r2 + 40));
        r2 = r2 + 1;
        goto L14
    L16:
        qv1 r1 = new qv1(r7, r0);
        r1.IXXOO(R.string.value);
        r1.iOO1ii1(R.string.bpm);
        r1.iX(new IIXIOXO(this));
        this.mBpmPopup = r1;
    L17:
        qv1 r8 = this.mBpmPopup;
        if (r8 == null) goto L30;
        r8.O1O(this.mSegment.getMCompletionValue() - 40);
        r8.IIX1OXO();
        return;
    L30:
        return;
    L22:
        if (this.mDurationPickerPopup != null) goto L24;
        I0OOi10II r9 = new I0OOi10II(getMContext());
        r9.IXXOO(R.string.duration);
        r9.iX(new iOXX1i(this));
        this.mDurationPickerPopup = r9;
    L24:
        I0OOi10II r10 = this.mDurationPickerPopup;
        if (r10 == null) goto L31;
        r10.i010I(this.mSegment.getMCompletionValue());
        r10.IIX1OXO();
        return;
    }

    public final void setStage(@aa1 View r9) {
        Intrinsics.X0O(r9, "view");
        int r0 = 0;
        if (this.mStagePopup != null) goto L8;
        Stage[] r10 = this.mStages;
        ArrayList r3 = new ArrayList(r10.length);
        int r1 = r10.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        Stage r4 = r10[r2];
        String r5 = getString(X1OOO.OXO1(getMContext(), "segment_stage" + r4.getStage(), TypedValues.Custom.S_STRING, R.string.segment_stage255));
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        r3.add(r5);
        r2 = r2 + 1;
        goto L5
    L7:
        CoachingSegmentEditActivity r6 = this;
        dj4 r7 = new dj4(r6, r3, 0, 4, null);
        r7.iX(R.string.segment_type);
        r7.i010I(new Ii1iX11(this));
        r6.mStagePopup = r7;
    L9:
        dj4 r11 = r6.mStagePopup;
        if (r11 == null) goto L23;
        Stage[] r8 = r6.mStages;
        int r12 = r8.length;
    L12:
        if (r0 >= r12) goto L17;
        if (r8[r0].getStage() == r6.mSegment.getMStage()) goto L18;
        r0 = r0 + 1;
    L18:
        r11.II1Xi0(r0);
        r11.IIX1OXO();
        return;
    L17:
        r0 = -1;
        goto L18
    L23:
        return;
    L8:
        r6 = this;
        goto L9
    }
}
