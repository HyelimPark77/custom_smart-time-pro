package com.sma.smartv3.p610ui.trim;

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
    private final List<Bitmap> mBitmaps = new ArrayList();
    private final LayoutInflater mInflater;

    public static final class OXO1 extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: IO */
        public ImageView f54880IO;

        public OXO1(View itemView) {
            super(itemView);
            ImageView imageView = (ImageView) itemView.findViewById(R.id.thumb);
            this.f54880IO = imageView;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.width = ag6.I0IIOi / 10;
            this.f54880IO.setLayoutParams(layoutParams);
        }
    }

    public VideoTrimmerAdapter(Context context) {
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
        ((OXO1) holder).f54880IO.setImageBitmap(this.mBitmaps.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OXO1(this.mInflater.inflate(R.layout.video_thumb_item_layout, parent, false));
    }
}
