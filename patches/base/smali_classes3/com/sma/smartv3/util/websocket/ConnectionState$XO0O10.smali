.class public final Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;
.super Lcom/sma/smartv3/util/websocket/ConnectionState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/util/websocket/ConnectionState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "XO0O10"
.end annotation


# instance fields
.field public final OXO1:Ljava/lang/Throwable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/util/websocket/ConnectionState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;->OXO1:Ljava/lang/Throwable;

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;Ljava/lang/Throwable;ILjava/lang/Object;)Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;->OXO1:Ljava/lang/Throwable;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;->XIi00iiXO(Ljava/lang/Throwable;)Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final OXO1()Ljava/lang/Throwable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;->OXO1:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final XIi00iiXO(Ljava/lang/Throwable;)Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final XO0O10()Ljava/lang/Throwable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;->OXO1:Ljava/lang/Throwable;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;

    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;->OXO1:Ljava/lang/Throwable;

    iget-object p1, p1, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;->OXO1:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;->OXO1:Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;->OXO1:Ljava/lang/Throwable;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error(throwable="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
