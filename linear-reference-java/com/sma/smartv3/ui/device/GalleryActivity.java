package com.sma.smartv3.ui.device;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.IOiIXiX11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iO0O1OIIi;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ScreenUtils;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes18.dex */
public final class GalleryActivity extends BaseActivity {
    private final int mHeight;

    @aa1
    private final List<Uri> mUris;
    private final int mWidth;

    @aa1
    private final Lazy viewPager$delegate;

    public GalleryActivity() {
        this.viewPager$delegate = LazyKt__LazyJVMKt.iO(new IOiIXiX11(this));
        this.mUris = iO0O1OIIi.OXO1();
        this.mWidth = ScreenUtils.getAppScreenWidth();
        this.mHeight = ScreenUtils.getAppScreenHeight();
    }

    public static /* synthetic */ ViewPager OIX0iXi(GalleryActivity r0) {
        return viewPager_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ Activity access$getMContext(GalleryActivity r0) {
        return r0.getMContext();
    }

    public static final /* synthetic */ int access$getMHeight$p(GalleryActivity r0) {
        return r0.mHeight;
    }

    public static final /* synthetic */ List access$getMUris$p(GalleryActivity r0) {
        return r0.mUris;
    }

    public static final /* synthetic */ int access$getMWidth$p(GalleryActivity r0) {
        return r0.mWidth;
    }

    private final ViewPager getViewPager() {
        return (ViewPager) getValue();
    }

    private static final ViewPager viewPager_delegate$lambda$0(GalleryActivity r1) {
        return (ViewPager) r1.findViewById(R.id.view_pager);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getViewPager().setAdapter(new AnonymousClass1(this));
        getViewPager().setCurrentItem(getMArg1());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_gallery;
    }
}
