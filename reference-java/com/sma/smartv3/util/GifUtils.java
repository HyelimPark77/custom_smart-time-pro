package com.sma.smartv3.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.android.mltcode.paycertificationapi.aa1;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GifUtils {

    @aa1
    public static final GifUtils OXO1 = new GifUtils();

    public interface OXO1 {
        void OXO1();
    }

    public final void OXO1(@aa1 Context context, @aa1 Object model, final int i, @aa1 ImageView imageView, @aa1 final OXO1 listener) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(imageView, "imageView");
        Intrinsics.X0O(listener, "listener");
        Glide.with(context).asGif().load(model).diskCacheStrategy(DiskCacheStrategy.DATA).listener(new RequestListener<GifDrawable>() { // from class: com.sma.smartv3.util.GifUtils$play$1
            @Override // com.bumptech.glide.request.RequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public boolean onResourceReady(GifDrawable resource, Object model2, Target<GifDrawable> target, DataSource dataSource, boolean z) {
                Intrinsics.X0O(resource, "resource");
                Intrinsics.X0O(model2, "model");
                Intrinsics.X0O(dataSource, "dataSource");
                int i2 = i;
                if (i2 <= 0) {
                    return false;
                }
                try {
                    resource.setLoopCount(i2);
                    final GifUtils.OXO1 oxo1 = listener;
                    resource.registerAnimationCallback(new Animatable2Compat.AnimationCallback() { // from class: com.sma.smartv3.util.GifUtils$play$1$onResourceReady$1
                        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
                        public void onAnimationEnd(Drawable drawable) {
                            oxo1.OXO1();
                        }
                    });
                    return false;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<GifDrawable> target, boolean z) {
                Intrinsics.X0O(target, "target");
                return false;
            }
        }).into(imageView);
    }

    public final void XIi00iiXO(@aa1 Context context, @aa1 Object model, @aa1 ImageView imageView) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(imageView, "imageView");
        Glide.with(context).load(model).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(imageView);
    }
}
