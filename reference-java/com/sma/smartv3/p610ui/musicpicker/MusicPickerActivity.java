package com.sma.smartv3.p610ui.musicpicker;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.fw0;
import com.android.mltcode.paycertificationapi.iw0;
import com.android.mltcode.paycertificationapi.jw0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.l4digital.fastscroll.FastScrollRecyclerView;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MusicPickerActivity extends BaseActivity implements MaterialSearchView.I0IIOi {
    public static final String EXTRA_RESULT_SELECTION = "extra_result_selection";
    private com.sma.smartv3.p610ui.musicpicker.OXO1 adapter;
    private Integer animationCloseEnter;
    private Integer animationCloseExit;
    private MusicPicker.Builder builder;
    private LinearLayout controlPanel;
    private ThreadUtils.SimpleTask loadTask;
    private ProgressBar progressBar;
    private ProgressBar progressBarAsnc;
    private FastScrollRecyclerView recyclerView;
    private MenuItem searchMenuItem;
    private MaterialSearchView searchView;
    private Toolbar toolbar;
    private TextView tvNoMusics;
    private TextView tvSelectAll;
    private TextView tvSelectBtn;
    private List<fw0> musicList = new ArrayList();
    private boolean allSelected = false;

    public class OXO1 implements com.sma.smartv3.p610ui.musicpicker.OXO1.InterfaceC18953iO {
        public OXO1() {
        }

        @Override // com.sma.smartv3.p610ui.musicpicker.OXO1.InterfaceC18953iO
        public void OXO1(fw0 music, int totalSelectedMusics) {
            MusicPickerActivity.this.updateSelectBarContents(totalSelectedMusics);
            if (MusicPickerActivity.this.builder.selectionMode == 1) {
                MusicPickerActivity.this.finishPicking();
            }
        }
    }

    public class XIi00iiXO implements View.OnClickListener {
        public XIi00iiXO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MusicPickerActivity.this.finishPicking();
        }
    }

    public class XO0O10 extends ThreadUtils.SimpleTask<Object> {

        /* JADX INFO: renamed from: I1 */
        public jw0 f54741I1 = new OXO1();

        /* JADX INFO: renamed from: IO */
        public iw0 f54742IO;

        public class OXO1 implements jw0 {

            /* JADX INFO: renamed from: com.sma.smartv3.ui.musicpicker.MusicPickerActivity$XO0O10$OXO1$OXO1 */
            public class RunnableC22047OXO1 implements Runnable {
                public RunnableC22047OXO1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MusicPickerActivity.this.adapter != null) {
                        MusicPickerActivity.this.adapter.notifyDataSetChanged();
                    }
                }
            }

            public OXO1() {
            }

            @Override // com.android.mltcode.paycertificationapi.jw0
            public void OXO1(fw0 music) {
                MusicPickerActivity.this.musicList.add(music);
                if (MusicPickerActivity.this.builder.selectedItems.contains(Long.valueOf(music.OIX0iXi()))) {
                    MusicPickerActivity.this.adapter.XXI(music.OIX0iXi());
                }
                if (MusicPickerActivity.this.builder.loadingMode == 0) {
                    MusicPickerActivity.this.runOnUiThread(new RunnableC22047OXO1());
                }
            }

            @Override // com.android.mltcode.paycertificationapi.jw0
            public void onComplete() {
                if (MusicPickerActivity.this.musicList.size() == 0) {
                    MusicPickerActivity.this.tvNoMusics.setVisibility(0);
                }
                if (MusicPickerActivity.this.adapter != null && MusicPickerActivity.this.builder.loadingMode == 1) {
                    MusicPickerActivity.this.adapter.notifyDataSetChanged();
                }
                if (MusicPickerActivity.this.adapter != null) {
                    MusicPickerActivity musicPickerActivity = MusicPickerActivity.this;
                    musicPickerActivity.updateSelectBarContents(musicPickerActivity.adapter.I0iXXO());
                }
                MusicPickerActivity.this.progressBar.setVisibility(8);
                MusicPickerActivity.this.progressBarAsnc.setVisibility(8);
                MusicPickerActivity.this.tvSelectAll.setEnabled(true);
            }
        }

        public XO0O10() {
            this.f54742IO = new iw0(MusicPickerActivity.this);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Object doInBackground() throws Throwable {
            this.f54742IO.XO0O10(this.f54741I1);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.SimpleTask, com.blankj.utilcode.util.ThreadUtils.Task
        public void onCancel() {
            super.onCancel();
            this.f54742IO.O00(true);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.SimpleTask, com.blankj.utilcode.util.ThreadUtils.Task
        public void onFail(Throwable t) {
            super.onFail(t);
            this.f54742IO.O00(true);
            t.printStackTrace();
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Object result) {
            this.f54741I1.onComplete();
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.musicpicker.MusicPickerActivity$iO */
    public class ViewOnClickListenerC18952iO implements View.OnClickListener {
        public ViewOnClickListenerC18952iO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MusicPickerActivity musicPickerActivity = MusicPickerActivity.this;
            musicPickerActivity.allSelected = !musicPickerActivity.allSelected;
            if (MusicPickerActivity.this.adapter != null) {
                MusicPickerActivity.this.adapter.setAllSelected(MusicPickerActivity.this.allSelected);
            }
            if (MusicPickerActivity.this.allSelected) {
                MusicPickerActivity.this.tvSelectAll.setText(MusicPickerActivity.this.getString(R.string.text_unselect_all));
            } else {
                MusicPickerActivity.this.tvSelectAll.setText(MusicPickerActivity.this.getString(R.string.text_select_all));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishPicking() {
        Intent intent = new Intent();
        intent.putExtra("extra_result_selection", MusicPicker.OXO1(this.adapter.OIX0iXi()));
        setResult(-1, intent);
        finish();
        overrideAnimation();
    }

    private void initialiseUI(MusicPicker.Builder builder) {
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
        if (builder.selectionMode == 1 && builder.selectedItems.size() > 0) {
            throw new RuntimeException("You must be using MusicPicker.CHOICE_MODE_MULTIPLE in order to use setSelectedMusics()");
        }
        String str = builder.titleText;
        if (str != null) {
            setTitle(str);
        }
    }

    private void loadMusics() {
        this.tvSelectAll.setEnabled(false);
        if (this.builder.loadingMode == 0) {
            this.progressBarAsnc.setVisibility(0);
        } else {
            this.progressBar.setVisibility(0);
        }
        XO0O10 xo0o10 = new XO0O10();
        this.loadTask = xo0o10;
        ThreadUtils.executeByIo(xo0o10);
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
    public void updateSelectBarContents(int totalSelectedMusics) {
        this.tvSelectBtn.setEnabled(totalSelectedMusics > 0);
        if (totalSelectedMusics <= 0) {
            this.tvSelectBtn.setText(getString(R.string.text_done));
        } else if (this.builder.maxSelectCount == 0) {
            this.tvSelectBtn.setText(getString(R.string.text_done_1, String.valueOf(totalSelectedMusics)));
        } else {
            this.tvSelectBtn.setText(getString(R.string.text_done_2, String.valueOf(totalSelectedMusics), String.valueOf(this.builder.maxSelectCount)));
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle savedInstanceState) {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        MusicPicker.Builder builder = (MusicPicker.Builder) intent.getSerializableExtra("builder");
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
        this.tvNoMusics = (TextView) findViewById(R.id.tvNoMusics);
        this.recyclerView = (FastScrollRecyclerView) findViewById(R.id.recyclerView);
        initialiseUI(this.builder);
        if (this.builder.maxSelectCount != 0) {
            this.tvSelectAll.setVisibility(8);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new com.sma.smartv3.p610ui.musicpicker.OXO1(this.builder, this.musicList, new OXO1());
        loadMusics();
        this.recyclerView.setAdapter(this.adapter);
        this.tvSelectBtn.setOnClickListener(new XIi00iiXO());
        this.tvSelectAll.setOnClickListener(new ViewOnClickListenerC18952iO());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_music_picker;
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
        com.sma.smartv3.p610ui.musicpicker.OXO1 oxo1 = this.adapter;
        if (oxo1 == null) {
            return false;
        }
        oxo1.filterOnText(newText);
        return false;
    }

    @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
    public boolean onQueryTextSubmit(String query) {
        com.sma.smartv3.p610ui.musicpicker.OXO1 oxo1 = this.adapter;
        if (oxo1 == null) {
            return false;
        }
        oxo1.filterOnText(query);
        return false;
    }
}
