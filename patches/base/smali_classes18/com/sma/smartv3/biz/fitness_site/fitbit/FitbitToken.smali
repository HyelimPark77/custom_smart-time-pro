.class public final Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private access_token:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private expires_at:J

.field private expires_in:I

.field private refresh_token:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private token_type:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private user_id:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;-><init>(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "access_token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refresh_token"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token_type"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user_id"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->access_token:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_in:I

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->refresh_token:Ljava/lang/String;

    .line 6
    iput-wide p4, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_at:J

    .line 7
    iput-object p6, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->token_type:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->user_id:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    .line 9
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    const-wide/16 p4, 0x0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-wide p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p8, p7

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;-><init>(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->access_token:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_in:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->refresh_token:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-wide p4, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_at:J

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p6, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->token_type:Ljava/lang/String;

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-object p7, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->user_id:Ljava/lang/String;

    :cond_5
    move-object p8, p6

    move-object p9, p7

    move-wide p6, p4

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->copy(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->access_token:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_in:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->refresh_token:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_at:J

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->token_type:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "access_token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refresh_token"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token_type"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user_id"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;-><init>(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->access_token:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->access_token:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_in:I

    iget v3, p1, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_in:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->refresh_token:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->refresh_token:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_at:J

    iget-wide v5, p1, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_at:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->token_type:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->token_type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->user_id:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->user_id:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAccess_token()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->access_token:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpires_at()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_at:J

    return-wide v0
.end method

.method public final getExpires_in()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_in:I

    return v0
.end method

.method public final getRefresh_token()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->refresh_token:Ljava/lang/String;

    return-object v0
.end method

.method public final getToken_type()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->token_type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser_id()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->access_token:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_in:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->refresh_token:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_at:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->token_type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->user_id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setAccess_token(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->access_token:Ljava/lang/String;

    return-void
.end method

.method public final setExpires_at(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_at:J

    return-void
.end method

.method public final setExpires_in(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_in:I

    return-void
.end method

.method public final setRefresh_token(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->refresh_token:Ljava/lang/String;

    return-void
.end method

.method public final setToken_type(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->token_type:Ljava/lang/String;

    return-void
.end method

.method public final setUser_id(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->user_id:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->access_token:Ljava/lang/String;

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_in:I

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->refresh_token:Ljava/lang/String;

    iget-wide v3, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->expires_at:J

    iget-object v5, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->token_type:Ljava/lang/String;

    iget-object v6, p0, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitToken;->user_id:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "FitbitToken(access_token="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", expires_in="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", refresh_token="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", expires_at="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", token_type="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", user_id="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
