package com.bestmafen.androidbase.adapter.recyclerview.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class ViewHolder extends RecyclerView.ViewHolder {
    private Context mContext;
    private View mConvertView;
    private SparseArray<View> mViews;

    public ViewHolder(Context r1, View r2) {
        super(r2);
        this.mContext = r1;
        this.mConvertView = r2;
        this.mViews = new SparseArray();
    }

    public static ViewHolder createViewHolder(Context r1, View r2) {
        return new ViewHolder(r1, r2);
    }

    public View getConvertView() {
        return this.mConvertView;
    }

    public <T extends View> T getView(int r3) {
        T r0 = (T) this.mViews.get(r3);
        if (r0 != null) goto L6;
        T r1 = (T) this.mConvertView.findViewById(r3);
        this.mViews.put(r3, r1);
        return r1;
    L6:
        return r0;
    }

    public ViewHolder linkify(int r2) {
        Linkify.addLinks((TextView) getView(r2), 15);
        return this;
    }

    @SuppressLint({"NewApi"})
    public ViewHolder setAlpha(int r1, float r2) {
        getView(r1).setAlpha(r2);
        return this;
    }

    public ViewHolder setBackgroundColor(int r1, int r2) {
        getView(r1).setBackgroundColor(r2);
        return this;
    }

    public ViewHolder setBackgroundRes(int r1, int r2) {
        getView(r1).setBackgroundResource(r2);
        return this;
    }

    public ViewHolder setChecked(int r1, boolean r2) {
        ((Checkable) getView(r1)).setChecked(r2);
        return this;
    }

    public ViewHolder setImageBitmap(int r1, Bitmap r2) {
        ((ImageView) getView(r1)).setImageBitmap(r2);
        return this;
    }

    public ViewHolder setImageDrawable(int r1, Drawable r2) {
        ((ImageView) getView(r1)).setImageDrawable(r2);
        return this;
    }

    public ViewHolder setImageResource(int r1, int r2) {
        ((ImageView) getView(r1)).setImageResource(r2);
        return this;
    }

    public ViewHolder setMax(int r1, int r2) {
        ((ProgressBar) getView(r1)).setMax(r2);
        return this;
    }

    public ViewHolder setOnClickListener(int r1, View.OnClickListener r2) {
        getView(r1).setOnClickListener(r2);
        return this;
    }

    public ViewHolder setOnLongClickListener(int r1, View.OnLongClickListener r2) {
        getView(r1).setOnLongClickListener(r2);
        return this;
    }

    public ViewHolder setOnTouchListener(int r1, View.OnTouchListener r2) {
        getView(r1).setOnTouchListener(r2);
        return this;
    }

    public ViewHolder setProgress(int r1, int r2) {
        ((ProgressBar) getView(r1)).setProgress(r2);
        return this;
    }

    public ViewHolder setRating(int r1, float r2) {
        ((RatingBar) getView(r1)).setRating(r2);
        return this;
    }

    public ViewHolder setTag(int r1, Object r2) {
        getView(r1).setTag(r2);
        return this;
    }

    public ViewHolder setText(int r1, String r2) {
        ((TextView) getView(r1)).setText(r2);
        return this;
    }

    public ViewHolder setTextColor(int r1, int r2) {
        ((TextView) getView(r1)).setTextColor(r2);
        return this;
    }

    public ViewHolder setTextColorRes(int r2, int r3) {
        ((TextView) getView(r2)).setTextColor(this.mContext.getResources().getColor(r3));
        return this;
    }

    public ViewHolder setTypeface(Typeface r5, int... r6) {
        int r0 = r6.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        TextView r2 = (TextView) getView(r6[r1]);
        r2.setTypeface(r5);
        r2.setPaintFlags(r2.getPaintFlags() | 128);
        r1 = r1 + 1;
        goto L3
    L5:
        return this;
    }

    public ViewHolder setVisible(int r1, boolean r2) {
        View r3 = getView(r1);
        if (r2 == false) goto L5;
        int r4 = 0;
    L6:
        r3.setVisibility(r4);
        return this;
    L5:
        r4 = 8;
        goto L6
    }

    public static ViewHolder createViewHolder(Context r2, ViewGroup r3, int r4) {
        return new ViewHolder(r2, LayoutInflater.from(r2).inflate(r4, r3, false));
    }

    public ViewHolder setProgress(int r1, int r2, int r3) {
        ProgressBar r4 = (ProgressBar) getView(r1);
        r4.setMax(r3);
        r4.setProgress(r2);
        return this;
    }

    public ViewHolder setRating(int r1, float r2, int r3) {
        RatingBar r4 = (RatingBar) getView(r1);
        r4.setMax(r3);
        r4.setRating(r2);
        return this;
    }

    public ViewHolder setTag(int r1, int r2, Object r3) {
        getView(r1).setTag(r2, r3);
        return this;
    }
}
