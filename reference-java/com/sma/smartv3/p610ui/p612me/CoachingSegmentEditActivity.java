package com.sma.smartv3.p610ui.p612me;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.iXIiIiO;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ConvertUtils;
import com.google.gson.Gson;
import com.sma.smartv3.p610ui.p612me.CoachingSegmentEditActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCoachingSegmentEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingSegmentEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentEditActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n18#2,2:346\n15#2:348\n11#2,2:395\n55#3,12:349\n84#3,3:361\n11561#4:364\n11896#4,3:365\n1772#4,6:368\n11561#4:374\n11896#4,3:375\n1772#4,6:378\n11561#4:385\n11896#4,3:386\n1772#4,6:389\n1#5:384\n*S KotlinDebug\n*F\n+ 1 CoachingSegmentEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentEditActivity\n*L\n68#1:346,2\n68#1:348\n336#1:395,2\n83#1:349,12\n83#1:361,3\n170#1:364\n170#1:365,3\n183#1:368,6\n224#1:374\n224#1:375,3\n252#1:378,6\n278#1:385\n278#1:386,3\n290#1:389,6\n*E\n"})
public final class CoachingSegmentEditActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int HR_MAX = 220;
    public static final int HR_MIN = 40;

    @tb1
    private iXIiIiO mActivityPop;

    @tb1
    private qv1 mBpmPopup;

    @tb1
    private dj4 mCompletionConditionPopup;

    @tb1
    private go0 mDiscardChangesPopup;

    @tb1
    private I0OOi10II mDurationPickerPopup;

    @tb1
    private dj4 mHrZonePopup;

    @aa1
    private final BleCoachingSegment mOriginSegment;

    @tb1
    private qv1 mRepeatPopup;

    @aa1
    private final BleCoachingSegment mSegment;

    @tb1
    private dj4 mStagePopup;

    @aa1
    private final Lazy edtName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Xi0IOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentEditActivity.edtName_delegate$lambda$0(this.f5197IO);
        }
    });

    @aa1
    private final Lazy tvStage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O11X1Xii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentEditActivity.tvStage_delegate$lambda$0(this.f2681IO);
        }
    });

    @aa1
    private final Lazy tvActivity$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O00O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentEditActivity.tvActivity_delegate$lambda$0(this.f2366IO);
        }
    });

    @aa1
    private final Lazy tv12$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiI0XX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentEditActivity.tv12_delegate$lambda$0(this.f1900IO);
        }
    });

    @aa1
    private final Lazy tv21$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Iii1OOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentEditActivity.tv21_delegate$lambda$0(this.f2321IO);
        }
    });

    @aa1
    private final Lazy tv22$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1Xii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentEditActivity.tv22_delegate$lambda$0(this.f2822IO);
        }
    });

    @aa1
    private final Lazy tv31$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOO1I0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentEditActivity.tv31_delegate$lambda$0(this.f4802IO);
        }
    });

    @aa1
    private final Lazy tv32$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOI11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentEditActivity.tv32_delegate$lambda$0(this.f3209IO);
        }
    });

    @aa1
    private final Lazy btnBottom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIOII0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingSegmentEditActivity.btnBottom_delegate$lambda$0(this.f4547IO);
        }
    });

    @aa1
    private final Function1<Editable, Unit> mTextWatcher = new Function1() { // from class: com.android.mltcode.paycertificationapi.IiO0I
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return CoachingSegmentEditActivity.mTextWatcher$lambda$0(this.f2252IO, (Editable) obj);
        }
    };

    @aa1
    private final Stage[] mStages = Stage.values();

    @aa1
    private final SegmentActivity[] mActivities = SegmentActivity.values();
    private final int mGridItemPadding = ConvertUtils.dp2px(12.0f);

    @aa1
    private final CompletionCondition[] mConditions = CompletionCondition.values();

    @aa1
    private HrZone[] mHrZones = HrZone.values();

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n59#2:83\n62#3:84\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Function1 f54653IO;

        public XIi00iiXO(Function1 function1) {
            this.f54653IO = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f54653IO.invoke2(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.CoachingSegmentEditActivity$iO */
    public static final class C18863iO extends BaseAdapter {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ iXIiIiO f54654I1;

        public C18863iO(iXIiIiO ixiiiio) {
            this.f54654I1 = ixiiiio;
        }

        public static final void XIi00iiXO(CoachingSegmentEditActivity coachingSegmentEditActivity, int i, iXIiIiO ixiiiio, View view) {
            coachingSegmentEditActivity.mSegment.setMActivity(coachingSegmentEditActivity.mActivities[i].getActivity());
            coachingSegmentEditActivity.updateActivity();
            ixiiiio.dismiss();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return CoachingSegmentEditActivity.this.mActivities.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            ImageView imageView = new ImageView(CoachingSegmentEditActivity.this.getMContext());
            final CoachingSegmentEditActivity coachingSegmentEditActivity = CoachingSegmentEditActivity.this;
            final iXIiIiO ixiiiio = this.f54654I1;
            imageView.setPadding(0, coachingSegmentEditActivity.mGridItemPadding, 0, coachingSegmentEditActivity.mGridItemPadding);
            imageView.setColorFilter(R.color.text_color, PorterDuff.Mode.DST);
            imageView.setImageResource(X1OOO.OXO1(coachingSegmentEditActivity, "ic_segment_activity" + coachingSegmentEditActivity.mActivities[i].getActivity(), "drawable", R.drawable.ic_segment_activity0));
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XO0IXO1O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CoachingSegmentEditActivity.C18863iO.XIi00iiXO(coachingSegmentEditActivity, i, ixiiiio, view2);
                }
            });
            return imageView;
        }
    }

    public CoachingSegmentEditActivity() {
        Object objFromJson = new Gson().fromJson(a01.OXO1.XO0O10().getString(BleCoachingSegment.class.getName()), (Class<Object>) BleCoachingSegment.class);
        BleCoachingSegment bleCoachingSegment = (BleCoachingSegment) (objFromJson == null ? BleCoachingSegment.class.newInstance() : objFromJson);
        this.mSegment = bleCoachingSegment;
        this.mOriginSegment = BleCoachingSegment.copy$default(bleCoachingSegment, 0, null, 0, 0, 0, 0, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnBottom_delegate$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        return coachingSegmentEditActivity.findViewById(R.id.btn_bottom);
    }

    private final void checkFields() {
        getBtnBottom().setEnabled(!TextUtils.isEmpty(this.mSegment.getMName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontEditText edtName_delegate$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        return (FontEditText) coachingSegmentEditActivity.findViewById(R.id.edt_name);
    }

    private final View getBtnBottom() {
        return (View) this.btnBottom$delegate.getValue();
    }

    private final FontEditText getEdtName() {
        return (FontEditText) this.edtName$delegate.getValue();
    }

    private final FontTextView getTv12() {
        return (FontTextView) this.tv12$delegate.getValue();
    }

    private final FontTextView getTv21() {
        return (FontTextView) this.tv21$delegate.getValue();
    }

    private final FontTextView getTv22() {
        return (FontTextView) this.tv22$delegate.getValue();
    }

    private final FontTextView getTv31() {
        return (FontTextView) this.tv31$delegate.getValue();
    }

    private final FontTextView getTv32() {
        return (FontTextView) this.tv32$delegate.getValue();
    }

    private final FontTextView getTvActivity() {
        return (FontTextView) this.tvActivity$delegate.getValue();
    }

    private final FontTextView getTvStage() {
        return (FontTextView) this.tvStage$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mTextWatcher$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity, Editable editable) {
        String string;
        BleCoachingSegment bleCoachingSegment = coachingSegmentEditActivity.mSegment;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        bleCoachingSegment.setMName(string);
        coachingSegmentEditActivity.checkFields();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleLeftClick$lambda$0$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        coachingSegmentEditActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCompletionCondition$lambda$1$0(CoachingSegmentEditActivity coachingSegmentEditActivity, int i) {
        coachingSegmentEditActivity.mSegment.setMCompletionCondition(coachingSegmentEditActivity.mConditions[i].getCondition());
        int mCompletionCondition = coachingSegmentEditActivity.mSegment.getMCompletionCondition();
        if (mCompletionCondition == CompletionCondition.DURATION.getCondition()) {
            coachingSegmentEditActivity.mSegment.setMCompletionValue(30);
        } else if (mCompletionCondition == CompletionCondition.MANUAL.getCondition()) {
            coachingSegmentEditActivity.mSegment.setMCompletionValue(10);
        } else if (mCompletionCondition == CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) {
            coachingSegmentEditActivity.mSegment.setMCompletionValue(30);
            coachingSegmentEditActivity.mSegment.setMHrZone(HrZone.MODERATE.getZone());
        } else if (mCompletionCondition == CompletionCondition.HR_ABOVE.getCondition() || mCompletionCondition == CompletionCondition.HR_BELOW.getCondition()) {
            coachingSegmentEditActivity.mSegment.setMCompletionValue(100);
        }
        coachingSegmentEditActivity.updateCompleteCondition();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCondition2$lambda$1$0(CoachingSegmentEditActivity coachingSegmentEditActivity, int i) {
        coachingSegmentEditActivity.mSegment.setMCompletionValue(i + 1);
        coachingSegmentEditActivity.updateCompletionValue();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCondition2$lambda$4$0(CoachingSegmentEditActivity coachingSegmentEditActivity, int i) {
        coachingSegmentEditActivity.mSegment.setMHrZone(coachingSegmentEditActivity.mHrZones[i].getZone());
        coachingSegmentEditActivity.updateCompletionValue();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCondition3$lambda$0$0(CoachingSegmentEditActivity coachingSegmentEditActivity, int i) {
        coachingSegmentEditActivity.mSegment.setMCompletionValue(i);
        coachingSegmentEditActivity.updateCompletionValue();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCondition3$lambda$3$0(CoachingSegmentEditActivity coachingSegmentEditActivity, int i) {
        coachingSegmentEditActivity.mSegment.setMCompletionValue(i + 40);
        coachingSegmentEditActivity.updateCompletionValue();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setStage$lambda$1$0(CoachingSegmentEditActivity coachingSegmentEditActivity, int i) {
        coachingSegmentEditActivity.mSegment.setMStage(coachingSegmentEditActivity.mStages[i].getStage());
        coachingSegmentEditActivity.updateStage();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontTextView tv12_delegate$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        return (FontTextView) coachingSegmentEditActivity.findViewById(R.id.tv_1_2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontTextView tv21_delegate$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        return (FontTextView) coachingSegmentEditActivity.findViewById(R.id.tv_2_1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontTextView tv22_delegate$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        return (FontTextView) coachingSegmentEditActivity.findViewById(R.id.tv_2_2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontTextView tv31_delegate$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        return (FontTextView) coachingSegmentEditActivity.findViewById(R.id.tv_3_1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontTextView tv32_delegate$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        return (FontTextView) coachingSegmentEditActivity.findViewById(R.id.tv_3_2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontTextView tvActivity_delegate$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        return (FontTextView) coachingSegmentEditActivity.findViewById(R.id.tv_activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontTextView tvStage_delegate$lambda$0(CoachingSegmentEditActivity coachingSegmentEditActivity) {
        return (FontTextView) coachingSegmentEditActivity.findViewById(R.id.tv_stage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateActivity() {
        getTvActivity().setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(getMContext(), X1OOO.OXO1(this, "ic_segment_activity" + this.mSegment.getMActivity(), "drawable", R.drawable.ic_segment_activity0)), (Drawable) null, (Drawable) null, (Drawable) null);
        getTvActivity().setText(X1OOO.OXO1(this, "segment_activity" + this.mSegment.getMActivity(), TypedValues.Custom.S_STRING, R.string.segment_activity0));
    }

    private final void updateCompleteCondition() {
        getTv12().setText(X1OOO.OXO1(this, "completion_condition" + this.mSegment.getMCompletionCondition(), TypedValues.Custom.S_STRING, R.string.completion_condition0));
        updateCompletionValue();
    }

    private final void updateCompletionValue() {
        int mCompletionCondition = this.mSegment.getMCompletionCondition();
        if (mCompletionCondition == CompletionCondition.DURATION.getCondition()) {
            FontTextView tv21 = getTv21();
            Intrinsics.O10IXXX0X(tv21, "<get-tv21>(...)");
            OiOX0i.OXO1(tv21).setVisibility(8);
            getTv31().setText(R.string.duration);
            getTv32().setText(cp5.iOiXi11II(this.mSegment.getMCompletionValue()));
            return;
        }
        if (mCompletionCondition == CompletionCondition.MANUAL.getCondition()) {
            FontTextView tv22 = getTv21();
            Intrinsics.O10IXXX0X(tv22, "<get-tv21>(...)");
            OiOX0i.OXO1(tv22).setVisibility(0);
            getTv21().setText(R.string.repeat);
            getTv22().setText(String.valueOf(this.mSegment.getMCompletionValue()));
            getTv31().setText(R.string.duration);
            getTv32().setText(R.string.util_button_pressed);
            return;
        }
        if (mCompletionCondition != CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) {
            if (mCompletionCondition == CompletionCondition.HR_ABOVE.getCondition() || mCompletionCondition == CompletionCondition.HR_BELOW.getCondition()) {
                FontTextView tv23 = getTv22();
                Intrinsics.O10IXXX0X(tv23, "<get-tv22>(...)");
                OiOX0i.OXO1(tv23).setVisibility(8);
                getTv31().setText(R.string.value);
                getTv32().setText(getString(R.string.d_bpm, Integer.valueOf(this.mSegment.getMCompletionValue())));
                return;
            }
            return;
        }
        FontTextView tv24 = getTv21();
        Intrinsics.O10IXXX0X(tv24, "<get-tv21>(...)");
        OiOX0i.OXO1(tv24).setVisibility(0);
        getTv21().setText(R.string.hr_zone);
        getTv22().setText(X1OOO.OXO1(this, "hr_zone" + this.mSegment.getMHrZone(), TypedValues.Custom.S_STRING, R.string.hr_zone1));
        getTv31().setText(R.string.duration);
        getTv32().setText(cp5.iOiXi11II(this.mSegment.getMCompletionValue()));
    }

    private final void updateStage() {
        getTvStage().setText(X1OOO.OXO1(getMContext(), "segment_stage" + this.mSegment.getMStage(), TypedValues.Custom.S_STRING, R.string.segment_stage255));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (getMArg1() < 0) {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add);
        } else {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit);
        }
        getEdtName().setText(this.mSegment.getMName());
        FontEditText edtName = getEdtName();
        Intrinsics.O10IXXX0X(edtName, "<get-edtName>(...)");
        edtName.addTextChangedListener(new XIi00iiXO(this.mTextWatcher));
        updateStage();
        updateActivity();
        updateCompleteCondition();
        checkFields();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_coaching_segment_edit;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01.OXO1.XO0O10().put(BleCoachingSegment.class.getName(), new Gson().toJson(this.mSegment));
        setResult(-1);
        finish();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (Intrinsics.XOO0ii0(this.mSegment, this.mOriginSegment)) {
            finish();
            return;
        }
        if (this.mDiscardChangesPopup == null) {
            go0 go0Var = new go0(getMContext(), 0, 2, null);
            go0Var.O1O(R.string.discard_change_to_segment_tip);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.iOXX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(CoachingSegmentEditActivity.onTitleLeftClick$lambda$0$0(this.f8160IO));
                }
            });
            this.mDiscardChangesPopup = go0Var;
        }
        go0 go0Var2 = this.mDiscardChangesPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    public final void setActivity(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mActivityPop == null) {
            iXIiIiO ixiiiio = new iXIiIiO(getMContext());
            ixiiiio.m2187OX(R.string.segment_activity);
            ixiiiio.OII(new C18863iO(ixiiiio));
            this.mActivityPop = ixiiiio;
        }
        iXIiIiO ixiiiio2 = this.mActivityPop;
        if (ixiiiio2 != null) {
            ixiiiio2.IIX1OXO();
        }
    }

    public final void setCompletionCondition(@aa1 View view) {
        CoachingSegmentEditActivity coachingSegmentEditActivity;
        Intrinsics.X0O(view, "view");
        int i = 0;
        if (this.mCompletionConditionPopup == null) {
            CompletionCondition[] completionConditionArr = this.mConditions;
            ArrayList arrayList = new ArrayList(completionConditionArr.length);
            for (CompletionCondition completionCondition : completionConditionArr) {
                String string = getString(X1OOO.OXO1(getMContext(), "completion_condition" + completionCondition.getCondition(), TypedValues.Custom.S_STRING, R.string.completion_condition0));
                Intrinsics.O10IXXX0X(string, "getString(...)");
                arrayList.add(string);
            }
            coachingSegmentEditActivity = this;
            dj4 dj4Var = new dj4(coachingSegmentEditActivity, arrayList, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.set_to);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.O10OIXOX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(CoachingSegmentEditActivity.setCompletionCondition$lambda$1$0(this.f2631IO, ((Integer) obj).intValue()));
                }
            });
            coachingSegmentEditActivity.mCompletionConditionPopup = dj4Var;
        } else {
            coachingSegmentEditActivity = this;
        }
        dj4 dj4Var2 = coachingSegmentEditActivity.mCompletionConditionPopup;
        if (dj4Var2 != null) {
            CompletionCondition[] completionConditionArr2 = coachingSegmentEditActivity.mConditions;
            int length = completionConditionArr2.length;
            while (i < length) {
                if (completionConditionArr2[i].getCondition() == coachingSegmentEditActivity.mSegment.getMCompletionCondition()) {
                    dj4Var2.II1Xi0(i);
                    dj4Var2.IIX1OXO();
                }
                i++;
            }
            i = -1;
            dj4Var2.II1Xi0(i);
            dj4Var2.IIX1OXO();
        }
    }

    public final void setCondition2(@aa1 View view) {
        CoachingSegmentEditActivity coachingSegmentEditActivity;
        Intrinsics.X0O(view, "view");
        int mCompletionCondition = this.mSegment.getMCompletionCondition();
        int i = 0;
        if (mCompletionCondition == CompletionCondition.MANUAL.getCondition()) {
            if (this.mRepeatPopup == null) {
                Activity mContext = getMContext();
                ArrayList arrayList = new ArrayList(100);
                while (i < 100) {
                    i++;
                    arrayList.add(String.valueOf(i));
                }
                qv1 qv1Var = new qv1(mContext, arrayList);
                qv1Var.IXXOO(R.string.repeat);
                qv1Var.iOO1ii1(R.string.times);
                qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.X10100Ii
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(CoachingSegmentEditActivity.setCondition2$lambda$1$0(this.f4128IO, ((Integer) obj).intValue()));
                    }
                });
                this.mRepeatPopup = qv1Var;
            }
            qv1 qv1Var2 = this.mRepeatPopup;
            if (qv1Var2 != null) {
                qv1Var2.O1O(this.mSegment.getMCompletionValue() - 1);
                qv1Var2.IIX1OXO();
            }
        } else if (mCompletionCondition == CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) {
            if (this.mHrZonePopup == null) {
                HrZone[] hrZoneArr = this.mHrZones;
                ArrayList arrayList2 = new ArrayList(hrZoneArr.length);
                for (HrZone hrZone : hrZoneArr) {
                    String string = getString(X1OOO.OXO1(this, "hr_zone" + hrZone.getZone(), TypedValues.Custom.S_STRING, R.string.hr_zone1));
                    Intrinsics.O10IXXX0X(string, "getString(...)");
                    arrayList2.add(string);
                }
                coachingSegmentEditActivity = this;
                dj4 dj4Var = new dj4(coachingSegmentEditActivity, arrayList2, 0, 4, (DefaultConstructorMarker) null);
                dj4Var.m1671iX(R.string.hr_zone);
                dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0XIXI11O
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(CoachingSegmentEditActivity.setCondition2$lambda$4$0(this.f1211IO, ((Integer) obj).intValue()));
                    }
                });
                coachingSegmentEditActivity.mHrZonePopup = dj4Var;
            } else {
                coachingSegmentEditActivity = this;
            }
            dj4 dj4Var2 = coachingSegmentEditActivity.mHrZonePopup;
            if (dj4Var2 != null) {
                HrZone[] hrZoneArr2 = coachingSegmentEditActivity.mHrZones;
                int length = hrZoneArr2.length;
                while (i < length) {
                    if (hrZoneArr2[i].getZone() == coachingSegmentEditActivity.mSegment.getMHrZone()) {
                        dj4Var2.II1Xi0(i);
                        dj4Var2.IIX1OXO();
                    }
                    i++;
                }
                i = -1;
                dj4Var2.II1Xi0(i);
                dj4Var2.IIX1OXO();
            }
        }
    }

    public final void setCondition3(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        int mCompletionCondition = this.mSegment.getMCompletionCondition();
        if (mCompletionCondition == CompletionCondition.DURATION.getCondition() || mCompletionCondition == CompletionCondition.DURATION_IN_HR_ZONE.getCondition()) {
            if (this.mDurationPickerPopup == null) {
                I0OOi10II i0OOi10II = new I0OOi10II(getMContext());
                i0OOi10II.IXXOO(R.string.duration);
                i0OOi10II.m488iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.iOXX1i
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(CoachingSegmentEditActivity.setCondition3$lambda$0$0(this.f8162IO, ((Integer) obj).intValue()));
                    }
                });
                this.mDurationPickerPopup = i0OOi10II;
            }
            I0OOi10II i0OOi10II2 = this.mDurationPickerPopup;
            if (i0OOi10II2 != null) {
                i0OOi10II2.i010I(this.mSegment.getMCompletionValue());
                i0OOi10II2.IIX1OXO();
                return;
            }
            return;
        }
        if (mCompletionCondition == CompletionCondition.HR_ABOVE.getCondition() || mCompletionCondition == CompletionCondition.HR_BELOW.getCondition()) {
            if (this.mBpmPopup == null) {
                Activity mContext = getMContext();
                ArrayList arrayList = new ArrayList(180);
                for (int i = 0; i < 180; i++) {
                    arrayList.add(String.valueOf(i + 40));
                }
                qv1 qv1Var = new qv1(mContext, arrayList);
                qv1Var.IXXOO(R.string.value);
                qv1Var.iOO1ii1(R.string.bpm);
                qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.IIXIOXO
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(CoachingSegmentEditActivity.setCondition3$lambda$3$0(this.f1650IO, ((Integer) obj).intValue()));
                    }
                });
                this.mBpmPopup = qv1Var;
            }
            qv1 qv1Var2 = this.mBpmPopup;
            if (qv1Var2 != null) {
                qv1Var2.O1O(this.mSegment.getMCompletionValue() - 40);
                qv1Var2.IIX1OXO();
            }
        }
    }

    public final void setStage(@aa1 View view) {
        CoachingSegmentEditActivity coachingSegmentEditActivity;
        Intrinsics.X0O(view, "view");
        int i = 0;
        if (this.mStagePopup == null) {
            Stage[] stageArr = this.mStages;
            ArrayList arrayList = new ArrayList(stageArr.length);
            for (Stage stage : stageArr) {
                String string = getString(X1OOO.OXO1(getMContext(), "segment_stage" + stage.getStage(), TypedValues.Custom.S_STRING, R.string.segment_stage255));
                Intrinsics.O10IXXX0X(string, "getString(...)");
                arrayList.add(string);
            }
            coachingSegmentEditActivity = this;
            dj4 dj4Var = new dj4(coachingSegmentEditActivity, arrayList, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.segment_type);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.Ii1iX11
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(CoachingSegmentEditActivity.setStage$lambda$1$0(this.f2222IO, ((Integer) obj).intValue()));
                }
            });
            coachingSegmentEditActivity.mStagePopup = dj4Var;
        } else {
            coachingSegmentEditActivity = this;
        }
        dj4 dj4Var2 = coachingSegmentEditActivity.mStagePopup;
        if (dj4Var2 != null) {
            Stage[] stageArr2 = coachingSegmentEditActivity.mStages;
            int length = stageArr2.length;
            while (i < length) {
                if (stageArr2[i].getStage() == coachingSegmentEditActivity.mSegment.getMStage()) {
                    dj4Var2.II1Xi0(i);
                    dj4Var2.IIX1OXO();
                }
                i++;
            }
            i = -1;
            dj4Var2.II1Xi0(i);
            dj4Var2.IIX1OXO();
        }
    }
}
