package com.sma.smartv3.p610ui.trim.view;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.VideoView;
import com.amazon.device.ads.DtbConstants;

/* JADX INFO: loaded from: classes3.dex */
public class ZVideoView extends VideoView {

    /* JADX INFO: renamed from: I1 */
    public int f54891I1;

    /* JADX INFO: renamed from: IO */
    public int f54892IO;
    public int X11iII1O1;
    public int iX1O1;

    public ZVideoView(Context context) {
        super(context);
        this.f54892IO = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.f54891I1 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.iX1O1 = 1;
        this.X11iII1O1 = 1;
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.widget.VideoView
    public void setVideoURI(Uri uri) {
        super.setVideoURI(uri);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(uri.getPath());
        } catch (Exception unused) {
        }
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
        try {
            this.X11iII1O1 = Integer.parseInt(strExtractMetadata);
            this.iX1O1 = Integer.parseInt(strExtractMetadata2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public ZVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f54892IO = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.f54891I1 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.iX1O1 = 1;
        this.X11iII1O1 = 1;
    }

    public ZVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f54892IO = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.f54891I1 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.iX1O1 = 1;
        this.X11iII1O1 = 1;
    }
}
