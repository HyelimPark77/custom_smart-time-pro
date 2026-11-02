.class public final Lcom/sma/smartv3/model/AudioBookItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private binOnlinePath:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final id:I

.field private isChoose:Z

.field private isShowNewFlag:Z

.field private mPackage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSize:I

.field private final name:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final onlinePath:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final size:I


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/sma/smartv3/model/AudioBookItem;-><init>(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onlinePath"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binOnlinePath"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPackage"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/AudioBookItem;->id:I

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/AudioBookItem;->name:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/AudioBookItem;->size:I

    .line 6
    iput-boolean p4, p0, Lcom/sma/smartv3/model/AudioBookItem;->isChoose:Z

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/model/AudioBookItem;->onlinePath:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/sma/smartv3/model/AudioBookItem;->binOnlinePath:Ljava/lang/String;

    .line 9
    iput-boolean p7, p0, Lcom/sma/smartv3/model/AudioBookItem;->isShowNewFlag:Z

    .line 10
    iput-object p8, p0, Lcom/sma/smartv3/model/AudioBookItem;->mPackage:Ljava/lang/String;

    .line 11
    iput p9, p0, Lcom/sma/smartv3/model/AudioBookItem;->mSize:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    const/4 p1, -0x1

    :cond_0
    and-int/lit8 p11, p10, 0x2

    .line 12
    const-string v0, ""

    if-eqz p11, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    const/4 v1, 0x0

    if-eqz p11, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p4, v1

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v1

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p11, v1

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_8
    move p11, p9

    move-object p10, p8

    move-object p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    :goto_0
    invoke-direct/range {p2 .. p11}, Lcom/sma/smartv3/model/AudioBookItem;-><init>(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/AudioBookItem;ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/Object;)Lcom/sma/smartv3/model/AudioBookItem;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/AudioBookItem;->id:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/AudioBookItem;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/AudioBookItem;->size:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p4, p0, Lcom/sma/smartv3/model/AudioBookItem;->isChoose:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/model/AudioBookItem;->onlinePath:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/sma/smartv3/model/AudioBookItem;->binOnlinePath:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-boolean p7, p0, Lcom/sma/smartv3/model/AudioBookItem;->isShowNewFlag:Z

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/sma/smartv3/model/AudioBookItem;->mPackage:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lcom/sma/smartv3/model/AudioBookItem;->mSize:I

    :cond_8
    move-object p10, p8

    move p11, p9

    move-object p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/sma/smartv3/model/AudioBookItem;->copy(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)Lcom/sma/smartv3/model/AudioBookItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->size:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->isChoose:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->onlinePath:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->binOnlinePath:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->isShowNewFlag:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->mPackage:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->mSize:I

    return v0
.end method

.method public final copy(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)Lcom/sma/smartv3/model/AudioBookItem;
    .locals 11
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onlinePath"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binOnlinePath"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPackage"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/AudioBookItem;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move/from16 v8, p7

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/sma/smartv3/model/AudioBookItem;-><init>(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/AudioBookItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/AudioBookItem;

    iget v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->id:I

    iget v3, p1, Lcom/sma/smartv3/model/AudioBookItem;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AudioBookItem;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->size:I

    iget v3, p1, Lcom/sma/smartv3/model/AudioBookItem;->size:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->isChoose:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/AudioBookItem;->isChoose:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->onlinePath:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AudioBookItem;->onlinePath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->binOnlinePath:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AudioBookItem;->binOnlinePath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->isShowNewFlag:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/AudioBookItem;->isShowNewFlag:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->mPackage:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AudioBookItem;->mPackage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->mSize:I

    iget p1, p1, Lcom/sma/smartv3/model/AudioBookItem;->mSize:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getBinOnlinePath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->binOnlinePath:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->id:I

    return v0
.end method

.method public final getMPackage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->mPackage:Ljava/lang/String;

    return-object v0
.end method

.method public final getMSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->mSize:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnlinePath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->onlinePath:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->size:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->size:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->isChoose:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->onlinePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->binOnlinePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->isShowNewFlag:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->mPackage:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->mSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isChoose()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->isChoose:Z

    return v0
.end method

.method public final isShowNewFlag()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->isShowNewFlag:Z

    return v0
.end method

.method public final setBinOnlinePath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AudioBookItem;->binOnlinePath:Ljava/lang/String;

    return-void
.end method

.method public final setChoose(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/AudioBookItem;->isChoose:Z

    return-void
.end method

.method public final setMPackage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AudioBookItem;->mPackage:Ljava/lang/String;

    return-void
.end method

.method public final setMSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/AudioBookItem;->mSize:I

    return-void
.end method

.method public final setShowNewFlag(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/AudioBookItem;->isShowNewFlag:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/AudioBookItem;->id:I

    iget-object v1, p0, Lcom/sma/smartv3/model/AudioBookItem;->name:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/model/AudioBookItem;->size:I

    iget-boolean v3, p0, Lcom/sma/smartv3/model/AudioBookItem;->isChoose:Z

    iget-object v4, p0, Lcom/sma/smartv3/model/AudioBookItem;->onlinePath:Ljava/lang/String;

    iget-object v5, p0, Lcom/sma/smartv3/model/AudioBookItem;->binOnlinePath:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/sma/smartv3/model/AudioBookItem;->isShowNewFlag:Z

    iget-object v7, p0, Lcom/sma/smartv3/model/AudioBookItem;->mPackage:Ljava/lang/String;

    iget v8, p0, Lcom/sma/smartv3/model/AudioBookItem;->mSize:I

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "AudioBookItem(id="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", size="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isChoose="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", onlinePath="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", binOnlinePath="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isShowNewFlag="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", mPackage="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mSize="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
