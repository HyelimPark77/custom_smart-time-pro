package com.sma.smartv3.p610ui.device.dial;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I0OIO1i;
import com.android.mltcode.paycertificationapi.X11iXOOOi;
import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.FileUtils;
import com.sma.smartv3.p610ui.device.dial.DialBgFilePickerPopup;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DialBgFilePickerPopup extends I0OIO1i {

    @aa1
    public final Button I0IIOi;

    @aa1
    public final RecyclerView OIi0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.DialBgFilePickerPopup$1 */
    public static final class C187981 extends CommonAdapter<String> {
        final /* synthetic */ X11iXOOOi $callback;
        final /* synthetic */ DialBgFilePickerPopup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C187981(Activity activity, List<String> list, X11iXOOOi x11iXOOOi, DialBgFilePickerPopup dialBgFilePickerPopup) {
            super(activity, R.layout.item_dial_bg_file_picker, list);
            this.$callback = x11iXOOOi;
            this.this$0 = dialBgFilePickerPopup;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(X11iXOOOi x11iXOOOi, int i, DialBgFilePickerPopup dialBgFilePickerPopup, View view) {
            x11iXOOOi.OXO1(i);
            dialBgFilePickerPopup.dismiss();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, String path, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(path, "path");
            ImageView imageView = (ImageView) holder.getView(R.id.f51417iv);
            if (FileUtils.isFileExists(path)) {
                imageView.setImageURI(Uri.fromFile(new File(path)));
            }
            ImageView imageView2 = (ImageView) holder.getView(R.id.f51417iv);
            final X11iXOOOi x11iXOOOi = this.$callback;
            final DialBgFilePickerPopup dialBgFilePickerPopup = this.this$0;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OO0Ii0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialBgFilePickerPopup.C187981.convert$lambda$0(x11iXOOOi, i, dialBgFilePickerPopup, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialBgFilePickerPopup(@aa1 Activity activity, @aa1 List<String> paths, @aa1 X11iXOOOi callback) {
        super(activity);
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(paths, "paths");
        Intrinsics.X0O(callback, "callback");
        LayoutInflater.from(XO0O10()).inflate(R.layout.pop_dial_bg_file_picker, IiI10X());
        View viewFindViewById = IiI10X().findViewById(R.id.btn_bottom);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.I0IIOi = (Button) viewFindViewById;
        View viewFindViewById2 = IiI10X().findViewById(R.id.f51422rv);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.OIi0 = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(XO0O10(), 2));
        recyclerView.setAdapter(new C187981(activity, paths, callback, this));
    }

    @aa1
    public final Button OiIIX101O() {
        return this.I0IIOi;
    }

    @aa1
    public final RecyclerView XiOIii1() {
        return this.OIi0;
    }
}
