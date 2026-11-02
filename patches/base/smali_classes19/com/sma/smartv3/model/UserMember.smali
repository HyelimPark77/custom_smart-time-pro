.class public final Lcom/sma/smartv3/model/UserMember;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private getGameMemberFlag:Z

.field private getMemberFlag:Z

.field private getTrialMemberFlag:Z

.field private latestDateTime:J

.field private latestGameMemberDateTime:J

.field private serverDateTime:J


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x3f

    const/4 v11, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/sma/smartv3/model/UserMember;-><init>(ZJJZJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZJJZJZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/sma/smartv3/model/UserMember;->getMemberFlag:Z

    .line 4
    iput-wide p2, p0, Lcom/sma/smartv3/model/UserMember;->latestDateTime:J

    .line 5
    iput-wide p4, p0, Lcom/sma/smartv3/model/UserMember;->serverDateTime:J

    .line 6
    iput-boolean p6, p0, Lcom/sma/smartv3/model/UserMember;->getGameMemberFlag:Z

    .line 7
    iput-wide p7, p0, Lcom/sma/smartv3/model/UserMember;->latestGameMemberDateTime:J

    .line 8
    iput-boolean p9, p0, Lcom/sma/smartv3/model/UserMember;->getTrialMemberFlag:Z

    return-void
.end method

.method public synthetic constructor <init>(ZJJZJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x1

    if-eqz p11, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    const-wide/16 v1, 0x0

    if-eqz p11, :cond_1

    move-wide p2, v1

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move-wide p4, v1

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p6, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move-wide p7, v1

    :cond_4
    and-int/lit8 p10, p10, 0x20

    if-eqz p10, :cond_5

    const/4 p9, 0x0

    :cond_5
    move p10, p9

    move-wide p8, p7

    move p7, p6

    move-wide p5, p4

    move-wide p3, p2

    move p2, p1

    move-object p1, p0

    .line 9
    invoke-direct/range {p1 .. p10}, Lcom/sma/smartv3/model/UserMember;-><init>(ZJJZJZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/UserMember;ZJJZJZILjava/lang/Object;)Lcom/sma/smartv3/model/UserMember;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/model/UserMember;->getMemberFlag:Z

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-wide p2, p0, Lcom/sma/smartv3/model/UserMember;->latestDateTime:J

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-wide p4, p0, Lcom/sma/smartv3/model/UserMember;->serverDateTime:J

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p6, p0, Lcom/sma/smartv3/model/UserMember;->getGameMemberFlag:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-wide p7, p0, Lcom/sma/smartv3/model/UserMember;->latestGameMemberDateTime:J

    :cond_4
    and-int/lit8 p10, p10, 0x20

    if-eqz p10, :cond_5

    iget-boolean p9, p0, Lcom/sma/smartv3/model/UserMember;->getTrialMemberFlag:Z

    :cond_5
    move p11, p9

    move-wide p9, p7

    move p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/sma/smartv3/model/UserMember;->copy(ZJJZJZ)Lcom/sma/smartv3/model/UserMember;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/UserMember;->getMemberFlag:Z

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UserMember;->latestDateTime:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UserMember;->serverDateTime:J

    return-wide v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/UserMember;->getGameMemberFlag:Z

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UserMember;->latestGameMemberDateTime:J

    return-wide v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/UserMember;->getTrialMemberFlag:Z

    return v0
.end method

.method public final copy(ZJJZJZ)Lcom/sma/smartv3/model/UserMember;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/UserMember;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move/from16 v6, p6

    move-wide/from16 v7, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/model/UserMember;-><init>(ZJJZJZ)V

    return-object v0
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
    instance-of v1, p1, Lcom/sma/smartv3/model/UserMember;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/UserMember;

    iget-boolean v1, p0, Lcom/sma/smartv3/model/UserMember;->getMemberFlag:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/UserMember;->getMemberFlag:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/model/UserMember;->latestDateTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/UserMember;->latestDateTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/sma/smartv3/model/UserMember;->serverDateTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/UserMember;->serverDateTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/sma/smartv3/model/UserMember;->getGameMemberFlag:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/UserMember;->getGameMemberFlag:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/sma/smartv3/model/UserMember;->latestGameMemberDateTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/UserMember;->latestGameMemberDateTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/sma/smartv3/model/UserMember;->getTrialMemberFlag:Z

    iget-boolean p1, p1, Lcom/sma/smartv3/model/UserMember;->getTrialMemberFlag:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getGetGameMemberFlag()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/UserMember;->getGameMemberFlag:Z

    return v0
.end method

.method public final getGetMemberFlag()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/UserMember;->getMemberFlag:Z

    return v0
.end method

.method public final getGetTrialMemberFlag()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/UserMember;->getTrialMemberFlag:Z

    return v0
.end method

.method public final getLatestDateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UserMember;->latestDateTime:J

    return-wide v0
.end method

.method public final getLatestGameMemberDateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UserMember;->latestGameMemberDateTime:J

    return-wide v0
.end method

.method public final getServerDateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UserMember;->serverDateTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/sma/smartv3/model/UserMember;->getMemberFlag:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/UserMember;->latestDateTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/UserMember;->serverDateTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/UserMember;->getGameMemberFlag:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/UserMember;->latestGameMemberDateTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/UserMember;->getTrialMemberFlag:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setGetGameMemberFlag(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/UserMember;->getGameMemberFlag:Z

    return-void
.end method

.method public final setGetMemberFlag(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/UserMember;->getMemberFlag:Z

    return-void
.end method

.method public final setGetTrialMemberFlag(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/UserMember;->getTrialMemberFlag:Z

    return-void
.end method

.method public final setLatestDateTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UserMember;->latestDateTime:J

    return-void
.end method

.method public final setLatestGameMemberDateTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UserMember;->latestGameMemberDateTime:J

    return-void
.end method

.method public final setServerDateTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UserMember;->serverDateTime:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-boolean v0, p0, Lcom/sma/smartv3/model/UserMember;->getMemberFlag:Z

    iget-wide v1, p0, Lcom/sma/smartv3/model/UserMember;->latestDateTime:J

    iget-wide v3, p0, Lcom/sma/smartv3/model/UserMember;->serverDateTime:J

    iget-boolean v5, p0, Lcom/sma/smartv3/model/UserMember;->getGameMemberFlag:Z

    iget-wide v6, p0, Lcom/sma/smartv3/model/UserMember;->latestGameMemberDateTime:J

    iget-boolean v8, p0, Lcom/sma/smartv3/model/UserMember;->getTrialMemberFlag:Z

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "UserMember(getMemberFlag="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", latestDateTime="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", serverDateTime="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", getGameMemberFlag="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", latestGameMemberDateTime="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", getTrialMemberFlag="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
