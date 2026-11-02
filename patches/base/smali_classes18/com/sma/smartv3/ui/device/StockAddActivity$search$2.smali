.class public final Lcom/sma/smartv3/ui/device/StockAddActivity$search$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/StockAddActivity;->search(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "[",
        "Lcom/sma/smartv3/model/Stock;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/StockAddActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$search$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/Stock;)V
    .locals 3

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stock search result -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$search$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/StockAddActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    if-eqz p1, :cond_2

    array-length v0, p1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$search$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMList(Lcom/sma/smartv3/ui/device/StockAddActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$search$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMList(Lcom/sma/smartv3/ui/device/StockAddActivity;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIXO1IIOO;->Oi(Ljava/util/Collection;[Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$search$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/device/StockAddActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    :cond_2
    const p1, 0x7f140ffb

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$search$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/StockAddActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/Stock;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/StockAddActivity$search$2;->OXO1([Lcom/sma/smartv3/model/Stock;)V

    return-void
.end method
