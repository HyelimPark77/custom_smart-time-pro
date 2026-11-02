package com.sma.smartv3.p610ui.device;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iO0O1OIIi;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ScreenUtils;
import com.bumptech.glide.Glide;
import com.sma.smartv3.p610ui.device.GalleryActivity;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GalleryActivity extends BaseActivity {

    @aa1
    private final Lazy viewPager$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiIXiX11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GalleryActivity.viewPager_delegate$lambda$0(this.f1905IO);
        }
    });

    @aa1
    private final List<Uri> mUris = iO0O1OIIi.OXO1();
    private final int mWidth = ScreenUtils.getAppScreenWidth();
    private final int mHeight = ScreenUtils.getAppScreenHeight();

    private final ViewPager getViewPager() {
        return (ViewPager) this.viewPager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewPager viewPager_delegate$lambda$0(GalleryActivity galleryActivity) {
        return (ViewPager) galleryActivity.findViewById(R.id.view_pager);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getViewPager().setAdapter(new PagerAdapter() { // from class: com.sma.smartv3.ui.device.GalleryActivity.initView.1
            @Override // androidx.viewpager.widget.PagerAdapter
            public void destroyItem(ViewGroup container, int i, Object object) {
                Intrinsics.X0O(container, "container");
                Intrinsics.X0O(object, "object");
                container.removeView((View) object);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return GalleryActivity.this.mUris.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public Object instantiateItem(ViewGroup container, int i) {
                Intrinsics.X0O(container, "container");
                ImageView imageView = new ImageView(GalleryActivity.this.getMContext());
                GalleryActivity galleryActivity = GalleryActivity.this;
                Glide.with((FragmentActivity) galleryActivity).load((Uri) galleryActivity.mUris.get(i)).override(galleryActivity.mWidth / 2, galleryActivity.mHeight / 2).into(imageView);
                container.addView(imageView);
                return imageView;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public boolean isViewFromObject(View view, Object object) {
                Intrinsics.X0O(view, "view");
                Intrinsics.X0O(object, "object");
                return view == object;
            }
        });
        getViewPager().setCurrentItem(getMArg1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_gallery;
    }
}
