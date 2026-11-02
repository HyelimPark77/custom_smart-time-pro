.class public final Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;
.super Lcom/sma/smartv3/util/net/NetResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/util/net/NetResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "XIi00iiXO"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/sma/smartv3/util/net/NetResult<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final OXO1:Ljava/lang/Object;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/util/net/NetResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->OXO1:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;Ljava/lang/Object;ILjava/lang/Object;)Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->OXO1:Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->XIi00iiXO(Ljava/lang/Object;)Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final OXO1()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->OXO1:Ljava/lang/Object;

    return-object v0
.end method

.method public final XIi00iiXO(Ljava/lang/Object;)Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final XO0O10()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->OXO1:Ljava/lang/Object;

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
    instance-of v1, p1, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    iget-object v1, p0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->OXO1:Ljava/lang/Object;

    iget-object p1, p1, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->OXO1:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->OXO1:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->OXO1:Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Success(data="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
