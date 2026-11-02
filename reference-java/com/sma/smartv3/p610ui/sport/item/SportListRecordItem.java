package com.sma.smartv3.p610ui.sport.item;

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
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.SportDetailV2Activity;
import com.sma.smartv3.p610ui.sport.item.SportListRecordItem;
import com.sma.smartv3.p610ui.status.SportRecordsV3Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.text.SimpleDateFormat;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportListRecordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportListRecordItem.kt\ncom/sma/smartv3/ui/sport/item/SportListRecordItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,161:1\n1#2:162\n19#3:163\n15#3:164\n*S KotlinDebug\n*F\n+ 1 SportListRecordItem.kt\ncom/sma/smartv3/ui/sport/item/SportListRecordItem\n*L\n123#1:163\n123#1:164\n*E\n"})
public class SportListRecordItem extends BaseDslItem {
    public Context mContext;

    @tb1
    private Workout mWorkout;

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

    @aa1
    private final Lazy mWorkoutDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i05
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportListRecordItem.mWorkoutDao_delegate$lambda$0();
        }
    });
    private final boolean initEvent = true;

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) this.mWorkoutDao$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(SportListRecordItem sportListRecordItem, View view) {
        Context context;
        View view2 = sportListRecordItem.recordLayout;
        Intent intent = new Intent(view2 != null ? view2.getContext() : null, (Class<?>) SportDetailV2Activity.class);
        Workout workout = sportListRecordItem.mWorkout;
        Intrinsics.XXI(workout);
        intent.putExtra("mArg1", workout.getMId());
        View view3 = sportListRecordItem.workoutLayout;
        if (view3 == null || (context = view3.getContext()) == null) {
            return;
        }
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(SportListRecordItem sportListRecordItem, View view) {
        Context context;
        View view2 = sportListRecordItem.recordLayout;
        Intent intent = new Intent(view2 != null ? view2.getContext() : null, (Class<?>) SportRecordsV3Activity.class);
        View view3 = sportListRecordItem.recordLayout;
        if (view3 == null || (context = view3.getContext()) == null) {
            return;
        }
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.sport_records_ll);
        Intrinsics.XXI(viewM3483v);
        this.recordLayout = viewM3483v;
        Intrinsics.XXI(viewM3483v);
        Context context = viewM3483v.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        this.moreRecordLayout = itemHolder.m3483v(R.id.sport_records_more);
        this.sportIcon = (ImageView) itemHolder.m3483v(R.id.record_sports_icon);
        this.workoutLayout = itemHolder.m3483v(R.id.data_workout);
        this.sportTitle = (TextView) itemHolder.m3483v(R.id.record_sports_title);
        this.sportStartTime = (TextView) itemHolder.m3483v(R.id.record_sports_time);
        this.sportDistance = (TextView) itemHolder.m3483v(R.id.record_sports_value);
        this.sportCalorieDuration = (TextView) itemHolder.m3483v(R.id.record_sports_duration);
        this.sourceIcon = (ImageView) itemHolder.m3483v(R.id.abh_sport_source_icon);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
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
        if (this.recordLayout == null) {
            return;
        }
        Workout workout = (Workout) CollectionsKt___CollectionsKt.IIII0iI(getMWorkoutDao().getDescList());
        this.mWorkout = workout;
        if (workout != null) {
            ImageView imageView = this.sportIcon;
            if (imageView != null) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                RequestManager requestManagerWith = Glide.with(getMContext());
                Context mContext = getMContext();
                SportRecordData sportRecordData = new SportRecordData();
                Workout workout2 = this.mWorkout;
                Intrinsics.XXI(workout2);
                sportRecordData.setMMode(workout2.getMMode());
                Unit unit = Unit.OXO1;
                RequestBuilder<Drawable> requestBuilderLoad = requestManagerWith.load(Integer.valueOf(SportRecordDataKt.getWorkoutImage(mContext, sportRecordData)));
                ImageView imageView2 = this.sportIcon;
                Intrinsics.XXI(imageView2);
                requestBuilderLoad.into(imageView2);
            }
            ImageView imageView3 = this.sourceIcon;
            if (imageView3 != null) {
                Intrinsics.XXI(imageView3);
                RequestManager requestManagerWith2 = Glide.with(imageView3.getContext());
                Workout workout3 = this.mWorkout;
                Intrinsics.XXI(workout3);
                RequestBuilder<Drawable> requestBuilderLoad2 = requestManagerWith2.load(Integer.valueOf(workout3.getMSource() == 0 ? R.drawable.sport_watch_icon : R.drawable.sport_phone_icon));
                ImageView imageView4 = this.sourceIcon;
                Intrinsics.XXI(imageView4);
                requestBuilderLoad2.into(imageView4);
            }
            Workout workout4 = this.mWorkout;
            Intrinsics.XXI(workout4);
            if (a15.m1445iO(workout4.getMMode())) {
                ImageView imageView5 = this.sportIcon;
                if (imageView5 != null) {
                    imageView5.setBackgroundResource(R.drawable.shape_sport_oval_orange_bg);
                }
            } else {
                ImageView imageView6 = this.sportIcon;
                if (imageView6 != null) {
                    imageView6.setBackgroundResource(R.drawable.shape_sport_oval_green_bg);
                }
            }
            TextView textView = this.sportTitle;
            if (textView != null) {
                q62 q62Var = q62.OXO1;
                Workout workout5 = this.mWorkout;
                Intrinsics.XXI(workout5);
                textView.setText(q62Var.i01OOiI(workout5.getMMode()));
                textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.abh_text_color));
            }
            TextView textView2 = this.sportStartTime;
            if (textView2 != null) {
                SimpleDateFormat simpleDateFormatM792X1 = O0X11OiO.m792X1(false, 1, null);
                Workout workout6 = this.mWorkout;
                Intrinsics.XXI(workout6);
                textView2.setText(simpleDateFormatM792X1.format(Long.valueOf(workout6.getMStart())));
            }
            hu4 hu4Var = hu4.OXO1;
            Workout workout7 = this.mWorkout;
            Intrinsics.XXI(workout7);
            if (hu4Var.O10IXXX0X(workout7.getMMode())) {
                SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
                Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
                Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
                if (objFromJson != null) {
                    appUser = objFromJson;
                }
                AppUser appUser2 = (AppUser) appUser;
                Workout workout8 = this.mWorkout;
                Intrinsics.XXI(workout8);
                String strValueOf = String.valueOf(cp5.X1ii(workout8.getMDistance(), appUser2.getUnit(), false, 4, null));
                TextView textView3 = this.sportDistance;
                if (textView3 != null) {
                    textView3.setText(strValueOf + UtilsKt.XXO(cp5.XX0(appUser2.getUnit())));
                }
                TextView textView4 = this.sportCalorieDuration;
                if (textView4 != null) {
                    Workout workout9 = this.mWorkout;
                    Intrinsics.XXI(workout9);
                    int mCalorie = workout9.getMCalorie() / 1000;
                    String strXXO = UtilsKt.XXO(R.string.kcal);
                    Workout workout10 = this.mWorkout;
                    Intrinsics.XXI(workout10);
                    textView4.setText(mCalorie + strXXO + " | " + O0X11OiO.iXiX011(workout10.getMDuration() * 1000));
                }
            } else {
                TextView textView5 = this.sportDistance;
                if (textView5 != null) {
                    Workout workout11 = this.mWorkout;
                    Intrinsics.XXI(workout11);
                    textView5.setText((workout11.getMCalorie() / 1000) + UtilsKt.XXO(R.string.kcal));
                }
                TextView textView6 = this.sportCalorieDuration;
                if (textView6 != null) {
                    Workout workout12 = this.mWorkout;
                    Intrinsics.XXI(workout12);
                    textView6.setText(String.valueOf(O0X11OiO.iXiX011(workout12.getMDuration() * 1000)));
                }
            }
            View view = this.workoutLayout;
            if (view != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.j05
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SportListRecordItem.initView$lambda$3(this.f8854IO, view2);
                    }
                });
            }
        } else {
            ImageView imageView7 = this.sourceIcon;
            if (imageView7 != null) {
                imageView7.setVisibility(8);
            }
            ImageView imageView8 = this.sportIcon;
            if (imageView8 != null) {
                imageView8.setVisibility(8);
            }
            TextView textView7 = this.sportCalorieDuration;
            if (textView7 != null) {
                textView7.setText("");
            }
            TextView textView8 = this.sportDistance;
            if (textView8 != null) {
                textView8.setText("");
            }
            TextView textView9 = this.sportStartTime;
            if (textView9 != null) {
                textView9.setText("");
            }
            TextView textView10 = this.sportTitle;
            if (textView10 != null) {
                textView10.setText(UtilsKt.XXO(R.string.no_data));
                textView10.setTextColor(ContextCompat.getColor(textView10.getContext(), R.color.line_color));
            }
        }
        View view2 = this.moreRecordLayout;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.k05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SportListRecordItem.initView$lambda$5(this.f9084IO, view3);
                }
            });
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.sport_list_item_record;
    }

    @sf5(tag = I01XX0.O00)
    public final void onWorkoutChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onWorkoutChanged");
        initView();
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMWorkout(@tb1 Workout workout) {
        this.mWorkout = workout;
    }

    public final void setMoreRecordLayout(@tb1 View view) {
        this.moreRecordLayout = view;
    }

    public final void setWorkoutLayout(@tb1 View view) {
        this.workoutLayout = view;
    }
}
