package com.sma.smartv3.p610ui.p612me;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SpanUtils;
import com.sma.smartv3.p610ui.p612me.OpenSourceComponentNotification;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OpenSourceComponentNotification extends BaseActivity {

    @aa1
    private final Lazy tv_content$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xh1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return OpenSourceComponentNotification.tv_content_delegate$lambda$0(this.f12171IO);
        }
    });

    public static final class I0IIOi extends ClickableSpan {
        public I0IIOi() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/google/gson");
        }
    }

    public static final class I0iXXO extends ClickableSpan {
        public I0iXXO() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/square/okhttp");
        }
    }

    public static final class IiI10X extends ClickableSpan {
        public IiI10X() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/amitshekhariitbhu/Android-Debug-Database");
        }
    }

    public static final class O00 extends ClickableSpan {
        public O00() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/amitshekhariitbhu/Fast-Android-Networking");
        }
    }

    public static final class OIX0iXi extends ClickableSpan {
        public OIX0iXi() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/hongyangAndroid/baseAdapter");
        }
    }

    public static final class OIi0 extends ClickableSpan {
        public OIi0() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/Blankj/AndroidUtilCode");
        }
    }

    public static final class OXO1 extends ClickableSpan {
        public OXO1() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/NordicSemiconductor/Android-BLE-Library");
        }
    }

    public static final class X1ii extends ClickableSpan {
        public X1ii() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/hehonghui/AndroidEventBus");
        }
    }

    public static final class XIi00iiXO extends ClickableSpan {
        public XIi00iiXO() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/baoyongzhang/SwipeMenuListView");
        }
    }

    public static final class XO0O10 extends ClickableSpan {
        public XO0O10() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/ximsfei/Android-skin-support");
        }
    }

    public static final class XOO0ii0 extends ClickableSpan {
        public XOO0ii0() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/PhilJay/MPAndroidChart");
        }
    }

    public static final class XXI extends ClickableSpan {
        public XXI() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/hehonghui/AndroidEventBus");
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.OpenSourceComponentNotification$iO */
    public static final class C18946iO extends ClickableSpan {
        public C18946iO() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            X1OOO.i010I(OpenSourceComponentNotification.this, "https://github.com/angcyo/DslAdapter");
        }
    }

    private final TextView getTv_content() {
        return (TextView) this.tv_content$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_content_delegate$lambda$0(OpenSourceComponentNotification openSourceComponentNotification) {
        return (TextView) openSourceComponentNotification.findViewById(R.id.tv_content);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.open_source_notification);
        SpanUtils.with(getTv_content()).append("The open source components used in this project are as follows: \n").append("Do Not Translate or Localize \n\n").append("amitshekhariitbhu/Fast-Android-Networking \n").append("https://github.com/amitshekhariitbhu/Fast-Android-Networking \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new O00()).append("amitshekhariitbhu/Android-Debug-Database \n").append("https://github.com/amitshekhariitbhu/Android-Debug-Database \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new IiI10X()).append("PhilJay/MPAndroidChart \n").append("https://github.com/PhilJay/MPAndroidChart \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new XOO0ii0()).append("google/gson \n").append("https://github.com/google/gson \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new I0IIOi()).append("Blankj/AndroidUtilCode \n").append("https://github.com/Blankj/AndroidUtilCode \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new OIi0()).append("hongyangAndroid/baseAdapter \n").append("https://github.com/hongyangAndroid/baseAdapter \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new OIX0iXi()).append("square/okhttp \n").append("https://github.com/square/okhttp \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new I0iXXO()).append("hehonghui/AndroidEventBus \n").append("https://github.com/hehonghui/AndroidEventBus \n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new XXI()).append("The above content follows the following open source guidelines: \n").append("Apache License \n").append("Version 2.0, January 2004 \n").append("https://github.com/hehonghui/AndroidEventBus \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new X1ii()).append("==================\n").append("NordicSemiconductor/Android-BLE-Library \n").append("https://github.com/NordicSemiconductor/Android-BLE-Library \n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new OXO1()).append("The above content follows the following open source guidelines: \n").append("BSD 3-Clause \"New\" or \"Revised\" License \n").append("Copyright (c) 2015, Nordic Semiconductor \n").append("All rights reserved. \n\n").append("Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: \n\n").append("* Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. \n\n").append("* Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. \n\n").append("* Neither the name of Nordic Semiconductor ASA nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission. \n\n").append("THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. \n\n").append("==================\n").append("baoyongzhang/SwipeMenuListView \n").append("https://github.com/baoyongzhang/SwipeMenuListView \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new XIi00iiXO()).append("angcyo/DslAdapter \n").append("https://github.com/angcyo/DslAdapter \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new C18946iO()).append("ximsfei/Android-skin-support \n").append("https://github.com/ximsfei/Android-skin-support \n\n").setForegroundColor(ContextCompat.getColor(getMContext(), R.color.colorAccent)).setClickSpan(new XO0O10()).append("The above content follows the following open source guidelines: \n").append("The MIT License (MIT) \n\n").append("Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: \n\n").append("The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. \n\n").append("THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. \n\n").create();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_open_source;
    }
}
