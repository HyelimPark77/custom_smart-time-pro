.class public final Lcom/sma/smartv3/biz/AIWatchFaceManager$findJob$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AIWatchFaceManager;->I0iXXO(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/JobDetail;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/biz/AIWatchFaceManager$findJob$1;->iO()V

    return-void
.end method

.method public static final iO()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->O10IXXX0X()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->XO0O10()Ljava/lang/String;

    move-result-object v1

    const-string v2, "access$getMJobId$p(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->I0iXXO(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public XIi00iiXO(Lcom/sma/smartv3/model/JobDetail;)V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->O00()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->O10IXXX0X()Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " findJob -> "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->O10IXXX0X()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/JobDetail;->getJobStatus()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX0X1O10X;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/OX0X1O10X;-><init>()V

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/model/JobDetail;->getImages()[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/JobDetail;->getImageSign()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OIX0iXi([Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {v2, v0, p1, v0}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->I1XOi1(Lcom/sma/smartv3/biz/AIWatchFaceManager;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->O00()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " findJob -> error = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->I1XOi1(Lcom/sma/smartv3/biz/AIWatchFaceManager;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/JobDetail;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/AIWatchFaceManager$findJob$1;->XIi00iiXO(Lcom/sma/smartv3/model/JobDetail;)V

    return-void
.end method
