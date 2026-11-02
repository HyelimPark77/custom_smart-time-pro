.class public final Lcom/sma/smartv3/ui/device/StockAddActivity$add$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/StockAddActivity;->add(I)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStockAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity$add$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,251:1\n31#2,2:252\n*S KotlinDebug\n*F\n+ 1 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity$add$2\n*L\n138#1:252,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStockAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity$add$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,251:1\n31#2,2:252\n*S KotlinDebug\n*F\n+ 1 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity$add$2\n*L\n138#1:252,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/StockAddActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$add$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/Stock;)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$add$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/StockAddActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    array-length v1, p1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    if-nez v1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$add$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    array-length v1, p1

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$setMStockSize$p(Lcom/sma/smartv3/ui/device/StockAddActivity;I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/Stock;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_list"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$add$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/device/StockAddActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    const-string p1, "Add error"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$add$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/device/StockAddActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$add$2;->OXO1:Lcom/sma/smartv3/ui/device/StockAddActivity;

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

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/StockAddActivity$add$2;->OXO1([Lcom/sma/smartv3/model/Stock;)V

    return-void
.end method
