.class public final Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/WebViewV2Activity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/WebViewV2Activity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Landroid/webkit/ValueCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    const-string v0, "uploadMsg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->setMUploadMessage(Landroid/webkit/ValueCallback;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->pickFile()V

    return-void
.end method

.method public final XIi00iiXO(Landroid/webkit/ValueCallback;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string p2, "uploadMsg"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;->OXO1(Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public final iO(Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string p2, "uploadMsg"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;->OXO1(Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/webkit/WebChromeClient$FileChooserParams;",
            ")Z"
        }
    .end annotation

    const-string v0, "webView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "filePathCallback"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "fileChooserParams"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->setMUploadMessageArray(Landroid/webkit/ValueCallback;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->pickFile()V

    const/4 p1, 0x1

    return p1
.end method
