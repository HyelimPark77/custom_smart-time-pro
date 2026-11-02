package com.sma.smartv3.p610ui.p612me.item;

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
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.p610ui.p612me.item.MeAvatar2Item;
import com.sma.smartv3.pro.R;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(Ref.ObjectRef objectRef, View view) {
        ClipboardUtils.copyText((CharSequence) objectRef.element);
        ToastUtils.showLong(R.string.copied);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(Ref.ObjectRef objectRef, MeAvatar2Item meAvatar2Item, View view) {
        if (((CharSequence) objectRef.element).length() > 0) {
            Context mContext = meAvatar2Item.getMContext();
            Intrinsics.X1ii(mContext, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) mContext;
            BleInitializer.f51208IO.ii00OXXO(true);
            int iXOO0ii0 = WebViewActivity.Companion.XOO0ii0();
            String str = "https://dev.iot-solution.net/orderDetail/#/notification?identity=" + objectRef.element;
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", str);
            bundle.putInt("mArg1", iXOO0ii0);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }

    @Override // com.sma.smartv3.p610ui.p612me.item.MainAvatarItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.bindView(itemHolder);
        View viewM3483v = itemHolder.m3483v(R.id.iv_gender);
        Intrinsics.XXI(viewM3483v);
        this.ivGender = (ImageView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.id_panel);
        Intrinsics.XXI(viewM3483v2);
        this.idPanel = viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.iv_avatar_vip);
        Intrinsics.XXI(viewM3483v3);
        this.ivVip = viewM3483v3;
        if (viewM3483v3 == null) {
            Intrinsics.XXO("ivVip");
            viewM3483v3 = null;
        }
        Context context = viewM3483v3.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        this.ivInternalNotice = itemHolder.m3483v(R.id.app_notification);
        this.ivInternalNoticeRemind = itemHolder.m3483v(R.id.app_notification_ivRemind);
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

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v26, types: [T, java.lang.String] */
    @Override // com.sma.smartv3.p610ui.p612me.item.MainAvatarItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? identity = appUser2.getIdentity();
        objectRef.element = identity;
        if (((CharSequence) identity).length() == 0) {
            SPUtils sPUtilsOXO1 = a01Var.OXO1();
            AppUser appUser3 = (AppUser) new Gson().fromJson(sPUtilsOXO1.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
            if (appUser3 != null) {
                objectRef.element = appUser3.getIdentity();
            }
        }
        i1O0OXO1O.OXO1.OXO1("MeAvatar2Item initView" + appUser2.getNickname());
        getTvNickname().setText(appUser2.getNickname());
        setAvatarUrl(appUser2.getAvatarUrl());
        View view = this.idPanel;
        ImageView imageView = null;
        if (view == null) {
            Intrinsics.XXO("idPanel");
            view = null;
        }
        view.setVisibility(((CharSequence) objectRef.element).length() == 0 ? 4 : 0);
        getUserID().setText("ID:" + objectRef.element);
        getUserID().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.be0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MeAvatar2Item.initView$lambda$1(objectRef, view2);
            }
        });
        View view2 = this.ivVip;
        if (view2 == null) {
            Intrinsics.XXO("ivVip");
            view2 = null;
        }
        i72 i72Var = i72.OXO1;
        view2.setVisibility(i72Var.m2044Ii() ? 0 : 8);
        View view3 = this.ivInternalNotice;
        if (view3 != null) {
            view3.setVisibility(i72Var.XX1Oi() ? 0 : 8);
        }
        int i = a01Var.IiI10X().getInt(I01XX0.IXiOXO, 0);
        View view4 = this.ivInternalNoticeRemind;
        if (view4 != null) {
            view4.setVisibility((!i72Var.XX1Oi() || i <= 0) ? 8 : 0);
        }
        onUserUnreadMessagesChange(i);
        View view5 = this.ivInternalNotice;
        if (view5 != null) {
            view5.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ce0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    MeAvatar2Item.initView$lambda$2(objectRef, this, view6);
                }
            });
        }
        ImageView imageView2 = this.ivGender;
        if (imageView2 == null) {
            Intrinsics.XXO("ivGender");
        } else {
            imageView = imageView2;
        }
        imageView.setImageResource(appUser2.getGender() == 0 ? R.drawable.icon_me_female : R.drawable.icon_me_male);
        avatarShow();
    }

    @Override // com.sma.smartv3.p610ui.p612me.item.MainAvatarItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_me_item_avatar;
    }

    @sf5(tag = I01XX0.X0i1O)
    public final void onGenderChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        LogUtils.m11128d("MeAvatar2Item GenderChange" + appUser2.getGender());
        ImageView imageView = this.ivGender;
        if (imageView == null) {
            Intrinsics.XXO("ivGender");
            imageView = null;
        }
        imageView.setImageResource(appUser2.getGender() == 0 ? R.drawable.icon_me_female : R.drawable.icon_me_male);
    }

    @sf5(tag = I01XX0.O101)
    public final void onUserMemberChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onUserMemberChange");
        View view = this.ivVip;
        if (view == null) {
            Intrinsics.XXO("ivVip");
            view = null;
        }
        view.setVisibility(i72.OXO1.m2044Ii() ? 0 : 8);
    }

    @sf5(tag = I01XX0.IXiOXO)
    public final void onUserUnreadMessagesChange(int i) {
        i1O0OXO1O.OXO1.OXO1("onUserUnreadMessagesChange");
        if (i72.OXO1.XX1Oi()) {
            a01.OXO1.IiI10X().put(I01XX0.IXiOXO, i);
            View view = this.ivInternalNoticeRemind;
            if (view != null) {
                view.setVisibility(i > 0 ? 0 : 8);
            }
        }
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }
}
