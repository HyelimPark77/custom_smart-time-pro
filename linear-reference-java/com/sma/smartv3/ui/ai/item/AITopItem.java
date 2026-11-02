package com.sma.smartv3.ui.ai.item;

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
import com.android.mltcode.paycertificationapi.OIIOI;
import com.android.mltcode.paycertificationapi.Oi1;
import com.android.mltcode.paycertificationapi.XII01OO1I;
import com.android.mltcode.paycertificationapi.XOOXII;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai.SearchFuncActivity;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.sma.smartv3.ui.me.UserInfoActivity;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.ui.status.item.MainStepItem;
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

    public AITopItem() {
    }

    public static /* synthetic */ void I0IIOi(AITopItem r0, View r1) {
        bindView$lambda$2(r0, r1);
    }

    public static /* synthetic */ void IO(AITopItem r0, View r1) {
        bindView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(AITopItem r0, View r1) {
        bindView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void OIi0(AITopItem r0) {
        onAvatarChange$lambda$0(r0);
    }

    private final void avatarShow() {
        ImageViewRound r0 = this.ivAvatar;
        ImageViewRound r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("ivAvatar");
        r0 = null;
    L5:
        ImageViewRound r3 = this.ivAvatar;
        if (r3 != null) goto L8;
        Intrinsics.XXO("ivAvatar");
        r3 = null;
    L8:
        r0.setImageDrawable(gk4.XOO0ii0(r3.getContext(), R.drawable.pic_avatar_default));
        sz0 r2 = sz0.OXO1;
        if (uz0.OIi0(r2).exists() == false) goto L16;
        ImageViewRound r4 = this.ivAvatar;
        if (r4 != null) goto L13;
        Intrinsics.XXO("ivAvatar");
    L14:
        r1.setImageURI(Uri.fromFile(uz0.OIi0(r2)));
        return;
    L13:
        r1 = r4;
        goto L14
    }

    private static final void bindView$lambda$0(AITopItem r2, View r3) {
        r2.getMContext().startActivity(new Intent(r2.getMContext(), UserInfoActivity.class));
    }

    private static final void bindView$lambda$1(AITopItem r2, View r3) {
        r2.getMContext().startActivity(new Intent(r2.getMContext(), SearchFuncActivity.class));
    }

    private static final void bindView$lambda$2(AITopItem r3, View r4) {
        Intent r5 = new Intent(r3.getMContext(), GoogleWebViewActivity.class);
        r5.putExtra("mArg0", OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null));
        r5.putExtra("mArg1", WebViewActivity.Companion.XOO0ii0());
        r3.getMContext().startActivity(r5);
    }

    private static final void onAvatarChange$lambda$0(AITopItem r1) {
        LogUtils.d(new Object[]{"AvatarItem onAvatarChange"});
        r1.avatarShow();
    }

    private final void onChangeUserMember() {
        View r3 = null;
        View r4 = null;
        View r5 = null;
        TextView r6 = null;
        if (i72.OXO1.IIII0iI() == false) goto L59;
        View r0 = this.mVipLayout;
        if (r0 != null) goto L7;
        Intrinsics.XXO("mVipLayout");
        r0 = null;
    L7:
        r0.setVisibility(0);
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new Gson().fromJson(r1.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
        if (r2 != null) goto L10;
        r2 = UserMember.class.newInstance();
    L10:
        UserMember r7 = (UserMember) r2;
        if (r7.getLatestDateTime() <= 0) goto L44;
        TextView r8 = this.mVipInfo;
        if (r8 != null) goto L16;
        Intrinsics.XXO("mVipInfo");
        r8 = null;
    L16:
        if (r7.getServerDateTime() <= r7.getLatestDateTime()) goto L28;
        TextView r9 = this.mVipTv;
        if (r9 != null) goto L20;
        Intrinsics.XXO("mVipTv");
        r9 = null;
    L20:
        r9.setText(UtilsKt.XXO(R.string.game_member_renewal_btn));
        TextView r10 = this.mVipTv;
        if (r10 != null) goto L23;
        Intrinsics.XXO("mVipTv");
        r10 = null;
    L23:
        r10.setBackgroundResource(R.drawable.vip_btn_shape_bg);
        View r11 = this.mVipIcon;
        if (r11 != null) goto L26;
        Intrinsics.XXO("mVipIcon");
    L27:
        r4.setVisibility(8);
        String r12 = UtilsKt.XXO(R.string.ai_expired_tip);
    L42:
        r8.setText(r12);
        return;
    L26:
        r4 = r11;
        goto L27
    L28:
        TextView r13 = this.mVipTv;
        if (r13 != null) goto L31;
        Intrinsics.XXO("mVipTv");
        r13 = null;
    L31:
        r13.setBackgroundResource(R.drawable.vip_btn_shape_bg);
        TextView r14 = this.mVipTv;
        if (r14 != null) goto L34;
        Intrinsics.XXO("mVipTv");
        r14 = null;
    L34:
        r14.setBackgroundTintList(getMContext().getResources().getColorStateList(R.color.vip_orange_FF7E40));
        TextView r15 = this.mVipTv;
        if (r15 != null) goto L37;
        Intrinsics.XXO("mVipTv");
        r15 = null;
    L37:
        r15.setText(UtilsKt.XXO(R.string.game_member_center));
        View r16 = this.mVipIcon;
        if (r16 != null) goto L40;
        Intrinsics.XXO("mVipIcon");
    L41:
        r5.setVisibility(0);
        r12 = UtilsKt.XXO(R.string.valid_until) + O0X11OiO.I0IIOi().format(new Date(r7.getLatestDateTime()));
        goto L42
    L40:
        r5 = r16;
        goto L41
    L44:
        TextView r17 = this.mVipTv;
        if (r17 != null) goto L47;
        Intrinsics.XXO("mVipTv");
        r17 = null;
    L47:
        r17.setBackgroundResource(R.drawable.vip_btn_shape_bg);
        TextView r18 = this.mVipTv;
        if (r18 != null) goto L50;
        Intrinsics.XXO("mVipTv");
        r18 = null;
    L50:
        r18.setText(UtilsKt.XXO(R.string.game_member_open_btn));
        View r19 = this.mVipIcon;
        if (r19 != null) goto L53;
        Intrinsics.XXO("mVipIcon");
        r19 = null;
    L53:
        r19.setVisibility(8);
        TextView r20 = this.mVipInfo;
        if (r20 != null) goto L56;
        Intrinsics.XXO("mVipInfo");
    L57:
        r6.setText("");
        return;
    L56:
        r6 = r20;
        goto L57
    L59:
        View r21 = this.mVipLayout;
        if (r21 != null) goto L62;
        Intrinsics.XXO("mVipLayout");
    L63:
        r3.setVisibility(8);
        return;
    L62:
        r3 = r21;
        goto L63
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r4) {
        Intrinsics.X0O(r4, "itemHolder");
        super.bindView(r4);
        View r0 = r4.v(R.id.tv_nickname);
        Intrinsics.XXI(r0);
        this.tvNickname = (TextView) r0;
        View r1 = r4.v(R.id.iv_avatar);
        Intrinsics.XXI(r1);
        this.ivAvatar = (ImageViewRound) r1;
        View r2 = r4.v(R.id.vip_layout);
        Intrinsics.XXI(r2);
        this.mVipLayout = r2;
        View r3 = r4.v(R.id.ai_vip_icon);
        Intrinsics.XXI(r3);
        this.mVipIcon = r3;
        View r5 = r4.v(R.id.tv_vip_info);
        Intrinsics.XXI(r5);
        this.mVipInfo = (TextView) r5;
        View r6 = r4.v(R.id.ai_vip_tv);
        Intrinsics.XXI(r6);
        this.mVipTv = (TextView) r6;
        r4.click(R.id.iv_avatar, new XOOXII(this));
        this.mCardView = (CardView) r4.v(R.id.search_item);
        r4.click(R.id.search_item, new OIIOI(this));
        r4.click(R.id.vip_layout, new Oi1(this));
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        super.initView();
        avatarShow();
        TextView r1 = this.tvNickname;
        if (r1 != null) goto L5;
        Intrinsics.XXO("tvNickname");
        r1 = null;
    L5:
        SPUtils r2 = a01.OXO1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L9;
        r3 = r4;
    L9:
        r1.setText(((AppUser) r3).getNickname());
        CardView r5 = this.mCardView;
        if (r5 == null) goto L12;
        r5.setBackgroundTintList(ColorStateList.valueOf(gk4.iO(getMContext(), R.color.ai_search_layout_bg)));
    L12:
        onChangeUserMember();
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_top;
    }

    @sf5(tag = I01XX0.iI)
    public final void onAvatarChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        new Handler(Looper.getMainLooper()).postDelayed(new XII01OO1I(this), 1000);
    }

    @sf5(tag = I01XX0.X11iII1O1)
    public final void onNickNameChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"onNickNameChange"});
        initView();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"onThemeChange"});
        initView();
    }

    @sf5(tag = I01XX0.O101)
    public final void onUserMemberChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onUserMemberChange");
        onChangeUserMember();
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem
    public void updateWeather() {
        if (i72.OXO1.IIII0iI() == false) goto L7;
        getTvWeatherTime().setVisibility(8);
        return;
    L7:
        if (getTvTemperature().getVisibility() == 0) goto L9;
        getTvTemperature().setVisibility(0);
        getTvTemperature().setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
    L9:
        super.updateWeather();
    }
}
