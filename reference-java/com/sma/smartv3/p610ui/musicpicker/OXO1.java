package com.sma.smartv3.p610ui.musicpicker;

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
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.fw0;
import com.l4digital.fastscroll.FastScroller;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class OXO1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements FastScroller.OIi0, Filterable {

    /* JADX INFO: renamed from: I1 */
    public List<fw0> f54747I1;

    /* JADX INFO: renamed from: IO */
    public List<fw0> f54748IO;
    public String X11iII1O1;
    public MusicPicker.Builder XXX11i;
    public InterfaceC18953iO iX1O1;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.musicpicker.OXO1$OXO1 */
    public class ViewOnClickListenerC22048OXO1 implements View.OnClickListener {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ int f54749I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ fw0 f54750IO;

        public ViewOnClickListenerC22048OXO1(final fw0 val$musicItem, final int val$i) {
            this.f54750IO = val$musicItem;
            this.f54749I1 = val$i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OXO1.this.XXX11i.maxSelectCount == 0) {
                OXO1.this.XXI(this.f54750IO.OIX0iXi());
            } else {
                if (OXO1.this.I0iXXO() > OXO1.this.XXX11i.maxSelectCount) {
                    return;
                }
                if (OXO1.this.I0iXXO() == OXO1.this.XXX11i.maxSelectCount) {
                    OXO1 oxo1 = OXO1.this;
                    if (!((fw0) OXO1.this.f54748IO.get(oxo1.getItemPosition(oxo1.f54748IO, this.f54750IO.OIX0iXi()))).IIX1OXO()) {
                        return;
                    } else {
                        OXO1.this.XXI(this.f54750IO.OIX0iXi());
                    }
                } else {
                    OXO1.this.XXI(this.f54750IO.OIX0iXi());
                }
            }
            if (OXO1.this.iX1O1 != null) {
                OXO1.this.iX1O1.OXO1(OXO1.this.m38580IO(this.f54749I1), OXO1.this.I0iXXO());
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
                filteredResults = OXO1.this.f54747I1;
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
            OXO1.this.f54748IO = (List) results.values;
            OXO1.this.notifyDataSetChanged();
        }
    }

    public class XO0O10 extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: I1 */
        public TextView f54751I1;

        /* JADX INFO: renamed from: IO */
        public final View f54752IO;
        public AppCompatCheckBox X11iII1O1;
        public TextView iX1O1;

        public XO0O10(View view) {
            super(view);
            this.f54752IO = view;
            this.f54751I1 = (TextView) view.findViewById(R.id.tvTitle);
            this.iX1O1 = (TextView) view.findViewById(R.id.tvName);
            this.X11iII1O1 = (AppCompatCheckBox) view.findViewById(R.id.cbSelectedState);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.musicpicker.OXO1$iO */
    public interface InterfaceC18953iO {
        void OXO1(fw0 music, int totalSelectedMusics);
    }

    public OXO1(MusicPicker.Builder builder, List<fw0> musicItemList, InterfaceC18953iO listener) {
        this.XXX11i = builder;
        this.f54748IO = musicItemList;
        this.f54747I1 = musicItemList;
        this.iX1O1 = listener;
    }

    public int I0iXXO() {
        if (OIX0iXi() != null) {
            return OIX0iXi().size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: IO */
    public final fw0 m38580IO(int pos) {
        return this.f54748IO.get(pos);
    }

    public List<fw0> OIX0iXi() {
        ArrayList arrayList = new ArrayList();
        for (fw0 fw0Var : this.f54747I1) {
            if (fw0Var.IIX1OXO()) {
                arrayList.add(fw0Var);
            }
        }
        return arrayList;
    }

    public void XXI(long id) {
        int itemPosition = getItemPosition(this.f54748IO, id);
        this.f54748IO.get(itemPosition).X01IiOiIi(!this.f54748IO.get(itemPosition).IIX1OXO());
    }

    public void filterOnText(String query) {
        this.X11iII1O1 = query;
        getFilter().filter(this.X11iII1O1);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new XIi00iiXO();
    }

    public final List<fw0> getFilteredResults(String constraint) {
        ArrayList arrayList = new ArrayList();
        for (fw0 fw0Var : this.f54747I1) {
            if (fw0Var.getTitle().toLowerCase().contains(constraint)) {
                arrayList.add(fw0Var);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<fw0> list = this.f54748IO;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int getItemPosition(List<fw0> list, long mid) {
        Iterator<fw0> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().OIX0iXi() == mid) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void highlightTerm(TextView tv, String query, String originalString) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int i) {
        String str;
        if (holder instanceof XO0O10) {
            XO0O10 xo0o10 = (XO0O10) holder;
            fw0 fw0VarM38580IO = m38580IO(i);
            String title = fw0VarM38580IO.getTitle();
            float fO10IXXX0X = (fw0VarM38580IO.O10IXXX0X() / 1024.0f) / 1024.0f;
            if (fw0VarM38580IO.IiI10X().startsWith("<unk") && fw0VarM38580IO.XIi00iiXO().equals("0")) {
                str = String.format(Locale.ENGLISH, "%.2fMB", Float.valueOf(fO10IXXX0X));
            } else {
                str = fw0VarM38580IO.IiI10X() + " - " + fw0VarM38580IO.XIi00iiXO() + "   " + String.format(Locale.ENGLISH, "%.2fMB", Float.valueOf(fO10IXXX0X));
            }
            xo0o10.f54751I1.setText(title);
            xo0o10.iX1O1.setText(str);
            highlightTerm(xo0o10.f54751I1, this.X11iII1O1, xo0o10.f54751I1.getText().toString());
            highlightTerm(xo0o10.iX1O1, this.X11iII1O1, xo0o10.iX1O1.getText().toString());
            if (fw0VarM38580IO.IIX1OXO()) {
                xo0o10.X11iII1O1.setChecked(true);
            } else {
                xo0o10.X11iII1O1.setChecked(false);
            }
            xo0o10.f54752IO.setOnClickListener(new ViewOnClickListenerC22048OXO1(fw0VarM38580IO, i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new XO0O10(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_music_pick_item, viewGroup, false));
    }

    public void setAllSelected(boolean isAll) {
        for (fw0 fw0Var : this.f54748IO) {
            fw0Var.X01IiOiIi(isAll);
            InterfaceC18953iO interfaceC18953iO = this.iX1O1;
            if (interfaceC18953iO != null) {
                interfaceC18953iO.OXO1(fw0Var, I0iXXO());
            }
        }
        notifyDataSetChanged();
    }

    @Override // com.l4digital.fastscroll.FastScroller.OIi0
    public String getSectionText(int position) {
        try {
            return String.valueOf(this.f54748IO.get(position).getTitle().charAt(0));
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
            return "";
        }
    }
}
