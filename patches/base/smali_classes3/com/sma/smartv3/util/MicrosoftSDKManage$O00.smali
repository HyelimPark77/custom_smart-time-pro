.class public final Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/util/MicrosoftSDKManage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "O00"
.end annotation


# instance fields
.field public volatile I0IIOi:Z

.field public final IiI10X:Ljava/util/concurrent/locks/ReentrantLock;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public O00:I

.field public final OXO1:I

.field public final XIi00iiXO:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:I

.field public final XOO0ii0:Ljava/util/concurrent/locks/Condition;

.field public iO:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->OXO1:I

    .line 3
    new-array p1, p1, [B

    iput-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XIi00iiXO:[B

    .line 4
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XOO0ii0:Ljava/util/concurrent/locks/Condition;

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, 0x100000

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;-><init>(I)V

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;[BIIILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    array-length p3, p1

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XOO0ii0([BII)I

    move-result p0

    return p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;[BIIJILjava/lang/Object;)I
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    array-length p3, p1

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const-wide/16 p4, 0xc8

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO([BIIJ)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final IiI10X()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO:I

    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XO0O10:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final O00()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->I0IIOi:Z

    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO:I

    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XO0O10:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final OXO1()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->I0IIOi:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO:I

    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XO0O10:I

    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XOO0ii0:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final XIi00iiXO()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final XOO0ii0([BII)I
    .locals 5
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->I0IIOi:Z

    const/4 v1, 0x0

    if-nez v0, :cond_3

    if-gtz p3, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->OXO1:I

    iget v2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    sub-int v3, v0, v2

    if-le p3, v3, :cond_1

    sub-int v3, p3, v3

    iget v4, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO:I

    add-int/2addr v4, v3

    rem-int/2addr v4, v0

    iput v4, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO:I

    sub-int/2addr v2, v3

    iput v2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget v2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XO0O10:I

    sub-int/2addr v0, v2

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XIi00iiXO:[B

    iget v3, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XO0O10:I

    invoke-static {p1, p2, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-ge v0, p3, :cond_2

    add-int/2addr p2, v0

    iget-object v2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XIi00iiXO:[B

    sub-int v0, p3, v0

    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    iget p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XO0O10:I

    add-int/2addr p1, p3

    iget p2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->OXO1:I

    rem-int/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XO0O10:I

    iget p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    iget-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XOO0ii0:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return p3

    :goto_1
    iget-object p2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :cond_3
    :goto_2
    return v1
.end method

.method public final iO([BIIJ)I
    .locals 3
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-gtz p3, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->I0IIOi:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v0

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XOO0ii0:Ljava/util/concurrent/locks/Condition;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, p4, p5, v2}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    iget p4, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    if-nez p4, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    iget p4, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget p4, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->OXO1:I

    iget p5, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO:I

    sub-int/2addr p4, p5

    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    move-result p4

    iget-object p5, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XIi00iiXO:[B

    iget v1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO:I

    invoke-static {p5, v1, p1, p2, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-ge p4, p3, :cond_3

    iget-object p5, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->XIi00iiXO:[B

    add-int/2addr p2, p4

    sub-int p4, p3, p4

    invoke-static {p5, v0, p1, p2, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    iget p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO:I

    add-int/2addr p1, p3

    iget p2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->OXO1:I

    rem-int/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO:I

    iget p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I

    sub-int/2addr p1, p3

    iput p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->O00:I
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return p3

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    iget-object p2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->IiI10X:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method
