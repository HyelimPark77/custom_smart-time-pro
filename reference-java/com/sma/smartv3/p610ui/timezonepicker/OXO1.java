package com.sma.smartv3.p610ui.timezonepicker;

import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.l4digital.fastscroll.FastScroller;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class OXO1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements FastScroller.OIi0, Filterable {

    /* JADX INFO: renamed from: I1 */
    public List<TimeZoneInfo> f54805I1;

    /* JADX INFO: renamed from: IO */
    public List<TimeZoneInfo> f54806IO;
    public String X11iII1O1;
    public TimeZonePicker.Builder XXX11i;
    public InterfaceC18989iO iX1O1;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.timezonepicker.OXO1$OXO1 */
    public class ViewOnClickListenerC22051OXO1 implements View.OnClickListener {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ int f54807I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ TimeZoneInfo f54808IO;

        public ViewOnClickListenerC22051OXO1(final TimeZoneInfo val$item, final int val$i) {
            this.f54808IO = val$item;
            this.f54807I1 = val$i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OXO1.this.XXX11i.selectionMode == 1 && this.f54808IO.isSelected()) {
                return;
            }
            if (OXO1.this.XXX11i.maxSelectCount == 0) {
                OXO1.this.X1ii(this.f54808IO.getCityName());
            } else {
                if (OXO1.this.XXI() > OXO1.this.XXX11i.maxSelectCount) {
                    return;
                }
                if (OXO1.this.XXI() == OXO1.this.XXX11i.maxSelectCount) {
                    OXO1 oxo1 = OXO1.this;
                    int iOIX0iXi = oxo1.OIX0iXi(oxo1.f54806IO, this.f54808IO.getTimeZoneId());
                    if (iOIX0iXi == -1 || !((TimeZoneInfo) OXO1.this.f54806IO.get(iOIX0iXi)).isSelected()) {
                        return;
                    } else {
                        OXO1.this.X1ii(this.f54808IO.getCityName());
                    }
                } else {
                    OXO1.this.X1ii(this.f54808IO.getCityName());
                }
            }
            if (OXO1.this.iX1O1 != null) {
                OXO1.this.iX1O1.OXO1(OXO1.this.m38756IO(this.f54807I1), OXO1.this.XXI());
            }
            OXO1.this.notifyDataSetChanged();
        }
    }

    public class XIi00iiXO extends Filter {
        public XIi00iiXO() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence constraint) {
            List filteredResults;
            if (constraint.length() == 0) {
                filteredResults = OXO1.this.f54805I1;
                OXO1.this.X11iII1O1 = null;
            } else {
                filteredResults = OXO1.this.getFilteredResults(constraint.toString().toLowerCase());
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = filteredResults;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence constraint, Filter.FilterResults results) {
            OXO1.this.f54806IO = (List) results.values;
            OXO1.this.notifyDataSetChanged();
        }
    }

    public class XO0O10 extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: I1 */
        public TextView f54809I1;

        /* JADX INFO: renamed from: IO */
        public final View f54810IO;
        public TextView X11iII1O1;
        public AppCompatRadioButton X1IX;
        public AppCompatCheckBox XXX11i;
        public TextView iX1O1;

        public XO0O10(View view) {
            super(view);
            this.f54810IO = view;
            this.f54809I1 = (TextView) view.findViewById(R.id.tvTitle);
            this.iX1O1 = (TextView) view.findViewById(R.id.tvName);
            this.X11iII1O1 = (TextView) view.findViewById(R.id.tvTip);
            this.XXX11i = (AppCompatCheckBox) view.findViewById(R.id.cbSelectedState);
            this.X1IX = (AppCompatRadioButton) view.findViewById(R.id.rbSelectedState);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.timezonepicker.OXO1$iO */
    public interface InterfaceC18989iO {
        void OXO1(TimeZoneInfo timezone, int totalSelectedTimeZones);
    }

    public OXO1(TimeZonePicker.Builder builder, List<TimeZoneInfo> timeZoneItemList, InterfaceC18989iO listener) {
        this.XXX11i = builder;
        this.f54806IO = timeZoneItemList;
        this.f54805I1 = timeZoneItemList;
        this.iX1O1 = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<TimeZoneInfo> getFilteredResults(String constraint) {
        ArrayList arrayList = new ArrayList();
        for (TimeZoneInfo timeZoneInfo : this.f54805I1) {
            if ((timeZoneInfo.getCityName() + " " + timeZoneInfo.getEnCityName().toLowerCase() + " " + timeZoneInfo.getDisplayName().toLowerCase() + " " + timeZoneInfo.getCountry().toLowerCase() + " " + timeZoneInfo.getGMTName().toLowerCase()).contains(constraint.toLowerCase())) {
                arrayList.add(timeZoneInfo);
            }
        }
        return arrayList;
    }

    private void highlightTerm(TextView tv, String query, String originalString) {
        if (query == null || query.isEmpty()) {
            tv.setText(originalString);
            return;
        }
        int iIndexOf = originalString.toLowerCase().indexOf(query.toLowerCase());
        int length = query.length() + iIndexOf;
        if (iIndexOf == -1) {
            tv.setText(originalString);
            return;
        }
        SpannableString spannableString = new SpannableString(originalString);
        spannableString.setSpan(new TextAppearanceSpan(null, 1, -1, new ColorStateList(new int[][]{new int[0]}, new int[]{ViewCompat.MEASURED_STATE_MASK}), null), iIndexOf, length, 33);
        tv.setText(spannableString);
    }

    public ArrayList<TimeZoneInfo> I0iXXO() {
        ArrayList<TimeZoneInfo> arrayList = new ArrayList<>();
        for (TimeZoneInfo timeZoneInfo : this.f54805I1) {
            if (timeZoneInfo.isSelected()) {
                arrayList.add(timeZoneInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: IO */
    public final TimeZoneInfo m38756IO(int pos) {
        return this.f54806IO.get(pos);
    }

    public final int OIX0iXi(List<TimeZoneInfo> list, String id) {
        Iterator<TimeZoneInfo> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Objects.equals(it.next().getCityName(), id)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void X1ii(String id) {
        int iOIX0iXi = OIX0iXi(this.f54806IO, id);
        this.f54806IO.get(iOIX0iXi).setSelected(!this.f54806IO.get(iOIX0iXi).isSelected());
    }

    public int XXI() {
        if (I0iXXO() != null) {
            return I0iXXO().size();
        }
        return 0;
    }

    public void filterOnText(String query) {
        this.X11iII1O1 = query;
        getFilter().filter(this.X11iII1O1);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new XIi00iiXO();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<TimeZoneInfo> list = this.f54806IO;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int i) {
        if (holder instanceof XO0O10) {
            XO0O10 xo0o10 = (XO0O10) holder;
            TimeZoneInfo timeZoneInfoM38756IO = m38756IO(i);
            xo0o10.f54809I1.setText(timeZoneInfoM38756IO.getCityName());
            highlightTerm(xo0o10.f54809I1, this.X11iII1O1, xo0o10.f54809I1.getText().toString());
            xo0o10.iX1O1.setText(timeZoneInfoM38756IO.getDisplayName());
            highlightTerm(xo0o10.iX1O1, this.X11iII1O1, xo0o10.iX1O1.getText().toString());
            xo0o10.X11iII1O1.setText(timeZoneInfoM38756IO.getCountry() + "  " + timeZoneInfoM38756IO.getGMTName());
            highlightTerm(xo0o10.X11iII1O1, this.X11iII1O1, xo0o10.X11iII1O1.getText().toString());
            if (this.XXX11i.selectionMode == 0) {
                xo0o10.XXX11i.setVisibility(0);
                xo0o10.X1IX.setVisibility(8);
            } else {
                xo0o10.XXX11i.setVisibility(8);
                xo0o10.X1IX.setVisibility(0);
            }
            if (timeZoneInfoM38756IO.isSelected()) {
                xo0o10.XXX11i.setChecked(true);
                xo0o10.X1IX.setChecked(true);
            } else {
                xo0o10.XXX11i.setChecked(false);
                xo0o10.X1IX.setChecked(false);
            }
            xo0o10.f54810IO.setOnClickListener(new ViewOnClickListenerC22051OXO1(timeZoneInfoM38756IO, i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new XO0O10(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_timezone_pick_item, viewGroup, false));
    }

    public void setAllSelected(boolean isAll) {
        for (TimeZoneInfo timeZoneInfo : this.f54806IO) {
            timeZoneInfo.setSelected(isAll);
            InterfaceC18989iO interfaceC18989iO = this.iX1O1;
            if (interfaceC18989iO != null) {
                interfaceC18989iO.OXO1(timeZoneInfo, XXI());
            }
        }
        notifyDataSetChanged();
    }

    @Override // com.l4digital.fastscroll.FastScroller.OIi0
    public String getSectionText(int position) {
        try {
            return String.valueOf(this.f54806IO.get(position).getEnCityName().charAt(0));
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
            return "";
        }
    }
}
