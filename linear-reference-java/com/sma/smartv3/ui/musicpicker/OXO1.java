package com.sma.smartv3.ui.musicpicker;

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
    public List<fw0> I1;
    public List<fw0> IO;
    public String X11iII1O1;
    public MusicPicker.Builder XXX11i;
    public iO iX1O1;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.musicpicker.OXO1$OXO1, reason: collision with other inner class name */
    public class ViewOnClickListenerC0572OXO1 implements View.OnClickListener {
        public final /* synthetic */ int I1;
        public final /* synthetic */ fw0 IO;
        public final /* synthetic */ OXO1 iX1O1;

        public ViewOnClickListenerC0572OXO1(final OXO1 this$0, final fw0 val$musicItem, final int val$i) {
            this.iX1O1 = this$0;
            this.IO = val$musicItem;
            this.I1 = val$i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OXO1.OXO1(this.iX1O1).maxSelectCount != 0) goto L5;
            this.iX1O1.XXI(OIX0iXi());
        L16:
            if (OXO1.XIi00iiXO(this.iX1O1) == null) goto L18;
            OXO1.XIi00iiXO(this.iX1O1).OXO1(OXO1.I0IIOi(this.iX1O1, this.I1), this.iX1O1.I0iXXO());
        L18:
            this.iX1O1.notifyDataSetChanged();
            return;
        L5:
            if (this.iX1O1.I0iXXO() <= OXO1.OXO1(this.iX1O1).maxSelectCount) goto L8;
            return;
        L8:
            if (this.iX1O1.I0iXXO() != OXO1.OXO1(this.iX1O1).maxSelectCount) goto L13;
            OXO1 r4 = this.iX1O1;
            int r5 = OXO1.OIi0(r4, OXO1.iO(r4), OIX0iXi());
            if (((fw0) OXO1.iO(this.iX1O1).get(r5)).IIX1OXO() == false) goto L12;
            this.iX1O1.XXI(OIX0iXi());
            goto L16
        L12:
            return;
        L13:
            this.iX1O1.XXI(OIX0iXi());
            goto L16
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
        public AppCompatCheckBox X11iII1O1;
        public final /* synthetic */ OXO1 XXX11i;
        public TextView iX1O1;

        public XO0O10(final OXO1 this$0, View view) {
            this.XXX11i = this$0;
            super(view);
            this.IO = view;
            this.I1 = (TextView) view.findViewById(R.id.tvTitle);
            this.iX1O1 = (TextView) view.findViewById(R.id.tvName);
            this.X11iII1O1 = (AppCompatCheckBox) view.findViewById(R.id.cbSelectedState);
        }

        public static /* bridge */ /* synthetic */ AppCompatCheckBox OXO1(XO0O10 r0) {
            return r0.X11iII1O1;
        }

        public static /* bridge */ /* synthetic */ View XIi00iiXO(XO0O10 r0) {
            return r0.IO;
        }

        public static /* bridge */ /* synthetic */ TextView XO0O10(XO0O10 r0) {
            return r0.I1;
        }

        public static /* bridge */ /* synthetic */ TextView iO(XO0O10 r0) {
            return r0.iX1O1;
        }
    }

    public interface iO {
        void OXO1(fw0 music, int totalSelectedMusics);
    }

    public OXO1(MusicPicker.Builder builder, List<fw0> musicItemList, iO listener) {
        this.XXX11i = builder;
        this.IO = musicItemList;
        this.I1 = musicItemList;
        this.iX1O1 = listener;
    }

    public static /* bridge */ /* synthetic */ fw0 I0IIOi(OXO1 r0, int r1) {
        return r0.IO(r1);
    }

    public static /* bridge */ /* synthetic */ void IiI10X(OXO1 r0, List r1) {
        r0.IO = r1;
    }

    public static /* bridge */ /* synthetic */ void O00(OXO1 r0, String r1) {
        r0.X11iII1O1 = r1;
    }

    public static /* bridge */ /* synthetic */ int OIi0(OXO1 r0, List r1, long r2) {
        return r0.getItemPosition(r1, r2);
    }

    public static /* bridge */ /* synthetic */ MusicPicker.Builder OXO1(OXO1 r0) {
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

    public static /* bridge */ /* synthetic */ List iO(OXO1 r0) {
        return r0.IO;
    }

    public int I0iXXO() {
        if (OIX0iXi() != null) goto L5;
        return 0;
    L5:
        return OIX0iXi().size();
    }

    public final fw0 IO(int pos) {
        return this.IO.get(pos);
    }

    public List<fw0> OIX0iXi() {
        ArrayList r0 = new ArrayList();
        Iterator<fw0> r1 = this.I1.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        fw0 r2 = r1.next();
        if (r2.IIX1OXO() == false) goto L4;
        r0.add(r2);
        goto L4
    L8:
        return r0;
    }

    public void XXI(long id) {
        int r2 = getItemPosition(this.IO, id);
        this.IO.get(r2).X01IiOiIi(!this.IO.get(r2).IIX1OXO());
    }

    public void filterOnText(String query) {
        this.X11iII1O1 = query;
        getFilter().filter(this.X11iII1O1);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new XIi00iiXO(this);
    }

    public final List<fw0> getFilteredResults(String constraint) {
        ArrayList r0 = new ArrayList();
        Iterator<fw0> r1 = this.I1.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        fw0 r2 = r1.next();
        if (r2.getTitle().toLowerCase().contains(constraint) == false) goto L4;
        r0.add(r2);
        goto L4
    L8:
        return r0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<fw0> r0 = this.IO;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.size();
    }

    public final int getItemPosition(List<fw0> list, long mid) {
        Iterator<fw0> r4 = list.iterator();
        int r0 = 0;
    L4:
        if (r4.hasNext() == false) goto L9;
        if (r4.next().OIX0iXi() == mid) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        return r0;
    L9:
        return -1;
    }

    @Override // com.l4digital.fastscroll.FastScroller.OIi0
    public /* bridge */ /* synthetic */ CharSequence getSectionText(int position) {
        return getSectionText(position);
    }

    public final void highlightTerm(TextView tv, String query, String originalString) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int i) {
        if ((holder instanceof XO0O10) == false) goto L16;
        XO0O10 r7 = (XO0O10) holder;
        fw0 r0 = IO(i);
        String r1 = r0.getTitle();
        float r2 = (r0.O10IXXX0X() / 1024.0f) / 1024.0f;
        if (r0.IiI10X().startsWith("<unk") == true) goto L7;
    L9:
        String r3 = r0.IiI10X() + " - " + r0.XIi00iiXO() + "   " + String.format(Locale.ENGLISH, "%.2fMB", new Object[]{Float.valueOf(r2)});
    L10:
        XO0O10.XO0O10(r7).setText(r1);
        XO0O10.iO(r7).setText(r3);
        highlightTerm(XO0O10.XO0O10(r7), this.X11iII1O1, XO0O10.XO0O10(r7).getText().toString());
        highlightTerm(XO0O10.iO(r7), this.X11iII1O1, XO0O10.iO(r7).getText().toString());
        if (r0.IIX1OXO() == false) goto L13;
        XO0O10.OXO1(r7).setChecked(true);
    L14:
        XO0O10.XIi00iiXO(r7).setOnClickListener(new ViewOnClickListenerC0572OXO1(this, r0, i));
        return;
    L13:
        XO0O10.OXO1(r7).setChecked(false);
        goto L14
    L7:
        if (r0.XIi00iiXO().equals("0") == false) goto L9;
        r3 = String.format(Locale.ENGLISH, "%.2fMB", new Object[]{Float.valueOf(r2)});
        goto L10
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new XO0O10(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_music_pick_item, viewGroup, false));
    }

    public void setAllSelected(boolean isAll) {
        Iterator<fw0> r0 = this.IO.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        fw0 r1 = r0.next();
        r1.X01IiOiIi(isAll);
        iO r2 = this.iX1O1;
        if (r2 == null) goto L4;
        r2.OXO1(r1, I0iXXO());
        goto L4
    L8:
        notifyDataSetChanged();
    }

    @Override // com.l4digital.fastscroll.FastScroller.OIi0
    public String getSectionText(int position) {
        return String.valueOf(this.IO.get(position).getTitle().charAt(0));
    L6:
        e = move-exception;
        e.printStackTrace();
        return "";
    }
}
