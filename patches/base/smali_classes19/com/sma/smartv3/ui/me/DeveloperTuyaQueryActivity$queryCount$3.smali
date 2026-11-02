.class public final Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->queryCount(I)V
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 7

    if-eqz p1, :cond_0

    const-string v0, ","

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getTvCount(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;

    move-result-object v1

    sub-int v2, v0, p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5df2\u4f7f\u7528\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\uff0c\u672a\u4f7f\u7528\uff1a"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\uff0c\u603b\u6570\uff1a"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

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

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$3;->OXO1(Ljava/lang/String;)V

    return-void
.end method
