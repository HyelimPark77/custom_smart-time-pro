.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SportData"
.end annotation


# instance fields
.field private endTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private hrList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Hr;",
            ">;"
        }
    .end annotation
.end field

.field private paceList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pace;",
            ">;"
        }
    .end annotation
.end field

.field private posList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pos;",
            ">;"
        }
    .end annotation
.end field

.field private posType:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private recordTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sportDataId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sportDataType:I

.field private sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private sportType:I

.field private startTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private stepFreqList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$StepFreq;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Hr;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pos;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$StepFreq;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pace;",
            ">;)V"
        }
    .end annotation

    const-string v0, "startTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sportDataId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recordTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportType:I

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->startTime:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->endTime:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataId:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataType:I

    .line 7
    iput-object p6, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->recordTime:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    .line 9
    iput-object p8, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posType:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->hrList:Ljava/util/List;

    .line 11
    iput-object p10, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posList:Ljava/util/List;

    .line 12
    iput-object p11, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->stepFreqList:Ljava/util/List;

    .line 13
    iput-object p12, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->paceList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    .line 14
    sget-object p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->OTHER:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->getValue()I

    move-result p1

    :cond_0
    and-int/lit8 p14, p13, 0x2

    .line 15
    const-string v0, ""

    if-eqz p14, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    const/4 p5, 0x1

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit16 p14, p13, 0x80

    const/4 v0, 0x0

    if-eqz p14, :cond_6

    move-object p8, v0

    :cond_6
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_7

    move-object p9, v0

    :cond_7
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_8

    move-object p10, v0

    :cond_8
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_9

    move-object p11, v0

    :cond_9
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_a

    move-object p14, v0

    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    goto :goto_0

    :cond_a
    move-object p14, p12

    move-object p13, p11

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    :goto_0
    invoke-direct/range {p2 .. p14}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportType:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->startTime:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->endTime:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataType:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->recordTime:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posType:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->hrList:Ljava/util/List;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posList:Ljava/util/List;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->stepFreqList:Ljava/util/List;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->paceList:Ljava/util/List;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportType:I

    return v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pos;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posList:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$StepFreq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->stepFreqList:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pace;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->paceList:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataType:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->recordTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posType:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Hr;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->hrList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
    .locals 14
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Hr;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pos;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$StepFreq;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pace;",
            ">;)",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;"
        }
    .end annotation

    const-string v0, "startTime"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sportDataId"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recordTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;

    move v2, p1

    move/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportType:I

    iget v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->startTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->startTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->endTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->endTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataId:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataType:I

    iget v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataType:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->recordTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->recordTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posType:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->hrList:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->hrList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posList:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->stepFreqList:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->stepFreqList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->paceList:Ljava/util/List;

    iget-object p1, p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->paceList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getEndTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Hr;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->hrList:Ljava/util/List;

    return-object v0
.end method

.method public final getPaceList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pace;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->paceList:Ljava/util/List;

    return-object v0
.end method

.method public final getPosList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pos;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posList:Ljava/util/List;

    return-object v0
.end method

.method public final getPosType()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posType:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecordTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->recordTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getSportDataId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSportDataType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataType:I

    return v0
.end method

.method public final getSportOverView()Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    return-object v0
.end method

.method public final getSportType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportType:I

    return v0
.end method

.method public final getStartTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getStepFreqList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$StepFreq;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->stepFreqList:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->startTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->endTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->recordTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posType:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->hrList:Ljava/util/List;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posList:Ljava/util/List;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->stepFreqList:Ljava/util/List;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->paceList:Ljava/util/List;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public final setEndTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->endTime:Ljava/lang/String;

    return-void
.end method

.method public final setHrList(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Hr;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->hrList:Ljava/util/List;

    return-void
.end method

.method public final setPaceList(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pace;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->paceList:Ljava/util/List;

    return-void
.end method

.method public final setPosList(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pos;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posList:Ljava/util/List;

    return-void
.end method

.method public final setPosType(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posType:Ljava/lang/String;

    return-void
.end method

.method public final setRecordTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->recordTime:Ljava/lang/String;

    return-void
.end method

.method public final setSportDataId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataId:Ljava/lang/String;

    return-void
.end method

.method public final setSportDataType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataType:I

    return-void
.end method

.method public final setSportOverView(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    return-void
.end method

.method public final setSportType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportType:I

    return-void
.end method

.method public final setStartTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->startTime:Ljava/lang/String;

    return-void
.end method

.method public final setStepFreqList(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$StepFreq;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->stepFreqList:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportType:I

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->startTime:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->endTime:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataId:Ljava/lang/String;

    iget v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportDataType:I

    iget-object v5, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->recordTime:Ljava/lang/String;

    iget-object v6, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->sportOverView:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    iget-object v7, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posType:Ljava/lang/String;

    iget-object v8, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->hrList:Ljava/util/List;

    iget-object v9, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->posList:Ljava/util/List;

    iget-object v10, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->stepFreqList:Ljava/util/List;

    iget-object v11, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->paceList:Ljava/util/List;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "SportData(sportType="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", startTime="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", endTime="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", sportDataId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", sportDataType="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", recordTime="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", sportOverView="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", posType="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hrList="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", posList="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stepFreqList="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paceList="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
