package com.sma.smartv3.p610ui.timezonepicker;

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
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZonePickerActivity extends BaseActivity implements MaterialSearchView.I0IIOi {
    private static final boolean DEBUG = false;
    public static final String EXTRA_RESULT_SELECTION = "extra_result_selection";
    private static final String TAG = "TimeZonePickerActivity";
    private com.sma.smartv3.p610ui.timezonepicker.OXO1 adapter;
    private Integer animationCloseEnter;
    private Integer animationCloseExit;
    private TimeZonePicker.Builder builder;
    private LinearLayout controlPanel;
    private ThreadUtils.SimpleTask loadTask;
    private ProgressBar progressBar;
    private ProgressBar progressBarAsnc;
    private FastScrollRecyclerView recyclerView;
    private MenuItem searchMenuItem;
    private MaterialSearchView searchView;
    private Toolbar toolbar;
    private TextView tvNoData;
    private TextView tvSelectAll;
    private TextView tvSelectBtn;
    private ArrayList<TimeZoneInfo> mTimeZones = new ArrayList<>();
    private boolean allSelected = false;

    public class OXO1 implements com.sma.smartv3.p610ui.timezonepicker.OXO1.InterfaceC18989iO {
        public OXO1() {
        }

        @Override // com.sma.smartv3.p610ui.timezonepicker.OXO1.InterfaceC18989iO
        public void OXO1(TimeZoneInfo timezone, int totalSelectedTimeZones) {
            TimeZonePickerActivity.this.updateSelectBarContents(totalSelectedTimeZones);
            if (TimeZonePickerActivity.this.builder.selectionMode == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(timezone);
                TimeZonePickerActivity.this.finishPicking(arrayList);
            }
        }
    }

    public class XIi00iiXO implements View.OnClickListener {
        public XIi00iiXO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimeZonePickerActivity timeZonePickerActivity = TimeZonePickerActivity.this;
            timeZonePickerActivity.finishPicking(timeZonePickerActivity.adapter.I0iXXO());
        }
    }

    public class XO0O10 extends ThreadUtils.SimpleTask<Object> {
        public XO0O10() {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Object doInBackground() {
            TimeZonePickerActivity timeZonePickerActivity = TimeZonePickerActivity.this;
            timeZonePickerActivity.loadTzsInZoneTab(timeZonePickerActivity);
            Collections.sort(TimeZonePickerActivity.this.mTimeZones);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Object result) {
            if (TimeZonePickerActivity.this.mTimeZones.size() == 0) {
                TimeZonePickerActivity.this.tvNoData.setVisibility(0);
            }
            if (TimeZonePickerActivity.this.adapter != null && TimeZonePickerActivity.this.builder.loadingMode == 1) {
                TimeZonePickerActivity.this.adapter.notifyDataSetChanged();
            }
            if (TimeZonePickerActivity.this.adapter != null) {
                TimeZonePickerActivity timeZonePickerActivity = TimeZonePickerActivity.this;
                timeZonePickerActivity.updateSelectBarContents(timeZonePickerActivity.adapter.XXI());
            }
            TimeZonePickerActivity.this.progressBar.setVisibility(8);
            TimeZonePickerActivity.this.progressBarAsnc.setVisibility(8);
            TimeZonePickerActivity.this.recyclerView.setVisibility(0);
            TimeZonePickerActivity.this.tvSelectAll.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.timezonepicker.TimeZonePickerActivity$iO */
    public class ViewOnClickListenerC18990iO implements View.OnClickListener {
        public ViewOnClickListenerC18990iO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimeZonePickerActivity timeZonePickerActivity = TimeZonePickerActivity.this;
            timeZonePickerActivity.allSelected = !timeZonePickerActivity.allSelected;
            if (TimeZonePickerActivity.this.adapter != null) {
                TimeZonePickerActivity.this.adapter.setAllSelected(TimeZonePickerActivity.this.allSelected);
            }
            if (TimeZonePickerActivity.this.allSelected) {
                TimeZonePickerActivity.this.tvSelectAll.setText(TimeZonePickerActivity.this.getString(R.string.text_unselect_all));
            } else {
                TimeZonePickerActivity.this.tvSelectAll.setText(TimeZonePickerActivity.this.getString(R.string.text_select_all));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishPicking(List<TimeZoneInfo> selectedTimeZones) {
        Intent intent = new Intent();
        intent.putExtra("extra_result_selection", TimeZonePicker.OXO1(selectedTimeZones));
        setResult(-1, intent);
        finish();
        overrideAnimation();
    }

    private String getCountryNames(String lang, String countryCode) {
        String displayCountry = new Locale(lang, countryCode).getDisplayCountry(Locale.getDefault());
        return !countryCode.equals(displayCountry) ? displayCountry : countryCode;
    }

    private int getIdenticalTimeZoneInTheCountry(TimeZoneInfo timeZoneInfo) {
        int i = 0;
        for (TimeZoneInfo timeZoneInfo2 : this.mTimeZones) {
            if (timeZoneInfo2.hasSameRules(timeZoneInfo)) {
                if (timeZoneInfo2.getCountry() == null) {
                    if (timeZoneInfo.getCountry() == null) {
                        return i;
                    }
                } else if (timeZoneInfo2.getCountry().equals(timeZoneInfo.getCountry())) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    private void initialiseUI(TimeZonePicker.Builder builder) {
        setSupportActionBar(this.toolbar);
        this.searchView.setOnQueryTextListener(this);
        this.animationCloseEnter = builder.animationCloseEnter;
        this.animationCloseExit = builder.animationCloseExit;
        int i = builder.bubbleColor;
        if (i != 0) {
            this.recyclerView.setBubbleColor(i);
        }
        int i2 = builder.handleColor;
        if (i2 != 0) {
            this.recyclerView.setHandleColor(i2);
        }
        int i3 = builder.bubbleTextColor;
        if (i3 != 0) {
            this.recyclerView.setBubbleTextColor(i3);
        }
        int i4 = builder.trackColor;
        if (i4 != 0) {
            this.recyclerView.setTrackColor(i4);
        }
        this.recyclerView.setHideScrollbar(builder.hideScrollbar);
        this.recyclerView.setTrackVisible(builder.showTrack);
        if (builder.selectionMode == 1) {
            this.controlPanel.setVisibility(8);
        } else {
            this.controlPanel.setVisibility(0);
        }
        String str = builder.titleText;
        if (str != null) {
            setTitle(str);
        }
    }

    private void loadData() {
        this.tvSelectAll.setEnabled(false);
        if (this.builder.loadingMode == 0) {
            this.progressBarAsnc.setVisibility(0);
            this.recyclerView.setVisibility(4);
        } else {
            this.progressBar.setVisibility(0);
            this.recyclerView.setVisibility(4);
        }
        XO0O10 xo0o10 = new XO0O10();
        this.loadTask = xo0o10;
        ThreadUtils.executeByIo(xo0o10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadTzsInZoneTab(Context context) {
        AssetManager assets = context.getAssets();
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    String language = Locale.getDefault().getLanguage();
                    inputStreamOpen = assets.open("zone.tab");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!line.startsWith(qu0.XO0O10)) {
                            String[] strArrSplit = line.split("\t");
                            String str = strArrSplit[2];
                            String str2 = strArrSplit[0];
                            TimeZone timeZone = TimeZone.getTimeZone(str);
                            if (timeZone == null) {
                                Log.e(TAG, "Timezone not found: " + str);
                            } else if (str2 != null || str.startsWith("Etc/GMT")) {
                                TimeZoneInfo timeZoneInfo = new TimeZoneInfo(context, timeZone, getCountryNames(language, str2));
                                if (getIdenticalTimeZoneInTheCountry(timeZoneInfo) == -1) {
                                    this.mTimeZones.add(timeZoneInfo);
                                    if (this.builder.selectedItems.contains(timeZoneInfo.getCityName())) {
                                        this.adapter.X1ii(timeZoneInfo.getCityName());
                                    }
                                }
                            }
                        }
                    }
                    TimeZoneInfo timeZoneInfo2 = new TimeZoneInfo(context, TimeZone.getTimeZone("America/Los_Angeles"), getString(R.string.las_vegas));
                    timeZoneInfo2.setCityName(getString(R.string.las_vegas));
                    this.mTimeZones.add(timeZoneInfo2);
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                } catch (Throwable th) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                Log.e(TAG, "Failed to read 'zone.tab'.");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            }
        } catch (IOException unused3) {
        }
    }

    private void overrideAnimation() {
        Integer num = this.animationCloseEnter;
        if (num == null || this.animationCloseExit == null) {
            return;
        }
        overridePendingTransition(num.intValue(), this.animationCloseExit.intValue());
    }

    private void setSearchIconColor(MenuItem menuItem, final Integer color) {
        Drawable icon;
        if (color == null || (icon = menuItem.getIcon()) == null) {
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(icon);
        DrawableCompat.setTint(drawableWrap.mutate(), color.intValue());
        menuItem.setIcon(drawableWrap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelectBarContents(int totalSelectedTimeZones) {
        this.tvSelectBtn.setEnabled(totalSelectedTimeZones > 0);
        if (totalSelectedTimeZones <= 0) {
            this.tvSelectBtn.setText(getString(R.string.text_done));
        } else if (this.builder.maxSelectCount == 0) {
            this.tvSelectBtn.setText(getString(R.string.text_done_1, String.valueOf(totalSelectedTimeZones)));
        } else {
            this.tvSelectBtn.setText(getString(R.string.text_done_2, String.valueOf(totalSelectedTimeZones), String.valueOf(this.builder.maxSelectCount)));
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle savedInstanceState) {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        TimeZonePicker.Builder builder = (TimeZonePicker.Builder) intent.getSerializableExtra("builder");
        this.builder = builder;
        setTheme(builder.theme);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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
        if (this.builder.maxSelectCount != 0) {
            this.tvSelectAll.setVisibility(8);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new com.sma.smartv3.p610ui.timezonepicker.OXO1(this.builder, this.mTimeZones, new OXO1());
        loadData();
        this.recyclerView.setAdapter(this.adapter);
        this.tvSelectBtn.setOnClickListener(new XIi00iiXO());
        this.tvSelectAll.setOnClickListener(new ViewOnClickListenerC18990iO());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_timezone_picker;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pick_menu_main, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.mcp_action_search);
        this.searchMenuItem = menuItemFindItem;
        setSearchIconColor(menuItemFindItem, this.builder.searchIconColor);
        this.searchView.setMenuItem(this.searchMenuItem);
        return true;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ThreadUtils.SimpleTask simpleTask = this.loadTask;
        if (simpleTask == null || simpleTask.isDone()) {
            return;
        }
        LogUtils.m11128d("Cancel loadTask");
        ThreadUtils.cancel(this.loadTask);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.searchView.XiOIO()) {
            this.searchView.XXI();
        } else {
            super.onHandleBackPressed();
            overrideAnimation();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 16908332) {
            setResult(0);
            finish();
            overrideAnimation();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
    public boolean onQueryTextChange(String newText) {
        com.sma.smartv3.p610ui.timezonepicker.OXO1 oxo1 = this.adapter;
        if (oxo1 == null) {
            return false;
        }
        oxo1.filterOnText(newText);
        return false;
    }

    @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
    public boolean onQueryTextSubmit(String query) {
        com.sma.smartv3.p610ui.timezonepicker.OXO1 oxo1 = this.adapter;
        if (oxo1 == null) {
            return false;
        }
        oxo1.filterOnText(query);
        return false;
    }
}
