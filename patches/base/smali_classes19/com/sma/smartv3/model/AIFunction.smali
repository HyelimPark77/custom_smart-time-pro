.class public final Lcom/sma/smartv3/model/AIFunction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private bg:I

.field private desc:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private detailsBg:I

.field private detailsDescribe:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private detailsExample:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private detailsHint:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private detailsQuestion:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private icon:I

.field private transient intent:Landroid/content/Intent;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private isHot:Z

.field private title:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private type:Lcom/sma/smartv3/model/AIFunctionType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AIFunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsDescribe"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsHint"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsExample"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsQuestion"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->type:Lcom/sma/smartv3/model/AIFunctionType;

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/model/AIFunction;->title:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/sma/smartv3/model/AIFunction;->bg:I

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/model/AIFunction;->desc:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/sma/smartv3/model/AIFunction;->icon:I

    .line 7
    iput p6, p0, Lcom/sma/smartv3/model/AIFunction;->detailsBg:I

    .line 8
    iput-object p7, p0, Lcom/sma/smartv3/model/AIFunction;->detailsDescribe:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/sma/smartv3/model/AIFunction;->detailsHint:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lcom/sma/smartv3/model/AIFunction;->detailsExample:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lcom/sma/smartv3/model/AIFunction;->detailsQuestion:Ljava/lang/String;

    .line 12
    iput-boolean p11, p0, Lcom/sma/smartv3/model/AIFunction;->isHot:Z

    .line 13
    iput-object p12, p0, Lcom/sma/smartv3/model/AIFunction;->intent:Landroid/content/Intent;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x2

    .line 14
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object p2, v2

    :cond_0
    and-int/lit8 v1, v0, 0x4

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move p3, v3

    :cond_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v1, v2

    goto :goto_0

    :cond_2
    move-object v1, p4

    :goto_0
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_3

    move v4, v3

    goto :goto_1

    :cond_3
    move v4, p5

    :goto_1
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_4

    move v5, v3

    goto :goto_2

    :cond_4
    move/from16 v5, p6

    :goto_2
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_5

    move-object v6, v2

    goto :goto_3

    :cond_5
    move-object/from16 v6, p7

    :goto_3
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_6

    move-object v7, v2

    goto :goto_4

    :cond_6
    move-object/from16 v7, p8

    :goto_4
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_7

    move-object v8, v2

    goto :goto_5

    :cond_7
    move-object/from16 v8, p9

    :goto_5
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_8

    goto :goto_6

    :cond_8
    move-object/from16 v2, p10

    :goto_6
    and-int/lit16 v9, v0, 0x400

    if-eqz v9, :cond_9

    goto :goto_7

    :cond_9
    move/from16 v3, p11

    :goto_7
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    move-object/from16 p14, v0

    :goto_8
    move-object p4, p2

    move p5, p3

    move-object/from16 p6, v1

    move-object/from16 p12, v2

    move/from16 p13, v3

    move/from16 p7, v4

    move/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object p2, p0

    move-object p3, p1

    goto :goto_9

    :cond_a
    move-object/from16 p14, p12

    goto :goto_8

    :goto_9
    invoke-direct/range {p2 .. p14}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;ILjava/lang/Object;)Lcom/sma/smartv3/model/AIFunction;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->type:Lcom/sma/smartv3/model/AIFunctionType;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/AIFunction;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/AIFunction;->bg:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/AIFunction;->desc:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lcom/sma/smartv3/model/AIFunction;->icon:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p6, p0, Lcom/sma/smartv3/model/AIFunction;->detailsBg:I

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/sma/smartv3/model/AIFunction;->detailsDescribe:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/sma/smartv3/model/AIFunction;->detailsHint:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/sma/smartv3/model/AIFunction;->detailsExample:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/sma/smartv3/model/AIFunction;->detailsQuestion:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-boolean p11, p0, Lcom/sma/smartv3/model/AIFunction;->isHot:Z

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/sma/smartv3/model/AIFunction;->intent:Landroid/content/Intent;

    :cond_b
    move p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/sma/smartv3/model/AIFunction;->copy(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;)Lcom/sma/smartv3/model/AIFunction;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/sma/smartv3/model/AIFunctionType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->type:Lcom/sma/smartv3/model/AIFunctionType;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsQuestion:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AIFunction;->isHot:Z

    return v0
.end method

.method public final component12()Landroid/content/Intent;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->intent:Landroid/content/Intent;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AIFunction;->bg:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->desc:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AIFunction;->icon:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsBg:I

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsDescribe:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsHint:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsExample:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;)Lcom/sma/smartv3/model/AIFunction;
    .locals 14
    .param p1    # Lcom/sma/smartv3/model/AIFunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsDescribe"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsHint"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsExample"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsQuestion"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/AIFunction;

    move-object v2, p1

    move/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/sma/smartv3/model/AIFunction;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/AIFunction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/AIFunction;

    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->type:Lcom/sma/smartv3/model/AIFunctionType;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIFunction;->type:Lcom/sma/smartv3/model/AIFunctionType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIFunction;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/AIFunction;->bg:I

    iget v3, p1, Lcom/sma/smartv3/model/AIFunction;->bg:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->desc:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIFunction;->desc:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/model/AIFunction;->icon:I

    iget v3, p1, Lcom/sma/smartv3/model/AIFunction;->icon:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsBg:I

    iget v3, p1, Lcom/sma/smartv3/model/AIFunction;->detailsBg:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsDescribe:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIFunction;->detailsDescribe:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsHint:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIFunction;->detailsHint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsExample:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIFunction;->detailsExample:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsQuestion:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIFunction;->detailsQuestion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/sma/smartv3/model/AIFunction;->isHot:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/AIFunction;->isHot:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->intent:Landroid/content/Intent;

    iget-object p1, p1, Lcom/sma/smartv3/model/AIFunction;->intent:Landroid/content/Intent;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBg()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AIFunction;->bg:I

    return v0
.end method

.method public final getDesc()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->desc:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailsBg()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsBg:I

    return v0
.end method

.method public final getDetailsDescribe()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsDescribe:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailsExample()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsExample:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailsHint()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsHint:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailsQuestion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->detailsQuestion:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AIFunction;->icon:I

    return v0
.end method

.method public final getIntent()Landroid/content/Intent;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->intent:Landroid/content/Intent;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/sma/smartv3/model/AIFunctionType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->type:Lcom/sma/smartv3/model/AIFunctionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->type:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/AIFunction;->bg:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->desc:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/AIFunction;->icon:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsBg:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsDescribe:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsHint:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsExample:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsQuestion:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/AIFunction;->isHot:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->intent:Landroid/content/Intent;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isHot()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AIFunction;->isHot:Z

    return v0
.end method

.method public final setBg(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/AIFunction;->bg:I

    return-void
.end method

.method public final setDesc(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->desc:Ljava/lang/String;

    return-void
.end method

.method public final setDetailsBg(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsBg:I

    return-void
.end method

.method public final setDetailsDescribe(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsDescribe:Ljava/lang/String;

    return-void
.end method

.method public final setDetailsExample(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsExample:Ljava/lang/String;

    return-void
.end method

.method public final setDetailsHint(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsHint:Ljava/lang/String;

    return-void
.end method

.method public final setDetailsQuestion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->detailsQuestion:Ljava/lang/String;

    return-void
.end method

.method public final setHot(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/AIFunction;->isHot:Z

    return-void
.end method

.method public final setIcon(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/AIFunction;->icon:I

    return-void
.end method

.method public final setIntent(Landroid/content/Intent;)V
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->intent:Landroid/content/Intent;

    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->title:Ljava/lang/String;

    return-void
.end method

.method public final setType(Lcom/sma/smartv3/model/AIFunctionType;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AIFunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIFunction;->type:Lcom/sma/smartv3/model/AIFunctionType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIFunction;->type:Lcom/sma/smartv3/model/AIFunctionType;

    iget-object v1, p0, Lcom/sma/smartv3/model/AIFunction;->title:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/model/AIFunction;->bg:I

    iget-object v3, p0, Lcom/sma/smartv3/model/AIFunction;->desc:Ljava/lang/String;

    iget v4, p0, Lcom/sma/smartv3/model/AIFunction;->icon:I

    iget v5, p0, Lcom/sma/smartv3/model/AIFunction;->detailsBg:I

    iget-object v6, p0, Lcom/sma/smartv3/model/AIFunction;->detailsDescribe:Ljava/lang/String;

    iget-object v7, p0, Lcom/sma/smartv3/model/AIFunction;->detailsHint:Ljava/lang/String;

    iget-object v8, p0, Lcom/sma/smartv3/model/AIFunction;->detailsExample:Ljava/lang/String;

    iget-object v9, p0, Lcom/sma/smartv3/model/AIFunction;->detailsQuestion:Ljava/lang/String;

    iget-boolean v10, p0, Lcom/sma/smartv3/model/AIFunction;->isHot:Z

    iget-object v11, p0, Lcom/sma/smartv3/model/AIFunction;->intent:Landroid/content/Intent;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "AIFunction(type="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bg="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", desc="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", detailsBg="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", detailsDescribe="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", detailsHint="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", detailsExample="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", detailsQuestion="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isHot="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", intent="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
