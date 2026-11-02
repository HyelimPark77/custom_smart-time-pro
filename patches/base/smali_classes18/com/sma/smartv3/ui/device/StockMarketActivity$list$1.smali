.class public final Lcom/sma/smartv3/ui/device/StockMarketActivity$list$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/StockMarketActivity;->list()V
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
    value = "SMAP\nStockMarketActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockMarketActivity.kt\ncom/sma/smartv3/ui/device/StockMarketActivity$list$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,300:1\n31#2,2:301\n*S KotlinDebug\n*F\n+ 1 StockMarketActivity.kt\ncom/sma/smartv3/ui/device/StockMarketActivity$list$1\n*L\n102#1:301,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStockMarketActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockMarketActivity.kt\ncom/sma/smartv3/ui/device/StockMarketActivity$list$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,300:1\n31#2,2:301\n*S KotlinDebug\n*F\n+ 1 StockMarketActivity.kt\ncom/sma/smartv3/ui/device/StockMarketActivity$list$1\n*L\n102#1:301,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/StockMarketActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/StockMarketActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/StockMarketActivity$list$1;->OXO1:Lcom/sma/smartv3/ui/device/StockMarketActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/Stock;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockMarketActivity$list$1;->OXO1:Lcom/sma/smartv3/ui/device/StockMarketActivity;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    if-eqz p1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/Stock;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_list"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockMarketActivity$list$1;->OXO1:Lcom/sma/smartv3/ui/device/StockMarketActivity;

    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/StockMarketActivity;->access$showList(Lcom/sma/smartv3/ui/device/StockMarketActivity;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/StockMarketActivity$list$1;->OXO1:Lcom/sma/smartv3/ui/device/StockMarketActivity;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/Stock;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/StockMarketActivity$list$1;->OXO1([Lcom/sma/smartv3/model/Stock;)V

    return-void
.end method
