.class public final Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->query(I)V
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
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getTvState(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x30

    if-eq v1, v2, :cond_8

    const/16 v2, 0x31

    if-eq v1, v2, :cond_6

    const/16 v2, 0x5a4

    if-eq v1, v2, :cond_4

    const/16 v2, 0x5a5

    if-eq v1, v2, :cond_2

    const/16 v2, 0x720

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "99"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "\u6062\u590d\u4e86\u9ed8\u8ba4\u72b6\u6001"

    goto :goto_1

    :cond_2
    const-string v1, "-2"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const-string v1, "\u4e0d\u652f\u6301"

    goto :goto_1

    :cond_4
    const-string v1, "-1"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const-string v1, "\u4e0d\u5b58\u5728\u6388\u6743\u7801"

    goto :goto_1

    :cond_6
    const-string v1, "1"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const-string v1, "\u6807\u8bb0\u6210\u529f"

    goto :goto_1

    :cond_8
    const-string v1, "0"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_0

    :cond_9
    const-string v1, "\u5df2\u88ab\u6807\u8bb0"

    goto :goto_1

    :cond_a
    :goto_0
    const-string v1, "\u672a\u77e5"

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_b
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$3;->OXO1(Ljava/lang/String;)V

    return-void
.end method
