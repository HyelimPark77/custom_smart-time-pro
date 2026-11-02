package com.sma.smartv3.ui.device.dial;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I0OIO1i;
import com.android.mltcode.paycertificationapi.OO0Ii0;
import com.android.mltcode.paycertificationapi.X11iXOOOi;
import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.FileUtils;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.DialBgFilePickerPopup$1, reason: invalid class name */
    public static final class AnonymousClass1 extends CommonAdapter<String> {
        final /* synthetic */ X11iXOOOi $callback;
        final /* synthetic */ DialBgFilePickerPopup this$0;

        public AnonymousClass1(Activity r1, List<String> r2, X11iXOOOi r3, DialBgFilePickerPopup r4) {
            this.$callback = r3;
            this.this$0 = r4;
            super(r1, R.layout.item_dial_bg_file_picker, r2);
        }

        public static /* synthetic */ void OXO1(X11iXOOOi r0, int r1, DialBgFilePickerPopup r2, View r3) {
            convert$lambda$0(r0, r1, r2, r3);
        }

        private static final void convert$lambda$0(X11iXOOOi r0, int r1, DialBgFilePickerPopup r2, View r3) {
            r0.OXO1(r1);
            r2.dismiss();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, String r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r4, String r5, final int r6) {
            Intrinsics.X0O(r4, "holder");
            Intrinsics.X0O(r5, "path");
            ImageView r1 = (ImageView) r4.getView(R.id.iv);
            if (FileUtils.isFileExists(r5) == false) goto L5;
            r1.setImageURI(Uri.fromFile(new File(r5)));
        L5:
            ImageView r7 = (ImageView) r4.getView(R.id.iv);
            final X11iXOOOi r8 = this.$callback;
            final DialBgFilePickerPopup r0 = this.this$0;
            r7.setOnClickListener(new OO0Ii0(r8, r6, r0));
        }
    }

    public DialBgFilePickerPopup(@aa1 Activity r5, @aa1 List<String> r6, @aa1 X11iXOOOi r7) {
        Intrinsics.X0O(r5, "activity");
        Intrinsics.X0O(r6, "paths");
        Intrinsics.X0O(r7, "callback");
        super(r5);
        LayoutInflater.from(XO0O10()).inflate(R.layout.pop_dial_bg_file_picker, IiI10X());
        View r0 = IiI10X().findViewById(R.id.btn_bottom);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        this.I0IIOi = (Button) r0;
        View r1 = IiI10X().findViewById(R.id.rv);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        RecyclerView r2 = (RecyclerView) r1;
        this.OIi0 = r2;
        r2.setLayoutManager(new GridLayoutManager(XO0O10(), 2));
        r2.setAdapter(new AnonymousClass1(r5, r6, r7, this));
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
