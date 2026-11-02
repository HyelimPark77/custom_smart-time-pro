.class public final Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final tv_content$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xh1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xh1;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;->tv_content$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;->tv_content_delegate$lambda$0(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final getTv_content()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;->tv_content$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final tv_content_delegate$lambda$0(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c5a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 5

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f141077

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;->getTv_content()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/SpanUtils;->with(Landroid/widget/TextView;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "The open source components used in this project are as follows: \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "Do Not Translate or Localize \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "amitshekhariitbhu/Fast-Android-Networking \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "https://github.com/amitshekhariitbhu/Fast-Android-Networking \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0600b4

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$O00;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$O00;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "amitshekhariitbhu/Android-Debug-Database \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "https://github.com/amitshekhariitbhu/Android-Debug-Database \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$IiI10X;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$IiI10X;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "PhilJay/MPAndroidChart \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "https://github.com/PhilJay/MPAndroidChart \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$XOO0ii0;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$XOO0ii0;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "google/gson \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "https://github.com/google/gson \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$I0IIOi;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$I0IIOi;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "Blankj/AndroidUtilCode \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "https://github.com/Blankj/AndroidUtilCode \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$OIi0;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$OIi0;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "hongyangAndroid/baseAdapter \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "https://github.com/hongyangAndroid/baseAdapter \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$OIX0iXi;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$OIX0iXi;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "square/okhttp \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "https://github.com/square/okhttp \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$I0iXXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$I0iXXO;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "hehonghui/AndroidEventBus \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "https://github.com/hehonghui/AndroidEventBus \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$XXI;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$XXI;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "The above content follows the following open source guidelines: \n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "Apache License \n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "Version 2.0, January 2004 \n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "https://github.com/hehonghui/AndroidEventBus \n\n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$X1ii;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$X1ii;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "==================\n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "NordicSemiconductor/Android-BLE-Library \n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "https://github.com/NordicSemiconductor/Android-BLE-Library \n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v4

    invoke-static {v4, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v4, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$OXO1;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$OXO1;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "BSD 3-Clause \"New\" or \"Revised\" License \n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "Copyright (c) 2015, Nordic Semiconductor \n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "All rights reserved. \n\n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: \n\n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "* Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. \n\n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "* Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. \n\n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "* Neither the name of Nordic Semiconductor ASA nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission. \n\n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v4, "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. \n\n"

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "baoyongzhang/SwipeMenuListView \n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "https://github.com/baoyongzhang/SwipeMenuListView \n\n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$XIi00iiXO;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "angcyo/DslAdapter \n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "https://github.com/angcyo/DslAdapter \n\n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$iO;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$iO;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "ximsfei/Android-skin-support \n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v3, "https://github.com/ximsfei/Android-skin-support \n\n"

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SpanUtils;->setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$XO0O10;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$XO0O10;-><init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "The MIT License (MIT) \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    const-string v1, "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. \n\n"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/SpanUtils;->create()Landroid/text/SpannableStringBuilder;

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00d8

    return v0
.end method
