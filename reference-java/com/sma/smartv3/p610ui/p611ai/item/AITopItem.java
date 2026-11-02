package com.sma.smartv3.p610ui.p611ai.item;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.p610ui.p611ai.SearchFuncActivity;
import com.sma.smartv3.p610ui.p611ai.item.AITopItem;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.p610ui.p612me.UserInfoActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.p610ui.status.item.MainStepItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.ImageViewRound;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAITopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITopItem.kt\ncom/sma/smartv3/ui/ai/item/AITopItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,188:1\n93#2,2:189\n90#2:191\n19#2:192\n15#2:193\n*S KotlinDebug\n*F\n+ 1 AITopItem.kt\ncom/sma/smartv3/ui/ai/item/AITopItem\n*L\n95#1:189,2\n95#1:191\n128#1:192\n128#1:193\n*E\n"})
public class AITopItem extends MainStepItem {
    private ImageViewRound ivAvatar;

    @tb1
    private CardView mCardView;
    private View mVipIcon;
    private TextView mVipInfo;
    private View mVipLayout;
    private TextView mVipTv;
    private TextView tvNickname;

    private final void avatarShow() {
        ImageViewRound imageViewRound = this.ivAvatar;
        ImageViewRound imageViewRound2 = null;
        if (imageViewRound == null) {
            Intrinsics.XXO("ivAvatar");
            imageViewRound = null;
        }
        ImageViewRound imageViewRound3 = this.ivAvatar;
        if (imageViewRound3 == null) {
            Intrinsics.XXO("ivAvatar");
            imageViewRound3 = null;
        }
        imageViewRound.setImageDrawable(gk4.XOO0ii0(imageViewRound3.getContext(), R.drawable.pic_avatar_default));
        sz0 sz0Var = sz0.OXO1;
        if (uz0.OIi0(sz0Var).exists()) {
            ImageViewRound imageViewRound4 = this.ivAvatar;
            if (imageViewRound4 == null) {
                Intrinsics.XXO("ivAvatar");
            } else {
                imageViewRound2 = imageViewRound4;
            }
            imageViewRound2.setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(AITopItem aITopItem, View view) {
        aITopItem.getMContext().startActivity(new Intent(aITopItem.getMContext(), (Class<?>) UserInfoActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(AITopItem aITopItem, View view) {
        aITopItem.getMContext().startActivity(new Intent(aITopItem.getMContext(), (Class<?>) SearchFuncActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(AITopItem aITopItem, View view) {
        Intent intent = new Intent(aITopItem.getMContext(), (Class<?>) GoogleWebViewActivity.class);
        intent.putExtra("mArg0", OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null));
        intent.putExtra("mArg1", WebViewActivity.Companion.XOO0ii0());
        aITopItem.getMContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAvatarChange$lambda$0(AITopItem aITopItem) {
        LogUtils.m11128d("AvatarItem onAvatarChange");
        aITopItem.avatarShow();
    }

    private final void onChangeUserMember() throws IllegalAccessException, InstantiationException {
        String strXXO;
        View view = null;
        View view2 = null;
        View view3 = null;
        TextView textView = null;
        if (!i72.OXO1.IIII0iI()) {
            View view4 = this.mVipLayout;
            if (view4 == null) {
                Intrinsics.XXO("mVipLayout");
            } else {
                view = view4;
            }
            view.setVisibility(8);
            return;
        }
        View view5 = this.mVipLayout;
        if (view5 == null) {
            Intrinsics.XXO("mVipLayout");
            view5 = null;
        }
        view5.setVisibility(0);
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.O101 + '_' + UserMember.class.getName()), (Class<Object>) UserMember.class);
        if (objFromJson == null) {
            objFromJson = UserMember.class.newInstance();
        }
        UserMember userMember = (UserMember) objFromJson;
        if (userMember.getLatestDateTime() <= 0) {
            TextView textView2 = this.mVipTv;
            if (textView2 == null) {
                Intrinsics.XXO("mVipTv");
                textView2 = null;
            }
            textView2.setBackgroundResource(R.drawable.vip_btn_shape_bg);
            TextView textView3 = this.mVipTv;
            if (textView3 == null) {
                Intrinsics.XXO("mVipTv");
                textView3 = null;
            }
            textView3.setText(UtilsKt.XXO(R.string.game_member_open_btn));
            View view6 = this.mVipIcon;
            if (view6 == null) {
                Intrinsics.XXO("mVipIcon");
                view6 = null;
            }
            view6.setVisibility(8);
            TextView textView4 = this.mVipInfo;
            if (textView4 == null) {
                Intrinsics.XXO("mVipInfo");
            } else {
                textView = textView4;
            }
            textView.setText("");
            return;
        }
        TextView textView5 = this.mVipInfo;
        if (textView5 == null) {
            Intrinsics.XXO("mVipInfo");
            textView5 = null;
        }
        if (userMember.getServerDateTime() > userMember.getLatestDateTime()) {
            TextView textView6 = this.mVipTv;
            if (textView6 == null) {
                Intrinsics.XXO("mVipTv");
                textView6 = null;
            }
            textView6.setText(UtilsKt.XXO(R.string.game_member_renewal_btn));
            TextView textView7 = this.mVipTv;
            if (textView7 == null) {
                Intrinsics.XXO("mVipTv");
                textView7 = null;
            }
            textView7.setBackgroundResource(R.drawable.vip_btn_shape_bg);
            View view7 = this.mVipIcon;
            if (view7 == null) {
                Intrinsics.XXO("mVipIcon");
            } else {
                view2 = view7;
            }
            view2.setVisibility(8);
            strXXO = UtilsKt.XXO(R.string.ai_expired_tip);
        } else {
            TextView textView8 = this.mVipTv;
            if (textView8 == null) {
                Intrinsics.XXO("mVipTv");
                textView8 = null;
            }
            textView8.setBackgroundResource(R.drawable.vip_btn_shape_bg);
            TextView textView9 = this.mVipTv;
            if (textView9 == null) {
                Intrinsics.XXO("mVipTv");
                textView9 = null;
            }
            textView9.setBackgroundTintList(getMContext().getResources().getColorStateList(R.color.vip_orange_FF7E40));
            TextView textView10 = this.mVipTv;
            if (textView10 == null) {
                Intrinsics.XXO("mVipTv");
                textView10 = null;
            }
            textView10.setText(UtilsKt.XXO(R.string.game_member_center));
            View view8 = this.mVipIcon;
            if (view8 == null) {
                Intrinsics.XXO("mVipIcon");
            } else {
                view3 = view8;
            }
            view3.setVisibility(0);
            strXXO = UtilsKt.XXO(R.string.valid_until) + O0X11OiO.I0IIOi().format(new Date(userMember.getLatestDateTime()));
        }
        textView5.setText(strXXO);
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.bindView(itemHolder);
        View viewM3483v = itemHolder.m3483v(R.id.tv_nickname);
        Intrinsics.XXI(viewM3483v);
        this.tvNickname = (TextView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.iv_avatar);
        Intrinsics.XXI(viewM3483v2);
        this.ivAvatar = (ImageViewRound) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.vip_layout);
        Intrinsics.XXI(viewM3483v3);
        this.mVipLayout = viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.ai_vip_icon);
        Intrinsics.XXI(viewM3483v4);
        this.mVipIcon = viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.tv_vip_info);
        Intrinsics.XXI(viewM3483v5);
        this.mVipInfo = (TextView) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.ai_vip_tv);
        Intrinsics.XXI(viewM3483v6);
        this.mVipTv = (TextView) viewM3483v6;
        itemHolder.click(R.id.iv_avatar, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XOOXII
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AITopItem.bindView$lambda$0(this.f4823IO, view);
            }
        });
        this.mCardView = (CardView) itemHolder.m3483v(R.id.search_item);
        itemHolder.click(R.id.search_item, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OIIOI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AITopItem.bindView$lambda$1(this.f2972IO, view);
            }
        });
        itemHolder.click(R.id.vip_layout, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Oi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AITopItem.bindView$lambda$2(this.f3645IO, view);
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() throws IllegalAccessException, InstantiationException {
        super.initView();
        avatarShow();
        TextView textView = this.tvNickname;
        if (textView == null) {
            Intrinsics.XXO("tvNickname");
            textView = null;
        }
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        textView.setText(((AppUser) appUser).getNickname());
        CardView cardView = this.mCardView;
        if (cardView != null) {
            cardView.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(getMContext(), R.color.ai_search_layout_bg)));
        }
        onChangeUserMember();
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_top;
    }

    @sf5(tag = I01XX0.f1093iI)
    public final void onAvatarChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XII01OO1I
            @Override // java.lang.Runnable
            public final void run() {
                AITopItem.onAvatarChange$lambda$0(this.f4495IO);
            }
        }, 1000L);
    }

    @sf5(tag = I01XX0.X11iII1O1)
    public final void onNickNameChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onNickNameChange");
        initView();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onThemeChange");
        initView();
    }

    @sf5(tag = I01XX0.O101)
    public final void onUserMemberChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onUserMemberChange");
        onChangeUserMember();
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem
    public void updateWeather() {
        if (i72.OXO1.IIII0iI()) {
            getTvWeatherTime().setVisibility(8);
            return;
        }
        if (getTvTemperature().getVisibility() != 0) {
            getTvTemperature().setVisibility(0);
            getTvTemperature().setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        }
        super.updateWeather();
    }
}
