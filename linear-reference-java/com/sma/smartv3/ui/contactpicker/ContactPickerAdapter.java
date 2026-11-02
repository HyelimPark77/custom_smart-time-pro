package com.sma.smartv3.ui.contactpicker;

import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.l4digital.fastscroll.FastScroller;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
class ContactPickerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements FastScroller.OIi0, Filterable {
    private ContactPicker.Builder builder;
    private List<Contact> contactItemList;
    private List<Contact> contactItemListOriginal;
    private String currentFilterQuery;
    private ContactSelectListener listener;

    public interface ContactSelectListener {
        void onContactSelected(Contact contact, int totalSelectedContacts);
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        private AppCompatCheckBox cbSelectedState;
        private final View mView;
        final /* synthetic */ ContactPickerAdapter this$0;
        private TextView tvContactName;
        private TextView tvNumber;
        private RoundLetterView vRoundLetterView;

        public ContactViewHolder(final ContactPickerAdapter this$0, View view) {
            this.this$0 = this$0;
            super(view);
            this.mView = view;
            this.vRoundLetterView = (RoundLetterView) view.findViewById(R.id.vRoundLetterView);
            this.tvContactName = (TextView) view.findViewById(R.id.tvContactName);
            this.tvNumber = (TextView) view.findViewById(R.id.tvNumber);
            this.cbSelectedState = (AppCompatCheckBox) view.findViewById(R.id.cbSelectedState);
        }

        public static /* bridge */ /* synthetic */ RoundLetterView O00(ContactViewHolder r0) {
            return r0.vRoundLetterView;
        }

        public static /* bridge */ /* synthetic */ AppCompatCheckBox OXO1(ContactViewHolder r0) {
            return r0.cbSelectedState;
        }

        public static /* bridge */ /* synthetic */ View XIi00iiXO(ContactViewHolder r0) {
            return r0.mView;
        }

        public static /* bridge */ /* synthetic */ TextView XO0O10(ContactViewHolder r0) {
            return r0.tvNumber;
        }

        public static /* bridge */ /* synthetic */ TextView iO(ContactViewHolder r0) {
            return r0.tvContactName;
        }
    }

    public ContactPickerAdapter(ContactPicker.Builder builder, List<Contact> contactItemList, ContactSelectListener listener) {
        this.builder = builder;
        this.contactItemList = contactItemList;
        this.contactItemListOriginal = contactItemList;
        this.listener = listener;
    }

    public static /* bridge */ /* synthetic */ Contact I0IIOi(ContactPickerAdapter r0, int r1) {
        return r0.getItem(r1);
    }

    public static /* bridge */ /* synthetic */ void IiI10X(ContactPickerAdapter r0, String r1) {
        r0.currentFilterQuery = r1;
    }

    public static /* bridge */ /* synthetic */ void O00(ContactPickerAdapter r0, List r1) {
        r0.contactItemList = r1;
    }

    public static /* bridge */ /* synthetic */ int OIi0(ContactPickerAdapter r0, List r1, long r2) {
        return r0.getItemPosition(r1, r2);
    }

    public static /* bridge */ /* synthetic */ ContactPicker.Builder OXO1(ContactPickerAdapter r0) {
        return r0.builder;
    }

    public static /* bridge */ /* synthetic */ List XIi00iiXO(ContactPickerAdapter r0) {
        return r0.contactItemList;
    }

    public static /* bridge */ /* synthetic */ ContactSelectListener XO0O10(ContactPickerAdapter r0) {
        return r0.listener;
    }

    public static /* bridge */ /* synthetic */ List XOO0ii0(ContactPickerAdapter r0, String r1) {
        return r0.getFilteredResults(r1);
    }

    private List<Contact> getFilteredResults(String constraint) {
        ArrayList r0 = new ArrayList();
        Iterator<Contact> r1 = this.contactItemListOriginal.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Contact r2 = r1.next();
        if (r2.getDisplayName().toLowerCase().contains(constraint) == false) goto L4;
        r0.add(r2);
        goto L4
    L8:
        return r0;
    }

    private Contact getItem(int pos) {
        return this.contactItemList.get(pos);
    }

    private int getItemPosition(List<Contact> list, long mid) {
        Iterator<Contact> r4 = list.iterator();
        int r0 = 0;
    L4:
        if (r4.hasNext() == false) goto L9;
        if (r4.next().getId() == mid) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        return r0;
    L9:
        return -1;
    }

    private void highlightTerm(TextView tv, String query, String originalString) {
        if (query != null) goto L4;
    L11:
        tv.setText(originalString);
        return;
    L4:
        if (query.isEmpty() == true) goto L11;
        int r0 = originalString.toLowerCase().indexOf(query.toLowerCase());
        int r10 = query.length() + r0;
        if (r0 == (-1)) goto L9;
        SpannableString r1 = new SpannableString(originalString);
        r1.setSpan(new TextAppearanceSpan(null, 1, -1, new ColorStateList(new int[][]{new int[0]}, new int[]{ViewCompat.MEASURED_STATE_MASK}), null), r0, r10, 33);
        tv.setText(r1);
        return;
    L9:
        tv.setText(originalString);
    }

    public static /* bridge */ /* synthetic */ List iO(ContactPickerAdapter r0) {
        return r0.contactItemListOriginal;
    }

    public void filterOnText(String query) {
        this.currentFilterQuery = query;
        getFilter().filter(this.currentFilterQuery);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new AnonymousClass2(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Contact> r0 = this.contactItemList;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.size();
    }

    @Override // com.l4digital.fastscroll.FastScroller.OIi0
    public /* bridge */ /* synthetic */ CharSequence getSectionText(int position) {
        return getSectionText(position);
    }

    public List<Contact> getSelectedContacts() {
        ArrayList r0 = new ArrayList();
        Iterator<Contact> r1 = this.contactItemListOriginal.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Contact r2 = r1.next();
        if (r2.isSelected() == false) goto L4;
        r0.add(r2);
        goto L4
    L8:
        return r0;
    }

    public int getSelectedContactsCount() {
        if (getSelectedContacts() != null) goto L5;
        return 0;
    L5:
        return getSelectedContacts().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int i) {
        if ((holder instanceof ContactViewHolder) == false) goto L27;
        ContactViewHolder r8 = (ContactViewHolder) holder;
        final Contact r0 = getItem(i);
        String r1 = r0.getDisplayName();
        ContactViewHolder.iO(r8).setText(r1);
        if (TextUtils.isEmpty(r1) == true) goto L7;
        ContactViewHolder.O00(r8).setTitleText(String.valueOf(r1.charAt(0)));
        ContactViewHolder.O00(r8).setBackgroundColor(r0.getBackgroundColor());
    L9:
        if (r0.getPhoneNumbers().size() <= 0) goto L15;
        String r2 = r0.getPhoneNumbers().get(0).getNumber().replaceAll("\\s+", "");
        if (r2.equals(r1.replaceAll("\\s+", "")) == true) goto L13;
        ContactViewHolder.XO0O10(r8).setVisibility(0);
        ContactViewHolder.XO0O10(r8).setText(r2);
    L21:
        highlightTerm(ContactViewHolder.iO(r8), this.currentFilterQuery, ContactViewHolder.iO(r8).getText().toString());
        if (r0.isSelected() == false) goto L24;
        ContactViewHolder.OXO1(r8).setChecked(true);
    L25:
        ContactViewHolder.XIi00iiXO(r8).setOnClickListener(new AnonymousClass1(this, r0, i));
        return;
    L24:
        ContactViewHolder.OXO1(r8).setChecked(false);
        goto L25
    L13:
        ContactViewHolder.XO0O10(r8).setVisibility(8);
        goto L21
    L15:
        if (r0.getEmails().size() <= 0) goto L20;
        String r3 = r0.getEmails().get(0).replaceAll("\\s+", "");
        if (r3.equals(r1.replaceAll("\\s+", "")) == true) goto L19;
        ContactViewHolder.XO0O10(r8).setVisibility(0);
        ContactViewHolder.XO0O10(r8).setText(r3);
        goto L21
    L19:
        ContactViewHolder.XO0O10(r8).setVisibility(8);
        goto L21
    L20:
        ContactViewHolder.XO0O10(r8).setVisibility(8);
        goto L21
    L7:
        r1 = "";
        goto L9
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new ContactViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_contact_pick_item, viewGroup, false));
    }

    public void setAllSelected(boolean isAll) {
        Iterator<Contact> r0 = this.contactItemList.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Contact r1 = r0.next();
        r1.setSelected(isAll);
        ContactSelectListener r2 = this.listener;
        if (r2 == null) goto L4;
        r2.onContactSelected(r1, getSelectedContactsCount());
        goto L4
    L8:
        notifyDataSetChanged();
    }

    public void setContactSelected(long id) {
        int r2 = getItemPosition(this.contactItemList, id);
        this.contactItemList.get(r2).setSelected(!this.contactItemList.get(r2).isSelected());
    }

    @Override // com.l4digital.fastscroll.FastScroller.OIi0
    public String getSectionText(int position) {
        return String.valueOf(this.contactItemList.get(position).getDisplayName().charAt(0));
    L6:
        e = move-exception;
        e.printStackTrace();
        return "";
    }
}
