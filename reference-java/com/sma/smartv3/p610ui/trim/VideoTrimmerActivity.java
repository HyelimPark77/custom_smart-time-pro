package com.sma.smartv3.p610ui.trim;

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
import com.sma.smartv3.p610ui.trim.view.VideoTrimmerView;
import com.sma.smartv3.pro.R;
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

    private ProgressDialog buildDialog(String msg) {
        if (this.mProgressDialog == null) {
            this.mProgressDialog = ProgressDialog.show(this, "", msg);
        }
        this.mProgressDialog.setMessage(msg);
        return this.mProgressDialog;
    }

    public static void call(FragmentActivity from, String videoPath, int cropWidth, int cropHeight, int totalCount) {
        if (TextUtils.isEmpty(videoPath)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(VIDEO_PATH_KEY, videoPath);
        bundle.putInt(CROP_WIDTH_KEY, cropWidth);
        bundle.putInt(CROP_HEIGHT_KEY, cropHeight);
        bundle.putInt(TOTAL_COUNT_KEY, totalCount);
        Intent intent = new Intent(from, (Class<?>) VideoTrimmerActivity.class);
        intent.putExtras(bundle);
        from.startActivityForResult(intent, 1);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle savedInstanceState) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setStatusBarColor(this, getResources().getColor(R.color.black));
        setNavBarColor(this, getResources().getColor(R.color.black));
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString(VIDEO_PATH_KEY) : "";
        VideoTrimmerView videoTrimmerView = (VideoTrimmerView) findViewById(R.id.trimmer_view);
        this.trimmerView = videoTrimmerView;
        videoTrimmerView.setOnTrimVideoListener(this);
        i1O0OXO1O.OXO1.OXO1("VideoTrimmer initView -> path = " + string);
        this.trimmerView.O1O(Uri.parse(string));
        this.trimmerView.IXXOO(extras.getInt(CROP_WIDTH_KEY, 300), extras.getInt(CROP_HEIGHT_KEY, 300), extras.getInt(TOTAL_COUNT_KEY, 10));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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
        if (this.mProgressDialog.isShowing()) {
            this.mProgressDialog.dismiss();
        }
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
