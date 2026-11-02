.class public final Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/androidnetworklib/model/Response<",
        "[",
        "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2\n*L\n1#1,226:1\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2\n*L\n1#1,226:1\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Ljava/lang/ref/WeakReference;

.field public final synthetic XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;->OXO1:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/androidnetworklib/model/Response;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/androidnetworklib/model/Response<",
            "[",
            "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;->OXO1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    new-instance v2, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1$OXO1;

    invoke-direct {v2, v0, p1, v1}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1$OXO1;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lcom/sma/androidnetworklib/model/Response;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;->OXO1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    new-instance v2, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1$XIi00iiXO;

    invoke-direct {v2, v0, p1, v1}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1$XIi00iiXO;-><init>(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/androidnetworklib/model/Response;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;->OXO1(Lcom/sma/androidnetworklib/model/Response;)V

    return-void
.end method
