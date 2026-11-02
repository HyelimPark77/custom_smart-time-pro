.class public final Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->downloadMap(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

.field public final synthetic XIi00iiXO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->XIi00iiXO:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 7

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " download -> handleResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->XIi00iiXO:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v3, p1, v1, v6}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setInProgress(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMProgressButton(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const-string v1, "access$getMProgressButton(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    const v2, 0x7f1402fc

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {p1, v1, v0, v2, v6}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  download handleError error: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setInProgress(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMProgressButton(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const-string v1, "access$getMProgressButton(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    const v2, 0x7f140c43

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v0, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMProgressButton(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    int-to-float p1, p1

    const/16 v1, 0x64

    int-to-float v1, v1

    div-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
