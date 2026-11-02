package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.entity.HealthyReport;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHeathReportsTopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsTopItem.kt\ncom/sma/smartv3/ui/status/item/HeathReportsTopItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,105:1\n19#2:106\n15#2:107\n*S KotlinDebug\n*F\n+ 1 HeathReportsTopItem.kt\ncom/sma/smartv3/ui/status/item/HeathReportsTopItem\n*L\n33#1:106\n33#1:107\n*E\n"})
public final class HeathReportsTopItem extends BaseDslItem {

    @tb1
    private ImageView ivAvatar;

    @aa1
    private final AppUser mAppUser;
    private Context mContext;

    @tb1
    private final HealthyReport mHealthyReport;
    private final boolean showUser;
    private final long time;

    @tb1
    private TextView tv_abnormal;

    @tb1
    private TextView tv_height_weight;

    @tb1
    private TextView tv_name;

    @tb1
    private TextView tv_report_times;

    @tb1
    private TextView tv_this_content;

    public HeathReportsTopItem(long j, boolean z, @tb1 HealthyReport healthyReport) {
        this.time = j;
        this.showUser = z;
        this.mHealthyReport = healthyReport;
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Context context = itemHolder.getContext();
        Intrinsics.O10IXXX0X(context, "<get-context>(...)");
        this.mContext = context;
        View view = itemHolder.view(R.id.iv_avatar);
        Intrinsics.X1ii(view, "null cannot be cast to non-null type android.widget.ImageView");
        this.ivAvatar = (ImageView) view;
        View view2 = itemHolder.view(R.id.tv_name);
        Intrinsics.X1ii(view2, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_name = (TextView) view2;
        View view3 = itemHolder.view(R.id.tv_height_weight);
        Intrinsics.X1ii(view3, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_height_weight = (TextView) view3;
        View view4 = itemHolder.view(R.id.tv_abnormal);
        Intrinsics.X1ii(view4, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_abnormal = (TextView) view4;
        View view5 = itemHolder.view(R.id.tv_report_times);
        Intrinsics.X1ii(view5, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_report_times = (TextView) view5;
        View view6 = itemHolder.view(R.id.tv_this_content);
        Intrinsics.X1ii(view6, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_this_content = (TextView) view6;
    }

    @tb1
    public final ImageView getIvAvatar() {
        return this.ivAvatar;
    }

    @aa1
    public final AppUser getMAppUser() {
        return this.mAppUser;
    }

    @tb1
    public final HealthyReport getMHealthyReport() {
        return this.mHealthyReport;
    }

    public final boolean getShowUser() {
        return this.showUser;
    }

    public final long getTime() {
        return this.time;
    }

    @tb1
    public final TextView getTv_abnormal() {
        return this.tv_abnormal;
    }

    @tb1
    public final TextView getTv_height_weight() {
        return this.tv_height_weight;
    }

    @tb1
    public final TextView getTv_name() {
        return this.tv_name;
    }

    @tb1
    public final TextView getTv_report_times() {
        return this.tv_report_times;
    }

    @tb1
    public final TextView getTv_this_content() {
        return this.tv_this_content;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        Context context;
        String string;
        String string2;
        String string3 = null;
        int i = 0;
        if (this.showUser) {
            ImageView imageView = this.ivAvatar;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            TextView textView = this.tv_name;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.tv_height_weight;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.tv_abnormal;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = this.tv_report_times;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            HealthyReport healthyReport = this.mHealthyReport;
            if (healthyReport != null) {
                String string4 = (healthyReport == null || healthyReport.getMUserGender() != 0) ? Utils.getApp().getString(R.string.male) : Utils.getApp().getString(R.string.female);
                Intrinsics.XXI(string4);
                if (this.mAppUser.getUnit() == 0) {
                    Context context2 = this.mContext;
                    if (context2 == null) {
                        Intrinsics.XXO("mContext");
                        context2 = null;
                    }
                    Resources resources = context2.getResources();
                    HealthyReport healthyReport2 = this.mHealthyReport;
                    Intrinsics.XXI(healthyReport2);
                    string = resources.getString(R.string.f_cm, Float.valueOf(healthyReport2.getMUserHeight()));
                } else {
                    HealthyReport healthyReport3 = this.mHealthyReport;
                    Intrinsics.XXI(healthyReport3);
                    int[] iArrOXO1 = l76.OXO1(healthyReport3.getMUserHeight());
                    Context context3 = this.mContext;
                    if (context3 == null) {
                        Intrinsics.XXO("mContext");
                        context3 = null;
                    }
                    string = context3.getResources().getString(R.string.d_feet_d_inch, Integer.valueOf(iArrOXO1[0]), Integer.valueOf(iArrOXO1[1]));
                }
                Intrinsics.XXI(string);
                if (this.mAppUser.getUnit() == 0) {
                    Context context4 = this.mContext;
                    if (context4 == null) {
                        Intrinsics.XXO("mContext");
                        context4 = null;
                    }
                    Resources resources2 = context4.getResources();
                    HealthyReport healthyReport4 = this.mHealthyReport;
                    Intrinsics.XXI(healthyReport4);
                    string2 = resources2.getString(R.string.f_kg, Float.valueOf(healthyReport4.getMUserWeight()));
                } else {
                    Context context5 = this.mContext;
                    if (context5 == null) {
                        Intrinsics.XXO("mContext");
                        context5 = null;
                    }
                    Resources resources3 = context5.getResources();
                    HealthyReport healthyReport5 = this.mHealthyReport;
                    Intrinsics.XXI(healthyReport5);
                    string2 = resources3.getString(R.string.f_lbs, Float.valueOf(Float.parseFloat(cp5.iX1O1(l76.m2527iO(healthyReport5.getMUserWeight()), true))));
                }
                Intrinsics.XXI(string2);
                TextView textView5 = this.tv_height_weight;
                if (textView5 != null) {
                    textView5.setText(string4 + " " + UtilsKt.XXO(R.string.height) + " " + string + " " + UtilsKt.XXO(R.string.weight) + " " + string2);
                }
            }
            if (this.ivAvatar != null) {
                Context context6 = this.mContext;
                if (context6 == null) {
                    Intrinsics.XXO("mContext");
                    context6 = null;
                }
                RequestBuilder requestBuilderError = Glide.with(context6).load(this.mAppUser.getAvatarUrl()).error(R.drawable.pic_avatar_default);
                ImageView imageView2 = this.ivAvatar;
                Intrinsics.XXI(imageView2);
                requestBuilderError.into(imageView2);
            }
            TextView textView6 = this.tv_name;
            if (textView6 != null) {
                textView6.setText(this.mAppUser.getNickname());
            }
        } else {
            TextView textView7 = this.tv_report_times;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
            TextView textView8 = this.tv_this_content;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
        }
        HealthyReport healthyReport6 = this.mHealthyReport;
        if ((healthyReport6 != null ? healthyReport6.getMAbnormalNumber() : 0) > 0) {
            TextView textView9 = this.tv_abnormal;
            if (textView9 != null) {
                Context context7 = this.mContext;
                if (context7 == null) {
                    Intrinsics.XXO("mContext");
                    context7 = null;
                }
                Resources resources4 = context7.getResources();
                HealthyReport healthyReport7 = this.mHealthyReport;
                textView9.setText(resources4.getString(R.string.abnormal_hint, healthyReport7 != null ? Integer.valueOf(healthyReport7.getMAbnormalNumber()) : null));
            }
            TextView textView10 = this.tv_abnormal;
            if (textView10 != null) {
                Context context8 = this.mContext;
                if (context8 == null) {
                    Intrinsics.XXO("mContext");
                    context8 = null;
                }
                textView10.setTextColor(context8.getResources().getColorStateList(R.color.v2_step_progress_color));
            }
        } else {
            TextView textView11 = this.tv_abnormal;
            if (textView11 != null) {
                Context context9 = this.mContext;
                if (context9 == null) {
                    Intrinsics.XXO("mContext");
                    context9 = null;
                }
                textView11.setText(context9.getResources().getString(R.string.normal_indicators));
            }
            TextView textView12 = this.tv_abnormal;
            if (textView12 != null) {
                Context context10 = this.mContext;
                if (context10 == null) {
                    Intrinsics.XXO("mContext");
                    context10 = null;
                }
                textView12.setTextColor(context10.getResources().getColorStateList(R.color.green));
            }
        }
        TextView textView13 = this.tv_report_times;
        if (textView13 != null) {
            if (this.time <= 0) {
                i = 8;
            } else if (textView13 != null) {
                if (textView13 != null && (context = textView13.getContext()) != null) {
                    string3 = context.getString(R.string.report_times, O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(this.time)));
                }
                textView13.setText(string3);
            }
            textView13.setVisibility(i);
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.heath_reports_top_item;
    }

    public final void setIvAvatar(@tb1 ImageView imageView) {
        this.ivAvatar = imageView;
    }

    public final void setTv_abnormal(@tb1 TextView textView) {
        this.tv_abnormal = textView;
    }

    public final void setTv_height_weight(@tb1 TextView textView) {
        this.tv_height_weight = textView;
    }

    public final void setTv_name(@tb1 TextView textView) {
        this.tv_name = textView;
    }

    public final void setTv_report_times(@tb1 TextView textView) {
        this.tv_report_times = textView;
    }

    public final void setTv_this_content(@tb1 TextView textView) {
        this.tv_this_content = textView;
    }

    public /* synthetic */ HeathReportsTopItem(long j, boolean z, HealthyReport healthyReport, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? false : z, healthyReport);
    }
}
