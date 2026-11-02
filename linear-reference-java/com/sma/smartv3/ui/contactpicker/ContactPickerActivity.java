package com.sma.smartv3.ui.contactpicker;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I000IiI1O;
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
public class ContactPickerActivity extends BaseActivity implements MaterialSearchView.I0IIOi {
    public static final String EXTRA_RESULT_SELECTION = "extra_result_selection";
    private ContactPickerAdapter adapter;
    private boolean allSelected;
    private Integer animationCloseEnter;
    private Integer animationCloseExit;
    private ContactPicker.Builder builder;
    private List<Contact> contactList;
    private LinearLayout controlPanel;
    private ThreadUtils.SimpleTask loadTask;
    private ProgressBar progressBar;
    private ProgressBar progressBarAsnc;
    private FastScrollRecyclerView recyclerView;
    private MenuItem searchMenuItem;
    private MaterialSearchView searchView;
    private Toolbar toolbar;
    private TextView tvNoContacts;
    private TextView tvSelectAll;
    private TextView tvSelectBtn;
    private TextView tvSelectBtnTip;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.contactpicker.ContactPickerActivity$4, reason: invalid class name */
    public class AnonymousClass4 extends ThreadUtils.SimpleTask<Object> {
        LoadCallBack callBack;
        private ContactHelper helper;
        final /* synthetic */ ContactPickerActivity this$0;

        public AnonymousClass4(final ContactPickerActivity this$0) {
            this.this$0 = this$0;
            this.helper = new ContactHelper(this$0);
            this.callBack = new AnonymousClass1(this);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Object doInBackground() throws Throwable {
            this.helper.load(ContactPickerActivity.XXI(this.this$0).columnLimit, this.callBack);
            return null;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.SimpleTask, com.blankj.utilcode.util.ThreadUtils.Task
        public void onCancel() {
            super.onCancel();
            this.helper.setCancelLoad(true);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.SimpleTask, com.blankj.utilcode.util.ThreadUtils.Task
        public void onFail(Throwable t) {
            super.onFail(t);
            this.helper.setCancelLoad(true);
            t.printStackTrace();
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Object result) {
            this.callBack.onComplete();
        }
    }

    public ContactPickerActivity() {
        this.contactList = new ArrayList();
        this.allSelected = false;
    }

    public static /* bridge */ /* synthetic */ boolean I0iXXO(ContactPickerActivity r0) {
        return r0.allSelected;
    }

    public static /* bridge */ /* synthetic */ TextView I1XOi1(ContactPickerActivity r0) {
        return r0.tvNoContacts;
    }

    public static /* bridge */ /* synthetic */ TextView IIX1OXO(ContactPickerActivity r0) {
        return r0.tvSelectAll;
    }

    public static /* bridge */ /* synthetic */ ProgressBar O10IXXX0X(ContactPickerActivity r0) {
        return r0.progressBar;
    }

    public static /* bridge */ /* synthetic */ ContactPickerAdapter OIX0iXi(ContactPickerActivity r0) {
        return r0.adapter;
    }

    public static /* bridge */ /* synthetic */ ProgressBar X0O(ContactPickerActivity r0) {
        return r0.progressBarAsnc;
    }

    public static /* bridge */ /* synthetic */ List X1ii(ContactPickerActivity r0) {
        return r0.contactList;
    }

    public static /* bridge */ /* synthetic */ void XX0(ContactPickerActivity r0, int r1) {
        r0.updateSelectBarContents(r1);
    }

    public static /* bridge */ /* synthetic */ ContactPicker.Builder XXI(ContactPickerActivity r0) {
        return r0.builder;
    }

    public static /* bridge */ /* synthetic */ void XiOIO(ContactPickerActivity r0, boolean r1) {
        r0.allSelected = r1;
    }

    private void finishPicking() {
        Intent r0 = new Intent();
        r0.putExtra("extra_result_selection", ContactPicker.buildResult(this.adapter.getSelectedContacts()));
        setResult(-1, r0);
        finish();
        overrideAnimation();
    }

    public static /* bridge */ /* synthetic */ void iIiiO(ContactPickerActivity r0) {
        r0.finishPicking();
    }

    private void initialiseUI(ContactPicker.Builder builder) {
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
        throw new RuntimeException("You must be using ContactPicker.CHOICE_MODE_MULTIPLE in order to use setSelectedContacts()");
    L17:
        this.controlPanel.setVisibility(0);
        goto L19
    }

    private void loadContacts() {
        this.tvSelectAll.setEnabled(false);
        if (this.builder.loadingMode != 0) goto L5;
        this.progressBarAsnc.setVisibility(0);
    L6:
        AnonymousClass4 r0 = new AnonymousClass4(this);
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

    private void updateSelectBarContents(int totalSelectedContacts) {
        TextView r0 = this.tvSelectBtn;
        if (totalSelectedContacts <= 0) goto L5;
        boolean r1 = true;
    L6:
        r0.setEnabled(r1);
        if (totalSelectedContacts <= 0) goto L10;
        this.tvSelectBtnTip.setText(getString(R.string.picker_title) + I000IiI1O.iO.XIi00iiXO + totalSelectedContacts + "/" + this.builder.maxSelectCount + I000IiI1O.iO.iO);
        this.tvSelectBtn.setText(getString(R.string.text_done));
        return;
    L10:
        this.tvSelectBtnTip.setText(getString(R.string.picker_title) + "(0/" + this.builder.maxSelectCount + I000IiI1O.iO.iO);
        this.tvSelectBtn.setText(getString(R.string.text_done));
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
        ContactPicker.Builder r3 = (ContactPicker.Builder) r2.getSerializableExtra("builder");
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
        this.tvSelectBtnTip = (TextView) findViewById(R.id.tvSelectTip);
        this.tvNoContacts = (TextView) findViewById(R.id.tvNoContacts);
        this.recyclerView = (FastScrollRecyclerView) findViewById(R.id.recyclerView);
        initialiseUI(this.builder);
        if (this.builder.maxSelectCount == 0) goto L6;
        this.tvSelectAll.setVisibility(8);
    L6:
        if (getSupportActionBar() == null) goto L8;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    L8:
        setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new ContactPickerAdapter(this.builder, this.contactList, new AnonymousClass1(this));
        loadContacts();
        setAdapter(this.adapter);
        this.tvSelectBtn.setOnClickListener(new AnonymousClass2(this));
        this.tvSelectAll.setOnClickListener(new AnonymousClass3(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_contact_picker;
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
        ContactPickerAdapter r0 = this.adapter;
        if (r0 == null) goto L7;
        r0.filterOnText(newText);
        return false;
    L7:
        return false;
    }

    @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
    public boolean onQueryTextSubmit(String query) {
        ContactPickerAdapter r0 = this.adapter;
        if (r0 == null) goto L7;
        r0.filterOnText(query);
        return false;
    L7:
        return false;
    }
}
