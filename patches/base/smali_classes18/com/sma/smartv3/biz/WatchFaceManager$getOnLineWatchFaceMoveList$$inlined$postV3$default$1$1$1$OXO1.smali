.class public final Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1;->OXO1(Lcom/sma/androidnetworklib/model/Response;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleResponse$1$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleResponse$1$1\n*L\n215#1:926,8\n215#1:935,5\n215#1:934\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleResponse$1$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleResponse$1$1\n*L\n215#1:926,8\n215#1:935,5\n215#1:934\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/androidnetworklib/model/Response;

.field public final synthetic IO:Landroidx/appcompat/app/AppCompatActivity;

.field public final synthetic iX1O1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Lcom/sma/androidnetworklib/model/Response;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1$OXO1;->IO:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p2, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1$OXO1;->I1:Lcom/sma/androidnetworklib/model/Response;

    iput-object p3, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1$OXO1;->iX1O1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1$OXO1;->IO:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1$OXO1;->IO:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1$OXO1;->I1:Lcom/sma/androidnetworklib/model/Response;

    iget-object v2, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1$OXO1;->IO:Landroidx/appcompat/app/AppCompatActivity;

    iget-object v3, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1$1$1$OXO1;->iX1O1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "responseData"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-nez v1, :cond_1

    new-instance v1, Lcom/sma/androidnetworklib/model/Response;

    invoke-direct {v1}, Lcom/sma/androidnetworklib/model/Response;-><init>()V

    const/16 v4, -0x3e8

    invoke-virtual {v1, v4}, Lcom/sma/androidnetworklib/model/Response;->setCode(I)V

    :cond_1
    invoke-virtual {v0, v2, v1, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->responseWhenCheck(Landroid/app/Activity;Lcom/sma/androidnetworklib/model/Response;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    :cond_2
    :goto_0
    return-void
.end method
