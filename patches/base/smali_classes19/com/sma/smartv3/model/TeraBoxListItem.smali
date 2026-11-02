.class public final Lcom/sma/smartv3/model/TeraBoxListItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final category:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final fs_id:J

.field private final isdir:I

.field private final local_mtime:J

.field private final path:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final server_ctime:J

.field private final server_filename:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final size:I


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0xff

    const/4 v13, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/sma/smartv3/model/TeraBoxListItem;-><init>(JLjava/lang/String;JJLjava/lang/String;IILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;JJLjava/lang/String;IILjava/lang/String;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "category"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "server_filename"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->fs_id:J

    .line 4
    iput-object p3, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->category:Ljava/lang/String;

    .line 5
    iput-wide p4, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->local_mtime:J

    .line 6
    iput-wide p6, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_ctime:J

    .line 7
    iput-object p8, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_filename:Ljava/lang/String;

    .line 8
    iput p9, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->size:I

    .line 9
    iput p10, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->isdir:I

    .line 10
    iput-object p11, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->path:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;JJLjava/lang/String;IILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    .line 11
    const-string v4, ""

    if-eqz v1, :cond_1

    move-object v1, v4

    goto :goto_0

    :cond_1
    move-object v1, p3

    :goto_0
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    move-wide v5, v2

    goto :goto_1

    :cond_2
    move-wide v5, p4

    :goto_1
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    move-wide/from16 v2, p6

    :goto_2
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    move-object v7, v4

    goto :goto_3

    :cond_4
    move-object/from16 v7, p8

    :goto_3
    and-int/lit8 v8, v0, 0x20

    const/4 v9, 0x0

    if-eqz v8, :cond_5

    move v8, v9

    goto :goto_4

    :cond_5
    move/from16 v8, p9

    :goto_4
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    goto :goto_5

    :cond_6
    move/from16 v9, p10

    :goto_5
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    move-object/from16 p12, v4

    :goto_6
    move-wide p2, p1

    move-object p4, v1

    move-wide/from16 p7, v2

    move-wide/from16 p5, v5

    move-object/from16 p9, v7

    move/from16 p10, v8

    move/from16 p11, v9

    move-object p1, p0

    goto :goto_7

    :cond_7
    move-object/from16 p12, p11

    goto :goto_6

    :goto_7
    invoke-direct/range {p1 .. p12}, Lcom/sma/smartv3/model/TeraBoxListItem;-><init>(JLjava/lang/String;JJLjava/lang/String;IILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/TeraBoxListItem;JLjava/lang/String;JJLjava/lang/String;IILjava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/model/TeraBoxListItem;
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->fs_id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->category:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-wide p1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->local_mtime:J

    move-wide v4, p1

    goto :goto_0

    :cond_2
    move-wide/from16 v4, p4

    :goto_0
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-wide p1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_ctime:J

    move-wide v6, p1

    goto :goto_1

    :cond_3
    move-wide/from16 v6, p6

    :goto_1
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_filename:Ljava/lang/String;

    move-object v8, p1

    goto :goto_2

    :cond_4
    move-object/from16 v8, p8

    :goto_2
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->size:I

    move v9, p1

    goto :goto_3

    :cond_5
    move/from16 v9, p9

    :goto_3
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->isdir:I

    move v10, p1

    goto :goto_4

    :cond_6
    move/from16 v10, p10

    :goto_4
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->path:Ljava/lang/String;

    move-object v11, p1

    :goto_5
    move-object v0, p0

    goto :goto_6

    :cond_7
    move-object/from16 v11, p11

    goto :goto_5

    :goto_6
    invoke-virtual/range {v0 .. v11}, Lcom/sma/smartv3/model/TeraBoxListItem;->copy(JLjava/lang/String;JJLjava/lang/String;IILjava/lang/String;)Lcom/sma/smartv3/model/TeraBoxListItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->fs_id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->local_mtime:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_ctime:J

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_filename:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->size:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->isdir:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;JJLjava/lang/String;IILjava/lang/String;)Lcom/sma/smartv3/model/TeraBoxListItem;
    .locals 13
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "category"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "server_filename"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/TeraBoxListItem;

    move-wide v2, p1

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lcom/sma/smartv3/model/TeraBoxListItem;-><init>(JLjava/lang/String;JJLjava/lang/String;IILjava/lang/String;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/TeraBoxListItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/TeraBoxListItem;

    iget-wide v3, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->fs_id:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/TeraBoxListItem;->fs_id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->category:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/TeraBoxListItem;->category:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->local_mtime:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/TeraBoxListItem;->local_mtime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_ctime:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/TeraBoxListItem;->server_ctime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_filename:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/TeraBoxListItem;->server_filename:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->size:I

    iget v3, p1, Lcom/sma/smartv3/model/TeraBoxListItem;->size:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->isdir:I

    iget v3, p1, Lcom/sma/smartv3/model/TeraBoxListItem;->isdir:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->path:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/model/TeraBoxListItem;->path:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getFs_id()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->fs_id:J

    return-wide v0
.end method

.method public final getIsdir()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->isdir:I

    return v0
.end method

.method public final getLocal_mtime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->local_mtime:J

    return-wide v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getServer_ctime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_ctime:J

    return-wide v0
.end method

.method public final getServer_filename()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_filename:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->size:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->fs_id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->category:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->local_mtime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_ctime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_filename:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->size:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->isdir:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->path:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->fs_id:J

    iget-object v2, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->category:Ljava/lang/String;

    iget-wide v3, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->local_mtime:J

    iget-wide v5, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_ctime:J

    iget-object v7, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->server_filename:Ljava/lang/String;

    iget v8, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->size:I

    iget v9, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->isdir:I

    iget-object v10, p0, Lcom/sma/smartv3/model/TeraBoxListItem;->path:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "TeraBoxListItem(fs_id="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", category="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", local_mtime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", server_ctime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", server_filename="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", size="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isdir="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", path="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
