.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HykyTokenData"
.end annotation


# instance fields
.field private accessToken:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private expiresAt:J

.field private expiresIn:J

.field private refreshToken:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private tokenType:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->accessToken:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->refreshToken:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->tokenType:Ljava/lang/String;

    .line 6
    iput-wide p4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    .line 7
    iput-wide p6, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    .line 8
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    const-wide/16 p4, -0x1

    :cond_3
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_4

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p6

    :cond_4
    move-wide p7, p6

    move-wide p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 10
    invoke-direct/range {p1 .. p8}, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Object;)Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->accessToken:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->refreshToken:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->tokenType:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-wide p4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    :cond_3
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_4

    iget-wide p6, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    :cond_4
    move-wide p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->refreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->tokenType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-wide v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->accessToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->accessToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->refreshToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->refreshToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->tokenType:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->tokenType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    iget-wide v5, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    iget-wide v5, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAccessToken()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpiresAt()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    return-wide v0
.end method

.method public final getExpiresIn()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    return-wide v0
.end method

.method public final getRefreshToken()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->refreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getTokenType()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->tokenType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->accessToken:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->refreshToken:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->tokenType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isExpired()Z
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    iget-wide v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    add-long/2addr v2, v4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0xa

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setAccessToken(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->accessToken:Ljava/lang/String;

    return-void
.end method

.method public final setExpiresAt(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    return-void
.end method

.method public final setExpiresIn(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    return-void
.end method

.method public final setRefreshToken(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->refreshToken:Ljava/lang/String;

    return-void
.end method

.method public final setTokenType(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->tokenType:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->accessToken:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->refreshToken:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->tokenType:Ljava/lang/String;

    iget-wide v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresIn:J

    iget-wide v5, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->expiresAt:J

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "HykyTokenData(accessToken="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", refreshToken="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tokenType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", expiresIn="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", expiresAt="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
