.class public final Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$XIi00iiXO;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWebTransChargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebTransChargeActivity.kt\ncom/sma/smartv3/ui/translate/WebTransChargeActivity$webViewClient$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,177:1\n29#2:178\n*S KotlinDebug\n*F\n+ 1 WebTransChargeActivity.kt\ncom/sma/smartv3/ui/translate/WebTransChargeActivity$webViewClient$1\n*L\n140#1:178\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWebTransChargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebTransChargeActivity.kt\ncom/sma/smartv3/ui/translate/WebTransChargeActivity$webViewClient$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,177:1\n29#2:178\n*S KotlinDebug\n*F\n+ 1 WebTransChargeActivity.kt\ncom/sma/smartv3/ui/translate/WebTransChargeActivity$webViewClient$1\n*L\n140#1:178\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 12

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wexin://"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    const/4 v4, 0x1

    const-string v5, "android.intent.action.VIEW"

    if-nez v0, :cond_0

    const-string v0, "alipays://"

    invoke-static {p2, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mqqapi://"

    invoke-static {p2, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object v6, p2

    goto :goto_1

    :cond_1
    const-string v0, "https://www.codingiot.net/cofit/?code="

    invoke-static {p2, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "https://www.codingiot.net/smarttimepro/?code="

    invoke-static {p2, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "https://api.whatsapp.com"

    invoke-static {p2, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return v4

    :cond_3
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "https"

    const-string v8, "apphttps"

    const/4 v9, 0x0

    move-object v6, p2

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return v4

    :goto_1
    :try_start_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p2, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;

    const p2, 0x7f1410b0

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    return v4
.end method
