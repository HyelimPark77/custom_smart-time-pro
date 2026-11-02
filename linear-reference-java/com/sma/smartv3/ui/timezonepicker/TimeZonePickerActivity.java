package com.sma.smartv3.ui.timezonepicker;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.l4digital.fastscroll.FastScrollRecyclerView;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.sma.smartv3.pro.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZonePickerActivity extends BaseActivity implements MaterialSearchView.I0IIOi {
    private static final boolean DEBUG = false;
    public static final String EXTRA_RESULT_SELECTION = "extra_result_selection";
    private static final String TAG = "TimeZonePickerActivity";
    private com.sma.smartv3.ui.timezonepicker.OXO1 adapter;
    private boolean allSelected;
    private Integer animationCloseEnter;
    private Integer animationCloseExit;
    private TimeZonePicker.Builder builder;
    private LinearLayout controlPanel;
    private ThreadUtils.SimpleTask loadTask;
    private ArrayList<TimeZoneInfo> mTimeZones;
    private ProgressBar progressBar;
    private ProgressBar progressBarAsnc;
    private FastScrollRecyclerView recyclerView;
    private MenuItem searchMenuItem;
    private MaterialSearchView searchView;
    private Toolbar toolbar;
    private TextView tvNoData;
    private TextView tvSelectAll;
    private TextView tvSelectBtn;

    public class OXO1 implements com.sma.smartv3.ui.timezonepicker.OXO1.iO {
        public final /* synthetic */ TimeZonePickerActivity OXO1;

        public OXO1(final TimeZonePickerActivity this$0) {
            this.OXO1 = this$0;
        }

        @Override // com.sma.smartv3.ui.timezonepicker.OXO1.iO
        public void OXO1(TimeZoneInfo timezone, int totalSelectedTimeZones) {
            TimeZonePickerActivity.XiOIii1(this.OXO1, totalSelectedTimeZones);
            if (TimeZonePickerActivity.XXI(this.OXO1).selectionMode != 1) goto L6;
            ArrayList r3 = new ArrayList();
            r3.add(timezone);
            TimeZonePickerActivity.XX0(this.OXO1, r3);
            return;
        }
    }

    public class XIi00iiXO implements View.OnClickListener {
        public final /* synthetic */ TimeZonePickerActivity IO;

        public XIi00iiXO(final TimeZonePickerActivity this$0) {
            this.IO = this$0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimeZonePickerActivity r2 = this.IO;
            TimeZonePickerActivity.XX0(r2, TimeZonePickerActivity.OIX0iXi(r2).I0iXXO());
        }
    }

    public class XO0O10 extends ThreadUtils.SimpleTask<Object> {
        public final /* synthetic */ TimeZonePickerActivity IO;

        public XO0O10(final TimeZonePickerActivity this$0) {
            this.IO = this$0;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Object doInBackground() {
            TimeZonePickerActivity r0 = this.IO;
            TimeZonePickerActivity.OiIIX101O(r0, r0);
            Collections.sort(TimeZonePickerActivity.X1ii(this.IO));
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Object result) {
            if (TimeZonePickerActivity.X1ii(this.IO).size() != 0) goto L6;
            TimeZonePickerActivity.IIX1OXO(this.IO).setVisibility(0);
        L6:
            if (TimeZonePickerActivity.OIX0iXi(this.IO) == null) goto L11;
            if (TimeZonePickerActivity.XXI(this.IO).loadingMode != 1) goto L11;
            TimeZonePickerActivity.OIX0iXi(this.IO).notifyDataSetChanged();
        L11:
            if (TimeZonePickerActivity.OIX0iXi(this.IO) == null) goto L13;
            TimeZonePickerActivity r4 = this.IO;
            TimeZonePickerActivity.XiOIii1(r4, TimeZonePickerActivity.OIX0iXi(r4).XXI());
        L13:
            TimeZonePickerActivity.O10IXXX0X(this.IO).setVisibility(8);
            TimeZonePickerActivity.X0O(this.IO).setVisibility(8);
            TimeZonePickerActivity.I1XOi1(this.IO).setVisibility(0);
            TimeZonePickerActivity.XiOIO(this.IO).setEnabled(true);
        }
    }

    public class iO implements View.OnClickListener {
        public final /* synthetic */ TimeZonePickerActivity IO;

        public iO(final TimeZonePickerActivity this$0) {
            this.IO = this$0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimeZonePickerActivity r3 = this.IO;
            TimeZonePickerActivity.iIiiO(r3, !TimeZonePickerActivity.I0iXXO(r3));
            if (TimeZonePickerActivity.OIX0iXi(this.IO) == null) goto L6;
            TimeZonePickerActivity.OIX0iXi(this.IO).setAllSelected(TimeZonePickerActivity.I0iXXO(this.IO));
        L6:
            if (TimeZonePickerActivity.I0iXXO(this.IO) == false) goto L9;
            TimeZonePickerActivity.XiOIO(this.IO).setText(this.IO.getString(R.string.text_unselect_all));
            return;
        L9:
            TimeZonePickerActivity.XiOIO(this.IO).setText(this.IO.getString(R.string.text_select_all));
        }
    }

    public TimeZonePickerActivity() {
        this.mTimeZones = new ArrayList();
        this.allSelected = false;
    }

    public static /* bridge */ /* synthetic */ boolean I0iXXO(TimeZonePickerActivity r0) {
        return r0.allSelected;
    }

    public static /* bridge */ /* synthetic */ FastScrollRecyclerView I1XOi1(TimeZonePickerActivity r0) {
        return r0.recyclerView;
    }

    public static /* bridge */ /* synthetic */ TextView IIX1OXO(TimeZonePickerActivity r0) {
        return r0.tvNoData;
    }

    public static /* bridge */ /* synthetic */ ProgressBar O10IXXX0X(TimeZonePickerActivity r0) {
        return r0.progressBar;
    }

    public static /* bridge */ /* synthetic */ com.sma.smartv3.ui.timezonepicker.OXO1 OIX0iXi(TimeZonePickerActivity r0) {
        return r0.adapter;
    }

    public static /* bridge */ /* synthetic */ void OiIIX101O(TimeZonePickerActivity r0, Context r1) {
        r0.loadTzsInZoneTab(r1);
    }

    public static /* bridge */ /* synthetic */ ProgressBar X0O(TimeZonePickerActivity r0) {
        return r0.progressBarAsnc;
    }

    public static /* bridge */ /* synthetic */ ArrayList X1ii(TimeZonePickerActivity r0) {
        return r0.mTimeZones;
    }

    public static /* bridge */ /* synthetic */ void XX0(TimeZonePickerActivity r0, List r1) {
        r0.finishPicking(r1);
    }

    public static /* bridge */ /* synthetic */ TimeZonePicker.Builder XXI(TimeZonePickerActivity r0) {
        return r0.builder;
    }

    public static /* bridge */ /* synthetic */ TextView XiOIO(TimeZonePickerActivity r0) {
        return r0.tvSelectAll;
    }

    public static /* bridge */ /* synthetic */ void XiOIii1(TimeZonePickerActivity r0, int r1) {
        r0.updateSelectBarContents(r1);
    }

    private void finishPicking(List<TimeZoneInfo> selectedTimeZones) {
        Intent r0 = new Intent();
        r0.putExtra("extra_result_selection", TimeZonePicker.OXO1(selectedTimeZones));
        setResult(-1, r0);
        finish();
        overrideAnimation();
    }

    private String getCountryNames(String lang, String countryCode) {
        Locale r0 = Locale.getDefault();
        String r3 = new Locale(lang, countryCode).getDisplayCountry(r0);
        if (countryCode.equals(r3) == true) goto L5;
        return r3;
    L5:
        return countryCode;
    }

    private int getIdenticalTimeZoneInTheCountry(TimeZoneInfo timeZoneInfo) {
        Iterator<TimeZoneInfo> r0 = this.mTimeZones.iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L16;
        TimeZoneInfo r2 = r0.next();
        if (r2.hasSameRules(timeZoneInfo) == false) goto L15;
        if (r2.getCountry() != null) goto L13;
        if (timeZoneInfo.getCountry() != null) goto L15;
    L14:
        return r1;
    L13:
        if (r2.getCountry().equals(timeZoneInfo.getCountry()) == true) goto L14;
    L15:
        r1 = r1 + 1;
        goto L4
    L16:
        return -1;
    }

    public static /* bridge */ /* synthetic */ void iIiiO(TimeZonePickerActivity r0, boolean r1) {
        r0.allSelected = r1;
    }

    private void initialiseUI(TimeZonePicker.Builder builder) {
        setSupportActionBar(this.toolbar);
        setOnQueryTextListener(this);
        this.animationCloseEnter = builder.animationCloseEnter;
        this.animationCloseExit = builder.animationCloseExit;
        int r0 = builder.bubbleColor;
        if (r0 == 0) goto L5;
        setBubbleColor(r0);
    L5:
        int r1 = builder.handleColor;
        if (r1 == 0) goto L8;
        setHandleColor(r1);
    L8:
        int r2 = builder.bubbleTextColor;
        if (r2 == 0) goto L11;
        setBubbleTextColor(r2);
    L11:
        int r3 = builder.trackColor;
        if (r3 == 0) goto L14;
        setTrackColor(r3);
    L14:
        setHideScrollbar(builder.hideScrollbar);
        setTrackVisible(builder.showTrack);
        if (builder.selectionMode != 1) goto L17;
        this.controlPanel.setVisibility(8);
    L18:
        String r4 = builder.titleText;
        if (r4 == null) goto L22;
        setTitle(r4);
        return;
    L22:
        return;
    L17:
        this.controlPanel.setVisibility(0);
        goto L18
    }

    private void loadData() {
        this.tvSelectAll.setEnabled(false);
        if (this.builder.loadingMode != 0) goto L5;
        this.progressBarAsnc.setVisibility(0);
        setVisibility(4);
    L6:
        XO0O10 r0 = new XO0O10(this);
        this.loadTask = r0;
        ThreadUtils.executeByIo(r0);
        return;
    L5:
        this.progressBar.setVisibility(0);
        setVisibility(4);
        goto L6
    }

    private void loadTzsInZoneTab(Context context) {
        AssetManager r1 = context.getAssets();
        InputStream r2 = null;
        String r3 = Locale.getDefault().getLanguage();     // Catch: Throwable -> L11 IOException -> L26
        r2 = r1.open("zone.tab");     // Catch: Throwable -> L11 IOException -> L26
        BufferedReader r4 = new BufferedReader(new InputStreamReader(r2));     // Catch: Throwable -> L11 IOException -> L26
    L4:
        String r5 = r4.readLine();     // Catch: Throwable -> L11 IOException -> L26
        if (r5 == null) goto L22;
        if (r5.startsWith(qu0.XO0O10) == true) goto L4;
        String[] r6 = r5.split("\t");     // Catch: Throwable -> L11 IOException -> L26
        String r7 = r6[2];     // Catch: Throwable -> L11 IOException -> L26
        String r8 = r6[0];     // Catch: Throwable -> L11 IOException -> L26
        TimeZone r9 = TimeZone.getTimeZone(r7);     // Catch: Throwable -> L11 IOException -> L26
        if (r9 == null) goto L10;
        if (r8 != null) goto L17;
        if (r7.startsWith("Etc/GMT") == false) goto L4;
    L17:
        TimeZoneInfo r10 = new TimeZoneInfo(context, r9, getCountryNames(r3, r8));     // Catch: Throwable -> L11 IOException -> L26
        if (getIdenticalTimeZoneInTheCountry(r10) != (-1)) goto L4;
        this.mTimeZones.add(r10);     // Catch: Throwable -> L11 IOException -> L26
        if (this.builder.selectedItems.contains(r10.getCityName()) == false) goto L4;
        this.adapter.X1ii(r10.getCityName());     // Catch: Throwable -> L11 IOException -> L26
        goto L4
    L10:
        Log.e(TAG, "Timezone not found: " + r7);     // Catch: Throwable -> L11 IOException -> L26
        goto L4
    L22:
        TimeZoneInfo r11 = new TimeZoneInfo(context, TimeZone.getTimeZone("America/Los_Angeles"), getString(R.string.las_vegas));     // Catch: Throwable -> L11 IOException -> L26
        r11.setCityName(getString(R.string.las_vegas));     // Catch: Throwable -> L11 IOException -> L26
        this.mTimeZones.add(r11);     // Catch: Throwable -> L11 IOException -> L26
        if (r2 == null) goto L56;
        r2.close();     // Catch: IOException -> L33
        return;
    L56:
        return;
    L11:
        th = move-exception;
        if (r2 != null) goto L36;
    L32:
        throw th;
    L36:
        r2.close();     // Catch: IOException -> L34
    L26:
        Log.e(TAG, "Failed to read 'zone.tab'.");     // Catch: Throwable -> L11
        if (r2 == null) goto L57;
        r2.close();     // Catch: IOException -> L33
        return;
    L57:
        return;
    }

    private void overrideAnimation() {
        Integer r0 = this.animationCloseEnter;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.animationCloseExit == null) goto L9;
        overridePendingTransition(r0.intValue(), this.animationCloseExit.intValue());
        return;
    }

    private void setSearchIconColor(MenuItem menuItem, final Integer color) {
        if (color == null) goto L7;
        Drawable r0 = menuItem.getIcon();
        if (r0 == null) goto L8;
        Drawable r1 = DrawableCompat.wrap(r0);
        DrawableCompat.setTint(r1.mutate(), color.intValue());
        menuItem.setIcon(r1);
        return;
    L8:
        return;
    }

    private void updateSelectBarContents(int totalSelectedTimeZones) {
        TextView r0 = this.tvSelectBtn;
        if (totalSelectedTimeZones <= 0) goto L5;
        boolean r1 = true;
    L6:
        r0.setEnabled(r1);
        if (totalSelectedTimeZones > 0) goto L9;
        this.tvSelectBtn.setText(getString(R.string.text_done));
        return;
    L9:
        if (this.builder.maxSelectCount != 0) goto L12;
        this.tvSelectBtn.setText(getString(R.string.text_done_1, new Object[]{String.valueOf(totalSelectedTimeZones)}));
        return;
    L12:
        this.tvSelectBtn.setText(getString(R.string.text_done_2, new Object[]{String.valueOf(totalSelectedTimeZones), String.valueOf(this.builder.maxSelectCount)}));
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle savedInstanceState) {
        Intent r2 = getIntent();
        if (r2 != null) goto L5;
        return;
    L5:
        TimeZonePicker.Builder r3 = (TimeZonePicker.Builder) r2.getSerializableExtra("builder");
        this.builder = r3;
        setTheme(r3.theme);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.searchView = (MaterialSearchView) findViewById(R.id.search_view);
        this.controlPanel = (LinearLayout) findViewById(R.id.controlPanel);
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        this.progressBarAsnc = (ProgressBar) findViewById(R.id.progressBar_async);
        this.tvSelectAll = (TextView) findViewById(R.id.tvSelectAll);
        this.tvSelectBtn = (TextView) findViewById(R.id.tvSelect);
        this.tvNoData = (TextView) findViewById(R.id.tvNoData);
        this.recyclerView = (FastScrollRecyclerView) findViewById(R.id.recyclerView);
        initialiseUI(this.builder);
        if (this.builder.maxSelectCount == 0) goto L6;
        this.tvSelectAll.setVisibility(8);
    L6:
        if (getSupportActionBar() == null) goto L8;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    L8:
        setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new com.sma.smartv3.ui.timezonepicker.OXO1(this.builder, this.mTimeZones, new OXO1(this));
        loadData();
        setAdapter(this.adapter);
        this.tvSelectBtn.setOnClickListener(new XIi00iiXO(this));
        this.tvSelectAll.setOnClickListener(new iO(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_timezone_picker;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pick_menu_main, menu);
        MenuItem r3 = menu.findItem(R.id.mcp_action_search);
        this.searchMenuItem = r3;
        setSearchIconColor(r3, this.builder.searchIconColor);
        setMenuItem(this.searchMenuItem);
        return true;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ThreadUtils.SimpleTask r0 = this.loadTask;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isDone() == true) goto L9;
        LogUtils.d(new Object[]{"Cancel loadTask"});
        ThreadUtils.cancel(this.loadTask);
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (XiOIO() == false) goto L6;
        XXI();
        return;
    L6:
        super.onHandleBackPressed();
        overrideAnimation();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) goto L7;
        setResult(0);
        finish();
        overrideAnimation();
    L7:
        return super.onOptionsItemSelected(item);
    }

    @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
    public boolean onQueryTextChange(String newText) {
        com.sma.smartv3.ui.timezonepicker.OXO1 r0 = this.adapter;
        if (r0 == null) goto L7;
        r0.filterOnText(newText);
        return false;
    L7:
        return false;
    }

    @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
    public boolean onQueryTextSubmit(String query) {
        com.sma.smartv3.ui.timezonepicker.OXO1 r0 = this.adapter;
        if (r0 == null) goto L7;
        r0.filterOnText(query);
        return false;
    L7:
        return false;
    }
}
