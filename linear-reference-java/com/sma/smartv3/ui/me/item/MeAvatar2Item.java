package com.sma.smartv3.ui.me.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.be0;
import com.android.mltcode.paycertificationapi.ce0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nMeAvatar2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeAvatar2Item.kt\ncom/sma/smartv3/ui/me/item/MeAvatar2Item\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n19#2:128\n15#2:129\n90#2:130\n19#2:131\n15#2:132\n87#3,7:133\n94#3,3:141\n70#3,7:144\n97#3:151\n1#4:140\n*S KotlinDebug\n*F\n+ 1 MeAvatar2Item.kt\ncom/sma/smartv3/ui/me/item/MeAvatar2Item\n*L\n51#1:128\n51#1:129\n55#1:130\n117#1:131\n117#1:132\n77#1:133,7\n77#1:141,3\n77#1:144,7\n77#1:151\n77#1:140\n*E\n"})
public final class MeAvatar2Item extends MainAvatarItem {
    private View idPanel;
    private ImageView ivGender;

    @tb1
    private View ivInternalNotice;

    @tb1
    private View ivInternalNoticeRemind;
    private View ivVip;
    public Context mContext;

    public MeAvatar2Item() {
    }

    public static /* synthetic */ void IiI10X(Ref.ObjectRef r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void O00(Ref.ObjectRef r0, MeAvatar2Item r1, View r2) {
        initView$lambda$2(r0, r1, r2);
    }

    private static final void initView$lambda$1(Ref.ObjectRef r0, View r1) {
        ClipboardUtils.copyText((CharSequence) r0.element);
        ToastUtils.showLong(R.string.copied);
    }

    private static final void initView$lambda$2(Ref.ObjectRef r2, MeAvatar2Item r3, View r4) {
        if (((CharSequence) r2.element).length() <= 0) goto L6;
        Context r5 = r3.getMContext();
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type android.app.Activity");
        Activity r6 = (Activity) r5;
        BleInitializer.IO.ii00OXXO(true);
        int r7 = WebViewActivity.Companion.XOO0ii0();
        String r8 = "https://dev.iot-solution.net/orderDetail/#/notification?identity=" + r2.element;
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r8);
        r0.putInt("mArg1", r7);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r9 = new Intent(r6, WebViewActivity.class);
        r9.putExtras(r0);
        r6.startActivity(r9);
        return;
    }

    @Override // com.sma.smartv3.ui.me.item.MainAvatarItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        super.bindView(r3);
        View r0 = r3.v(R.id.iv_gender);
        Intrinsics.XXI(r0);
        this.ivGender = (ImageView) r0;
        View r1 = r3.v(R.id.id_panel);
        Intrinsics.XXI(r1);
        this.idPanel = r1;
        View r2 = r3.v(R.id.iv_avatar_vip);
        Intrinsics.XXI(r2);
        this.ivVip = r2;
        if (r2 != null) goto L5;
        Intrinsics.XXO("ivVip");
        r2 = null;
    L5:
        Context r4 = r2.getContext();
        Intrinsics.O10IXXX0X(r4, "getContext(...)");
        setMContext(r4);
        this.ivInternalNotice = r3.v(R.id.app_notification);
        this.ivInternalNoticeRemind = r3.v(R.id.app_notification_ivRemind);
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

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v26, types: [T, java.lang.String] */
    @Override // com.sma.smartv3.ui.me.item.MainAvatarItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        AppUser r5 = (AppUser) r3;
        final Ref.ObjectRef r6 = new Ref.ObjectRef();
        ?? r7 = r5.getIdentity();
        r6.element = r7;
        if (((CharSequence) r7).length() != 0) goto L11;
        SPUtils r8 = r1.OXO1();
        AppUser r9 = (AppUser) new Gson().fromJson(r8.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
        if (r9 == null) goto L11;
        r6.element = r9.getIdentity();
    L11:
        i1O0OXO1O.OXO1.OXO1("MeAvatar2Item initView" + r5.getNickname());
        getTvNickname().setText(r5.getNickname());
        setAvatarUrl(r5.getAvatarUrl());
        View r10 = this.idPanel;
        ImageView r11 = null;
        if (r10 != null) goto L14;
        Intrinsics.XXO("idPanel");
        r10 = null;
    L14:
        int r12 = 0;
        if (((CharSequence) r6.element).length() != 0) goto L17;
        int r13 = 4;
    L18:
        r10.setVisibility(r13);
        getUserID().setText("ID:" + r6.element);
        getUserID().setOnClickListener(new be0(r6));
        View r14 = this.ivVip;
        if (r14 != null) goto L21;
        Intrinsics.XXO("ivVip");
        r14 = null;
    L21:
        i72 r15 = i72.OXO1;
        if (r15.Ii() == false) goto L24;
        int r16 = 0;
    L25:
        r14.setVisibility(r16);
        View r17 = this.ivInternalNotice;
        if (r17 != null) goto L28;
    L32:
        int r18 = r1.IiI10X().getInt(I01XX0.IXiOXO, 0);
        View r19 = this.ivInternalNoticeRemind;
        if (r19 != null) goto L35;
    L40:
        onUserUnreadMessagesChange(r18);
        View r20 = this.ivInternalNotice;
        if (r20 == null) goto L43;
        r20.setOnClickListener(new ce0(r6, this));
    L43:
        ImageView r21 = this.ivGender;
        if (r21 != null) goto L46;
        Intrinsics.XXO("ivGender");
    L48:
        if (r5.getGender() != 0) goto L50;
        int r22 = R.drawable.icon_me_female;
    L51:
        r11.setImageResource(r22);
        avatarShow();
        return;
    L50:
        r22 = R.drawable.icon_me_male;
        goto L51
    L46:
        r11 = r21;
        goto L48
    L35:
        if (r15.XX1Oi() == false) goto L38;
        if (r18 <= 0) goto L38;
    L39:
        r19.setVisibility(r12);
    L38:
        r12 = 8;
        goto L39
    L28:
        if (r15.XX1Oi() == false) goto L30;
        int r23 = 0;
    L31:
        r17.setVisibility(r23);
        goto L32
    L30:
        r23 = 8;
        goto L31
    L24:
        r16 = 8;
        goto L25
    L17:
        r13 = 0;
        goto L18
    }

    @Override // com.sma.smartv3.ui.me.item.MainAvatarItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_me_item_avatar;
    }

    @sf5(tag = I01XX0.X0i1O)
    public final void onGenderChange(@aa1 Object r32) {
        Intrinsics.X0O(r32, "data");
        initView();
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        AppUser r3 = (AppUser) r1;
        LogUtils.d(new Object[]{"MeAvatar2Item GenderChange" + r3.getGender()});
        ImageView r4 = this.ivGender;
        if (r4 != null) goto L10;
        Intrinsics.XXO("ivGender");
        r4 = null;
    L10:
        if (r3.getGender() != 0) goto L12;
        int r5 = R.drawable.icon_me_female;
    L13:
        r4.setImageResource(r5);
        return;
    L12:
        r5 = R.drawable.icon_me_male;
        goto L13
    }

    @sf5(tag = I01XX0.O101)
    public final void onUserMemberChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onUserMemberChange");
        View r3 = this.ivVip;
        if (r3 != null) goto L6;
        Intrinsics.XXO("ivVip");
        r3 = null;
    L6:
        if (i72.OXO1.Ii() == false) goto L8;
        int r0 = 0;
    L9:
        r3.setVisibility(r0);
        return;
    L8:
        r0 = 8;
        goto L9
    }

    @sf5(tag = I01XX0.IXiOXO)
    public final void onUserUnreadMessagesChange(int r3) {
        i1O0OXO1O.OXO1.OXO1("onUserUnreadMessagesChange");
        if (i72.OXO1.XX1Oi() == false) goto L11;
        a01.OXO1.IiI10X().put(I01XX0.IXiOXO, r3);
        View r0 = this.ivInternalNoticeRemind;
        if (r0 == null) goto L12;
        if (r3 <= 0) goto L8;
        int r4 = 0;
    L9:
        r0.setVisibility(r4);
        return;
    L8:
        r4 = 8;
        goto L9
    L12:
        return;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }
}
