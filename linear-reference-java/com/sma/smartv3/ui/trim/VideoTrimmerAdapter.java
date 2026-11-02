package com.sma.smartv3.ui.trim;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.ag6;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class VideoTrimmerAdapter extends RecyclerView.Adapter {
    private final List<Bitmap> mBitmaps;
    private final LayoutInflater mInflater;

    public static final class OXO1 extends RecyclerView.ViewHolder {
        public ImageView IO;

        public OXO1(View itemView) {
            super(itemView);
            ImageView r2 = (ImageView) itemView.findViewById(R.id.thumb);
            this.IO = r2;
            LinearLayout.LayoutParams r3 = (LinearLayout.LayoutParams) r2.getLayoutParams();
            r3.width = ag6.I0IIOi / 10;
            this.IO.setLayoutParams(r3);
        }
    }

    public VideoTrimmerAdapter(Context context) {
        this.mBitmaps = new ArrayList();
        this.mInflater = LayoutInflater.from(context);
    }

    public void addBitmaps(Bitmap bitmap) {
        this.mBitmaps.add(bitmap);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mBitmaps.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((OXO1) holder).IO.setImageBitmap(this.mBitmaps.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OXO1(this.mInflater.inflate(R.layout.video_thumb_item_layout, parent, false));
    }
}
