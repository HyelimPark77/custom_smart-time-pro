.class public final Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/AboutActivity;->onUploadLog(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Ljava/io/File;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/me/AboutActivity;

.field public final synthetic XO0O10:Landroid/widget/FrameLayout;

.field public final synthetic iO:Lcom/android/mltcode/paycertificationapi/go0;


# direct methods
.method public constructor <init>(Ljava/io/File;Lcom/sma/smartv3/ui/me/AboutActivity;Lcom/android/mltcode/paycertificationapi/go0;Landroid/widget/FrameLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->OXO1:Ljava/io/File;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->XIi00iiXO:Lcom/sma/smartv3/ui/me/AboutActivity;

    iput-object p3, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->iO:Lcom/android/mltcode/paycertificationapi/go0;

    iput-object p4, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->XO0O10:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/me/AboutActivity;Landroid/widget/FrameLayout;)Z
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/AboutActivity;->access$getMContext(Lcom/sma/smartv3/ui/me/AboutActivity;)Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/i10X0X0i;

    invoke-direct {v2, p1, p0}, Lcom/android/mltcode/paycertificationapi/i10X0X0i;-><init>(Landroid/widget/FrameLayout;Lcom/sma/smartv3/ui/me/AboutActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/hr1;->OiIIX101O(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final O00(Lcom/android/mltcode/paycertificationapi/go0;Lcom/sma/smartv3/ui/me/AboutActivity;Landroid/widget/FrameLayout;)V
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p0, 0x7f141475

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const p0, 0x7f141231

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const p0, 0x7f14027f

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v0, p0, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/i1i;

    invoke-direct {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/i1i;-><init>(Lcom/sma/smartv3/ui/me/AboutActivity;Landroid/widget/FrameLayout;)V

    const p1, 0x7f14122f

    invoke-virtual {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/AboutActivity;Landroid/widget/FrameLayout;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->IiI10X(Lcom/sma/smartv3/ui/me/AboutActivity;Landroid/widget/FrameLayout;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XIi00iiXO(Lcom/android/mltcode/paycertificationapi/go0;Lcom/sma/smartv3/ui/me/AboutActivity;Landroid/widget/FrameLayout;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->O00(Lcom/android/mltcode/paycertificationapi/go0;Lcom/sma/smartv3/ui/me/AboutActivity;Landroid/widget/FrameLayout;)V

    return-void
.end method

.method public static final XOO0ii0(Landroid/widget/FrameLayout;Lcom/sma/smartv3/ui/me/AboutActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p2, :cond_0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ImageUtils;->view2Bitmap(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object p0

    sget-object p2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p0, p2}, Lcom/blankj/utilcode/util/ImageUtils;->save2Album(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;)Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/blankj/utilcode/util/IntentUtils;->getShareImageIntent(Ljava/io/File;)Landroid/content/Intent;

    move-result-object p0

    const-string p2, "Share Log"

    invoke-static {p0, p2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Landroid/widget/FrameLayout;Lcom/sma/smartv3/ui/me/AboutActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->XOO0ii0(Landroid/widget/FrameLayout;Lcom/sma/smartv3/ui/me/AboutActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public XO0O10(Ljava/lang/String;)V
    .locals 3

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->OXO1:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->XIi00iiXO:Lcom/sma/smartv3/ui/me/AboutActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/AboutActivity;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/me/AboutActivity;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "UPLOADED_LOG_TIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->XIi00iiXO:Lcom/sma/smartv3/ui/me/AboutActivity;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->iO:Lcom/android/mltcode/paycertificationapi/go0;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->XO0O10:Landroid/widget/FrameLayout;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IIiiIiXiI;

    invoke-direct {v2, v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/IIiiIiXiI;-><init>(Lcom/android/mltcode/paycertificationapi/go0;Lcom/sma/smartv3/ui/me/AboutActivity;Landroid/widget/FrameLayout;)V

    invoke-virtual {p1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->OXO1:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->XIi00iiXO:Lcom/sma/smartv3/ui/me/AboutActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/AboutActivity;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/me/AboutActivity;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->XIi00iiXO:Lcom/sma/smartv3/ui/me/AboutActivity;

    const v0, 0x7f141471

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/AboutActivity$onUploadLog$2$1$2$1$1;->XO0O10(Ljava/lang/String;)V

    return-void
.end method
