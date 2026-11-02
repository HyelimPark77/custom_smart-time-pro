package com.sma.smartv3.ui.trim.view;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.VideoView;
import com.amazon.device.ads.DtbConstants;

/* JADX INFO: loaded from: classes3.dex */
public class ZVideoView extends VideoView {
    public int I1;
    public int IO;
    public int X11iII1O1;
    public int iX1O1;

    public ZVideoView(Context context) {
        super(context);
        this.IO = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.I1 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
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
        MediaMetadataRetriever r0 = new MediaMetadataRetriever();
        r0.setDataSource(uri.getPath());     // Catch: Exception -> L10
    L4:
        String r3 = r0.extractMetadata(19);
        String r1 = r0.extractMetadata(18);
        this.X11iII1O1 = Integer.parseInt(r3);     // Catch: NumberFormatException -> L7
        this.iX1O1 = Integer.parseInt(r1);     // Catch: NumberFormatException -> L7
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
    }

    public ZVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.IO = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.I1 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.iX1O1 = 1;
        this.X11iII1O1 = 1;
    }

    public ZVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.IO = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.I1 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        this.iX1O1 = 1;
        this.X11iII1O1 = 1;
    }
}
