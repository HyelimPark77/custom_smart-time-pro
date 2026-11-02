package com.sma.smartv3.ui.status.item;

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
import com.sma.smartv3.db.entity.HealthyReport;
import com.sma.smartv3.model.AppUser;
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

    public HeathReportsTopItem(long r33, boolean r35, @tb1 HealthyReport r36) {
        this.time = r33;
        this.showUser = r35;
        this.mHealthyReport = r36;
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        Context r0 = r3.getContext();
        Intrinsics.O10IXXX0X(r0, "<get-context>(...)");
        this.mContext = r0;
        View r1 = r3.view(R.id.iv_avatar);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type android.widget.ImageView");
        this.ivAvatar = (ImageView) r1;
        View r2 = r3.view(R.id.tv_name);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_name = (TextView) r2;
        View r4 = r3.view(R.id.tv_height_weight);
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_height_weight = (TextView) r4;
        View r5 = r3.view(R.id.tv_abnormal);
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_abnormal = (TextView) r5;
        View r6 = r3.view(R.id.tv_report_times);
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_report_times = (TextView) r6;
        View r7 = r3.view(R.id.tv_this_content);
        Intrinsics.X1ii(r7, "null cannot be cast to non-null type android.widget.TextView");
        this.tv_this_content = (TextView) r7;
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
        String r2 = null;
        int r3 = 0;
        if (this.showUser == false) goto L58;
        ImageView r0 = this.ivAvatar;
        if (r0 == null) goto L7;
        r0.setVisibility(0);
    L7:
        TextView r1 = this.tv_name;
        if (r1 == null) goto L10;
        r1.setVisibility(0);
    L10:
        TextView r4 = this.tv_height_weight;
        if (r4 == null) goto L13;
        r4.setVisibility(0);
    L13:
        TextView r5 = this.tv_abnormal;
        if (r5 == null) goto L16;
        r5.setVisibility(0);
    L16:
        TextView r6 = this.tv_report_times;
        if (r6 == null) goto L19;
        r6.setVisibility(0);
    L19:
        HealthyReport r7 = this.mHealthyReport;
        if (r7 == null) goto L50;
        if (r7 != null) goto L23;
    L25:
        String r8 = Utils.getApp().getString(R.string.male);
    L26:
        Intrinsics.XXI(r8);
        if (this.mAppUser.getUnit() != 0) goto L32;
        Context r9 = this.mContext;
        if (r9 != null) goto L31;
        Intrinsics.XXO("mContext");
        r9 = null;
    L31:
        Resources r10 = r9.getResources();
        HealthyReport r11 = this.mHealthyReport;
        Intrinsics.XXI(r11);
        String r12 = r10.getString(R.string.f_cm, new Object[]{Float.valueOf(r11.getMUserHeight())});
    L36:
        Intrinsics.XXI(r12);
        if (this.mAppUser.getUnit() != 0) goto L42;
        Context r13 = this.mContext;
        if (r13 != null) goto L41;
        Intrinsics.XXO("mContext");
        r13 = null;
    L41:
        Resources r14 = r13.getResources();
        HealthyReport r15 = this.mHealthyReport;
        Intrinsics.XXI(r15);
        String r16 = r14.getString(R.string.f_kg, new Object[]{Float.valueOf(r15.getMUserWeight())});
    L46:
        Intrinsics.XXI(r16);
        TextView r17 = this.tv_height_weight;
        if (r17 == null) goto L50;
        r17.setText(r8 + " " + UtilsKt.XXO(R.string.height) + " " + r12 + " " + UtilsKt.XXO(R.string.weight) + " " + r16);
        goto L50
    L42:
        Context r18 = this.mContext;
        if (r18 != null) goto L45;
        Intrinsics.XXO("mContext");
        r18 = null;
    L45:
        Resources r19 = r18.getResources();
        HealthyReport r20 = this.mHealthyReport;
        Intrinsics.XXI(r20);
        r16 = r19.getString(R.string.f_lbs, new Object[]{Float.valueOf(Float.parseFloat(cp5.iX1O1(l76.iO(r20.getMUserWeight()), true)))});
        goto L46
    L32:
        HealthyReport r21 = this.mHealthyReport;
        Intrinsics.XXI(r21);
        int[] r22 = l76.OXO1(r21.getMUserHeight());
        Context r23 = this.mContext;
        if (r23 != null) goto L35;
        Intrinsics.XXO("mContext");
        r23 = null;
    L35:
        r12 = r23.getResources().getString(R.string.d_feet_d_inch, new Object[]{Integer.valueOf(r22[0]), Integer.valueOf(r22[1])});
        goto L36
    L23:
        if (r7.getMUserGender() != 0) goto L25;
        r8 = Utils.getApp().getString(R.string.female);
    L50:
        if (this.ivAvatar == null) goto L55;
        Context r24 = this.mContext;
        if (r24 != null) goto L54;
        Intrinsics.XXO("mContext");
        r24 = null;
    L54:
        RequestBuilder r25 = Glide.with(r24).load(this.mAppUser.getAvatarUrl()).error(R.drawable.pic_avatar_default);
        ImageView r26 = this.ivAvatar;
        Intrinsics.XXI(r26);
        r25.into(r26);
    L55:
        TextView r27 = this.tv_name;
        if (r27 == null) goto L64;
        r27.setText(this.mAppUser.getNickname());
    L64:
        HealthyReport r28 = this.mHealthyReport;
        if (r28 == null) goto L67;
        int r29 = r28.getMAbnormalNumber();
    L68:
        if (r29 <= 0) goto L85;
        TextView r30 = this.tv_abnormal;
        if (r30 == null) goto L79;
        Context r31 = this.mContext;
        if (r31 != null) goto L74;
        Intrinsics.XXO("mContext");
        r31 = null;
    L74:
        Resources r32 = r31.getResources();
        HealthyReport r33 = this.mHealthyReport;
        if (r33 == null) goto L77;
        Integer r34 = Integer.valueOf(r33.getMAbnormalNumber());
    L78:
        r30.setText(r32.getString(R.string.abnormal_hint, new Object[]{r34}));
        goto L79
    L77:
        r34 = null;
    L79:
        TextView r35 = this.tv_abnormal;
        if (r35 == null) goto L97;
        Context r36 = this.mContext;
        if (r36 != null) goto L84;
        Intrinsics.XXO("mContext");
        r36 = null;
    L84:
        r35.setTextColor(r36.getResources().getColorStateList(R.color.v2_step_progress_color));
    L97:
        TextView r37 = this.tv_report_times;
        if (r37 != null) goto L100;
        return;
    L100:
        if (this.time <= 0) goto L107;
        if (r37 == null) goto L108;
        if (r37 == null) goto L106;
        Context r38 = r37.getContext();
        if (r38 == null) goto L106;
        r2 = r38.getString(R.string.report_times, new Object[]{O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(this.time))});
    L106:
        r37.setText(r2);
    L108:
        r37.setVisibility(r3);
        return;
    L107:
        r3 = 8;
        goto L108
    L85:
        TextView r39 = this.tv_abnormal;
        if (r39 == null) goto L91;
        Context r40 = this.mContext;
        if (r40 != null) goto L90;
        Intrinsics.XXO("mContext");
        r40 = null;
    L90:
        r39.setText(r40.getResources().getString(R.string.normal_indicators));
    L91:
        TextView r41 = this.tv_abnormal;
        if (r41 == null) goto L97;
        Context r42 = this.mContext;
        if (r42 != null) goto L96;
        Intrinsics.XXO("mContext");
        r42 = null;
    L96:
        r41.setTextColor(r42.getResources().getColorStateList(R.color.green));
        goto L97
    L67:
        r29 = 0;
        goto L68
    L58:
        TextView r43 = this.tv_report_times;
        if (r43 == null) goto L61;
        r43.setVisibility(0);
    L61:
        TextView r44 = this.tv_this_content;
        if (r44 == null) goto L64;
        r44.setVisibility(0);
        goto L64
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.heath_reports_top_item;
    }

    public final void setIvAvatar(@tb1 ImageView r1) {
        this.ivAvatar = r1;
    }

    public final void setTv_abnormal(@tb1 TextView r1) {
        this.tv_abnormal = r1;
    }

    public final void setTv_height_weight(@tb1 TextView r1) {
        this.tv_height_weight = r1;
    }

    public final void setTv_name(@tb1 TextView r1) {
        this.tv_name = r1;
    }

    public final void setTv_report_times(@tb1 TextView r1) {
        this.tv_report_times = r1;
    }

    public final void setTv_this_content(@tb1 TextView r1) {
        this.tv_this_content = r1;
    }

    public /* synthetic */ HeathReportsTopItem(long r1, boolean r3, HealthyReport r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 2) == 0) goto L5;
        r3 = false;
    L5:
        this(r1, r3, r4);
    }
}
