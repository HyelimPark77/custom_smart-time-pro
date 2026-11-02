package com.sma.smartv3.p610ui.status.item;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.w85;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.LogUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.p610ui.p612me.GoalSettingActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.p610ui.status.CaloriesActivity;
import com.sma.smartv3.p610ui.status.DistanceActivity;
import com.sma.smartv3.p610ui.status.StepActivity;
import com.sma.smartv3.p610ui.status.item.MainStep2Item;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.Goal2ProgressBar;
import com.sma.smartv3.view.MarqueeTextView;
import com.sma.smartv3.view.text.MyTypeface;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMainStep2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStep2Item.kt\ncom/sma/smartv3/ui/status/item/MainStep2Item\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n87#2,7:260\n94#2,3:268\n70#2,7:271\n97#2:278\n1#3:267\n*S KotlinDebug\n*F\n+ 1 MainStep2Item.kt\ncom/sma/smartv3/ui/status/item/MainStep2Item\n*L\n180#1:260,7\n180#1:268,3\n180#1:271,7\n180#1:278\n180#1:267\n*E\n"})
public final class MainStep2Item extends MainStepItem {
    private Goal2ProgressBar goalProgressBar;
    private ImageView imgSwitch;
    private boolean isTransverseLayout;

    @tb1
    private ImageView ivRight;

    @aa1
    private final ArrayList<String> mMarqueeList = new ArrayList<>();

    @tb1
    private View rlTipContent;

    @tb1
    private TextView transverseGoal;
    private TextView tvDistance;

    @tb1
    private MarqueeTextView tvMarquee;
    private TextView tvStep;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(MainStep2Item mainStep2Item, View view) {
        if (w85.OXO1.OXO1()) {
            ContextCompat.startActivity(mainStep2Item.getMContext(), new Intent(mainStep2Item.getMContext(), (Class<?>) StepActivity.class), new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(MainStep2Item mainStep2Item, View view) {
        if (w85.OXO1.OXO1()) {
            ContextCompat.startActivity(mainStep2Item.getMContext(), new Intent(mainStep2Item.getMContext(), (Class<?>) DistanceActivity.class), new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(MainStep2Item mainStep2Item, View view) {
        if (w85.OXO1.OXO1()) {
            ContextCompat.startActivity(mainStep2Item.getMContext(), new Intent(mainStep2Item.getMContext(), (Class<?>) CaloriesActivity.class), new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(MainStep2Item mainStep2Item, View view) {
        ContextCompat.startActivity(mainStep2Item.getMContext(), new Intent(mainStep2Item.getMContext(), (Class<?>) GoalSettingActivity.class), new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(MainStep2Item mainStep2Item, View view) {
        a01.OXO1.IiI10X().put(b01.iiII, !mainStep2Item.isTransverseLayout);
        mainStep2Item.setItemLayoutId(mainStep2Item.getTabLayoutID(!mainStep2Item.isTransverseLayout));
        mainStep2Item.initView();
    }

    private final int getTabLayoutID(boolean z) {
        LogUtils.m11128d(Boolean.valueOf(z));
        this.isTransverseLayout = z;
        return (i72.OXO1.OX110i() || this.isTransverseLayout) ? R.layout.v2_status_item_step_transverse : R.layout.v2_status_item_step;
    }

    public static /* synthetic */ int getTabLayoutID$default(MainStep2Item mainStep2Item, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = a01.OXO1.IiI10X().getBoolean(b01.iiII, false);
        }
        return mainStep2Item.getTabLayoutID(z);
    }

    private final void setMarqueeView() {
        MarqueeTextView marqueeTextView = this.tvMarquee;
        if (marqueeTextView != null) {
            this.mMarqueeList.clear();
            this.mMarqueeList.add(UtilsKt.XXO(R.string.usage_guidelines_text));
            this.mMarqueeList.add(UtilsKt.XXO(R.string.refresh_data));
            this.mMarqueeList.add(UtilsKt.XXO(R.string.view_tutorial));
            marqueeTextView.setMarqueeListener(new MarqueeTextView.InterfaceC19065iO() { // from class: com.android.mltcode.paycertificationapi.q30
                @Override // com.sma.smartv3.view.MarqueeTextView.InterfaceC19065iO
                public final void OXO1(int i) {
                    MainStep2Item.setMarqueeView$lambda$0$0(this.OXO1, i);
                }
            });
            marqueeTextView.setTextList(this.mMarqueeList);
        }
        View view = this.rlTipContent;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.r30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MainStep2Item.setMarqueeView$lambda$1$0(this.f10740IO, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMarqueeView$lambda$0$0(MainStep2Item mainStep2Item, int i) {
        if (i == 0) {
            ImageView imageView = mainStep2Item.ivRight;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i != 1) {
            ImageView imageView2 = mainStep2Item.ivRight;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                return;
            }
            return;
        }
        ImageView imageView3 = mainStep2Item.ivRight;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMarqueeView$lambda$1$0(MainStep2Item mainStep2Item, View view) {
        MarqueeTextView marqueeTextView = mainStep2Item.tvMarquee;
        Intrinsics.XXI(marqueeTextView);
        int i = marqueeTextView.XXX11i;
        if (i == 0) {
            i72 i72Var = i72.OXO1;
            Context mContext = mainStep2Item.getMContext();
            Intrinsics.X1ii(mContext, "null cannot be cast to non-null type android.app.Activity");
            i72Var.OIXOXXi((Activity) mContext);
            return;
        }
        if (i != 2) {
            return;
        }
        Context mContext2 = mainStep2Item.getMContext();
        Intrinsics.X1ii(mContext2, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) mContext2;
        String str = "https://api.iot-solution.net/web/guideSMARTTIMEPRO/dist/?pid=58&app=" + i72.X1ii(i72.OXO1, null, 1, null);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", str);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.bindView(itemHolder);
        View viewM3483v = itemHolder.m3483v(R.id.stepPB);
        Intrinsics.XXI(viewM3483v);
        this.goalProgressBar = (Goal2ProgressBar) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.tvStep);
        Intrinsics.XXI(viewM3483v2);
        this.tvStep = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.tvDistance);
        Intrinsics.XXI(viewM3483v3);
        this.tvDistance = (TextView) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.tab_switch_img);
        Intrinsics.XXI(viewM3483v4);
        this.imgSwitch = (ImageView) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.tv_marquee);
        Intrinsics.XXI(viewM3483v5);
        this.tvMarquee = (MarqueeTextView) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.iv_right);
        Intrinsics.XXI(viewM3483v6);
        this.ivRight = (ImageView) viewM3483v6;
        this.rlTipContent = itemHolder.m3483v(R.id.rlTipContent);
        if (this.isTransverseLayout || i72.OXO1.OX110i()) {
            View viewM3483v7 = itemHolder.m3483v(R.id.transverse_goal);
            Intrinsics.XXI(viewM3483v7);
            this.transverseGoal = (TextView) viewM3483v7;
        }
        i72 i72Var = i72.OXO1;
        if (i72Var.OXii10I()) {
            MarqueeTextView marqueeTextView = this.tvMarquee;
            if (marqueeTextView != null) {
                marqueeTextView.setVisibility(0);
            }
            setMarqueeView();
        } else {
            MarqueeTextView marqueeTextView2 = this.tvMarquee;
            if (marqueeTextView2 != null) {
                marqueeTextView2.setVisibility(8);
            }
        }
        ImageView imageView = null;
        if (i72Var.OX110i()) {
            ImageView imageView2 = this.imgSwitch;
            if (imageView2 == null) {
                Intrinsics.XXO("imgSwitch");
            } else {
                imageView = imageView2;
            }
            imageView.setVisibility(8);
        } else {
            ImageView imageView3 = this.imgSwitch;
            if (imageView3 == null) {
                Intrinsics.XXO("imgSwitch");
            } else {
                imageView = imageView3;
            }
            imageView.setVisibility(0);
        }
        View view = itemHolder.view(R.id.llSteps);
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.l30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MainStep2Item.bindView$lambda$0(this.f9342IO, view2);
                }
            });
        }
        View view2 = itemHolder.view(R.id.llDistance);
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.m30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    MainStep2Item.bindView$lambda$1(this.f9604IO, view3);
                }
            });
        }
        View view3 = itemHolder.view(R.id.llCalories);
        if (view3 != null) {
            view3.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.n30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    MainStep2Item.bindView$lambda$2(this.f9836IO, view4);
                }
            });
        }
        getTvTemperature().setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, getMContext()));
        View view4 = itemHolder.view(R.id.ll_goal_set);
        if (view4 != null) {
            view4.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.o30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    MainStep2Item.bindView$lambda$3(this.f10061IO, view5);
                }
            });
        }
        View view5 = itemHolder.view(R.id.tab_switch_img);
        if (view5 != null) {
            view5.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.p30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    MainStep2Item.bindView$lambda$4(this.f10284IO, view6);
                }
            });
        }
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return getTabLayoutID$default(this, false, 1, null);
    }

    @sf5(tag = I01XX0.XOIX)
    public final void onGoalChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChanges(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onThemeChange now Theme" + a01.OXO1.OXO1().getInt(b01.X0O, 0));
        MarqueeTextView marqueeTextView = this.tvMarquee;
        if (marqueeTextView != null) {
            marqueeTextView.getCurrentView().setTextColor(gk4.m1859iO(getMContext(), R.color.text_color));
            marqueeTextView.getNextView().setTextColor(gk4.m1859iO(getMContext(), R.color.text_color));
        }
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem
    @SuppressLint({"SetTextI18n"})
    public void updateActivity() {
        TextView textView;
        super.updateActivity();
        BleCache bleCache = BleCache.INSTANCE;
        int int$default = BaseBleCache.getInt$default(bleCache, BleKey.STEP_GOAL, 0, null, 6, null);
        int int$default2 = BaseBleCache.getInt$default(bleCache, BleKey.CALORIES_GOAL, 0, null, 6, null);
        q62 q62Var = q62.OXO1;
        if (!q62Var.i0XI0() || int$default2 == 0) {
            int$default2 = o65.OXO1.I0IIOi(getUserProfile().getGender(), getUserProfile().getWeight(), int$default);
        }
        int i = int$default2;
        int int$default3 = BaseBleCache.getInt$default(bleCache, BleKey.DISTANCE_GOAL, 0, null, 6, null);
        if (!q62Var.i0XI0() || int$default3 == 0) {
            int$default3 = o65.OXO1.OIi0(getUserProfile().getHeight(), int$default);
        }
        i1O0OXO1O.OXO1.OXO1("pb -> " + int$default + " " + i + " " + int$default3);
        Goal2ProgressBar goal2ProgressBar = this.goalProgressBar;
        TextView textView2 = null;
        if (goal2ProgressBar == null) {
            Intrinsics.XXO("goalProgressBar");
            goal2ProgressBar = null;
        }
        com.sma.smartv3.p608db.entity.Activity activity = getActivity();
        Intrinsics.XXI(activity);
        goal2ProgressBar.O00(activity.getMCalorie() / 10000, i);
        Goal2ProgressBar goal2ProgressBar2 = this.goalProgressBar;
        if (goal2ProgressBar2 == null) {
            Intrinsics.XXO("goalProgressBar");
            goal2ProgressBar2 = null;
        }
        com.sma.smartv3.p608db.entity.Activity activity2 = getActivity();
        Intrinsics.XXI(activity2);
        goal2ProgressBar2.IiI10X(activity2.getMStep(), int$default);
        Goal2ProgressBar goal2ProgressBar3 = this.goalProgressBar;
        if (goal2ProgressBar3 == null) {
            Intrinsics.XXO("goalProgressBar");
            goal2ProgressBar3 = null;
        }
        com.sma.smartv3.p608db.entity.Activity activity3 = getActivity();
        Intrinsics.XXI(activity3);
        goal2ProgressBar3.XO0O10(activity3.getMDistance() / 10000, int$default3);
        TextView textView3 = this.tvStep;
        if (textView3 == null) {
            Intrinsics.XXO("tvStep");
            textView3 = null;
        }
        com.sma.smartv3.p608db.entity.Activity activity4 = getActivity();
        Intrinsics.XXI(activity4);
        textView3.setText(String.valueOf(activity4.getMStep()));
        TextView textView4 = this.tvDistance;
        if (textView4 == null) {
            Intrinsics.XXO("tvDistance");
        } else {
            textView2 = textView4;
        }
        com.sma.smartv3.p608db.entity.Activity activity5 = getActivity();
        Intrinsics.XXI(activity5);
        textView2.setText(cp5.I1XOi1(activity5.getMDistance() / 10000, getUserProfile().getUnit(), false));
        if ((this.isTransverseLayout || i72.OXO1.OX110i()) && (textView = this.transverseGoal) != null) {
            com.sma.smartv3.p608db.entity.Activity activity6 = getActivity();
            Intrinsics.XXI(activity6);
            textView.setText(activity6.getMStep() + "/" + int$default);
        }
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem
    public void updateWeather() {
        super.updateWeather();
        getTvWeatherTime().setVisibility(8);
        if (getTvTemperature().getVisibility() == 4) {
            getTvTemperature().setVisibility(0);
            getTvTemperature().setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        }
    }
}
