package com.sma.smartv3.ui.me.item;

import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nMainAvatarItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAvatarItem.kt\ncom/sma/smartv3/ui/me/item/MainAvatarItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n19#2:136\n15#2:137\n19#2:141\n15#2:142\n278#3,2:138\n1#4:140\n*S KotlinDebug\n*F\n+ 1 MainAvatarItem.kt\ncom/sma/smartv3/ui/me/item/MainAvatarItem\n*L\n55#1:136\n55#1:137\n108#1:141\n108#1:142\n61#1:138,2\n*E\n"})
public class MainAvatarItem extends BaseDslItem {
    private RelativeLayout avatarRl;
    public String avatarUrl;
    private final boolean initEvent;
    public ImageViewRound ivAvatar;

    @tb1
    private View.OnClickListener mOnClick;
    public TextView tvNickname;
    public TextView userID;

    public MainAvatarItem() {
        this.initEvent = true;
    }

    private final void downloadImage(File r4) {
        if (getAvatarUrl().length() <= 0) goto L6;
        NetWorkUtils.INSTANCE.getImage(getAvatarUrl(), r4, new AnonymousClass1());
        return;
    }

    public final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 r0 = sz0.OXO1;
        if (uz0.OIi0(r0).exists() == false) goto L6;
        getIvAvatar().setVisibility(0);
        getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(r0)));
        return;
    L6:
        downloadImage(uz0.OIi0(r0));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r4) {
        Intrinsics.X0O(r4, "itemHolder");
        View r1 = r4.v(R.id.iv_avatar);
        Intrinsics.XXI(r1);
        setIvAvatar((ImageViewRound) r1);
        View r2 = r4.v(R.id.edt_nickname);
        Intrinsics.XXI(r2);
        setTvNickname((TextView) r2);
        View r3 = r4.v(R.id.userID);
        Intrinsics.XXI(r3);
        setUserID((TextView) r3);
        r4.click(R.id.userID, this.mOnClick);
        r4.click(R.id.iv_avatar, this.mOnClick);
    }

    @aa1
    public final String getAvatarUrl() {
        String r0 = this.avatarUrl;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("avatarUrl");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final ImageViewRound getIvAvatar() {
        ImageViewRound r0 = this.ivAvatar;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("ivAvatar");
        return null;
    }

    @tb1
    public final View.OnClickListener getMOnClick() {
        return this.mOnClick;
    }

    @aa1
    public final TextView getTvNickname() {
        TextView r0 = this.tvNickname;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tvNickname");
        return null;
    }

    @aa1
    public final TextView getUserID() {
        TextView r0 = this.userID;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO(SDKConstants.PARAM_USER_ID);
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        AppUser r3 = (AppUser) r1;
        getTvNickname().setText(r3.getNickname());
        i1O0OXO1O.OXO1.OXO1("initView " + r3.getNickname());
        setAvatarUrl(r3.getAvatarUrl());
        String r4 = r3.getIdentity();
        TextView r5 = getUserID();
        int r6 = 0;
        if (r4.length() != 0) goto L9;
        boolean r7 = true;
    L10:
        if (r7 == false) goto L12;
        r6 = 4;
    L12:
        r5.setVisibility(r6);
        if (r4.length() == 0) goto L20;
        TextView r8 = getUserID();
        if (r4 != null) goto L19;
        r4 = "UID:" + r4;
    L19:
        r8.setText(r4);
    L20:
        avatarShow();
        return;
    L9:
        r7 = false;
        goto L10
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.me_item_avatar;
    }

    @sf5(tag = I01XX0.iI)
    public final void onAvatarChange(@aa1 Object r33) {
        Intrinsics.X0O(r33, "data");
        LogUtils.d(new Object[]{"AvatarItem onAvatarChange"});
        a01 r1 = a01.OXO1;
        if (r1.IiI10X().getBoolean(b01.O001I, true) == false) goto L10;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L8;
        r3 = r4;
    L8:
        setAvatarUrl(((AppUser) r3).getAvatarUrl());
        downloadImage(uz0.OIi0(sz0.OXO1));
        return;
    L10:
        getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0.OXO1)));
        I01XX0.XIi00iiXO(I01XX0.iX1O1, null, 2, null);
    }

    @sf5(tag = I01XX0.X11iII1O1)
    public final void onNicknameChange(@aa1 String r4) {
        Intrinsics.X0O(r4, "nickname");
        getTvNickname().setText(r4);
        i1O0OXO1O.OXO1.OXO1("onNicknameChange " + r4);
    }

    @sf5(tag = I01XX0.X0iO)
    public final void onNoLoginChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"AvatarItem NoLogin Change"});
        initView();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"AvatarItem THEME_CHANGE"});
        initView();
    }

    public final void setAvatarUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.avatarUrl = r2;
    }

    public final void setIvAvatar(@aa1 ImageViewRound r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ivAvatar = r2;
    }

    public final void setMOnClick(@tb1 View.OnClickListener r1) {
        this.mOnClick = r1;
    }

    public final void setTvNickname(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tvNickname = r2;
    }

    public final void setUserID(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.userID = r2;
    }
}
