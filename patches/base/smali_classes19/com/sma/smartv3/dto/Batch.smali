.class public final Lcom/sma/smartv3/dto/Batch;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final authCodeDo:Ljava/lang/Object;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final batchNum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final createdAt:Ljava/lang/Object;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final createdBy:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final duration:I

.field private final expirationTime:Ljava/lang/Object;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final generateCount:I

.field private final id:I

.field private final modelId:I

.field private final status:I

.field private final thirdParty:I

.field private final updateAt:Ljava/lang/Object;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final updateBy:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userId:Ljava/lang/Object;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final version:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;IIIIILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p14    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p12

    move-object/from16 v1, p13

    move-object/from16 v2, p14

    const-string v3, "authCodeDo"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "batchNum"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "createdAt"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "createdBy"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "expirationTime"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "updateAt"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "updateBy"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "userId"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/dto/Batch;->authCodeDo:Ljava/lang/Object;

    iput-object p2, p0, Lcom/sma/smartv3/dto/Batch;->batchNum:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/dto/Batch;->createdAt:Ljava/lang/Object;

    iput-object p4, p0, Lcom/sma/smartv3/dto/Batch;->createdBy:Ljava/lang/String;

    iput p5, p0, Lcom/sma/smartv3/dto/Batch;->duration:I

    iput-object p6, p0, Lcom/sma/smartv3/dto/Batch;->expirationTime:Ljava/lang/Object;

    iput p7, p0, Lcom/sma/smartv3/dto/Batch;->generateCount:I

    iput p8, p0, Lcom/sma/smartv3/dto/Batch;->id:I

    iput p9, p0, Lcom/sma/smartv3/dto/Batch;->modelId:I

    iput p10, p0, Lcom/sma/smartv3/dto/Batch;->status:I

    iput p11, p0, Lcom/sma/smartv3/dto/Batch;->thirdParty:I

    iput-object v0, p0, Lcom/sma/smartv3/dto/Batch;->updateAt:Ljava/lang/Object;

    iput-object v1, p0, Lcom/sma/smartv3/dto/Batch;->updateBy:Ljava/lang/String;

    iput-object v2, p0, Lcom/sma/smartv3/dto/Batch;->userId:Ljava/lang/Object;

    move/from16 p1, p15

    iput p1, p0, Lcom/sma/smartv3/dto/Batch;->version:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/dto/Batch;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;IIIIILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;IILjava/lang/Object;)Lcom/sma/smartv3/dto/Batch;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/sma/smartv3/dto/Batch;->authCodeDo:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/sma/smartv3/dto/Batch;->batchNum:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/sma/smartv3/dto/Batch;->createdAt:Ljava/lang/Object;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/sma/smartv3/dto/Batch;->createdBy:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/sma/smartv3/dto/Batch;->duration:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/sma/smartv3/dto/Batch;->expirationTime:Ljava/lang/Object;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/sma/smartv3/dto/Batch;->generateCount:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/sma/smartv3/dto/Batch;->id:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/sma/smartv3/dto/Batch;->modelId:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/sma/smartv3/dto/Batch;->status:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/sma/smartv3/dto/Batch;->thirdParty:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/sma/smartv3/dto/Batch;->updateAt:Ljava/lang/Object;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/sma/smartv3/dto/Batch;->updateBy:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/sma/smartv3/dto/Batch;->userId:Ljava/lang/Object;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget v1, v0, Lcom/sma/smartv3/dto/Batch;->version:I

    move/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_f

    :cond_e
    move/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/sma/smartv3/dto/Batch;->copy(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;IIIIILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;I)Lcom/sma/smartv3/dto/Batch;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->authCodeDo:Ljava/lang/Object;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->status:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->thirdParty:I

    return v0
.end method

.method public final component12()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->updateAt:Ljava/lang/Object;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->updateBy:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->userId:Ljava/lang/Object;

    return-object v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->version:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->batchNum:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->createdAt:Ljava/lang/Object;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->createdBy:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->duration:I

    return v0
.end method

.method public final component6()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->expirationTime:Ljava/lang/Object;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->generateCount:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->id:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->modelId:I

    return v0
.end method

.method public final copy(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;IIIIILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;I)Lcom/sma/smartv3/dto/Batch;
    .locals 17
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p14    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "authCodeDo"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batchNum"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdBy"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expirationTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateAt"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateBy"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/dto/Batch;

    move/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/sma/smartv3/dto/Batch;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;IIIIILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/dto/Batch;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/dto/Batch;

    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->authCodeDo:Ljava/lang/Object;

    iget-object v3, p1, Lcom/sma/smartv3/dto/Batch;->authCodeDo:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->batchNum:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/dto/Batch;->batchNum:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->createdAt:Ljava/lang/Object;

    iget-object v3, p1, Lcom/sma/smartv3/dto/Batch;->createdAt:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->createdBy:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/dto/Batch;->createdBy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->duration:I

    iget v3, p1, Lcom/sma/smartv3/dto/Batch;->duration:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->expirationTime:Ljava/lang/Object;

    iget-object v3, p1, Lcom/sma/smartv3/dto/Batch;->expirationTime:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->generateCount:I

    iget v3, p1, Lcom/sma/smartv3/dto/Batch;->generateCount:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->id:I

    iget v3, p1, Lcom/sma/smartv3/dto/Batch;->id:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->modelId:I

    iget v3, p1, Lcom/sma/smartv3/dto/Batch;->modelId:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->status:I

    iget v3, p1, Lcom/sma/smartv3/dto/Batch;->status:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->thirdParty:I

    iget v3, p1, Lcom/sma/smartv3/dto/Batch;->thirdParty:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->updateAt:Ljava/lang/Object;

    iget-object v3, p1, Lcom/sma/smartv3/dto/Batch;->updateAt:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->updateBy:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/dto/Batch;->updateBy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->userId:Ljava/lang/Object;

    iget-object v3, p1, Lcom/sma/smartv3/dto/Batch;->userId:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->version:I

    iget p1, p1, Lcom/sma/smartv3/dto/Batch;->version:I

    if-eq v1, p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getAuthCodeDo()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->authCodeDo:Ljava/lang/Object;

    return-object v0
.end method

.method public final getBatchNum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->batchNum:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->createdAt:Ljava/lang/Object;

    return-object v0
.end method

.method public final getCreatedBy()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->createdBy:Ljava/lang/String;

    return-object v0
.end method

.method public final getDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->duration:I

    return v0
.end method

.method public final getExpirationTime()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->expirationTime:Ljava/lang/Object;

    return-object v0
.end method

.method public final getGenerateCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->generateCount:I

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->id:I

    return v0
.end method

.method public final getModelId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->modelId:I

    return v0
.end method

.method public final getStatus()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->status:I

    return v0
.end method

.method public final getThirdParty()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->thirdParty:I

    return v0
.end method

.method public final getUpdateAt()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->updateAt:Ljava/lang/Object;

    return-object v0
.end method

.method public final getUpdateBy()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->updateBy:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->userId:Ljava/lang/Object;

    return-object v0
.end method

.method public final getVersion()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/Batch;->version:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/dto/Batch;->authCodeDo:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->batchNum:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->createdAt:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->createdBy:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->duration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->expirationTime:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->generateCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->id:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->modelId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->status:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->thirdParty:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->updateAt:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->updateBy:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/Batch;->userId:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/Batch;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/dto/Batch;->authCodeDo:Ljava/lang/Object;

    iget-object v2, v0, Lcom/sma/smartv3/dto/Batch;->batchNum:Ljava/lang/String;

    iget-object v3, v0, Lcom/sma/smartv3/dto/Batch;->createdAt:Ljava/lang/Object;

    iget-object v4, v0, Lcom/sma/smartv3/dto/Batch;->createdBy:Ljava/lang/String;

    iget v5, v0, Lcom/sma/smartv3/dto/Batch;->duration:I

    iget-object v6, v0, Lcom/sma/smartv3/dto/Batch;->expirationTime:Ljava/lang/Object;

    iget v7, v0, Lcom/sma/smartv3/dto/Batch;->generateCount:I

    iget v8, v0, Lcom/sma/smartv3/dto/Batch;->id:I

    iget v9, v0, Lcom/sma/smartv3/dto/Batch;->modelId:I

    iget v10, v0, Lcom/sma/smartv3/dto/Batch;->status:I

    iget v11, v0, Lcom/sma/smartv3/dto/Batch;->thirdParty:I

    iget-object v12, v0, Lcom/sma/smartv3/dto/Batch;->updateAt:Ljava/lang/Object;

    iget-object v13, v0, Lcom/sma/smartv3/dto/Batch;->updateBy:Ljava/lang/String;

    iget-object v14, v0, Lcom/sma/smartv3/dto/Batch;->userId:Ljava/lang/Object;

    iget v15, v0, Lcom/sma/smartv3/dto/Batch;->version:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v15

    const-string v15, "Batch(authCodeDo="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", batchNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", expirationTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", generateCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", modelId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", thirdParty="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", updateAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updateBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
