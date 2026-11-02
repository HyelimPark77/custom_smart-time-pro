package com.sma.smartv3.p610ui.contactpicker;

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
    private Integer animationCloseEnter;
    private Integer animationCloseExit;
    private ContactPicker.Builder builder;
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
    private List<Contact> contactList = new ArrayList();
    private boolean allSelected = false;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.contactpicker.ContactPickerActivity$4 */
    public class C186644 extends ThreadUtils.SimpleTask<Object> {
        LoadCallBack callBack = new LoadCallBack() { // from class: com.sma.smartv3.ui.contactpicker.ContactPickerActivity.4.1
            @Override // com.sma.smartv3.p610ui.contactpicker.LoadCallBack
            public void onComplete() {
                if (ContactPickerActivity.this.contactList.size() == 0) {
                    ContactPickerActivity.this.tvNoContacts.setVisibility(0);
                }
                if (ContactPickerActivity.this.adapter != null && ContactPickerActivity.this.builder.loadingMode == 1) {
                    ContactPickerActivity.this.adapter.notifyDataSetChanged();
                }
                if (ContactPickerActivity.this.adapter != null) {
                    ContactPickerActivity contactPickerActivity = ContactPickerActivity.this;
                    contactPickerActivity.updateSelectBarContents(contactPickerActivity.adapter.getSelectedContactsCount());
                }
                ContactPickerActivity.this.progressBar.setVisibility(8);
                ContactPickerActivity.this.progressBarAsnc.setVisibility(8);
                ContactPickerActivity.this.tvSelectAll.setEnabled(true);
            }

            @Override // com.sma.smartv3.p610ui.contactpicker.LoadCallBack
            public void onNext(Contact contact) {
                ContactPickerActivity.this.contactList.add(contact);
                if (ContactPickerActivity.this.builder.selectedItems.contains(Long.valueOf(contact.getId()))) {
                    ContactPickerActivity.this.adapter.setContactSelected(contact.getId());
                }
                if (ContactPickerActivity.this.builder.loadingMode == 0) {
                    ContactPickerActivity.this.runOnUiThread(new Runnable() { // from class: com.sma.smartv3.ui.contactpicker.ContactPickerActivity.4.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (ContactPickerActivity.this.adapter != null) {
                                ContactPickerActivity.this.adapter.notifyDataSetChanged();
                            }
                        }
                    });
                }
            }
        };
        private ContactHelper helper;

        public C186644() {
            this.helper = new ContactHelper(ContactPickerActivity.this);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Object doInBackground() throws Throwable {
            this.helper.load(ContactPickerActivity.this.builder.columnLimit, this.callBack);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void finishPicking() {
        Intent intent = new Intent();
        intent.putExtra("extra_result_selection", ContactPicker.buildResult(this.adapter.getSelectedContacts()));
        setResult(-1, intent);
        finish();
        overrideAnimation();
    }

    private void initialiseUI(ContactPicker.Builder builder) {
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
            throw new RuntimeException("You must be using ContactPicker.CHOICE_MODE_MULTIPLE in order to use setSelectedContacts()");
        }
        String str = builder.titleText;
        if (str != null) {
            setTitle(str);
        }
    }

    private void loadContacts() {
        this.tvSelectAll.setEnabled(false);
        if (this.builder.loadingMode == 0) {
            this.progressBarAsnc.setVisibility(0);
        } else {
            this.progressBar.setVisibility(0);
        }
        C186644 c186644 = new C186644();
        this.loadTask = c186644;
        ThreadUtils.executeByIo(c186644);
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
    public void updateSelectBarContents(int totalSelectedContacts) {
        this.tvSelectBtn.setEnabled(totalSelectedContacts > 0);
        if (totalSelectedContacts <= 0) {
            this.tvSelectBtnTip.setText(getString(R.string.picker_title) + "(0/" + this.builder.maxSelectCount + I000IiI1O.C2156iO.f1007iO);
            this.tvSelectBtn.setText(getString(R.string.text_done));
            return;
        }
        this.tvSelectBtnTip.setText(getString(R.string.picker_title) + I000IiI1O.C2156iO.XIi00iiXO + totalSelectedContacts + "/" + this.builder.maxSelectCount + I000IiI1O.C2156iO.f1007iO);
        this.tvSelectBtn.setText(getString(R.string.text_done));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle savedInstanceState) {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        ContactPicker.Builder builder = (ContactPicker.Builder) intent.getSerializableExtra("builder");
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
        this.tvSelectBtnTip = (TextView) findViewById(R.id.tvSelectTip);
        this.tvNoContacts = (TextView) findViewById(R.id.tvNoContacts);
        this.recyclerView = (FastScrollRecyclerView) findViewById(R.id.recyclerView);
        initialiseUI(this.builder);
        if (this.builder.maxSelectCount != 0) {
            this.tvSelectAll.setVisibility(8);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new ContactPickerAdapter(this.builder, this.contactList, new ContactPickerAdapter.ContactSelectListener() { // from class: com.sma.smartv3.ui.contactpicker.ContactPickerActivity.1
            @Override // com.sma.smartv3.ui.contactpicker.ContactPickerAdapter.ContactSelectListener
            public void onContactSelected(Contact contact, int totalSelectedContacts) {
                ContactPickerActivity.this.updateSelectBarContents(totalSelectedContacts);
                if (ContactPickerActivity.this.builder.selectionMode == 1) {
                    ContactPickerActivity.this.finishPicking();
                }
            }
        });
        loadContacts();
        this.recyclerView.setAdapter(this.adapter);
        this.tvSelectBtn.setOnClickListener(new View.OnClickListener() { // from class: com.sma.smartv3.ui.contactpicker.ContactPickerActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ContactPickerActivity.this.finishPicking();
            }
        });
        this.tvSelectAll.setOnClickListener(new View.OnClickListener() { // from class: com.sma.smartv3.ui.contactpicker.ContactPickerActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ContactPickerActivity contactPickerActivity = ContactPickerActivity.this;
                contactPickerActivity.allSelected = !contactPickerActivity.allSelected;
                if (ContactPickerActivity.this.adapter != null) {
                    ContactPickerActivity.this.adapter.setAllSelected(ContactPickerActivity.this.allSelected);
                }
                if (ContactPickerActivity.this.allSelected) {
                    ContactPickerActivity.this.tvSelectAll.setText(ContactPickerActivity.this.getString(R.string.text_unselect_all));
                } else {
                    ContactPickerActivity.this.tvSelectAll.setText(ContactPickerActivity.this.getString(R.string.text_select_all));
                }
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_contact_picker;
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
        ContactPickerAdapter contactPickerAdapter = this.adapter;
        if (contactPickerAdapter == null) {
            return false;
        }
        contactPickerAdapter.filterOnText(newText);
        return false;
    }

    @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
    public boolean onQueryTextSubmit(String query) {
        ContactPickerAdapter contactPickerAdapter = this.adapter;
        if (contactPickerAdapter == null) {
            return false;
        }
        contactPickerAdapter.filterOnText(query);
        return false;
    }
}
