package com.sma.smartv3.ui.trim;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.zf6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.trim.view.VideoTrimmerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class VideoTrimmerActivity extends BaseActivity implements zf6 {
    private static final String CROP_HEIGHT_KEY = "crop_height_key";
    private static final String CROP_WIDTH_KEY = "crop_width_key";
    public static final String INTERVAL_KEY = "interval";
    private static final String TOTAL_COUNT_KEY = "total_count_key";
    public static final String URLS_KEY = "urls";
    private static final String VIDEO_PATH_KEY = "video-file-path";
    public static final int VIDEO_TRIM_REQUEST_CODE = 1;
    private ProgressDialog mProgressDialog;
    private VideoTrimmerView trimmerView;

    public VideoTrimmerActivity() {
    }

    private ProgressDialog buildDialog(String msg) {
        if (this.mProgressDialog != null) goto L5;
        this.mProgressDialog = ProgressDialog.show(this, "", msg);
    L5:
        this.mProgressDialog.setMessage(msg);
        return this.mProgressDialog;
    }

    public static void call(FragmentActivity from, String videoPath, int cropWidth, int cropHeight, int totalCount) {
        if (TextUtils.isEmpty(videoPath) == true) goto L6;
        Bundle r0 = new Bundle();
        r0.putString(VIDEO_PATH_KEY, videoPath);
        r0.putInt(CROP_WIDTH_KEY, cropWidth);
        r0.putInt(CROP_HEIGHT_KEY, cropHeight);
        r0.putInt(TOTAL_COUNT_KEY, totalCount);
        Intent r3 = new Intent(from, VideoTrimmerActivity.class);
        r3.putExtras(r0);
        from.startActivityForResult(r3, 1);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle savedInstanceState) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setStatusBarColor(this, getResources().getColor(R.color.black));
        setNavBarColor(this, getResources().getColor(R.color.black));
        Bundle r0 = getIntent().getExtras();
        if (r0 == null) goto L5;
        String r1 = r0.getString(VIDEO_PATH_KEY);
    L6:
        VideoTrimmerView r2 = (VideoTrimmerView) findViewById(R.id.trimmer_view);
        this.trimmerView = r2;
        r2.setOnTrimVideoListener(this);
        i1O0OXO1O.OXO1.OXO1("VideoTrimmer initView -> path = " + r1);
        this.trimmerView.O1O(Uri.parse(r1));
        this.trimmerView.IXXOO(r0.getInt(CROP_WIDTH_KEY, 300), r0.getInt(CROP_HEIGHT_KEY, 300), r0.getInt(TOTAL_COUNT_KEY, 10));
        return;
    L5:
        r1 = "";
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_video_trim;
    }

    @Override // com.android.mltcode.paycertificationapi.zf6
    public void onCancel() {
        this.trimmerView.onDestroy();
        finish();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.trimmerView.onDestroy();
    }

    @Override // com.android.mltcode.paycertificationapi.zf6
    public void onFinishTrim(ArrayList<String> urls, int interval) {
        if (this.mProgressDialog.isShowing() == false) goto L5;
        this.mProgressDialog.dismiss();
    L5:
        setResult(-1, new Intent().putStringArrayListExtra(URLS_KEY, urls).putExtra(INTERVAL_KEY, interval));
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.trimmerView.iX1O1();
        this.trimmerView.setRestoreState(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.android.mltcode.paycertificationapi.zf6
    public void onStartTrim() {
        buildDialog("").show();
    }
}
