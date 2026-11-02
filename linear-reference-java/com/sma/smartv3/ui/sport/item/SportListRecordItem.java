package com.sma.smartv3.ui.sport.item;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.i05;
import com.android.mltcode.paycertificationapi.j05;
import com.android.mltcode.paycertificationapi.k05;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.SportDetailV2Activity;
import com.sma.smartv3.ui.status.SportRecordsV3Activity;
import com.sma.smartv3.util.UtilsKt;
import java.text.SimpleDateFormat;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportListRecordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportListRecordItem.kt\ncom/sma/smartv3/ui/sport/item/SportListRecordItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,161:1\n1#2:162\n19#3:163\n15#3:164\n*S KotlinDebug\n*F\n+ 1 SportListRecordItem.kt\ncom/sma/smartv3/ui/sport/item/SportListRecordItem\n*L\n123#1:163\n123#1:164\n*E\n"})
public class SportListRecordItem extends BaseDslItem {
    private final boolean initEvent;
    public Context mContext;

    @tb1
    private Workout mWorkout;

    @aa1
    private final Lazy mWorkoutDao$delegate;

    @tb1
    private View moreRecordLayout;

    @tb1
    private View recordLayout;

    @tb1
    private ImageView sourceIcon;

    @tb1
    private TextView sportCalorieDuration;

    @tb1
    private TextView sportDistance;

    @tb1
    private ImageView sportIcon;

    @tb1
    private TextView sportStartTime;

    @tb1
    private TextView sportTitle;

    @tb1
    private View workoutLayout;

    public SportListRecordItem() {
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.iO(new i05());
        this.initEvent = true;
    }

    public static /* synthetic */ WorkoutDao IiI10X() {
        return mWorkoutDao_delegate$lambda$0();
    }

    public static /* synthetic */ void O00(SportListRecordItem r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ void XOO0ii0(SportListRecordItem r0, View r1) {
        initView$lambda$5(r0, r1);
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) getValue();
    }

    private static final void initView$lambda$3(SportListRecordItem r2, View r3) {
        View r0 = r2.recordLayout;
        if (r0 == null) goto L5;
        Context r1 = r0.getContext();
    L6:
        Intent r4 = new Intent(r1, SportDetailV2Activity.class);
        Workout r5 = r2.mWorkout;
        Intrinsics.XXI(r5);
        r4.putExtra("mArg1", r5.getMId());
        View r6 = r2.workoutLayout;
        if (r6 == null) goto L12;
        Context r7 = r6.getContext();
        if (r7 == null) goto L13;
        r7.startActivity(r4);
        return;
    L13:
        return;
    L12:
        return;
    L5:
        r1 = null;
        goto L6
    }

    private static final void initView$lambda$5(SportListRecordItem r2, View r3) {
        View r0 = r2.recordLayout;
        if (r0 == null) goto L5;
        Context r1 = r0.getContext();
    L6:
        Intent r4 = new Intent(r1, SportRecordsV3Activity.class);
        View r5 = r2.recordLayout;
        if (r5 == null) goto L12;
        Context r6 = r5.getContext();
        if (r6 == null) goto L13;
        r6.startActivity(r4);
        return;
    L13:
        return;
    L12:
        return;
    L5:
        r1 = null;
        goto L6
    }

    private static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        View r0 = r3.v(R.id.sport_records_ll);
        Intrinsics.XXI(r0);
        this.recordLayout = r0;
        Intrinsics.XXI(r0);
        Context r1 = r0.getContext();
        Intrinsics.O10IXXX0X(r1, "getContext(...)");
        setMContext(r1);
        this.moreRecordLayout = r3.v(R.id.sport_records_more);
        this.sportIcon = (ImageView) r3.v(R.id.record_sports_icon);
        this.workoutLayout = r3.v(R.id.data_workout);
        this.sportTitle = (TextView) r3.v(R.id.record_sports_title);
        this.sportStartTime = (TextView) r3.v(R.id.record_sports_time);
        this.sportDistance = (TextView) r3.v(R.id.record_sports_value);
        this.sportCalorieDuration = (TextView) r3.v(R.id.record_sports_duration);
        this.sourceIcon = (ImageView) r3.v(R.id.abh_sport_source_icon);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    @tb1
    public final Workout getMWorkout() {
        return this.mWorkout;
    }

    @tb1
    public final View getMoreRecordLayout() {
        return this.moreRecordLayout;
    }

    @tb1
    public final View getWorkoutLayout() {
        return this.workoutLayout;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        if (this.recordLayout == null) goto L77;
        Workout r1 = (Workout) CollectionsKt___CollectionsKt.IIII0iI(getMWorkoutDao().getDescList());
        this.mWorkout = r1;
        if (r1 == null) goto L54;
        ImageView r2 = this.sportIcon;
        if (r2 == null) goto L12;
        if (r2 == null) goto L11;
        r2.setVisibility(0);
    L11:
        RequestManager r3 = Glide.with(getMContext());
        Context r4 = getMContext();
        SportRecordData r5 = new SportRecordData();
        Workout r6 = this.mWorkout;
        Intrinsics.XXI(r6);
        r5.setMMode(r6.getMMode());
        Unit r7 = Unit.OXO1;
        RequestBuilder<Drawable> r8 = r3.load(Integer.valueOf(SportRecordDataKt.getWorkoutImage(r4, r5)));
        ImageView r9 = this.sportIcon;
        Intrinsics.XXI(r9);
        r8.into(r9);
    L12:
        ImageView r10 = this.sourceIcon;
        if (r10 == null) goto L19;
        Intrinsics.XXI(r10);
        RequestManager r11 = Glide.with(r10.getContext());
        Workout r12 = this.mWorkout;
        Intrinsics.XXI(r12);
        if (r12.getMSource() != 0) goto L17;
        int r13 = R.drawable.sport_watch_icon;
    L18:
        RequestBuilder<Drawable> r14 = r11.load(Integer.valueOf(r13));
        ImageView r15 = this.sourceIcon;
        Intrinsics.XXI(r15);
        r14.into(r15);
        goto L19
    L17:
        r13 = R.drawable.sport_phone_icon;
    L19:
        Workout r16 = this.mWorkout;
        Intrinsics.XXI(r16);
        if (a15.iO(r16.getMMode()) == false) goto L24;
        ImageView r17 = this.sportIcon;
        if (r17 == null) goto L27;
        r17.setBackgroundResource(R.drawable.shape_sport_oval_orange_bg);
    L27:
        TextView r18 = this.sportTitle;
        if (r18 == null) goto L30;
        q62 r19 = q62.OXO1;
        Workout r20 = this.mWorkout;
        Intrinsics.XXI(r20);
        r18.setText(r19.i01OOiI(r20.getMMode()));
        r18.setTextColor(ContextCompat.getColor(r18.getContext(), R.color.abh_text_color));
    L30:
        TextView r21 = this.sportStartTime;
        if (r21 == null) goto L33;
        SimpleDateFormat r22 = O0X11OiO.X1(false, 1, null);
        Workout r23 = this.mWorkout;
        Intrinsics.XXI(r23);
        r21.setText(r22.format(Long.valueOf(r23.getMStart())));
    L33:
        hu4 r24 = hu4.OXO1;
        Workout r25 = this.mWorkout;
        Intrinsics.XXI(r25);
        if (r24.O10IXXX0X(r25.getMMode()) == false) goto L45;
        SPUtils r26 = a01.OXO1.IiI10X();
        Object r27 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r28 = new Gson().fromJson(r26.getString(AppUser.class.getName()), AppUser.class);
        if (r28 == null) goto L39;
        r27 = r28;
    L39:
        AppUser r29 = (AppUser) r27;
        Workout r30 = this.mWorkout;
        Intrinsics.XXI(r30);
        String r31 = String.valueOf(cp5.X1ii(r30.getMDistance(), r29.getUnit(), false, 4, null));
        TextView r32 = this.sportDistance;
        if (r32 == null) goto L42;
        r32.setText(r31 + UtilsKt.XXO(cp5.XX0(r29.getUnit())));
    L42:
        TextView r33 = this.sportCalorieDuration;
        if (r33 == null) goto L51;
        Workout r34 = this.mWorkout;
        Intrinsics.XXI(r34);
        int r35 = r34.getMCalorie() / 1000;
        String r36 = UtilsKt.XXO(R.string.kcal);
        Workout r37 = this.mWorkout;
        Intrinsics.XXI(r37);
        r33.setText(r35 + r36 + " | " + O0X11OiO.iXiX011(r37.getMDuration() * 1000));
    L51:
        View r38 = this.workoutLayout;
        if (r38 == null) goto L72;
        r38.setOnClickListener(new j05(this));
    L72:
        View r39 = this.moreRecordLayout;
        if (r39 == null) goto L76;
        r39.setOnClickListener(new k05(this));
        return;
    L76:
        return;
    L45:
        TextView r40 = this.sportDistance;
        if (r40 == null) goto L48;
        Workout r41 = this.mWorkout;
        Intrinsics.XXI(r41);
        r40.setText((r41.getMCalorie() / 1000) + UtilsKt.XXO(R.string.kcal));
    L48:
        TextView r42 = this.sportCalorieDuration;
        if (r42 == null) goto L51;
        Workout r43 = this.mWorkout;
        Intrinsics.XXI(r43);
        r42.setText(String.valueOf(O0X11OiO.iXiX011(r43.getMDuration() * 1000)));
        goto L51
    L24:
        ImageView r44 = this.sportIcon;
        if (r44 == null) goto L27;
        r44.setBackgroundResource(R.drawable.shape_sport_oval_green_bg);
        goto L27
    L54:
        ImageView r45 = this.sourceIcon;
        if (r45 == null) goto L57;
        r45.setVisibility(8);
    L57:
        ImageView r46 = this.sportIcon;
        if (r46 == null) goto L60;
        r46.setVisibility(8);
    L60:
        TextView r47 = this.sportCalorieDuration;
        if (r47 == null) goto L63;
        r47.setText("");
    L63:
        TextView r48 = this.sportDistance;
        if (r48 == null) goto L66;
        r48.setText("");
    L66:
        TextView r49 = this.sportStartTime;
        if (r49 == null) goto L69;
        r49.setText("");
    L69:
        TextView r50 = this.sportTitle;
        if (r50 == null) goto L72;
        r50.setText(UtilsKt.XXO(R.string.no_data));
        r50.setTextColor(ContextCompat.getColor(r50.getContext(), R.color.line_color));
        goto L72
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.sport_list_item_record;
    }

    @sf5(tag = I01XX0.O00)
    public final void onWorkoutChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onWorkoutChanged"});
        initView();
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public final void setMWorkout(@tb1 Workout r1) {
        this.mWorkout = r1;
    }

    public final void setMoreRecordLayout(@tb1 View r1) {
        this.moreRecordLayout = r1;
    }

    public final void setWorkoutLayout(@tb1 View r1) {
        this.workoutLayout = r1;
    }
}
