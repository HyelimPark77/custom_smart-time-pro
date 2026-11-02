package com.sma.smartv3.p610ui.p612me.item;

import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
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
    private final boolean initEvent = true;
    public ImageViewRound ivAvatar;

    @tb1
    private View.OnClickListener mOnClick;
    public TextView tvNickname;
    public TextView userID;

    private final void downloadImage(File file) {
        if (getAvatarUrl().length() > 0) {
            NetWorkUtils.INSTANCE.getImage(getAvatarUrl(), file, new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.me.item.MainAvatarItem.downloadImage.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    I01XX0.XIi00iiXO(I01XX0.iX1O1, null, 2, null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                }
            });
        }
    }

    public final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 sz0Var = sz0.OXO1;
        if (!uz0.OIi0(sz0Var).exists()) {
            downloadImage(uz0.OIi0(sz0Var));
        } else {
            getIvAvatar().setVisibility(0);
            getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.iv_avatar);
        Intrinsics.XXI(viewM3483v);
        setIvAvatar((ImageViewRound) viewM3483v);
        View viewM3483v2 = itemHolder.m3483v(R.id.edt_nickname);
        Intrinsics.XXI(viewM3483v2);
        setTvNickname((TextView) viewM3483v2);
        View viewM3483v3 = itemHolder.m3483v(R.id.userID);
        Intrinsics.XXI(viewM3483v3);
        setUserID((TextView) viewM3483v3);
        itemHolder.click(R.id.userID, this.mOnClick);
        itemHolder.click(R.id.iv_avatar, this.mOnClick);
    }

    @aa1
    public final String getAvatarUrl() {
        String str = this.avatarUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.XXO("avatarUrl");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final ImageViewRound getIvAvatar() {
        ImageViewRound imageViewRound = this.ivAvatar;
        if (imageViewRound != null) {
            return imageViewRound;
        }
        Intrinsics.XXO("ivAvatar");
        return null;
    }

    @tb1
    public final View.OnClickListener getMOnClick() {
        return this.mOnClick;
    }

    @aa1
    public final TextView getTvNickname() {
        TextView textView = this.tvNickname;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO("tvNickname");
        return null;
    }

    @aa1
    public final TextView getUserID() {
        TextView textView = this.userID;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO(SDKConstants.PARAM_USER_ID);
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        getTvNickname().setText(appUser2.getNickname());
        i1O0OXO1O.OXO1.OXO1("initView " + appUser2.getNickname());
        setAvatarUrl(appUser2.getAvatarUrl());
        String identity = appUser2.getIdentity();
        getUserID().setVisibility(identity.length() == 0 ? 4 : 0);
        if (identity.length() != 0) {
            TextView userID = getUserID();
            if (identity == null) {
                identity = "UID:" + identity;
            }
            userID.setText(identity);
        }
        avatarShow();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.me_item_avatar;
    }

    @sf5(tag = I01XX0.f1093iI)
    public final void onAvatarChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("AvatarItem onAvatarChange");
        a01 a01Var = a01.OXO1;
        if (!a01Var.IiI10X().getBoolean(b01.O001I, true)) {
            getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0.OXO1)));
            I01XX0.XIi00iiXO(I01XX0.iX1O1, null, 2, null);
            return;
        }
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        setAvatarUrl(((AppUser) appUser).getAvatarUrl());
        downloadImage(uz0.OIi0(sz0.OXO1));
    }

    @sf5(tag = I01XX0.X11iII1O1)
    public final void onNicknameChange(@aa1 String nickname) {
        Intrinsics.X0O(nickname, "nickname");
        getTvNickname().setText(nickname);
        i1O0OXO1O.OXO1.OXO1("onNicknameChange " + nickname);
    }

    @sf5(tag = I01XX0.X0iO)
    public final void onNoLoginChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("AvatarItem NoLogin Change");
        initView();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("AvatarItem THEME_CHANGE");
        initView();
    }

    public final void setAvatarUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.avatarUrl = str;
    }

    public final void setIvAvatar(@aa1 ImageViewRound imageViewRound) {
        Intrinsics.X0O(imageViewRound, "<set-?>");
        this.ivAvatar = imageViewRound;
    }

    public final void setMOnClick(@tb1 View.OnClickListener onClickListener) {
        this.mOnClick = onClickListener;
    }

    public final void setTvNickname(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.tvNickname = textView;
    }

    public final void setUserID(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.userID = textView;
    }
}
