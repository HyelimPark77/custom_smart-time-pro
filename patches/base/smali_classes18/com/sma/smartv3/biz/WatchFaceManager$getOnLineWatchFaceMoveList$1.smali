.class public final Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/WatchFaceManager;->XO0O10(Ljava/lang/String;Landroidx/appcompat/app/AppCompatActivity;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
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
        "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "[",
            "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-[",
            "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$1;->OXO1:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/OnlineWatchFaceV2;)V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    array-length v2, p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->IO0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getWatchFaceList()[Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    move-result-object v3

    if-eqz v3, :cond_1

    array-length v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getOnLinWatchFaceList -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " , size : "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    :try_start_0
    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->IO0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getWatchFaceList()[Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    const/4 p1, 0x0

    new-array p1, p1, [Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$1;->OXO1:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_4

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object p1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$1;->OXO1:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_4

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getOnLinWatchFaceList -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$1;->OXO1:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$1;->OXO1([Lcom/sma/smartv3/model/OnlineWatchFaceV2;)V

    return-void
.end method
