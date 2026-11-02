package com.sma.smartv3.ui.musicpicker;

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
    private com.sma.smartv3.ui.musicpicker.OXO1 adapter;
    private boolean allSelected;
    private Integer animationCloseEnter;
    private Integer animationCloseExit;
    private MusicPicker.Builder builder;
    private LinearLayout controlPanel;
    private ThreadUtils.SimpleTask loadTask;
    private List<fw0> musicList;
    private ProgressBar progressBar;
    private ProgressBar progressBarAsnc;
    private FastScrollRecyclerView recyclerView;
    private MenuItem searchMenuItem;
    private MaterialSearchView searchView;
    private Toolbar toolbar;
    private TextView tvNoMusics;
    private TextView tvSelectAll;
    private TextView tvSelectBtn;

    public class OXO1 implements com.sma.smartv3.ui.musicpicker.OXO1.iO {
        public final /* synthetic */ MusicPickerActivity OXO1;

        public OXO1(final MusicPickerActivity this$0) {
            this.OXO1 = this$0;
        }

        @Override // com.sma.smartv3.ui.musicpicker.OXO1.iO
        public void OXO1(fw0 music, int totalSelectedMusics) {
            MusicPickerActivity.XX0(this.OXO1, totalSelectedMusics);
            if (MusicPickerActivity.XXI(this.OXO1).selectionMode != 1) goto L6;
            MusicPickerActivity.iIiiO(this.OXO1);
            return;
        }
    }

    public class XIi00iiXO implements View.OnClickListener {
        public final /* synthetic */ MusicPickerActivity IO;

        public XIi00iiXO(final MusicPickerActivity this$0) {
            this.IO = this$0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MusicPickerActivity.iIiiO(this.IO);
        }
    }

    public class XO0O10 extends ThreadUtils.SimpleTask<Object> {
        public jw0 I1;
        public iw0 IO;
        public final /* synthetic */ MusicPickerActivity iX1O1;

        public class OXO1 implements jw0 {
            public final /* synthetic */ XO0O10 OXO1;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.musicpicker.MusicPickerActivity$XO0O10$OXO1$OXO1, reason: collision with other inner class name */
            public class RunnableC0571OXO1 implements Runnable {
                public final /* synthetic */ OXO1 IO;

                public RunnableC0571OXO1(final OXO1 this$2) {
                    this.IO = this$2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MusicPickerActivity.OIX0iXi(this.IO.OXO1.iX1O1) == null) goto L6;
                    MusicPickerActivity.OIX0iXi(this.IO.OXO1.iX1O1).notifyDataSetChanged();
                    return;
                }
            }

            public OXO1(final XO0O10 this$1) {
                this.OXO1 = this$1;
            }

            @Override // com.android.mltcode.paycertificationapi.jw0
            public void OXO1(fw0 music) {
                MusicPickerActivity.X1ii(this.OXO1.iX1O1).add(music);
                if (MusicPickerActivity.XXI(this.OXO1.iX1O1).selectedItems.contains(Long.valueOf(music.OIX0iXi())) == false) goto L6;
                MusicPickerActivity.OIX0iXi(this.OXO1.iX1O1).XXI(music.OIX0iXi());
            L6:
                if (MusicPickerActivity.XXI(this.OXO1.iX1O1).loadingMode != 0) goto L9;
                this.OXO1.iX1O1.runOnUiThread(new RunnableC0571OXO1(this));
                return;
            }

            @Override // com.android.mltcode.paycertificationapi.jw0
            public void onComplete() {
                if (MusicPickerActivity.X1ii(this.OXO1.iX1O1).size() != 0) goto L6;
                MusicPickerActivity.I1XOi1(this.OXO1.iX1O1).setVisibility(0);
            L6:
                if (MusicPickerActivity.OIX0iXi(this.OXO1.iX1O1) == null) goto L11;
                if (MusicPickerActivity.XXI(this.OXO1.iX1O1).loadingMode != 1) goto L11;
                MusicPickerActivity.OIX0iXi(this.OXO1.iX1O1).notifyDataSetChanged();
            L11:
                if (MusicPickerActivity.OIX0iXi(this.OXO1.iX1O1) == null) goto L13;
                MusicPickerActivity r0 = this.OXO1.iX1O1;
                MusicPickerActivity.XX0(r0, MusicPickerActivity.OIX0iXi(r0).I0iXXO());
            L13:
                MusicPickerActivity.O10IXXX0X(this.OXO1.iX1O1).setVisibility(8);
                MusicPickerActivity.X0O(this.OXO1.iX1O1).setVisibility(8);
                MusicPickerActivity.IIX1OXO(this.OXO1.iX1O1).setEnabled(true);
            }
        }

        public XO0O10(final MusicPickerActivity this$0) {
            this.iX1O1 = this$0;
            this.IO = new iw0(this$0);
            this.I1 = new OXO1(this);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Object doInBackground() throws Throwable {
            XO0O10(this.I1);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.SimpleTask, com.blankj.utilcode.util.ThreadUtils.Task
        public void onCancel() {
            super.onCancel();
            O00(true);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.SimpleTask, com.blankj.utilcode.util.ThreadUtils.Task
        public void onFail(Throwable t) {
            super.onFail(t);
            O00(true);
            t.printStackTrace();
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Object result) {
            onComplete();
        }
    }

    public class iO implements View.OnClickListener {
        public final /* synthetic */ MusicPickerActivity IO;

        public iO(final MusicPickerActivity this$0) {
            this.IO = this$0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MusicPickerActivity r3 = this.IO;
            MusicPickerActivity.XiOIO(r3, !MusicPickerActivity.I0iXXO(r3));
            if (MusicPickerActivity.OIX0iXi(this.IO) == null) goto L6;
            MusicPickerActivity.OIX0iXi(this.IO).setAllSelected(MusicPickerActivity.I0iXXO(this.IO));
        L6:
            if (MusicPickerActivity.I0iXXO(this.IO) == false) goto L9;
            MusicPickerActivity.IIX1OXO(this.IO).setText(this.IO.getString(R.string.text_unselect_all));
            return;
        L9:
            MusicPickerActivity.IIX1OXO(this.IO).setText(this.IO.getString(R.string.text_select_all));
        }
    }

    public MusicPickerActivity() {
        this.musicList = new ArrayList();
        this.allSelected = false;
    }

    public static /* bridge */ /* synthetic */ boolean I0iXXO(MusicPickerActivity r0) {
        return r0.allSelected;
    }

    public static /* bridge */ /* synthetic */ TextView I1XOi1(MusicPickerActivity r0) {
        return r0.tvNoMusics;
    }

    public static /* bridge */ /* synthetic */ TextView IIX1OXO(MusicPickerActivity r0) {
        return r0.tvSelectAll;
    }

    public static /* bridge */ /* synthetic */ ProgressBar O10IXXX0X(MusicPickerActivity r0) {
        return r0.progressBar;
    }

    public static /* bridge */ /* synthetic */ com.sma.smartv3.ui.musicpicker.OXO1 OIX0iXi(MusicPickerActivity r0) {
        return r0.adapter;
    }

    public static /* bridge */ /* synthetic */ ProgressBar X0O(MusicPickerActivity r0) {
        return r0.progressBarAsnc;
    }

    public static /* bridge */ /* synthetic */ List X1ii(MusicPickerActivity r0) {
        return r0.musicList;
    }

    public static /* bridge */ /* synthetic */ void XX0(MusicPickerActivity r0, int r1) {
        r0.updateSelectBarContents(r1);
    }

    public static /* bridge */ /* synthetic */ MusicPicker.Builder XXI(MusicPickerActivity r0) {
        return r0.builder;
    }

    public static /* bridge */ /* synthetic */ void XiOIO(MusicPickerActivity r0, boolean r1) {
        r0.allSelected = r1;
    }

    private void finishPicking() {
        Intent r0 = new Intent();
        r0.putExtra("extra_result_selection", MusicPicker.OXO1(this.adapter.OIX0iXi()));
        setResult(-1, r0);
        finish();
        overrideAnimation();
    }

    public static /* bridge */ /* synthetic */ void iIiiO(MusicPickerActivity r0) {
        r0.finishPicking();
    }

    private void initialiseUI(MusicPicker.Builder builder) {
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
    L19:
        if (builder.selectionMode == 1) goto L21;
    L25:
        String r4 = builder.titleText;
        if (r4 == null) goto L29;
        setTitle(r4);
        return;
    L29:
        return;
    L21:
        if (builder.selectedItems.size() <= 0) goto L25;
        throw new RuntimeException("You must be using MusicPicker.CHOICE_MODE_MULTIPLE in order to use setSelectedMusics()");
    L17:
        this.controlPanel.setVisibility(0);
        goto L19
    }

    private void loadMusics() {
        this.tvSelectAll.setEnabled(false);
        if (this.builder.loadingMode != 0) goto L5;
        this.progressBarAsnc.setVisibility(0);
    L6:
        XO0O10 r0 = new XO0O10(this);
        this.loadTask = r0;
        ThreadUtils.executeByIo(r0);
        return;
    L5:
        this.progressBar.setVisibility(0);
        goto L6
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

    private void updateSelectBarContents(int totalSelectedMusics) {
        TextView r0 = this.tvSelectBtn;
        if (totalSelectedMusics <= 0) goto L5;
        boolean r1 = true;
    L6:
        r0.setEnabled(r1);
        if (totalSelectedMusics > 0) goto L9;
        this.tvSelectBtn.setText(getString(R.string.text_done));
        return;
    L9:
        if (this.builder.maxSelectCount != 0) goto L12;
        this.tvSelectBtn.setText(getString(R.string.text_done_1, new Object[]{String.valueOf(totalSelectedMusics)}));
        return;
    L12:
        this.tvSelectBtn.setText(getString(R.string.text_done_2, new Object[]{String.valueOf(totalSelectedMusics), String.valueOf(this.builder.maxSelectCount)}));
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
        MusicPicker.Builder r3 = (MusicPicker.Builder) r2.getSerializableExtra("builder");
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
        this.tvNoMusics = (TextView) findViewById(R.id.tvNoMusics);
        this.recyclerView = (FastScrollRecyclerView) findViewById(R.id.recyclerView);
        initialiseUI(this.builder);
        if (this.builder.maxSelectCount == 0) goto L6;
        this.tvSelectAll.setVisibility(8);
    L6:
        if (getSupportActionBar() == null) goto L8;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    L8:
        setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new com.sma.smartv3.ui.musicpicker.OXO1(this.builder, this.musicList, new OXO1(this));
        loadMusics();
        setAdapter(this.adapter);
        this.tvSelectBtn.setOnClickListener(new XIi00iiXO(this));
        this.tvSelectAll.setOnClickListener(new iO(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_music_picker;
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
        com.sma.smartv3.ui.musicpicker.OXO1 r0 = this.adapter;
        if (r0 == null) goto L7;
        r0.filterOnText(newText);
        return false;
    L7:
        return false;
    }

    @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
    public boolean onQueryTextSubmit(String query) {
        com.sma.smartv3.ui.musicpicker.OXO1 r0 = this.adapter;
        if (r0 == null) goto L7;
        r0.filterOnText(query);
        return false;
    L7:
        return false;
    }
}
