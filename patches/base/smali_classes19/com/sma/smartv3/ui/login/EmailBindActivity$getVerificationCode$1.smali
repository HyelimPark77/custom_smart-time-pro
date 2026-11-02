.class public final Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/EmailBindActivity;->getVerificationCode(Landroid/view/View;)V
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
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code=2003"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getTvCodeError(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    const v0, 0x7f140142

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v2, 0x7f140d1c

    invoke-virtual {p1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getTvCodeError(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "code=2002"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getTvCodeError(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getTvCodeError(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    const v1, 0x7f141497

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity$getVerificationCode$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
