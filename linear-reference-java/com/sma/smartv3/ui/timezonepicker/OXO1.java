package com.sma.smartv3.ui.timezonepicker;

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
    public List<TimeZoneInfo> I1;
    public List<TimeZoneInfo> IO;
    public String X11iII1O1;
    public TimeZonePicker.Builder XXX11i;
    public iO iX1O1;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.timezonepicker.OXO1$OXO1, reason: collision with other inner class name */
    public class ViewOnClickListenerC0575OXO1 implements View.OnClickListener {
        public final /* synthetic */ int I1;
        public final /* synthetic */ TimeZoneInfo IO;
        public final /* synthetic */ OXO1 iX1O1;

        public ViewOnClickListenerC0575OXO1(final OXO1 this$0, final TimeZoneInfo val$item, final int val$i) {
            this.iX1O1 = this$0;
            this.IO = val$item;
            this.I1 = val$i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OXO1.OXO1(this.iX1O1).selectionMode != 1) goto L8;
            if (this.IO.isSelected() == false) goto L8;
            return;
        L8:
            if (OXO1.OXO1(this.iX1O1).maxSelectCount != 0) goto L10;
            this.iX1O1.X1ii(this.IO.getCityName());
        L23:
            if (OXO1.XIi00iiXO(this.iX1O1) == null) goto L25;
            OXO1.XIi00iiXO(this.iX1O1).OXO1(OXO1.I0IIOi(this.iX1O1, this.I1), this.iX1O1.XXI());
        L25:
            this.iX1O1.notifyDataSetChanged();
            return;
        L10:
            if (this.iX1O1.XXI() <= OXO1.OXO1(this.iX1O1).maxSelectCount) goto L13;
            return;
        L13:
            if (this.iX1O1.XXI() != OXO1.OXO1(this.iX1O1).maxSelectCount) goto L20;
            OXO1 r3 = this.iX1O1;
            int r4 = OXO1.OIi0(r3, OXO1.iO(r3), this.IO.getTimeZoneId());
            if (r4 != (-1)) goto L17;
            return;
        L17:
            if (((TimeZoneInfo) OXO1.iO(this.iX1O1).get(r4)).isSelected() == false) goto L27;
            this.iX1O1.X1ii(this.IO.getCityName());
            goto L23
        L27:
            return;
        L20:
            this.iX1O1.X1ii(this.IO.getCityName());
            goto L23
        }
    }

    public class XIi00iiXO extends Filter {
        public final /* synthetic */ OXO1 OXO1;

        public XIi00iiXO(final OXO1 this$0) {
            this.OXO1 = this$0;
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence constraint) {
            if (constraint.length() != 0) goto L5;
            List r3 = OXO1.XO0O10(this.OXO1);
            OXO1.O00(this.OXO1, null);
        L6:
            Filter.FilterResults r0 = new Filter.FilterResults();
            r0.values = r3;
            return r0;
        L5:
            r3 = OXO1.XOO0ii0(this.OXO1, constraint.toString().toLowerCase());
            goto L6
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence constraint, Filter.FilterResults results) {
            OXO1.IiI10X(this.OXO1, (List) results.values);
            this.OXO1.notifyDataSetChanged();
        }
    }

    public class XO0O10 extends RecyclerView.ViewHolder {
        public TextView I1;
        public final View IO;
        public final /* synthetic */ OXO1 X0i1O;
        public TextView X11iII1O1;
        public AppCompatRadioButton X1IX;
        public AppCompatCheckBox XXX11i;
        public TextView iX1O1;

        public XO0O10(final OXO1 this$0, View view) {
            this.X0i1O = this$0;
            super(view);
            this.IO = view;
            this.I1 = (TextView) view.findViewById(R.id.tvTitle);
            this.iX1O1 = (TextView) view.findViewById(R.id.tvName);
            this.X11iII1O1 = (TextView) view.findViewById(R.id.tvTip);
            this.XXX11i = (AppCompatCheckBox) view.findViewById(R.id.cbSelectedState);
            this.X1IX = (AppCompatRadioButton) view.findViewById(R.id.rbSelectedState);
        }

        public static /* bridge */ /* synthetic */ TextView IiI10X(XO0O10 r0) {
            return r0.I1;
        }

        public static /* bridge */ /* synthetic */ TextView O00(XO0O10 r0) {
            return r0.X11iII1O1;
        }

        public static /* bridge */ /* synthetic */ AppCompatCheckBox OXO1(XO0O10 r0) {
            return r0.XXX11i;
        }

        public static /* bridge */ /* synthetic */ View XIi00iiXO(XO0O10 r0) {
            return r0.IO;
        }

        public static /* bridge */ /* synthetic */ TextView XO0O10(XO0O10 r0) {
            return r0.iX1O1;
        }

        public static /* bridge */ /* synthetic */ AppCompatRadioButton iO(XO0O10 r0) {
            return r0.X1IX;
        }
    }

    public interface iO {
        void OXO1(TimeZoneInfo timezone, int totalSelectedTimeZones);
    }

    public OXO1(TimeZonePicker.Builder builder, List<TimeZoneInfo> timeZoneItemList, iO listener) {
        this.XXX11i = builder;
        this.IO = timeZoneItemList;
        this.I1 = timeZoneItemList;
        this.iX1O1 = listener;
    }

    public static /* bridge */ /* synthetic */ TimeZoneInfo I0IIOi(OXO1 r0, int r1) {
        return r0.IO(r1);
    }

    public static /* bridge */ /* synthetic */ void IiI10X(OXO1 r0, List r1) {
        r0.IO = r1;
    }

    public static /* bridge */ /* synthetic */ void O00(OXO1 r0, String r1) {
        r0.X11iII1O1 = r1;
    }

    public static /* bridge */ /* synthetic */ int OIi0(OXO1 r0, List r1, String r2) {
        return r0.OIX0iXi(r1, r2);
    }

    public static /* bridge */ /* synthetic */ TimeZonePicker.Builder OXO1(OXO1 r0) {
        return r0.XXX11i;
    }

    public static /* bridge */ /* synthetic */ iO XIi00iiXO(OXO1 r0) {
        return r0.iX1O1;
    }

    public static /* bridge */ /* synthetic */ List XO0O10(OXO1 r0) {
        return r0.I1;
    }

    public static /* bridge */ /* synthetic */ List XOO0ii0(OXO1 r0, String r1) {
        return r0.getFilteredResults(r1);
    }

    private List<TimeZoneInfo> getFilteredResults(String constraint) {
        ArrayList r0 = new ArrayList();
        Iterator<TimeZoneInfo> r1 = this.I1.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        TimeZoneInfo r2 = r1.next();
        if ((r2.getCityName() + " " + r2.getEnCityName().toLowerCase() + " " + r2.getDisplayName().toLowerCase() + " " + r2.getCountry().toLowerCase() + " " + r2.getGMTName().toLowerCase()).contains(constraint.toLowerCase()) == false) goto L4;
        r0.add(r2);
        goto L4
    L8:
        return r0;
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

    public static /* bridge */ /* synthetic */ List iO(OXO1 r0) {
        return r0.IO;
    }

    public ArrayList<TimeZoneInfo> I0iXXO() {
        ArrayList<TimeZoneInfo> r0 = new ArrayList();
        Iterator<TimeZoneInfo> r1 = this.I1.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        TimeZoneInfo r2 = r1.next();
        if (r2.isSelected() == false) goto L4;
        r0.add(r2);
        goto L4
    L8:
        return r0;
    }

    public final TimeZoneInfo IO(int pos) {
        return this.IO.get(pos);
    }

    public final int OIX0iXi(List<TimeZoneInfo> list, String id) {
        Iterator<TimeZoneInfo> r3 = list.iterator();
        int r0 = 0;
    L4:
        if (r3.hasNext() == false) goto L9;
        if (Objects.equals(r3.next().getCityName(), id) == true) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        return r0;
    L9:
        return -1;
    }

    public void X1ii(String id) {
        int r3 = OIX0iXi(this.IO, id);
        this.IO.get(r3).setSelected(!this.IO.get(r3).isSelected());
    }

    public int XXI() {
        if (I0iXXO() != null) goto L5;
        return 0;
    L5:
        return I0iXXO().size();
    }

    public void filterOnText(String query) {
        this.X11iII1O1 = query;
        getFilter().filter(this.X11iII1O1);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new XIi00iiXO(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<TimeZoneInfo> r0 = this.IO;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.size();
    }

    @Override // com.l4digital.fastscroll.FastScroller.OIi0
    public /* bridge */ /* synthetic */ CharSequence getSectionText(int position) {
        return getSectionText(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int i) {
        if ((holder instanceof XO0O10) == false) goto L14;
        XO0O10 r5 = (XO0O10) holder;
        TimeZoneInfo r0 = IO(i);
        XO0O10.IiI10X(r5).setText(r0.getCityName());
        highlightTerm(XO0O10.IiI10X(r5), this.X11iII1O1, XO0O10.IiI10X(r5).getText().toString());
        XO0O10.XO0O10(r5).setText(r0.getDisplayName());
        highlightTerm(XO0O10.XO0O10(r5), this.X11iII1O1, XO0O10.XO0O10(r5).getText().toString());
        XO0O10.O00(r5).setText(r0.getCountry() + "  " + r0.getGMTName());
        highlightTerm(XO0O10.O00(r5), this.X11iII1O1, XO0O10.O00(r5).getText().toString());
        if (this.XXX11i.selectionMode != 0) goto L7;
        XO0O10.OXO1(r5).setVisibility(0);
        XO0O10.iO(r5).setVisibility(8);
    L9:
        if (r0.isSelected() == false) goto L11;
        XO0O10.OXO1(r5).setChecked(true);
        XO0O10.iO(r5).setChecked(true);
    L12:
        XO0O10.XIi00iiXO(r5).setOnClickListener(new ViewOnClickListenerC0575OXO1(this, r0, i));
        return;
    L11:
        XO0O10.OXO1(r5).setChecked(false);
        XO0O10.iO(r5).setChecked(false);
        goto L12
    L7:
        XO0O10.OXO1(r5).setVisibility(8);
        XO0O10.iO(r5).setVisibility(0);
        goto L9
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new XO0O10(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_timezone_pick_item, viewGroup, false));
    }

    public void setAllSelected(boolean isAll) {
        Iterator<TimeZoneInfo> r0 = this.IO.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        TimeZoneInfo r1 = r0.next();
        r1.setSelected(isAll);
        iO r2 = this.iX1O1;
        if (r2 == null) goto L4;
        r2.OXO1(r1, XXI());
        goto L4
    L8:
        notifyDataSetChanged();
    }

    @Override // com.l4digital.fastscroll.FastScroller.OIi0
    public String getSectionText(int position) {
        return String.valueOf(this.IO.get(position).getEnCityName().charAt(0));
    L6:
        e = move-exception;
        e.printStackTrace();
        return "";
    }
}
