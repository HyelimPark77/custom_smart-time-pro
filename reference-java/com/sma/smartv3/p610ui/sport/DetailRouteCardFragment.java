package com.sma.smartv3.p610ui.sport;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.amazon.device.ads.DtbConstants;
import com.android.mltcode.paycertificationapi.OO1010;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.xz3;
import com.baidu.mapapi.map.BaiduMap;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.android.gms.maps.GoogleMap;
import com.sma.smartv3.p610ui.sport.DetailRouteCardFragment;
import com.sma.smartv3.pro.R;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDetailRouteCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailRouteCardFragment.kt\ncom/sma/smartv3/ui/sport/DetailRouteCardFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
public final class DetailRouteCardFragment extends BaseDetailCardFragment {
    private boolean isGetSnapShot;

    @tb1
    private xz3 mSelectAvatarPopup;

    @aa1
    private final String TAG = "DetailRouteCardFragment";

    @aa1
    private final Lazy mCameraBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0i1I1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailRouteCardFragment.mCameraBtn_delegate$lambda$0(this.f2584IO);
        }
    });

    @aa1
    private final Lazy mRouteImgBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIOiii11X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailRouteCardFragment.mRouteImgBg_delegate$lambda$0(this.f3025IO);
        }
    });

    @aa1
    private final Lazy mRouteImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXXI10ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailRouteCardFragment.mRouteImg_delegate$lambda$0(this.f8398IO);
        }
    });

    @aa1
    private final Lazy mRouteDistanceLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI0XOi11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailRouteCardFragment.mRouteDistanceLayout_delegate$lambda$0(this.f2889IO);
        }
    });

    @aa1
    private final Lazy mRouteBtnLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX1II01XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailRouteCardFragment.mRouteBtnLayout_delegate$lambda$0(this.f1963IO);
        }
    });

    @aa1
    private final Lazy mCrop$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0X00OIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailRouteCardFragment.mCrop_delegate$lambda$0(this.f7416IO);
        }
    });

    public DetailRouteCardFragment() {
        setShowLineMarker(false);
        setGradient(false);
        setMMapLineColor(R.color.black);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convertWhiteToTransparent$lambda$0(DetailRouteCardFragment detailRouteCardFragment, Bitmap bitmap) {
        detailRouteCardFragment.getMRouteImg().setImageBitmap(bitmap);
        detailRouteCardFragment.goneMap();
    }

    private final ImageView getMCameraBtn() {
        return (ImageView) this.mCameraBtn$delegate.getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) this.mCrop$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSnapShot$lambda$0(final DetailRouteCardFragment detailRouteCardFragment, final Bitmap bitmap) {
        detailRouteCardFragment.isGetSnapShot = true;
        ThreadsKt.m39451iO(true, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.Xi100
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DetailRouteCardFragment.getSnapShot$lambda$0$0(this.f5216IO, bitmap);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSnapShot$lambda$0$0(DetailRouteCardFragment detailRouteCardFragment, Bitmap bitmap) {
        Intrinsics.XXI(bitmap);
        detailRouteCardFragment.convertWhiteToTransparent(bitmap);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSnapShot$lambda$1(final DetailRouteCardFragment detailRouteCardFragment, final Bitmap bitmap) {
        if (bitmap != null) {
            detailRouteCardFragment.isGetSnapShot = true;
            ThreadsKt.m39451iO(true, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.IiiI0I1O
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return DetailRouteCardFragment.getSnapShot$lambda$1$0$0(this.f2324IO, bitmap);
                }
            }, 30, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSnapShot$lambda$1$0$0(DetailRouteCardFragment detailRouteCardFragment, Bitmap bitmap) {
        detailRouteCardFragment.convertWhiteToTransparent(bitmap);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1(DetailRouteCardFragment detailRouteCardFragment, Uri it) throws IOException {
        Intrinsics.X0O(it, "it");
        i1Ii1i11X mCrop = detailRouteCardFragment.getMCrop();
        if (mCrop != null) {
            mCrop.O00(it, 1.0d, 0.8d, DtbConstants.DEFAULT_PLAYER_HEIGHT, 320);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mCameraBtn_delegate$lambda$0(DetailRouteCardFragment detailRouteCardFragment) {
        return (ImageView) detailRouteCardFragment.getMView().findViewById(R.id.share_card_map_camera);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i1Ii1i11X mCrop_delegate$lambda$0(DetailRouteCardFragment detailRouteCardFragment) {
        Context context = detailRouteCardFragment.getContext();
        if (context == null) {
            return null;
        }
        xz3 xz3Var = detailRouteCardFragment.mSelectAvatarPopup;
        ImageView mRouteImgBg = detailRouteCardFragment.getMRouteImgBg();
        Intrinsics.O10IXXX0X(mRouteImgBg, "<get-mRouteImgBg>(...)");
        return OO1010.OXO1(context, xz3Var, mRouteImgBg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mRouteBtnLayout_delegate$lambda$0(DetailRouteCardFragment detailRouteCardFragment) {
        return detailRouteCardFragment.getMView().findViewById(R.id.sport_detail_share_card_route_btn_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mRouteDistanceLayout_delegate$lambda$0(DetailRouteCardFragment detailRouteCardFragment) {
        return detailRouteCardFragment.getMView().findViewById(R.id.route_distance_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRouteImgBg_delegate$lambda$0(DetailRouteCardFragment detailRouteCardFragment) {
        return (ImageView) detailRouteCardFragment.getMView().findViewById(R.id.share_card_route_image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRouteImg_delegate$lambda$0(DetailRouteCardFragment detailRouteCardFragment) {
        return (ImageView) detailRouteCardFragment.getMView().findViewById(R.id.share_card_route_image_figure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$0(xz3 xz3Var, final DetailRouteCardFragment detailRouteCardFragment) {
        hr1.OXO1.iOOX010X(xz3Var.XO0O10(), new Function1() { // from class: com.android.mltcode.paycertificationapi.i1iI0iX0i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DetailRouteCardFragment.selectAvatar$lambda$0$0$0(this.f7716IO, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$0$0(DetailRouteCardFragment detailRouteCardFragment, boolean z) {
        if (z) {
            i1Ii1i11X mCrop = detailRouteCardFragment.getMCrop();
            Intrinsics.XXI(mCrop);
            mCrop.m2012iO();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$1(DetailRouteCardFragment detailRouteCardFragment) {
        i1Ii1i11X mCrop = detailRouteCardFragment.getMCrop();
        Intrinsics.XXI(mCrop);
        mCrop.OIX0iXi();
        return Unit.OXO1;
    }

    @aa1
    public final Bitmap convertWhiteToTransparent(@aa1 Bitmap img) {
        Intrinsics.X0O(img, "img");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " convertWhiteToTransparent");
        int width = img.getWidth();
        int height = img.getHeight();
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        int i = width * height;
        int[] iArr = new int[i];
        img.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            int iRed = Color.red(i3);
            int iGreen = Color.green(i3);
            int iBlue = Color.blue(i3);
            if (iRed > 235 && iGreen > 235 && iBlue > 220) {
                iArr[i2] = 0;
            } else if (iRed >= 50 || iGreen >= 235 || iBlue >= 150) {
                iArr[i2] = 0;
            } else {
                iArr[i2] = -1;
            }
        }
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " convertWhiteToTransparent OK");
        ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I11OXX1
            @Override // java.lang.Runnable
            public final void run() {
                DetailRouteCardFragment.convertWhiteToTransparent$lambda$0(this.f1353IO, bitmapCreateBitmap);
            }
        });
        return bitmapCreateBitmap;
    }

    public final View getMRouteBtnLayout() {
        return (View) this.mRouteBtnLayout$delegate.getValue();
    }

    public final View getMRouteDistanceLayout() {
        return (View) this.mRouteDistanceLayout$delegate.getValue();
    }

    public final ImageView getMRouteImg() {
        return (ImageView) this.mRouteImg$delegate.getValue();
    }

    public final ImageView getMRouteImgBg() {
        return (ImageView) this.mRouteImgBg$delegate.getValue();
    }

    public final void getSnapShot() {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.TAG + " getSnapShot");
        if (!this.isGetSnapShot || isLocationEmpty()) {
            if (isInChinaMainland()) {
                getMBaiDuMap().snapshot(new BaiduMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.ii0OXiO
                    @Override // com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback
                    public final void onSnapshotReady(Bitmap bitmap) {
                        DetailRouteCardFragment.getSnapShot$lambda$0(this.OXO1, bitmap);
                    }
                });
                return;
            }
            i1o0oxo1o.OXO1(this.TAG + " mGoogleMap.snapshot");
            getMGoogleMap().snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.iX1I1I0X
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    DetailRouteCardFragment.getSnapShot$lambda$1(this.OXO1, bitmap);
                }
            });
        }
    }

    @aa1
    public final String getTAG() {
        return this.TAG;
    }

    public final void goneMap() {
        if (isInChinaMainland()) {
            if (!isLocationEmpty() || getMBMapView() == null) {
                return;
            }
            getMBMapView().setVisibility(4);
            return;
        }
        if (!isLocationEmpty() || getMGMapView() == null) {
            return;
        }
        getMGMapView().setVisibility(4);
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseDetailCardFragment, com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getMRouteBtnLayout().setVisibility(8);
        getMCameraBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XiIII10i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5256IO.selectAvatar();
            }
        });
        if (q62.X0XI11I(q62.OXO1, getMWorkout().getMMode(), false, 2, null)) {
            getMRouteDistanceLayout().setVisibility(0);
        } else {
            getMRouteDistanceLayout().setVisibility(4);
        }
        i1Ii1i11X mCrop = getMCrop();
        if (mCrop != null) {
            mCrop.I0iXXO(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.ii1OI0i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DetailRouteCardFragment.initView$lambda$1(this.f8555IO, (Uri) obj);
                }
            });
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseDetailCardFragment, com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        super.initializedMapFinish();
        if (isInChinaMainland()) {
            getMBaiDuMap().setMapType(3);
        } else {
            getMGoogleMap().setMapType(0);
        }
    }

    public final boolean isGetSnapShot() {
        return this.isGetSnapShot;
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_share_card_route;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IOException {
        super.onActivityResult(i, i2, intent);
        i1Ii1i11X mCrop = getMCrop();
        Intrinsics.XXI(mCrop);
        mCrop.XOO0ii0(i, i2, intent, 1.0d, 0.8d, DtbConstants.DEFAULT_PLAYER_HEIGHT, 320);
    }

    public final void selectAvatar() {
        if (this.mSelectAvatarPopup == null) {
            final xz3 xz3Var = new xz3(getMActivity());
            xz3Var.m3321iX(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiiiOIiOX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return DetailRouteCardFragment.selectAvatar$lambda$0$0(xz3Var, this);
                }
            });
            xz3Var.i010I(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX1110ii1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return DetailRouteCardFragment.selectAvatar$lambda$0$1(this.f4974IO);
                }
            });
            this.mSelectAvatarPopup = xz3Var;
        }
        xz3 xz3Var2 = this.mSelectAvatarPopup;
        if (xz3Var2 != null) {
            xz3Var2.IIX1OXO();
        }
    }

    public final void setGetSnapShot(boolean z) {
        this.isGetSnapShot = z;
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseDetailCardFragment
    public void shareImage() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getShareCardView().getWidth(), getShareCardView().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        CardView shareCardView = getShareCardView();
        Intrinsics.O10IXXX0X(shareCardView, "<get-shareCardView>(...)");
        canvas.drawBitmap(xIi1i01O.XIi00iiXO(shareCardView), 0.0f, 0.0f, (Paint) null);
        Bitmap roundCorner = ImageUtils.toRoundCorner(bitmapCreateBitmap, getMBitmapRadius());
        Intrinsics.O10IXXX0X(roundCorner, "toRoundCorner(...)");
        ImageUtils.save(roundCorner, uz0.iOiXi11II(sz0.OXO1), Bitmap.CompressFormat.PNG);
        requireActivity().setResult(-1);
        requireActivity().finish();
    }
}
